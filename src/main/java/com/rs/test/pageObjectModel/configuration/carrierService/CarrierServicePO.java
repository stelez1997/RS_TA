package com.rs.test.pageObjectModel.configuration.carrierService;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.net.URL;
import java.rmi.server.Skeleton;
import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.rs.test.base.TestBaseSteven;
import com.rs.test.pageObjectModel.login.LoginVerificationPO;

import bsh.This;

/**
 * @author stelez
 *
 */
public class CarrierServicePO extends TestBaseSteven {

	public CarrierServicePO() {
		PageFactory.initElements(driver, this);
	}

	// menu
	@FindBy(xpath = "//div[@class=\"headerMenuDropdown\"]/a[contains(text(),\"Carrier Service\")]")
	public WebElement menuCarrierService;

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

	@FindBy(xpath = "//input[@name=\"service\"]")
	public WebElement txtService;

	@FindBy(xpath = "//select[@name=\"addcountryCode\"]")
	public WebElement cboCountryCode;

	@FindBy(xpath = "//select[@name=\"addcountryCode\"]/option[not(contains(text(),\"Select\")) and text()][1]")
	public WebElement cboCountryCodeOption;

	@FindBy(xpath = "//select[@name=\"addoadcLookup\"]")
	public WebElement cboOADCLookup;

	@FindBy(xpath = "//select[@name=\"addoadcLookup\"]/option[not(contains(text(),\"Select\")) and text()][1]")
	public WebElement cboOADCLookupOption;

	@FindBy(xpath = "//select[@name=\"addmessageGateway\"]")
	public WebElement cboGateway;

	@FindBy(xpath = "//select[@name=\"addmessageGateway\"]/option[not(contains(text(),\"Select\")) and text()][1]")
	public WebElement cboGatewayOption;

	@FindBy(xpath = "//select[@name=\"addmoActionTemplate\"]")
	public WebElement cboMoAction;

	@FindBy(xpath = "//select[@name=\"addmoActionTemplate\"]/option[not(contains(text(),\"Select\")) and text()][1]")
	public WebElement cboMoActionOption;

	@FindBy(xpath = "//select[@name=\"addmtActionTemplate\"]")
	public WebElement cboMtAction;

	@FindBy(xpath = "//select[@name=\"addmtActionTemplate\"]/option[not(contains(text(),\"Select\")) and text()][1]")
	public WebElement cboMtActionOption;

	@FindBy(xpath = "//select[@name=\"addcharMappingEnabled\"]")
	public WebElement cboCharMapping;

	@FindBy(xpath = "//select[@name=\"addcharMappingEnabled\"]/option[not(contains(text(),\"Select\")) and text()][1]")
	public WebElement cboCharMappingOption;

	@FindBy(xpath = "//select[@name=\"addcountryCode\"]/option[not(contains(text(),\"Select\")) and text()][2]")
	public WebElement cboCountryCodeOptionE;

	@FindBy(xpath = "//select[@name=\"addoadcLookup\"]/option[not(contains(text(),\"Select\")) and text()][2]")
	public WebElement cboOADCLookupOptionE;

	@FindBy(xpath = "//select[@name=\"addmessageGateway\"]/option[not(contains(text(),\"Select\")) and text()][2]")
	public WebElement cboGatewayOptionE;

	@FindBy(xpath = "//select[@name=\"addmoActionTemplate\"]/option[not(contains(text(),\"Select\")) and text()][2]")
	public WebElement cboMoActionOptionE;

	@FindBy(xpath = "//select[@name=\"addmtActionTemplate\"]/option[not(contains(text(),\"Select\")) and text()][2]")
	public WebElement cboMtActionOptionE;

	@FindBy(xpath = "//select[@name=\"addcharMappingEnabled\"]/option[not(contains(text(),\"Select\")) and text()][2]")
	public WebElement cboCharMappingOptionE;

	@FindBy(xpath = "//button[contains(@id,\"ServiceAddBtn\")]")
	public WebElement btnAddCarrierService;

	// Search

	@FindBy(xpath = "//button[contains(@id,\"searchBtn\")]")
	public WebElement btnSearch;

	@FindBy(xpath = "//div[@class=\"searchBarElement\"][1]//child::input")
	public WebElement txtSearchCarrierService;

	@FindBy(xpath = "//div[@class=\"searchBarElement\"][2]//child::select")
	public WebElement cboSearchCountry;

	@FindBy(xpath = "//div[@class=\"searchBarElement\"][3]//child::input")
	public WebElement txtSearchLogAgent;

	// Modals

	// Route Points

	@FindBy(xpath = "//button[@id=\"AddBtn\"]")
	public WebElement btnAddRoutePoint;

	@FindBy(xpath = "//input[@name=\"routePoint\"]")
	public WebElement txtRoutePointName;

	@FindBy(xpath = "//input[@name=\"description\"]")
	public WebElement txtRoutePointDescription;

	// Log Agent

	@FindBy(xpath = "//select[@id=\"addlogAgent\"]")
	public WebElement cboNameLogAgent;

	@FindBy(xpath = "//select[@id=\"addlogAgent\"]//option[text()][1]")
	public WebElement cboNameLogAgentO;

	@FindBy(xpath = "//button[@id=\"AddBtn\"]")
	public WebElement btnAddLogAgent;

	// MO Char

	@FindBy(xpath = "//select[@id=\"adddescription\"]")
	public WebElement cboDecodingType;

	@FindBy(xpath = "//select[@id=\"adddescription\"]/option[text()][1]")
	public WebElement cboDecodingTypeO;

	@FindBy(xpath = "//input[@name=\"dcs\"]")
	public WebElement txtDecodeDCS;

	@FindBy(xpath = "//select[@id=\"addunpack7bit\"]")
	public WebElement cboUnpack7Bit;

	@FindBy(xpath = "//select[@id=\"addunpack7bit\"]/option[text()][1]")
	public WebElement cboUnpack7BitO;

	@FindBy(xpath = "//button[@id=\"AddBtn\"]")
	public WebElement btnAddMOChar;

	// MT Char

	@FindBy(xpath = "//select[@id=\"adddescription\"]")
	public WebElement cboEncodingType;

	@FindBy(xpath = "//select[@id=\"adddescription\"]/option[text()][1]")
	public WebElement cboEncodingTypeO;

	@FindBy(xpath = "//input[@name=\"dcs\"]")
	public WebElement txtDCS;

	@FindBy(xpath = "//input[@name=\"toDcs\"]")
	public WebElement txtToDCS;

	@FindBy(xpath = "//select[@id=\"addpack7bit\"]")
	public WebElement cboPack7Bit;

	@FindBy(xpath = "//select[@id=\"addpack7bit\"]/option[text()][1]")
	public WebElement cboPack7BitO;

	@FindBy(xpath = "//button[@id=\"AddBtn\"]")
	public WebElement btnAddMTChar;

	// MSG Props

	@FindBy(xpath = "//select[@id=\"adddirection\"]")
	public WebElement cboDirection;

	@FindBy(xpath = "//select[@id=\"adddirection\"]/option[text()][1]")
	public WebElement cboDirectionO;

	@FindBy(xpath = "//input[@name=\"dcs\"]")
	public WebElement txtMSGDSC;

	@FindBy(xpath = "//input[@name=\"esm\"]")
	public WebElement txtESM;

	@FindBy(xpath = "//select[@id=\"addbin\"]")
	public WebElement cboBin;

	@FindBy(xpath = "//select[@id=\"addbin\"]/option[text()][1]")
	public WebElement cboBinO;

	@FindBy(xpath = "//select[@id=\"addudh\"]")
	public WebElement cboUDH;

	@FindBy(xpath = "//select[@id=\"addudh\"]/option[text()][1]")
	public WebElement cboUDHO;

	@FindBy(xpath = "//select[@id=\"addrouteRuleType\"]")
	public WebElement cboRuleType;

	@FindBy(xpath = "//select[@id=\"addrouteRuleType\"]/option[text()][1]")
	public WebElement cboRuleTypeO;

	@FindBy(xpath = "//button[@id=\"AddBtn\"]")
	public WebElement btnAddMSGProps;

	LoginVerificationPO loginVerificationPO;

	// Menu

	public void clickOnCarrierServiceMenu() {
		click(menuCarrierService);
		visibilityOfElement("//tr[contains(@id,\"ServiceTableRow\")][1]");
	}

	// Pagination

	public void clickOnGoToLast() {
		click(btnGoToLast);

		visibilityOfElement("//tr[contains(@id,\"ServiceTableRow\")][1]");

	}

	// Create Methods

	String cboCountryCodeText = "";
	String cboOADCLookpText = "";
	String cboGatewayText = "";
	String cboMoActionText = "";
	String cboMtActionText = "";
	String cboCharMappingText = "";

	public void fillOutService(String text) {
		sendKeys(txtService, text);
	}

	public void clickOnCboCountryCode() {
		click(cboCountryCode);
	}

	public void clickOnCboCountryCodeOption() {
		click(cboCountryCodeOption);
		cboCountryCodeText = getText(cboCountryCodeOption);
	}

	public void clickOnCboOADCLookup() {
		click(cboOADCLookup);
	}

	public void clickOnCboOADCLookupOption() {
		click(cboOADCLookupOption);
		cboOADCLookpText = getText(cboOADCLookupOption);
	}

	public void clickOnCboGateway() {
		click(cboGateway);
	}

	public void clickOnCboGatewayOption() {
		click(cboGatewayOption);
		cboGatewayText = getText(cboGatewayOption);
	}

	public void clickOnCboMoAction() {
		click(cboMoAction);
	}

	public void clickOnCboMoActionOption() {
		click(cboMoActionOption);
		cboMoActionText = getText(cboMoActionOption);
	}

	public void clickOnCboMtAction() {
		click(cboMtAction);
	}

	public void clickOnCboMtActionOption() {
		click(cboMtActionOption);
		cboMtActionText = getText(cboMtActionOption);
	}

	public void clickOnCboCharMapping() {
		click(cboCharMapping);
	}

	public void clickOnCboCharMappingOption() {
		click(cboCharMappingOption);
		cboCharMappingText = getText(cboCharMappingOption);
	}

	public void clickOnAddCarrierService() {
		click(btnAddCarrierService);
		sleep(5000);
	}

	// Filters Methods

	public void fillOutSearchCarrierService(String text) {
		sendKeys(txtSearchCarrierService, text);
	}

	public void fillOutSearchLogAgent(String text) {
		sendKeys(txtSearchLogAgent, text);
	}

	public void clickOnCboSearchCountry() {
		click(cboSearchCountry);
	}

	public void clickOnBtnSearch() {
		click(btnSearch);
		sleep(4000);
	}

	// Modals

	// Route Point

	public void fillOutRoutePointName(String text) {
		sendKeys(txtRoutePointName, text);
	}

	public void fillOutRoutePointDescription(String text) {
		sendKeys(txtRoutePointDescription, text);
	}

	public void clickOnBtnAddRoutePoint() {
		click(btnAddRoutePoint);
		sleep(5000);
	}

	// Log Agent
	public void selectLogAgent() {

		click(cboNameLogAgent);
		sleep(1000);
		nameLogAgent = getText(cboNameLogAgentO);
		click(cboNameLogAgentO);
		sleep(1000);

	}

	public void clickOnBtnAddLogAgent() {
		click(btnAddLogAgent);
		sleep(5000);
	}

	// MO Char

	String cboDecodingTypeText = "";
	String cboUnpack7bitText = "";

	public void selectDecodingType() {

		click(cboDecodingType);
		sleep(1000);
		cboDecodingTypeText = getText(cboDecodingTypeO);
		click(cboDecodingTypeO);
		sleep(1000);

	}

	public void selectUnpack7Bit() {

		click(cboUnpack7Bit);
		sleep(1000);
		cboUnpack7bitText = getText(cboUnpack7BitO);
		click(cboUnpack7BitO);
		sleep(1000);

	}

	public void fillOutDecodeDCS(String text) {

		sendKeys(txtDecodeDCS, text);

	}

	public void clickOnAddMOChar() {
		click(btnAddMOChar);
		sleep(5000);
	}

	// MT Char

	String cboEncodingTypeText = "";
	String cboPack7bitText = "";

	public void selectEncodingType() {

		click(cboEncodingType);
		sleep(1000);
		cboEncodingTypeText = getText(cboEncodingTypeO);
		click(cboEncodingTypeO);
		sleep(1000);

	}

	public void fillOutDCS(String text) {

		sendKeys(txtDCS, text);

	}

	public void fillOutToDCS(String text) {

		sendKeys(txtToDCS, text);

	}

	public void selectPack7Bit() {

		click(cboPack7Bit);
		sleep(1000);
		cboPack7bitText = getText(cboPack7BitO);
		click(cboPack7BitO);
		sleep(1000);

	}

	public void clickOnAddMTChar() {
		click(btnAddMTChar);
		sleep(5000);
	}

	// MT Char

	String cboDirectionText = "";
	String cboBIMText = "";
	String cboUDHText = "";
	String cboRuleTypeText = "";

	public void selectDirection() {

		click(cboDirection);
		sleep(1000);
		cboDirectionText = getText(cboDirectionO);
		click(cboDirectionO);
		sleep(1000);

	}

	public void fillOutMSGPropsDCS(String text) {

		sendKeys(txtMSGDSC, text);

	}

	public void fillOutESM(String text) {

		sendKeys(txtESM, text);

	}

	public void selectBIM() {

		click(cboBin);
		sleep(1000);
		cboBIMText = getText(cboBinO);
		click(cboBinO);
		sleep(1000);

	}
	
	public void selectUDH() {

		click(cboUDH);
		sleep(1000);
		cboUDHText = getText(cboUDHO);
		click(cboUDHO);
		sleep(1000);

	}
	
	public void selectRuleType() {

		click(cboRuleType);
		sleep(1000);
		cboRuleTypeText = getText(cboRuleTypeO);
		click(cboRuleTypeO);
		sleep(1000);

	}

	public void clickOnAddMSGProps() {
		click(btnAddMTChar);
		sleep(5000);
	}

	// Create

	String service = "Ztest";
	String nameLogAgent = "";

	public void createCarrierService() {

		loginVerificationPO = new LoginVerificationPO();

		actionsMoveToElementElement(loginVerificationPO.btnConfiguration);

		clickOnCarrierServiceMenu();
		
		visibilityOfElement("//tr[contains(@id,\"ServiceTableRow\")]");

		actionsMoveToElementElement(btnGoToFirst);

		clickOnGoToLast();

		int rowsB = rows("//tr[contains(@id,\"ServiceTableRow\")][1]/td[16]/div/button[1]");

		fillOutService(service);

		clickOnCboCountryCode();

		clickOnCboCountryCodeOption();

		clickOnCboOADCLookup();

		clickOnCboOADCLookupOption();

		clickOnCboGateway();

		clickOnCboGatewayOption();

		clickOnCboMoAction();

		clickOnCboMoActionOption();

		clickOnCboMtAction();

		clickOnCboMtActionOption();

		clickOnCboCharMapping();

		clickOnCboCharMappingOption();

		clickOnAddCarrierService();

		refresh();

		visibilityOfElement("//tr[contains(@id,\"ServiceTableRow\")][1]");

		clickOnGoToLast();

		int rowsA = rows("//tr[contains(@id,\"ServiceTableRow\")]");

		System.out.println("--------------------Creation Verification--------------------");
		boolean created = false;

		if (rowsA > rowsB) {
			created = true;
		}

		assertTrue(created, createdUnSuccesfully);

		created = false;

		String serviceA = getText("//tr[contains(@id,\"ServiceTableRow\")][" + rowsA + "]/td[3]/div");
		String countryCodeA = getText("//tr[contains(@id,\"ServiceTableRow\")][" + rowsA + "]/td[4]/div");
		String OADCLookupA = getText("//tr[contains(@id,\"ServiceTableRow\")][" + rowsA + "]/td[5]/div");

		System.out.println("The Service is: " + serviceA);
		System.out.println("The Country Code is: " + countryCodeA);
		System.out.println("The OACDLookup is: " + OADCLookupA);

		if (serviceA.equals(service) && countryCodeA.equals(cboCountryCodeText)
				&& OADCLookupA.equals(cboOADCLookpText)) {
			created = true;
		}

		assertTrue(created, createdUnSuccesfully);

		System.out.println("The record was created succesfully: " + created);

	}

	// Verfication before editing or deleting the record

	public void verification() {

		int modal = rows("//div[@class=\"tablePageModalBack\" and not(contains(@style,\"display: none\"))]");

		if (modal != 0) {

			click("//div[@class=\"tablePageModalBack\" and not(contains(@style,\"display: none\"))]//button[text()=\"X\"]");

		}

		loginVerificationPO = new LoginVerificationPO();

		actionsMoveToElementElement(loginVerificationPO.btnConfiguration);

		clickOnCarrierServiceMenu();
		
		visibilityOfElement("//tr[contains(@id,\"ServiceTableRow\")]");

		actionsMoveToElementElement(btnGoToLast);

		clickOnGoToLast();

		boolean record = false;

		orderService();

		String service = getText("//tr[contains(@id,\"ServiceTableRow\")][1]/td[3]/div");

		if (service.contains(this.service)) {
			record = true;
		}

		assertTrue(record, creationRecord);

	}

	public void editCarrierService() {

		verification();

		int rows = rows("//tr[contains(@id,\"ServiceTableRow\")]");

		boolean edited = false;

		String serviceE = "Ztest1";

		WebElement txtEditService = findElement("//tr[contains(@id,\"ServiceTableRow\")][1]/td[3]/input");
		// CBO
		WebElement cboEditOADCLookup = findElement(
				"//tr[contains(@id,\"ServiceTableRow\")][1]//select[@id=\"editoadcLookup\"]");
		WebElement cboEditGateway = findElement(
				"//tr[contains(@id,\"ServiceTableRow\")][1]//select[@id=\"editmessageGateway\"]");
		WebElement cboEditMOAction = findElement(
				"//tr[contains(@id,\"ServiceTableRow\")][1]//select[@id=\"editmoActionTemplate\"]");
		WebElement cboEditMTAction = findElement(
				"//tr[contains(@id,\"ServiceTableRow\")][1]//select[@id=\"editmtActionTemplate\"]");
		WebElement cboEditCharMapping = findElement(
				"//tr[contains(@id,\"ServiceTableRow\")][1]//select[@id=\"editcharMappingEnabled\"]");

		// CBO Options

		WebElement cboEditOADCLookupO = findElement(
				"//tr[contains(@id,\"ServiceTableRow\")][1]//select[@id=\"editoadcLookup\"]/option[not(contains(text(),\"Select\")) and text()][2]");
		WebElement cboEditGatewayO = findElement(
				"//tr[contains(@id,\"ServiceTableRow\")][1]//select[@id=\"editmessageGateway\"]/option[not(contains(text(),\"Select\")) and text()][2]");
		WebElement cboEditMOActionO = findElement(
				"//tr[contains(@id,\"ServiceTableRow\")][1]//select[@id=\"editmoActionTemplate\"]/option[not(contains(text(),\"Select\")) and text()][2]");
		WebElement cboEditMTActionO = findElement(
				"//tr[contains(@id,\"ServiceTableRow\")][1]//select[@id=\"editmtActionTemplate\"]/option[not(contains(text(),\"Select\")) and text()][2]");
		WebElement cboEditCharMappingO = findElement(
				"//tr[contains(@id,\"ServiceTableRow\")][1]//select[@id=\"editcharMappingEnabled\"]/option[not(contains(text(),\"Select\")) and text()][2]");

		WebElement btnEdit = findElement(
				"//tr[contains(@id,\"ServiceTableRow\")][1]//child::button[contains(@id,\"edit\")]");

		orderService();

		click(btnEdit);

		clear(txtEditService);
		sendKeys(txtEditService, serviceE);

		click(cboEditOADCLookup);
		cboOADCLookpText = getText(cboEditOADCLookupO);
		click(cboEditOADCLookupO);

		click(cboEditGateway);
		cboGatewayText = getText(cboEditGatewayO);
		click(cboEditGatewayO);

		click(cboEditMOAction);
		cboMoActionText = getText(cboEditMOActionO);
		click(cboEditMOActionO);

		click(cboEditMTAction);
		cboMtActionText = getText(cboEditMTActionO);
		click(cboEditMTActionO);

		click(cboEditCharMapping);
		cboCharMappingText = getText(cboEditCharMappingO);
		click(cboEditCharMappingO);

		click(btnEdit);
		sleep(5000);

		visibilityOfElement("//tr[contains(@id,\"ServiceTableRow\")][1]");

		refresh();

		visibilityOfElement("//tr[contains(@id,\"ServiceTableRow\")][1]");

		click(btnGoToLast);

		visibilityOfElement("//tr[contains(@id,\"ServiceTableRow\")][1]");

		orderService();

		String serviceA = getText("//tr[contains(@id,\"ServiceTableRow\")][1]/td[3]/div");
		String OADCLookupA = getText("//tr[contains(@id,\"ServiceTableRow\")][1]/td[5]/div");
		String gatewayA = getText("//tr[contains(@id,\"ServiceTableRow\")][1]/td[8]/div");
		String charMappingA = getText("//tr[contains(@id,\"ServiceTableRow\")][1]/td[13]/div");

		System.out.println("-----------------------------Edition Verification------------------------------");

		System.out.println("The Information selected is:-------------------------------------------");
		System.out.println("The Service is: " + serviceE);
		System.out.println("The OACDLookup is: " + cboOADCLookpText);
		System.out.println("The Gateway is: " + cboGatewayText);
		System.out.println("The Char Mapping is: " + cboCharMappingText);
		System.out.println("The Information presented is:-------------------------------------------");

		System.out.println("The Service is: " + serviceA);
		System.out.println("The OADC Lookup is: " + OADCLookupA);
		System.out.println("The Gateway is: " + gatewayA);
		System.out.println("The Char Mapping is: " + charMappingA);

		if (serviceA.equals(serviceE) && OADCLookupA.equals(cboOADCLookpText) && gatewayA.equals(cboGatewayText)
				&& charMappingA.equals(cboCharMappingText)) {
			edited = true;
		}

		System.out.println("The record was edited with success: " + edited);

		assertTrue(edited, editionRecord);

	}

	public void deleteCarrierService() {

		verification();

		int rowsB = rows("//tr[contains(@id,\"ServiceTableRow\")]");

		boolean deleted = false;

		WebElement btnDelete = findElement(
				"//tr[contains(@id,\"ServiceTableRow\")][1]//child::button[contains(@id,\"delete\")]");

		orderService();

		click(btnDelete);
		sleep(5000);

		refresh();

		visibilityOfElement("//tr[contains(@id,\"ServiceTableRow\")][1]");

		click(btnGoToLast);

		visibilityOfElement("//tr[contains(@id,\"ServiceTableRow\")][1]");

		int rowsA = rows("//tr[contains(@id,\"ServiceTableRow\")]");

		String serviceA = getText("//tr[contains(@id,\"ServiceTableRow\")][1]/td[3]/div");

		System.out.println("---------------------------Deletion Verification--------------------------");

		System.out.println("The service is: " + serviceA);

		deleted = greaterThanInt(rowsB, rowsA);

		System.out.println("The record was deleted with success: " + deleted);

		assertTrue(deleted, deletionRecord);

	}

	public void filters() {

		loginVerificationPO = new LoginVerificationPO();

		actionsMoveToElementElement(loginVerificationPO.btnConfiguration);

		clickOnCarrierServiceMenu();
		
		visibilityOfElement("//tr[contains(@id,\"ServiceTableRow\")]");

		actionsMoveToElementElement(btnGoToFirst);

		clickOnGoToLast();

		int rows = rows("//tr[contains(@id,\"Carrier ServiceTableRow\")]");

		String carrierService = getText(
				"//tr[contains(@id,\"Carrier ServiceTableRow\")][" + rows + "]/td[3]//child::div");
		String country = getText("//tr[contains(@id,\"Carrier ServiceTableRow\")][" + rows + "]/td[4]//child::div");
		String logAgent = getText(
				"//tr[contains(@id,\"Carrier ServiceTableRow\")][" + rows + "]/td[7]//child::div[text()]");
		System.out.println("----------------country: " + country);

		// Carrier Service

		fillOutSearchCarrierService(carrierService);

		clickOnBtnSearch();

		verifyFilter("Carrier Service", carrierService, 3);

		clearByBackSpace(txtSearchCarrierService);

		// Country

		clickOnCboSearchCountry();

		WebElement countryO = findElement(
				"//div[@class=\"searchBarElement\"][2]//child::option[@value=\"" + country + "\"]");

		click(countryO);

		clickOnBtnSearch();

		verifyFilter("Country", country, 4);

		WebElement blank = findElement(
				"//div[@class=\"searchBarElement\"][2]//child::option[contains(text(),\"Select\") or not(text())]");

		click(blank);

		// Log Agent

		fillOutSearchLogAgent(logAgent);

		clickOnBtnSearch();

		verifyFilter("Log Agent", logAgent, 7);

		clearByBackSpace(txtSearchLogAgent);

		clickOnBtnSearch();

	}

	public void verifyFilter(String filter, String field, int td) {

		int rows = rows("//tr[contains(@id,\"Carrier ServiceTableRow\")]");

		System.out.println("-----------------------------" + filter + " Verification------------------------");

		System.out.println("-----The value selected is: " + field);
		String result = "";
		int j = 1;

		for (int i = 0; i < rows; i++) {
			result = getText("//tr[contains(@id,\"Carrier ServiceTableRow\")][" + j + "]/td[" + td + "]//child::div");
			System.out.println("The results after filtering are: " + result);

			assertTrue(result.equals(field), filtersNotWorking);

			j++;

		}

	}

	public void orderService() {

		String service = getText("//tr[contains(@id,\"ServiceTableRow\")][1]/td[3]/div");
		int count = 1;

		while (!service.contains(this.service)) {

			click("//div[text()=\"ID\"]");
			sleep(500);
			service = getText("//tr[contains(@id,\"ServiceTableRow\")][1]/td[3]/div");
			count++;

			if (count > 3) {
				assertTrue(false, creationRecord);
			}

		}

	}

	// Route Points

	public void createRoutePoint() {

		verification();

		orderService();

		WebElement routePointTable = findElement(
				"//tr[contains(@id,\"ServiceTableRow\")][1]//button[contains(@id,\"RoutePoint\")]");

		click(routePointTable);

		waitExpectedElement("//button[@id=\"AddBtn\"]");

		int rowsB = rows(
				"//div[@class=\"tablePageModalBack\" and not(contains(@style,\"none\"))]//tr[contains(@id,\"TableRow\")]");

		String name = "TA_Test";
		String description = "Test";

		fillOutRoutePointName(name);
		fillOutRoutePointDescription(description);

		clickOnBtnAddRoutePoint();

		refresh();

		visibilityOfElement("//tr[contains(@id,\"ServiceTableRow\")][1]");

		clickOnGoToLast();

		orderService();

		routePointTable = findElement(
				"//tr[contains(@id,\"ServiceTableRow\")][1]//button[contains(@id,\"RoutePoint\")]");

		click(routePointTable);

		waitExpectedElement("//button[@id=\"AddBtn\"]");

		int rowsA = rows(
				"//div[@class=\"tablePageModalBack\" and not(contains(@style,\"none\"))]//tr[contains(@id,\"TableRow\")]");

		boolean created = greaterThanInt(rowsA, rowsB);

		System.out.println("Record Created: " + created);
		assertTrue(created, createdUnSuccesfully);

		String nameA = getText(
				"//div[@class=\"tablePageModalBack\" and not(contains(@style,\"none\"))]//tr[contains(@id,\"TableRow\")]["
						+ rowsA + "]//td[2]");
		String descriptionA = getText(
				"//div[@class=\"tablePageModalBack\" and not(contains(@style,\"none\"))]//tr[contains(@id,\"TableRow\")]["
						+ rowsA + "]//td[3]");

		created = false;

		if (nameA.equals(name) && descriptionA.equals(description)) {
			created = true;
		}

		System.out.println("Record created successfully: " + created);
		assertTrue(created, createdUnSuccesfully);

	}

	public void editRoutePoint() {

		verification();

		orderService();

		WebElement routePointTable = findElement(
				"//tr[contains(@id,\"ServiceTableRow\")][1]//button[contains(@id,\"RoutePoint\")]");

		click(routePointTable);

		waitExpectedElement("//button[@id=\"AddBtn\"]");

		int rows = rows(
				"//div[@class=\"tablePageModalBack\" and not(contains(@style,\"none\"))]//tr[contains(@id,\"TableRow\")]");

		WebElement btnEdit = findElement(
				"//div[@class=\"tablePageModalBack\" and not(contains(@style,\"none\"))]//tr[contains(@id,\"TableRow\")]["
						+ rows + "]//button[contains(@id,\"edit\")]");
		click(btnEdit);

		WebElement txtEditName = findElement(
				"//div[@class=\"tablePageModalBack\" and not(contains(@style,\"none\"))]//tr[contains(@id,\"TableRow\")]["
						+ rows + "]//input[contains(@id,\"routePoint\")]");
		WebElement txtEditDescription = findElement(
				"//div[@class=\"tablePageModalBack\" and not(contains(@style,\"none\"))]//tr[contains(@id,\"TableRow\")]["
						+ rows + "]//input[contains(@id,\"description\")]");

		String name = "TA_Edit";
		String description = "Test_Edition";

		clearByBackSpace(txtEditName);
		clearByBackSpace(txtEditDescription);

		sendKeys(txtEditName, name);
		sendKeys(txtEditDescription, description);

		click(btnEdit);
		sleep(5000);

		refresh();

		visibilityOfElement("//tr[contains(@id,\"ServiceTableRow\")][1]");

		clickOnGoToLast();

		orderService();

		routePointTable = findElement(
				"//tr[contains(@id,\"ServiceTableRow\")][1]//button[contains(@id,\"RoutePoint\")]");

		click(routePointTable);

		waitExpectedElement("//button[@id=\"AddBtn\"]");

		String nameA = getText(
				"//div[@class=\"tablePageModalBack\" and not(contains(@style,\"none\"))]//tr[contains(@id,\"TableRow\")]["
						+ rows + "]//td[2]/div");
		String descriptionA = getText(
				"//div[@class=\"tablePageModalBack\" and not(contains(@style,\"none\"))]//tr[contains(@id,\"TableRow\")]["
						+ rows + "]//td[3]/div");

		boolean edited = false;

		if (nameA.equals(name) && descriptionA.equals(description)) {
			edited = true;
		}

		System.out.println("Record edited successfully: " + edited);
		assertTrue(edited, editionRecord);

	}

	public void deleteRoutePoint() {

		verification();

		orderService();

		WebElement routePointTable = findElement(
				"//tr[contains(@id,\"ServiceTableRow\")][1]//button[contains(@id,\"RoutePoint\")]");

		click(routePointTable);

		waitExpectedElement("//button[@id=\"AddBtn\"]");

		int rowsB = rows(
				"//div[@class=\"tablePageModalBack\" and not(contains(@style,\"none\"))]//tr[contains(@id,\"TableRow\")]");

		WebElement btnDelete = findElement(
				"//div[@class=\"tablePageModalBack\" and not(contains(@style,\"none\"))]//tr[contains(@id,\"TableRow\")]["
						+ rowsB + "]//button[contains(@id,\"delete\")]");
		click(btnDelete);
		sleep(5000);

		refresh();

		visibilityOfElement("//tr[contains(@id,\"ServiceTableRow\")][1]");

		clickOnGoToLast();

		orderService();

		routePointTable = findElement(
				"//tr[contains(@id,\"ServiceTableRow\")][1]//button[contains(@id,\"RoutePoint\")]");

		click(routePointTable);

		waitExpectedElement("//button[@id=\"AddBtn\"]");

		int rowsA = rows(
				"//div[@class=\"tablePageModalBack\" and not(contains(@style,\"none\"))]//tr[contains(@id,\"TableRow\")]");

		boolean deleted = greaterThanInt(rowsB, rowsA);

		System.out.println("Record deleted Sucessfully: " + deleted);
		assertTrue(deleted, deletionRecord);

	}

	// Log Agent

	public void createLogAgent() {

		verification();

		orderService();

		WebElement logAgentTable = findElement(
				"//tr[contains(@id,\"ServiceTableRow\")][1]//button[contains(@id,\"logAgent\")]");

		click(logAgentTable);

		waitExpectedElement("//button[@id=\"AddBtn\"]");

		int rowsB = rows(
				"//div[@class=\"tablePageModalBack\" and not(contains(@style,\"none\"))]//tr[contains(@id,\"TableRow\")]");

		selectLogAgent();

		clickOnBtnAddLogAgent();

		refresh();

		visibilityOfElement("//tr[contains(@id,\"ServiceTableRow\")][1]");

		clickOnGoToLast();

		orderService();

		logAgentTable = findElement("//tr[contains(@id,\"ServiceTableRow\")][1]//button[contains(@id,\"logAgent\")]");

		click(logAgentTable);

		waitExpectedElement("//button[@id=\"AddBtn\"]");

		int rowsA = rows(
				"//div[@class=\"tablePageModalBack\" and not(contains(@style,\"none\"))]//tr[contains(@id,\"TableRow\")]");

		boolean created = greaterThanInt(rowsA, rowsB);

		System.out.println("Record Created: " + created);
		assertTrue(created, createdUnSuccesfully);

		String logAgentA = getText(
				"//div[@class=\"tablePageModalBack\" and not(contains(@style,\"none\"))]//tr[contains(@id,\"TableRow\")]["
						+ rowsA + "]//td[2]");

		created = false;

		if (logAgentA.equals(nameLogAgent)) {
			created = true;
		}

		System.out.println("Record created successfully: " + created);
		assertTrue(created, createdUnSuccesfully);

	}

	public void deleteLogAgent() {

		verification();

		orderService();

		WebElement logAgentTable = findElement(
				"//tr[contains(@id,\"ServiceTableRow\")][1]//button[contains(@id,\"logAgent\")]");

		click(logAgentTable);

		waitExpectedElement("//button[@id=\"AddBtn\"]");

		int rowsB = rows(
				"//div[@class=\"tablePageModalBack\" and not(contains(@style,\"none\"))]//tr[contains(@id,\"TableRow\")]");

		WebElement btnDelete = findElement(
				"//div[@class=\"tablePageModalBack\" and not(contains(@style,\"none\"))]//tr[contains(@id,\"TableRow\")]["
						+ rowsB + "]//button[contains(@id,\"delete\")]");
		click(btnDelete);
		sleep(5000);

		refresh();

		visibilityOfElement("//tr[contains(@id,\"ServiceTableRow\")][1]");

		clickOnGoToLast();

		orderService();

		logAgentTable = findElement("//tr[contains(@id,\"ServiceTableRow\")][1]//button[contains(@id,\"logAgent\")]");

		click(logAgentTable);

		waitExpectedElement("//button[@id=\"AddBtn\"]");

		int rowsA = rows(
				"//div[@class=\"tablePageModalBack\" and not(contains(@style,\"none\"))]//tr[contains(@id,\"TableRow\")]");

		boolean deleted = greaterThanInt(rowsB, rowsA);

		System.out.println("Record deleted Sucessfully: " + deleted);
		assertTrue(deleted, deletionRecord);

	}

	// MO Char

	public void createMOChar() {

		verification();

		WebElement moCharTable = findElement(
				"//tr[contains(@id,\"ServiceTableRow\")][1]//button[contains(@id,\"MOChar\")]");

		click(moCharTable);

		waitExpectedElement("//button[@id=\"AddBtn\"]");

		int rowsB = rows(
				"//div[@class=\"tablePageModalBack\" and not(contains(@style,\"none\"))]//tr[contains(@id,\"TableRow\")]");

		String decodeDCS = convertToString(random(9999));

		selectDecodingType();

		fillOutDecodeDCS(decodeDCS);

		selectUnpack7Bit();

		clickOnAddMOChar();

		refresh();

		visibilityOfElement("//tr[contains(@id,\"ServiceTableRow\")][1]");

		clickOnGoToLast();

		orderService();

		moCharTable = findElement("//tr[contains(@id,\"ServiceTableRow\")][1]//button[contains(@id,\"MOChar\")]");

		click(moCharTable);

		waitExpectedElement("//button[@id=\"AddBtn\"]");

		int rowsA = rows(
				"//div[@class=\"tablePageModalBack\" and not(contains(@style,\"none\"))]//tr[contains(@id,\"TableRow\")]");

		boolean created = greaterThanInt(rowsA, rowsB);

		System.out.println("Record Created: " + created);
		assertTrue(created, createdUnSuccesfully);

		String decodingTypeA = getText(
				"//div[@class=\"tablePageModalBack\" and not(contains(@style,\"none\"))]//tr[contains(@id,\"TableRow\")]["
						+ rowsA + "]//td[2]");
		String decodeDCSA = getText(
				"//div[@class=\"tablePageModalBack\" and not(contains(@style,\"none\"))]//tr[contains(@id,\"TableRow\")]["
						+ rowsA + "]//td[3]");
		String unpack7BitsA = getText(
				"//div[@class=\"tablePageModalBack\" and not(contains(@style,\"none\"))]//tr[contains(@id,\"TableRow\")]["
						+ rowsA + "]//td[4]");

		System.out.println("----------------------Creation Verification--------------------------");
		System.out.println("Info Selected");
		System.out.println("Decoding Type: " + cboDecodingTypeText);
		System.out.println("Decode DCS: " + decodeDCS);
		System.out.println("Unpack 7 Bit: " + cboUnpack7bitText);
		System.out.println("Info After Creation------------------------------");
		System.out.println("Decoding Type: " + decodingTypeA);
		System.out.println("Decode DCS: " + decodeDCSA);
		System.out.println("Unpack 7 Bit: " + unpack7BitsA);
		created = false;

		if (decodingTypeA.equals(cboDecodingTypeText) && decodeDCSA.equals(decodeDCS)
				&& unpack7BitsA.equals(cboUnpack7bitText)) {
			created = true;
		}

		System.out.println("Record created successfully: " + created);
		assertTrue(created, createdUnSuccesfully);

	}

	public void editMOChar() {

		verification();

		WebElement routePointTable = findElement(
				"//tr[contains(@id,\"ServiceTableRow\")][1]//button[contains(@id,\"MOChar\")]");

		click(routePointTable);

		waitExpectedElement("//button[@id=\"AddBtn\"]");

		int rows = rows(
				"//div[@class=\"tablePageModalBack\" and not(contains(@style,\"none\"))]//tr[contains(@id,\"TableRow\")]");

		WebElement btnEdit = findElement(
				"//div[@class=\"tablePageModalBack\" and not(contains(@style,\"none\"))]//tr[contains(@id,\"TableRow\")]["
						+ rows + "]//button[contains(@id,\"edit\")]");
		click(btnEdit);

		WebElement cboEdtiDecodingType = findElement(
				"//div[@class=\"tablePageModalBack\" and not(contains(@style,\"none\"))]//tr[contains(@id,\"TableRow\")]["
						+ rows + "]//select[@id=\"editdescription\"]");
		WebElement cboEdtiDecodingTypeO = findElement(
				"//div[@class=\"tablePageModalBack\" and not(contains(@style,\"none\"))]//tr[contains(@id,\"TableRow\")]["
						+ rows + "]//select[@id=\"editdescription\"]/option[text()][2]");

		WebElement txtEditDCS = findElement(
				"//div[@class=\"tablePageModalBack\" and not(contains(@style,\"none\"))]//tr[contains(@id,\"TableRow\")]["
						+ rows + "]//input[contains(@id,\"dcs\")]");

		WebElement cboEdtiUnpack7Bit = findElement(
				"//div[@class=\"tablePageModalBack\" and not(contains(@style,\"none\"))]//tr[contains(@id,\"TableRow\")]["
						+ rows + "]//select[@id=\"editunpack7bit\"]");
		WebElement cboEdtiUnpack7BitO = findElement(
				"//div[@class=\"tablePageModalBack\" and not(contains(@style,\"none\"))]//tr[contains(@id,\"TableRow\")]["
						+ rows + "]//select[@id=\"editunpack7bit\"]/option[text()][2]");

		String decodeDCSEdit = convertToString(random(9999));

		click(cboEdtiDecodingType);
		cboDecodingTypeText = getText(cboEdtiDecodingTypeO);
		click(cboEdtiDecodingTypeO);

		clearByBackSpace(txtEditDCS);
		sendKeys(txtEditDCS, decodeDCSEdit);

		click(cboEdtiUnpack7Bit);
		cboUnpack7bitText = getText(cboEdtiUnpack7BitO);
		click(cboEdtiUnpack7BitO);

		click(btnEdit);
		sleep(5000);

		refresh();

		visibilityOfElement("//tr[contains(@id,\"ServiceTableRow\")][1]");

		clickOnGoToLast();

		orderService();

		routePointTable = findElement("//tr[contains(@id,\"ServiceTableRow\")][1]//button[contains(@id,\"MOChar\")]");

		click(routePointTable);

		waitExpectedElement("//button[@id=\"AddBtn\"]");

		String decodingTypeE = getText(
				"//div[@class=\"tablePageModalBack\" and not(contains(@style,\"none\"))]//tr[contains(@id,\"TableRow\")]["
						+ rows + "]//td[2]");
		String decodeDCSE = getText(
				"//div[@class=\"tablePageModalBack\" and not(contains(@style,\"none\"))]//tr[contains(@id,\"TableRow\")]["
						+ rows + "]//td[3]");
		String unpack7BitsE = getText(
				"//div[@class=\"tablePageModalBack\" and not(contains(@style,\"none\"))]//tr[contains(@id,\"TableRow\")]["
						+ rows + "]//td[4]");

		System.out.println("----------------------Creation Verification--------------------------");
		System.out.println("Info Selected");
		System.out.println("Decoding Type: " + cboDecodingTypeText);
		System.out.println("Decode DCS: " + decodeDCSEdit);
		System.out.println("Unpack 7 Bit: " + cboUnpack7bitText);
		System.out.println("Info After Creation------------------------------");
		System.out.println("Decoding Type: " + decodingTypeE);
		System.out.println("Decode DCS: " + decodeDCSE);
		System.out.println("Unpack 7 Bit: " + unpack7BitsE);

		boolean edited = false;

		if (decodingTypeE.equals(cboDecodingTypeText) && decodeDCSE.equals(decodeDCSEdit)
				&& unpack7BitsE.equals(cboUnpack7bitText)) {
			edited = true;
		}

		System.out.println("Record edited successfully: " + edited);
		assertTrue(edited, editionRecord);

	}

	public void deleteMOChar() {

		verification();

		WebElement routePointTable = findElement(
				"//tr[contains(@id,\"ServiceTableRow\")][1]//button[contains(@id,\"MOChar\")]");

		click(routePointTable);

		waitExpectedElement("//button[@id=\"AddBtn\"]");

		int rowsB = rows(
				"//div[@class=\"tablePageModalBack\" and not(contains(@style,\"none\"))]//tr[contains(@id,\"TableRow\")]");

		WebElement btnDelete = findElement(
				"//div[@class=\"tablePageModalBack\" and not(contains(@style,\"none\"))]//tr[contains(@id,\"TableRow\")]["
						+ rowsB + "]//button[contains(@id,\"delete\")]");
		click(btnDelete);
		sleep(5000);

		refresh();

		visibilityOfElement("//tr[contains(@id,\"ServiceTableRow\")][1]");

		clickOnGoToLast();

		orderService();

		routePointTable = findElement("//tr[contains(@id,\"ServiceTableRow\")][1]//button[contains(@id,\"MOChar\")]");

		click(routePointTable);

		waitExpectedElement("//button[@id=\"AddBtn\"]");

		int rowsA = rows(
				"//div[@class=\"tablePageModalBack\" and not(contains(@style,\"none\"))]//tr[contains(@id,\"TableRow\")]");

		boolean deleted = greaterThanInt(rowsB, rowsA);

		System.out.println("Record deleted Sucessfully: " + deleted);
		assertTrue(deleted, deletionRecord);

	}

	// MT Char
	public void createMTChar() {

		verification();

		WebElement mtCharTable = findElement(
				"//tr[contains(@id,\"ServiceTableRow\")][1]//button[contains(@id,\"MTChar\")]");

		click(mtCharTable);

		waitExpectedElement("//button[@id=\"AddBtn\"]");

		int rowsB = rows(
				"//div[@class=\"tablePageModalBack\" and not(contains(@style,\"none\"))]//tr[contains(@id,\"TableRow\")]");

		String dCS = convertToString(random(999));
		String toDCS = convertToString(random(9999));

		selectEncodingType();

		fillOutDCS(dCS);
		fillOutToDCS(toDCS);

		selectPack7Bit();

		clickOnAddMOChar();

		refresh();

		visibilityOfElement("//tr[contains(@id,\"ServiceTableRow\")][1]");

		clickOnGoToLast();

		orderService();

		mtCharTable = findElement("//tr[contains(@id,\"ServiceTableRow\")][1]//button[contains(@id,\"MTChar\")]");

		click(mtCharTable);

		waitExpectedElement("//button[@id=\"AddBtn\"]");

		int rowsA = rows(
				"//div[@class=\"tablePageModalBack\" and not(contains(@style,\"none\"))]//tr[contains(@id,\"TableRow\")]");

		boolean created = greaterThanInt(rowsA, rowsB);

		System.out.println("Record Created: " + created);
		assertTrue(created, createdUnSuccesfully);

		String encodingTypeA = getText(
				"//div[@class=\"tablePageModalBack\" and not(contains(@style,\"none\"))]//tr[contains(@id,\"TableRow\")]["
						+ rowsA + "]//td[2]");
		String dCSA = getText(
				"//div[@class=\"tablePageModalBack\" and not(contains(@style,\"none\"))]//tr[contains(@id,\"TableRow\")]["
						+ rowsA + "]//td[3]");
		String toDSCA = getText(
				"//div[@class=\"tablePageModalBack\" and not(contains(@style,\"none\"))]//tr[contains(@id,\"TableRow\")]["
						+ rowsA + "]//td[4]");

		System.out.println("----------------------Creation Verification--------------------------");
		System.out.println("Info Selected");
		System.out.println("Decoding Type: " + cboEncodingTypeText);
		System.out.println("DCS: " + dCS);
		System.out.println("To DCS: " + toDCS);
		System.out.println("Info After Creation------------------------------");
		System.out.println("Decoding Type: " + encodingTypeA);
		System.out.println("DCS: " + dCSA);
		System.out.println("To DCS: " + toDSCA);

		created = false;

		if (encodingTypeA.equals(cboEncodingTypeText) && dCSA.equals(dCS) && toDSCA.equals(toDCS)) {
			created = true;
		}

		System.out.println("Record created successfully: " + created);
		assertTrue(created, createdUnSuccesfully);

	}

	public void editMTChar() {

		verification();

		WebElement routePointTable = findElement(
				"//tr[contains(@id,\"ServiceTableRow\")][1]//button[contains(@id,\"MTChar\")]");

		click(routePointTable);

		waitExpectedElement("//button[@id=\"AddBtn\"]");

		int rows = rows(
				"//div[@class=\"tablePageModalBack\" and not(contains(@style,\"none\"))]//tr[contains(@id,\"TableRow\")]");

		WebElement btnEdit = findElement(
				"//div[@class=\"tablePageModalBack\" and not(contains(@style,\"none\"))]//tr[contains(@id,\"TableRow\")]["
						+ rows + "]//button[contains(@id,\"edit\")]");
		click(btnEdit);

		WebElement cboEdtiEncodingType = findElement(
				"//div[@class=\"tablePageModalBack\" and not(contains(@style,\"none\"))]//tr[contains(@id,\"TableRow\")]["
						+ rows + "]//select[@id=\"editdescription\"]");
		WebElement cboEdtiEncodingTypeO = findElement(
				"//div[@class=\"tablePageModalBack\" and not(contains(@style,\"none\"))]//tr[contains(@id,\"TableRow\")]["
						+ rows + "]//select[@id=\"editdescription\"]/option[text()][2]");

		WebElement txtEditDCS = findElement(
				"//div[@class=\"tablePageModalBack\" and not(contains(@style,\"none\"))]//tr[contains(@id,\"TableRow\")]["
						+ rows + "]//input[contains(@id,\"dcs\")]");
		WebElement txtEditToDCS = findElement(
				"//div[@class=\"tablePageModalBack\" and not(contains(@style,\"none\"))]//tr[contains(@id,\"TableRow\")]["
						+ rows + "]//input[contains(@id,\"toDcs\")]");

		String dCSEdit = convertToString(random(9999));
		String toDCSEdit = convertToString(random(9999));

		click(cboEdtiEncodingType);
		cboEncodingTypeText = getText(cboEdtiEncodingTypeO);
		click(cboEdtiEncodingTypeO);

		clearByBackSpace(txtEditDCS);
		sendKeys(txtEditDCS, dCSEdit);

		clearByBackSpace(txtEditToDCS);
		sendKeys(txtEditToDCS, toDCSEdit);

		click(btnEdit);
		sleep(5000);

		refresh();

		visibilityOfElement("//tr[contains(@id,\"ServiceTableRow\")][1]");

		clickOnGoToLast();

		orderService();

		routePointTable = findElement("//tr[contains(@id,\"ServiceTableRow\")][1]//button[contains(@id,\"MTChar\")]");

		click(routePointTable);

		waitExpectedElement("//button[@id=\"AddBtn\"]");

		String encodingTypeE = getText(
				"//div[@class=\"tablePageModalBack\" and not(contains(@style,\"none\"))]//tr[contains(@id,\"TableRow\")]["
						+ rows + "]//td[2]");
		String dCSE = getText(
				"//div[@class=\"tablePageModalBack\" and not(contains(@style,\"none\"))]//tr[contains(@id,\"TableRow\")]["
						+ rows + "]//td[3]");
		String toDSCE = getText(
				"//div[@class=\"tablePageModalBack\" and not(contains(@style,\"none\"))]//tr[contains(@id,\"TableRow\")]["
						+ rows + "]//td[4]");

		System.out.println("----------------------Creation Verification--------------------------");
		System.out.println("Info Selected");
		System.out.println("Encoding Type: " + cboEncodingTypeText);
		System.out.println("DCS: " + dCSEdit);
		System.out.println("To DCS: " + toDCSEdit);
		System.out.println("Info After Edition------------------------------");
		System.out.println("Encoding Type: " + encodingTypeE);
		System.out.println("DCS: " + dCSE);
		System.out.println("To DCS: " + toDSCE);

		boolean edited = false;

		if (encodingTypeE.equals(cboEncodingTypeText) && dCSE.equals(dCSEdit) && toDSCE.equals(toDCSEdit)) {
			edited = true;
		}

		System.out.println("Record edited successfully: " + edited);
		assertTrue(edited, editionRecord);

	}

	public void deleteMTChar() {

		verification();

		WebElement routePointTable = findElement(
				"//tr[contains(@id,\"ServiceTableRow\")][1]//button[contains(@id,\"MTChar\")]");

		click(routePointTable);

		waitExpectedElement("//button[@id=\"AddBtn\"]");

		int rowsB = rows(
				"//div[@class=\"tablePageModalBack\" and not(contains(@style,\"none\"))]//tr[contains(@id,\"TableRow\")]");

		WebElement btnDelete = findElement(
				"//div[@class=\"tablePageModalBack\" and not(contains(@style,\"none\"))]//tr[contains(@id,\"TableRow\")]["
						+ rowsB + "]//button[contains(@id,\"delete\")]");
		click(btnDelete);
		sleep(5000);

		refresh();

		visibilityOfElement("//tr[contains(@id,\"ServiceTableRow\")][1]");

		clickOnGoToLast();

		orderService();

		routePointTable = findElement("//tr[contains(@id,\"ServiceTableRow\")][1]//button[contains(@id,\"MTChar\")]");

		click(routePointTable);

		waitExpectedElement("//button[@id=\"AddBtn\"]");

		int rowsA = rows(
				"//div[@class=\"tablePageModalBack\" and not(contains(@style,\"none\"))]//tr[contains(@id,\"TableRow\")]");

		boolean deleted = greaterThanInt(rowsB, rowsA);

		System.out.println("Record deleted Sucessfully: " + deleted);
		assertTrue(deleted, deletionRecord);

	}

	// MSG Props
	public void createMSGProps() {

		verification();

		WebElement msgPropsTable = findElement(
				"//tr[contains(@id,\"ServiceTableRow\")][1]//button[contains(@id,\"msg\")]");

		click(msgPropsTable);

		waitExpectedElement("//button[@id=\"AddBtn\"]");

		int rowsB = rows(
				"//div[@class=\"tablePageModalBack\" and not(contains(@style,\"none\"))]//tr[contains(@id,\"TableRow\")]");

		String dCS = convertToString(random(999));
		String eSM = convertToString(random(9999));

		selectDirection();

		fillOutMSGPropsDCS(dCS);
		fillOutESM(eSM);

		selectBIM();
		selectUDH();
		selectRuleType();

		clickOnAddMSGProps();

		refresh();

		visibilityOfElement("//tr[contains(@id,\"ServiceTableRow\")][1]");

		clickOnGoToLast();

		orderService();

		msgPropsTable = findElement("//tr[contains(@id,\"ServiceTableRow\")][1]//button[contains(@id,\"msg\")]");

		click(msgPropsTable);

		waitExpectedElement("//button[@id=\"AddBtn\"]");

		int rowsA = rows(
				"//div[@class=\"tablePageModalBack\" and not(contains(@style,\"none\"))]//tr[contains(@id,\"TableRow\")]");

		boolean created = greaterThanInt(rowsA, rowsB);

		System.out.println("Record Created: " + created);
		assertTrue(created, createdUnSuccesfully);

		String directionA = getText(
				"//div[@class=\"tablePageModalBack\" and not(contains(@style,\"none\"))]//tr[contains(@id,\"TableRow\")]["
						+ rowsA + "]//td[2]");
		String dCSA = getText(
				"//div[@class=\"tablePageModalBack\" and not(contains(@style,\"none\"))]//tr[contains(@id,\"TableRow\")]["
						+ rowsA + "]//td[5]");
		String eSMA = getText(
				"//div[@class=\"tablePageModalBack\" and not(contains(@style,\"none\"))]//tr[contains(@id,\"TableRow\")]["
						+ rowsA + "]//td[6]");
		String bINA = getText(
				"//div[@class=\"tablePageModalBack\" and not(contains(@style,\"none\"))]//tr[contains(@id,\"TableRow\")]["
						+ rowsA + "]//td[7]");
		String uDHA = getText(
				"//div[@class=\"tablePageModalBack\" and not(contains(@style,\"none\"))]//tr[contains(@id,\"TableRow\")]["
						+ rowsA + "]//td[8]");
		String ruleTypeA = getText(
				"//div[@class=\"tablePageModalBack\" and not(contains(@style,\"none\"))]//tr[contains(@id,\"TableRow\")]["
						+ rowsA + "]//td[9]");

		System.out.println("----------------------Creation Verification--------------------------");
		System.out.println("Info Selected");
		System.out.println("Direction: " + cboDirectionText);
		System.out.println("DCS: " + dCS);
		System.out.println("ESM: " + eSM);
		System.out.println("BIM: " + cboBIMText);
		System.out.println("UDH: " + cboUDHText);
		System.out.println("Rule Type: " + cboRuleTypeText);
		System.out.println("Info After Creation------------------------------");
		System.out.println("Direction: " + directionA);
		System.out.println("DCS: " + dCSA);
		System.out.println("ESM: " + eSMA);
		System.out.println("BIM: " + bINA);
		System.out.println("UDH: " + uDHA);
		System.out.println("Rule Type: " + ruleTypeA);

		created = false;

		if (directionA.equals(cboDirectionText) && dCSA.equals(dCS) && eSMA.equals(eSM) && bINA.equals(cboBIMText) 
				&& uDHA.equals(cboUDHText) && ruleTypeA.equals(cboRuleTypeText)) {
			created = true;
		}

		System.out.println("Record created successfully: " + created);
		assertTrue(created, createdUnSuccesfully);

	}
	
	
	//Pending until the bug presented is solved
	
	public void editMSGProps() {
		
		pending();
		
		/*
		verification();

		WebElement routePointTable = findElement(
				"//tr[contains(@id,\"ServiceTableRow\")][1]//button[contains(@id,\"MTChar\")]");

		click(routePointTable);

		waitExpectedElement("//button[@id=\"AddBtn\"]");

		int rows = rows(
				"//div[@class=\"tablePageModalBack\" and not(contains(@style,\"none\"))]//tr[contains(@id,\"TableRow\")]");

		WebElement btnEdit = findElement(
				"//div[@class=\"tablePageModalBack\" and not(contains(@style,\"none\"))]//tr[contains(@id,\"TableRow\")]["
						+ rows + "]//button[contains(@id,\"edit\")]");
		click(btnEdit);

		WebElement cboEdtiEncodingType = findElement(
				"//div[@class=\"tablePageModalBack\" and not(contains(@style,\"none\"))]//tr[contains(@id,\"TableRow\")]["
						+ rows + "]//select[@id=\"editdescription\"]");
		WebElement cboEdtiEncodingTypeO = findElement(
				"//div[@class=\"tablePageModalBack\" and not(contains(@style,\"none\"))]//tr[contains(@id,\"TableRow\")]["
						+ rows + "]//select[@id=\"editdescription\"]/option[text()][2]");

		WebElement txtEditDCS = findElement(
				"//div[@class=\"tablePageModalBack\" and not(contains(@style,\"none\"))]//tr[contains(@id,\"TableRow\")]["
						+ rows + "]//input[contains(@id,\"dcs\")]");
		WebElement txtEditToDCS = findElement(
				"//div[@class=\"tablePageModalBack\" and not(contains(@style,\"none\"))]//tr[contains(@id,\"TableRow\")]["
						+ rows + "]//input[contains(@id,\"toDcs\")]");

		String dCSEdit = convertToString(random(9999));
		String toDCSEdit = convertToString(random(9999));

		click(cboEdtiEncodingType);
		cboEncodingTypeText = getText(cboEdtiEncodingTypeO);
		click(cboEdtiEncodingTypeO);

		clearByBackSpace(txtEditDCS);
		sendKeys(txtEditDCS, dCSEdit);

		clearByBackSpace(txtEditToDCS);
		sendKeys(txtEditToDCS, toDCSEdit);

		click(btnEdit);
		sleep(5000);

		refresh();

		visibilityOfElementXpath("//tr[contains(@id,\"ServiceTableRow\")][1]");

		clickOnGoToLast();

		orderService();

		routePointTable = findElement("//tr[contains(@id,\"ServiceTableRow\")][1]//button[contains(@id,\"MTChar\")]");

		click(routePointTable);

		waitExpectedElement("//button[@id=\"AddBtn\"]");

		String encodingTypeE = getText(
				"//div[@class=\"tablePageModalBack\" and not(contains(@style,\"none\"))]//tr[contains(@id,\"TableRow\")]["
						+ rows + "]//td[2]");
		String dCSE = getText(
				"//div[@class=\"tablePageModalBack\" and not(contains(@style,\"none\"))]//tr[contains(@id,\"TableRow\")]["
						+ rows + "]//td[3]");
		String toDSCE = getText(
				"//div[@class=\"tablePageModalBack\" and not(contains(@style,\"none\"))]//tr[contains(@id,\"TableRow\")]["
						+ rows + "]//td[4]");

		System.out.println("----------------------Creation Verification--------------------------");
		System.out.println("Info Selected");
		System.out.println("Encoding Type: " + cboEncodingTypeText);
		System.out.println("DCS: " + dCSEdit);
		System.out.println("To DCS: " + toDCSEdit);
		System.out.println("Info After Edition------------------------------");
		System.out.println("Encoding Type: " + encodingTypeE);
		System.out.println("DCS: " + dCSE);
		System.out.println("To DCS: " + toDSCE);

		boolean edited = false;

		if (encodingTypeE.equals(cboEncodingTypeText) && dCSE.equals(dCSEdit) && toDSCE.equals(toDCSEdit)) {
			edited = true;
		}

		System.out.println("Record edited successfully: " + edited);
		assertTrue(edited, editionRecord);
	*/
	}

	public void deleteMSGProps() {

		verification();

		WebElement msgPropsTable = findElement(
				"//tr[contains(@id,\"ServiceTableRow\")][1]//button[contains(@id,\"msg\")]");

		click(msgPropsTable);

		waitExpectedElement("//button[@id=\"AddBtn\"]");

		int rowsB = rows(
				"//div[@class=\"tablePageModalBack\" and not(contains(@style,\"none\"))]//tr[contains(@id,\"TableRow\")]");

		WebElement btnDelete = findElement(
				"//div[@class=\"tablePageModalBack\" and not(contains(@style,\"none\"))]//tr[contains(@id,\"TableRow\")]["
						+ rowsB + "]//button[contains(@id,\"delete\")]");
		click(btnDelete);
		sleep(5000);

		refresh();

		visibilityOfElement("//tr[contains(@id,\"ServiceTableRow\")][1]");

		clickOnGoToLast();

		orderService();

		msgPropsTable = findElement("//tr[contains(@id,\"ServiceTableRow\")][1]//button[contains(@id,\"msg\")]");

		click(msgPropsTable);

		waitExpectedElement("//button[@id=\"AddBtn\"]");

		int rowsA = rows(
				"//div[@class=\"tablePageModalBack\" and not(contains(@style,\"none\"))]//tr[contains(@id,\"TableRow\")]");

		boolean deleted = greaterThanInt(rowsB, rowsA);

		System.out.println("Record deleted Sucessfully: " + deleted);
		assertTrue(deleted, deletionRecord);

	}

}
