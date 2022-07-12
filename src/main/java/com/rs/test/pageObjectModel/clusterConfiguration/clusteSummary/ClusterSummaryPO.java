package com.rs.test.pageObjectModel.clusterConfiguration.clusteSummary;

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
public class ClusterSummaryPO extends TestBaseSteven {

	public ClusterSummaryPO() {
		PageFactory.initElements(driver, this);
	}

	// menu
	@FindBy(xpath = "//div[@class=\"headerMenuDropdown\"]/a[contains(text(),\"Cluster Summary\")]")
	public WebElement menuClusterSummary;

	@FindBy(xpath = "//a[text()=\"Cluster Classification Suggestions\"]")
	public WebElement menuClusterClassificationSuggestion;

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

	@FindBy(xpath = "//input[@name=\"priority\"]")
	public WebElement txtPriority;

	@FindBy(xpath = "//input[@name=\"msgContains\"]")
	public WebElement txtMessageContains;

	@FindBy(xpath = "//select[@name=\"addclusterClassificationName\"]")
	public WebElement cboClassification;

	@FindBy(xpath = "//select[@name=\"addclusterClassificationName\"]/option[not(contains(text(),\"option\"))and text()][1]")
	public WebElement cboClassificationO;

	@FindBy(xpath = "//button[@id=\"Suggest ClassificationAddBtn\"]")
	public WebElement btnAddClusterClassification;

	LoginVerificationPO loginVerificationPO;

	// Menu

	public void clickOnClusterSummaryMenu() {
		click(menuClusterSummary);
	}

	public void clickOnClusterClassificationSuggestion() {
		click(menuClusterClassificationSuggestion);
		visibilityOfElement("//tr[contains(@id,\"Classification\")][1]");
	}

	// Pagination

	public void clickOnGoToFirst() {
		click(btnGoToFirst);
		visibilityOfElement("//tr[contains(@id,\"Classification\")][1]");
	}

	public void clickOnGoToPrevious() {
		click(btnGoToPrevious);
		visibilityOfElement("//tr[contains(@id,\"Classification\")][1]");
	}

	public void clickOnGoToNext() {
		click(btnGoToNext);
		visibilityOfElement("//tr[contains(@id,\"Classification\")][1]");
	}

	public void clickOnGoToLast() {
		click(btnGoToLast);
		visibilityOfElement("//tr[contains(@id,\"Classification\")][1]");
	}

	// Create Methods

	public void fillOutPriority(String text) {
		sendKeys(txtPriority, text);
	}

	public void fillOutMessageContains(String text) {
		sendKeys(txtMessageContains, text);
	}
	
	public void selectClassification() {
		
		click(cboClassification);
		sleep(500);
		cboClassificationtText = getText(cboClassificationO);
		click(cboClassificationO);
		
	}
	
	public void clickOnBtnAddClusterClassification() {
		click(btnAddClusterClassification);
	}
	
	String id = "5";
	String message = "TATest";
	String cboClassificationtText = "";

	public void createSuggestClassification() {
		
		loginVerificationPO = new LoginVerificationPO();

		actionsMoveToElementElement(loginVerificationPO.btnClusterConfiguration);

		clickOnClusterSummaryMenu();

		actionsMoveToElementElement(btnGoToFirst);
		
		clickOnClusterClassificationSuggestion();
		
		visibilityOfElement("//tr[contains(@id,\"ClassificationTable\")][1]");

		clickOnGoToLast();
		
		visibilityOfElement("//tr[contains(@id,\"ClassificationTable\")][1]");
		
		int rowsB = rows("//tr[contains(@id,\"ClassificationTable\")]");
		
		String priority = "999999";
		
		fillOutPriority(priority);
		fillOutMessageContains(message);
		selectClassification();
		
		clickOnBtnAddClusterClassification();
		
		sleep(5000);
		refresh();
		visibilityOfElement("//tr[contains(@id,\"ClassificationTable\")][1]");
		
		clickOnGoToLast();
		
		visibilityOfElement("//tr[contains(@id,\"ClassificationTable\")][1]");
		
		int rowsA = rows("//tr[contains(@id,\"ClassificationTable\")]");
		
		boolean created = greaterThanInt(rowsA, rowsB);
		
		System.out.println("Record Created: "+created);
		assertTrue(created, createdUnSuccesfully);
		
		created = false;
		
		String priorityA = getText("//tr[contains(@id,\"ClassificationTable\")]["+rowsA+"]/td[2]");
		String messageContainsA = getText("//tr[contains(@id,\"ClassificationTable\")]["+rowsA+"]/td[3]");
		String classificationA = getText("//tr[contains(@id,\"ClassificationTable\")]["+rowsA+"]/td[4]");
		
		System.out.println("--------------Creation Verification----------------------------");
		System.out.println("Info Entered-----");
		System.out.println("Priority: "+priority);
		System.out.println("Message Contains: "+message);
		System.out.println("Classification: "+cboClassificationtText);
		System.out.println("Info after creation----------");
		System.out.println("Priority: "+priorityA);
		System.out.println("Message Contains: "+messageContainsA);
		System.out.println("Classification: "+classificationA);
		
		
		if (priorityA.equals(priority) && messageContainsA.equals(message) && classificationA.equals(cboClassificationtText)) {
			created = true;
		}
		
		System.out.println("Record created successfully: "+created);
		assertTrue(created, createdUnSuccesfully);
		
		
		
		

	}

	// Verfication before editing or deleting the record

	public void verification() {

		loginVerificationPO = new LoginVerificationPO();

		actionsMoveToElementElement(loginVerificationPO.btnClusterConfiguration);

		clickOnClusterSummaryMenu();

		actionsMoveToElementElement(btnGoToFirst);
		
		clickOnClusterClassificationSuggestion();
		
		visibilityOfElement("//tr[contains(@id,\"ClassificationTable\")][1]");

		clickOnGoToLast();
		
		visibilityOfElement("//tr[contains(@id,\"ClassificationTable\")][1]");

		int rows = rows("//tr[contains(@id,\"ClassificationTable\")]");
		boolean record = false;

		System.out.println("-----------------------------Test Record Verification------------------------------");

		String messageContainsA = getText("//tr[contains(@id,\"ClassificationTable\")][" + rows + "]/td[3]/div");

		System.out.println("Record Mesage: " + messageContainsA);


		if (messageContainsA.contains(message)) {
			record = true;
		}

		System.out.println("The testing record is being displayed: " + record);

		assertTrue(record, this.creationRecord);

	}

	public void editSuggestClassification() {

		verification();
		
		
		int rows = rows("//tr[contains(@id,\"ClassificationTable\")]");

		boolean edited = false;

		String priorityE = "999991";
		String messageContainsE = "TATest1";

		WebElement txtEditPriority = findElement("//tr[contains(@id,\"ClassificationTable\")][" + rows + "]//input[contains(@id,\"priority\")]");
		WebElement txtEditMessageContains = findElement("//tr[contains(@id,\"ClassificationTable\")][" + rows + "]//input[contains(@id,\"msgContains\")]");
		WebElement cboEditClassification = findElement("//tr[contains(@id,\"ClassificationTable\")][" + rows + "]//select");
		WebElement cboEditClassificationO = findElement("//tr[contains(@id,\"ClassificationTable\")][" + rows + "]//select/option[text()][2]");
		
		WebElement btnEdit = findElement(
				"//tr[contains(@id,\"ClassificationTable\")][" + rows + "]//child::button[contains(@id,\"edit\")]");
		
		orderSuggestions();
		click(btnEdit);

		clearByBackSpace(txtEditPriority);
		sendKeys(txtEditPriority, priorityE);
		clearByBackSpace(txtEditMessageContains);
		sendKeys(txtEditMessageContains, messageContainsE);
		
		click(cboEditClassification);
		sleep(500);
		cboClassificationtText = getText(cboEditClassificationO);
		click(cboEditClassificationO);

		click(btnEdit);
		sleep(5000);

		visibilityOfElement("//tr[contains(@id,\"ClassificationTable\")][1]");

		refresh();

		visibilityOfElement("//tr[contains(@id,\"ClassificationTable\")][1]");
		
		click(btnGoToLast);

		visibilityOfElement("//tr[contains(@id,\"ClassificationTable\")][1]");

		String priorityA = getText("//tr[contains(@id,\"ClassificationTable\")][" + rows + "]/td[2]/div");
		String messageContainsA = getText("//tr[contains(@id,\"ClassificationTable\")][" + rows + "]/td[3]/div");
		String classificationA = getText("//tr[contains(@id,\"ClassificationTable\")][" + rows + "]/td[4]/div");

		System.out.println("-----------------------------Edition Verification------------------------------");
		System.out.println("Info entered------");
		System.out.println("Priority: "+priorityE);
		System.out.println("Message Contains: "+messageContainsE);
		System.out.println("Classification: "+cboClassificationtText);
		System.out.println("Info after edition-----");
		System.out.println("Priority: "+priorityA);
		System.out.println("Message Contains: "+messageContainsA);
		System.out.println("Classification: "+classificationA);

		if (priorityA.equals(priorityE) && messageContainsA.equals(messageContainsE) && classificationA.equals(cboClassificationtText)) {
			edited = true;
		}

		System.out.println("The record was edited with success: " + edited);

		assertTrue(edited, editionRecord);

		

	}
	
	public void orderSuggestions() {

		String message = getText("//tr[contains(@id,\"ClassificationTable\")][1]/td[3]/div");
		int count = 1;

		System.out.println("Id de la verificacion: " + message);
		
		do {
			
			click("//div[text()=\"Priority\"]");
			sleep(500);
			message = getText("//tr[contains(@id,\"ClassificationTable\")][1]/td[3]/div");
			count++;

			if (count > 4) {
				assertTrue(false, creationRecord);
			}
			
		} while (!message.contains(this.message));



	}
	
	public void deleteSuggestClassifaction() {

		verification();
		
		int rowsB = rows("//tr[contains(@id, \"ClassificationTable\")]");

		WebElement btnDelete = findElement(
				"//tr[contains(@id, \"ClassificationTable\")][" + rowsB + "]//child::button[contains(@id,\"delete\")]");
		
		orderSuggestions();
		
		click(btnDelete);
		sleep(5000);

		refresh();

		waitExpectedElement("//tr[contains(@id, \"ClassificationTable\")][1]");

		clickOnGoToLast();
		
		waitExpectedElement("//tr[contains(@id, \"ClassificationTable\")][1]");

		int rowsA = rows("//tr[contains(@id, \"ClassificationTable\")]");

		boolean deleted = greaterThanInt(rowsB, rowsA);

		System.out.println("Record deleted succesfully: " + deleted);
		assertTrue(deleted, deletionRecord);


		

	}
	
	
	
}
