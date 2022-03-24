package com.rs.test.pageObjectModel.configuration.characterEncoding;

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
public class CharacterEncondingPO extends TestBaseSteven {

	public CharacterEncondingPO() {
		PageFactory.initElements(driver, this);
	}

	// menu
	@FindBy(xpath = "//div[@class=\"headerMenuDropdown\"]/a[contains(text(),\"Character Encoding\")][2]")
	public WebElement menuActionTemplates;

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
	
	@FindBy(xpath = "//tr[@id=\"Character EncodingInputRow\"]/td[3]/input")
	public WebElement txtDescription;

	@FindBy(xpath = "//tr[@id=\"Character EncodingInputRow\"]/td[4]/input")
	public WebElement txtName;
	
	@FindBy(xpath = "//tr[@id=\"Character EncodingInputRow\"]/td[5]/input")
	public WebElement txtEscapeValue;
	
	@FindBy(xpath = "//select[@name=\"addparentEncodingId\"]")
	public WebElement cboParentEncoding;
	
	@FindBy(xpath = "//select[@name=\"addparentEncodingId\"]/option[not(contains(text(),\"option\"))][1]")
	public WebElement cboParentEncodingOption;

	@FindBy(xpath = "//button[@id=\"Character EncodingAddBtn\"]")
	public WebElement btnAddCharacterEncoding;

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

	public void clickOnActionTemplateMenu() {
		click(menuActionTemplates);
	}

	// Pagination

	public void clickOnGoToFirst() {
		click(btnGoToFirst);

		waitExpectedElement("//tr[contains(@id,\"Character EncodingTableRow\") and not(contains(@id,\"Default\"))]");
	}

	public void clickOnGoToPrevious() {
		click(btnGoToPrevious);

		waitExpectedElement("//tr[contains(@id,\"Character EncodingTableRow\") and not(contains(@id,\"Default\"))]");
	}

	public void clickOnGoToNext() {
		click(btnGoToNext);

		waitExpectedElement("//tr[contains(@id,\"Character EncodingTableRow\") and not(contains(@id,\"Default\"))]");
	}

	public void clickOnGoToLast() {
		click(btnGoToLast);

		waitExpectedElement("//tr[contains(@id,\"Character EncodingTableRow\") and not(contains(@id,\"Default\"))]");

	}

	// Create Methods

	public void fillOutName(String text) {
		sendKeys(txtName, text);
	}

	public void fillOutDescription(String text) {
		sendKeys(txtDescription, text);
	}
	
	public void fillOutEscapeValue(String text) {
		sendKeys(txtEscapeValue, text);
	}
	
	public void clickOnCboParentEncoding() {
		click(cboParentEncoding);
	}
	
	public void clickOnCboParentEncodingOption() {
		click(cboParentEncodingOption);
	}

	public void clickOnAddCharacterEncoding() {
		click(btnAddCharacterEncoding);
	}

	// Modals

	// Create
	
	
	String name = "Test";
	String description = "Test Character";
	String escapeValue = "123";
	String cboText = "";
	String id = "";

	public void createCharacterEncoding() {

		loginVerificationPO = new LoginVerificationPO();

		actionsMoveToElementElement(loginVerificationPO.btnConfiguration);

		clickOnActionTemplateMenu();

		actionsMoveToElementElement(btnAddCharacterEncoding);

		clickOnGoToLast();

		int rowsB = rows("//tr[contains(@id,\"Character EncodingTableRow\") and not(contains(@id,\"Default\"))]");

		clickOnCboParentEncoding();
		
		cboText = getText(cboParentEncodingOption);
		
		clickOnCboParentEncodingOption();

		fillOutDescription(description);
		
		fillOutName(name);
		
		fillOutEscapeValue(escapeValue);

		clickOnAddCharacterEncoding();

		refresh();

		waitExpectedElement("//tr[contains(@id,\"Character EncodingTableRow\") and not(contains(@id,\"Default\"))]/td[8]/div/button[1]");

		clickOnGoToLast();

		int rowsA = rows("//tr[contains(@id,\"Character EncodingTableRow\") and not(contains(@id,\"Default\"))]");

		System.out.println("--------------------Creation Verification--------------------");
		boolean created = greaterThanInt(rowsA, rowsB);
	
		assertTrue(created, createdUnSuccesfully);
	
		System.out.println("Record Created: "+created);
		
		created = false;

		String parentEncodingA = getText("//tr[contains(@id,\"Character EncodingTableRow\") and not(contains(@id,\"Default\"))][" + rowsA + "]/td[2]/div");
		String descriptionA = getText("//tr[contains(@id,\"Character EncodingTableRow\") and not(contains(@id,\"Default\"))][" + rowsA + "]/td[3]/div");
		String nameA = getText("//tr[contains(@id,\"Character EncodingTableRow\") and not(contains(@id,\"Default\"))][" + rowsA + "]/td[4]/div");
		String escapeValueA = getText("//tr[contains(@id,\"Character EncodingTableRow\") and not(contains(@id,\"Default\"))][" + rowsA + "]/td[5]/div");
		System.out.println("The Parent Encoding is: " + parentEncodingA);
		System.out.println("The Description is: " + descriptionA);
		System.out.println("The Name is: " + nameA);
		System.out.println("The Escape Value is: " + escapeValueA);

		if (parentEncodingA.equals(cboText) && descriptionA.equals(description) && nameA.equals(name)&& escapeValueA.equals(escapeValue) ) {
			created = true;
		}
		
		id = getText("//tr[contains(@id,\"Character EncodingTableRow\") and not(contains(@id,\"Default\"))][" + rowsA + "]/td[1]/div");
		
		assertTrue(created, createdUnSuccesfully);

		System.out.println("The record was created succesfully: " + created);
		

	}
	
	// Verfication before editing or deleting the record

	public void verification() {
		
		clickOnGoToLast();
		
		int rows = rows("//tr[contains(@id,\"Character EncodingTableRow\") and not(contains(@id,\"Default\"))]");
		
		String idA = getText("//tr[contains(@id,\"Character EncodingTableRow\") and not(contains(@id,\"Default\"))][" + rows + "]/td[1]/div");
		
		boolean record = false;
		
		if (idA.equals(id)) {
			record = true;
		}
		
		System.out.println("Creation record being displayed: "+record);
		
		assertTrue(record, creationRecord);
		
	}

	public void editCharacterEncoding() {

		loginVerificationPO = new LoginVerificationPO();

		verification();

		boolean edited = false;

		description = "Edition Test";
		name = "Edition Test";
		escapeValue = "321";
		
		int rows = rows("//tr[contains(@id,\"Character EncodingTableRow\") and not(contains(@id,\"Default\"))]");
				
		WebElement btnEdit = findElement("//tr[contains(@id,\"Character EncodingTableRow\") and not(contains(@id,\"Default\"))]["+rows+"]/td[8]/div/button[1]");
		
		click(btnEdit);
		
		WebElement cboEditParentEncoding = findElement("//tr[contains(@id,\"Character EncodingTableRow\") and not(contains(@id,\"Default\"))]["+rows+"]/td[2]/select");
		WebElement cboEditParentEncodingO = findElement("//tr[contains(@id,\"Character EncodingTableRow\") and not(contains(@id,\"Default\"))]["+rows+"]/td[2]/select/option[not(contains(text(),\"option\"))][2]");
		WebElement txtEditDescription = findElement("//tr[contains(@id,\"Character EncodingTableRow\") and not(contains(@id,\"Default\"))]["+rows+"]/td[3]/input");
		WebElement txtEditName = findElement("//tr[contains(@id,\"Character EncodingTableRow\") and not(contains(@id,\"Default\"))]["+rows+"]/td[4]/input");
		WebElement txtEditEscapeValue = findElement("//tr[contains(@id,\"Character EncodingTableRow\") and not(contains(@id,\"Default\"))]["+rows+"]/td[5]/input");
		
		click(cboEditParentEncoding);
		cboText = getText(cboEditParentEncodingO);
		System.out.println("Edition option is: "+cboText);
		click(cboEditParentEncodingO);
		
		clear(txtEditDescription);
		sendKeys(txtEditDescription, description);
		clear(txtEditName);
		sendKeys(txtEditName, name);
		clear(txtEditEscapeValue);
		sendKeys(txtEditEscapeValue, escapeValue);

		click(btnEdit);

		waitExpectedElement("//tr[contains(@id,\"Character EncodingTableRow\") and not(contains(@id,\"Default\"))]/td[8]/div/button[1]");

		refresh();

		waitExpectedElement("//tr[contains(@id,\"Character EncodingTableRow\") and not(contains(@id,\"Default\"))]/td[8]/div/button[1]");


		click(btnGoToLast);

		waitExpectedElement("//tr[contains(@id,\"Character EncodingTableRow\") and not(contains(@id,\"Default\"))]/td[8]/div/button[1]");

		System.out.println("-----------------------------------------Edition Verification-------------------------------");
		String parentEncodingA = getText("//tr[contains(@id,\"Character EncodingTableRow\") and not(contains(@id,\"Default\"))][" + rows + "]/td[2]/div");
		String descriptionA = getText("//tr[contains(@id,\"Character EncodingTableRow\") and not(contains(@id,\"Default\"))][" + rows + "]/td[3]/div");
		String nameA = getText("//tr[contains(@id,\"Character EncodingTableRow\") and not(contains(@id,\"Default\"))][" + rows + "]/td[4]/div");
		String escapeValueA = getText("//tr[contains(@id,\"Character EncodingTableRow\") and not(contains(@id,\"Default\"))][" + rows + "]/td[5]/div");
		System.out.println("The Parent Encoding is: " + parentEncodingA);
		System.out.println("The Description is: " + descriptionA);
		System.out.println("The Name is: " + nameA);
		System.out.println("The Escape Value is: " + escapeValueA);
		

		if (parentEncodingA.equals(cboText) && descriptionA.equals(description) && nameA.equals(name)&& escapeValueA.equals(escapeValue) ) {
			edited = true;
		}
		
		assertTrue(edited, createdUnSuccesfully);

		System.out.println("The record was edited succesfully: " + edited);


	}
	
	public void deleteActionTemplate() {


		loginVerificationPO = new LoginVerificationPO();

		verification();
		
		int rowsB = rows("//tr[contains(@id,\"Character EncodingTableRow\") and not(contains(@id,\"Default\"))]");
				
		WebElement btnDelete = findElement("//tr[contains(@id,\"Character EncodingTableRow\") and not(contains(@id,\"Default\"))]["+rowsB+"]/td[8]/div/button[2]");

		click(btnDelete);

		refresh();

		waitExpectedElement("//tr[contains(@id,\"Character EncodingTableRow\") and not(contains(@id,\"Default\"))]/td[8]/div/button[1]");

		click(btnGoToLast);

		waitExpectedElement("//tr[contains(@id,\"Character EncodingTableRow\") and not(contains(@id,\"Default\"))]/td[8]/div/button[1]");

		int rowsA = rows("//tr[contains(@id,\"Character EncodingTableRow\") and not(contains(@id,\"Default\"))]");

		boolean deleted = greaterThanInt(rowsB, rowsA);
		
		assertTrue(deleted, deletionRecord);
		
		System.out.println("The record was deleted with success: " + deleted);
		
		deleted = false;
		
		String idA = getText("//tr[contains(@id,\"Character EncodingTableRow\") and not(contains(@id,\"Default\"))][" + rowsA + "]/td[1]/div");
		String parentEncodingA = getText("//tr[contains(@id,\"Character EncodingTableRow\") and not(contains(@id,\"Default\"))][" + rowsA + "]/td[2]/div");
		String descriptionA = getText("//tr[contains(@id,\"Character EncodingTableRow\") and not(contains(@id,\"Default\"))][" + rowsA + "]/td[3]/div");
		String nameA = getText("//tr[contains(@id,\"Character EncodingTableRow\") and not(contains(@id,\"Default\"))][" + rowsA + "]/td[4]/div");
		String escapeValueA = getText("//tr[contains(@id,\"Character EncodingTableRow\") and not(contains(@id,\"Default\"))][" + rowsA + "]/td[5]/div");
		
		System.out.println("---------------------------Deletion Verification--------------------------");
		System.out.println("The Id is: " + idA);
		System.out.println("The Parent Encodin is: " + parentEncodingA);
		System.out.println("The Description is: " + descriptionA);
		System.out.println("The Name is: " + nameA);
		System.out.println("The Escape Value is: " + escapeValueA);

		if (!idA.equals(id) && !parentEncodingA.equals(cboText) && !descriptionA.equals(description) 
				&& !nameA.equals(name) && !escapeValueA.equals(escapeValue)) {
			deleted = true;
		}

		System.out.println("The record was deleted with success: " + deleted);

		assertTrue(deleted, deletionRecord);

	}
	

}
