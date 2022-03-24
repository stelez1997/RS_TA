package com.rs.test.pageObjectModel.configuration.countryCodes;

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
public class CountryCodesPO extends TestBaseSteven {

	public CountryCodesPO() {
		PageFactory.initElements(driver, this);
	}

	// menu
	@FindBy(xpath = "//div[@class=\"headerMenuDropdown\"]/a[contains(text(),\"Country Codes\")]")
	public WebElement menuCountryCodes;

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

	@FindBy(xpath = "//input[@name=\"countryCode\"]")
	public WebElement txtCode;

	@FindBy(xpath = "//input[@name=\"countryName\"]")
	public WebElement txtCountry;

	@FindBy(xpath = "//button[contains(@id,\"CodesAddBtn\")]")
	public WebElement btnAddCountryCode;

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

	String code = "ZZ";
	String country = "Test 02";
	String prefix = "123";

	// Menu

	public void clickOnCountryCodesMenu() {
		click(menuCountryCodes);
	}

	// Pagination

	public void clickOnGoToFirst() {
		click(btnGoToFirst);

		waitExpectedElement("//button[@id=\"prefixesModalBtn0\"]");
	}

	public void clickOnGoToPrevious() {
		click(btnGoToPrevious);

		waitExpectedElement("//button[@id=\"prefixesModalBtn0\"]");
	}

	public void clickOnGoToNext() {
		click(btnGoToNext);

		waitExpectedElement("//button[@id=\"prefixesModalBtn0\"]");
	}

	public void clickOnGoToLast() {
		click(btnGoToLast);

		waitExpectedElement("//button[@id=\"prefixesModalBtn0\"]");
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

		waitExpectedElement("//button[@id=\"prefixesModalBtn0\"]");

		clickOnGoToLast();

		int rowsA = rows("//tr[contains(@id,\"CodesTableRow\")]");

		System.out.println("--------------------Creation Verification--------------------");
		boolean created = false;

		if (rowsA > rowsB) {
			created = true;
		}

		assertTrue(created, createdUnSuccesfully);

		created = false;

		String codeA = getText("//tr[contains(@id,\"CodesTableRow\")][" + rowsA + "]/td[1]/div");
		String CountryA = getText("//tr[contains(@id,\"CodesTableRow\")][" + rowsA + "]/td[2]/div");

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
		
		int rowsModal = rows("//div[contains(@style,\"none\") and @class=\"tablePageModalBack\"]");
		
		if (rowsModal ==0) {
			
			refresh();
			waitExpectedElement("//button[@id=\"prefixesModalBtn0\"]");
		}
		
		clickOnGoToLast();

		int rows = rows("//tr[contains(@id,\"CodesTableRow\")]");
		boolean creationRecord = false;
		
		System.out.println("-----------------------------Creation Record Verification------------------------------");

		String codeA = getText("//tr[contains(@id,\"CodesTableRow\")][" + rows + "]/td[1]/div");
		String countryA = getText("//tr[contains(@id,\"CodesTableRow\")][" + rows + "]/td[2]/div");

		if ( codeA.equals(code)&& countryA.contains("Test")) {
			creationRecord = true;
		}

		System.out.println("The record of creation is being displayed: " + creationRecord);

		assertTrue(creationRecord, this.creationRecord);

	}

	public void edit() {

		loginVerificationPO = new LoginVerificationPO();

		verification();

		int rows = rows("//tr[contains(@id,\"CodesTableRow\")]");

		boolean edited = false;

		String codeE = "ZZ";
		String countryE = "Test 04";

		WebElement txtEditCode = findElement("//tr[contains(@id,\"CodesTableRow\")][" + rows + "]/td[1]/input");
		WebElement txtEditCountry = findElement("//tr[contains(@id,\"CodesTableRow\")][" + rows + "]/td[2]/input");
		WebElement btnEdit = findElement("//tr[contains(@id,\"CodesTableRow\")][" + rows + "]/td[6]/div/button[1]");

		click(btnEdit);

		clear(txtEditCode);
		txtEditCode.sendKeys(codeE);
		
		clear(txtEditCountry);
		txtEditCountry.sendKeys(countryE);
		
		//sendKeys(txtEditCode, codeE);
		//sendKeys(txtEditCountry, countryE);

		click(btnEdit);

		waitExpectedElement("//button[@id=\"prefixesModalBtn0\"]");

		refresh();

		waitExpectedElement("//button[@id=\"prefixesModalBtn0\"]");

		click(btnGoToLast);

		waitExpectedElement("//button[@id=\"prefixesModalBtn0\"]");

		String codeA = getText("//tr[contains(@id,\"CodesTableRow\")][" + rows + "]/td[1]/div");
		String CountryA = getText("//tr[contains(@id,\"CodesTableRow\")][" + rows + "]/td[2]/div");
		
		System.out.println("-----------------------------Edition Verification------------------------------");
		
		System.out.println("The code is: " + codeA);
		System.out.println("The country is: " + CountryA);

		if (CountryA.equals(countryE) && codeA.equals(codeE)) {
			edited = true;
		}

		System.out.println("The record was edited with success: " + edited);

		assertTrue(edited, editionRecord);


	}

	public void delete() {

		loginVerificationPO = new LoginVerificationPO();

		verification();

		int rows = rows("//tr[contains(@id,\"CodesTableRow\")]");

		boolean deleted = false;

		WebElement btnDelete = findElement("//tr[contains(@id,\"CodesTableRow\")][" + rows + "]/td[6]/div/button[2]");

		click(btnDelete);

		refresh();

		waitExpectedElement("//button[@id=\"prefixesModalBtn0\"]");

		click(btnGoToLast);

		waitExpectedElement("//button[@id=\"prefixesModalBtn0\"]");

		rows = rows("//tr[contains(@id,\"CodesTableRow\")]");

		String codeA = getText("//tr[contains(@id,\"CodesTableRow\")][" + rows + "]/td[1]/div");
		String CountryA = getText("//tr[contains(@id,\"CodesTableRow\")][" + rows + "]/td[2]/div");
		
		
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
		


		loginVerificationPO = new LoginVerificationPO();

		verification();

		int rows = rows("//tr[contains(@id,\"CodesTableRow\")]");

		WebElement btnModal = findElement("//tr[contains(@id,\"CodesTableRow\")][" + rows + "]/td[5]/div/button");

		click(btnModal);

		waitExpectedElement(txtPrefix);

		int rowsModalB = rows("//tr[contains(@id,\"undefinedTableRow\")]");

		sendKeys(txtPrefix, prefix);

		click(btnAddPrefix);

		waitExpectedElement("//button[@id=\"prefixesModalBtn0\"]");

		refresh();

		waitExpectedElement("//button[@id=\"prefixesModalBtn0\"]");

		clickOnGoToLast();

		btnModal = findElement("//tr[contains(@id,\"CodesTableRow\")][" + rows + "]/td[5]/div/button");

		click(btnModal);

		waitExpectedElement(txtPrefix);

		int rowsModalA = rows("//tr[contains(@id,\"undefinedTableRow\")]");

		boolean created = false;
		
		System.out.println("------------------------------Prefix Creation Verification---------------------------");

		if (rowsModalA > rowsModalB) {
			created = true;
		}

		System.out.println("The Prefix was created with success: " + created);
		assertTrue(created, createdUnSuccesfully);

		created = false;

		String prefixCreated = getText("//tr[contains(@id,\"undefinedTableRow\")][" + rowsModalA + "]/td[1]/div");
		System.out.println("The prefix is: " + prefixCreated);

		if (prefixCreated.equals(prefix)) {

			created = true;

		}

		System.out.println("The Prefix has the correct information: " + created);

		assertTrue(created, createdUnSuccesfully);

	}

	public void editPrefix() {
	

		loginVerificationPO = new LoginVerificationPO();

		verification();

		int rows = rows("//tr[contains(@id,\"CodesTableRow\")]");

		WebElement btnModal = findElement("//tr[contains(@id,\"CodesTableRow\")][" + rows + "]/td[5]/div/button");

		click(btnModal);

		waitExpectedElement(txtPrefix);

		int rowsModal = rows("//tr[contains(@id,\"undefinedTableRow\")]");
		

		WebElement btnEdit = findElement("//tr[contains(@id,\"undefinedTableRow\")][" + rowsModal + "]/td[2]/div/button[1]");

		click(btnEdit);

		String prefixEdit = "1234";

		WebElement txtEditPrefix = findElement("//tr[contains(@id,\"undefinedTableRow\")][" + rowsModal + "]/td[1]/input");

		clear(txtEditPrefix);
		
		sendKeys(txtEditPrefix, prefixEdit);

		btnEdit = findElement("//tr[contains(@id,\"undefinedTableRow\")][" + rowsModal + "]/td[2]/div/button[1]");

		click(btnEdit);
		

		refresh();

		waitExpectedElement("//button[@id=\"prefixesModalBtn0\"]");
		
		click(btnGoToLast);
		
		
		waitExpectedElement("//button[@id=\"prefixesModalBtn0\"]");
		
		
		btnModal = findElement("//tr[contains(@id,\"CodesTableRow\")][" + rows + "]/td[5]/div/button");

		click(btnModal);

		waitExpectedElement(txtPrefix);
		
		String editionText = getText("//tr[contains(@id,\"undefinedTableRow\")]["+rowsModal+"]/td[1]/div");
		
		System.out.println("--------------------------Prefix Edition Verification-----------------------");
		
		System.out.println("The record after edition is: "+editionText);
		
		boolean edited = false;
		
		if (editionText.equals(prefixEdit)) {
			edited = true;
		}
		
		System.out.println("The Prefix was edited successfully: "+edited);
		
		assertTrue(edited, editionRecord);
		
		
	}

	public void deletePrefix() {
	

		loginVerificationPO = new LoginVerificationPO();

		verification();

		int rows = rows("//tr[contains(@id,\"CodesTableRow\")]");

		WebElement btnModal = findElement("//tr[contains(@id,\"CodesTableRow\")][" + rows + "]/td[5]/div/button");

		click(btnModal);

		waitExpectedElement(txtPrefix);
		
		

		int rowsModal = rows("//tr[contains(@id,\"undefinedTableRow\")]");
		
		if (rowsModal == 0) {
			
			assertTrue(false, noRecordFound);
		}
		

		WebElement btnDelete = findElement("//tr[contains(@id,\"undefinedTableRow\")][" + rowsModal + "]/td[2]/div/button[2]");

		click(btnDelete);

		refresh();

		waitExpectedElement("//button[@id=\"prefixesModalBtn0\"]");
		
		click(btnGoToLast);
		
		
		waitExpectedElement("//button[@id=\"prefixesModalBtn0\"]");
		
		btnModal = findElement("//tr[contains(@id,\"CodesTableRow\")][" + rows + "]/td[5]/div/button");

		click(btnModal);

		waitExpectedElement(txtPrefix);
		
		int rowsModalA = rows("//tr[contains(@id,\"undefinedTableRow\")]");
		
		boolean deleted = greaterThanInt(rowsModal, rowsModalA);
	
		System.out.println("--------------------------Prefix Deletion Verification-----------------------");
		
		System.out.println("The Prefix was deleted successfully: "+deleted);
		
		assertTrue(deleted, deletionRecord);
		
		
	}
}
