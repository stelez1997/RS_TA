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
	
	@FindBy(xpath = "//tr[contains(@id, \"SetInputRow\")]//div[@class=\"react-datepicker__input-container\"]")
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
		dtpScheduledText = getText(dtpScheduled);
		
		
	}



	public void clickOnAddBillClass() {
		click(btnAddChangeSet);
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

		clickOnGoToLast();

		int rowsB = rows("//tr[contains(@id,\"SetTable\")]");
		
		selectHubID();

		fillOutCase(caseName);
		
		fillOutDescription(description);
		
		selectScheduled();

		clickOnAddBillClass();

		refresh();
		
		invisibilityOfElement("//tr[contains(@id,\"SetTable\")][1]");

		clickOnGoToLast();
		
		int rowsA = rows("//tr[contains(@id,\"SetTable\")]");
		
		String hubIDA = getText("//tr[contains(@id,\"SetTable\")][1]/td[2]");
		String caseNameA = getText("//tr[contains(@id,\"SetTable\")][1]/td[3]");
		String descriptionA = getText("//tr[contains(@id,\"SetTable\")][1]/td[4]");
		String scheduledA = getText("//tr[contains(@id,\"SetTable\")][1]/td[4]");
	
		System.out.println("--------------------------------Creation Verification-------------------------");
		System.out.println("Options Entered--------");
		System.out.println("The Hub Id is: " + cboHubIdText);
		System.out.println("The Case is: " + caseName);
		System.out.println("The Description is: " + description);
		System.out.println("Information After Creation--------");
		System.out.println("The Hub Id is: " + hubIDA);
		System.out.println("The Case is: " + caseNameA);
		System.out.println("The Description is: " + descriptionA);

		boolean created = greaterThanInt(rowsA, rowsB);
		assertTrue(created, createdUnSuccesfully);
		
		System.out.println("Record created: " + created);
		
		created = false;
		
		if (hubIDA.equals(cboHubIdText) && caseNameA.equals(caseName) && descriptionA.equals(description)) {
			created = true;
		}

		System.out.println("Record created succesfully: "+created);
		assertTrue(created, createdUnSuccesfully);
		

	}
	
	

	// Verfication before editing or deleting the record

	public int verification() {

		loginVerificationPO = new LoginVerificationPO();

		actionsMoveToElementElement(loginVerificationPO.btnMessageClassification);

		clickOnChangeSetMenu();

		actionsMoveToElementElement(btnAddChangeSet);

		clickOnGoToLast();

		int rows = rows("//tr[contains(@id,\"SetTable\")]");
		boolean record = false;
		int j = 1;
		for (int i = 0; i < rows; i++) {

			String billClass = getText("//tr[contains(@id,\"SetTable\")][" + j + "]/td[3]/div");


			if (billClass.equals(this.caseName)) {
				System.out.println("Creation Record Displayed at Position: " + j);
				record = true;
				assertTrue(record, testRecord);
				break;
			}

			j++;

		}

		if (record != true) {
			System.out.println(creationRecord);
		}

		return j;

	}
	
	public void editBillClass() {

			assertTrue(false, pendingToBeAutomated);
		

	}

	public void deleteBillClass() {

		int position = verification();
		int rowsB = rows("//tr[contains(@id,\"SetTable\")]");

		WebElement btnDelete = findElement(
				"//tr[contains(@id,\"SetTable\")][" + position + "]//child::button[contains(@id,\"delete\")]");

		click(btnDelete);
		sleep(5000);

		refresh();

		waitExpectedElement("//tr[contains(@id,\"SetTable\")]");

		clickOnGoToLast();

		int rowsA = rows("//tr[contains(@id,\"SetTable\")]");

		boolean deleted = greaterThanInt(rowsB, rowsA);

		assertTrue(deleted, deletionRecord);
		System.out.println("Record deleted: " + deleted);

	}

	
}
