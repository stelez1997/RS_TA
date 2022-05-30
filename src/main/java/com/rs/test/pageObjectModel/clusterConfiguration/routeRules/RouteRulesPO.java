package com.rs.test.pageObjectModel.clusterConfiguration.routeRules;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rs.test.base.TestBaseSteven;
import com.rs.test.pageObjectModel.login.LoginVerificationPO;

/**
 * @author stelez
 *
 */
public class RouteRulesPO extends TestBaseSteven {

	public RouteRulesPO() {
		PageFactory.initElements(driver, this);
	}

	// --------------------------------------- menu
	@FindBy(xpath = "//div[@class=\"headerMenuDropdown\"]/a[contains(text(),\"Route Rules\")]")
	public WebElement menuRouteRules;

	public void clickOnRoutRulesMenu() {
		click(menuRouteRules);
	}

	// --------------------------------------pagination
	
	//SMSx

	@FindBy(xpath = "//h1[text()=\"SMSx Cluster Route Rules\"]//ancestor::div[2]/div[not(contains(@style,\"display: none\"))]//button[text()=\"<<\"]")
	public WebElement btnGoToFirstSMSx;
	
	@FindBy(xpath = "//h1[text()=\"SMSx Cluster Route Rules\"]//ancestor::div[2]/div[not(contains(@style,\"display: none\"))]//button[text()=\"<\"]")
	public WebElement btnGoToPreviousSMSx;
	
	@FindBy(xpath = "//h1[text()=\"SMSx Cluster Route Rules\"]//ancestor::div[2]/div[not(contains(@style,\"display: none\"))]//button[text()=\">>\"]")
	public WebElement btnGoToLastSMSx;
	
	@FindBy(xpath = "//h1[text()=\"SMSx Cluster Route Rules\"]//ancestor::div[2]/div[not(contains(@style,\"display: none\"))]//button[text()=\"<\"]")
	public WebElement btnGoToNextSMSx;
	
	@FindBy(xpath = "//h1[text()=\"ISMS Cluster Route Rules\"]//ancestor::div[2]/div[not(contains(@style,\"display: none\"))]//button[text()=\"<<\"]")
	public WebElement btnGoToFirstISMS;
	
	@FindBy(xpath = "//h1[text()=\"ISMS Cluster Route Rules\"]//ancestor::div[2]/div[not(contains(@style,\"display: none\"))]//button[text()=\"<\"]")
	public WebElement btnGoToPreviousISMS;
	
	@FindBy(xpath = "//h1[text()=\"ISMS Cluster Route Rules\"]//ancestor::div[2]/div[not(contains(@style,\"display: none\"))]//button[text()=\">>\"]")
	public WebElement btnGoToLastISMS;
	
	@FindBy(xpath = "//h1[text()=\"ISMS Cluster Route Rules\"]//ancestor::div[2]/div[not(contains(@style,\"display: none\"))]//button[text()=\"<\"]")
	public WebElement btnGoToNextISMS;
	
	
	public void clickOnGoToFirst(int page) {
		
		if (page == 1) {
			click(btnGoToFirstSMSx);
			visibilityOfElementXpath("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"ISMS\"))][1]");
		}else {
			click(btnGoToFirstISMS);
			visibilityOfElementXpath("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"SMSx\"))][1]");
		}
		
	}

	public void clickOnGoToPrevious(int page) {
		if (page == 1) {
			click(btnGoToPreviousSMSx);
			visibilityOfElementXpath("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"ISMS\"))][1]");
		}else {
			click(btnGoToPreviousISMS);
			visibilityOfElementXpath("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"SMSx\"))][1]");
		}
	}

	public void clickOnGoToNext(int page) {
		if (page == 1) {
			click(btnGoToNextSMSx);
			visibilityOfElementXpath("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"ISMS\"))][1]");
		}else {
			click(btnGoToNextISMS);
			visibilityOfElementXpath("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"SMSx\"))][1]");
		}
	}

	public void clickOnGoToLast(int page) {
		if (page == 1) {
			click(btnGoToFirstSMSx);
			visibilityOfElementXpath("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"ISMS\"))][1]");
		}else {
			click(btnGoToFirstISMS);
			visibilityOfElementXpath("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"SMSx\"))][1]");
		}
	}
	
	//----Filters
	
	@FindBy(xpath = "//h1[text()=\"SMSx Cluster Route Rules\"]//ancestor::div[2]/div[not(contains(@style,\"display: none\"))]//div[@class=\"searchBarElement\"][1]/input")
	public WebElement txtRuleIdSMSXSearch;

	@FindBy(xpath = "//h1[text()=\"SMSx Cluster Route Rules\"]//ancestor::div[2]/div[not(contains(@style,\"display: none\"))]//div[@class=\"searchBarElement\"][2]/select")
	public WebElement cboOrigCountrySMSXSearch;
	
	@FindBy(xpath = "//h1[text()=\"SMSx Cluster Route Rules\"]//ancestor::div[2]/div[not(contains(@style,\"display: none\"))]//div[@class=\"searchBarElement\"][3]/select")
	public WebElement cboOrigPrefixSMSXSearch;
	
	@FindBy(xpath = "//h1[text()=\"SMSx Cluster Route Rules\"]//ancestor::div[2]/div[not(contains(@style,\"display: none\"))]//div[@class=\"searchBarElement\"][4]/select")
	public WebElement cboOrigCarrierServiceSMSXSearch;
	
	@FindBy(xpath = "//h1[text()=\"SMSx Cluster Route Rules\"]//ancestor::div[2]/div[not(contains(@style,\"display: none\"))]//div[@class=\"searchBarElement\"][5]/select")
	public WebElement cboDestCountrySMSXSearch;
	
	@FindBy(xpath = "//h1[text()=\"SMSx Cluster Route Rules\"]//ancestor::div[2]/div[not(contains(@style,\"display: none\"))]//div[@class=\"searchBarElement\"][6]/select")
	public WebElement cboDestPrefixSMSXSearch;
	
	@FindBy(xpath = "//h1[text()=\"SMSx Cluster Route Rules\"]//ancestor::div[2]/div[not(contains(@style,\"display: none\"))]//div[@class=\"searchBarElement\"][7]/select")
	public WebElement destCarrierServiceSMSXSearch;
	
	@FindBy(xpath = "//h1[text()=\"SMSx Cluster Route Rules\"]//ancestor::div[2]/div[not(contains(@style,\"display: none\"))]//button[@id=\"searchBtn\"]")
	public WebElement btnSearchSMSx;
	
	
	public void fillOutRuleIdSMSXSearch(String text) {
		
		sendKeys(txtRuleIdSMSXSearch, text);
		
	}
	
	
	
	public void clickOnBtnSearchSMSX() {
		click(btnSearchSMSx);
		sleep(5000);
	}
	
	
	// --------------------------------------- SMSx Cluster Route Rules

	// Create -

	@FindBy(xpath = "//tr[contains(@id,\"SMSx\")]//child::select[@id=\"addorigCountry\"]")
	public WebElement cboOrigCC;

	@FindBy(xpath = "//tr[contains(@id,\"SMSx\")]//child::select[@id=\"addorigCountry\"]/option[not(contains(text(),\"Select\"))and text()][1]")
	public WebElement cboOrigCCOption;

	@FindBy(xpath = "//tr[contains(@id,\"SMSx\")]//child::select[@id=\"addorigPrefix\"]")
	public WebElement cboOrigPrefix;

	@FindBy(xpath = "//tr[contains(@id,\"SMSx\")]//child::select[@id=\"addorigPrefix\"]/option[not(contains(text(),\"Select\"))and text()][1]")
	public WebElement cboOrigPrefixOption;

	@FindBy(xpath = "//tr[contains(@id,\"SMSx\")]//child::select[@id=\"addorigServiceName\"]")
	public WebElement cboOrigCS;

	@FindBy(xpath = "//tr[contains(@id,\"SMSx\")]//child::select[@id=\"addorigServiceName\"]/option[not(contains(text(),\"Select\"))and text()][1]")
	public WebElement cboOrigCSOption;

	@FindBy(xpath = "//tr[contains(@id,\"SMSx\")]//child::select[@id=\"adddestCountry\"]")
	public WebElement cboDestCC;

	@FindBy(xpath = "//tr[contains(@id,\"SMSx\")]//child::select[@id=\"adddestCountry\"]/option[not(contains(text(),\"Select\"))and text()][1]")
	public WebElement cboDestCCOption;

	@FindBy(xpath = "//tr[contains(@id,\"SMSx\")]//child::select[@id=\"adddestPrefix\"]")
	public WebElement cboDestPrefix;

	@FindBy(xpath = "//tr[contains(@id,\"SMSx\")]//child::select[@id=\"adddestPrefix\"]/option[not(contains(text(),\"Select\"))and text()][1]")
	public WebElement cboDestPrefixOption;

	@FindBy(xpath = "//tr[contains(@id,\"SMSx\")]//child::select[@id=\"adddestServiceName\"]")
	public WebElement cboDestCS;

	@FindBy(xpath = "//tr[contains(@id,\"SMSx\")]//child::select[@id=\"adddestServiceName\"]/option[not(contains(text(),\"Select\"))and text()][1]")
	public WebElement cboDestCSOption;

	@FindBy(xpath = "//tr[contains(@id,\"SMSx\")]//child::select[@id=\"addclusterProfileName\"]")
	public WebElement cboClusterProfile;

	@FindBy(xpath = "//tr[contains(@id,\"SMSx\")]//child::select[@id=\"addclusterProfileName\"]/option[not(contains(text(),\"Select\"))and text()][1]")
	public WebElement cboClusterProfileOption;

	@FindBy(xpath = "//button[@id=\"SMSx Cluster Route RulesAddBtn\"]")
	public WebElement btnAddSMSx;

	String cboTextOrigCC = "";
	String cboTextOrigPrefix = "";
	String cboTextOrigCS = "";
	String cboTextDestCC = "";
	String cboTextDestPrefix = "";
	String cboTextDestCS = "";
	String cboTextClusterProfile = "";

	public void selectOrigCC() {

		visibilityOfElementXpath(
				"//tr[contains(@id,\"SMSx\")]//child::select[@id=\"addorigCountry\"]/option[not(contains(text(),\"Select\"))and text()]");
		click(cboOrigCC);
		cboTextOrigCC = getText(cboOrigCCOption);
		click(cboOrigCCOption);
		System.out.println("--------------------Options Selected--------------------");
		System.out.println("Orig Cc: " + cboTextOrigCC);

	}

	public void selectOrigPrefix() {

		visibilityOfElementXpath(
				"//tr[contains(@id,\"SMSx\")]//child::select[@id=\"addorigPrefix\"]/option[not(contains(text(),\"Select\"))and text()]");
		click(cboOrigPrefix);
		cboTextOrigPrefix = getText(cboOrigPrefixOption);
		click(cboOrigPrefixOption);
		System.out.println("Orig Prefix: " + cboTextOrigPrefix);

	}

	public void selectOrigCS() {

		visibilityOfElementXpath(
				"//tr[contains(@id,\"SMSx\")]//child::select[@id=\"addorigServiceName\"]/option[not(contains(text(),\"Select\"))and text()]");
		click(cboOrigCS);
		cboTextOrigCS = getText(cboOrigCSOption);
		click(cboOrigCSOption);
		System.out.println("Orig CS: " + cboTextOrigCS);

	}

	public void selectDestCC() {

		visibilityOfElementXpath(
				"//tr[contains(@id,\"SMSx\")]//child::select[@id=\"adddestCountry\"]/option[not(contains(text(),\"Select\"))and text()]");
		click(cboDestCC);
		cboTextDestCC = getText(cboDestCCOption);
		click(cboDestCCOption);
		System.out.println("Dest CC: " + cboTextDestCC);

	}

	public void selectDestPrefix() {

		visibilityOfElementXpath(
				"//tr[contains(@id,\"SMSx\")]//child::select[@id=\"adddestPrefix\"]/option[not(contains(text(),\"Select\"))and text()]");
		click(cboDestPrefix);
		cboTextDestPrefix = getText(cboDestPrefixOption);
		click(cboDestPrefixOption);
		System.out.println("Dest Prefix: " + cboTextDestPrefix);

	}

	public void selectDestCS() {

		visibilityOfElementXpath(
				"//tr[contains(@id,\"SMSx\")]//child::select[@id=\"adddestServiceName\"]/option[not(contains(text(),\"Select\"))and text()]");
		click(cboDestCS);
		cboTextDestCS = getText(cboDestCSOption);
		click(cboDestCSOption);
		System.out.println("Dest CS: " + cboTextDestCS);

	}

	public void selectClusterProfile() {

		visibilityOfElementXpath(
				"//tr[contains(@id,\"SMSx\")]//child::select[@id=\"addclusterProfileName\"]/option[not(contains(text(),\"Select\"))and text()]");
		click(cboClusterProfile);
		cboTextClusterProfile = getText(cboClusterProfileOption);
		click(cboClusterProfileOption);
		System.out.println("Cluster Profile: " + cboTextClusterProfile);

	}

	public void clickOnAddSMSX() {

		click(btnAddSMSx);
		sleep(5000);

	}
	
	
	
	// --------------------------------------- ISMS Cluster Route Rules

		// Create -

		@FindBy(xpath = "//tr[contains(@id,\"ISMS\")]//child::select[@id=\"addorigPrefix\"]")
		public WebElement cboOrigPrefixISMS;

		@FindBy(xpath = "//tr[contains(@id,\"ISMS\")]//child::select[@id=\"addorigPrefix\"]/option[not(contains(text(),\"Select\"))and text()][1]")
		public WebElement cboOrigPrefixISMSOption;

		@FindBy(xpath = "//tr[contains(@id,\"ISMS\")]//child::select[@id=\"addorigRefOpNameDesc\"]")
		public WebElement cboOrigRefOpName;

		@FindBy(xpath = "//tr[contains(@id,\"ISMS\")]//child::select[@id=\"addorigRefOpNameDesc\"]/option[not(contains(text(),\"Select\"))and text()][1]")
		public WebElement cboOrigRefOpNameOption;

		@FindBy(xpath = "//input[@name=\"origCallingGT\"]")
		public WebElement txtCallingGt;

		@FindBy(xpath = "//tr[contains(@id,\"ISMS\")]//child::select[@id=\"adddestPrefix\"]")
		public WebElement cboDestPrefixISMS;

		@FindBy(xpath = "//tr[contains(@id,\"ISMS\")]//child::select[@id=\"adddestPrefix\"]/option[not(contains(text(),\"Select\"))and text()][1]")
		public WebElement cboDestPrefixISMSOption;

		@FindBy(xpath = "//tr[contains(@id,\"ISMS\")]//child::select[@id=\"adddestRefOpNameDesc\"]")
		public WebElement cboDestRefOpName;

		@FindBy(xpath = "//tr[contains(@id,\"ISMS\")]//child::select[@id=\"adddestRefOpNameDesc\"]/option[not(contains(text(),\"Select\"))and text()][1]")
		public WebElement cboDestRefOpNameOption;

		@FindBy(xpath = "//tr[contains(@id,\"ISMS\")]//child::select[@id=\"addclusterProfileName\"]")
		public WebElement cboClusterProfileISMS;

		@FindBy(xpath = "//tr[contains(@id,\"ISMS\")]//child::select[@id=\"addclusterProfileName\"]/option[not(contains(text(),\"Select\"))and text()][1]")
		public WebElement cboClusterProfileISMSOption;

		@FindBy(xpath = "//button[@id=\"ISMS Cluster Route RulesAddBtn\"]")
		public WebElement btnAddISMS;

		String cboTextOrigPrefixISMS = "";
		String cboTextOrigRefOpName = "";
		String cboTextDestPrefixISMS = "";
		String cboTextDestReOfName = "";
		String cboTextClusterProfileISMS = "";

		public void selectOrigPrefixISMS() {

			visibilityOfElementXpath("//tr[contains(@id,\"ISMS\")]//child::select[@id=\"addorigPrefix\"]/option[not(contains(text(),\"Select\"))and text()]");
			click(cboOrigPrefixISMS);
			cboTextOrigPrefixISMS = getText(cboOrigPrefixISMSOption);
			click(cboOrigPrefixISMSOption);
			System.out.println("--------------------Options Selected--------------------");
			System.out.println("Orig Prefix ISMS: " + cboTextOrigPrefixISMS);

		}

		public void selectOrigRefOpName() {

			visibilityOfElementXpath(
					"//tr[contains(@id,\"ISMS\")]//child::select[@id=\"addorigRefOpNameDesc\"]/option[not(contains(text(),\"Select\"))and text()]");
			click(cboOrigRefOpName);
			cboTextOrigRefOpName = getText(cboOrigRefOpNameOption);
			click(cboOrigRefOpNameOption);
			System.out.println("Orig RefOpName: " + cboTextOrigRefOpName);

		}

		public void fillOutCallingGT(String text) {
			
			sendKeys(txtCallingGt, text);
			

		}

		public void selectDestPrefixISMS() {

			visibilityOfElementXpath("//tr[contains(@id,\"ISMS\")]//child::select[@id=\"adddestPrefix\"]/option[not(contains(text(),\"Select\"))and text()]");
			click(cboDestPrefixISMS);
			cboTextDestPrefixISMS = getText(cboDestPrefixISMSOption);
			click(cboDestPrefixISMSOption);
			System.out.println("Dest Prefix: " + cboTextDestPrefixISMS);

		}

		public void selectDestRefOpName() {

			visibilityOfElementXpath(
					"//tr[contains(@id,\"ISMS\")]//child::select[@id=\"adddestRefOpNameDesc\"]/option[not(contains(text(),\"Select\"))and text()]");
			click(cboDestRefOpName);
			cboTextDestReOfName = getText(cboDestRefOpNameOption);
			click(cboDestRefOpNameOption);
			System.out.println("Dest RefOpName: " + cboTextDestReOfName);

		}


		public void selectClusterProfileISMS() {

			visibilityOfElementXpath("//tr[contains(@id,\"ISMS\")]//child::select[@id=\"addclusterProfileName\"]/option[not(contains(text(),\"Select\"))and text()]");
			click(cboClusterProfileISMS);
			cboTextClusterProfileISMS = getText(cboClusterProfileISMSOption);
			click(cboClusterProfileISMSOption);
			System.out.println("Cluster Profile: " + cboTextClusterProfileISMS);

		}

		public void clickOnAddISMS() {

			click(btnAddISMS);
			sleep(5000);

		}

	LoginVerificationPO loginVerificationPO;

	// Create - SMSx Cluster Route Rules
	String id = "";
	
	public void createSMSxClusterRouteRules() {

		loginVerificationPO = new LoginVerificationPO();

		actionsMoveToElementElement(loginVerificationPO.btnClusterConfiguration);

		clickOnRoutRulesMenu();

		actionsMoveToElementElement(btnGoToFirstSMSx);

		clickOnGoToLast(1);

		int rowsB = rows("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"ISMS\"))]");

		selectOrigCC();
		selectOrigPrefix();
		selectOrigCS();
		selectDestCC();
		selectDestPrefix();
		selectDestCS();
		selectClusterProfile();

		clickOnAddSMSX();

		refresh();

		visibilityOfElementXpath("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"ISMS\"))][1]");

		clickOnGoToLast(1);

		visibilityOfElementXpath("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"ISMS\"))][1]");

		int rowsA = rows("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"ISMS\"))]");

		boolean created = greaterThanInt(rowsA, rowsB);

		assertTrue(created, createdUnSuccesfully);
		System.out.println("Record Created: " + created);
		created = false;

		visibilityOfElementXpath(
				"//tr[contains(@id,\"SMSx\")]//child::select[@id=\"addorigCountry\"]/option[not(contains(text(),\"Select\"))and text()]");
		visibilityOfElementXpath(
				"//tr[contains(@id,\"SMSx\")]//child::select[@id=\"adddestCountry\"]/option[not(contains(text(),\"Select\"))and text()]");

		click("//tr[@id=\"SMSx Cluster Route RulesHeader\"]//div[text()=\"Rule ID\"]");

		String origCCA = getText(
				"//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"ISMS\"))][" + rowsA + "]/td[4]/div");
		String origPrefixA = getText(
				"//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"ISMS\"))][" + rowsA + "]/td[5]/div");
		String origCSA = getText(
				"//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"ISMS\"))][" + rowsA + "]/td[6]/div");
		String destCCA = getText(
				"//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"ISMS\"))][" + rowsA + "]/td[7]/div");
		String destPrefixA = getText(
				"//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"ISMS\"))][" + rowsA + "]/td[8]/div");
		String destCSA = getText(
				"//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"ISMS\"))][" + rowsA + "]/td[9]/div");
		String clusterProfileA = getText(
				"//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"ISMS\"))][" + rowsA + "]/td[10]/div");

		System.out.println("---------------------------------Creation Verification----------------------------");
		System.out.println("Orig CC: " + origCCA);
		System.out.println("Orig Prefix: " + origPrefixA);
		System.out.println("Orig CS: " + origCSA);
		System.out.println("Dest CC: " + destCCA);
		System.out.println("Dest Prefix: " + destPrefixA);
		System.out.println("Dest CS: " + destCSA);
		System.out.println("Cluster Profile: " + clusterProfileA);

		if (origCCA.equals(cboTextOrigCC) && origPrefixA.equals(cboTextOrigPrefix) && origCSA.equals(cboTextOrigCS)
				&& destCCA.equals(cboTextDestCC) && destPrefixA.equals(cboTextDestPrefix)
				&& destCSA.equals(cboTextDestCS) && clusterProfileA.equals(clusterProfileA)) {
			created = true;
		}

		id = getText("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"ISMS\"))][" + rowsA + "]/td[2]/div");
		System.out.println("Record created successfully: " + created);
		assertTrue(created, createdUnSuccesfully);

	}



	// Verfication before editing or deleting the record

	public void verificationSMSx() {

		loginVerificationPO = new LoginVerificationPO();
		
		scrollUp(10);

		actionsMoveToElementElement(loginVerificationPO.btnClusterConfiguration);

		clickOnRoutRulesMenu();

		actionsMoveToElementElement(btnGoToFirstSMSx);

		clickOnGoToLast(1);

		click("//tr[@id=\"SMSx Cluster Route RulesHeader\"]//div[text()=\"Rule ID\"]");
		click("//tr[@id=\"SMSx Cluster Route RulesHeader\"]//div[text()=\"Rule ID\"]");

		String idV = getText("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"ISMS\"))][1]/td[2]/div");
		boolean record = false;
		if (idV.equals(id)) {
			record = true;
			assertTrue(record);
			System.out.println("Creation Record Displayed");

		} else {
			assertTrue(record, creationRecord);
		}

	}

	public void editSMSxClusterRouteRules() {

		verificationSMSx();

		WebElement btnEdit = findElement(
				"//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"ISMS\"))][1]//button[contains(@id,\"edit\")]");
		click(btnEdit);

		visibilityOfElementXpath(
				"//tr[contains(@id,\"SMSx\")]//child::select[@id=\"addclusterProfileName\"]/option[not(contains(text(),\"Select\"))and text()]");
		visibilityOfElementXpath(
				"//tr[contains(@id,\"SMSx\")]//child::select[@id=\"adddestServiceName\"]/option[not(contains(text(),\"Select\"))and text()]");
		visibilityOfElementXpath(
				"//tr[contains(@id,\"SMSx\")]//child::select[@id=\"adddestCountry\"]/option[not(contains(text(),\"Select\"))and text()]");
		visibilityOfElementXpath(
				"//tr[contains(@id,\"SMSx\")]//child::select[@id=\"addorigServiceName\"]/option[not(contains(text(),\"Select\"))and text()]");
		visibilityOfElementXpath(
				"//tr[contains(@id,\"SMSx\")]//child::select[@id=\"addorigPrefix\"]/option[not(contains(text(),\"Select\"))and text()]");
		visibilityOfElementXpath(
				"//tr[contains(@id,\"SMSx\")]//child::select[@id=\"addorigCountry\"]/option[not(contains(text(),\"Select\"))and text()]");
		visibilityOfElementXpath(
				"//tr[contains(@id,\"SMSx\")]//child::select[@id=\"adddestPrefix\"]/option[not(contains(text(),\"Select\"))and text()]");

		WebElement origCC = findElement("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"ISMS\"))][1]/td[4]/select");
		WebElement origCCO = findElement("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"ISMS\"))][1]/td[4]/select//option[not(contains(text(),\"Select\"))and text()][2]");
		cboTextOrigCC = getText(origCCO);
		
		WebElement origPrefix = findElement("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"ISMS\"))][1]/td[5]/select");
		WebElement origPrefixO = findElement("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"ISMS\"))][1]/td[5]/select//option[not(contains(text(),\"Select\"))and text()][2]");
		cboTextOrigPrefix = getText(origPrefixO);
		
		WebElement origCS = findElement("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"ISMS\"))][1]/td[6]/select");
		WebElement origCSO = findElement("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"ISMS\"))][1]/td[6]/select//option[not(contains(text(),\"Select\"))and text()][2]");
		cboTextOrigCS = getText(origCSO);
		
		WebElement destCC = findElement("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"ISMS\"))][1]/td[7]/select");
		WebElement destCCO = findElement("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"ISMS\"))][1]/td[7]/select//option[not(contains(text(),\"Select\"))and text()][2]");
		cboTextDestCC = getText(destCCO);
		
		WebElement destPrefix = findElement("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"ISMS\"))][1]/td[8]/select");
		WebElement destPrefixO = findElement("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"ISMS\"))][1]/td[8]/select//option[not(contains(text(),\"Select\"))and text()][2]");
		cboTextDestPrefix = getText(destPrefixO);
		
		WebElement destCS = findElement("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"ISMS\"))][1]/td[9]/select");
		WebElement destCSO = findElement("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"ISMS\"))][1]/td[9]/select//option[not(contains(text(),\"Select\"))and text()][2]");
		cboTextDestCS = getText(destCSO);
		
		WebElement clusterProfile = findElement("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"ISMS\"))][1]/td[10]/select");
		WebElement clusterProfileO = findElement("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"ISMS\"))][1]/td[10]/select//option[not(contains(text(),\"Select\"))and text()][2]");
		cboTextClusterProfile = getText(clusterProfileO);
		
		System.out.println("---------------------------------Options Selected----------------------------");
		System.out.println("Orig CC: " + cboTextOrigCC);
		System.out.println("Orig Prefix: " + cboTextOrigPrefix);
		System.out.println("Orig CS: " + cboTextOrigCS);
		System.out.println("Dest CC: " + cboTextDestCC);
		System.out.println("Dest Prefix: " + cboTextDestPrefix);
		System.out.println("Dest CS: " + cboTextDestCS);
		System.out.println("Cluster Profile: " + cboTextClusterProfile);

		
		click(origCC);
		click(origCCO);

		click(origPrefix);
		click(origPrefixO);

		click(origCS);
		click(origCSO);

		click(destCC);
		click(destCCO);

		click(destPrefix);
		click(destPrefixO);

		click(destCS);
		click(destCSO);

		click(clusterProfile);
		click(clusterProfileO);

		click(btnEdit);
		sleep(5000);
		
		refresh();

		visibilityOfElementXpath("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"ISMS\"))][1]");

		clickOnGoToLast(1);

		visibilityOfElementXpath("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"ISMS\"))][1]");
		
		click("//tr[@id=\"SMSx Cluster Route RulesHeader\"]//div[text()=\"Rule ID\"]");
		click("//tr[@id=\"SMSx Cluster Route RulesHeader\"]//div[text()=\"Rule ID\"]");
		
		visibilityOfElementXpath(
				"//tr[contains(@id,\"SMSx\")]//child::select[@id=\"addclusterProfileName\"]/option[not(contains(text(),\"Select\"))and text()]");
		visibilityOfElementXpath(
				"//tr[contains(@id,\"SMSx\")]//child::select[@id=\"adddestServiceName\"]/option[not(contains(text(),\"Select\"))and text()]");
		visibilityOfElementXpath(
				"//tr[contains(@id,\"SMSx\")]//child::select[@id=\"adddestCountry\"]/option[not(contains(text(),\"Select\"))and text()]");
		visibilityOfElementXpath(
				"//tr[contains(@id,\"SMSx\")]//child::select[@id=\"addorigServiceName\"]/option[not(contains(text(),\"Select\"))and text()]");
		visibilityOfElementXpath(
				"//tr[contains(@id,\"SMSx\")]//child::select[@id=\"addorigPrefix\"]/option[not(contains(text(),\"Select\"))and text()]");
		visibilityOfElementXpath(
				"//tr[contains(@id,\"SMSx\")]//child::select[@id=\"addorigCountry\"]/option[not(contains(text(),\"Select\"))and text()]");
		visibilityOfElementXpath(
				"//tr[contains(@id,\"SMSx\")]//child::select[@id=\"adddestPrefix\"]/option[not(contains(text(),\"Select\"))and text()]");
		
		
		String origCCA = getText(
				"//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"ISMS\"))][1]/td[4]/div");
		String origPrefixA = getText(
				"//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"ISMS\"))][1]/td[5]/div");
		String origCSA = getText(
				"//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"ISMS\"))][1]/td[6]/div");
		String destCCA = getText(
				"//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"ISMS\"))][1]/td[7]/div");
		String destPrefixA = getText(
				"//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"ISMS\"))][1]/td[8]/div");
		String destCSA = getText(
				"//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"ISMS\"))][1]/td[9]/div");
		String clusterProfileA = getText(
				"//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"ISMS\"))][1]/td[10]/div");

		System.out.println("---------------------------------Edition Verification----------------------------");
		System.out.println("Orig CC: " + origCCA);
		System.out.println("Orig Prefix: " + origPrefixA);
		System.out.println("Orig CS: " + origCSA);
		System.out.println("Dest CC: " + destCCA);
		System.out.println("Dest Prefix: " + destPrefixA);
		System.out.println("Dest CS: " + destCSA);
		System.out.println("Cluster Profile: " + clusterProfileA);
		
		boolean edited = false;
		
		if (origCCA.equals(cboTextOrigCC) && origPrefixA.equals(cboTextOrigPrefix) && origCSA.equals(cboTextOrigCS)
				&& destCCA.equals(cboTextDestCC) && destPrefixA.equals(cboTextDestPrefix)
				&& destCSA.equals(cboTextDestCS) && clusterProfileA.equals(clusterProfileA)) {
			edited = true;
		}
		
		assertTrue(edited, editionRecord);

	}
	

	public void deleteSMSxClusterRouteRules() {

		verificationSMSx();

		WebElement btnDelete = findElement("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"ISMS\"))][1]//button[contains(@id,\"delete\")]");
		click(btnDelete);
		sleep(5000);

		refresh();
		
		visibilityOfElementXpath("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"ISMS\"))][1]");
		
		clickOnGoToLast(1);
		
		int rows = rows("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"ISMS\"))]");
		
		int j = 1;
		
		for (int i = 0; i < rows; i++) {
			
			String id = getText("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"ISMS\"))]["+j+"]/td[2]/div");
			System.out.println("Id "+j+": "+id);
			assertTrue(!id.equals(this.id), deletionRecord);
			j++;
		}
		
		
		
		
	}
	
	
	public void SMSxFilters() {

		loginVerificationPO = new LoginVerificationPO();

		actionsMoveToElementElement(loginVerificationPO.btnClusterConfiguration);

		clickOnRoutRulesMenu();

		actionsMoveToElementElement(btnGoToFirstSMSx);
		
		visibilityOfElementXpath("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"ISMS\"))]");
		
		visibilityOfElementXpath("//h1[text()=\"SMSx Cluster Route Rules\"]//ancestor::div[2]/div[not(contains(@style,\"display: none\"))]//div[@class=\"searchBarElement\"][2]//option[not(contains(text(),\"Select\"))and text()]");
		visibilityOfElementXpath("//h1[text()=\"SMSx Cluster Route Rules\"]//ancestor::div[2]/div[not(contains(@style,\"display: none\"))]//div[@class=\"searchBarElement\"][3]//option[not(contains(text(),\"Select\"))and text()]");
		visibilityOfElementXpath("//h1[text()=\"SMSx Cluster Route Rules\"]//ancestor::div[2]/div[not(contains(@style,\"display: none\"))]//div[@class=\"searchBarElement\"][4]//option[not(contains(text(),\"Select\"))and text()]");
		visibilityOfElementXpath("//h1[text()=\"SMSx Cluster Route Rules\"]//ancestor::div[2]/div[not(contains(@style,\"display: none\"))]//div[@class=\"searchBarElement\"][5]//option[not(contains(text(),\"Select\"))and text()]");
		visibilityOfElementXpath("//h1[text()=\"SMSx Cluster Route Rules\"]//ancestor::div[2]/div[not(contains(@style,\"display: none\"))]//div[@class=\"searchBarElement\"][6]//option[not(contains(text(),\"Select\"))and text()]");
		visibilityOfElementXpath("//h1[text()=\"SMSx Cluster Route Rules\"]//ancestor::div[2]/div[not(contains(@style,\"display: none\"))]//div[@class=\"searchBarElement\"][7]//option[not(contains(text(),\"Select\"))and text()]");
		
		getFilterData();
		
		ArrayList<String> data = getFilterData();
		
		//Rule ID
		/*
		fillOutRuleIdSMSXSearch(data.get(0));
		
		clickOnBtnSearchSMSX();
		
		verifyFilter("SMSX Rule Id", data.get(0), 2);
		
		clearByBackSpace(txtRuleIdSMSXSearch);
		
		clickOnBtnSearchSMSX();
		*/
		//Orig Country
		
		click(cboOrigCountrySMSXSearch);
		
		WebElement cboOrigCountrySMSXSearchO = findElement("//h1[text()=\"SMSx Cluster Route Rules\"]//ancestor::div[2]/div[not(contains(@style,\"display: none\"))]"
				+ "//div[@class=\"searchBarElement\"][2]/select/option[text()=\"" + data.get(1) + "\"]");
		
		click(cboOrigCountrySMSXSearchO);
		
		clickOnBtnSearchSMSX();
		
		verifyFilter("Orig Country", data.get(1), 4);
		
		cboOrigCountrySMSXSearchO = findElement("//h1[text()=\"SMSx Cluster Route Rules\"]//ancestor::div[2]/div[not(contains(@style,\"display: none\"))]//div[@class=\"searchBarElement\"][2]/select/option[not(text()) or contains(text(),\"Select\")]");
		
		click(cboOrigCountrySMSXSearch);
		
		click(cboOrigCountrySMSXSearchO);
		
		clickOnBtnSearchSMSX();
		
		

	}
	
	public ArrayList<String> getFilterData() {
		
		ArrayList<String> data = new ArrayList<String>();
		
		int rows = rows("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"ISMS\"))]");
		int j = 1;
		for (int i = 0; i < rows; i++) {
			
			String ruleId = getText("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"ISMS\"))]["+j+"]/td[2]/div");
			String origCC = getText("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"ISMS\"))]["+j+"]/td[4]/div");
			String origPrefix = getText("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"ISMS\"))]["+j+"]/td[5]/div");
			String origCarrierService = getText("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"ISMS\"))]["+j+"]/td[6]/div");
			String destCountry = getText("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"ISMS\"))]["+j+"]/td[7]/div");
			String destPrefix = getText("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"ISMS\"))]["+j+"]/td[8]/div");
			String destCarrierService = getText("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"ISMS\"))]["+j+"]/td[9]/div");
			
			if (!ruleId.equals("empty") && !origCC.equals("empty") && !origPrefix.equals("empty") 
					&& !origCarrierService.equals("empty") && !destCountry.equals("empty") && !destPrefix.equals("empty") 
					&& !destCarrierService.equals("empty")){
				
				data.add(ruleId);
				data.add(origCC);
				data.add(origPrefix);
				data.add(origCarrierService);
				data.add(destCountry);
				data.add(destPrefix);
				data.add(destCarrierService);
				break;
			}
			
	
			j++;
		}
		
		return data;
	}
	
	
	public void verifyFilter(String filter, String field,int td) {

		int rows = rows("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"ISMS\"))]");

		System.out.println("-----------------------------" + filter + " Verification------------------------");

		System.out.println("-----The value selected is: " + field);
		String result = "";
		int j = 1;
		
		for (int i = 0; i < rows; i++) {
			result = getText("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"ISMS\"))]["+j+"]/td["+td+"]//child::div");
			System.out.println("The results after filtering are: " + result);

			assertTrue(result.equals(field), filtersNotWorking);
	

			j++;

		}

		

	}
	

	
	// Create - ISMS Cluster Route Rules
	
	String callingGT = "1234";
	public void createISMSClusterRouteRules() {

		loginVerificationPO = new LoginVerificationPO();

		actionsMoveToElementElement(loginVerificationPO.btnClusterConfiguration);

		clickOnRoutRulesMenu();

		actionsMoveToElementElement(btnGoToFirstSMSx);

		int rowsB = rows("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"SMSx\"))]");	
		
		scrollDown(rowsB);

		clickOnGoToLast(2);

		rowsB = rows("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"SMSx\"))]");
		
		scrollDown(rowsB);
		selectOrigPrefixISMS();

		selectOrigRefOpName();

		fillOutCallingGT(callingGT);

		selectDestPrefixISMS();

		selectDestRefOpName();

		selectClusterProfileISMS();
		
		clickOnAddISMS();

		refresh();

		visibilityOfElementXpath("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"SMSx\"))][1]");
		
		scrollDown(rowsB);

		clickOnGoToLast(2);

		visibilityOfElementXpath("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"SMSx\"))][1]");

		int rowsA = rows("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"SMSx\"))]");

		boolean created = greaterThanInt(rowsA, rowsB);

		assertTrue(created, createdUnSuccesfully);
		System.out.println("Record Created: " + created);
		created = false;


		click("//tr[@id=\"ISMS Cluster Route RulesHeader\"]//div[text()=\"Rule ID\"]");
		click("//tr[@id=\"ISMS Cluster Route RulesHeader\"]//div[text()=\"Rule ID\"]");
		
		String origPrefixISMSA = getText("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"SMSx\"))][1]/td[4]/div");
		String origRefOpNameA = getText("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"SMSx\"))][1]/td[5]/div");
		String callingGTA = getText("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"SMSx\"))][1]/td[6]/div");
		String destPrefixISMSA = getText("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"SMSx\"))][1]/td[7]/div");
		String destReOfNameA = getText("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"SMSx\"))][1]/td[8]/div");
		String clusterProfileISMSA = getText("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"SMSx\"))][1]/td[9]/div");

		
		System.out.println("---------------------------------Creation Verification----------------------------");
		System.out.println("Orig Prefix: " + origPrefixISMSA);
		System.out.println("orig RefOp Name: " + origRefOpNameA);
		System.out.println("calling GT: " + callingGTA);
		System.out.println("Dest Prefix: " + destPrefixISMSA);
		System.out.println("Dest ReOf Name: " + destReOfNameA);
		System.out.println("Cluster Profile: " + clusterProfileISMSA);


		if (origPrefixISMSA.equals(cboTextOrigPrefixISMS) && origRefOpNameA.equals(cboTextOrigRefOpName) && callingGTA.equals(callingGT)
				&& destPrefixISMSA.equals(cboTextDestPrefixISMS) && destReOfNameA.equals(cboTextDestReOfName)
				&& clusterProfileISMSA.equals(cboTextClusterProfileISMS)) {
			created = true;
		}

		id = getText("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"SMSx\"))][1]/td[2]/div");
		System.out.println("Record created successfully: " + created);
		assertTrue(created, createdUnSuccesfully);
		
	}
	
	// Verfication before editing or deleting the record

		public void verificationISMS() {
			
			loginVerificationPO = new LoginVerificationPO();
			
			scrollUp(10);

			actionsMoveToElementElement(loginVerificationPO.btnClusterConfiguration);

			clickOnRoutRulesMenu();

			actionsMoveToElementElement(btnGoToFirstSMSx);
			
			visibilityOfElementXpath("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"SMSx\"))][1]");
			
			int rows = rows("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"SMSx\"))]");	
			
			scrollDown(rows);

			clickOnGoToLast(2);
			
			rows = rows("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"SMSx\"))]");
			int j = 1;
			String idV = getText("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"SMSx\"))]["+j+"]/td[2]/div");
			
			boolean record = false;
			for (int i = 0; i < rows; i++) {
				idV = getText("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"SMSx\"))]["+j+"]/td[2]/div");
				
				if (idV.equals(id)) {
					
					System.out.println("Creation Record Displayed");
					record = true;
					break;
				}
				
				
				j++;
			}
			
			sortISMSTable();
	
		
		}
	
		
		public void editISMSClusterRouteRules() {
			
			verificationISMS();
			
			int rows = rows("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"SMSx\"))]");	
			
			WebElement btnEdit = findElement("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"SMSx\"))][1]//button[contains(@id,\"edit\")]");
			click(btnEdit);

			visibilityOfElementXpath("//tr[contains(@id,\"ISMS\")]//child::select[@id=\"addorigPrefix\"]/option[not(contains(text(),\"Select\"))and text()]");
			visibilityOfElementXpath("//tr[contains(@id,\"ISMS\")]//child::select[@id=\"addorigRefOpNameDesc\"]/option[not(contains(text(),\"Select\"))and text()]");
			visibilityOfElementXpath("//tr[contains(@id,\"ISMS\")]//child::select[@id=\"adddestPrefix\"]/option[not(contains(text(),\"Select\"))and text()]");
			visibilityOfElementXpath("//tr[contains(@id,\"ISMS\")]//child::select[@id=\"adddestRefOpNameDesc\"]/option[not(contains(text(),\"Select\"))and text()]");
			visibilityOfElementXpath("//tr[contains(@id,\"ISMS\")]//child::select[@id=\"addclusterProfileName\"]/option[not(contains(text(),\"Select\"))and text()]");
			
			WebElement origPrefixE = findElement("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"SMSx\"))][1]/td[4]/select[not(contains(@style,\"display: none\"))]");
			WebElement origPreixEO = findElement("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"SMSx\"))][1]/td[4]/select[not(contains(@style,\"display: none\"))]//option[not(contains(text(),\"Select\"))and text()][2]");
			cboTextOrigPrefixISMS = getText(origPreixEO);
			
			WebElement origRefOpNameE = findElement("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"SMSx\"))][1]/td[5]/select[not(contains(@style,\"display: none\"))]");
			WebElement origRefOpNameEO = findElement("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"SMSx\"))][1]/td[5]/select[not(contains(@style,\"display: none\"))]//option[not(contains(text(),\"Select\"))and text()][2]");
			cboTextOrigRefOpName = getText(origRefOpNameEO);
			
			callingGT = "4321";
			WebElement callingGT = findElement("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"SMSx\"))][1]/td[6]/input");
			
			
			WebElement destPrefixE = findElement("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"SMSx\"))][1]/td[7]/select[not(contains(@style,\"display: none\"))]");
			WebElement destPrefixEO = findElement("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"SMSx\"))][1]/td[7]/select[not(contains(@style,\"display: none\"))]//option[not(contains(text(),\"Select\"))and text()][2]");
			cboTextDestPrefixISMS = getText(destPrefixEO);
			
			WebElement destRefOpNameE = findElement("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"SMSx\"))][1]/td[8]/select[not(contains(@style,\"display: none\"))]");
			WebElement destRefOpNameEO = findElement("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"SMSx\"))][1]/td[8]/select[not(contains(@style,\"display: none\"))]//option[not(contains(text(),\"Select\"))and text()][2]");
			cboTextDestReOfName = getText(destRefOpNameEO);
			
			WebElement clusterPrefixE = findElement("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"SMSx\"))][1]/td[9]/select[not(contains(@style,\"display: none\"))]");
			WebElement clusterPrefixEO = findElement("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"SMSx\"))][1]/td[9]/select[not(contains(@style,\"display: none\"))]//option[not(contains(text(),\"Select\"))and text()][2]");
			cboTextClusterProfileISMS = getText(clusterPrefixEO);
			
			
			System.out.println("---------------------------------Options Selected----------------------------");
			System.out.println("Orig Prefix: " + cboTextOrigPrefixISMS);
			System.out.println("Orig RefOpName: " + cboTextOrigRefOpName);
			System.out.println("Calling GT: " + this.callingGT);
			System.out.println("Dest Prefix: " + cboTextDestPrefixISMS);
			System.out.println("Dest RefOpName: " + cboTextDestReOfName);
			System.out.println("Cluster Profile: " + cboTextClusterProfileISMS);


			
			click(origPrefixE);
			click(origPreixEO);
			
			click(origRefOpNameE);
			click(origRefOpNameEO);
			
			clearByBackSpace(callingGT);
			sendKeys(callingGT, this.callingGT);

			click(destPrefixE);
			click(destPrefixEO);

			click(destRefOpNameE);
			click(destRefOpNameEO);

			click(clusterPrefixE);
			click(clusterPrefixEO);


			click(btnEdit);
			sleep(5000);
			
			refresh();

			visibilityOfElementXpath("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"SMSx\"))][1]");
			
			scrollDown(rows);
			
			
			clickOnGoToLast(2);

			sortISMSTable();

			
			String origPrefixISMSA = getText("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"SMSx\"))][1]/td[4]/div");
			String origRefOpNameA = getText("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"SMSx\"))][1]/td[5]/div");
			String callingGTA = getText("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"SMSx\"))][1]/td[6]/div");
			String destPrefixISMSA = getText("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"SMSx\"))][1]/td[7]/div");
			String destReOfNameA = getText("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"SMSx\"))][1]/td[8]/div");
			String clusterProfileISMSA = getText("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"SMSx\"))][1]/td[9]/div");

			System.out.println("---------------------------------Edition Verification----------------------------");
			System.out.println("Orig Prefix: " + origPrefixISMSA);
			System.out.println("Orig RefOpName: " + origRefOpNameA);
			System.out.println("Calling GT: " + callingGTA);
			System.out.println("Dest Prefix: " + destPrefixISMSA);
			System.out.println("Dest RefOpName: " + destReOfNameA);
			System.out.println("Cluster Profile: " + clusterProfileISMSA);
			
			
			boolean edited = false;
			
			if (origPrefixISMSA.equals(cboTextOrigPrefixISMS) && origRefOpNameA.equals(cboTextOrigRefOpName) && callingGTA.equals(this.callingGT)
					&& destPrefixISMSA.equals(cboTextDestPrefixISMS) && destReOfNameA.equals(cboTextDestReOfName)
					&& clusterProfileISMSA.equals(cboTextClusterProfileISMS)) {
				edited = true;
			}
			
			assertTrue(edited, editionRecord);

		}
		
		
		public void deleteISMSClusterRouteRules() {

			verificationISMS();
		
			WebElement btnDelete = findElement("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"SMSx\"))][1]//button[contains(@id,\"delete\")]");
			click(btnDelete);
			sleep(5000);

			refresh();
			
			visibilityOfElementXpath("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"ISMS\"))][1]");
			
			int rows = rows("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"SMSx\"))]");	
			
			scrollDown(rows);
			
			clickOnGoToLast(2);
			
			rows = rows("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"SMSx\"))]");
			
			int j = 1;
			
			for (int i = 0; i < rows; i++) {
				
				String id = getText("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"SMSx\"))]["+j+"]/td[2]/div");
				System.out.println("Id "+j+": "+id);
				assertTrue(!id.equals(this.id), deletionRecord);
				j++;
			}

	}
		
	public void sortISMSTable() {
		
		String idV = getText("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"SMSx\"))][1]/td[2]/div");
		int j = 1;
		while (!idV.equals(id) || j>3) {
			
			click("//tr[@id=\"ISMS Cluster Route RulesHeader\"]//div[text()=\"Rule ID\"]");
			idV = getText("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"SMSx\"))][1]/td[2]/div");
			j++;
			if (j >3) {
				assertTrue(false, "The record is not being displayed on that page");
			}
		}
		
	}



}
