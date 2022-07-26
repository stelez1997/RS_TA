package com.rs.test.pageObjectModel.messageClassification.BillClass;

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
public class BillClassPO extends TestBaseSteven {

	public BillClassPO() {
		PageFactory.initElements(driver, this);
	}

	// menu
	@FindBy(xpath = "//div[@class=\"headerMenuDropdown\"]/a[contains(text(),\"Bill Class\")]")
	public WebElement menuBillClass;

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

	@FindBy(xpath = "//input[@name=\"billClass\"]")
	public WebElement txtBillClass;

	@FindBy(xpath = "//input[@name=\"description\"]")
	public WebElement txtDescription;

	@FindBy(xpath = "//button[@id=\"Message Classification Bill ClassAddBtn\"]")
	public WebElement btnAddBillClass;

	// Search

	@FindBy(xpath = "//button[@id=\"searchBtn\"]")
	public WebElement btnSearch;

	@FindBy(xpath = "//div[@class=\"searchBarElement\"]//child::select")
	public WebElement cboSearchHubId;
;

	LoginVerificationPO loginVerificationPO;

	// Menu

	public void clickOnBillClassMenu() {
		click(menuBillClass);
	}

	// Pagination

	public void clickOnGoToFirst() {
		click(btnGoToFirst);

		waitExpectedElement("//tr[contains(@id,\"Bill ClassTable\")][1]");
	}

	public void clickOnGoToPrevious() {
		click(btnGoToPrevious);

		waitExpectedElement("//tr[contains(@id,\"Bill ClassTable\")][1]");
	}

	public void clickOnGoToNext() {
		click(btnGoToNext);

		waitExpectedElement("//tr[contains(@id,\"Bill ClassTable\")][1]");
	}

	public void clickOnGoToLast() {
		click(btnGoToLast);

		waitExpectedElement("//tr[contains(@id,\"Bill ClassTable\")]");
	}

	// Create Methods

	public void fillOutBillClass(String text) {
		sendKeys(txtBillClass, text);
	}

	public void fillOutDescription(String text) {
		sendKeys(txtDescription, text);
	}


	public void clickOnAddBillClass() {
		click(btnAddBillClass);
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

	String billClass = "TATest";
	String description = "Test";

	public void createBillClass() {

		loginVerificationPO = new LoginVerificationPO();

		actionsMoveToElementElement(loginVerificationPO.btnMessageClassification);

		clickOnBillClassMenu();
		
		visibilityOfElement("//tr[contains(@id,\"Bill ClassTable\")]");

		actionsMoveToElementElement(btnAddBillClass);

		clickOnGoToLast();

		int rowsB = rows("//tr[contains(@id,\"Bill ClassTable\")]");
	

		fillOutBillClass(billClass);
		
		fillOutDescription(description);

		clickOnAddBillClass();

		refresh();
		
		visibilityOfElement("//tr[contains(@id,\"Bill ClassTable\")]");

		clickOnGoToLast();
		
		int rowsA = rows("//tr[contains(@id,\"Bill ClassTable\")]");
		
		String billClassA = getText("//tr[contains(@id,\"Bill ClassTable\")]["+rowsA+"]/td[3]");
		String descriptionA = getText("//tr[contains(@id,\"Bill ClassTable\")]["+rowsA+"]/td[4]");
	
		System.out.println("--------------------------------Creation Verification-------------------------");
		System.out.println("Options Entered--------");
		System.out.println("The Bill Class is: " + billClass);
		System.out.println("The Description is: " + description);
		System.out.println("Information After Creation--------");
		System.out.println("The Bill Class is: " + billClassA);
		System.out.println("The Description is: " + descriptionA);

		boolean created = greaterThanInt(rowsA, rowsB);
		assertTrue(created, createdUnSuccesfully);
		
		System.out.println("Record created: " + created);
		
		created = false;
		
		if (billClassA.equals(billClass) && descriptionA.equals(description)) {
			created = true;
		}

		System.out.println("Record created succesfully: "+created);
		assertTrue(created, createdUnSuccesfully);
		

	}
	
	

	// Verfication before editing or deleting the record

	public int verification() {

		loginVerificationPO = new LoginVerificationPO();

		actionsMoveToElementElement(loginVerificationPO.btnMessageClassification);

		clickOnBillClassMenu();
		
		visibilityOfElement("//tr[contains(@id,\"Bill ClassTable\")]");

		actionsMoveToElementElement(btnAddBillClass);

		clickOnGoToLast();

		int rows = rows("//tr[contains(@id,\"Bill ClassTable\")]");
		boolean record = false;
		int j = 1;
		for (int i = 0; i < rows; i++) {

			String billClass = getText("//tr[contains(@id,\"Bill ClassTable\")][" + j + "]/td[3]/div");


			if (billClass.equals(this.billClass)) {
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
		int rowsB = rows("//tr[contains(@id,\"Bill ClassTable\")]");

		WebElement btnDelete = findElement(
				"//tr[contains(@id,\"Bill ClassTable\")][" + position + "]//child::button[contains(@id,\"delete\")]");

		click(btnDelete);
		sleep(5000);

		refresh();

		waitExpectedElement("//tr[contains(@id,\"Bill ClassTable\")]");

		clickOnGoToLast();

		int rowsA = rows("//tr[contains(@id,\"Bill ClassTable\")]");

		boolean deleted = greaterThanInt(rowsB, rowsA);

		assertTrue(deleted, deletionRecord);
		System.out.println("Record deleted: " + deleted);

	}

	
}
