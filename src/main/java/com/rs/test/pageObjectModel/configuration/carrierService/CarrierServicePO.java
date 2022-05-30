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

	@FindBy(xpath = "//input[@name=\"prefix\"]")
	public WebElement txtPrefix;

	@FindBy(xpath = "//button[@id=\"undefinedAddBtn\"]")
	public WebElement btnAddPrefix;

	LoginVerificationPO loginVerificationPO;

	// Menu

	public void clickOnCarrierServiceMenu() {
		click(menuCarrierService);
		visibilityOfElementXpath("//tr[contains(@id,\"ServiceTableRow\")][1]");
	}


	// Pagination

	public void clickOnGoToLast() {
		click(btnGoToLast);

		visibilityOfElementXpath("//tr[contains(@id,\"ServiceTableRow\")][1]");

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

	// Create
	
	
	String service = "Ztest";
	
	public void createCarrierService() {

		loginVerificationPO = new LoginVerificationPO();

		actionsMoveToElementElement(loginVerificationPO.btnConfiguration);

		clickOnCarrierServiceMenu();

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

		visibilityOfElementXpath("//tr[contains(@id,\"ServiceTableRow\")][1]");

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
		System.out.println("The OACDLookup is: "+ OADCLookupA);

		if (serviceA.equals(service) && countryCodeA.equals(cboCountryCodeText) && OADCLookupA.equals(cboOADCLookpText)) {
			created = true;
		}

		assertTrue(created, createdUnSuccesfully);

		System.out.println("The record was created succesfully: " + created);
		
	}
	
	// Verfication before editing or deleting the record

	public void verification() {
		
		clickOnGoToLast();
		
		int rows = rows("//tr[contains(@id,\"ServiceTableRow\")]");
		boolean record = false;
		
		String service = getText("//tr[contains(@id,\"ServiceTableRow\")]["+rows+"]/td[3]/div");
		
		if (service.contains(this.service)) {
			record = true;
		}
		
		assertTrue(record, creationRecord);
		

	}

	public void editCarrierService() {
		
		loginVerificationPO = new LoginVerificationPO();

		actionsMoveToElementElement(loginVerificationPO.btnConfiguration);

		clickOnCarrierServiceMenu();

		actionsMoveToElementElement(btnGoToFirst);

		verification();

		int rows = rows("//tr[contains(@id,\"ServiceTableRow\")]");
		
		boolean edited = false;

		String serviceE = "Ztest1";

		WebElement txtEditService = findElement("//tr[contains(@id,\"ServiceTableRow\")][" + rows + "]/td[3]/input");
		//CBO
		WebElement cboEditCountryCode = findElement("//tr[contains(@id,\"ServiceTableRow\")][" + rows + "]/td[4]/select");
		WebElement cboEditOADCLookup = findElement("//tr[contains(@id,\"ServiceTableRow\")][" + rows + "]/td[5]/select");
		WebElement cboEditGateway = findElement("//tr[contains(@id,\"ServiceTableRow\")][" + rows + "]/td[8]/select");
		WebElement cboEditMOAction = findElement("//tr[contains(@id,\"ServiceTableRow\")][" + rows + "]/td[11]/select");
		WebElement cboEditMTAction = findElement("//tr[contains(@id,\"ServiceTableRow\")][" + rows + "]/td[12]/select");
		WebElement cboEditCharMapping = findElement("//tr[contains(@id,\"ServiceTableRow\")][" + rows + "]/td[13]/select");
		
		//CBO Options
		
		WebElement cboEditCountryCodeO = findElement("//tr[contains(@id,\"ServiceTableRow\")][" + rows + "]/td[4]/select/option[not(contains(text(),\"Select\")) and text()][2]");
		WebElement cboEditOADCLookupO = findElement("//tr[contains(@id,\"ServiceTableRow\")][" + rows + "]/td[5]/select/option[not(contains(text(),\"Select\")) and text()][2]");
		WebElement cboEditGatewayO = findElement("//tr[contains(@id,\"ServiceTableRow\")][" + rows + "]/td[8]/select/option[not(contains(text(),\"Select\")) and text()][2]");
		WebElement cboEditMOActionO = findElement("//tr[contains(@id,\"ServiceTableRow\")][" + rows + "]/td[11]/select/option[not(contains(text(),\"Select\")) and text()][2]");
		WebElement cboEditMTActionO = findElement("//tr[contains(@id,\"ServiceTableRow\")][" + rows + "]/td[12]/select/option[not(contains(text(),\"Select\")) and text()][2]");
		WebElement cboEditCharMappingO = findElement("//tr[contains(@id,\"ServiceTableRow\")][" + rows + "]/td[13]/select/option[not(contains(text(),\"Select\")) and text()][2]");
		
	
		WebElement btnEdit = findElement("//tr[contains(@id,\"ServiceTableRow\")][" + rows + "]//child::button[contains(@id,\"edit\")]");

		actionsMoveToElementElement(btnEdit);
		click(btnEdit);
		System.out.println("Hizo click en el boton de editar");
		
		actionsMoveToElementElement(txtEditService);
		clear(txtEditService);
		sendKeys(txtEditService, serviceE);
		
		click(cboEditCountryCode);
		cboCountryCodeText = getText(cboEditCountryCodeO);
		click(cboEditCountryCodeO);
		
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

		visibilityOfElementXpath("//tr[contains(@id,\"ServiceTableRow\")][1]");

		refresh();

		visibilityOfElementXpath("//tr[contains(@id,\"ServiceTableRow\")][1]");

		click(btnGoToLast);

		visibilityOfElementXpath("//tr[contains(@id,\"ServiceTableRow\")][1]");
	
		String serviceA = getText("//tr[contains(@id,\"ServiceTableRow\")][" + rows + "]/td[3]/div");
		String countryCodeA = getText("//tr[contains(@id,\"ServiceTableRow\")][" + rows + "]/td[4]/div");
		String OADCLookupA = getText("//tr[contains(@id,\"ServiceTableRow\")][" + rows + "]/td[5]/div");
		String gatewayA = getText("//tr[contains(@id,\"ServiceTableRow\")][" + rows + "]/td[8]/div");
		String charMappingA = getText("//tr[contains(@id,\"ServiceTableRow\")][" + rows + "]/td[13]/div");

		
		System.out.println("-----------------------------Edition Verification------------------------------");
		
		System.out.println("The Information selected is:-------------------------------------------");
		System.out.println("The Service is: " + serviceE);
		System.out.println("The Country Code is: " + cboCountryCodeText);
		System.out.println("The OACDLookup is: "+ cboOADCLookpText);
		System.out.println("The Gateway is: " + cboGatewayText);
		System.out.println("The Char Mapping is: " + cboCharMappingText);
		System.out.println("The Information presented is:-------------------------------------------");
		
		System.out.println("The Service is: " + serviceA);
		System.out.println("The Coutry Code is: " + countryCodeA);
		System.out.println("The OADC Lookup is: " + OADCLookupA);
		System.out.println("The Gateway is: " + gatewayA);
		System.out.println("The Char Mapping is: " + charMappingA);


		if (serviceA.equals(serviceE) && countryCodeA.equals(cboCountryCodeText) && OADCLookupA.equals(cboOADCLookpText)
				&& gatewayA.equals(cboGatewayText) && charMappingA.equals(cboCharMappingText)) {
			edited = true;
		}

		System.out.println("The record was edited with success: " + edited);

		assertTrue(edited, editionRecord);


	}
	
	
	public void deleteCarrierService() {

		loginVerificationPO = new LoginVerificationPO();

		actionsMoveToElementElement(loginVerificationPO.btnConfiguration);

		clickOnCarrierServiceMenu();

		actionsMoveToElementElement(btnGoToFirst);

		verification();
		
		int rows = rows("//tr[contains(@id,\"ServiceTableRow\")]");

		boolean deleted = false;
	

		WebElement btnDelete = findElement("//tr[contains(@id,\"ServiceTableRow\")][" + rows + "]//child::button[contains(@id,\"delete\")]");
		
		//actionsMoveToElementElement(btnDelete);
		click("//div[text()=\"ID\"]");
		click("//div[text()=\"ID\"]");
		
		click(btnDelete);
		sleep(5000);
		
		refresh();

		visibilityOfElementXpath("//tr[contains(@id,\"ServiceTableRow\")][1]");

		click(btnGoToLast);

		visibilityOfElementXpath("//tr[contains(@id,\"ServiceTableRow\")][1]");

		rows = rows("//tr[contains(@id,\"ServiceTableRow\")]");

		String serviceA = getText("//tr[contains(@id,\"ServiceTableRow\")][" + rows + "]/td[3]/div");
		
		System.out.println("---------------------------Deletion Verification--------------------------");
		
		System.out.println("The service is: " + serviceA);

		if (!serviceA.equals(service)) {
			deleted = true;
		}

		System.out.println("The record was deleted with success: " + deleted);

		assertTrue(deleted, deletionRecord);

	}
	
	
	public void filters() {

		loginVerificationPO = new LoginVerificationPO();

		actionsMoveToElementElement(loginVerificationPO.btnConfiguration);

		clickOnCarrierServiceMenu();

		actionsMoveToElementElement(btnGoToFirst);

		clickOnGoToLast();
		
		int rows = rows("//tr[contains(@id,\"Carrier ServiceTableRow\")]");
		
		String carrierService = getText("//tr[contains(@id,\"Carrier ServiceTableRow\")]["+rows+"]/td[3]//child::div");
		String country = getText("//tr[contains(@id,\"Carrier ServiceTableRow\")]["+rows+"]/td[4]//child::div");
		String logAgent = getText("//tr[contains(@id,\"Carrier ServiceTableRow\")]["+rows+"]/td[7]//child::div[text()]");
		System.out.println("----------------country: "+country);
		
		// Carrier Service
		
		fillOutSearchCarrierService(carrierService);
		
		clickOnBtnSearch();
		
		verifyFilter("Carrier Service", carrierService, 3);
		
		clearByBackSpace(txtSearchCarrierService);
	
		
		// Country
		
		clickOnCboSearchCountry();
		
		WebElement countryO = findElement("//div[@class=\"searchBarElement\"][2]//child::option[@value=\"" + country + "\"]");
		
		click(countryO);
		
		clickOnBtnSearch();
		
		verifyFilter("Country", country, 4);
		
		WebElement blank = findElement("//div[@class=\"searchBarElement\"][2]//child::option[contains(text(),\"Select\") or not(text())]");
		
		click(blank);

		// Log Agent
	
		
		fillOutSearchLogAgent(logAgent);
		
		clickOnBtnSearch();
		
		verifyFilter("Log Agent", logAgent, 7);
		
		clearByBackSpace(txtSearchLogAgent);
		
		clickOnBtnSearch();
		
		

	}
	
	
	public void verifyFilter(String filter, String field,int td) {

		int rows = rows("//tr[contains(@id,\"Carrier ServiceTableRow\")]");

		System.out.println("-----------------------------" + filter + " Verification------------------------");

		System.out.println("-----The value selected is: " + field);
		String result = "";
		int j = 1;
		
		

		for (int i = 0; i < rows; i++) {
			result = getText("//tr[contains(@id,\"Carrier ServiceTableRow\")]["+j+"]/td["+td+"]//child::div");
			System.out.println("The results after filtering are: " + result);

			assertTrue(result.equals(field), filtersNotWorking);
	

			j++;

		}


	}

	




}
