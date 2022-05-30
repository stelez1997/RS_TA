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

	@FindBy(xpath = "//h1[text()=\"Character Encoding\"]//ancestor::div[@class=\"tablePageSection\"]/div[contains(@class,\"tablePage\") and not(@style=\"display: none;\") ]//button[text()=\"<<\"]")
	public WebElement btnGoToFirstCharacterEncoding;

	@FindBy(xpath = "//h1[text()=\"Character Encoding\"]//ancestor::div[@class=\"tablePageSection\"]/div[contains(@class,\"tablePage\") and not(@style=\"display: none;\") ]//button[text()=\"<\"]")
	public WebElement btnGoToPreviousCharacterEncoding;

	@FindBy(xpath = "//h1[text()=\"Character Encoding\"]//ancestor::div[@class=\"tablePageSection\"]/div[contains(@class,\"tablePage\") and not(@style=\"display: none;\") ]//button[text()=\">>\"]")
	public WebElement btnGoToLastCharacterEncoding;

	@FindBy(xpath = "//h1[text()=\"Character Encoding\"]//ancestor::div[@class=\"tablePageSection\"]/div[contains(@class,\"tablePage\") and not(@style=\"display: none;\") ]//button[text()=\">\"]")
	public WebElement btnGoToNextCharacterEncoding;

	@FindBy(xpath = "//tr[contains(@id,\"PointTable\")]//ancestor::div[@class=\"tablePageSection\"]/div[contains(@class,\"tablePage\") and not(@style=\"display: none;\") ]//button[text()=\"<<\"]")
	public WebElement btnGoToFirstCodePoint;

	@FindBy(xpath = "//tr[contains(@id,\"PointTable\")]//ancestor::div[@class=\"tablePageSection\"]/div[contains(@class,\"tablePage\") and not(@style=\"display: none;\") ]//button[text()=\"<\"]")
	public WebElement btnGoToPreviousCodePoint;

	@FindBy(xpath = "//tr[contains(@id,\"PointTable\")]//ancestor::div[@class=\"tablePageSection\"]/div[contains(@class,\"tablePage\") and not(@style=\"display: none;\") ]//button[text()=\">>\"]")
	public WebElement btnGoToLastCodePoint;

	@FindBy(xpath = "//tr[contains(@id,\"PointTable\")]//ancestor::div[@class=\"tablePageSection\"]/div[contains(@class,\"tablePage\") and not(@style=\"display: none;\") ]//button[text()=\">\"]")
	public WebElement btnGoToNextCodePoint;

	// Character Encoding Create

	@FindBy(xpath = "//tr[@id=\"Character EncodingInputRow\"]/td[3]/input")
	public WebElement txtDescription;

	@FindBy(xpath = "//tr[@id=\"Character EncodingInputRow\"]/td[4]/input")
	public WebElement txtName;

	@FindBy(xpath = "//tr[@id=\"Character EncodingInputRow\"]/td[5]/input")
	public WebElement txtEscapeValue;

	@FindBy(xpath = "//select[@name=\"addparentEncodingId\"]")
	public WebElement cboParentEncoding;

	@FindBy(xpath = "//select[@name=\"addparentEncodingId\"]/option[not(contains(text(),\"option\")) and text()][1]")
	public WebElement cboParentEncodingOption;

	@FindBy(xpath = "//button[@id=\"Character EncodingAddBtn\"]")
	public WebElement btnAddCharacterEncoding;

	// Custom Encode Code Point

	@FindBy(xpath = "//select[@name=\"addcharacterEncodingName\"]")
	public WebElement cboEncoding;

	@FindBy(xpath = "//select[@name=\"addcharacterEncodingName\"]/option[not(contains(text(),\"option\")) and text()][1]")
	public WebElement cboEncodingOption;

	@FindBy(xpath = "//input[@name=\"codePointOverrideHex\"]")
	public WebElement txtCodePoint;

	@FindBy(xpath = "//input[@name=\"uniChar\"]")
	public WebElement txtUnichar;

	@FindBy(xpath = "//button[@id=\"Custom Encode Code PointAddBtn\"]")
	public WebElement btnAddCustomEncodeCodePoint;

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

	public void clickOnCharacterEncodingMenu() {
		
		click(menuActionTemplates);
		visibilityOfElementXpath("//tr[contains(@id,\"Character EncodingTable\") and not(contains(@id,\"Default\"))][1]//button[contains(@id,\"edit\")]");
		visibilityOfElementXpath("//tr[contains(@id,\"Custom Encode Code PointTable\") ][1]//button[contains(@id,\"edit\")]");
	
	}

	// Pagination

	public void clickOnGoToFirst(int table) {

		if (table == 1) {

			click(btnGoToFirstCharacterEncoding);

			waitExpectedElement("//tr[contains(@id,\"Character EncodingTable\") and not(contains(@id,\"Default\"))][1]//button[contains(@id,\"edit\")]");

		} else {

			click(btnGoToFirstCodePoint);

			waitExpectedElement("//tr[contains(@id,\"Custom Encode Code PointTable\") ][1]//button[contains(@id,\"edit\")]");

		}

	}

	public void clickOnGoToPrevious(int table) {
		
		if (table == 1) {

			click(btnGoToPreviousCharacterEncoding);

			waitExpectedElement("//tr[contains(@id,\"Character EncodingTable\") and not(contains(@id,\"Default\"))][1]//button[contains(@id,\"edit\")]");

		} else {

			click(btnGoToPreviousCodePoint);

			waitExpectedElement("//tr[contains(@id,\"Custom Encode Code PointTable\") ][1]//button[contains(@id,\"edit\")]");

		}
	}

	public void clickOnGoToNext(int table) {
		
		if (table == 1) {

			click(btnGoToNextCharacterEncoding);

			waitExpectedElement("//tr[contains(@id,\"Character EncodingTable\") and not(contains(@id,\"Default\"))][1]//button[contains(@id,\"edit\")]");

		} else {

			click(btnGoToNextCodePoint);

			waitExpectedElement("//tr[contains(@id,\"Custom Encode Code PointTable\") ][1]//button[contains(@id,\"edit\")]");

		}
	}

	public void clickOnGoToLast(int table) {
		
		if (table == 1) {

			click(btnGoToLastCharacterEncoding);

			waitExpectedElement("//tr[contains(@id,\"Character EncodingTable\") and not(contains(@id,\"Default\"))][1]//button[contains(@id,\"edit\")]");

		} else {

			click(btnGoToLastCodePoint);

			waitExpectedElement("//tr[contains(@id,\"Custom Encode Code PointTable\") ][1]//button[contains(@id,\"edit\")]");

		}

	}

	// Character Encoding Create Methods

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

	// Custom Encode Code Point Create Methods

	public void clickOnCboEncoding() {
		click(cboEncoding);
	}

	public void clickOnCboEncodingOption() {
		click(cboEncodingOption);
	}

	public void fillOutCodePoint(String text) {
		sendKeys(txtCodePoint, text);
	}

	public void fillOutUnichar(String text) {
		sendKeys(txtUnichar, text);
	}

	public void clickOnAddCustomEncodeCodePoint() {
		click(btnAddCustomEncodeCodePoint);
	}

	// Modals

	// Character Encoding Create Create

	String description = "Test";
	String name = "Test Character";
	String escapeValue = "123";
	String cboText = "";
	String id = "";

	// Custom Encode Code Create

	String codePoint = "0x12";
	String unichar = "$";

	public void createCharacterEncoding() {

		loginVerificationPO = new LoginVerificationPO();

		actionsMoveToElementElement(loginVerificationPO.btnConfiguration);

		clickOnCharacterEncodingMenu();

		actionsMoveToElementElement(btnAddCharacterEncoding);
		
		int rowsB = rows("//tr[contains(@id,\"Character EncodingTableRow\") and not(contains(@id,\"Default\"))]");
		
		scrollDown(rowsB);

		clickOnGoToLast(1);

		clickOnCboParentEncoding();

		cboText = getText(cboParentEncodingOption);

		clickOnCboParentEncodingOption();

		fillOutDescription(description);

		fillOutName(name);

		fillOutEscapeValue(escapeValue);

		clickOnAddCharacterEncoding();

		refresh();

		waitExpectedElement(
				"//tr[contains(@id,\"Character EncodingTable\") and not(contains(@id,\"Default\"))][1]//button[contains(@id,\"edit\")]");
		
		scrollDown(rowsB);
		clickOnGoToLast(1);

		int rowsA = rows("//tr[contains(@id,\"Character EncodingTableRow\") and not(contains(@id,\"Default\"))]");

		System.out.println("--------------------Creation Verification--------------------");
		boolean created = greaterThanInt(rowsA, rowsB);

		assertTrue(created, createdUnSuccesfully);

		System.out.println("Record Created: " + created);

		created = false;

		String parentEncodingA = getText(
				"//tr[contains(@id,\"Character EncodingTableRow\") and not(contains(@id,\"Default\"))][" + rowsA
						+ "]/td[3]/div");
		String descriptionA = getText(
				"//tr[contains(@id,\"Character EncodingTableRow\") and not(contains(@id,\"Default\"))][" + rowsA
						+ "]/td[4]/div");
		String nameA = getText("//tr[contains(@id,\"Character EncodingTableRow\") and not(contains(@id,\"Default\"))]["
				+ rowsA + "]/td[5]/div");
		String escapeValueA = getText(
				"//tr[contains(@id,\"Character EncodingTableRow\") and not(contains(@id,\"Default\"))][" + rowsA
						+ "]/td[6]/div");
		System.out.println("The Parent Encoding is: " + parentEncodingA);
		System.out.println("The Description is: " + descriptionA);
		System.out.println("The Name is: " + nameA);
		System.out.println("The Escape Value is: " + escapeValueA);

		if (parentEncodingA.equals(cboText) && descriptionA.equals(description) && nameA.equals(name)
				&& escapeValueA.equals(escapeValue)) {
			created = true;
		}

		id = getText("//tr[contains(@id,\"Character EncodingTableRow\") and not(contains(@id,\"Default\"))][" + rowsA
				+ "]/td[2]/div");

		assertTrue(created, createdUnSuccesfully);

		System.out.println("The record was created succesfully: " + created);

	}

	// Verfication before editing or deleting the record

	public void verification(int table) {
		
		loginVerificationPO = new LoginVerificationPO();
		
		scrollUp(10);

		actionsMoveToElementElement(loginVerificationPO.btnConfiguration);

		clickOnCharacterEncodingMenu();

		actionsMoveToElementElement(btnAddCharacterEncoding);
		int rows = 0;
		
		if (table == 1) {
			rows = rows("//tr[contains(@id,\"Character EncodingTableRow\") and not(contains(@id,\"Default\"))]");
		}else {
			rows = rows("//tr[contains(@id,\"PointTable\")]");
		}
	
		if (table !=1) {
			scrollDown(rows+3);
		}else {
			scrollDown(rows);
		}


		clickOnGoToLast(1);
		
		String idA ="";
		
		if (table == 1) {
			idA = getText("//tr[contains(@id,\"Character EncodingTableRow\") and not(contains(@id,\"Default\"))]["
					+ rows + "]/td[2]/div");
		}else {
			idA = getText("//tr[contains(@id,\"PointTable\")]["+ rows + "]/td[2]/div");
		}



		boolean record = false;

		if (idA.equals(id)) {
			record = true;
		}

		System.out.println("Creation record being displayed: " + record);

		assertTrue(record, creationRecord);

	}

	public void editCharacterEncoding() {

		loginVerificationPO = new LoginVerificationPO();

		verification(1);

		boolean edited = false;

		description = "Edition Test";
		name = "Edition Test";
		escapeValue = "321";

		int rows = rows("//tr[contains(@id,\"Character EncodingTableRow\") and not(contains(@id,\"Default\"))]");

		WebElement btnEdit = findElement(
				"//tr[contains(@id,\"Character EncodingTableRow\") and not(contains(@id,\"Default\"))][" + rows
						+ "]//button[contains(@id,\"edit\")]");

		click(btnEdit);

		WebElement cboEditParentEncoding = findElement(
				"//tr[contains(@id,\"Character EncodingTableRow\") and not(contains(@id,\"Default\"))][" + rows
						+ "]/td[3]/select");
		WebElement cboEditParentEncodingO = findElement(
				"//tr[contains(@id,\"Character EncodingTableRow\") and not(contains(@id,\"Default\"))][" + rows
						+ "]/td[3]/select/option[not(contains(text(),\"option\")) and text()][2]");
		WebElement txtEditDescription = findElement(
				"//tr[contains(@id,\"Character EncodingTableRow\") and not(contains(@id,\"Default\"))][" + rows
						+ "]/td[4]/input");
		WebElement txtEditName = findElement(
				"//tr[contains(@id,\"Character EncodingTableRow\") and not(contains(@id,\"Default\"))][" + rows
						+ "]/td[5]/input");
		WebElement txtEditEscapeValue = findElement(
				"//tr[contains(@id,\"Character EncodingTableRow\") and not(contains(@id,\"Default\"))][" + rows
						+ "]/td[6]/input");

		click(cboEditParentEncoding);
		cboText = getText(cboEditParentEncodingO);
		System.out.println("Edition option is: " + cboText);
		click(cboEditParentEncodingO);

		clear(txtEditDescription);
		sendKeys(txtEditDescription, description);
		clear(txtEditName);
		sendKeys(txtEditName, name);
		clear(txtEditEscapeValue);
		sendKeys(txtEditEscapeValue, escapeValue);

		System.out.println("--------------Options Selected---------------------");
		System.out.println("The Parent Encoding is: " + cboText);
		System.out.println("The Description is: " + description);
		System.out.println("The Name is: " + name);
		System.out.println("The Escape Value is: " + escapeValue);

		click(btnEdit);

		waitExpectedElement("//tr[contains(@id,\"Character EncodingTableRow\") and not(contains(@id,\"Default\"))]//button[contains(@id,\"edit\")]");

		refresh();

		waitExpectedElement("//tr[contains(@id,\"Character EncodingTableRow\") and not(contains(@id,\"Default\"))]//button[contains(@id,\"edit\")]");

		scrollDown(rows);
		clickOnGoToLast(1);

		waitExpectedElement("//tr[contains(@id,\"Character EncodingTableRow\") and not(contains(@id,\"Default\"))]//button[contains(@id,\"edit\")]");

		System.out.println(
				"-----------------------------------------Edition Verification-------------------------------");
		String parentEncodingA = getText(
				"//tr[contains(@id,\"Character EncodingTableRow\") and not(contains(@id,\"Default\"))][" + rows
						+ "]/td[3]/div");
		String descriptionA = getText(
				"//tr[contains(@id,\"Character EncodingTableRow\") and not(contains(@id,\"Default\"))][" + rows
						+ "]/td[4]/div");
		String nameA = getText("//tr[contains(@id,\"Character EncodingTableRow\") and not(contains(@id,\"Default\"))]["
				+ rows + "]/td[5]/div");
		String escapeValueA = getText(
				"//tr[contains(@id,\"Character EncodingTableRow\") and not(contains(@id,\"Default\"))][" + rows
						+ "]/td[6]/div");
		System.out.println("The Parent Encoding is: " + parentEncodingA);
		System.out.println("The Description is: " + descriptionA);
		System.out.println("The Name is: " + nameA);
		System.out.println("The Escape Value is: " + escapeValueA);

		if (parentEncodingA.equals(cboText) && descriptionA.equals(description) && nameA.equals(name)
				&& escapeValueA.equals(escapeValue)) {
			edited = true;
		}

		assertTrue(edited, createdUnSuccesfully);

		System.out.println("The record was edited succesfully: " + edited);

	}

	public void deleteCharacterEncoding() {

		loginVerificationPO = new LoginVerificationPO();

		verification(1);

		int rowsB = rows("//tr[contains(@id,\"Character EncodingTableRow\") and not(contains(@id,\"Default\"))]");

		WebElement btnDelete = findElement(
				"//tr[contains(@id,\"Character EncodingTableRow\") and not(contains(@id,\"Default\"))][" + rowsB
						+ "]//button[contains(@id,\"delete\")]");

		click(btnDelete);

		refresh();

		waitExpectedElement(
				"//tr[contains(@id,\"Character EncodingTableRow\") and not(contains(@id,\"Default\"))]//button[contains(@id,\"delete\")]");
		
		scrollDown(rowsB);
		clickOnGoToLast(1);

		int rowsA = rows("//tr[contains(@id,\"Character EncodingTableRow\") and not(contains(@id,\"Default\"))]");

		boolean deleted = greaterThanInt(rowsB, rowsA);

		assertTrue(deleted, deletionRecord);

		System.out.println("The record was deleted with success: " + deleted);

		deleted = false;

		String idA = getText("//tr[contains(@id,\"Character EncodingTableRow\") and not(contains(@id,\"Default\"))]["
				+ rowsA + "]/td[2]/div");
		String parentEncodingA = getText(
				"//tr[contains(@id,\"Character EncodingTableRow\") and not(contains(@id,\"Default\"))][" + rowsA
						+ "]/td[3]/div");
		String descriptionA = getText(
				"//tr[contains(@id,\"Character EncodingTableRow\") and not(contains(@id,\"Default\"))][" + rowsA
						+ "]/td[4]/div");
		String nameA = getText("//tr[contains(@id,\"Character EncodingTableRow\") and not(contains(@id,\"Default\"))]["
				+ rowsA + "]/td[5]/div");
		String escapeValueA = getText(
				"//tr[contains(@id,\"Character EncodingTableRow\") and not(contains(@id,\"Default\"))][" + rowsA
						+ "]/td[6]/div");

		System.out.println("---------------------------Deletion Verification--------------------------");
		System.out.println("The Id is: " + idA);
		System.out.println("The Parent Encodin is: " + parentEncodingA);
		System.out.println("The Description is: " + descriptionA);
		System.out.println("The Name is: " + nameA);
		System.out.println("The Escape Value is: " + escapeValueA);

		if (!idA.equals(id) || !parentEncodingA.equals(cboText) || !descriptionA.equals(description)
				|| !nameA.equals(name) || !escapeValueA.equals(escapeValue)) {
			deleted = true;
		}

		System.out.println("The record was deleted with success: " + deleted);

		assertTrue(deleted, deletionRecord);

	}
	
	//----------------------------Custom Encode Code Point-------------------------------------------
	
	public void createCustomEncodeCodePoint() {
		loginVerificationPO = new LoginVerificationPO();
		
		scrollUp(10);

		actionsMoveToElementElement(loginVerificationPO.btnConfiguration);

		clickOnCharacterEncodingMenu();

		actionsMoveToElementElement(btnAddCharacterEncoding);
		
		int rowsB = rows("//tr[contains(@id,\"PointTable\")]");
		
		scrollDown(rowsB+3);

		clickOnGoToLast(2);

		clickOnCboEncoding();

		cboText = getText(cboEncodingOption);

		clickOnCboEncodingOption();

		fillOutCodePoint(codePoint);

		fillOutUnichar(unichar);

		clickOnAddCustomEncodeCodePoint();

		refresh();

		waitExpectedElement("//tr[contains(@id,\"PointTable\")][1]//button[contains(@id,\"edit\")]");
		
		scrollDown(rowsB+3);

		clickOnGoToLast(2);

		int rowsA = rows("//tr[contains(@id,\"PointTable\")]");

		System.out.println("--------------------Creation Verification--------------------");
		boolean created = greaterThanInt(rowsA, rowsB);

		assertTrue(created, createdUnSuccesfully);

		System.out.println("Record Created: " + created);

		created = false;

		String encodingA = getText("//tr[contains(@id,\"Custom Encode Code PointTable\") ][" + rowsA + "]/td[3]/div");
		String codePointA = getText("//tr[contains(@id,\"Custom Encode Code PointTable\") ][" + rowsA + "]/td[4]/div");
		String unicharA = getText("//tr[contains(@id,\"Custom Encode Code PointTable\") ][" + rowsA + "]/td[5]/div");
		System.out.println("The Parent Encoding is: " + encodingA);
		System.out.println("The Description is: " + codePointA);
		System.out.println("The Name is: " + unicharA);

		if (encodingA.equals(cboText) && codePointA.equals(codePoint) && unicharA.equals(unichar)) {
			created = true;
		}

		assertTrue(created, createdUnSuccesfully);

		System.out.println("The record was created succesfully: " + created);
		
		id = getText("//tr[contains(@id,\"PointTable\")][" + rowsA + "]/td[2]/div");

	}

	public void editCustomEncodeCodePoint() {

		verification(2);

		boolean edited = false;

		codePoint = "0x13";
		unichar = "#";

		int rows = rows("//tr[contains(@id,\"Custom Encode Code PointTable\") ]");

		WebElement btnEdit = findElement(
				"//tr[contains(@id,\"Custom Encode Code PointTable\") ][" + rows + "]//button[contains(@id,\"edit\")]");

		click(btnEdit);

		WebElement cboEditEncoding = findElement(
				"//tr[contains(@id,\"Custom Encode Code PointTable\") ][" + rows + "]/td[3]/select");
		WebElement cboEditEncodingO = findElement("//tr[contains(@id,\"Custom Encode Code PointTable\") ][" + rows
				+ "]/td[3]/select/option[not(contains(text(),\"option\")) and text()][2]");
		WebElement txtEditCodePoint = findElement(
				"//tr[contains(@id,\"Custom Encode Code PointTable\") ][" + rows + "]/td[4]/input");
		WebElement txtEditUniChar = findElement(
				"//tr[contains(@id,\"Custom Encode Code PointTable\") ][" + rows + "]/td[5]/input");

		click(cboEditEncoding);
		cboText = getText(cboEditEncodingO);
		click(cboEditEncodingO);

		clear(txtEditCodePoint);
		sendKeys(txtEditCodePoint, codePoint);

		clear(txtEditUniChar);
		sendKeys(txtEditUniChar, unichar);
		
		System.out.println(
				"-----------------------------------------Information Selected-------------------------------");
		System.out.println("The Encoding is: " + cboText);
		System.out.println("The Code Point is: " + codePoint);
		System.out.println("The Uni Char is: " + unichar);

		click(btnEdit);

		waitExpectedElement("//tr[contains(@id,\"Custom Encode Code PointTable\") ][1]//button[contains(@id,\"edit\")]");

		refresh();

		waitExpectedElement("//tr[contains(@id,\"Custom Encode Code PointTable\") ][1]//button[contains(@id,\"edit\")]");
		
		scrollDown(rows+3);
		
		clickOnGoToLast(2);

		System.out.println(
				"-----------------------------------------Edition Verification-------------------------------");
		String encodingA = getText("//tr[contains(@id,\"Custom Encode Code PointTable\") ][" + rows + "]/td[3]/div");
		String codePointA = getText("//tr[contains(@id,\"Custom Encode Code PointTable\") ][" + rows + "]/td[4]/div");
		String unicharA = getText("//tr[contains(@id,\"Custom Encode Code PointTable\") ][" + rows + "]/td[5]/div");
		System.out.println("The Encoding is: " + encodingA);
		System.out.println("The Code Point is: " + codePointA);
		System.out.println("The Uni Char is: " + unicharA);

		if (encodingA.equals(cboText) && codePointA.equals(codePoint) && unicharA.equals(unichar)) {
			edited = true;
		}

		assertTrue(edited, createdUnSuccesfully);

		System.out.println("The record was edited succesfully: " + edited);


	}

	public void deleteCustomEncodeCodePoint() {

		verification(2);

		int rowsB = rows("//tr[contains(@id,\"Custom Encode Code PointTable\") ]");

		WebElement btnDelete = findElement(
				"//tr[contains(@id,\"Custom Encode Code PointTable\") ][" + rowsB + "]//button[contains(@id,\"delete\")]");

		click(btnDelete);

		refresh();

		waitExpectedElement("//tr[contains(@id,\"Custom Encode Code PointTable\") ][1]//button[contains(@id,\"delete\")]");
		
		scrollDown(rowsB+3);
		
		clickOnGoToLast(2);

		int rowsA = rows("//tr[contains(@id,\"Custom Encode Code PointTable\") ]");

		boolean deleted = greaterThanInt(rowsB, rowsA);

		assertTrue(deleted, deletionRecord);

		System.out.println("The record was deleted with success: " + deleted);

		deleted = false;

		String encodingA = getText("//tr[contains(@id,\"Custom Encode Code PointTable\") ][" + rowsA + "]/td[3]/div");
		String codePointA = getText("//tr[contains(@id,\"Custom Encode Code PointTable\") ][" + rowsA + "]/td[4]/div");
		String unicharA = getText("//tr[contains(@id,\"Custom Encode Code PointTable\") ][" + rowsA + "]/td[5]/div");
		System.out.println("The Encoding is: " + encodingA);
		System.out.println("The Code Point is: " + codePointA);
		System.out.println("The Uni Char is: " + unicharA);

		System.out.println("---------------------------Deletion Verification--------------------------");
		System.out.println("The Parent EncodiEncodingn is: " + encodingA);
		System.out.println("The Code Point is: " + codePointA);
		System.out.println("The Uni Char is: " + unicharA);

		if (!encodingA.equals(cboText) || !codePointA.equals(codePoint) || !unicharA.equals(unichar)) {
			deleted = true;
		}

		System.out.println("The record was deleted with success: " + deleted);

		assertTrue(deleted, deletionRecord);

	}

}
