package com.rs.test.pageObjectModel.clusterConfiguration.clusteRouteRules;

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
public class ClusterRouteRulesPO extends TestBaseSteven {

	public ClusterRouteRulesPO() {
		PageFactory.initElements(driver, this);
	}

	// --------------------------------------- menu
	@FindBy(xpath = "//div[@class=\"headerMenuDropdown\"]/a[contains(text(),\"Route Rules\")]")
	public WebElement menuRouteRules;

	public void clickOnRoutRulesMenu() {
		click(menuRouteRules);
	}

	// --------------------------------------pagination

	// SMSx

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
		} else {
			click(btnGoToFirstISMS);
			visibilityOfElementXpath("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"SMSx\"))][1]");
		}

	}

	public void clickOnGoToPrevious(int page) {
		if (page == 1) {
			click(btnGoToPreviousSMSx);
			visibilityOfElementXpath("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"ISMS\"))][1]");
		} else {
			click(btnGoToPreviousISMS);
			visibilityOfElementXpath("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"SMSx\"))][1]");
		}
	}

	public void clickOnGoToNext(int page) {
		if (page == 1) {
			click(btnGoToNextSMSx);
			visibilityOfElementXpath("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"ISMS\"))][1]");
		} else {
			click(btnGoToNextISMS);
			visibilityOfElementXpath("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"SMSx\"))][1]");
		}
	}

	public void clickOnGoToLast(int page) {
		if (page == 1) {
			click(btnGoToFirstSMSx);
			visibilityOfElementXpath("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"ISMS\"))][1]");
		} else {
			click(btnGoToFirstISMS);
			visibilityOfElementXpath("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"SMSx\"))][1]");
		}
	}

	// ----Filters SMSx

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
	public WebElement cboDestCarrierServiceSMSXSearch;

	@FindBy(xpath = "//h1[text()=\"SMSx Cluster Route Rules\"]//ancestor::div[2]/div[not(contains(@style,\"display: none\"))]//button[@id=\"searchBtn\"]")
	public WebElement btnSearchSMSx;

	public void fillOutRuleIdSMSXSearch(String text) {

		sendKeys(txtRuleIdSMSXSearch, text);

	}

	public void clickOnBtnSearchSMSX() {
		click(btnSearchSMSx);
		sleep(5000);
	}

	// ----Filters ISMS

	@FindBy(xpath = "//h1[contains(text(),\"ISMS\")]//ancestor::div[1]//div[@class=\"searchBarElement\"][1]//input")
	public WebElement txtRuleIdISMSSearch;

	@FindBy(xpath = "//h1[contains(text(),\"ISMS\")]//ancestor::div[1]//div[@class=\"searchBarElement\"][2]//input")
	public WebElement txtRuleGTISMSSearch;

	@FindBy(xpath = "//h1[contains(text(),\"ISMS\")]//ancestor::div[1]//div[@class=\"searchBarElement\"][3]//select")
	public WebElement cboOrigPrefixISMSSearch;

	@FindBy(xpath = "//h1[contains(text(),\"ISMS\")]//ancestor::div[1]//div[@class=\"searchBarElement\"][4]//select")
	public WebElement cboOrigRefOpNameISMSSearch;

	@FindBy(xpath = "//h1[contains(text(),\"ISMS\")]//ancestor::div[1]//div[@class=\"searchBarElement\"][5]//select")
	public WebElement cboDestPrefixISMSSearch;

	@FindBy(xpath = "//h1[contains(text(),\"ISMS\")]//ancestor::div[1]//div[@class=\"searchBarElement\"][6]//select")
	public WebElement cboDestRefOpNameISMSSearch;

	@FindBy(xpath = "//h1[contains(text(),\"ISMS\")]//ancestor::div[1]//button[@id=\"searchBtn\"]")
	public WebElement btnSearchISMS;

	public void fillOutRuleIdISMSSearch(String text) {

		sendKeys(txtRuleIdISMSSearch, text);

	}

	public void fillOutRuleGTISMSSearch(String text) {

		sendKeys(txtRuleGTISMSSearch, text);

	}

	public void clickOnBtnSearchISMS() {
		click(btnSearchISMS);
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

		visibilityOfElementXpath(
				"//tr[contains(@id,\"ISMS\")]//child::select[@id=\"addorigPrefix\"]/option[not(contains(text(),\"Select\"))and text()]");
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

		visibilityOfElementXpath(
				"//tr[contains(@id,\"ISMS\")]//child::select[@id=\"adddestPrefix\"]/option[not(contains(text(),\"Select\"))and text()]");
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

		visibilityOfElementXpath(
				"//tr[contains(@id,\"ISMS\")]//child::select[@id=\"addclusterProfileName\"]/option[not(contains(text(),\"Select\"))and text()]");
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

		int rowsB = rows("c");

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

		actionsMoveToElementElement(loginVerificationPO.btnClusterConfiguration);

		clickOnRoutRulesMenu();

		actionsMoveToElementElement(btnGoToFirstSMSx);

		clickOnGoToLast(1);

		orderSMSx();

		String idV = getText("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"ISMS\"))][1]/td[2]/div");

		boolean record = false;

		if (idV.equals(id)) {
			record = true;

		}
		System.out.println("Creation Record Displayed: " + record);
		assertTrue(record, creationRecord);

	}

	public void orderSMSx() {

		String smsx = getText("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"ISMS\"))][1]/td[2]/div");
		int count = 1;

		click("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"ISMS\"))]//ancestor::table//tr[contains(@id,\"RulesHeader\")]//div[text()=\"Rule ID\"]");

		waitExpectedElement(
				"//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"ISMS\"))]//ancestor::table//tr[contains(@id,\"RulesHeader\")]//div[text()=\"Rule ID\"]/*[name()=\"svg\"]");
		System.out.println("Id de la verificacion: " + smsx);

		while (!smsx.equals(id)) {

			click("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"ISMS\"))]//ancestor::table//tr[contains(@id,\"RulesHeader\")]//div[text()=\"Rule ID\"]");
			sleep(500);
			smsx = getText("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"ISMS\"))][1]/td[2]/div");
			count++;

			if (count > 3) {
				assertTrue(false, creationRecord);
			}

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

		WebElement origCC = findElement(
				"//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"ISMS\"))][1]/td[4]/select");
		WebElement origCCO = findElement(
				"//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"ISMS\"))][1]/td[4]/select//option[not(contains(text(),\"Select\"))and text()][2]");
		cboTextOrigCC = getText(origCCO);

		WebElement origPrefix = findElement(
				"//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"ISMS\"))][1]/td[5]/select");
		WebElement origPrefixO = findElement(
				"//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"ISMS\"))][1]/td[5]/select//option[not(contains(text(),\"Select\"))and text()][2]");
		cboTextOrigPrefix = getText(origPrefixO);

		WebElement origCS = findElement(
				"//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"ISMS\"))][1]/td[6]/select");
		WebElement origCSO = findElement(
				"//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"ISMS\"))][1]/td[6]/select//option[not(contains(text(),\"Select\"))and text()][2]");
		cboTextOrigCS = getText(origCSO);

		WebElement destCC = findElement(
				"//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"ISMS\"))][1]/td[7]/select");
		WebElement destCCO = findElement(
				"//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"ISMS\"))][1]/td[7]/select//option[not(contains(text(),\"Select\"))and text()][2]");
		cboTextDestCC = getText(destCCO);

		WebElement destPrefix = findElement(
				"//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"ISMS\"))][1]/td[8]/select");
		WebElement destPrefixO = findElement(
				"//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"ISMS\"))][1]/td[8]/select//option[not(contains(text(),\"Select\"))and text()][2]");
		cboTextDestPrefix = getText(destPrefixO);

		WebElement destCS = findElement(
				"//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"ISMS\"))][1]/td[9]/select");
		WebElement destCSO = findElement(
				"//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"ISMS\"))][1]/td[9]/select//option[not(contains(text(),\"Select\"))and text()][2]");
		cboTextDestCS = getText(destCSO);

		WebElement clusterProfile = findElement(
				"//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"ISMS\"))][1]/td[10]/select");
		WebElement clusterProfileO = findElement(
				"//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"ISMS\"))][1]/td[10]/select//option[not(contains(text(),\"Select\"))and text()][2]");
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

		orderSMSx();

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

		String origCCA = getText("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"ISMS\"))][1]/td[4]/div");
		String origPrefixA = getText("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"ISMS\"))][1]/td[5]/div");
		String origCSA = getText("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"ISMS\"))][1]/td[6]/div");
		String destCCA = getText("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"ISMS\"))][1]/td[7]/div");
		String destPrefixA = getText("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"ISMS\"))][1]/td[8]/div");
		String destCSA = getText("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"ISMS\"))][1]/td[9]/div");
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

		WebElement btnDelete = findElement(
				"//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"ISMS\"))][1]//button[contains(@id,\"delete\")]");

		click(btnDelete);
		sleep(5000);

		refresh();

		visibilityOfElementXpath("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"ISMS\"))][1]");

		clickOnGoToLast(1);

		int rows = rows("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"ISMS\"))]");

		int j = 1;

		for (int i = 0; i < rows; i++) {

			String id = getText(
					"//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"ISMS\"))][" + j + "]/td[2]/div");
			assertTrue(!id.equals(this.id), deletionRecord);
			j++;
		}

	}

	public void SMSxFilters() {
		

		ArrayList<String> data = getFilterDataSMSx();

		// Rule ID

		fillOutRuleIdSMSXSearch(data.get(0));

		clickOnBtnSearchSMSX();

		verifyFilterSMSx("SMSX Rule Id", data.get(0), 2);

		clearByBackSpace(txtRuleIdSMSXSearch);

		clickOnBtnSearchSMSX();

		// Orig Country

		click(cboOrigCountrySMSXSearch);

		WebElement cboOrigCountrySMSXSearchO = findElement(
				"//h1[contains(text(),\"SMSx\")]//ancestor::div[1]//div[@class=\"searchBarElement\"][2]//option[text()=\""
						+ data.get(1) + "\"]");
		click(cboOrigCountrySMSXSearchO);

		clickOnBtnSearchSMSX();

		verifyFilterSMSx("Orig Country", data.get(1), 4);

		cboOrigCountrySMSXSearchO = findElement(
				"//h1[contains(text(),\"SMSx\")]//ancestor::div[1]//div[@class=\"searchBarElement\"][2]/select/option[not(text()) or contains(text(),\"Select\")]");

		click(cboOrigCountrySMSXSearch);

		click(cboOrigCountrySMSXSearchO);

		clickOnBtnSearchSMSX();

		// Orig Prefix

		click(cboOrigPrefixSMSXSearch);

		WebElement cboOrigPrefixSMSXSearchO = findElement(
				"//h1[contains(text(),\"SMSx\")]//ancestor::div[1]//div[@class=\"searchBarElement\"][3]//option[text()=\""
						+ data.get(2) + "\"]");
		click(cboOrigPrefixSMSXSearchO);

		clickOnBtnSearchSMSX();

		verifyFilterSMSx("Orig Prefix", data.get(2), 5);

		cboOrigPrefixSMSXSearchO = findElement(
				"//h1[contains(text(),\"SMSx\")]//ancestor::div[1]//div[@class=\"searchBarElement\"][3]/select/option[not(text()) or contains(text(),\"Select\")]");

		click(cboOrigPrefixSMSXSearch);

		click(cboOrigPrefixSMSXSearchO);

		clickOnBtnSearchSMSX();

		// Orig Carrier Service

		click(cboOrigCarrierServiceSMSXSearch);

		WebElement cboOrigCarrierServiceSMSXSearchO = findElement(
				"//h1[contains(text(),\"SMSx\")]//ancestor::div[1]//div[@class=\"searchBarElement\"][4]//option[text()=\""
						+ data.get(3) + "\"]");
		click(cboOrigCarrierServiceSMSXSearchO);

		clickOnBtnSearchSMSX();

		verifyFilterSMSx("Orig Carrier Service", data.get(3), 6);

		cboOrigCarrierServiceSMSXSearchO = findElement(
				"//h1[contains(text(),\"SMSx\")]//ancestor::div[1]//div[@class=\"searchBarElement\"][4]/select/option[not(text()) or contains(text(),\"Select\")]");

		click(cboOrigCarrierServiceSMSXSearch);

		click(cboOrigCarrierServiceSMSXSearchO);

		clickOnBtnSearchSMSX();

		// Dest Country

		click(cboDestCountrySMSXSearch);

		WebElement cboDestCountrySMSXSearchO = findElement(
				"//h1[contains(text(),\"SMSx\")]//ancestor::div[1]//div[@class=\"searchBarElement\"][5]//option[text()=\""
						+ data.get(4) + "\"]");
		click(cboDestCountrySMSXSearchO);

		clickOnBtnSearchSMSX();

		verifyFilterSMSx("Dest Country", data.get(4), 7);

		cboDestCountrySMSXSearchO = findElement(
				"//h1[contains(text(),\"SMSx\")]//ancestor::div[1]//div[@class=\"searchBarElement\"][5]/select/option[not(text()) or contains(text(),\"Select\")]");

		click(cboDestCountrySMSXSearch);

		click(cboDestCountrySMSXSearchO);

		clickOnBtnSearchSMSX();

		// Dest Prefix

		click(cboDestPrefixSMSXSearch);

		WebElement cboDestPrefixSMSXSearchO = findElement(
				"//h1[contains(text(),\"SMSx\")]//ancestor::div[1]//div[@class=\"searchBarElement\"][6]//option[text()=\""
						+ data.get(5) + "\"]");
		click(cboDestPrefixSMSXSearchO);

		clickOnBtnSearchSMSX();

		verifyFilterSMSx("Dest Prefix", data.get(5), 8);

		cboDestPrefixSMSXSearchO = findElement(
				"//h1[contains(text(),\"SMSx\")]//ancestor::div[1]//div[@class=\"searchBarElement\"][6]/select/option[not(text()) or contains(text(),\"Select\")]");

		click(cboDestPrefixSMSXSearch);

		click(cboDestPrefixSMSXSearchO);

		clickOnBtnSearchSMSX();

		// Dest

		click(cboDestCarrierServiceSMSXSearch);

		WebElement cboDestCarrierServiceSMSXSearchO = findElement(
				"//h1[contains(text(),\"SMSx\")]//ancestor::div[1]//div[@class=\"searchBarElement\"][7]//option[text()=\""
						+ data.get(6) + "\"]");
		click(cboDestCarrierServiceSMSXSearchO);

		clickOnBtnSearchSMSX();

		verifyFilterSMSx("Dest Prefix", data.get(6), 9);

		cboDestCarrierServiceSMSXSearchO = findElement(
				"//h1[contains(text(),\"SMSx\")]//ancestor::div[1]//div[@class=\"searchBarElement\"][7]/select/option[not(text()) or contains(text(),\"Select\")]");

		click(cboDestPrefixSMSXSearch);

		click(cboDestCarrierServiceSMSXSearchO);

		clickOnBtnSearchSMSX();

	}

	public ArrayList<String> getFilterDataSMSx() {
		
		int rows = rows("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"ISMS\"))]");

		loginVerificationPO = new LoginVerificationPO();

		actionsMoveToElementElement(loginVerificationPO.btnClusterConfiguration);

		clickOnRoutRulesMenu();

		actionsMoveToElementElement(btnGoToFirstSMSx);

		visibilityOfElementXpath("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"ISMS\"))]");

		visibilityOfElementXpath(
				"//h1[text()=\"SMSx Cluster Route Rules\"]//ancestor::div[2]/div[not(contains(@style,\"display: none\"))]//div[@class=\"searchBarElement\"][2]//option[not(contains(text(),\"Select\"))and text()]");
		visibilityOfElementXpath(
				"//h1[text()=\"SMSx Cluster Route Rules\"]//ancestor::div[2]/div[not(contains(@style,\"display: none\"))]//div[@class=\"searchBarElement\"][3]//option[not(contains(text(),\"Select\"))and text()]");
		visibilityOfElementXpath(
				"//h1[text()=\"SMSx Cluster Route Rules\"]//ancestor::div[2]/div[not(contains(@style,\"display: none\"))]//div[@class=\"searchBarElement\"][4]//option[not(contains(text(),\"Select\"))and text()]");
		visibilityOfElementXpath(
				"//h1[text()=\"SMSx Cluster Route Rules\"]//ancestor::div[2]/div[not(contains(@style,\"display: none\"))]//div[@class=\"searchBarElement\"][5]//option[not(contains(text(),\"Select\"))and text()]");
		visibilityOfElementXpath(
				"//h1[text()=\"SMSx Cluster Route Rules\"]//ancestor::div[2]/div[not(contains(@style,\"display: none\"))]//div[@class=\"searchBarElement\"][6]//option[not(contains(text(),\"Select\"))and text()]");
		visibilityOfElementXpath(
				"//h1[text()=\"SMSx Cluster Route Rules\"]//ancestor::div[2]/div[not(contains(@style,\"display: none\"))]//div[@class=\"searchBarElement\"][7]//option[not(contains(text(),\"Select\"))and text()]");

		ArrayList<String> data = new ArrayList<String>();

		rows = rows("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"ISMS\"))]");
		int j = 1;
		for (int i = 0; i < rows; i++) {

			String ruleId = getText(
					"//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"ISMS\"))][" + j + "]/td[2]/div");
			String origCC = getText(
					"//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"ISMS\"))][" + j + "]/td[4]/div");
			String origPrefix = getText(
					"//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"ISMS\"))][" + j + "]/td[5]/div");
			String origCarrierService = getText(
					"//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"ISMS\"))][" + j + "]/td[6]/div");
			String destCountry = getText(
					"//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"ISMS\"))][" + j + "]/td[7]/div");
			String destPrefix = getText(
					"//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"ISMS\"))][" + j + "]/td[8]/div");
			String destCarrierService = getText(
					"//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"ISMS\"))][" + j + "]/td[9]/div");

			System.out.println("------------------------------------------------------");

			if (!ruleId.equals("empty") && !ruleId.equals("undefined") && !origCC.equals("empty")
					&& !origCC.equals("undefined") && !origPrefix.equals("empty") && !origPrefix.equals("undefined")
					&& !origCarrierService.equals("empty") && !origCarrierService.equals("undefined")
					&& !destCountry.equals("empty") && !destCountry.equals("undefined") && !destPrefix.equals("empty")
					&& !destPrefix.equals("undefined") && !destCarrierService.equals("empty")
					&& !destCarrierService.equals("undefined")) {

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

	public void verifyFilterSMSx(String filter, String field, int td) {

		int rows = rows("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"ISMS\"))]");

		System.out.println("-----------------------------" + filter + " Verification------------------------");

		System.out.println("-----The value selected is: " + field);
		String result = "";
		int j = 1;

		for (int i = 0; i < rows; i++) {
			result = getText("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"ISMS\"))][" + j + "]/td[" + td
					+ "]//child::div");
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

		clickOnGoToLast(2);

		int rowsB = rows("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"SMSx\"))]");

		selectOrigPrefixISMS();

		selectOrigRefOpName();

		fillOutCallingGT(callingGT);

		selectDestPrefixISMS();

		selectDestRefOpName();

		selectClusterProfileISMS();

		clickOnAddISMS();

		refresh();

		visibilityOfElementXpath("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"SMSx\"))][1]");

		clickOnGoToLast(2);

		visibilityOfElementXpath("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"SMSx\"))][1]");

		int rowsA = rows("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"SMSx\"))]");
		
		if (rowsA > 1) {
			
			int id1 = convertToInt(getText("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"SMSx\"))][1]/td[2]/div"));
			int id2 = convertToInt(getText("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"SMSx\"))][2]/td[2]/div"));
			
			do {

				click("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"SMSx\"))]//ancestor::table//tr[contains(@id,\"RulesHeader\")]//div[text()=\"Rule ID\"]");
				
				id1 = convertToInt(getText("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"SMSx\"))][1]/td[2]/div"));
				id2 = convertToInt(getText("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"SMSx\"))][2]/td[2]/div"));
				
			} while (id1 > id2);
			
			
		}

		boolean created = greaterThanInt(rowsA, rowsB);

		assertTrue(created, createdUnSuccesfully);
		System.out.println("Record Created: " + created);
		created = false;

		String origPrefixISMSA = getText(
				"//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"SMSx\"))]["+rowsA+"]/td[4]/div");
		String origRefOpNameA = getText(
				"//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"SMSx\"))]["+rowsA+"]/td[5]/div");
		String callingGTA = getText("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"SMSx\"))]["+rowsA+"]/td[6]/div");
		String destPrefixISMSA = getText(
				"//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"SMSx\"))]["+rowsA+"]/td[7]/div");
		String destReOfNameA = getText(
				"//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"SMSx\"))]["+rowsA+"]/td[8]/div");
		String clusterProfileISMSA = getText(
				"//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"SMSx\"))]["+rowsA+"]/td[9]/div");

		System.out.println("---------------------------------Creation Verification----------------------------");
		System.out.println("Orig Prefix: " + origPrefixISMSA);
		System.out.println("orig RefOp Name: " + origRefOpNameA);
		System.out.println("calling GT: " + callingGTA);
		System.out.println("Dest Prefix: " + destPrefixISMSA);
		System.out.println("Dest ReOf Name: " + destReOfNameA);
		System.out.println("Cluster Profile: " + clusterProfileISMSA);

		if (origPrefixISMSA.equals(cboTextOrigPrefixISMS) && origRefOpNameA.equals(cboTextOrigRefOpName)
				&& callingGTA.equals(callingGT) && destPrefixISMSA.equals(cboTextDestPrefixISMS)
				&& destReOfNameA.equals(cboTextDestReOfName) && clusterProfileISMSA.equals(cboTextClusterProfileISMS)) {
			created = true;
		}

		id = getText("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"SMSx\"))][1]/td[2]/div");
		System.out.println("Record created successfully: " + created);
		assertTrue(created, createdUnSuccesfully);

	}

	// Verfication before editing or deleting the record

	public void verificationISMS() {

		loginVerificationPO = new LoginVerificationPO();

		actionsMoveToElementElement(loginVerificationPO.btnClusterConfiguration);

		clickOnRoutRulesMenu();

		actionsMoveToElementElement(btnGoToFirstSMSx);

		visibilityOfElementXpath("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"SMSx\"))][1]");


		clickOnGoToLast(2);

		orderISMS();

		int rows = rows("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"SMSx\"))]");
		int j = 1;
		String idV = getText("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"SMSx\"))][1]/td[2]/div");

		boolean record = false;
		for (int i = 0; i < rows; i++) {
			idV = getText("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"SMSx\"))][1]/td[2]/div");

			if (idV.equals(id)) {

				System.out.println("Creation Record Displayed");
				record = true;
				break;
			}

			j++;
		}

	}

	public void orderISMS() {

		String isms = getText("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"SMSx\"))][1]/td[2]/div");
		int count = 1;

		while (!isms.equals(id)) {

			click("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"SMSx\"))]//ancestor::table//tr[contains(@id,\"RulesHeader\")]//div[text()=\"Rule ID\"]");
			sleep(500);
			isms = getText("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"SMSx\"))][1]/td[2]/div");
			count++;

			if (count > 3) {
				assertTrue(false, creationRecord);
			}

		}

	}

	public void editISMSClusterRouteRules() {

		verificationISMS();

		int rows = rows("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"SMSx\"))]");

		WebElement btnEdit = findElement(
				"//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"SMSx\"))][1]//button[contains(@id,\"edit\")]");

		click(btnEdit);

		visibilityOfElementXpath(
				"//tr[contains(@id,\"ISMS\")]//child::select[@id=\"addorigPrefix\"]/option[not(contains(text(),\"Select\"))and text()]");
		visibilityOfElementXpath(
				"//tr[contains(@id,\"ISMS\")]//child::select[@id=\"addorigRefOpNameDesc\"]/option[not(contains(text(),\"Select\"))and text()]");
		visibilityOfElementXpath(
				"//tr[contains(@id,\"ISMS\")]//child::select[@id=\"adddestPrefix\"]/option[not(contains(text(),\"Select\"))and text()]");
		visibilityOfElementXpath(
				"//tr[contains(@id,\"ISMS\")]//child::select[@id=\"adddestRefOpNameDesc\"]/option[not(contains(text(),\"Select\"))and text()]");
		visibilityOfElementXpath(
				"//tr[contains(@id,\"ISMS\")]//child::select[@id=\"addclusterProfileName\"]/option[not(contains(text(),\"Select\"))and text()]");

		WebElement origPrefixE = findElement(
				"//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"SMSx\"))][1]/td[4]/select[not(contains(@style,\"display: none\"))]");
		WebElement origPreixEO = findElement(
				"//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"SMSx\"))][1]/td[4]/select[not(contains(@style,\"display: none\"))]//option[not(contains(text(),\"Select\"))and text()][2]");
		cboTextOrigPrefixISMS = getText(origPreixEO);

		WebElement origRefOpNameE = findElement(
				"//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"SMSx\"))][1]/td[5]/select[not(contains(@style,\"display: none\"))]");
		WebElement origRefOpNameEO = findElement(
				"//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"SMSx\"))][1]/td[5]/select[not(contains(@style,\"display: none\"))]//option[not(contains(text(),\"Select\"))and text()][2]");
		cboTextOrigRefOpName = getText(origRefOpNameEO);

		callingGT = "4321";
		WebElement callingGT = findElement(
				"//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"SMSx\"))][1]/td[6]/input");

		WebElement destPrefixE = findElement(
				"//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"SMSx\"))][1]/td[7]/select[not(contains(@style,\"display: none\"))]");
		WebElement destPrefixEO = findElement(
				"//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"SMSx\"))][1]/td[7]/select[not(contains(@style,\"display: none\"))]//option[not(contains(text(),\"Select\"))and text()][2]");
		cboTextDestPrefixISMS = getText(destPrefixEO);

		WebElement destRefOpNameE = findElement(
				"//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"SMSx\"))][1]/td[8]/select[not(contains(@style,\"display: none\"))]");
		WebElement destRefOpNameEO = findElement(
				"//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"SMSx\"))][1]/td[8]/select[not(contains(@style,\"display: none\"))]//option[not(contains(text(),\"Select\"))and text()][2]");
		cboTextDestReOfName = getText(destRefOpNameEO);

		WebElement clusterPrefixE = findElement(
				"//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"SMSx\"))][1]/td[9]/select[not(contains(@style,\"display: none\"))]");
		WebElement clusterPrefixEO = findElement(
				"//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"SMSx\"))][1]/td[9]/select[not(contains(@style,\"display: none\"))]//option[not(contains(text(),\"Select\"))and text()][2]");
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

		clickOnGoToLast(2);

		orderISMS();

		String origPrefixISMSA = getText(
				"//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"SMSx\"))][1]/td[4]/div");
		String origRefOpNameA = getText(
				"//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"SMSx\"))][1]/td[5]/div");
		String callingGTA = getText("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"SMSx\"))][1]/td[6]/div");
		String destPrefixISMSA = getText(
				"//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"SMSx\"))][1]/td[7]/div");
		String destReOfNameA = getText(
				"//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"SMSx\"))][1]/td[8]/div");
		String clusterProfileISMSA = getText(
				"//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"SMSx\"))][1]/td[9]/div");

		System.out.println("---------------------------------Edition Verification----------------------------");
		System.out.println("Orig Prefix: " + origPrefixISMSA);
		System.out.println("Orig RefOpName: " + origRefOpNameA);
		System.out.println("Calling GT: " + callingGTA);
		System.out.println("Dest Prefix: " + destPrefixISMSA);
		System.out.println("Dest RefOpName: " + destReOfNameA);
		System.out.println("Cluster Profile: " + clusterProfileISMSA);

		boolean edited = false;

		if (origPrefixISMSA.equals(cboTextOrigPrefixISMS) && origRefOpNameA.equals(cboTextOrigRefOpName)
				&& callingGTA.equals(this.callingGT) && destPrefixISMSA.equals(cboTextDestPrefixISMS)
				&& destReOfNameA.equals(cboTextDestReOfName) && clusterProfileISMSA.equals(cboTextClusterProfileISMS)) {
			edited = true;
		}

		assertTrue(edited, editionRecord);

	}

	public void deleteISMSClusterRouteRules() {

		verificationISMS();

		WebElement btnDelete = findElement(
				"//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"SMSx\"))][1]//button[contains(@id,\"delete\")]");

		click(btnDelete);
		sleep(5000);

		refresh();

		visibilityOfElementXpath("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"ISMS\"))][1]");

		clickOnGoToLast(2);

		int rows = rows("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"SMSx\"))]");

		int j = 1;

		for (int i = 0; i < rows; i++) {

			String id = getText(
					"//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"SMSx\"))][" + j + "]/td[2]/div");
			System.out.println("Id " + j + ": " + id);
			assertTrue(!id.equals(this.id), deletionRecord);
			j++;
		}

	}

	public void ISMSFilters() {
		
		
		
		ArrayList<String> data = getFilterDataISMS();

		// Rule ID

		fillOutRuleIdISMSSearch(data.get(0));

		clickOnBtnSearchISMS();

		verifyFilterISMS("ISMS Rule Id", data.get(0), 2);

		clearByBackSpace(txtRuleIdISMSSearch);

		clickOnBtnSearchISMS();

		// Rule GT

		fillOutRuleGTISMSSearch(data.get(1));

		clickOnBtnSearchISMS();

		verifyFilterISMS("Rule GT", data.get(1), 6);

		clearByBackSpace(txtRuleGTISMSSearch);

		clickOnBtnSearchISMS();
		
		
		// Orig Prefix

		click(cboOrigPrefixISMSSearch);

		WebElement cboOrigPrefixISMSSearchO = findElement(
				"//h1[contains(text(),\"ISMS\")]//ancestor::div[1]//div[@class=\"searchBarElement\"][3]//option[text()=\""
						+ data.get(2) + "\"]");
		click(cboOrigPrefixISMSSearchO);

		clickOnBtnSearchISMS();

		verifyFilterISMS("Orig Prefix", data.get(2), 4);

		cboOrigPrefixISMSSearchO = findElement(
				"//h1[contains(text(),\"ISMS\")]//ancestor::div[1]//div[@class=\"searchBarElement\"][3]//option[not(text()) or contains(text(),\"Select\")]");

		click(cboOrigPrefixISMSSearch);

		click(cboOrigPrefixISMSSearchO);

		clickOnBtnSearchISMS();
		
		
		// Orig Ref Op Name

		click(cboOrigRefOpNameISMSSearch);

		WebElement cboOrigRefOpNameISMSSearchO = findElement(
				"//h1[contains(text(),\"ISMS\")]//ancestor::div[1]//div[@class=\"searchBarElement\"][4]//option[text()=\""
						+ data.get(3) + "\"]");
		click(cboOrigRefOpNameISMSSearchO);

		clickOnBtnSearchISMS();

		verifyFilterISMS("Orig Prefix", data.get(3), 5);

		cboOrigRefOpNameISMSSearchO = findElement(
				"//h1[contains(text(),\"ISMS\")]//ancestor::div[1]//div[@class=\"searchBarElement\"][4]//option[not(text()) or contains(text(),\"Select\")]");

		click(cboOrigRefOpNameISMSSearch);

		click(cboOrigRefOpNameISMSSearchO);

		clickOnBtnSearchISMS();
		
		// Dest Prefix

		click(cboDestPrefixISMSSearch);

		WebElement cboDestPrefixISMSSearchO = findElement(
				"//h1[contains(text(),\"ISMS\")]//ancestor::div[1]//div[@class=\"searchBarElement\"][5]//option[text()=\""
						+ data.get(4) + "\"]");
		click(cboDestPrefixISMSSearchO);

		clickOnBtnSearchISMS();

		verifyFilterISMS("Orig Prefix", data.get(4), 7);

		cboDestPrefixISMSSearchO = findElement(
				"//h1[contains(text(),\"ISMS\")]//ancestor::div[1]//div[@class=\"searchBarElement\"][5]//option[not(text()) or contains(text(),\"Select\")]");

		click(cboDestPrefixISMSSearch);

		click(cboDestPrefixISMSSearchO);

		clickOnBtnSearchISMS();
		
		
		// Dest Ref Op Name

		click(cboDestRefOpNameISMSSearch);

		WebElement cboDestRefOpNameISMSSearchO = findElement(
				"//h1[contains(text(),\"ISMS\")]//ancestor::div[1]//div[@class=\"searchBarElement\"][6]//option[text()=\""
						+ data.get(5) + "\"]");
		click(cboDestRefOpNameISMSSearchO);

		clickOnBtnSearchISMS();

		verifyFilterISMS("Dest Ref Op Name", data.get(5), 8);

		cboDestRefOpNameISMSSearchO = findElement(
				"//h1[contains(text(),\"ISMS\")]//ancestor::div[1]//div[@class=\"searchBarElement\"][6]//option[not(text()) or contains(text(),\"Select\")]");

		click(cboDestRefOpNameISMSSearch);

		click(cboDestRefOpNameISMSSearchO);

		clickOnBtnSearchISMS();

	}

	public ArrayList<String> getFilterDataISMS() {
		


		loginVerificationPO = new LoginVerificationPO();

		actionsMoveToElementElement(loginVerificationPO.btnClusterConfiguration);

		clickOnRoutRulesMenu();

		actionsMoveToElementElement(btnGoToFirstSMSx);

		int rows = rows("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"ISMS\"))]");

		visibilityOfElementXpath("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"SMSx\"))]");

		visibilityOfElementXpath(
				"//h1[contains(text(),\"ISMS\")]//ancestor::div[1]//div[@class=\"searchBarElement\"][3]//option[not(contains(text(),\"Select\"))and text()]");
		visibilityOfElementXpath(
				"//h1[contains(text(),\"ISMS\")]//ancestor::div[1]//div[@class=\"searchBarElement\"][4]//option[not(contains(text(),\"Select\"))and text()]");
		visibilityOfElementXpath(
				"//h1[contains(text(),\"ISMS\")]//ancestor::div[1]//div[@class=\"searchBarElement\"][5]//option[not(contains(text(),\"Select\"))and text()]");
		visibilityOfElementXpath(
				"//h1[contains(text(),\"ISMS\")]//ancestor::div[1]//div[@class=\"searchBarElement\"][6]//option[not(contains(text(),\"Select\"))and text()]");

		ArrayList<String> data = new ArrayList<String>();

		int j = 1;
		for (int i = 0; i < rows; i++) {

			String ruleId = getText(
					"//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"SMSx\"))][" + j + "]/td[2]/div");
			String ruleGT = getText(
					"//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"SMSx\"))][" + j + "]/td[6]/div");
			String origPrefix = getText(
					"//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"SMSx\"))][" + j + "]/td[4]/div");
			String origRefOpName = getText(
					"//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"SMSx\"))][" + j + "]/td[5]/div");
			String destPrefix = getText(
					"//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"SMSx\"))][" + j + "]/td[7]/div");
			String destRefOpName = getText(
					"//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"SMSx\"))][" + j + "]/td[8]/div");

			System.out.println("rule id: " + ruleId);
			System.out.println("rule gt: " + ruleGT);
			System.out.println("orig prefix: " + origPrefix);
			System.out.println("orig refopname: " + origRefOpName);
			System.out.println("dest prefix: " + destPrefix);
			System.out.println("dest refopname: " + destRefOpName);
			System.out.println("------------------------------------------------------");

			if (!ruleId.equals("empty") && !ruleId.equals("undefined") && !ruleGT.equals("empty")
					&& !ruleGT.equals("undefined") && !origPrefix.equals("empty") && !origPrefix.equals("undefined")
					&& !origRefOpName.equals("empty") && !origRefOpName.equals("undefined")
					&& !destPrefix.equals("empty") && !destPrefix.equals("undefined") && !destRefOpName.equals("empty")
					&& !destRefOpName.equals("undefined")) {

				data.add(ruleId);
				data.add(ruleGT);
				data.add(origPrefix);
				data.add(origRefOpName);
				data.add(destPrefix);
				data.add(destRefOpName);
				break;
			}

			j++;
		}
		System.out.println("Info selected: " + data);
		return data;
	}

	public void verifyFilterISMS(String filter, String field, int td) {

		int rows = rows("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"SMSx\"))]");

		System.out.println("-----------------------------" + filter + " Verification------------------------");

		System.out.println("-----The value selected is: " + field);
		String result = "";
		int j = 1;

		for (int i = 0; i < rows; i++) {
			result = getText("//tr[contains(@id,\"RulesTable\") and not(contains(@id,\"SMSx\"))][" + j + "]/td[" + td
					+ "]//child::div");
			System.out.println("The results after filtering are: " + result);

			assertTrue(result.equals(field), filtersNotWorking);

			j++;

		}

	}

}
