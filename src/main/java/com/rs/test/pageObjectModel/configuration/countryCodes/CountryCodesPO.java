package com.rs.test.pageObjectModel.configuration.countryCodes;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.net.URL;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.rs.test.base.TestBaseSteven;
import com.rs.test.pageObjectModel.login.LoginVerificationPO;

/**
 * @author stelez
 *
 */
public class CountryCodesPO extends TestBaseSteven {

	public CountryCodesPO() {
		PageFactory.initElements(driver, this);
	}

	// menu
	@FindBy(xpath = "//div[@class=\"headerMenuDropdown\"]/a[contains(text(),\"Country Codes\")]")
	public WebElement menuCountryCodes;

	// pagination

	@FindBy(xpath = "//div[@class=\"tablePageSection\"]/div/div/button[text()=\">>\"]")
	public WebElement btnGoToLast;

	// Create

	@FindBy(xpath = "//input[@name=\"countryCode\"]")
	public WebElement txtCode;

	@FindBy(xpath = "//input[@name=\"countryName\"]")
	public WebElement txtCountry;

	@FindBy(xpath = "//button[contains(@id,\"CodesAddBtn\")]")
	public WebElement btnAddCountryCode;

	// Search

	@FindBy(xpath = "//button[@id=\"searchBtn\"]")
	public WebElement btnSearch;

	@FindBy(xpath = "//div[@class=\"searchBarElement\"]//child::input")
	public WebElement txtSearchCountry;

	// Modals

	@FindBy(xpath = "//input[@name=\"prefix\"]")
	public WebElement txtPrefix;

	@FindBy(xpath = "//button[@id=\"AddBtn\"]")
	public WebElement btnAddPrefix;

	LoginVerificationPO loginVerificationPO;

	String code = "ZZ";
	String country = "Test 02";
	String prefix = "123";

	// Menu

	public void clickOnCountryCodesMenu() {
		click(menuCountryCodes);
	}

	// Pagination

	public void clickOnGoToLast() {
		click(btnGoToLast);

		visibilityOfElementXpath("//tr[contains(@id,\"CodesTableRow\")]");
	}

	// Create Methods

	public void fillOutCode(String text) {
		sendKeys(txtCode, text);
	}

	public void fillOutCountry(String text) {
		sendKeys(txtCountry, text);
	}

	public void clickOnAddCountryCode() {
		click(btnAddCountryCode);
		sleep(5000);
	}

	// Search Methods

	public void fillOutSearchCountry(String text) {
		sendKeys(txtSearchCountry, text);
	}

	public void clickOnSearchButton() {
		click(btnSearch);
		sleep(4000);
	}

	// Modals

	// Create

	public void createCoundtryCode() {

		loginVerificationPO = new LoginVerificationPO();

		actionsMoveToElementElement(loginVerificationPO.btnConfiguration);

		clickOnCountryCodesMenu();

		actionsMoveToElementElement(btnAddCountryCode);

		clickOnGoToLast();

		int rowsB = rows("//tr[contains(@id,\"CodesTableRow\")]");

		
		fillOutCode(code);

		fillOutCountry(country);

		clickOnAddCountryCode();

		refresh();

		visibilityOfElementXpath("//tr[contains(@id,\"CodesTableRow\")]");

		clickOnGoToLast();

		int rowsA = rows("//tr[contains(@id,\"CodesTableRow\")]");

		System.out.println("--------------------Creation Verification--------------------");
		boolean created = false;

		if (rowsA > rowsB) {
			created = true;
		}

		assertTrue(created, createdUnSuccesfully);

		created = false;

		String codeA = getText("//tr[contains(@id,\"CodesTableRow\")][" + rowsA + "]/td[2]/div");
		String CountryA = getText("//tr[contains(@id,\"CodesTableRow\")][" + rowsA + "]/td[3]/div");

		System.out.println("The code is: " + codeA);
		System.out.println("The country is: " + CountryA);

		if (CountryA.equals(country) && codeA.equals(code)) {
			created = true;
		}

		assertTrue(created, createdUnSuccesfully);

		System.out.println("The record was created succesfully: " + created);
		
	}

	// Verfication before editing or deleting the record

	public void verification() {
		
		refresh();
		
		visibilityOfElementXpath("//tr[contains(@id,\"CodesTableRow\")][1]");

		loginVerificationPO = new LoginVerificationPO();

		actionsMoveToElementElement(loginVerificationPO.btnConfiguration);

		clickOnCountryCodesMenu();

		actionsMoveToElementElement(btnAddCountryCode);

		clickOnGoToLast();

		int rows = rows("//tr[contains(@id,\"CodesTableRow\")]");
		boolean creationRecord = false;

		System.out.println("-----------------------------Creation Record Verification------------------------------");

		String codeA = getText("//tr[contains(@id,\"CodesTableRow\")][" + rows + "]/td[2]/div");
		String countryA = getText("//tr[contains(@id,\"CodesTableRow\")][" + rows + "]/td[3]/div");

		if (codeA.equals(code) && countryA.contains("Test")) {
			creationRecord = true;
		}

		System.out.println("The record of creation is being displayed: " + creationRecord);

		assertTrue(creationRecord, this.creationRecord);

	}

	public void editCountryCode() {

		verification();

		int rows = rows("//tr[contains(@id,\"CodesTableRow\")]");

		boolean edited = false;

		String codeE = "ZZ";
		String countryE = "Test 04";

		WebElement txtEditCode = findElement("//tr[contains(@id,\"CodesTableRow\")][" + rows + "]/td[2]/input");
		WebElement txtEditCountry = findElement("//tr[contains(@id,\"CodesTableRow\")][" + rows + "]/td[3]/input");
		WebElement btnEdit = findElement(
				"//tr[contains(@id,\"CodesTableRow\")][" + rows + "]//child::button[contains(@id,\"edit\")]");
		
		click(btnEdit);

		clear(txtEditCode);
		txtEditCode.sendKeys(codeE);

		clear(txtEditCountry);
		txtEditCountry.sendKeys(countryE);

		// sendKeys(txtEditCode, codeE);
		// sendKeys(txtEditCountry, countryE);

		click(btnEdit);

		visibilityOfElementXpath("//tr[contains(@id,\"CodesTableRow\")]");

		refresh();

		visibilityOfElementXpath("//tr[contains(@id,\"CodesTableRow\")]");

		click(btnGoToLast);

		visibilityOfElementXpath("//tr[contains(@id,\"CodesTableRow\")]");

		String codeA = getText("//tr[contains(@id,\"CodesTableRow\")][" + rows + "]/td[2]/div");
		String CountryA = getText("//tr[contains(@id,\"CodesTableRow\")][" + rows + "]/td[3]/div");

		System.out.println("-----------------------------Edition Verification------------------------------");

		System.out.println("The code is: " + codeA);
		System.out.println("The country is: " + CountryA);

		if (CountryA.equals(countryE) && codeA.equals(codeE)) {
			edited = true;
		}

		System.out.println("The record was edited with success: " + edited);

		assertTrue(edited, editionRecord);

	}

	public void deleteCountryCode() {

		verification();

		int rows = rows("//tr[contains(@id,\"CodesTableRow\")]");

		boolean deleted = false;

		WebElement btnDelete = findElement(
				"//tr[contains(@id,\"CodesTableRow\")][" + rows + "]//child::button[contains(@id,\"delete\")]");

		click(btnDelete);
		sleep(5000);

		refresh();

		visibilityOfElementXpath("//tr[contains(@id,\"CodesTableRow\")]");

		click(btnGoToLast);

		visibilityOfElementXpath("//tr[contains(@id,\"CodesTableRow\")]");

		rows = rows("//tr[contains(@id,\"CodesTableRow\")]");

		String codeA = getText("//tr[contains(@id,\"CodesTableRow\")][" + rows + "]/td[2]/div");
		String CountryA = getText("//tr[contains(@id,\"CodesTableRow\")][" + rows + "]/td[3]/div");

		System.out.println("---------------------------Deletion Verification--------------------------");

		System.out.println("The code is: " + codeA);
		System.out.println("The country is: " + CountryA);

		if (!CountryA.equals(country) && !codeA.equals(code)) {
			deleted = true;
		}

		System.out.println("The record was deleted with success: " + deleted);

		assertTrue(deleted, deletionRecord);

	}

	public void addPrefix() {

		verification();

		int rows = rows("//tr[contains(@id,\"CodesTableRow\")]");

		WebElement btnModal = findElement(
				"//tr[contains(@id,\"CodesTableRow\")][" + rows + "]//child::button[contains(@id,\"prefixes\")]");

		click(btnModal);

		waitExpectedElement(txtPrefix);

		int rowsModalB = rows("//tr[contains(@id,\"TableRow\") and not(contains(@id,\"Country\"))]");

		sendKeys(txtPrefix, prefix);

		click(btnAddPrefix);

		visibilityOfElementXpath("//tr[contains(@id,\"CodesTableRow\")][1]");

		refresh();

		visibilityOfElementXpath("//tr[contains(@id,\"CodesTableRow\")][1]");

		clickOnGoToLast();

		btnModal = findElement(
				"//tr[contains(@id,\"CodesTableRow\")][" + rows + "]//child::button[contains(@id,\"prefixes\")]");
		
		click(btnModal);

		waitExpectedElement(txtPrefix);

		int rowsModalA = rows("//tr[contains(@id,\"TableRow\") and not(contains(@id,\"Country\"))]");

		boolean created = false;

		System.out.println("------------------------------Prefix Creation Verification---------------------------");

		if (rowsModalA > rowsModalB) {
			created = true;
		}

		System.out.println("The Prefix was created with success: " + created);
		assertTrue(created, createdUnSuccesfully);

		created = false;

		String prefixCreated = getText(
				"//tr[contains(@id,\"TableRow\") and not(contains(@id,\"Country\"))][" + rowsModalA + "]/td[2]/div");
		System.out.println("The prefix is: " + prefixCreated);

		if (prefixCreated.equals(prefix)) {

			created = true;

		}

		System.out.println("The Prefix has the correct information: " + created);

		assertTrue(created, createdUnSuccesfully);

	}

	public void editPrefix() {
		
		verification();

		int rows = rows("//tr[contains(@id,\"CodesTableRow\")]");

		WebElement btnModal = findElement(
				"//tr[contains(@id,\"CodesTableRow\")][" + rows + "]//child::button[contains(@id,\"prefixes\")]");

		click(btnModal);

		waitExpectedElement(txtPrefix);

		int rowsModal = rows("//tr[contains(@id,\"TableRow\") and not(contains(@id,\"Country\"))]");

		WebElement btnEdit = findElement("//tr[contains(@id,\"TableRow\") and not(contains(@id,\"Country\"))]["
				+ rowsModal + "]//child::button[contains(@id,\"edit\")]");

		click(btnEdit);

		int prefixEdit = random(9999);
		System.out.println("Prefix Number is: " + prefixEdit);

		WebElement txtEditPrefix = findElement(
				"//tr[contains(@id,\"TableRow\") and not(contains(@id,\"Country\"))][" + rowsModal + "]/td[2]/input");

		clear(txtEditPrefix);

		sendKeys(txtEditPrefix, prefixEdit);

		btnEdit = findElement("//tr[contains(@id,\"TableRow\") and not(contains(@id,\"Country\"))][" + rowsModal
				+ "]//child::button[contains(@id,\"confirm\")]");

		click(btnEdit);
		sleep(5000);

		refresh();

		visibilityOfElementXpath("//tr[contains(@id,\"CodesTableRow\")][1]");

		click(btnGoToLast);

		visibilityOfElementXpath("//tr[contains(@id,\"CodesTableRow\")][1]");

		rows = rows("//tr[contains(@id,\"CodesTableRow\")]");

		btnModal = findElement(
				"//tr[contains(@id,\"CodesTableRow\")][" + rows + "]//child::button[contains(@id,\"prefixes\")]");

		click(btnModal);

		waitExpectedElement(txtPrefix);

		String editionText = getText(
				"//tr[contains(@id,\"TableRow\") and not(contains(@id,\"Country\"))][" + rowsModal + "]/td[2]/div");

		System.out.println("--------------------------Prefix Edition Verification-----------------------");

		System.out.println("The record after edition is: " + editionText);

		boolean edited = false;

		if (editionText.equals(String.valueOf(prefixEdit))) {
			edited = true;
		}

		System.out.println("The Prefix was edited successfully: " + edited);

		assertTrue(edited, editionRecord);

	}

	public void deletePrefix() {
		
		verification();

		int rows = rows("//tr[contains(@id,\"CodesTableRow\")]");

		WebElement btnModal = findElement(
				"//tr[contains(@id,\"CodesTableRow\")][" + rows + "]//child::button[contains(@id,\"prefixes\")]");

		click(btnModal);

		waitExpectedElement(txtPrefix);

		int rowsModal = rows("//tr[contains(@id,\"TableRow\") and not(contains(@id,\"Country\"))]");

		WebElement btnDelete = findElement("//tr[contains(@id,\"TableRow\") and not(contains(@id,\"Country\"))]["
				+ rowsModal + "]//child::button[contains(@id,\"delete\")]");

		click(btnDelete);

		sleep(5000);

		refresh();

		visibilityOfElementXpath("//tr[contains(@id,\"CodesTableRow\")][1]");

		click(btnGoToLast);

		rows = rows("//tr[contains(@id,\"CodesTableRow\")]");

		visibilityOfElementXpath("//tr[contains(@id,\"CodesTableRow\")][1]");

		
		btnModal = findElement(
				"//tr[contains(@id,\"CodesTableRow\")][" + rows + "]//child::button[contains(@id,\"prefixes\")]");

		
		click(btnModal);

		waitExpectedElement(txtPrefix);

		int rowsModalA = rows("//tr[contains(@id,\"TableRow\") and not(contains(@id,\"Country\"))]");

		boolean deleted = greaterThanInt(rowsModal, rowsModalA);

		System.out.println("--------------------------Prefix Deletion Verification-----------------------");

		System.out.println("The Prefix was deleted successfully: " + deleted);

		assertTrue(deleted, deletionRecord);

	}

	public void filter() {

		loginVerificationPO = new LoginVerificationPO();

		actionsMoveToElementElement(loginVerificationPO.btnConfiguration);

		clickOnCountryCodesMenu();

		actionsMoveToElementElement(btnAddCountryCode);

		clickOnGoToLast();

		int rows = rows("//tr[contains(@id,\"CodesTableRow\")]");

		String country = getText("//tr[contains(@id,\"CodesTableRow\")][" + rows + "]/td[3]//child::div");

		fillOutSearchCountry(country);

		clickOnSearchButton();

		rows = rows("//tr[contains(@id,\"CodesTableRow\")]");
		int j = 1;
		System.out.println("-------------------------Filter Verification------------------------------");
		System.out.println("The country to look for is: " + country);
		System.out.println("-------------------------------------");
		for (int i = 0; i < rows; i++) {

			String result = getText("//tr[contains(@id,\"CodesTableRow\")][" + j + "]/td[3]//child::div");

			System.out.println("The Results are: " + result);
			assertTrue(result.equals(country), filtersNotWorking);

		}
		
		refresh();
		visibilityOfElementXpath("//tr[contains(@id,\"CodesTableRow\")][1]");

	}



}
