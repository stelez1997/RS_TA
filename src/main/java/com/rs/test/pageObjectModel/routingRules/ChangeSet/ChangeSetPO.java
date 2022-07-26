package com.rs.test.pageObjectModel.routingRules.ChangeSet;

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
	@FindBy(xpath = "//div[@class=\"headerMenu\"]//a[contains(@href,\"routing-rules/change-set\")]")
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
	
	@FindBy(xpath = "//td//select[@id=\"addcaseRefTypeName\"]")
	public WebElement cboCaseType;
	
	@FindBy(xpath = "//td//select[@id=\"addcaseRefTypeName\"]/option[text()][1]")
	public WebElement cboCaseTypeO;

	@FindBy(xpath = "//input[@name=\"caseRef\"]")
	public WebElement txtCase;

	@FindBy(xpath = "//input[@name=\"description\"]")
	public WebElement txtDescription;
	
	@FindBy(xpath = "//tr[contains(@id, \"SetInputRow\")]//div[@class=\"react-datepicker__input-container\"]/input")
	public WebElement dtpScheduled;
	
	@FindBy(xpath = "//div[@aria-selected=\"true\"]")
	public WebElement dtpScheduledO;
	
	@FindBy(xpath = "//button[@id=\"Change SetAddBtn\"]")
	public WebElement btnAddChangeSet;
	
	//Message classification
	
	@FindBy(xpath = "//td//select[@name=\"adddirectionName\"]")
	public WebElement cboDirection;
	
	@FindBy(xpath = "//td//select[@name=\"addmessageTypeName\"]")
	public WebElement cboHubId;
	
	@FindBy(xpath = "//td//select[@name=\"addclassificationName\"]")
	public WebElement cboMessageClassification;
	
	@FindBy(xpath = "//td//select[@name=\"addclassificationName\"]//ancestor::td//following-sibling::td//input[@name=\"origMsisdn\"]")
	public WebElement txtOrigMSISDN;
	
	@FindBy(xpath = "//td//select[@name=\"addclassificationName\"]//ancestor::td//following-sibling::td//select[@name=\"addorigCountry\"]")
	public WebElement cboOrigCC;
	
	@FindBy(xpath = "//td//select[@name=\"addclassificationName\"]//ancestor::td//following-sibling::td//select[@name=\"addorigPrefix\"]")
	public WebElement cboOrigPrefix;
	
	@FindBy(xpath = "//td//select[@name=\"addclassificationName\"]//ancestor::td//following-sibling::td//select[@name=\"addorigPeerName\"]")
	public WebElement cboOrigPeer;
	
	@FindBy(xpath = "//td//select[@name=\"addclassificationName\"]//ancestor::td//following-sibling::td//select[@name=\"addorigServiceName\"]")
	public WebElement cboOrigCS;
	
	@FindBy(xpath = "//td//select[@name=\"addclassificationName\"]//ancestor::td//following-sibling::td//select[@name=\"adddestCountry\"]")
	public WebElement cboDestCC;
	
	@FindBy(xpath = "//td//select[@name=\"addclassificationName\"]//ancestor::td//following-sibling::td//select[@name=\"adddestPrefix\"]")
	public WebElement cboDestPrefix;
	
	@FindBy(xpath = "//td//select[@name=\"addclassificationName\"]//ancestor::td//following-sibling::td//select[@name=\"adddestServiceName\"]")
	public WebElement cboDestCS;
	
	@FindBy(xpath = "//td//select[@name=\"addclassificationName\"]//ancestor::td//following-sibling::td//select[@name=\"addroutePointDisplay\"]")
	public WebElement cboRoute;
	
	@FindBy(xpath = "//td//select[@name=\"addclassificationName\"]//ancestor::td//following-sibling::td//select[@name=\"addlogAgentName\"]")
	public WebElement cboLogAgent;
	
	@FindBy(xpath = "//td//select[@name=\"addclassificationName\"]//ancestor::td//following-sibling::td//select[@name=\"addactionTemplateName\"]")
	public WebElement cboTemplate;

	
	
	@FindBy(xpath = "//button[@id=\"Change Set Routing RulesAddBtn\"]")
	public WebElement btnAddRoutingRulesChangeSet;

	//MSG Props
	
	@FindBy(xpath = "//input[@name=\"dcs\"]")
	public WebElement txtDCS;
	
	@FindBy(xpath = "//input[@name=\"esm\"]")
	public WebElement txtESM;
	
	@FindBy(xpath = "//select[@name=\"addbin\"]")
	public WebElement cboBIN;
	
	@FindBy(xpath = "//select[@name=\"addbin\"]/option[text()][1]")
	public WebElement cboBINO;
	
	@FindBy(xpath = "//select[@name=\"addudh\"]")
	public WebElement cboUDH;
	
	@FindBy(xpath = "//select[@name=\"addudh\"]/option[text()][1]")
	public WebElement cboUDHO;
	
	@FindBy(xpath = "//select[@name=\"addrouteRuleType\"]")
	public WebElement cboRuleType;
	
	@FindBy(xpath = "//select[@name=\"addrouteRuleType\"]/option[text()][1]")
	public WebElement cboRuleTypeO;
	
	@FindBy(xpath = "//div[@class=\"tablePageModalBack\" and not(contains(@style,\"none\"))]//button[@id=\"AddBtn\"]")
	public WebElement btnAddMSGProps;

	// Search

	@FindBy(xpath = "//button[@id=\"searchBtn\"]")
	public WebElement btnSearch;

	@FindBy(xpath = "//div[@class=\"searchBarElement\"]//child::select")
	public WebElement cboSearchHubId;


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
	
	public void selectCaseType() {
		
		click(cboCaseType);
		sleep(1000);
		cboCaseTypeText = getText(cboCaseTypeO);
		click(cboCaseTypeO);
		
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
	int j = 0;
	public void selectDirection() {
		
		click(cboDirection);
		sleep(1000);
		WebElement directionO = findElement("//td//select[@name=\"adddirectionName\"]//option[text()=\""+dataB.get(j)+"\"]");
		click(directionO);
		j++;
		
	}
	
	public void selectHubId() {
		
		click(cboHubId);
		sleep(1000);
		WebElement hubIdO = findElement("//td//select[@name=\"adddirectionName\"]//ancestor::td//following-sibling::td//select[@name=\"addmessageTypeName\"]/option[text()=\""+dataB.get(j)+"\"]");
		click(hubIdO);
		j++;
		
	}
	
	
	public void selectMessageClassification() {
		
		click(cboMessageClassification);
		sleep(1000);
		WebElement cboMessageClassificationO = findElement("//td//select[@name=\"adddirectionName\"]//ancestor::td//following-sibling::td//select[@name=\"addclassificationName\"]/option[text()=\""+dataB.get(j)+"\"]");
		click(cboMessageClassificationO);
		j++;
		
	}
	
	public void fillOutOrigMSISDN() {
		sendKeys(txtOrigMSISDN, dataB.get(j));
		j++;
	}

	public void selectOrigCC() {
		
		click(cboOrigCC);
		sleep(1000);
		WebElement cboOrigCCO = findElement("//td//select[@name=\"adddirectionName\"]//ancestor::td//following-sibling::td//select[@name=\"addorigCountry\"]/option[text()=\""+dataB.get(j)+"\"]");
		click(cboOrigCCO);
		j++;
		
	}
	
	public void selectOrigPrefix() {
		
		click(cboOrigPrefix);
		sleep(1000);
		WebElement cboOrigPrefixO = findElement("//td//select[@name=\"adddirectionName\"]//ancestor::td//following-sibling::td//select[@name=\"addorigPrefix\"]/option[text()=\""+dataB.get(j)+"\"]");
		click(cboOrigPrefixO);
		j++;
		
	}
	
	public void selectOrigPeer() {
		
		click(cboOrigPeer);
		sleep(1000);
		WebElement cboOrigPeerO = findElement("//td//select[@name=\"adddirectionName\"]//ancestor::td//following-sibling::td//select[@name=\"addorigPeerName\"]/option[text()=\""+dataB.get(j)+"\"]");
		click(cboOrigPeerO);
		j++;
		
	}
	
	public void selectOrigCS() {
		
		click(cboOrigCS);
		sleep(1000);
		WebElement cboOrigCSO = findElement("//td//select[@name=\"adddirectionName\"]//ancestor::td//following-sibling::td//select[@name=\"addorigServiceName\"]/option[text()=\""+dataB.get(j)+"\"]");
		click(cboOrigCSO);
		j++;
		
	}
	
	public void selectDestCC() {
		
		click(cboDestCC);
		sleep(1000);
		WebElement cboDestCCO = findElement("//td//select[@name=\"adddirectionName\"]//ancestor::td//following-sibling::td//select[@name=\"adddestCountry\"]/option[text()=\""+dataB.get(j)+"\"]");
		click(cboDestCCO);
		j++;
		
	}
	
	public void selectDestPrefix() {
		
		click(cboDestPrefix);
		sleep(1000);
		WebElement cboDestPrefixO = findElement("//td//select[@name=\"adddirectionName\"]//ancestor::td//following-sibling::td//select[@name=\"adddestPrefix\"]/option[text()=\""+dataB.get(j)+"\"]");
		click(cboDestPrefixO);
		j++;
		
	}
	
	public void selectDestCS() {
		
		click(cboDestCS);
		sleep(1000);
		WebElement cboDestCSO = findElement("//td//select[@name=\"adddirectionName\"]//ancestor::td//following-sibling::td//select[@name=\"adddestServiceName\"]/option[text()=\""+dataB.get(j)+"\"]");
		click(cboDestCSO);
		j++;
		
	}
	
	public void selectRoute() {
		
		click(cboRoute);
		sleep(1000);
		WebElement cboRouteO = findElement("//td//select[@name=\"adddirectionName\"]//ancestor::td//following-sibling::td//select[@name=\"addroutePointDisplay\"]/option[text()=\""+dataB.get(j)+"\"]");
		click(cboRouteO);
		j++;
		
	}
	
	public void selectLogAgent() {
		
		click(cboLogAgent);
		sleep(1000);
		WebElement cboLogAgentO = findElement("//td//select[@name=\"adddirectionName\"]//ancestor::td//following-sibling::td//select[@name=\"addlogAgentName\"]/option[text()=\""+dataB.get(j)+"\"]");
		click(cboLogAgentO);
		j++;
		
	}
	
	public void selectTemplate() {
		
		click(cboTemplate);
		sleep(1000);
		WebElement cboTemplateO = findElement("//td//select[@name=\"adddirectionName\"]//ancestor::td//following-sibling::td//select[@name=\"addactionTemplateName\"]/option[text()=\""+dataB.get(j)+"\"]");
		click(cboTemplateO);
		j++;
		
	}
	
	
	public void clickOnAddRoutingRulesChangeSet() {
		click(btnAddRoutingRulesChangeSet);
		sleep(8000);
	}
	
	//MSG Props
	
	public void fillOutDCS(String text) {
		sendKeys(txtDCS, text);
	}
	
	public void fillOutESM(String text) {
		sendKeys(txtESM, text);
	}
	
	public void selectBIN() {
		
		click(cboBIN);
		sleep(1000);
		cboBINText = getText(cboBINO);
		dataB.add(cboBINText);
		click(cboBINO);
		
	}
	
	public void selectUDH() {
		
		click(cboUDH);
		sleep(1000);
		cboUDHText = getText(cboUDHO);
		dataB.add(cboUDHText);
		click(cboUDHO);
		
	}
	
	public void selectRuleType() {
		
		click(cboRuleType);
		sleep(1000);
		cboRuleTypeText = getText(cboRuleTypeO);
		dataB.add(cboRuleTypeText);
		click(cboRuleTypeO);
		
	}
	
	public void clickOnBtnAddMSGProps() {
		click(btnAddMSGProps);
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
	
	String cboCaseTypeText = "";
	String caseName = "TestTA";
	String description = "Test";
	String dtpScheduledText = "";
	
	//Change set Message Classification
	
	String cboClassificationRuleTypeText ="";
	String cboMessageClassificationText ="";

	public void createChangeSet() {

		loginVerificationPO = new LoginVerificationPO();

		actionsMoveToElementElement(loginVerificationPO.btnRoutingRules);

		clickOnChangeSetMenu();
		
		visibilityOfElement("//tr[contains(@id,\"SetTable\")]");

		actionsMoveToElementElement(btnAddChangeSet);
		
		selectCaseType();

		fillOutCase(caseName);
		
		fillOutDescription(description);
		
		selectScheduled();
		
		dataB.add(cboCaseTypeText);
		dataB.add(caseName);
		dataB.add(description);
		dataB.add(dtpScheduledText);

		clickOnAddChangeSet();

		refresh();
		
		visibilityOfElement("//tr[contains(@id,\"SetTable\")][1]");
		
		String caseTypeA = getText("//tr[contains(@id,\"SetTable\")][1]/td[2]");
		String caseNameA = getText("//tr[contains(@id,\"SetTable\")][1]/td[3]");
		String descriptionA = getText("//tr[contains(@id,\"SetTable\")][1]/td[4]");
		String scheduledA = getText("//tr[contains(@id,\"SetTable\")][1]/td[9]");
		scheduledA = split(scheduledA, ",", 0);
		System.out.println("Split date: "+scheduledA);
		scheduledA = changeDateFormat(scheduledA, "dd/MM/yyyy", "MM/dd/yyyy");
		
		dataA.add(caseTypeA);
		dataA.add(caseNameA);
		dataA.add(descriptionA);
		dataA.add(scheduledA);
		
		
		System.out.println("--------------------------------Creation Verification-------------------------");
		System.out.println("Options Entered--------");
		System.out.println("The Case Type is: " + cboCaseTypeText);
		System.out.println("The Case is: " + caseName);
		System.out.println("The Description is: " + description);
		System.out.println("The Scheduled Date is: " + dtpScheduledText);
	
		System.out.println("Information After Creation--------");
		System.out.println("The Case Type is: " + caseTypeA);
		System.out.println("The Case is: " + caseNameA);
		System.out.println("The Description is: " + descriptionA);
		System.out.println("The Scheduled Date is: " + scheduledA);

		
		verificateData(dataB, dataA);
		

	}
	
	

	// Verfication before editing or deleting the record

	public void verification() {

		loginVerificationPO = new LoginVerificationPO();

		actionsMoveToElementElement(loginVerificationPO.btnRoutingRules);

		clickOnChangeSetMenu();
		
		visibilityOfElement("//tr[contains(@id,\"SetTable\")][1]");

		actionsMoveToElementElement(btnAddChangeSet);
		
		String caseNameV = getText("//tr[contains(@id,\"SetTable\")][1]/td[3]");
		
		boolean creationRecord = false;
		
		if (caseNameV.contains(caseName)) {
			creationRecord = true;
		}

		assertTrue(creationRecord, this.creationRecord);
		
	}
	
	public void editChangeSet() {

			verification();
			
			dataA.clear();
			dataB.clear();
			
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
			
			dataB.add(descriptionEdit);
			dataB.add(dtpScheduledText);
			
			click(btnEdit);
			sleep(5000);
			
			refresh();
			
			visibilityOfElement("//tr[contains(@id,\"SetTable\")][1]");
			
			
			String descriptionA = getText("//tr[contains(@id,\"SetTable\")][1]/td[4]");
			String scheduledA = getText("//tr[contains(@id,\"SetTable\")][1]/td[9]");
			scheduledA = split(scheduledA, ",", 0);
			System.out.println("Split date: "+scheduledA);
			scheduledA = changeDateFormat(scheduledA, "dd/MM/yyyy", "MM/dd/yyyy");
			
			dataA.add(descriptionA);
			dataA.add(scheduledA);
			
			
			System.out.println("--------------------------------Edition Verification-------------------------");
			System.out.println("Options Entered--------");
			System.out.println("The Description is: " + descriptionEdit);
			System.out.println("The Scheduled Date is: " + dtpScheduledText);
			System.out.println("Information After Creation--------");
			System.out.println("The Description is: " + descriptionA);
			System.out.println("The Scheduled Date is: " + scheduledA);
			
			verificateData(dataB, dataA);
				

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
	
	
	public void createRoutingRulesChangeSet() {
		

		

		verification();
		j=0;
		
		WebElement btnCase = findElement("//tr[contains(@id,\"SetTable\")][1]//a");
		click(btnCase);
		
		waitExpectedElement("//tr[contains(@id,\"RulesTable\") and contains(@id,\"Search\")][1]");
		
		dataB.clear();
		dataA.clear();
		/*Direction*/dataB.add("MO");
		/*Hub Id*/dataB.add("SMSx");
		/*Message Classification*/dataB.add("P2P");
		/*Orig MSISDB*/dataB.add("95475257");
		/*Orig CC*/dataB.add("AC");
		/*Orig Prefix*/dataB.add("7");
		/*Orig Peer*/dataB.add("VERISIGN");
		/*Orig CS*/dataB.add("3RIVW");
		/*Dest CC*/dataB.add("AC");
		/*Dest Prefix*/dataB.add("9");
		/*Dest CS*/dataB.add("3RIVW");
		/*Route*/dataB.add("Direct/Open Route");
		/*Log Agent*/dataB.add("3RIVW");
		/*Template*/dataB.add("160_split");
		
		
		int rowsB = rows("//tr[contains(@id,\"RulesTableRow\") and not(contains(@id,\"Search\"))]");
		
		selectDirection();
		
		selectHubId();
		
		selectMessageClassification();
	
		fillOutOrigMSISDN();
		
		selectOrigCC();

		selectOrigPrefix();
		
		selectOrigPeer();
		
		selectOrigCS();

		selectDestCC();
		
		selectDestPrefix();

		selectDestCS();
		
		selectRoute();
		
		selectLogAgent();
		
		selectTemplate();
		
		
		clickOnAddRoutingRulesChangeSet();
		
		refresh();
		
		waitExpectedElement("//tr[contains(@id,\"RulesTable\") and contains(@id,\"Search\")][1]");

		
		int rowsA = rows("//tr[contains(@id,\"RulesTableRow\") and not(contains(@id,\"Search\"))]");
		
		boolean created = greaterThanInt(rowsA, rowsB);
		
		System.out.println("Record Created: "+ created);
		assertTrue(created, createdUnSuccesfully);
		
		created = false;
		
		String cboDirectionA = getText("//tr[contains(@id,\"RulesTableRow\") and not(contains(@id,\"Search\"))]["+rowsA+"]//select[contains(@id,\"editdirectionName\")]//preceding-sibling::div");
		String cboHubIdA = getText("//tr[contains(@id,\"RulesTableRow\") and not(contains(@id,\"Search\"))]["+rowsA+"]//select[contains(@id,\"editmessageTypeName\")]//preceding-sibling::div");
		String cboMessageClassificationA =getText("//tr[contains(@id,\"RulesTableRow\") and not(contains(@id,\"Search\"))]["+rowsA+"]//select[@name=\"editclassificationName\"]//preceding-sibling::div");
		String txtOrigMSISDNA = getText("//tr[contains(@id,\"RulesTableRow\") and not(contains(@id,\"Search\"))]["+rowsA+"]//input[contains(@id,\"origMsisdnEditInput\")]//preceding-sibling::div");
		String cboOrigCCA =getText("//tr[contains(@id,\"RulesTableRow\") and not(contains(@id,\"Search\"))]["+rowsA+"]//select[@name=\"editorigCountry\"]//preceding-sibling::div");
		String cboOrigPrefixA =getText("//tr[contains(@id,\"RulesTableRow\") and not(contains(@id,\"Search\"))]["+rowsA+"]//select[@name=\"editorigPrefix\"]//preceding-sibling::div");
		String cboOrgiPeerA = getText("//tr[contains(@id,\"RulesTableRow\") and not(contains(@id,\"Search\"))]["+rowsA+"]//select[contains(@id,\"editorigPeerName\")]//preceding-sibling::div");
		String cboOrigCSA =getText("//tr[contains(@id,\"RulesTableRow\") and not(contains(@id,\"Search\"))]["+rowsA+"]//select[@name=\"editorigServiceName\"]//preceding-sibling::div");
		String cboDestCCA = getText("//tr[contains(@id,\"RulesTableRow\") and not(contains(@id,\"Search\"))]["+rowsA+"]//select[contains(@id,\"editdestCountry\")]//preceding-sibling::div");
		String cboDestPrefixA =getText("//tr[contains(@id,\"RulesTableRow\") and not(contains(@id,\"Search\"))]["+rowsA+"]//select[@name=\"editdestPrefix\"]//preceding-sibling::div");
		String cboDestCSA =getText("//tr[contains(@id,\"RulesTableRow\") and not(contains(@id,\"Search\"))]["+rowsA+"]//select[@name=\"editdestServiceName\"]//preceding-sibling::div");
		String cboRouteA =getText("//tr[contains(@id,\"RulesTableRow\") and not(contains(@id,\"Search\"))]["+rowsA+"]//select[@name=\"editroutePointDisplay\"]//preceding-sibling::div");
		String cboLogAgentA =getText("//tr[contains(@id,\"RulesTableRow\") and not(contains(@id,\"Search\"))]["+rowsA+"]//select[@name=\"editlogAgentName\"]//preceding-sibling::div");
		String cboTemplateA =getText("//tr[contains(@id,\"RulesTableRow\") and not(contains(@id,\"Search\"))]["+rowsA+"]//select[@name=\"editactionTemplateName\"]//preceding-sibling::div");
		
		/*Direction*/dataA.add(cboDirectionA);
		/*Hub Id*/dataA.add(cboHubIdA);
		/*Message Classification*/dataA.add(cboMessageClassificationA);
		/*Orig MSISDN*/dataA.add(txtOrigMSISDNA);
		/*Orig CC*/dataA.add(cboOrigCCA);
		/*Orig Prefix*/dataA.add(cboOrigPrefixA);
		/*Orig Peer*/dataA.add(cboOrgiPeerA);
		/*Orig CS*/dataA.add(cboOrigCSA);
		/*Dest CC*/dataA.add(cboDestCCA);
		/*Dest Prefix*/dataA.add(cboDestPrefixA);
		/*Dest CS*/dataA.add(cboDestCSA);
		/*Route*/dataA.add(cboRouteA);
		/*Log Agent*/dataA.add(cboLogAgentA);
		/*Template*/dataA.add(cboTemplateA);
		
		int j =0;
		System.out.println("--------------------------------Creation Verification-------------------------");
		System.out.println("Options Entered--------");
		System.out.println("The Direction is: " + dataB.get(j));j++;
		System.out.println("The Hub Id	 is: " + dataB.get(j));j++;
		System.out.println("The Message Classification is: " + dataB.get(j));j++;
		System.out.println("The Orig MSISDN: " + dataB.get(j));j++;
		System.out.println("The Orig CC is: " + dataB.get(j));j++;
		System.out.println("The Orig Prefix is: " + dataB.get(j));j++;
		System.out.println("The Orig Peer is: " + dataB.get(j));j++;
		System.out.println("The Orig CS is: " + dataB.get(j));j++;
		System.out.println("The Dest CC is: " + dataB.get(j));j++;
		System.out.println("The Dest Prefix is: " + dataB.get(j));j++;
		System.out.println("The Dest CS is: " + dataB.get(j));j++;
		System.out.println("The Route is: " + dataB.get(j));j++;
		System.out.println("The Log Agent is: " + dataB.get(j));j++;
		System.out.println("The Template is: " + dataB.get(j));
		j=0;
		System.out.println("Information After Creation--------");
		System.out.println("The Direction is: " + dataA.get(j));j++;
		System.out.println("The Hub Id	 is: " + dataA.get(j));j++;
		System.out.println("The Message Classification is: " + dataA.get(j));j++;
		System.out.println("The Orig MSISDN: " + dataA.get(j));j++;
		System.out.println("The Orig CC is: " + dataA.get(j));j++;
		System.out.println("The Orig Prefix is: " + dataA.get(j));j++;
		System.out.println("The Orig Peer is: " + dataA.get(j));j++;
		System.out.println("The Orig CS is: " + dataA.get(j));j++;
		System.out.println("The Dest CC is: " + dataA.get(j));j++;
		System.out.println("The Dest Prefix is: " + dataA.get(j));j++;
		System.out.println("The Dest CS is: " + dataA.get(j));j++;
		System.out.println("The Route is: " + dataA.get(j));j++;
		System.out.println("The Log Agent is: " + dataA.get(j));j++;
		System.out.println("The Template is: " + dataA.get(j));
		
		verificateData(dataB, dataA);
		

	}
	
	
	public void editRoutingRulesChangeSet() {
		
		dataA.clear();
		dataB.clear();
		
		dataB.clear();
		dataB.add("MT");
		dataB.add("EM");
		dataB.add("A2P");
		dataB.add("95475258");
		dataB.add("AD");
		dataB.add("8");
		dataB.add("A2P_HUB");
		dataB.add("1PTCM");
		dataB.add("AD");
		dataB.add("8");
		dataB.add("1PTCM");
		dataB.add("1PTCM");
		dataB.add("160_truncate");

		verification();
		
		WebElement btnCase = findElement("//tr[contains(@id,\"SetTable\")][1]//a");
		click(btnCase);
		
		waitExpectedElement("//tr[contains(@id,\"RulesTable\") and contains(@id,\"Search\")][1]");

		
		
		int rows = rows("//tr[contains(@id,\"RulesTableRow\") and not(contains(@id,\"Search\"))]");
		
		WebElement btnEdit = findElement("//tr[contains(@id,\"RulesTableRow\") and not(contains(@id,\"Search\"))]["+rows+"]//button[contains(@id,\"edit\")]");
		click(btnEdit);
		sleep(5000);
		
		j = 0;
		WebElement cboDirectionE = findElement("//select[@name=\"editdirectionName\"]");
		WebElement cboDirectionEO = findElement("//select[@name=\"editdirectionName\"]/option[text()=\""+dataB.get(j)+"\"]");
		click(cboDirectionE);
		click(cboDirectionEO);
		j++;
		
		WebElement cbohubIdE = findElement("//select[@name=\"editmessageTypeName\"]");
		WebElement cbohubIdEO = findElement("//select[@name=\"editmessageTypeName\"]/option[text()=\""+dataB.get(j)+"\"]");
		click(cbohubIdE);
		click(cbohubIdEO);
		j++;
		
		WebElement cboMessageClassificationE = findElement("//select[@name=\"editclassificationName\"]");
		WebElement cboMessageClassificationEO = findElement("//select[@name=\"editclassificationName\"]/option[text()=\""+dataB.get(j)+"\"]");
		click(cboMessageClassificationE);
		click(cboMessageClassificationEO);
		j++;
		
		WebElement txtOrigSISDNE = findElement("//td//input[@id=\"origMsisdnEditInput0\" and not(contains(@style,\"none\"))]");
		clearByBackSpace(txtOrigSISDNE);
		sendKeys(txtOrigSISDNE, dataB.get(j));
		j++;
		
		WebElement cboOrigCCE = findElement("//select[@name=\"editorigCountry\"]");
		WebElement cboOrigCCEO = findElement("//select[@name=\"editorigCountry\"]/option[text()=\""+dataB.get(j)+"\"]");
		click(cboOrigCCE);
		click(cboOrigCCEO);
		j++;
		
		WebElement cboOrigPrefixE = findElement("//select[@name=\"editorigPrefix\"]");
		WebElement cboOrigPrefixEO = findElement("//select[@name=\"editorigPrefix\"]/option[text()=\""+dataB.get(j)+"\"]");
		click(cboOrigPrefixE);
		click(cboOrigPrefixEO);
		j++;
		
		WebElement cboOrigPeerE = findElement("//select[@name=\"editorigPeerName\"]");
		WebElement cboOrigPeerEO = findElement("//select[@name=\"editorigPeerName\"]/option[text()=\""+dataB.get(j)+"\"]");
		click(cboOrigPeerE);
		click(cboOrigPeerEO);
		j++;
		
		WebElement cboOrigCSE = findElement("//select[@name=\"editorigServiceName\"]");
		WebElement cboOrigCSEO = findElement("//select[@name=\"editorigServiceName\"]/option[text()=\""+dataB.get(j)+"\"]");
		click(cboOrigCSE);
		click(cboOrigCSEO);
		j++;
		
		WebElement cboDestCCE = findElement("//select[@name=\"editdestCountry\"]");
		WebElement cboDestCCEO = findElement("//select[@name=\"editdestCountry\"]/option[text()=\""+dataB.get(j)+"\"]");
		click(cboDestCCE);
		click(cboDestCCEO);
		j++;
		
		WebElement cboDestPrefixE = findElement("//select[@name=\"editdestPrefix\"]");
		WebElement cboDestPrefixEO = findElement("//select[@name=\"editdestPrefix\"]/option[text()=\""+dataB.get(j)+"\"]");
		click(cboDestPrefixE);
		click(cboDestPrefixEO);
		j++;
		
		WebElement cboDestCSE = findElement("//select[@name=\"editdestServiceName\"]");
		WebElement cboDestCSEO = findElement("//select[@name=\"editdestServiceName\"]/option[text()=\""+dataB.get(j)+"\"]");
		click(cboDestCSE);
		click(cboDestCSEO);
		j++;
		
		WebElement cboLogAgentE = findElement("//select[@name=\"editlogAgentName\"]");
		WebElement cboLogAgentEO = findElement("//select[@name=\"editlogAgentName\"]/option[text()=\""+dataB.get(j)+"\"]");
		click(cboLogAgentE);
		click(cboLogAgentEO);
		j++;
		
		WebElement cboTemplateE = findElement("//select[@name=\"editactionTemplateName\"]");
		WebElement cboTemplateEO = findElement("//select[@name=\"editactionTemplateName\"]/option[text()=\""+dataB.get(j)+"\"]");
		click(cboTemplateE);
		click(cboTemplateEO);
		j++;
		
		
		click(btnEdit);
		sleep(5000);
		
		refresh();
		
		waitExpectedElement("//tr[contains(@id,\"RulesTable\") and contains(@id,\"Search\")][1]");

		dataA.clear();
		
		String cboDirectionA = getText("//tr[contains(@id,\"RulesTableRow\") and not(contains(@id,\"Search\"))]["+rows+"]//select[contains(@id,\"editdirectionName\")]//preceding-sibling::div");
		String cboHubIdA = getText("//tr[contains(@id,\"RulesTableRow\") and not(contains(@id,\"Search\"))]["+rows+"]//select[contains(@id,\"editmessageTypeName\")]//preceding-sibling::div");
		String cboMessageClassificationA =getText("//tr[contains(@id,\"RulesTableRow\") and not(contains(@id,\"Search\"))]["+rows+"]//select[@name=\"editclassificationName\"]//preceding-sibling::div");
		String txtOrigMSISDNA = getText("//tr[contains(@id,\"RulesTableRow\") and not(contains(@id,\"Search\"))]["+rows+"]//input[contains(@id,\"origMsisdnEditInput0\")]//preceding-sibling::div");
		String cboOrigCCA =getText("//tr[contains(@id,\"RulesTableRow\") and not(contains(@id,\"Search\"))]["+rows+"]//select[@name=\"editorigCountry\"]//preceding-sibling::div");
		String cboOrigPrefixA =getText("//tr[contains(@id,\"RulesTableRow\") and not(contains(@id,\"Search\"))]["+rows+"]//select[@name=\"editorigPrefix\"]//preceding-sibling::div");
		String cboOrigPeerA =getText("//tr[contains(@id,\"RulesTableRow\") and not(contains(@id,\"Search\"))]["+rows+"]//select[@name=\"editorigPeerName\"]//preceding-sibling::div");
		String cboOrigCSA =getText("//tr[contains(@id,\"RulesTableRow\") and not(contains(@id,\"Search\"))]["+rows+"]//select[@name=\"editorigServiceName\"]//preceding-sibling::div");
		String cboDestCCA = getText("//tr[contains(@id,\"RulesTableRow\") and not(contains(@id,\"Search\"))]["+rows+"]//select[contains(@id,\"editdestCountry\")]//preceding-sibling::div");
		String cboDestPrefixA =getText("//tr[contains(@id,\"RulesTableRow\") and not(contains(@id,\"Search\"))]["+rows+"]//select[@name=\"editdestPrefix\"]//preceding-sibling::div");
		String cboDestCSA =getText("//tr[contains(@id,\"RulesTableRow\") and not(contains(@id,\"Search\"))]["+rows+"]//select[@name=\"editdestServiceName\"]//preceding-sibling::div");
		String cboLogAgentA = getText("//tr[contains(@id,\"RulesTableRow\") and not(contains(@id,\"Search\"))]["+rows+"]//select[contains(@id,\"editlogAgentName\")]//preceding-sibling::div");
		String cboTemplateA = getText("//tr[contains(@id,\"RulesTableRow\") and not(contains(@id,\"Search\"))]["+rows+"]//select[contains(@id,\"editactionTemplateName\")]//preceding-sibling::div");
		
		dataA.add(cboDirectionA);
		dataA.add(cboHubIdA);
		dataA.add(cboMessageClassificationA);
		dataA.add(txtOrigMSISDNA);
		dataA.add(cboOrigCCA);
		dataA.add(cboOrigPrefixA);
		dataA.add(cboOrigPeerA);
		dataA.add(cboOrigCSA);
		dataA.add(cboDestCCA);
		dataA.add(cboDestPrefixA);
		dataA.add(cboDestCSA);
		dataA.add(cboLogAgentA);
		dataA.add(cboTemplateA);

		System.out.println("--------------------------------Edition Verification-------------------------");
		System.out.println("Options Entered--------");
		System.out.println("The Direction is: " + dataB.get(0));
		System.out.println("The Hub Id	 is: " + dataB.get(1));
		System.out.println("The Message Classification is: " + dataB.get(2));
		System.out.println("The Orig MSISDN: " + dataB.get(3));
		System.out.println("The Orig CC is: " + dataB.get(4));
		System.out.println("The Orig Prefix is: " + dataB.get(5));
		System.out.println("The Orig Peer is: " + dataB.get(6));
		System.out.println("The Orig CS is: " + dataB.get(7));
		System.out.println("The Dest CC is: " + dataB.get(8));
		System.out.println("The Dest Prefix is: " + dataB.get(9));
		System.out.println("The Dest CS is: " + dataB.get(10));
		System.out.println("The Log Agent is: " + dataB.get(11));
		System.out.println("The Template is: " + dataB.get(12));

		System.out.println("Information After Edition--------");
		System.out.println("The Direction is: " + dataA.get(0));
		System.out.println("The Hub Id	 is: " + dataA.get(1));
		System.out.println("The Message Classification is: " + dataA.get(2));
		System.out.println("The Orig MSISDN: " + dataA.get(3));
		System.out.println("The Orig CC is: " + dataA.get(4));
		System.out.println("The Orig Prefix is: " + dataA.get(5));
		System.out.println("The Orig Peer is: " + dataA.get(6));
		System.out.println("The Orig CS is: " + dataA.get(7));
		System.out.println("The Dest CC is: " + dataA.get(8));
		System.out.println("The Dest Prefix is: " + dataA.get(9));
		System.out.println("The Dest CS is: " + dataA.get(10));
		System.out.println("The Log Agent is: " + dataA.get(11));
		System.out.println("The Template is: " + dataA.get(12));
		
		
		verificateData(dataB, dataA);
		
	
	}
	
	public void deleteRoutingRulesChangeSet() {
		
		refresh();
		
		waitExpectedElement("//tr[contains(@id,\"RulesTable\") and contains(@id,\"Search\")][1]");

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
	

	String cboBINText ="";
	String cboUDHText ="";
	String cboRuleTypeText ="";
	public void createChangeSetMSGProps() {
		
		String dcsText = "36";
		String esmText = "1234";
		
		dataB.clear();
		dataA.clear();

		dataB.add(dcsText);
		dataB.add(esmText);

		verification();
		
		WebElement btnCase = findElement("//tr[contains(@id,\"SetTable\")][1]//a");
		click(btnCase);
		
		waitExpectedElement("//tr[contains(@id,\"RulesTable\") and contains(@id,\"Search\")][1]");
		
		WebElement btnMSGProps = findElement("//button[@id=\"msgPropsModalBtn0\"]");
		click(btnMSGProps);
		
		waitExpectedElement(btnAddMSGProps);
		
		fillOutDCS(dcsText);
		fillOutESM(esmText);
		
		selectBIN();
		selectUDH();
		selectRuleType();
		
		clickOnBtnAddMSGProps();
		
		refresh();
		
		waitExpectedElement("//tr[contains(@id,\"RulesTable\") and contains(@id,\"Search\")][1]");
		
		btnMSGProps = findElement("//button[@id=\"msgPropsModalBtn0\"]");
		click(btnMSGProps);
		
		String dcsA = getText("//input[starts-with(@id,\"dcsEdit\")]//preceding-sibling::*");
		String esmA = getText("//input[starts-with(@id,\"esmEdit\")]//preceding-sibling::*");
		String binA = getText("//select[starts-with(@id,\"editbin\")]//preceding-sibling::div");
		String udhA = getText("//select[starts-with(@id,\"editudh\")]//preceding-sibling::div");
		String ruleTypeA = getText("//select[starts-with(@id,\"editrouteRuleType\")]//preceding-sibling::div");
		
		dataA.add(dcsA);
		dataA.add(esmA);
		dataA.add(binA);
		dataA.add(udhA);
		dataA.add(ruleTypeA);
		
		System.out.println("--------------Creation Verification----------------------");
		System.out.println("-----Info Selected");j=0;
		System.out.println("DCS: "+dataB.get(j));j++;
		System.out.println("ESM:"+dataB.get(j));j++;
		System.out.println("BIN:"+dataB.get(j));j++;
		System.out.println("UDH:"+dataB.get(j));j++;
		System.out.println("Rule Type: "+dataB.get(j));
		System.out.println("-----Info After Creation");j=0;
		System.out.println("DCS: "+dataA.get(j));j++;
		System.out.println("ESM:"+dataA.get(j));j++;
		System.out.println("BIN:"+dataA.get(j));j++;
		System.out.println("UDH:"+dataA.get(j));j++;
		System.out.println("Rule Type: "+dataA.get(j));
		
		
		verificateData(dataB, dataA);
		

	}
	
	public void editChangeSetMSGProps() {

		pending();
		

		
		
	}
	
	
	public void deleteChangeSetMSGProps() {
		
		refresh();
		
		waitExpectedElement("//tr[contains(@id,\"RulesTable\") and contains(@id,\"Search\")][1]");

		verification();
		
		WebElement btnCase = findElement("//tr[contains(@id,\"SetTable\")][1]//a");
		click(btnCase);
		
		waitExpectedElement("//tr[contains(@id,\"RulesTable\") and contains(@id,\"Search\")][1]");
		
		WebElement btnMSGProps = findElement("//button[@id=\"msgPropsModalBtn0\"]");
		click(btnMSGProps);
		
		waitExpectedElement(btnAddMSGProps);
		
		int idB = rows("//div[@class=\"tablePageModalBack\" and not(contains(@style,\"none\"))]//tr[starts-with(@id,\"TableRow\")]");
		
		WebElement btnDelete = findElement("//div[@class=\"tablePageModalBack\" and not(contains(@style,\"none\"))]//tr[starts-with(@id,\"TableRow\")][1]//button[contains(@id,\"delete\")]");

		click(btnDelete);
		sleep(5000);

		refresh();

		waitExpectedElement("//tr[contains(@id,\"RulesTable\") and contains(@id,\"Search\")][1]");
		
		btnMSGProps = findElement("//button[@id=\"msgPropsModalBtn0\"]");
		click(btnMSGProps);
			
		waitExpectedElement(btnAddMSGProps);
		

		int idA = rows("//div[@class=\"tablePageModalBack\" and not(contains(@style,\"none\"))]//tr[starts-with(@id,\"TableRow\")]");
		
		boolean deleted = greaterThanInt(idB, idA);
		
		System.out.println("Record deleted successfully: "+deleted);
		
		assertTrue(deleted, deletionRecord);
		
		
	}
	
	
	
	
}
