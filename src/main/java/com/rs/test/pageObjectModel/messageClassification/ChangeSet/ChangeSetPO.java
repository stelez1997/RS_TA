package com.rs.test.pageObjectModel.messageClassification.ChangeSet;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.net.URL;
import java.util.ArrayList;
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
public class ChangeSetPO extends TestBaseSteven {

	public ChangeSetPO() {
		PageFactory.initElements(driver, this);
	}

	// menu
	@FindBy(xpath = "//div[@class=\"headerMenu\"]//a[contains(@href,\"classification/change-set\")]")
	public WebElement menuChangeSet;

	// pagination

	@FindBy(xpath = "//div[@class=\"tablePageSection\"]/div/div/button[text()=\"<<\"]")
	public WebElement btnGoToFirst;

	@FindBy(xpath = "//div[@class=\"tablePageSection\"]/div/div/button[text()=\"<\"]")
	public WebElement btnGoToPrevious;

	@FindBy(xpath = "//div[@class=\"tablePageSection\"]/div/div/button[text()=\">>\"]")
	public WebElement btnGoToLast;

	@FindBy(xpath = "//div[@class=\"tablePageSection\"]/div/div/button[text()=\">\"]")
	public WebElement btnGoToNext;
	
	@FindBy(xpath = "//h1[contains(text(),\"Change Set M\")]//ancestor::div[@class=\"tablePageSectionTitle\"]//following-sibling::div[@class=\"tablePage\"]//button[text()=\"<<\"]")
	public WebElement btnGoToFirstCS;

	@FindBy(xpath = "//h1[contains(text(),\"Change Set M\")]//ancestor::div[@class=\"tablePageSectionTitle\"]//following-sibling::div[@class=\"tablePage\"]//button[text()=\"<\"]")
	public WebElement btnGoToPreviousCS;

	@FindBy(xpath = "//h1[contains(text(),\"Change Set M\")]//ancestor::div[@class=\"tablePageSectionTitle\"]//following-sibling::div[@class=\"tablePage\"]//button[text()=\">>\"]")
	public WebElement btnGoToLastCS;

	@FindBy(xpath = "//h1[contains(text(),\"Change Set M\")]//ancestor::div[@class=\"tablePageSectionTitle\"]//following-sibling::div[@class=\"tablePage\"]//button[text()=\">\"]")
	public WebElement btnGoToNextCS;

	// Create
	
	@FindBy(xpath = "//select[@id=\"addmessageTypeName\"]")
	public WebElement cboHubID;
	
	@FindBy(xpath = "//select[@id=\"addmessageTypeName\"]/option[text()][1]")
	public WebElement cboHubIDO;

	@FindBy(xpath = "//input[@name=\"caseRef\"]")
	public WebElement txtCase;

	@FindBy(xpath = "//input[@name=\"description\"]")
	public WebElement txtDescription;
	
	@FindBy(xpath = "//tr[contains(@id, \"SetInputRow\")]//div[@class=\"react-datepicker__input-container\"]/input")
	public WebElement dtpScheduled;
	
	@FindBy(xpath = "//div[@aria-selected=\"true\"]")
	public WebElement dtpScheduledO;
	
	@FindBy(xpath = "//button[@id=\"Message Classification Change SetAddBtn\"]")
	public WebElement btnAddChangeSet;
	
	//Message classification
	
	@FindBy(xpath = "//select[@name=\"addclassificationTypeName\"]")
	public WebElement cboClassificationRuleType;
	
	@FindBy(xpath = "//select[@id=\"addclassificationTypeName\"]/option[text()][1]")
	public WebElement cboClassificationRuleTypeO;
	
	@FindBy(xpath = "//td//select[@name=\"addclassificationName\"]")
	public WebElement cboMessageClassification;
	
	@FindBy(xpath = "//td//select[@name=\"addclassificationName\"]/option[text()][1]")
	public WebElement cboMessageClassificationO;
	
	@FindBy(xpath = "//td//select[@name=\"addclassificationName\"]//ancestor::td//following-sibling::td[1]//input")
	public WebElement txtEmHubAccount;
	
	@FindBy(xpath = "//td//select[@name=\"addclassificationName\"]//ancestor::td//following-sibling::td[2]//input")
	public WebElement txtDCS;
	
	@FindBy(xpath = "//td//select[@name=\"addclassificationName\"]//ancestor::td//following-sibling::td[3]//input")
	public WebElement txtOrigMSISDNFrom;
	
	@FindBy(xpath = "//td//select[@name=\"addclassificationName\"]//ancestor::td//following-sibling::td[4]//input")
	public WebElement txtOrigMSISDNTo;
	
	@FindBy(xpath = "//td//select[@name=\"addclassificationName\"]//ancestor::td//following-sibling::td[5]//select")
	public WebElement cboOrigCC;
	
	@FindBy(xpath = "//td//select[@name=\"addclassificationName\"]//ancestor::td//following-sibling::td[5]//select/option[text()][1]")
	public WebElement cboOrigCCO;
	
	@FindBy(xpath = "//td//select[@name=\"addclassificationName\"]//ancestor::td//following-sibling::td[6]//select")
	public WebElement cboOrigPrefix;
	
	@FindBy(xpath = "//td//select[@name=\"addclassificationName\"]//ancestor::td//following-sibling::td[6]//select/option[text()][1]")
	public WebElement cboOrigPrefixO;
	
	@FindBy(xpath = "//td//select[@name=\"addclassificationName\"]//ancestor::td//following-sibling::td[7]//select")
	public WebElement cboOrigCS;
	
	@FindBy(xpath = "//td//select[@name=\"addclassificationName\"]//ancestor::td//following-sibling::td[7]//select/option[text()][1]")
	public WebElement cboOrigCSO;
	
	@FindBy(xpath = "//td//select[@name=\"addclassificationName\"]//ancestor::td//following-sibling::td[8]//input")
	public WebElement txtDestMSISDNFrom;
	
	@FindBy(xpath = "//td//select[@name=\"addclassificationName\"]//ancestor::td//following-sibling::td[9]//input")
	public WebElement txtDestMSISDNTo;
	
	@FindBy(xpath = "//td//select[@name=\"addclassificationName\"]//ancestor::td//following-sibling::td[10]//select")
	public WebElement cboDestCC;
	
	@FindBy(xpath = "//td//select[@name=\"addclassificationName\"]//ancestor::td//following-sibling::td[10]//select/option[text()][1]")
	public WebElement cboDestCCO;
	
	@FindBy(xpath = "//td//select[@name=\"addclassificationName\"]//ancestor::td//following-sibling::td[11]//select")
	public WebElement cboDestPrefix;
	
	@FindBy(xpath = "//td//select[@name=\"addclassificationName\"]//ancestor::td//following-sibling::td[11]//select/option[text()][1]")
	public WebElement cboDestPrefixO;
	
	@FindBy(xpath = "//td//select[@name=\"addclassificationName\"]//ancestor::td//following-sibling::td[12]//select")
	public WebElement cboDestCS;
	
	@FindBy(xpath = "//td//select[@name=\"addclassificationName\"]//ancestor::td//following-sibling::td[12]//select/option[text()][1]")
	public WebElement cboDestCSO;
	
	@FindBy(xpath = "//button[@id=\"Change Set Message Classification RulesAddBtn\"]")
	public WebElement btnAddChangeSetMessageClassification;

	

	// Search

	@FindBy(xpath = "//button[@id=\"searchBtn\"]")
	public WebElement btnSearch;

	@FindBy(xpath = "//div[@class=\"searchBarElement\"]//child::select")
	public WebElement cboSearchHubId;
;

	LoginVerificationPO loginVerificationPO;

	// Menu

	public void clickOnChangeSetMenu() {
		click(menuChangeSet);
	}

	// Pagination

	public void clickOnGoToFirst(int pagination) {
		
		if (pagination ==1) {
			click(btnGoToFirst);

			waitExpectedElement("//tr[contains(@id,\"SetTable\")][1]");
		}else {
			click(btnGoToFirstCS);

			waitExpectedElement("//tr[contains(@id,\"SetTable\")][1]");
		}
	}

	public void clickOnGoToPrevious(int pagination) {

		if (pagination ==1) {
			
			click(btnGoToPrevious);
			waitExpectedElement("//tr[contains(@id,\"SetTable\")][1]");
		}else {
			click(btnGoToPreviousCS);

			waitExpectedElement("//tr[contains(@id,\"SetTable\")][1]");
		}
	}

	public void clickOnGoToNext(int pagination) {
		
		if (pagination == 1) {
			click(btnGoToNext);

			waitExpectedElement("//tr[contains(@id,\"SetTable\")][1]");
		} else {
			click(btnGoToNextCS);

			waitExpectedElement("//tr[contains(@id,\"SetTable\")][1]");
		}
	}

	public void clickOnGoToLast(int pagination) {
		
		if (pagination == 1) {
			click(btnGoToLast);

			waitExpectedElement("//tr[contains(@id,\"SetTable\")]");
		} else {
			click(btnGoToLastCS);

			waitExpectedElement("//tr[contains(@id,\"SetTable\")]");
		}
	}

	// Create Methods

	public void fillOutCase(String text) {
		sendKeys(txtCase, text);
	}

	public void fillOutDescription(String text) {
		sendKeys(txtDescription, text);
	}
	
	public void selectHubID() {
		
		click(cboHubID);
		sleep(1000);
		cboHubIdText = getText(cboHubIDO);
		click(cboHubIDO);
		
	}
	
	public void selectScheduled() {
		
		click(dtpScheduled);
		sleep(1000);
		click(dtpScheduledO);
		dtpScheduledText = getAttribute(dtpScheduled, "value");

	}

	public void clickOnAddChangeSet() {
		click(btnAddChangeSet);
		sleep(5000);
	}
	
	
	//Change Set Message Classification
	
	public void selectClassificationRuleType() {
		
		click(cboClassificationRuleType);
		sleep(1000);
		cboClassificationRuleTypeText = getText(cboClassificationRuleTypeO);
		dataB.add(cboClassificationRuleTypeText);
		click(cboClassificationRuleTypeO);
		
	}
	
	public void selectMessageClassification() {
		
		click(cboMessageClassification);
		sleep(1000);
		cboMessageClassificationText = getText(cboMessageClassificationO);
		dataB.add(cboMessageClassificationText);
		click(cboMessageClassificationO);
		
	}

	public void fillOutEmHubAccount(String text) {
		sendKeys(txtEmHubAccount, text);
		dataB.add(text);
	}
	
	public void fillOutDCS(String text) {
		sendKeys(txtDCS, text);
		dataB.add(text);
	}

	public void fillOutOrigMSISDNFrom(String text) {
		sendKeys(txtOrigMSISDNFrom, text);
		dataB.add(text);
	}

	public void fillOutOrigMSISDNTo(String text) {
		sendKeys(txtOrigMSISDNTo, text);
		dataB.add(text);
	}

	public void selectOrigCC() {
		
		click(cboOrigCC);
		sleep(1000);
		cboOrigCCText = getText(cboOrigCCO);
		dataB.add(cboOrigCCText);
		click(cboOrigCCO);
		
	}
	
	public void selectOrigPrefix() {
		
		click(cboOrigPrefix);
		sleep(1000);
		cboOrigPrefixText = getText(cboOrigPrefixO);
		dataB.add(cboOrigPrefixText);
		click(cboOrigPrefixO);
		
	}
	
	public void selectOrigCS() {
		
		click(cboOrigCS);
		sleep(1000);
		cboOrigCSText = getText(cboOrigCSO);
		dataB.add(cboOrigCSText);
		click(cboOrigCSO);
		
	}
	
	public void fillOutDestMSISDNFrom(String text) {
		sendKeys(txtDestMSISDNFrom, text);
		dataB.add(text);
	}
	
	public void fillOutDestMSISDNTo(String text) {
		sendKeys(txtDestMSISDNTo, text);
		dataB.add(text);
	}

	public void selectDestCC() {
		
		click(cboDestCC);
		sleep(1000);
		cboDestCCText = getText(cboDestCCO);
		dataB.add(cboDestCCText);
		click(cboDestCCO);
		
	}
	
	public void selectDestPrefix() {
		
		click(cboDestPrefix);
		sleep(1000);
		cboDestPrefixText = getText(cboDestPrefixO);
		dataB.add(cboDestPrefixText);
		click(cboDestPrefixO);
		
	}
	
	public void selectDestCS() {
		
		click(cboDestCS);
		sleep(1000);
		cboDestCSText = getText(cboDestCSO);
		dataB.add(cboDestCSText);
		click(cboDestCSO);
		
	}
	
	public void clickOnAddChangeSetMessageClassification() {
		click(btnAddChangeSetMessageClassification);
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

	ArrayList<String> dataB = new ArrayList<String>();
	ArrayList<String> dataA = new ArrayList<String>();
	ArrayList<String> dataE = new ArrayList<String>();
	

	// Create
	
	String cboHubIdText = "TATest";
	String caseName = "TATest";
	String description = "Test";
	String dtpScheduledText = "";
	
	//Change set Message Classification
	
	String cboClassificationRuleTypeText ="";
	String cboMessageClassificationText ="";
	String txtEmHubAccountText = "1234";
	String txtDCSText = "63";
	String txtOrigMSISDNFromText = "789";
	String txtOrigMSISDNToText = "987";
	String cboOrigCCText ="";
	String cboOrigPrefixText ="";
	String cboOrigCSText ="";
	String txtDestMSISDNFromText = "1234";
	String txtDestMSISDNToText = "4567";
	String cboDestCCText ="";
	String cboDestPrefixText ="";
	String cboDestCSText ="";

	public void createChangeSet() {

		loginVerificationPO = new LoginVerificationPO();

		actionsMoveToElementElement(loginVerificationPO.btnMessageClassification);

		clickOnChangeSetMenu();

		actionsMoveToElementElement(btnAddChangeSet);
		
		waitExpectedElement("//tr[contains(@id,\"SetTable\")][1]");
		
		int rowsB = rows("//tr[contains(@id,\"SetTable\")]");
		
		selectHubID();

		fillOutCase(caseName);
		
		fillOutDescription(description);
		
		selectScheduled();

		clickOnAddChangeSet();

		refresh();
		
		visibilityOfElement("//tr[contains(@id,\"SetTable\")][1]");
		
		int rowsA = rows("//tr[contains(@id,\"SetTable\")]");
		
		String hubIDA = getText("//tr[contains(@id,\"SetTable\")][1]/td[2]");
		String caseNameA = getText("//tr[contains(@id,\"SetTable\")][1]/td[3]");
		String descriptionA = getText("//tr[contains(@id,\"SetTable\")][1]/td[4]");
		String scheduledA = getText("//tr[contains(@id,\"SetTable\")][1]/td[9]");
		scheduledA = split(scheduledA, ",", 0);
		System.out.println("Split date: "+scheduledA);
		scheduledA = changeDateFormat(scheduledA, "dd/MM/yyyy", "MM/dd/yyyy");
		
		
		System.out.println("--------------------------------Creation Verification-------------------------");
		System.out.println("Options Entered--------");
		System.out.println("The Hub Id is: " + cboHubIdText);
		System.out.println("The Case is: " + caseName);
		System.out.println("The Description is: " + description);
		System.out.println("The Scheduled Date is: " + dtpScheduledText);
	
		System.out.println("Information After Creation--------");
		System.out.println("The Hub Id is: " + hubIDA);
		System.out.println("The Case is: " + caseNameA);
		System.out.println("The Description is: " + descriptionA);
		System.out.println("The Scheduled Date is: " + scheduledA);
		
		boolean created = false;
		
		if (hubIDA.equals(cboHubIdText) && caseNameA.equals(caseName) && descriptionA.equals(description) && dtpScheduledText.equals(scheduledA)) {
			created = true;
		}

		System.out.println("Record created succesfully: "+created);
		assertTrue(created, createdUnSuccesfully);
		

	}
	
	

	// Verfication before editing or deleting the record

	public void verification() {

		loginVerificationPO = new LoginVerificationPO();

		actionsMoveToElementElement(loginVerificationPO.btnMessageClassification);

		clickOnChangeSetMenu();

		actionsMoveToElementElement(btnAddChangeSet);
		
		visibilityOfElement("//tr[contains(@id,\"SetTable\")][1]");
		
		String caseNameV = getText("//tr[contains(@id,\"SetTable\")][1]/td[3]");
		
		boolean creationRecord = false;
		
		if (caseNameV.contains(caseName)) {
			creationRecord = true;
		}

		assertTrue(creationRecord, this.creationRecord);
		
	}
	
	public void editChangeSet() {

			verification();
			
			WebElement btnEdit = findElement("//tr[contains(@id,\"SetTable\")][1]//button[contains(@id,\"edit\")]");
			click(btnEdit);
			
			String descriptionEdit = "TATest1";
			
			WebElement txtDescriptionE = findElement("//tr[contains(@id,\"SetTable\")][1]//input[contains(@id,\"description\")]");
			WebElement dtpScheduledE = findElement("//tr[contains(@id,\"SetTable\")][1]//div[@class=\"react-datepicker-wrapper\"]//input");
			
			clearByBackSpace(txtDescriptionE);
			sendKeys(txtDescriptionE, descriptionEdit);
			
			click(dtpScheduledE);
			sleep(1000);
			WebElement dtpScheduledEO = findElement("//div[@aria-selected=\"true\"]//following-sibling::div[1]");
			click(dtpScheduledEO);
			dtpScheduledText = getAttribute(dtpScheduledE, "value");
			System.out.println("The Date selected is: "+dtpScheduledText);
			
			click(btnEdit);
			sleep(5000);
			
			refresh();
			
			visibilityOfElement("//tr[contains(@id,\"SetTable\")][1]");
			
			
			String descriptionA = getText("//tr[contains(@id,\"SetTable\")][1]/td[4]");
			String scheduledA = getText("//tr[contains(@id,\"SetTable\")][1]/td[9]");
			scheduledA = split(scheduledA, ",", 0);
			System.out.println("Split date: "+scheduledA);
			scheduledA = changeDateFormat(scheduledA, "dd/MM/yyyy", "MM/dd/yyyy");
			
			
			System.out.println("--------------------------------Edition Verification-------------------------");
			System.out.println("Options Entered--------");
			System.out.println("The Description is: " + descriptionEdit);
			System.out.println("The Scheduled Date is: " + dtpScheduledText);
			System.out.println("Information After Creation--------");
			System.out.println("The Description is: " + descriptionA);
			System.out.println("The Scheduled Date is: " + scheduledA);
			
			boolean edited = false;
			
			if (descriptionA.equals(descriptionEdit) && scheduledA.equals(dtpScheduledText)) {
				edited = true;
			}

			System.out.println("Record edited succesfully: "+edited);
			assertTrue(edited, editionRecord);
				

	}

	
	public void deleteChangeSet() {

		verification();
		
		String descriptionB = getText("//tr[contains(@id,\"SetTable\")][1]/td[4]");
		WebElement btnDelete = findElement("//tr[contains(@id,\"SetTable\")][1]//child::button[contains(@id,\"delete\")]");

		click(btnDelete);
		sleep(5000);

		refresh();

		waitExpectedElement("//tr[contains(@id,\"SetTable\")]");
		
		String descriptionA = getText("//tr[contains(@id,\"SetTable\")][1]/td[4]");
		
		System.out.println("--------------------------------Creation Verification-------------------------");
		System.out.println("Options Entered--------");
		System.out.println("The Description before edition is: " + descriptionB);
		System.out.println("Information After Creation--------");
		System.out.println("The Description after edition is: " + descriptionA);
		
		boolean deleted = false;
		
		if (!descriptionA.equals(descriptionB) ) {
			deleted = true;
		}

		System.out.println("Record deleted succesfully: "+deleted);
		assertTrue(deleted, deletionRecord);

	}
	
	
	public void createChangeSetMessageClassification() {

		verification();
		
		WebElement btnCase = findElement("//tr[contains(@id,\"SetTable\")][1]//a");
		click(btnCase);
		
		waitExpectedElement("//tr[contains(@id,\"RulesTable\") and contains(@id,\"Search\")][1]");
		
		
		int rowsB = rows("//tr[contains(@id,\"RulesTableRow\") and not(contains(@id,\"Search\"))]");
		
		selectClassificationRuleType();
		
		selectMessageClassification();
	
		fillOutEmHubAccount(txtEmHubAccountText);

		fillOutDCS(txtDCSText);

		fillOutOrigMSISDNFrom(txtOrigMSISDNFromText);

		fillOutOrigMSISDNTo(txtOrigMSISDNToText);
		
		selectOrigCC();

		selectOrigPrefix();
		
		selectOrigCS();

		fillOutDestMSISDNFrom(txtDestMSISDNFromText);
	
		fillOutDestMSISDNTo(txtDestMSISDNToText);

		selectDestCC();
		
		selectDestPrefix();

		selectDestCS();

		clickOnAddChangeSetMessageClassification();
		
		refresh();
		
		waitExpectedElement("//tr[contains(@id,\"RulesTable\") and contains(@id,\"Search\")][1]");

		
		int rowsA = rows("//tr[contains(@id,\"RulesTableRow\") and not(contains(@id,\"Search\"))]");
		
		boolean created = greaterThanInt(rowsA, rowsB);
		
		System.out.println("Record Created: "+ created);
		assertTrue(created, createdUnSuccesfully);
		
		created = false;
		
		String cboClassificationRuleTypeA =getText("//tr[contains(@id,\"RulesTableRow\") and not(contains(@id,\"Search\"))]["+rowsA+"]//select[@name=\"editclassificationTypeName\"]//preceding-sibling::div");
		String cboMessageClassificationA =getText("//tr[contains(@id,\"RulesTableRow\") and not(contains(@id,\"Search\"))]["+rowsA+"]//select[@name=\"editclassificationName\"]//preceding-sibling::div");
		String txtEmHubAccountA = getText("//tr[contains(@id,\"RulesTableRow\") and not(contains(@id,\"Search\"))]["+rowsA+"]//input[contains(@id,\"emhubAccountIdEditInput\")]//preceding-sibling::div");
		String txtDCSA = getText("//tr[contains(@id,\"RulesTableRow\") and not(contains(@id,\"Search\"))]["+rowsA+"]//input[contains(@id,\"dcsEditInput\")]//preceding-sibling::div");
		String txtOrigMSISDNFromA = getText("//tr[contains(@id,\"RulesTableRow\") and not(contains(@id,\"Search\"))]["+rowsA+"]//input[contains(@id,\"origMsisdnFromEditInput\")]//preceding-sibling::div");
		String txtOrigMSISDNToA = getText("//tr[contains(@id,\"RulesTableRow\") and not(contains(@id,\"Search\"))]["+rowsA+"]//input[contains(@id,\"origMsisdnToEditInput\")]//preceding-sibling::div");
		String cboOrigCCA =getText("//tr[contains(@id,\"RulesTableRow\") and not(contains(@id,\"Search\"))]["+rowsA+"]//select[@name=\"editorigCountry\"]//preceding-sibling::div");
		String cboOrigPrefixA =getText("//tr[contains(@id,\"RulesTableRow\") and not(contains(@id,\"Search\"))]["+rowsA+"]//select[@name=\"editorigPrefix\"]//preceding-sibling::div");
		String cboOrigCSA =getText("//tr[contains(@id,\"RulesTableRow\") and not(contains(@id,\"Search\"))]["+rowsA+"]//select[@name=\"editorigServiceName\"]//preceding-sibling::div");
		String txtDestMSISDNFromA = getText("//tr[contains(@id,\"RulesTableRow\") and not(contains(@id,\"Search\"))]["+rowsA+"]//input[contains(@id,\"destMsisdnFromEditInput\")]//preceding-sibling::div");
		String txtDestMSISDNToA = getText("//tr[contains(@id,\"RulesTableRow\") and not(contains(@id,\"Search\"))]["+rowsA+"]//input[contains(@id,\"destMsisdnToEditInput\")]//preceding-sibling::div");
		String cboDestCCA =getText("//tr[contains(@id,\"RulesTableRow\") and not(contains(@id,\"Search\"))]["+rowsA+"]//select[@name=\"editdestCountry\"]//preceding-sibling::div");
		String cboDestPrefixA =getText("//tr[contains(@id,\"RulesTableRow\") and not(contains(@id,\"Search\"))]["+rowsA+"]//select[@name=\"editdestPrefix\"]//preceding-sibling::div");
		String cboDestCSA =getText("//tr[contains(@id,\"RulesTableRow\") and not(contains(@id,\"Search\"))]["+rowsA+"]//select[@name=\"editdestServiceName\"]//preceding-sibling::div");

		dataA.add(cboClassificationRuleTypeA);
		dataA.add(cboMessageClassificationA);
		dataA.add(txtEmHubAccountA);
		dataA.add(txtDCSA);
		dataA.add(txtOrigMSISDNFromA);
		dataA.add(txtOrigMSISDNToA);
		dataA.add(cboOrigCCA);
		dataA.add(cboOrigPrefixA);
		dataA.add(cboOrigCSA);
		dataA.add(txtDestMSISDNFromA);
		dataA.add(txtDestMSISDNToA);
		dataA.add(cboDestCCA);
		dataA.add(cboDestPrefixA);
		dataA.add(cboDestCSA);

		System.out.println("--------------------------------Creation Verification-------------------------");
		System.out.println("Options Entered--------");
		System.out.println("The Classification Rule Type is: " + cboClassificationRuleTypeText);
		System.out.println("The Message Classification	 is: " + cboMessageClassificationText);
		System.out.println("The EmHub Account	 is: " + txtEmHubAccountText);
		System.out.println("The Dcs is: " + txtDCSText);
		System.out.println("The Orig MSISDN From is: " + txtOrigMSISDNFromText);
		System.out.println("The Orig MSISDN To is: " + txtOrigMSISDNToText);
		System.out.println("The Orig CC is: " + cboOrigCCText);
		System.out.println("The Orig Prefix is: " + cboOrigPrefixText);
		System.out.println("The Orig CS is: " + cboOrigCSText);
		System.out.println("The Dest MSISDN From is: " + txtDestMSISDNFromText);
		System.out.println("The Dest MSISDN To is: " + txtDestMSISDNToText);
		System.out.println("The Dest CC is: " + cboDestCCText);
		System.out.println("The Dest Prefix is: " + cboDestPrefixText);
		System.out.println("The Dest CS is: " + cboDestCSText);

		System.out.println("Information After Creation--------");
		System.out.println("The Classification Rule Type is: " + cboClassificationRuleTypeA);
		System.out.println("The Message Classification	 is: " + cboMessageClassificationA);
		System.out.println("The EmHub Account	 is: " + txtEmHubAccountA);
		System.out.println("The Dcs is: " + txtDCSA);
		System.out.println("The Orig MSISDN From is: " + txtOrigMSISDNFromA);
		System.out.println("The Orig MSISDN To is: " + txtOrigMSISDNToA);
		System.out.println("The Orig CC is: " + cboOrigCCA);
		System.out.println("The Orig Prefix is: " + cboOrigPrefixA);
		System.out.println("The Orig CS is: " + cboOrigCSA);
		System.out.println("The Dest MSISDN From is: " + txtDestMSISDNFromA);
		System.out.println("The Dest MSISDN To is: " + txtDestMSISDNToA);
		System.out.println("The Dest CC is: " + cboDestCCA);
		System.out.println("The Dest Prefix is: " + cboDestPrefixA);
		System.out.println("The Dest CS is: " + cboDestCSA);
		
		verificateData(dataB, dataA);
		

	}
	
	public void editChangeSetMessageClassification() {

		verification();
		
		WebElement btnCase = findElement("//tr[contains(@id,\"SetTable\")][1]//a");
		click(btnCase);
		
		waitExpectedElement("//tr[contains(@id,\"RulesTable\") and contains(@id,\"Search\")][1]");

		
		
		int rows = rows("//tr[contains(@id,\"RulesTableRow\") and not(contains(@id,\"Search\"))]");
		
		WebElement btnEdit = findElement("//tr[contains(@id,\"RulesTableRow\") and not(contains(@id,\"Search\"))]["+rows+"]//button[contains(@id,\"edit\")]");
		click(btnEdit);
		sleep(2000);
		
		dataE.add("content_rule");
		dataE.add("A2P");
		dataE.add("8765");
		dataE.add("47");
		dataE.add("567");
		dataE.add("678");
		dataE.add("13");
		dataE.add("2");
		dataE.add("365WI");
		dataE.add("98765");
		dataE.add("87654");
		dataE.add("13");
		dataE.add("2");
		dataE.add("365WI");
		
		
		
		WebElement cboClassificationRuleTypeE = findElement("//tr[contains(@id,\"RulesTableRow\") and not(contains(@id,\"Search\"))]["+rows+"]//select[@name=\"editclassificationTypeName\"]");
		WebElement cboClassificationRuleTypeEO = findElement("//tr[contains(@id,\"RulesTableRow\") and not(contains(@id,\"Search\"))]["+rows+"]//select[@name=\"editclassificationTypeName\"]/option[text()=\"" + dataE.get(0) + "\"]");
		click(cboClassificationRuleTypeE);
		click(cboClassificationRuleTypeEO);
		
		WebElement cboMessageClassificationE = findElement("//tr[contains(@id,\"RulesTableRow\") and not(contains(@id,\"Search\"))]["+rows+"]//select[@name=\"editclassificationName\"]");
		WebElement cboMessageClassificationEO = findElement("//tr[contains(@id,\"RulesTableRow\") and not(contains(@id,\"Search\"))]["+rows+"]//select[@name=\"editclassificationName\"]/option[text()=\"" + dataE.get(1) + "\"]");
		click(cboMessageClassificationE);
		click(cboMessageClassificationEO);
		
		
		WebElement txtEmHubAccountE = findElement("//tr[contains(@id,\"RulesTableRow\") and not(contains(@id,\"Search\"))]["+rows+"]//input[contains(@id,\"emhubAccountIdEditInput\")]");
		clearByBackSpace(txtEmHubAccountE);
		sendKeys(txtEmHubAccountE, dataE.get(2));
		
		WebElement txtDCSE = findElement("//tr[contains(@id,\"RulesTableRow\") and not(contains(@id,\"Search\"))]["+rows+"]//input[contains(@id,\"dcsEditInput\")]");
		clearByBackSpace(txtDCSE);
		sendKeys(txtDCSE, dataE.get(3));
		
		WebElement txtOrigMSISDNFromE = findElement("//tr[contains(@id,\"RulesTableRow\") and not(contains(@id,\"Search\"))]["+rows+"]//input[contains(@id,\"origMsisdnFromEditInput\")]");
		clearByBackSpace(txtOrigMSISDNFromE);
		sendKeys(txtOrigMSISDNFromE, dataE.get(4));
		
		WebElement txtOrigMSISDNToE = findElement("//tr[contains(@id,\"RulesTableRow\") and not(contains(@id,\"Search\"))]["+rows+"]//input[contains(@id,\"origMsisdnToEditInput\")]");
		clearByBackSpace(txtOrigMSISDNToE);
		sendKeys(txtOrigMSISDNToE, dataE.get(5));
		
		WebElement cboOrigCCE = findElement("//tr[contains(@id,\"RulesTableRow\") and not(contains(@id,\"Search\"))]["+rows+"]//select[@name=\"editorigCountry\"]");
		WebElement cboOrigCCEO = findElement("//tr[contains(@id,\"RulesTableRow\") and not(contains(@id,\"Search\"))]["+rows+"]//select[@name=\"editorigCountry\"]/option[text()=\"" + dataE.get(6) + "\"]");
		click(cboOrigCCE);
		click(cboOrigCCEO);
		
		WebElement cboOrigPrefixE = findElement("//tr[contains(@id,\"RulesTableRow\") and not(contains(@id,\"Search\"))]["+rows+"]//select[@name=\"editorigPrefix\"]");
		WebElement cboOrigPrefixEO = findElement("//tr[contains(@id,\"RulesTableRow\") and not(contains(@id,\"Search\"))]["+rows+"]//select[@name=\"editorigPrefix\"]/option[text()=\"" + dataE.get(7) + "\"]");
		click(cboOrigPrefixE);
		click(cboOrigPrefixEO);
		
		WebElement cboOrigCSE = findElement("//tr[contains(@id,\"RulesTableRow\") and not(contains(@id,\"Search\"))]["+rows+"]//select[@name=\"editorigServiceName\"]");
		WebElement cboOrigCSEO = findElement("//tr[contains(@id,\"RulesTableRow\") and not(contains(@id,\"Search\"))]["+rows+"]//select[@name=\"editorigServiceName\"]/option[text()=\"" + dataE.get(8) + "\"]");
		click(cboOrigCSE);
		click(cboOrigCSEO);
		
		WebElement txtDestMSISDNFromE = findElement("//tr[contains(@id,\"RulesTableRow\") and not(contains(@id,\"Search\"))]["+rows+"]//input[contains(@id,\"destMsisdnFromEditInput\")]");
		clearByBackSpace(txtDestMSISDNFromE);
		sendKeys(txtDestMSISDNFromE, dataE.get(9));
		
		
		WebElement txtDestMSISDNToE = findElement("//tr[contains(@id,\"RulesTableRow\") and not(contains(@id,\"Search\"))]["+rows+"]//input[contains(@id,\"destMsisdnToEditInput\")]");
		clearByBackSpace(txtDestMSISDNToE);
		sendKeys(txtDestMSISDNToE, dataE.get(10));
		
		WebElement cboDestCCE = findElement("//tr[contains(@id,\"RulesTableRow\") and not(contains(@id,\"Search\"))]["+rows+"]//select[@name=\"editdestCountry\"]");
		WebElement cboDestCCEO = findElement("//tr[contains(@id,\"RulesTableRow\") and not(contains(@id,\"Search\"))]["+rows+"]//select[@name=\"editdestCountry\"]/option[text()=\"" + dataE.get(11) + "\"]");
		click(cboDestCCE);
		click(cboDestCCEO);
		
		WebElement cboDestPrefixE = findElement("//tr[contains(@id,\"RulesTableRow\") and not(contains(@id,\"Search\"))]["+rows+"]//select[@name=\"editdestPrefix\"]");
		WebElement cboDestPrefixEO = findElement("//tr[contains(@id,\"RulesTableRow\") and not(contains(@id,\"Search\"))]["+rows+"]//select[@name=\"editdestPrefix\"]/option[text()=\"" + dataE.get(12) + "\"]");
		click(cboDestPrefixE);
		click(cboDestPrefixEO);
		
		WebElement cboDestCSE = findElement("//tr[contains(@id,\"RulesTableRow\") and not(contains(@id,\"Search\"))]["+rows+"]//select[@name=\"editdestServiceName\"]");
		WebElement cboDestCSEO = findElement("//tr[contains(@id,\"RulesTableRow\") and not(contains(@id,\"Search\"))]["+rows+"]//select[@name=\"editdestServiceName\"]/option[text()=\"" + dataE.get(13) + "\"]");
		click(cboDestCSE);
		click(cboDestCSEO);
		
		click(btnEdit);
		sleep(5000);
		
		refresh();
		
		waitExpectedElement("//tr[contains(@id,\"RulesTable\") and contains(@id,\"Search\")][1]");

		dataA.clear();
		
		
		String cboClassificationRuleTypeA =getText("//tr[contains(@id,\"RulesTableRow\") and not(contains(@id,\"Search\"))]["+rows+"]//select[@name=\"editclassificationTypeName\"]//preceding-sibling::div");
		String cboMessageClassificationA =getText("//tr[contains(@id,\"RulesTableRow\") and not(contains(@id,\"Search\"))]["+rows+"]//select[@name=\"editclassificationName\"]//preceding-sibling::div");
		String txtEmHubAccountA = getText("//tr[contains(@id,\"RulesTableRow\") and not(contains(@id,\"Search\"))]["+rows+"]//input[contains(@id,\"emhubAccountIdEditInput\")]//preceding-sibling::div");
		String txtDCSA = getText("//tr[contains(@id,\"RulesTableRow\") and not(contains(@id,\"Search\"))]["+rows+"]//input[contains(@id,\"dcsEditInput\")]//preceding-sibling::div");
		String txtOrigMSISDNFromA = getText("//tr[contains(@id,\"RulesTableRow\") and not(contains(@id,\"Search\"))]["+rows+"]//input[contains(@id,\"origMsisdnFromEditInput\")]//preceding-sibling::div");
		String txtOrigMSISDNToA = getText("//tr[contains(@id,\"RulesTableRow\") and not(contains(@id,\"Search\"))]["+rows+"]//input[contains(@id,\"origMsisdnToEditInput\")]//preceding-sibling::div");
		String cboOrigCCA =getText("//tr[contains(@id,\"RulesTableRow\") and not(contains(@id,\"Search\"))]["+rows+"]//select[@name=\"editorigCountry\"]//preceding-sibling::div");
		String cboOrigPrefixA =getText("//tr[contains(@id,\"RulesTableRow\") and not(contains(@id,\"Search\"))]["+rows+"]//select[@name=\"editorigPrefix\"]//preceding-sibling::div");
		String cboOrigCSA =getText("//tr[contains(@id,\"RulesTableRow\") and not(contains(@id,\"Search\"))]["+rows+"]//select[@name=\"editorigServiceName\"]//preceding-sibling::div");
		String txtDestMSISDNFromA = getText("//tr[contains(@id,\"RulesTableRow\") and not(contains(@id,\"Search\"))]["+rows+"]//input[contains(@id,\"destMsisdnFromEditInput\")]//preceding-sibling::div");
		String txtDestMSISDNToA = getText("//tr[contains(@id,\"RulesTableRow\") and not(contains(@id,\"Search\"))]["+rows+"]//input[contains(@id,\"destMsisdnToEditInput\")]//preceding-sibling::div");
		String cboDestCCA =getText("//tr[contains(@id,\"RulesTableRow\") and not(contains(@id,\"Search\"))]["+rows+"]//select[@name=\"editdestCountry\"]//preceding-sibling::div");
		String cboDestPrefixA =getText("//tr[contains(@id,\"RulesTableRow\") and not(contains(@id,\"Search\"))]["+rows+"]//select[@name=\"editdestPrefix\"]//preceding-sibling::div");
		String cboDestCSA =getText("//tr[contains(@id,\"RulesTableRow\") and not(contains(@id,\"Search\"))]["+rows+"]//select[@name=\"editdestServiceName\"]//preceding-sibling::div");

		dataA.add(cboClassificationRuleTypeA);
		dataA.add(cboMessageClassificationA);
		dataA.add(txtEmHubAccountA);
		dataA.add(txtDCSA);
		dataA.add(txtOrigMSISDNFromA);
		dataA.add(txtOrigMSISDNToA);
		dataA.add(cboOrigCCA);
		dataA.add(cboOrigPrefixA);
		dataA.add(cboOrigCSA);
		dataA.add(txtDestMSISDNFromA);
		dataA.add(txtDestMSISDNToA);
		dataA.add(cboDestCCA);
		dataA.add(cboDestPrefixA);
		dataA.add(cboDestCSA);

		System.out.println("--------------------------------Edition Verification-------------------------");
		System.out.println("Options Entered--------");
		System.out.println("The Classification Rule Type is: " + dataE.get(0));
		System.out.println("The Message Classification	 is: " + dataE.get(1));
		System.out.println("The EmHub Account	 is: " +dataE.get(2) );
		System.out.println("The Dcs is: " + dataE.get(3));
		System.out.println("The Orig MSISDN From is: " +dataE.get(4) );
		System.out.println("The Orig MSISDN To is: " +dataE.get(5) );
		System.out.println("The Orig CC is: " +dataE.get(6) );
		System.out.println("The Orig Prefix is: " + dataE.get(7));
		System.out.println("The Orig CS is: " +dataE.get(8));
		System.out.println("The Dest MSISDN From is: " + dataE.get(9));
		System.out.println("The Dest MSISDN To is: " + dataE.get(10));
		System.out.println("The Dest CC is: " +dataE.get(11) );
		System.out.println("The Dest Prefix is: " + dataE.get(12));
		System.out.println("The Dest CS is: " +dataE.get(13) );

		System.out.println("Information After Creation--------");
		System.out.println("The Classification Rule Type is: " + dataA.get(0));
		System.out.println("The Message Classification	 is: " +  dataA.get(1));
		System.out.println("The EmHub Account	 is: " + dataA.get(2) );
		System.out.println("The Dcs is: " +  dataA.get(3));
		System.out.println("The Orig MSISDN From is: " +  dataA.get(4));
		System.out.println("The Orig MSISDN To is: " + dataA.get(5) );
		System.out.println("The Orig CC is: " +  dataA.get(6));
		System.out.println("The Orig Prefix is: " +  dataA.get(7));
		System.out.println("The Orig CS is: " +  dataA.get(8));
		System.out.println("The Dest MSISDN From is: " +  dataA.get(9));
		System.out.println("The Dest MSISDN To is: " +  dataA.get(10));
		System.out.println("The Dest CC is: " +  dataA.get(11));
		System.out.println("The Dest Prefix is: " +  dataA.get(12));
		System.out.println("The Dest CS is: " +  dataA.get(13));
		
		verificateData(dataE, dataA);
		

	}
	
	public void deleteChangeSetMessageClassification() {

		verification();
		
		WebElement btnCase = findElement("//tr[contains(@id,\"SetTable\")][1]//a");
		click(btnCase);
		
		waitExpectedElement("//tr[contains(@id,\"RulesTable\") and contains(@id,\"Search\")][1]");

		int rowsB = rows("//tr[contains(@id,\"RulesTableRow\") and not(contains(@id,\"Search\"))]");
		
		WebElement btnDelete = findElement("//tr[contains(@id,\"RulesTableRow\") and not(contains(@id,\"Search\"))]["+rowsB+"]//button[contains(@id,\"delete\")]");
		click(btnDelete);
		sleep(5000);
		
		refresh();
		waitExpectedElement("//tr[contains(@id,\"RulesTable\") and contains(@id,\"Search\")][1]");

		int rowsA = rows("//tr[contains(@id,\"RulesTableRow\") and not(contains(@id,\"Search\"))]");
		
		boolean deleted = greaterThanInt(rowsB, rowsA);
		
		System.out.println("Record deleted succesfully: "+deleted);
		
		assertTrue(deleted, deletionRecord);

	}
	
	
	
}
