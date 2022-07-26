package com.rs.test.pageObjectModel.clusterConfiguration.clusterCallToAction;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.rs.test.base.TestBaseSteven;
import com.rs.test.pageObjectModel.login.LoginVerificationPO;

/**
 * @author stelez
 *
 */
public class ClusterCallToActionPO extends TestBaseSteven {

	public ClusterCallToActionPO() {
		PageFactory.initElements(driver, this);
	}

	// menu
	@FindBy(xpath = "//div[@class=\"headerMenuDropdown\"]/a[contains(text(),\"Cluster Call to Action\")]")
	public WebElement menuClusterCallToAction;

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

	@FindBy(xpath = "//tr[@id=\"Cluster Call To ActionInputRow\"]/td[3]/select")
	public WebElement cboHubID;

	@FindBy(xpath = "//tr[@id=\"Cluster Call To ActionInputRow\"]/td[3]/select/option[1]/following-sibling::option[1]")
	public WebElement cboHubIDOption;

	@FindBy(xpath = "//tr[@id=\"Cluster Call To ActionInputRow\"]/td[4]/select")
	public WebElement cboOrigCS;

	@FindBy(xpath = "//tr[@id=\"Cluster Call To ActionInputRow\"]/td[4]/select/option[1]/following-sibling::option[1]")
	public WebElement cboOrigCSOption;

	@FindBy(xpath = "//input[@name=\"senderId\"]")
	public WebElement txtSenderID;

	@FindBy(xpath = "//tr[@id=\"Cluster Call To ActionInputRow\"]/td[7]/select")
	public WebElement cboClassification;

	@FindBy(xpath = "//tr[@id=\"Cluster Call To ActionInputRow\"]/td[7]/select/option[1]/following-sibling::option[1]")
	public WebElement cboClassificationOption;

	@FindBy(xpath = "//tr[@id=\"Cluster Call To ActionInputRow\"]/td[8]/select")
	public WebElement cboRouteAction;

	@FindBy(xpath = "//tr[@id=\"Cluster Call To ActionInputRow\"]/td[8]/select/option[1]/following-sibling::option[1]")
	public WebElement cboRouteActionOption;

	@FindBy(xpath = "//button[@id=\"Cluster Call To ActionAddBtn\"]")
	public WebElement btnAddClusterCallToAction;

	// Search

	@FindBy(xpath = "//div[@class=\"searchBarElement\"][1]//child::select")
	public WebElement cboSearchHubID;

	@FindBy(xpath = "//div[@class=\"searchBarElement\"][1]//child::select/option[contains(text(),\"Select\") or not(text())]")
	public WebElement cboSearchHubIDO;

	@FindBy(xpath = "//div[@class=\"searchBarElement\"][2]//child::select")
	public WebElement cboSearchOrigCS;

	@FindBy(xpath = "//div[@class=\"searchBarElement\"][2]//child::select/option[contains(text(),\"Select\") or not(text())]")
	public WebElement cboSearchOrigCSO;

	@FindBy(xpath = "//div[@class=\"searchBarElement\"][5]//child::select")
	public WebElement cboSearchClassification;

	@FindBy(xpath = "//div[@class=\"searchBarElement\"][5]//child::select/option[contains(text(),\"Select\") or not(text())]")
	public WebElement cboSearchClassificationO;

	@FindBy(xpath = "//div[@class=\"searchBarElement\"][6]//child::select")
	public WebElement cboSearchRouteAction;

	@FindBy(xpath = "//div[@class=\"searchBarElement\"][6]//child::select/option[contains(text(),\"Select\") or not(text())]")
	public WebElement cboSearchRouteActionO;

	@FindBy(xpath = "//button[contains(@id,\"searchBtn\")]")
	public WebElement btnSearch;

	@FindBy(xpath = "//div[@class=\"searchBarElement\"][3]//child::input")
	public WebElement txtSearchSenderID;

	LoginVerificationPO loginVerificationPO;

	// Menu

	public void clickOnClusterCallToActionMenu() {
		click(menuClusterCallToAction);
	}

	// Pagination

	public void clickOnGoToFirst() {
		click(btnGoToFirst);
		visibilityOfElement("//tr[contains(@id,\"Cluster Call To ActionTableRow\")][1]");
	}

	public void clickOnGoToPrevious() {
		click(btnGoToPrevious);
		visibilityOfElement("//tr[contains(@id,\"Cluster Call To ActionTableRow\")][1]");
	}

	public void clickOnGoToNext() {
		click(btnGoToNext);
		visibilityOfElement("//tr[contains(@id,\"Cluster Call To ActionTableRow\")][1]");
	}

	public void clickOnGoToLast() {
		click(btnGoToLast);
		visibilityOfElement("//tr[contains(@id,\"Cluster Call To ActionTableRow\")][1]");
	}

	// Create Methods

	public void fillOutSenderID(String text) {
		sendKeys(txtSenderID, text);
	}

	public void selectCboHubID() {

		click(cboHubID);
		cboHubIdText = getText(cboHubIDOption);
		click(cboHubIDOption);
	}

	public void selectCboOrigCS() {

		click(cboOrigCS);
		cboOrigCSText = getText(cboOrigCSOption);
		click(cboOrigCSOption);
	}

	public void selectCboClassification() {

		click(cboClassification);
		cboClassificationText = getText(cboClassificationOption);
		click(cboClassificationOption);
	}

	public void selectCboRouteAction() {

		click(cboRouteAction);
		cboRouteActionText = getText(cboRouteActionOption);
		click(cboRouteActionOption);
	}

	public void clickOnAddClusterClassification() {
		click(btnAddClusterCallToAction);
	}

	// Search Methods

	public void fillOutSearchSenderID(String text) {
		sendKeys(txtSearchSenderID, text);
	}
	
	public void clearSearchSenderID() {
		clear(txtSearchSenderID);
	}

	public void clickOnSearchButton() {
		click(btnSearch);

		sleep(4000);
	}

	public void clickOnSearchCboHubID() {
		click(cboSearchHubID);
	}

	public void clickOnSearchCboHubIDO() {
		click(cboSearchHubIDO);
	}

	public void clickOnSearchCboOrigCS() {

		click(cboOrigCS);

	}

	public void clickOnSearchCboOrigCSO() {
		click(cboSearchOrigCSO);
	}

	public void clickOnSearchCboClassification() {
		click(cboClassification);
	}

	public void clickOnSearchCboClassificationO() {

		click(cboSearchClassificationO);
	}

	public void clickOnSearchCboRouteAction() {
		click(cboRouteAction);
	}

	public void clickOnSearchCboRouteActionO() {
		click(cboSearchRouteActionO);
	}

	// Create

	String cboHubIdText = "";
	String cboOrigCSText = "";
	String cboClassificationText = "";
	String cboRouteActionText = "";
	String senderIDEdition = "TATest";
	int idRecord = 5;

	public void createClusterCallToAction() {

		loginVerificationPO = new LoginVerificationPO();

		actionsMoveToElementElement(loginVerificationPO.btnClusterConfiguration);

		clickOnClusterCallToActionMenu();

		visibilityOfElement("//tr[contains(@id,\"Cluster Call To ActionTableRow\")]");
		
		actionsMoveToElementElement(btnAddClusterCallToAction);

		clickOnGoToLast();

		int rowsB = rows("//tr[contains(@id,\"Cluster Call To ActionTableRow\")]");

		selectCboHubID();

		selectCboOrigCS();

		fillOutSenderID(senderIDEdition);

		selectCboClassification();

		selectCboRouteAction();
		
		System.out.println("--------------------------Information Selected is:------------");
		System.out.println("The Cbo Hub Id option is: " + cboHubIdText);
		System.out.println("The Cbo Orig CS option is: " + cboOrigCSText);
		System.out.println("The Cbo Classification option is: " + cboClassificationText);	
		System.out.println("The Cbo Route Action option is: " + cboRouteActionText);
	
		clickOnAddClusterClassification();
		sleep(5000);

		refresh();

		visibilityOfElement("//tr[contains(@id,\"Cluster Call To ActionTableRow\")][1]");

		clickOnGoToLast();

		int rowsA = rows("//tr[contains(@id,\"Cluster Call To ActionTableRow\")]");

		System.out.println("--------------------Creation Verification--------------------");

		boolean created = greaterThanInt(rowsA, rowsB);

		System.out.println("Record created: " + created);

		assertTrue(created, createdUnSuccesfully);

		created = false;

		String hubIDA = getText("//tr[contains(@id,\"Cluster Call To ActionTableRow\")][" + rowsA + "]/td[4]/div");
		String origCSA = getText("//tr[contains(@id,\"Cluster Call To ActionTableRow\")][" + rowsA + "]/td[5]/div");
		String senderIDA = getText("//tr[contains(@id,\"Cluster Call To ActionTableRow\")][" + rowsA + "]/td[6]/div");
		String classificationA = getText(
				"//tr[contains(@id,\"Cluster Call To ActionTableRow\")][" + rowsA + "]/td[8]/div");
		String routeActionA = getText(
				"//tr[contains(@id,\"Cluster Call To ActionTableRow\")][" + rowsA + "]/td[9]/div");

		System.out.println("The hub id is: " + hubIDA);
		System.out.println("The origi cs is: " + origCSA);
		System.out.println("The sender id is: " + senderIDA);
		System.out.println("The classification is: " + classificationA);
		System.out.println("The route action is: " + routeActionA);

		if (hubIDA.equals(cboHubIdText) && origCSA.equals(cboOrigCSText) && senderIDA.equals(senderIDEdition)
				&& classificationA.equals(cboClassificationText) && routeActionA.equals(cboRouteActionText)) {
			created = true;
		}

		assertTrue(created, createdUnSuccesfully);
		
		idRecord = convertToInt(getText("//tr[contains(@id,\"Cluster Call To ActionTableRow\")][" + rowsA + "]/td[2]/div"));

		System.out.println("The record was created succesfully: " + created);

	}



	public void editClusterCallToAction() {

		loginVerificationPO = new LoginVerificationPO();

		actionsMoveToElementElement(loginVerificationPO.btnClusterConfiguration);

		clickOnClusterCallToActionMenu();
		
		visibilityOfElement("//tr[contains(@id,\"Cluster Call To ActionTableRow\")]");
		
		actionsMoveToElementElement(btnAddClusterCallToAction);
		
		clickOnGoToLast();
		
		String record = "TATest";
		
		fillOutSearchSenderID(record);
		
		clickOnSearchButton();
		sleep(5000);
		
		boolean edited = false;
		
		int rows = rows("//tr[contains(@id,\"Cluster Call To ActionTableRow\")]");
		
		String senderId = getText("//tr[contains(@id,\"ActionTable\")][1]//td[6]/div");
		
		if (senderId.equals(record) && rows ==1) {
			edited = true;
		}
		
		assertTrue(edited,creationRecord);
		
		edited = false;

		senderIDEdition = "TATest1";

		WebElement cboEditHubID = findElement(
				"//tr[contains(@id,\"ActionTableRow\")][" + rows + "]//child::select[@name=\"editmessageTypeName\"]");
		WebElement cboEditHubIDO = findElement("//tr[contains(@id,\"ActionTableRow\")][" + rows
				+ "]//child::select[@name=\"editmessageTypeName\"]/child::option[not(contains(text(),\"Select\")) and text()][2]");

		WebElement cboEditOrigCS = findElement("//tr[contains(@id,\"ActionTableRow\")][" + rows
				+ "]//child::select[@name=\"editorigServiceOrRefOpDesc\"]");
		WebElement cboEditOrigCSO = findElement("//tr[contains(@id,\"ActionTableRow\")][" + rows
				+ "]//child::select[@name=\"editorigServiceOrRefOpDesc\"]/child::option[not(contains(text(),\"Select\")) and text()][2]");

		WebElement txtEditSenderID = findElement("//tr[contains(@id,\"ActionTableRow\")][" + rows
				+ "]//child::input[contains(@id,\"senderIdEditInput\")]");

		WebElement cboEditClassification = findElement("//tr[contains(@id,\"ActionTableRow\")][" + rows
				+ "]//child::select[@name=\"editclusterClassificationName\"]");
		WebElement cboEditClassificationO = findElement("//tr[contains(@id,\"ActionTableRow\")][" + rows
				+ "]//child::select[@name=\"editclusterClassificationName\"]/child::option[not(contains(text(),\"Select\")) and text()][2]");

		WebElement cboEditRouteAction = findElement(
				"//tr[contains(@id,\"ActionTableRow\")][" + rows + "]//child::select[@name=\"editrouteActionName\"]");
		WebElement cboEditRouteActionO = findElement("//tr[contains(@id,\"ActionTableRow\")][" + rows
				+ "]//child::select[@name=\"editrouteActionName\"]/child::option[not(contains(text(),\"Select\")) and text()][2]");

		WebElement btnEdit = findElement("//tr[contains(@id,\"ActionTableRow\")][" + rows + "]//child::button[1]");

		click(btnEdit);

		click(cboEditHubID);
		cboHubIdText = getText(cboEditHubIDO);
		click(cboEditHubIDO);

		click(cboEditOrigCS);
		cboOrigCSText = getText(cboEditOrigCSO);
		click(cboEditOrigCSO);

		clear(txtEditSenderID);
		sendKeys(txtEditSenderID, senderIDEdition);

		click(cboEditClassification);
		cboClassificationText = getText(cboEditClassificationO);
		click(cboEditClassificationO);

		click(cboEditRouteAction);
		cboRouteActionText = getText(cboEditRouteActionO);
		click(cboEditRouteActionO);

		System.out.println("The hub id selected is: " + cboHubIdText);
		System.out.println("The origi cs selectedis: " + cboOrigCSText);
		System.out.println("The sender id ented is: " + senderIDEdition);
		System.out.println("The classification selected is: " + cboClassificationText);
		System.out.println("The route action selected is: " + cboRouteActionText);

		click(btnEdit);
		sleep(5000);

		refresh();

		visibilityOfElement("//tr[contains(@id,\"Cluster Call To ActionTableRow\")][1]");

		click(btnGoToLast);

		visibilityOfElement("//tr[contains(@id,\"Cluster Call To ActionTableRow\")][1]");
		

		fillOutSearchSenderID(senderIDEdition);
		
		clickOnSearchButton();
		sleep(5000);

		System.out.println("-------------------Verification After Edition--------------------------------");
		String hubIDA = getText("//tr[contains(@id,\"ActionTableRow\")][1]/td[4]/div");
		String origCSA = getText("//tr[contains(@id,\"ActionTableRow\")][1]/td[5]/div");
		String senderIDA = getText("//tr[contains(@id,\"ActionTableRow\")][1]/td[6]/div");
		String classificationA = getText("//tr[contains(@id,\"ActionTableRow\")][1]/td[8]/div");
		String routeActionA = getText("//tr[contains(@id,\"ActionTableRow\")][1]/td[9]/div");

		System.out.println("The hub id is: " + hubIDA);
		System.out.println("The origi cs is: " + origCSA);
		System.out.println("The sender id is: " + senderIDA);
		System.out.println("The classification is: " + classificationA);
		System.out.println("The route action is: " + routeActionA);

		if (hubIDA.equals(cboHubIdText) && origCSA.equals(cboOrigCSText) && senderIDA.equals(senderIDEdition)
				&& classificationA.equals(cboClassificationText) && routeActionA.equals(cboRouteActionText)) {
			edited = true;
		}

		assertTrue(edited, editionRecord);

		System.out.println("The record was edited succesfully: " + edited);
		
		refresh();

		visibilityOfElement("//tr[contains(@id,\"Cluster Call To ActionTableRow\")][1]");

	}

	public void deleteClusterCallToAction() {


		loginVerificationPO = new LoginVerificationPO();

		actionsMoveToElementElement(loginVerificationPO.btnClusterConfiguration);

		clickOnClusterCallToActionMenu();
		
		visibilityOfElement("//tr[contains(@id,\"Cluster Call To ActionTableRow\")]");
		
		actionsMoveToElementElement(btnAddClusterCallToAction);

		clickOnGoToLast();
		
		boolean deleted = false;
		
		int rowsB = rows("//tr[contains(@id,\"Cluster Call To ActionTableRow\")]");
		int j = 1;
		String senderIDDelete = getText("//tr[contains(@id,\"Cluster Call To ActionTableRow\")][" + j + "]/td[6]/div");
		
		for (int i = 0; i < rowsB; i++) {
			
			int id = convertToInt(getText("//tr[contains(@id,\"Cluster Call To ActionTableRow\")][" + j + "]/td[2]/div"));
			
			if (id == this.idRecord) {
				
				senderIDDelete = getText("//tr[contains(@id,\"Cluster Call To ActionTableRow\")][" + j + "]/td[6]/div");
				deleted = true;
				break;
				
			}
			
			j++;
			
		}
		
		fillOutSearchSenderID(senderIDDelete);
		
		clickOnSearchButton();
		sleep(5000);
	
		assertTrue(deleted, creationRecord);
		
		deleted = false;

		WebElement btnDelete = findElement("//tr[contains(@id,\"ActionTableRow\")][1]//child::button[contains(@id,\"delete\")]");
		
		click(btnDelete);
		sleep(5000);

		refresh();

		visibilityOfElement("//tr[contains(@id,\"Cluster Call To ActionTableRow\")][1]");

		click(btnGoToLast);

		visibilityOfElement("//tr[contains(@id,\"Cluster Call To ActionTableRow\")][1]");

		int rowsA = rows("//tr[contains(@id,\"Cluster Call To ActionTableRow\")]");

		System.out.println("---------------------------Deletion Verification--------------------------");


		deleted = greaterThanInt(rowsB, rowsA);

		System.out.println("The record was deleted with success: " + deleted);

		assertTrue(deleted, deletionRecord);
		
	}

	public void filters() {
		

		loginVerificationPO = new LoginVerificationPO();

		actionsMoveToElementElement(loginVerificationPO.btnClusterConfiguration);

		clickOnClusterCallToActionMenu();
		
		visibilityOfElement("//tr[contains(@id,\"Cluster Call To ActionTableRow\")]");

		actionsMoveToElementElement(btnAddClusterCallToAction);

		clickOnGoToLast();

		ArrayList<String> data = getFilterData();

		// ------------------------------------------Hub Id
		
		clickOnSearchCboHubID();

		WebElement hubIdO = findElement(
				"//div[@class=\"searchBarElement\"][1]//child::select/option[text()=\"" + data.get(0) + "\"]");

		click(hubIdO);

		clickOnSearchButton();

		verifyFilter("Hub Id", data, 0, 4);

		clickOnSearchCboHubID();

		clickOnSearchCboHubIDO();
	
		// ------------------------------------------Orig CS
		clickOnSearchCboOrigCS();
		
		sendKeys(cboSearchOrigCS, data.get(1));
		sleep(2000);

		clickOnSearchButton();

		verifyFilter("Orig CS",data,1,5);

		clickOnSearchCboOrigCS();

		clickOnSearchCboOrigCSO();
		
		// ------------------------------------------Sender Id
		
		fillOutSearchSenderID(data.get(2));
		
		clickOnSearchButton();

		verifyFilter("Sender Id",data,2,6);

		clearByBackSpace(txtSearchSenderID);
		sleep(2000);
		
		// ------------------------------------------Classification
		 
		clickOnSearchCboClassification();

		WebElement classificatioO = findElement("//div[@class=\"searchBarElement\"][5]//child::select/option[text()=\"" + data.get(3) + "\"]");

		click(classificatioO);

		clickOnSearchButton();

		verifyFilter("Classification", data, 3, 8);

		clickOnSearchCboClassification();

		clickOnSearchCboClassificationO();

	
		// ------------------------------------------Route Action
		
		clickOnSearchCboRouteAction();

		WebElement routeActionO = findElement("//div[@class=\"searchBarElement\"][6]//child::select/option[text()=\"" + data.get(4) + "\"]");

		click(routeActionO);

		clickOnSearchButton();

		verifyFilter("Route Action", data, 4, 9);
		 
	}

	public void verifyFilter(String filter, ArrayList<String> data, int index ,int td) {

		int rows = rows("//tr[contains(@id,\"Cluster Call To ActionTableRow\")]");

		System.out.println("-----------------------------" + filter + " Verification------------------------");

		System.out.println("-----The value selected is: " + data.get(index));
		String result = "";
		boolean filtered = false;
		int j = 1;

		for (int i = 0; i < rows; i++) {

			filtered = false;
			result = getText("//tr[contains(@id,\"Cluster Call To ActionTableRow\")][" + j + "]/td[" + td + "]/div");
			System.out.println("The results after filtering are: " + result);

			if (result.equals(data.get(index))) {
				filtered = true;
				assertTrue(filtered, filtersNotWorking);
			}

			j++;

		}

		System.out.println("The " + filter + " filter is working as expected: " + filtered);

	}

	public ArrayList<String> getFilterData() {

		loginVerificationPO = new LoginVerificationPO();

		actionsMoveToElementElement(loginVerificationPO.btnClusterConfiguration);

		clickOnClusterCallToActionMenu();
		
		visibilityOfElement("//tr[contains(@id,\"Cluster Call To ActionTableRow\")]");

		actionsMoveToElementElement(btnAddClusterCallToAction);

		int rows = rows("//tr[contains(@id,\"Cluster Call To ActionTableRow\")]");

		ArrayList<String> data = new ArrayList<String>();

		int j = 1;

		for (int i = 0; i < rows; i++) {

			String hubId = getText("//tr[contains(@id,\"ActionTableRow\")][" + j + "]/td[4]/div");
			String origCS = getText("//tr[contains(@id,\"ActionTableRow\")][" + j + "]/td[5]/div");
			String senderId = getText("//tr[contains(@id,\"ActionTableRow\")][" + j + "]/td[6]/div");
			String classification = getText("//tr[contains(@id,\"ActionTableRow\")][" + j + "]/td[8]/div");
			String routeAction = getText("//tr[contains(@id,\"ActionTableRow\")][" + j + "]/td[9]/div");

			if (!hubId.equals("empty") && !origCS.equals("empty") && !senderId.equals("empty")
					&& !classification.equals("empty") && !routeAction.equals("empty")) {

				data.add(hubId);
				data.add(origCS);
				data.add(senderId);
				data.add(classification);
				data.add(routeAction);
				System.out.println("--------------------------------------");
				System.out.println("The data to be used is: ");
				System.out.println("Hub Id: " + hubId);
				System.out.println("Orig Cs: " + origCS);
				System.out.println("Sender Id: " + senderId);
				System.out.println("Classification: " + classification);
				System.out.println("Route Action: " + routeAction);
				break;

			}
			j++;
		}

		return data;

	}

}
