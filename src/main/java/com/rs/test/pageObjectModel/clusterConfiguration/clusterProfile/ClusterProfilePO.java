package com.rs.test.pageObjectModel.clusterConfiguration.clusterProfile;

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
public class ClusterProfilePO extends TestBaseSteven {

	public ClusterProfilePO() {
		PageFactory.initElements(driver, this);
	}

	// menu
	@FindBy(xpath = "//div[@class=\"headerMenuDropdown\"]/a[contains(text(),\"Cluster Profile\")]")
	public WebElement menuClusterProfile;

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

	@FindBy(xpath = "//input[@name=\"name\"]")
	public WebElement txtName;

	@FindBy(xpath = "//input[@name=\"description\"]")
	public WebElement txtDescription;
	
	@FindBy(xpath = "//select[@name=\"adddefaultRouteAction\"]")
	public WebElement cboDefaultRoute;
	
	@FindBy(xpath = "//select[@name=\"adddefaultRouteAction\"]/option[not(contains(text(),\"option\"))][1]")
	public WebElement cboDefaultRouteOption;

	@FindBy(xpath = "//button[@id=\"Cluster ClassificationAddBtn\"]")
	public WebElement btnAddClusterClassification;

	// Search

	@FindBy(xpath = "//button[contains(@id,\"CodesAddBtn\")]")
	public WebElement btnSearch;

	@FindBy(xpath = "//div[@class=\"searchBar\"]/form/span/div/input")
	public WebElement txtSearch;

	// Modals

	@FindBy(xpath = "//input[@name=\"prefix\"]")
	public WebElement txtPrefix;

	@FindBy(xpath = "//button[@id=\"undefinedAddBtn\"]")
	public WebElement btnAddPrefix;

	LoginVerificationPO loginVerificationPO;


	// Menu

	public void clickOnClusterProfileMenu() {
		click(menuClusterProfile);
	}

	// Pagination

	public void clickOnGoToFirst() {
		click(btnGoToFirst);

		waitExpectedElement("//tr[contains(@id,\"Cluster ProfileTableRow0\")]/td[8]/div/button[1]");
	}

	public void clickOnGoToPrevious() {
		click(btnGoToPrevious);

		waitExpectedElement("//tr[contains(@id,\"Cluster ProfileTableRow0\")]/td[8]/div/button[1]");
	}

	public void clickOnGoToNext() {
		click(btnGoToNext);

		waitExpectedElement("//tr[contains(@id,\"Cluster ProfileTableRow0\")]/td[8]/div/button[1]");
	}

	public void clickOnGoToLast() {
		click(btnGoToLast);

		waitExpectedElement("//tr[contains(@id,\"Cluster ProfileTableRow0\")]/td[8]/div/button[1]");
	}

	// Edit Methods

	public void fillOutName(String text) {
		sendKeys(txtName, text);
	}

	public void fillOutDescription(String text) {
		sendKeys(txtDescription, text);
	}
	
	

	// Modals

	// Create
	
	String id = "2002";
	String name = "TestQA";
	String description = "Test QA";

	

	// Verfication before editing or deleting the record

	public void verification() {
		
		loginVerificationPO = new LoginVerificationPO();

		actionsMoveToElementElement(loginVerificationPO.btnClusterConfiguration);

		clickOnClusterProfileMenu();

		actionsMoveToElementElement(btnGoToFirst);

		clickOnGoToLast();

		int rows = rows("//tr[contains(@id,\"ProfileTableRow\")]");
		boolean record = false;
		int j = 1;
		for (int i = 0; i < rows; i++) {
			
			String idR = getText("//tr[contains(@id,\"ProfileTableRow\")][" + j + "]/td[1]/div");
			
			if (idR.equals(id)) {
				record = true;
				assertTrue(record, testRecord);
				break;
			}
			
			j++;
			
		}
		
		System.out.println("-----------------------------Test Record Verification------------------------------");

		String nameA = getText("//tr[contains(@id,\"ProfileTableRow\")][" + rows + "]/td[2]/div");
		String descriptionA = getText("//tr[contains(@id,\"ProfileTableRow\")][" + rows + "]/td[3]/div");
		
		System.out.println("Record Name: "+nameA);
		System.out.println("Record Description: "+descriptionA);

		if ( nameA.equals(name)&& descriptionA.equals(description)) {
			record = true;
		}

		System.out.println("The testing record is being displayed: " + record);

		assertTrue(record, this.creationRecord);

	}

	public void editClusterProfile() {
		
		verification();
		
		int rows = rows("//tr[contains(@id,\"ProfileTableRow\")]");

		boolean edited = false;

		String nameE = "EditionTest";
		String descriptionE = "Edition Test";

		WebElement txtEditName = findElement("//tr[contains(@id,\"ProfileTableRow\")][" + rows + "]/td[2]/input");
		WebElement txtEditDescription = findElement("//tr[contains(@id,\"ProfileTableRow\")][" + rows + "]/td[3]/input");
		WebElement btnEdit = findElement("//tr[contains(@id,\"ProfileTableRow\")][" + rows + "]/td[8]/div/button[1]");

		click(btnEdit);

		clear(txtEditName);
		sendKeys(txtEditName, nameE);
		clear(txtEditDescription);
		sendKeys(txtEditDescription, descriptionE);

		click(btnEdit);

		waitExpectedElement("//tr[contains(@id,\"Cluster ProfileTableRow0\")]/td[8]/div/button[1]");

		refresh();

		waitExpectedElement("//tr[contains(@id,\"Cluster ProfileTableRow0\")]/td[8]/div/button[1]");

		click(btnGoToLast);

		waitExpectedElement("//tr[contains(@id,\"Cluster ProfileTableRow0\")]/td[8]/div/button[1]");

		String nameA = getText("//tr[contains(@id,\"ProfileTableRow\")][" + rows + "]/td[2]/div");
		String descriptionA = getText("//tr[contains(@id,\"ProfileTableRow\")][" + rows + "]/td[3]/div");
		
		System.out.println("-----------------------------Edition Verification------------------------------");
		
		System.out.println("The name is: " + nameA);
		System.out.println("The description is: " + descriptionA);


		if (nameA.equals(nameE) && descriptionA.equals(descriptionE)) {
			edited = true;
		}

		System.out.println("The record was edited with success: " + edited);

		assertTrue(edited, editionRecord);
		
		txtEditName = findElement("//tr[contains(@id,\"ProfileTableRow\")][" + rows + "]/td[2]/input");
		txtEditDescription = findElement("//tr[contains(@id,\"ProfileTableRow\")][" + rows + "]/td[3]/input");
		btnEdit = findElement("//tr[contains(@id,\"ProfileTableRow\")][" + rows + "]/td[8]/div/button[1]");

		click(btnEdit);

		clear(txtEditName);
		clear(txtEditDescription);

		sendKeys(txtEditName, name);
		sendKeys(txtEditDescription, description);

		click(btnEdit);

		waitExpectedElement("//tr[contains(@id,\"Cluster ProfileTableRow0\")]/td[8]/div/button[1]");
		 
	}


}
