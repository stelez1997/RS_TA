package com.rs.test.pageObjectModel.configuration.messageGateway;

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
public class MessageGatewayPO extends TestBaseSteven {

	public MessageGatewayPO() {
		PageFactory.initElements(driver, this);
	}

	// menu
	@FindBy(xpath = "//div[@class=\"headerMenuDropdown\"]/a[contains(text(),\"Message Gateway\")]")
	public WebElement messageGatewayMenu;

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

	@FindBy(xpath = "//input[@name=\"messageGatewayName\"]")
	public WebElement txtMessageGateway;

	@FindBy(xpath = "//input[@name=\"description\"]")
	public WebElement txtDescription;

	@FindBy(xpath = "//button[contains(@id,\"Message\")]")
	public WebElement btnAddMessageGateway;

	LoginVerificationPO loginVerificationPO;

	String messageGate = "ZTest";
	String description = "Test 01";
	String prefix = "123";

	// Menu

	public void clickOnMessageGatewayMenu() {
		click(messageGatewayMenu);
	}

	// Pagination

	public void clickOnGoToFirst() {
		click(btnGoToFirst);

		waitExpectedElement("//tr[@id=\"Message GatewayTableRow0\"]/td[5]/div/button[1]");
	}

	public void clickOnGoToPrevious() {
		click(btnGoToPrevious);

		waitExpectedElement("//tr[@id=\"Message GatewayTableRow0\"]/td[5]/div/button[1]");
	}

	public void clickOnGoToNext() {
		click(btnGoToNext);

		waitExpectedElement("//tr[@id=\"Message GatewayTableRow0\"]/td[5]/div/button[1]");
	}

	public void clickOnGoToLast() {
		click(btnGoToLast);

		waitExpectedElement("//tr[@id=\"Message GatewayTableRow0\"]/td[5]/div/button[1]");
	}

	// Create Methods

	public void fillOutMessageGateway(String text) {
		sendKeys(txtMessageGateway, text);
	}

	public void fillOutDescription(String text) {
		sendKeys(txtDescription, text);
	}

	public void clickOnAddMessageGateway() {
		click(btnAddMessageGateway);
	}
	

	// Modals

	// Create

	public void createMessageGateway() {

		loginVerificationPO = new LoginVerificationPO();

		actionsMoveToElementElement(loginVerificationPO.btnConfiguration);

		clickOnMessageGatewayMenu();

		actionsMoveToElementElement(btnAddMessageGateway);

		clickOnGoToLast();

		int rowsB = rows("//tr[contains(@id,\"GatewayTableRow\")]");

		fillOutMessageGateway(messageGate);

		fillOutDescription(description);

		clickOnAddMessageGateway();

		refresh();

		waitExpectedElement(btnAddMessageGateway);

		clickOnGoToLast();

		int rowsA = rows("//tr[contains(@id,\"GatewayTableRow\")]");

		boolean created = false;

		if (rowsA > rowsB) {
			created = true;
		}

		assertTrue(created, createdUnSuccesfully);

		created = false;
		
		System.out.println("--------------------------Creation Verification-----------------------");

		String messageGatewayA = getText("//tr[contains(@id,\"GatewayTableRow\")][" + rowsA + "]/td[1]/div");
		String descriptionA = getText("//tr[contains(@id,\"GatewayTableRow\")][" + rowsA + "]/td[2]/div");

		System.out.println("The Message Gateway is: " + messageGatewayA);
		System.out.println("The Description is: " + descriptionA);

		if (messageGatewayA.equals(messageGate) && descriptionA.equals(description) ) {
			created = true;
		}

		assertTrue(created, createdUnSuccesfully);

		System.out.println("The record was created succesfully: " + created);

	}

	// Verfication before editing or deleting the record

	public void verification() {
		
		clickOnGoToLast();

		int rows = rows("//tr[contains(@id,\"GatewayTableRow\")]");
		boolean creationRecord = false;

		String messageGatewayA = getText("//tr[contains(@id,\"GatewayTableRow\")][" + rows + "]/td[1]/div");
		String descriptionA = getText("//tr[contains(@id,\"GatewayTableRow\")][" + rows + "]/td[2]/div");

		if ( messageGatewayA.contains("Test") && descriptionA.contains("Test")) {
			creationRecord = true;
		}

		System.out.println("The record of creation is being displayed: " + creationRecord);

		assertTrue(creationRecord, this.creationRecord);

	}

	public void editMessageGateway() {

		loginVerificationPO = new LoginVerificationPO();

		verification();

		int rows = rows("//tr[contains(@id,\"GatewayTableRow\")]");

		boolean edited = false;

		String messageGatewayE = "ZZEdition Test";
		String descriptionE = "Test 02";

		WebElement txtEditMessageGateWay = findElement("//tr[contains(@id,\"GatewayTableRow\")][" + rows + "]/td[1]/input");
		WebElement txtEditDescription = findElement("//tr[contains(@id,\"GatewayTableRow\")][" + rows + "]/td[2]/input");
		WebElement btnEdit = findElement("//tr[contains(@id,\"GatewayTableRow\")][" + rows + "]/td[5]/div/button[1]");

		click(btnEdit);

		clear(txtEditMessageGateWay);
		sendKeys(txtEditMessageGateWay, messageGatewayE);
		
		clear(txtEditDescription);
		sendKeys(txtEditDescription, descriptionE);

		click(btnEdit);

		waitExpectedElement("//tr[contains(@id,\"GatewayTableRow\")][1]/td[5]/div/button[1]");

		refresh();

		waitExpectedElement("//tr[contains(@id,\"GatewayTableRow\")][1]/td[5]/div/button[1]");

		click(btnGoToLast);

		waitExpectedElement("//tr[contains(@id,\"GatewayTableRow\")][1]/td[5]/div/button[1]");

		String messageGatewayA = getText("//tr[contains(@id,\"GatewayTableRow\")][" + rows + "]/td[1]/div");
		String descriptionA = getText("//tr[contains(@id,\"GatewayTableRow\")][" + rows + "]/td[2]/div");
		
		System.out.println("--------------------------Edition Verification-----------------------");
		
		System.out.println("The message gateway is: " + messageGatewayA);
		System.out.println("The description is: " + descriptionA);

		if (descriptionA.equals(descriptionE) && messageGatewayA.equals(messageGatewayE)) {
			edited = true;
		}

		System.out.println("The record was edited with success: " + edited);

		assertTrue(edited, editionRecord);


	}

	public void deleteMessageGateway() {

		loginVerificationPO = new LoginVerificationPO();

		verification();

		int rows = rows("//tr[contains(@id,\"GatewayTableRow\")]");

		boolean deleted = false;

		WebElement btnDelete = findElement("//tr[contains(@id,\"GatewayTableRow\")][" + rows + "]/td[5]/div/button[2]");

		click(btnDelete);

		refresh();

		waitExpectedElement("//tr[contains(@id,\"GatewayTableRow\")][1]/td[5]/div/button[1]");

		click(btnGoToLast);

		waitExpectedElement("//tr[contains(@id,\"GatewayTableRow\")][1]/td[5]/div/button[1]");

		rows = rows("//tr[contains(@id,\"GatewayTableRow\")]");

		String messageGatewayA = getText("//tr[contains(@id,\"GatewayTableRow\")][" + rows + "]/td[1]/div");
		String descriptionA = getText("//tr[contains(@id,\"GatewayTableRow\")][" + rows + "]/td[2]/div");
		
		System.out.println("--------------------------Deletion Verification-----------------------");

		System.out.println("The message gateway is: " + messageGatewayA);
		System.out.println("The description is: " + descriptionA);

		if (!descriptionA.equals(description) && !messageGatewayA.equals(messageGate)) {
			deleted = true;
		}

		System.out.println("The record was deleted with success: " + deleted);

		assertTrue(deleted, deletionRecord);

	}
	
}
