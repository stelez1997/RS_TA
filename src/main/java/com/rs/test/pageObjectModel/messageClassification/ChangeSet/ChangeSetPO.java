package com.rs.test.pageObjectModel.messageClassification.ChangeSet;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.net.URL;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.rs.test.base.TestBaseSteven;
import com.rs.test.pageObjectModel.login.LoginVerificationPO;

/**
 * @author stelez
 *
 */
public class ChangeSetPO extends TestBaseSteven {

	public ChangeSetPO() {
		PageFactory.initElements(driver, this);
	}

	// menu
	@FindBy(xpath = "//div[@class=\"headerMenu\"]//a[contains(@href,\"classification/change-set\")]")
	public WebElement menuChangeSet;

	// pagination

	@FindBy(xpath = "//div[@class=\"tablePageSection\"]/div/div/button[text()=\"<<\"]")
	public WebElement btnGoToFirst;

	@FindBy(xpath = "//div[@class=\"tablePageSection\"]/div/div/button[text()=\"<\"]")
	public WebElement btnGoToPrevious;

	@FindBy(xpath = "//div[@class=\"tablePageSection\"]/div/div/button[text()=\">>\"]")
	public WebElement btnGoToLast;

	@FindBy(xpath = "//div[@class=\"tablePageSection\"]/div/div/button[text()=\">\"]")
	public WebElement btnGoToNext;

	// Create
	
	@FindBy(xpath = "//select[@id=\"addmessageTypeName\"]")
	public WebElement cboHubID;
	
	@FindBy(xpath = "//select[@id=\"addmessageTypeName\"]/option[text()][1]")
	public WebElement cboHubIDO;

	@FindBy(xpath = "//input[@name=\"caseRef\"]")
	public WebElement txtCase;

	@FindBy(xpath = "//input[@name=\"description\"]")
	public WebElement txtDescription;
	
	@FindBy(xpath = "//tr[contains(@id, \"SetInputRow\")]//div[@class=\"react-datepicker__input-container\"]/input")
	public WebElement dtpScheduled;
	
	@FindBy(xpath = "//div[@aria-selected=\"true\"]")
	public WebElement dtpScheduledO;
	

	@FindBy(xpath = "//button[@id=\"Message Classification Change SetAddBtn\"]")
	public WebElement btnAddChangeSet;

	// Search

	@FindBy(xpath = "//button[@id=\"searchBtn\"]")
	public WebElement btnSearch;

	@FindBy(xpath = "//div[@class=\"searchBarElement\"]//child::select")
	public WebElement cboSearchHubId;
;

	LoginVerificationPO loginVerificationPO;

	// Menu

	public void clickOnChangeSetMenu() {
		click(menuChangeSet);
	}

	// Pagination

	public void clickOnGoToFirst() {
		click(btnGoToFirst);

		waitExpectedElement("//tr[contains(@id,\"SetTable\")][1]");
	}

	public void clickOnGoToPrevious() {
		click(btnGoToPrevious);

		waitExpectedElement("//tr[contains(@id,\"SetTable\")][1]");
	}

	public void clickOnGoToNext() {
		click(btnGoToNext);

		waitExpectedElement("//tr[contains(@id,\"SetTable\")][1]");
	}

	public void clickOnGoToLast() {
		click(btnGoToLast);

		waitExpectedElement("//tr[contains(@id,\"SetTable\")]");
	}

	// Create Methods

	public void fillOutCase(String text) {
		sendKeys(txtCase, text);
	}

	public void fillOutDescription(String text) {
		sendKeys(txtDescription, text);
	}
	
	public void selectHubID() {
		
		click(cboHubID);
		sleep(1000);
		cboHubIdText = getText(cboHubIDO);
		click(cboHubIDO);
		
	}
	
	public void selectScheduled() {
		
		click(dtpScheduled);
		sleep(1000);
		click(dtpScheduledO);
		dtpScheduledText = getAttribute(dtpScheduled, "value");
		System.out.println("The Date selected is: "+dtpScheduledText);

	}



	public void clickOnAddBillClass() {
		click(btnAddChangeSet);
		btnAddChangeSet.click();
		sleep(5000);
	}
	
	
	//Search Methods
	
	public void clickOnBtnSearch() {
		click(btnSearch);
		sleep(5000);
	}
	
	public void clickOnSearchCboHubId() {
		click(cboSearchHubId);
	}

	// Modals

	// Create
	
	String cboHubIdText = "TATest";
	String caseName = "TATest";
	String description = "Test";
	String dtpScheduledText = "";

	public void createChangeSet() {

		loginVerificationPO = new LoginVerificationPO();

		actionsMoveToElementElement(loginVerificationPO.btnMessageClassification);

		clickOnChangeSetMenu();

		actionsMoveToElementElement(btnAddChangeSet);
		
		waitExpectedElement("//tr[contains(@id,\"SetTable\")][1]");
		
		int rowsB = rows("//tr[contains(@id,\"SetTable\")]");
		
		selectHubID();

		fillOutCase(caseName);
		
		fillOutDescription(description);
		
		selectScheduled();

		clickOnAddBillClass();

		refresh();
		
		visibilityOfElement("//tr[contains(@id,\"SetTable\")][1]");
		
		int rowsA = rows("//tr[contains(@id,\"SetTable\")]");
		
		String hubIDA = getText("//tr[contains(@id,\"SetTable\")][1]/td[2]");
		String caseNameA = getText("//tr[contains(@id,\"SetTable\")][1]/td[3]");
		String descriptionA = getText("//tr[contains(@id,\"SetTable\")][1]/td[4]");
		String scheduledA = getText("//tr[contains(@id,\"SetTable\")][1]/td[9]");
		scheduledA = split(scheduledA, ",", 0);
		System.out.println("Split date: "+scheduledA);
		scheduledA = changeDateFormat(scheduledA, "dd/MM/yyyy", "MM/dd/yyyy");
		
		
		System.out.println("--------------------------------Creation Verification-------------------------");
		System.out.println("Options Entered--------");
		System.out.println("The Hub Id is: " + cboHubIdText);
		System.out.println("The Case is: " + caseName);
		System.out.println("The Description is: " + description);
		System.out.println("The Scheduled Date is: " + dtpScheduledText);
	
		System.out.println("Information After Creation--------");
		System.out.println("The Hub Id is: " + hubIDA);
		System.out.println("The Case is: " + caseNameA);
		System.out.println("The Description is: " + descriptionA);
		System.out.println("The Scheduled Date is: " + scheduledA);
		
		boolean created = false;
		
		if (hubIDA.equals(cboHubIdText) && caseNameA.equals(caseName) && descriptionA.equals(description) && dtpScheduledText.equals(scheduledA)) {
			created = true;
		}

		System.out.println("Record created succesfully: "+created);
		assertTrue(created, createdUnSuccesfully);
		

	}
	
	

	// Verfication before editing or deleting the record

	public void verification() {

		loginVerificationPO = new LoginVerificationPO();

		actionsMoveToElementElement(loginVerificationPO.btnMessageClassification);

		clickOnChangeSetMenu();

		actionsMoveToElementElement(btnAddChangeSet);
		
		visibilityOfElement("//tr[contains(@id,\"SetTable\")][1]");
		
		String caseNameV = getText("//tr[contains(@id,\"SetTable\")][1]/td[3]");
		
		boolean creationRecord = false;
		
		if (caseNameV.contains(caseName)) {
			creationRecord = true;
		}

		assertTrue(creationRecord, this.creationRecord);

	}
	
	public void editChangeSet() {

			verification();
			
			WebElement btnEdit = findElement("//tr[contains(@id,\"SetTable\")][1]//button[contains(@id,\"edit\")]");
			click(btnEdit);
			
			String descriptionEdit = "TATest1";
			
			WebElement txtDescriptionE = findElement("//tr[contains(@id,\"SetTable\")][1]//input[contains(@id,\"description\")]");
			WebElement dtpScheduledE = findElement("//tr[contains(@id,\"SetTable\")][1]//div[@class=\"react-datepicker-wrapper\"]//input");
			
			clearByBackSpace(txtDescriptionE);
			sendKeys(txtDescriptionE, descriptionEdit);
			
			click(dtpScheduledE);
			sleep(1000);
			WebElement dtpScheduledEO = findElement("//div[@aria-selected=\"true\"]//following-sibling::div[1]");
			click(dtpScheduledEO);
			dtpScheduledText = getAttribute(dtpScheduledE, "value");
			System.out.println("The Date selected is: "+dtpScheduledText);
			
			click(btnEdit);
			sleep(5000);
			
			refresh();
			
			visibilityOfElement("//tr[contains(@id,\"SetTable\")][1]");
			
			
			String descriptionA = getText("//tr[contains(@id,\"SetTable\")][1]/td[4]");
			String scheduledA = getText("//tr[contains(@id,\"SetTable\")][1]/td[9]");
			scheduledA = split(scheduledA, ",", 0);
			System.out.println("Split date: "+scheduledA);
			scheduledA = changeDateFormat(scheduledA, "dd/MM/yyyy", "MM/dd/yyyy");
			
			
			System.out.println("--------------------------------Edition Verification-------------------------");
			System.out.println("Options Entered--------");
			System.out.println("The Description is: " + descriptionEdit);
			System.out.println("The Scheduled Date is: " + dtpScheduledText);
			System.out.println("Information After Creation--------");
			System.out.println("The Description is: " + descriptionA);
			System.out.println("The Scheduled Date is: " + scheduledA);
			
			boolean edited = false;
			
			if (descriptionA.equals(descriptionEdit) && scheduledA.equals(dtpScheduledText)) {
				edited = true;
			}

			System.out.println("Record edited succesfully: "+edited);
			assertTrue(edited, editionRecord);
				

	}

	public void deleteChangeSet() {

		verification();
		
		String descriptionB = getText("//tr[contains(@id,\"SetTable\")][1]/td[4]");
		WebElement btnDelete = findElement("//tr[contains(@id,\"SetTable\")][1]//child::button[contains(@id,\"delete\")]");

		click(btnDelete);
		sleep(5000);

		refresh();

		waitExpectedElement("//tr[contains(@id,\"SetTable\")]");
		
		String descriptionA = getText("//tr[contains(@id,\"SetTable\")][1]/td[4]");
		
		System.out.println("--------------------------------Creation Verification-------------------------");
		System.out.println("Options Entered--------");
		System.out.println("The Description before edition is: " + descriptionB);
		System.out.println("Information After Creation--------");
		System.out.println("The Description after edition is: " + descriptionA);
		
		boolean deleted = false;
		
		if (!descriptionA.equals(descriptionB) ) {
			deleted = true;
		}

		System.out.println("Record deleted succesfully: "+deleted);
		assertTrue(deleted, deletionRecord);

	}
	
}
