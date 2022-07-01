package com.rs.test.pageObjectModel.clusterConfiguration.clusterClassification;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.net.URL;
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
public class ClusterClassificationPO extends TestBaseSteven {

	public ClusterClassificationPO() {
		PageFactory.initElements(driver, this);
	}

	// menu
	@FindBy(xpath = "//div[@class=\"headerMenuDropdown\"]/a[contains(text(),\"Cluster Classification\")]")
	public WebElement menuClusterClassification;

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

	@FindBy(xpath = "//input[@name=\"name\"]")
	public WebElement txtName;

	@FindBy(xpath = "//input[@name=\"description\"]")
	public WebElement txtDescription;

	@FindBy(xpath = "//select[@name=\"adddefaultRouteAction\"]")
	public WebElement cboDefaultRoute;

	@FindBy(xpath = "//select[@name=\"adddefaultRouteAction\"]/option[not(contains(text(),\"option\")) and text()][1]")
	public WebElement cboDefaultRouteOption;

	@FindBy(xpath = "//button[@id=\"Cluster ClassificationAddBtn\"]")
	public WebElement btnAddClusterClassification;

	// Search

	@FindBy(xpath = "//button[contains(@id,\"CodesAddBtn\")]")
	public WebElement btnSearch;

	@FindBy(xpath = "//div[@class=\"searchBar\"]/form/span/div/input")
	public WebElement txtSearch;

	// Modals

	@FindBy(xpath = "//input[@name=\"prefix\"]")
	public WebElement txtPrefix;

	@FindBy(xpath = "//button[@id=\"undefinedAddBtn\"]")
	public WebElement btnAddPrefix;

	LoginVerificationPO loginVerificationPO;

	// Menu

	public void clickOnClusterClassificationMenu() {
		click(menuClusterClassification);
	}

	// Pagination

	public void clickOnGoToFirst() {
		click(btnGoToFirst);

		visibilityOfElementXpath("//tr[contains(@id,\"ClassificationTableRow\")][1]");
	}

	public void clickOnGoToPrevious() {
		click(btnGoToPrevious);

		visibilityOfElementXpath("//tr[contains(@id,\"ClassificationTableRow\")][1]");
	}

	public void clickOnGoToNext() {
		click(btnGoToNext);

		visibilityOfElementXpath("//tr[contains(@id,\"ClassificationTableRow\")][1]");
	}

	public void clickOnGoToLast() {
		click(btnGoToLast);

		visibilityOfElementXpath("//tr[contains(@id,\"ClassificationTableRow\")][1]");
	}

	// Create Methods

	public void fillOutName(String text) {
		sendKeys(txtName, text);
	}

	public void fillOutDescription(String text) {
		sendKeys(txtDescription, text);
	}

	public void clickOnCboDefaultRoute() {
		click(cboDefaultRoute);
	}

	public void clickOnCboDefaultRouteOption() {
		click(cboDefaultRouteOption);
	}

	public void clickOnAddClusterClassification() {
		click(btnAddClusterClassification);
	}

	// Modals

	// Create

	String id = "";
	String name = "Test";
	String description = "Test 01";
	String cboText = "";

	public void createClusterClassification() {

		loginVerificationPO = new LoginVerificationPO();

		actionsMoveToElementElement(loginVerificationPO.btnClusterConfiguration);

		clickOnClusterClassificationMenu();

		actionsMoveToElementElement(btnAddClusterClassification);

		clickOnGoToLast();

		int rowsB = rows("//tr[contains(@id,\"ClassificationTableRow\")]");

		String idB = getText("//tr[contains(@id,\"ClassificationTableRow\")][" + rowsB + "]/td[2]/div");
		System.out.println("Last id before creation: " + idB);

		fillOutName(name);

		fillOutDescription(description);

		clickOnCboDefaultRoute();

		cboText = getText(cboDefaultRouteOption);
		System.out.println("Cbo option is: " + cboText);

		clickOnCboDefaultRouteOption();

		clickOnAddClusterClassification();
		sleep(5000);

		refresh();

		visibilityOfElementXpath("//tr[contains(@id,\"ClassificationTableRow\")][1]");
		clickOnGoToLast();

		int rowsA = rows("//tr[contains(@id,\"ClassificationTableRow\")]");

		System.out.println("--------------------Creation Verification--------------------");

		boolean created = greaterThanInt(rowsA, rowsB);

		System.out.println("Record created: " + created);

		assertTrue(created, createdUnSuccesfully);

		created = false;

		String nameA = getText("//tr[contains(@id,\"ClassificationTableRow\")][" + rowsA + "]/td[3]/div");
		String descriptionA = getText("//tr[contains(@id,\"ClassificationTableRow\")][" + rowsA + "]/td[4]/div");
		String defaultRouteA = getText("//tr[contains(@id,\"ClassificationTableRow\")][" + rowsA + "]/td[5]/div");

		System.out.println("The name is: " + nameA);
		System.out.println("The description is: " + descriptionA);
		System.out.println("The default route is: " + defaultRouteA);

		if (nameA.equals(name) && descriptionA.equals(description) && defaultRouteA.equals(cboText)) {
			created = true;
		}

		assertTrue(created, createdUnSuccesfully);

		System.out.println("The record was created succesfully: " + created);

	}

	// Verfication before editing or deleting the record

	public void verification() {

		loginVerificationPO = new LoginVerificationPO();

		actionsMoveToElementElement(loginVerificationPO.btnClusterConfiguration);

		clickOnClusterClassificationMenu();

		actionsMoveToElementElement(btnAddClusterClassification);

		clickOnGoToLast();

		int rows = rows("//tr[contains(@id,\"ClassificationTableRow\")]");
		boolean creationRecord = false;

		System.out.println("-----------------------------Creation Record Verification------------------------------");

		String nameA = getText("//tr[contains(@id,\"ClassificationTableRow\")][" + rows + "]/td[3]/div");
		String descriptionA = getText("//tr[contains(@id,\"ClassificationTableRow\")][" + rows + "]/td[4]/div");

		if (nameA.contains("Test") && descriptionA.contains("Test")) {
			creationRecord = true;
		}

		System.out.println("The record of creation is being displayed: " + creationRecord);

		assertTrue(creationRecord, this.creationRecord);

	}

	public void editClusterClassification() {

		loginVerificationPO = new LoginVerificationPO();

		verification();

		int rows = rows("//tr[contains(@id,\"ClassificationTableRow\")]");

		boolean edited = false;

		name = "Edition Test";
		description = "Edition Test 04";

		WebElement txtEditName = findElement(
				"//tr[contains(@id,\"ClassificationTableRow\")][" + rows + "]/td[3]/input");
		WebElement txtEditDescription = findElement(
				"//tr[contains(@id,\"ClassificationTableRow\")][" + rows + "]/td[4]/input");
		WebElement cboEditDefaultRoute = findElement(
				"//tr[contains(@id,\"ClassificationTableRow\")][" + rows + "]/td[5]/select");
		WebElement cboEditDefaultRouteO = findElement("//tr[contains(@id,\"ClassificationTableRow\")][" + rows
				+ "]/td[5]/select/option[not(contains(text(),\"option\")) and text()][2]");
		WebElement btnEdit = findElement(
				"//tr[contains(@id,\"ClassificationTableRow\")][" + rows + "]//child::button[contains(@id,\"edit\")]");
		
		orderClassification();
		click(btnEdit);

		clear(txtEditName);
		sendKeys(txtEditName, name);
		clear(txtEditDescription);
		sendKeys(txtEditDescription, description);

		click(cboEditDefaultRoute);
		cboText = getText(cboEditDefaultRouteO);
		System.out.println("Cbo option is: " + cboText);
		click(cboEditDefaultRouteO);

		click(btnEdit);

		visibilityOfElementXpath("//tr[contains(@id,\"ClassificationTableRow\")][1]");

		refresh();

		visibilityOfElementXpath("//tr[contains(@id,\"ClassificationTableRow\")][1]");

		click(btnGoToLast);

		visibilityOfElementXpath("//tr[contains(@id,\"ClassificationTableRow\")][1]");

		String nameA = getText("//tr[contains(@id,\"ClassificationTableRow\")][" + rows + "]/td[3]/div");
		String descriptionA = getText("//tr[contains(@id,\"ClassificationTableRow\")][" + rows + "]/td[4]/div");
		String defaultRouteA = getText("//tr[contains(@id,\"ClassificationTableRow\")][" + rows + "]/td[5]/div");

		System.out.println("-----------------------------Edition Verification------------------------------");

		System.out.println("The name is: " + nameA);
		System.out.println("The description is: " + descriptionA);
		System.out.println("The default route is: " + defaultRouteA);

		if (nameA.equals(name) && descriptionA.equals(description) && defaultRouteA.equals(cboText)) {
			edited = true;
		}

		System.out.println("The record was edited with success: " + edited);

		assertTrue(edited, editionRecord);

	}

	public void deleteClusterClassification() {

		loginVerificationPO = new LoginVerificationPO();

		verification();

		int rows = rows("//tr[contains(@id,\"ClassificationTableRow\")]");

		boolean deleted = false;

		WebElement btnDelete = findElement("//tr[contains(@id,\"ClassificationTableRow\")][" + rows
				+ "]//child::button[contains(@id,\"delete\")]");
		orderClassification();
		click(btnDelete);
		sleep(5000);
		
		refresh();

		visibilityOfElementXpath("//tr[contains(@id,\"ClassificationTableRow\")][1]");

		click(btnGoToLast);

		visibilityOfElementXpath("//tr[contains(@id,\"ClassificationTableRow\")][1]");

		rows = rows("//tr[contains(@id,\"ClassificationTableRow\")]");

		String nameA = getText("//tr[contains(@id,\"ClassificationTableRow\")][" + rows + "]/td[3]/div");
		String descriptionA = getText("//tr[contains(@id,\"ClassificationTableRow\")][" + rows + "]/td[4]/div");

		System.out.println("---------------------------Deletion Verification--------------------------");

		System.out.println("The name is: " + nameA);
		System.out.println("The description is: " + descriptionA);

		if (!descriptionA.equals(description) && !nameA.equals(name)) {
			deleted = true;
		}

		System.out.println("The record was deleted with success: " + deleted);

		assertTrue(deleted, deletionRecord);

	}

	public void orderClassification() {

		String classification = getText("//tr[contains(@id,\"ClassificationTable\")][1]/td[3]/div");
		int count = 1;

		while (!classification.contains("Test")) {

			click("//div[text()=\"ID\"]");
			sleep(500);
			classification = getText("//tr[contains(@id,\"ClassificationTable\")][1]/td[3]/div");
			count++;

			if (count > 3) {
				assertTrue(false, creationRecord);
			}

		}

	}

}
