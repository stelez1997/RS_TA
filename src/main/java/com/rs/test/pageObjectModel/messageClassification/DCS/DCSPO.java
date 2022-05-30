package com.rs.test.pageObjectModel.messageClassification.DCS;

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
public class DCSPO extends TestBaseSteven {

	public DCSPO() {
		PageFactory.initElements(driver, this);
	}

	// menu
	@FindBy(xpath = "//div[@class=\"headerMenuDropdown\"]/a[contains(text(),\"DCS\")]")
	public WebElement menuDCS;

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

	@FindBy(xpath = "//input[@name=\"dcsValue\"]")
	public WebElement txtCDS;

	@FindBy(xpath = "//tr[contains(@id, \"DCSInputRow\")]//child::select")
	public WebElement cboHubId;

	@FindBy(xpath = "//tr[contains(@id, \"DCSInputRow\")]//child::option[not(contains(text(),\"option\")) and text()][1]")
	public WebElement cboHubIdOption;

	@FindBy(xpath = "//button[@id=\"Message Classification DCSAddBtn\"]")
	public WebElement btnAddDCS;

	// Search

	@FindBy(xpath = "//button[@id=\"searchBtn\"]")
	public WebElement btnSearch;

	@FindBy(xpath = "//div[@class=\"searchBarElement\"]//child::select")
	public WebElement cboSearchHubId;
;

	LoginVerificationPO loginVerificationPO;

	// Menu

	public void clickOnDCSMenu() {
		click(menuDCS);
	}

	// Pagination

	public void clickOnGoToFirst() {
		click(btnGoToFirst);

		waitExpectedElement("//tr[contains(@id, \"DCSTableRow\")]");
	}

	public void clickOnGoToPrevious() {
		click(btnGoToPrevious);

		waitExpectedElement("//tr[contains(@id, \"DCSTableRow\")]");
	}

	public void clickOnGoToNext() {
		click(btnGoToNext);

		waitExpectedElement("//tr[contains(@id, \"DCSTableRow\")]");
	}

	public void clickOnGoToLast() {
		click(btnGoToLast);

		waitExpectedElement("//tr[contains(@id, \"DCSTableRow\")]");
	}

	// Create Methods

	public void fillOutDCS(String text) {
		sendKeys(txtCDS, text);
	}

	public void clickOnCboHudId() {
		click(cboHubId);
	}

	public void clickOnCboHudIdOption() {
		hubId = getText(cboHubIdOption);
		click(cboHubIdOption);
	}

	public void clickOnAddDCS() {
		click(btnAddDCS);
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

	String hubId = "";
	String dcs = "";

	public void createDCS() {

		loginVerificationPO = new LoginVerificationPO();

		actionsMoveToElementElement(loginVerificationPO.btnMessageClassification);

		clickOnDCSMenu();

		actionsMoveToElementElement(btnAddDCS);

		clickOnGoToLast();

		int rowsB = rows("//tr[contains(@id, \"DCSTableRow\")]");

		clickOnCboHudId();
		clickOnCboHudIdOption();

		String dcs = convertToString(random(255));
		this.dcs = dcs;

		fillOutDCS(dcs);

		clickOnAddDCS();

		System.out.println("--------------------------------Creation Verification-------------------------");
		System.out.println("The DCS is: " + this.dcs);
		System.out.println("The Hub Id is: " + hubId);

		refresh();

		clickOnGoToLast();

		int rowsA = rows("//tr[contains(@id, \"DCSTableRow\")]");
		boolean created = greaterThanInt(rowsA, rowsB);
		assertTrue(created, createdUnSuccesfully);

		System.out.println("Record created: " + created);

		created = false;

		String hubIdA = getText("//tr[contains(@id, \"DCSTableRow\")][1]/td[2]/div");
		String dcsA = getText("//tr[contains(@id, \"DCSTableRow\")][1]/td[3]/div");
		System.out.println("The DCSA is: " + dcsA);
		System.out.println("The HubA Id is: " + hubIdA);

		if (hubIdA.equals(hubId) && dcsA.equals(dcs)) {
			created = true;
			assertTrue(created);
			System.out.println(createdSuccesfully);

		} else {
			assertTrue(created);
			System.out.println(createdUnSuccesfully);
		}

	}

	// Verfication before editing or deleting the record

	public int verification() {

		loginVerificationPO = new LoginVerificationPO();

		actionsMoveToElementElement(loginVerificationPO.btnMessageClassification);

		clickOnDCSMenu();

		actionsMoveToElementElement(btnAddDCS);

		clickOnGoToLast();

		int rows = rows("//tr[contains(@id, \"DCSTableRow\")]");
		boolean record = false;
		int j = 1;
		for (int i = 0; i < rows; i++) {

			String hubId = getText("//tr[contains(@id,\"DCSTableRow\")][" + j + "]/td[2]/div");
			String dcs = getText("//tr[contains(@id,\"DCSTableRow\")][" + j + "]/td[3]/div");

			if (hubId.equals(this.hubId) && dcs.equals(this.dcs)) {
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

	public void deleteDCS() {

		int position = verification();
		int rowsB = rows("//tr[contains(@id, \"DCSTableRow\")]");

		WebElement btnDelete = findElement(
				"//tr[contains(@id, \"DCSTableRow\")][" + position + "]//child::button[contains(@id,\"delete\")]");

		click(btnDelete);
		sleep(5000);

		refresh();

		waitExpectedElement("//tr[contains(@id, \"DCSTableRow\")]");

		clickOnGoToLast();

		int rowsA = rows("//tr[contains(@id, \"DCSTableRow\")]");

		boolean deleted = greaterThanInt(rowsB, rowsA);

		assertTrue(deleted, deletionRecord);
		System.out.println("Record deleted: " + deleted);

		int j = 1;
		for (int i = 0; i < rowsA; i++) {

			String hubId = getText("//tr[contains(@id,\"DCSTableRow\")][" + j + "]/td[2]/div");
			String dcs = getText("//tr[contains(@id,\"DCSTableRow\")][" + j + "]/td[3]/div");

			if (hubId.equals(this.hubId) && dcs.equals(this.dcs)) {
				deleted = false;
				System.out.println("Creation Record Displayed at Position: " + j);
				assertTrue(deleted, deletionRecord);
				break;
			}

			j++;

		}

		System.out.println("Record deleted succesfully: " + deleted);

	}

	public void filters() {

		loginVerificationPO = new LoginVerificationPO();

		actionsMoveToElementElement(loginVerificationPO.btnMessageClassification);

		clickOnDCSMenu();

		actionsMoveToElementElement(btnAddDCS);

		clickOnGoToLast();
		
		int rows = rows("//tr[contains(@id, \"DCSTableRow\")]");
		
		String hubId = getText("//tr[contains(@id, \"DCSTableRow\")]["+rows+"]/td[2]/div");
		
		clickOnSearchCboHubId();
		
		WebElement hubIdO = findElement("//div[@class=\"searchBarElement\"][1]//child::select/option[text()=\"" + hubId + "\"]");
		
		click(hubIdO);
		
		clickOnBtnSearch();
		
		rows = rows("//tr[contains(@id, \"DCSTableRow\")]");
		System.out.println("------------------------------------------");
		System.out.println("The value searched is: "+hubId);
		System.out.println("------------------------------------------");
		int j = 1;
		for (int i = 0; i < rows; i++) {
			
			String hubIdS = getText("//tr[contains(@id,\"DCSTableRow\")][" + j + "]/td[2]/div");
			System.out.println("The result is: "+hubIdS);

			if (!hubId.equals(hubIdS)) {
				assertTrue(false, filtersNotWorking);
				break;
			}

			j++;

		}
		
		
		
		
		
		
		

	}

}
