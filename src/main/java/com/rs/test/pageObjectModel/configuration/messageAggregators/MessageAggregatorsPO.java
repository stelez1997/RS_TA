package com.rs.test.pageObjectModel.configuration.messageAggregators;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.net.URL;
import java.util.GregorianCalendar;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.rs.test.base.TestBaseSteven;
import com.rs.test.pageObjectModel.login.LoginVerificationPO;

/**
 * @author stelez
 *
 */
public class MessageAggregatorsPO extends TestBaseSteven {

	public MessageAggregatorsPO() {
		PageFactory.initElements(driver, this);
	}

	// menu
	@FindBy(xpath = "//div[@class=\"headerMenuDropdown\"]/a[contains(text(),\"Message Aggregator\")]")
	public WebElement messageAggregatorsMenu;

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

	@FindBy(xpath = "//input[@name=\"aggregator\"]")
	public WebElement txtMessageAggregators;

	@FindBy(xpath = "//input[@name=\"description\"]")
	public WebElement txtDescription;

	@FindBy(xpath = "//select[contains(@id,\"addoadcLookup\")]")
	public WebElement cboOADCLookup;

	@FindBy(xpath = "//select[@name=\"addoadcLookup\"]/option[not(contains(text(),\"option\")) and text()][1]")
	public WebElement cboOADCLookupOption;

	@FindBy(xpath = "//button[contains(@id,\"Message\")]")
	public WebElement btnAddMessageAggregators;

	// Create RT Points

	@FindBy(xpath = "//input[@name=\"routePoint\"]")
	public WebElement txtRtName;

	@FindBy(xpath = "//tr[@id=\"InputRow\"]/td/input[@name=\"description\"]")
	public WebElement txtRtDescription;

	@FindBy(xpath = "//select[@name=\"adddefaultRoutePoint\"]")
	public WebElement cboRtDefault;

	@FindBy(xpath = "//select[@name=\"adddefaultRoutePoint\"]/option[not(contains(text(),\"option\")) and text()][1]")
	public WebElement cboRtDefaultOption;

	@FindBy(xpath = "//button[@id=\"AddBtn\"]")
	public WebElement btnAddRTPoints;

	@FindBy(xpath = "//button[@class=\"tablePageModalCloseButton\"]")
	public WebElement btnModal;

	// Create Peer Block

	@FindBy(xpath = "//select[@id=\"adddestAggregator.aggregator\"]")
	public WebElement cboMessageAggregator;

	@FindBy(xpath = "//select[@id=\"adddestAggregator.aggregator\"]/option[not(contains(text(),\"option\")) and text()][1]")
	public WebElement cboMessageAggregatorOption;

	@FindBy(xpath = "//select[@id=\"addblocked\"]")
	public WebElement cboBlocked;

	@FindBy(xpath = "//select[@id=\"addblocked\"]/option[not(contains(text(),\"option\")) and text()][1]")
	public WebElement cboBlockedOption;
	
	//Filters
	@FindBy(xpath = "//div[@class=\"searchBarElement\"][1]//child::input")
	public WebElement txtSearchMessageAggregator;
	
	@FindBy(xpath = "//button[@id=\"searchBtn\"]")
	public WebElement btnSearch;


	LoginVerificationPO loginVerificationPO;

	String messageAggregator = "ZTest_01";
	String description = "Test_01";
	String cboText = "";

	String rtName = "RTTest";
	String rtDescription = "RT Test";

	// Menu

	public void clickOnMessageAggregatorsMenu() {
		click(messageAggregatorsMenu);
		waitExpectedElement("//tr[contains(@id,\"Message AggregatorsTableRow\")][1]");
	}

	// Pagination

	public void clickOnGoToFirst() {
		click(btnGoToFirst);

		waitExpectedElement("//tr[contains(@id,\"Message AggregatorsTableRow\")][1]");
	}

	public void clickOnGoToPrevious() {
		click(btnGoToPrevious);

		waitExpectedElement("//tr[contains(@id,\"Message AggregatorsTableRow\")][1]");
	}

	public void clickOnGoToNext() {
		click(btnGoToNext);

		waitExpectedElement("//tr[contains(@id,\"Message AggregatorsTableRow\")][1]");
	}

	public void clickOnGoToLast() {
		click(btnGoToLast);

		waitExpectedElement("//tr[contains(@id,\"Message AggregatorsTableRow\")][1]");
	}

	// Create Methods

	public void fillOutMessageAggregator(String text) {
		sendKeys(txtMessageAggregators, text);
	}

	public void fillOutDescription(String text) {
		sendKeys(txtDescription, text);
	}

	public void clickOnCBOOADCLookup() {
		click(cboOADCLookup);
	}

	public void clickOnCBOOADCLookupOption() {
		click(cboOADCLookupOption);
	}

	public void clickOnAddMessageAggregators() {
		click(btnAddMessageAggregators);
		sleep(5000);
	}

	public void clickOnbtnModal() {
		click(btnModal);
	}

	// Create RT Points

	public void fillOutRtName(String text) {
		sendKeys(txtRtName, text);
	}

	public void fillOutRtDescription(String text) {
		sendKeys(txtRtDescription, text);
	}

	public void clickOnCboRtDefault() {

		click(cboRtDefault);
	}

	public void clickOnCboRtDefaultOption() {
		click(cboRtDefaultOption);
	}

	public void clickOnAddRtPoints() {
		click(btnAddRTPoints);
	}

	// Create Peer Blocks


	public void clickOnCboMessageAggregator() {

		click(cboMessageAggregator);
	}

	public void clickOnCboMessageAggregatorOption() {
		click(cboMessageAggregatorOption);
	}
	
	public void clickOnCboBlocked() {

		click(cboBlocked);
	}

	public void clickOnCboBlockedOption() {
		click(cboBlockedOption);
	}

	public void clickOnAddPeerBlock() {
		click(btnAddRTPoints);
	}
	
	//filters
	
	public void fillOutSearchMessageAggregator(String text) {
		sendKeys(txtSearchMessageAggregator, text);
	}
	
	public void clickOnBtnSearch() {
		click(btnSearch);
		sleep(5000);
	}
	

	// Modals

	// Create

	public void createMessageAggregators() {

		loginVerificationPO = new LoginVerificationPO();

		actionsMoveToElementElement(loginVerificationPO.btnConfiguration);

		clickOnMessageAggregatorsMenu();

		actionsMoveToElementElement(btnAddMessageAggregators);

		clickOnGoToLast();

		int rowsB = rows("//tr[contains(@id,\"Message AggregatorsTableRow\")]");

		fillOutMessageAggregator(messageAggregator);

		fillOutDescription(description);

		clickOnCBOOADCLookup();

		sleep(1000);

		clickOnCBOOADCLookupOption();

		cboText = getText(cboOADCLookupOption);

		sleep(1000);

		sendKeys(cboOADCLookup, Keys.ESCAPE);

		clickOnAddMessageAggregators();

		refresh();

		waitExpectedElement("//tr[contains(@id,\"Message AggregatorsTableRow\")][1]");

		clickOnGoToLast();

		int rowsA = rows("//tr[contains(@id,\"Message AggregatorsTableRow\")]");

		boolean created = false;

		if (rowsA > rowsB) {
			created = true;
		}
		
		System.out.println("Llego antes de la berificacion del rows");
		System.out.println("Rows B: "+rowsB);
		System.out.println("Rows A: "+rowsA);
		assertTrue(created, createdUnSuccesfully);
		System.out.println("paso antes de la berificacion del rows");

		created = false;

		System.out.println("--------------------------Creation Verification-----------------------");

		String messageAggregatorA = getText("//tr[contains(@id,\"AggregatorsTableRow\")][" + rowsA + "]/td[2]/div");
		String descriptionA = getText("//tr[contains(@id,\"AggregatorsTableRow\")][" + rowsA + "]/td[3]/div");
		String oADCLookupA = getText("//tr[contains(@id,\"AggregatorsTableRow\")][" + rowsA + "]/td[4]/div");

		System.out.println("The Message Gateway is: " + messageAggregatorA);
		System.out.println("The Description is: " + descriptionA);
		System.out.println("The OADC lookup is: " + oADCLookupA);

		if (messageAggregatorA.equals(messageAggregator) && descriptionA.equals(description)
				&& oADCLookupA.equals(cboText)) {
			created = true;
		}

		assertTrue(created, createdUnSuccesfully);
		System.out.println("The record was created succesfully: " + created);

	}

	// Verfication before editing or deleting the record

	public void verification() {
		

		loginVerificationPO = new LoginVerificationPO();

		actionsMoveToElementElement(loginVerificationPO.btnConfiguration);

		clickOnMessageAggregatorsMenu();

		actionsMoveToElementElement(btnAddMessageAggregators);
		
		waitExpectedElement("//tr[contains(@id,\"Message AggregatorsTableRow\")][1]");

		clickOnGoToLast();


		int rows = rows("//tr[contains(@id,\"AggregatorsTableRow\")]");
		boolean creationRecord = false;

		String messageAggregatorA = getText("//tr[contains(@id,\"AggregatorsTableRow\")][" + rows + "]/td[2]/div");
		String descriptionA = getText("//tr[contains(@id,\"AggregatorsTableRow\")][" + rows + "]/td[3]/div");

		if (messageAggregatorA.contains("Test") && descriptionA.contains("Test")) {
			creationRecord = true;
		}

		System.out.println("The record of creation is being displayed: " + creationRecord);

		assertTrue(creationRecord, this.creationRecord);

	}

	public void editMessageAggregator() {

		verification();

		int rows = rows("//tr[contains(@id,\"AggregatorsTableRow\")]");

		boolean edited = false;

		String messageGatewayE = "ZTest_Edition";
		String descriptionE = "Test_01";

		WebElement txtEditMessageGateWay = findElement("//tr[contains(@id,\"AggregatorsTableRow\")][" + rows + "]/td[2]/input");
		WebElement txtEditDescription = findElement("//tr[contains(@id,\"AggregatorsTableRow\")][" + rows + "]/td[3]/input");
		WebElement btnEdit = findElement("//tr[contains(@id,\"AggregatorsTableRow\")][" + rows + "]/td[11]/div/button[1]");

		click("//div[text()=\"Message Aggregator\"]");
		click("//div[text()=\"Message Aggregator\"]");
		
		click(btnEdit);
		sleep(5000);

		clear(txtEditMessageGateWay);
		sendKeys(txtEditMessageGateWay, messageGatewayE);
		
		clear(txtEditDescription);
		sendKeys(txtEditDescription, descriptionE);

		click(btnEdit);

		waitExpectedElement("//tr[contains(@id,\"Message AggregatorsTableRow\")][1]");

		refresh();

		waitExpectedElement("//tr[contains(@id,\"Message AggregatorsTableRow\")][1]");

		clickOnGoToLast();

		waitExpectedElement("//tr[contains(@id,\"Message AggregatorsTableRow\")][1]");

		String messageGatewayA = getText("//tr[contains(@id,\"AggregatorsTableRow\")][" + rows + "]/td[2]/div");
		String descriptionA = getText("//tr[contains(@id,\"AggregatorsTableRow\")][" + rows + "]/td[3]/div");


		System.out.println("--------------------------Edition Verification-----------------------");

		System.out.println("The message gateway is: " + messageGatewayA);
		System.out.println("The description is: " + descriptionA);


		if (descriptionA.equals(descriptionE) && messageGatewayA.equals(messageGatewayE)) {
			edited = true;
		}

		System.out.println("The record was edited with success: " + edited);

		assertTrue(edited, editionRecord);

	}

	public void deleteMessageAggregator() {
		
		refresh();

		verification();

		int rows = rows("//tr[contains(@id,\"AggregatorsTableRow\")]");

		boolean deleted = false;

		WebElement btnDelete = findElement(
				"//tr[contains(@id,\"AggregatorsTableRow\")][" + rows + "]/td[11]/div/button[2]");
		
		click("//div[text()=\"Message Aggregator\"]");
		click("//div[text()=\"Message Aggregator\"]");

		click(btnDelete);
		sleep(5000);

		refresh();

		waitExpectedElement("//tr[contains(@id,\"Message AggregatorsTableRow\")][1]");

		click(btnGoToLast);

		waitExpectedElement("//tr[contains(@id,\"Message AggregatorsTableRow\")][1]");

		int rowsA = rows("//tr[contains(@id,\"AggregatorsTableRow\")]");

		deleted = greaterThanInt(rows, rowsA);

		String messageAggregatorA = getText("//tr[contains(@id,\"AggregatorsTableRow\")][" + rowsA + "]/td[2]/div");
		String descriptionA = getText("//tr[contains(@id,\"AggregatorsTableRow\")][" + rowsA + "]/td[3]/div");

		System.out.println("--------------------------Deletion Verification-----------------------");

		System.out.println("The message aggregator is: " + messageAggregatorA);
		System.out.println("The description is: " + descriptionA);

		if (!descriptionA.equals(description) && !messageAggregatorA.equals(messageAggregator)) {
			deleted = true;
		}

		System.out.println("The record was deleted with success: " + deleted);

		assertTrue(deleted, deletionRecord);

	}

	// ------------------------------------RT
	// Points-----------------------------------------

	public void createRTPoints() {

		verification();

		int rows = rows("//tr[contains(@id,\"AggregatorsTableRow\")]");

		WebElement btnRTPoints = findElement(
				"//tr[contains(@id,\"AggregatorsTableRow\")][" + rows + "]/td[9]/div/button");
		
		click("//div[text()=\"Message Aggregator\"]");
		click("//div[text()=\"Message Aggregator\"]");
		
		click(btnRTPoints);

		waitExpectedElement(btnAddRTPoints);

		int rtRows = rows("//tr[contains(@id,\"TableRow\") and not(contains(@id,\"Message\"))]");

		fillOutRtName(rtName);
		fillOutRtDescription(rtDescription);
		clickOnCboRtDefault();

		cboText = getText(cboRtDefaultOption);
		clickOnCboRtDefaultOption();

		clickOnAddRtPoints();
		sleep(5000);

		refresh();

		waitExpectedElement("//tr[contains(@id,\"Message AggregatorsTableRow\")][1]");

		clickOnGoToLast();

		waitExpectedElement("//tr[contains(@id,\"Message AggregatorsTableRow\")][1]");

		btnRTPoints = findElement("//tr[contains(@id,\"AggregatorsTableRow\")][" + rows + "]/td[9]/div/button");

		click("//div[text()=\"Message Aggregator\"]");
		click("//div[text()=\"Message Aggregator\"]");
		
		click(btnRTPoints);

		waitExpectedElement(btnAddRTPoints);

		int rtRowsA = rows("//tr[contains(@id,\"TableRow\") and not(contains(@id,\"Message\"))]");

		boolean created = greaterThanInt(rtRowsA, rtRows);

		System.out.println("Record created: " + created);

		assertTrue(created, createdUnSuccesfully);

		created = false;

		String rtNameA = getText("//tr[contains(@id,\"TableRow\") and not(contains(@id,\"Message\"))][" + rtRowsA + "]/td[2]/div");
		String rtDescriptionA = getText("//tr[contains(@id,\"TableRow\") and not(contains(@id,\"Message\"))][" + rtRowsA + "]/td[3]/div");

		if (rtNameA.equals(rtName) && rtDescriptionA.equals(rtDescription)) {
			created = true;
		}

		System.out.println("Record created successfully: " + created);

		assertTrue(created, createdUnSuccesfully);

	}

	public void editRTPoints() {

		int rtRows = rows("//tr[contains(@id,\"TableRow\") and not(contains(@id,\"Message\"))]");

		WebElement btnEdit = findElement(
				"//tr[contains(@id,\"TableRow\") and not(contains(@id,\"Message\"))][" + rtRows + "]/td[5]//child::button[contains(@id,\"edit\")]");

		click(btnEdit);

		WebElement txtEditName = findElement("//tr[contains(@id,\"TableRow\") and not(contains(@id,\"Message\"))][" + rtRows + "]/td[2]/input");
		WebElement txtEditDescription = findElement(
				"//tr[contains(@id,\"TableRow\") and not(contains(@id,\"Message\"))][" + rtRows + "]/td[3]/input");

		String editName = "EditionTest";
		String editDescription = "Editon Test";

		clearByBackSpace(txtEditName);
		clearByBackSpace(txtEditDescription);

		sendKeys(txtEditName, editName);
		sendKeys(txtEditDescription, editDescription);

		click(btnEdit);
		sleep(5000);

		refresh();
		
		waitExpectedElement("//tr[contains(@id,\"Message AggregatorsTableRow\")][1]");

		clickOnGoToLast();

		int rows = rows("//tr[contains(@id,\"AggregatorsTableRow\")]");

		WebElement btnRTPoints = findElement(
				"//tr[contains(@id,\"AggregatorsTableRow\")][" + rows + "]/td[9]/div/button");
		
		click("//div[text()=\"Message Aggregator\"]");
		click("//div[text()=\"Message Aggregator\"]");

		click(btnRTPoints);

		waitExpectedElement(btnAddRTPoints);

		String editNameA = getText("//tr[contains(@id,\"TableRow\") and not(contains(@id,\"Message\"))][" + rtRows + "]/td[2]/div");
		String editDescriptionA = getText("//tr[contains(@id,\"TableRow\") and not(contains(@id,\"Message\"))][" + rtRows + "]/td[3]/div");

		boolean edited = false;

		if (editNameA.equals(editName) && editDescriptionA.equals(editDescription)) {
			edited = true;
		}

		System.out.println("Edited successfully: " + edited);

		assertTrue(edited, editionRecord);

	}

	public void deleteRTPoints() {

		int rtRows = rows("//tr[contains(@id,\"TableRow\") and not(contains(@id,\"Message\"))]");

		WebElement btnDelete = findElement(
				"//tr[contains(@id,\"TableRow\") and not(contains(@id,\"Message\"))]["+rtRows+"]/td[5]//child::button[contains(@id,\"delete\")]");

		click(btnDelete);
		sleep(5000);

		refresh();

		clickOnGoToLast();

		int rows = rows("//tr[contains(@id,\"AggregatorsTableRow\")]");
		


		WebElement btnRTPoints = findElement(
				"//tr[contains(@id,\"AggregatorsTableRow\")][" + rows + "]/td[9]/div/button");

		click("//div[text()=\"Message Aggregator\"]");
		click("//div[text()=\"Message Aggregator\"]");
		
		click(btnRTPoints);

		waitExpectedElement(btnAddRTPoints);

		int rtRowsA = rows("//tr[contains(@id,\"TableRow\") and not(contains(@id,\"Message\"))]");

		boolean deleted = greaterThanInt(rtRows, rtRowsA);

		clickOnbtnModal();

		System.out.println("Record deleted successfully: " + deleted);

		assertTrue(deleted, deletionRecord);

	}

	// -------------------------------------Peer
	// Blocks---------------------------------------

	public void createPeerBlock() {
		
		verification();

		int rows = rows("//tr[contains(@id,\"AggregatorsTableRow\")]");

		WebElement btnPeerBlock = findElement("//tr[contains(@id,\"AggregatorsTableRow\")]["+rows+"]//child::button[contains(@id,\"blockedDestinations\")]");
		
		click("//div[text()=\"Message Aggregator\"]");
		click("//div[text()=\"Message Aggregator\"]");
		click(btnPeerBlock);

		waitExpectedElement(btnAddRTPoints);

		int pbRows = rows("//tr[contains(@id,\"TableRow\") and not(contains(@id,\"Message\"))]");

		clickOnCboMessageAggregator();
		String messageAggregatorText = getText(cboMessageAggregatorOption);
		clickOnCboMessageAggregatorOption();
		
		clickOnCboBlocked();
		String blockedText = getText(cboBlockedOption);
		clickOnCboBlockedOption();

		clickOnAddRtPoints();
		sleep(5000);

		refresh();

		waitExpectedElement("//tr[contains(@id,\"Message AggregatorsTableRow\")][1]");

		clickOnGoToLast();

		waitExpectedElement("//tr[contains(@id,\"Message AggregatorsTableRow\")][1]");

		btnPeerBlock = findElement("//tr[contains(@id,\"AggregatorsTableRow\")]["+rows+"]//child::button[contains(@id,\"blockedDestinations\")]");
		click("//div[text()=\"Message Aggregator\"]");
		click("//div[text()=\"Message Aggregator\"]");
		click(btnPeerBlock);

		waitExpectedElement(btnAddRTPoints);

		int pbRowsA = rows("//tr[contains(@id,\"TableRow\") and not(contains(@id,\"Message\"))]");

		boolean created = greaterThanInt(pbRowsA, pbRows);

		System.out.println("Record created: " + created);

		assertTrue(created, createdUnSuccesfully);

		created = false;
		
		
		String messageAggregatorA = getText("//tr[contains(@id,\"TableRow\") and not(contains(@id,\"Message\"))][" + pbRowsA + "]/td[2]/div");
		String blockedA = getText("//tr[contains(@id,\"TableRow\") and not(contains(@id,\"Message\"))][" + pbRowsA + "]/td[3]/div");
		System.out.println("------------------------------------------");
		System.out.println("Message Aggregator: "+messageAggregatorA);
		System.out.println("Blocked: "+blockedA);
		
		if (messageAggregatorA.equals(messageAggregatorText) && blockedA.equals(blockedText)) {
			created = true;
		}

		System.out.println("Record created successfully: " + created);

		assertTrue(created, createdUnSuccesfully);

	}

	public void editPeerBlock() {

		int rtRows = rows("//tr[contains(@id,\"TableRow\") and not(contains(@id,\"Message\"))]");

		WebElement btnEdit = findElement("//tr[contains(@id,\"TableRow\") and not(contains(@id,\"Message\"))][" + rtRows + "]//child::button[contains(@id,\"edit\")]");

		click(btnEdit);

		WebElement cboEditBlocked = findElement("//tr[contains(@id,\"TableRow\") and not(contains(@id,\"Message\"))][" + rtRows + "]/td[3]/select");
		WebElement cboEditBlockedOption = findElement("//tr[contains(@id,\"TableRow\") and not(contains(@id,\"Message\"))]["+rtRows+"]/td[3]/select/option[3]");
		String editBlockedText = getText(cboEditBlockedOption);
		click(cboEditBlocked);
		click(cboEditBlockedOption);
		
		sendKeys(cboEditBlocked, Keys.ESCAPE);
		
		click(btnEdit);
		sleep(5000);

		refresh();

		clickOnGoToLast();
		
		int rows = rows("//tr[contains(@id,\"AggregatorsTableRow\")]");

		WebElement btnPeerBlock = findElement("//tr[contains(@id,\"AggregatorsTableRow\")][" + rows + "]//child::button[contains(@id,\"blockedDestinations\")]");
		
		click("//div[text()=\"Message Aggregator\"]");
		click("//div[text()=\"Message Aggregator\"]");
		
		click(btnPeerBlock);

		waitExpectedElement(btnAddRTPoints);

		String editBlockedA = getText("//tr[contains(@id,\"TableRow\") and not(contains(@id,\"Message\"))][" + rtRows + "]/td[3]/div");

		boolean edited = false;

		if (editBlockedA.equals(editBlockedText)) {
			edited = true;
		}

		System.out.println("Edited successfully: " + edited);
		
		assertTrue(edited, editionRecord);

	}
	
	public void filters() {

		loginVerificationPO = new LoginVerificationPO();

		actionsMoveToElementElement(loginVerificationPO.btnConfiguration);

		clickOnMessageAggregatorsMenu();

		actionsMoveToElementElement(btnGoToFirst);

		clickOnGoToLast();
		
		int rows = rows("//tr[contains(@id,\"AggregatorsTableRow\")]");
		
		String messageAggregator = getText("//tr[contains(@id,\"AggregatorsTableRow\")]["+rows+"]/td[2]//child::div");
		System.out.println("----------------Message Aggregator: "+messageAggregator);
		
		// Carrier Service
		
		fillOutSearchMessageAggregator(messageAggregator);
		
		clickOnBtnSearch();
		
		verifyFilter("Message Aggregator", messageAggregator, 2);
		
		refresh();
		
		waitExpectedElement("//tr[contains(@id,\"Message AggregatorsTableRow\")][1]");
		
		
		
	
		
		

	}
	
	
	public void verifyFilter(String filter, String field,int td) {

		int rows = rows("//tr[contains(@id,\"AggregatorsTableRow\")]");

		System.out.println("-----------------------------" + filter + " Verification------------------------");

		System.out.println("-----The value selected is: " + field);
		String result = "";
		int j = 1;
		
		

		for (int i = 0; i < rows; i++) {
			result = getText("//tr[contains(@id,\"AggregatorsTableRow\")]["+j+"]/td["+td+"]//child::div");
			System.out.println("The results after filtering are: " + result);

			assertTrue(result.equals(field), filtersNotWorking);
	

			j++;

		}


	}

}
