package com.rs.test.pageObjectModel.configuration.actionTemplates;

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
public class ActionTemplatesPO extends TestBaseSteven {

	public ActionTemplatesPO() {
		PageFactory.initElements(driver, this);
	}

	// menu
	@FindBy(xpath = "//div[@class=\"headerMenuDropdown\"]/a[contains(text(),\"Action Templates\")]")
	public WebElement menuActionTemplates;

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

	@FindBy(xpath = "//input[@name=\"template\"]")
	public WebElement txtTemplateName;

	@FindBy(xpath = "//input[@name=\"description\"]")
	public WebElement txtDescription;

	@FindBy(xpath = "//button[contains(@id,\"TemplateAddBtn\")]")
	public WebElement btnAddTemplate;

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

	String templateName = "TestTemplate";
	String description = "Test Template";
	String prefix = "123";

	// Menu

	public void clickOnActionTemplateMenu() {
		click(menuActionTemplates);
	}

	// Pagination

	public void clickOnGoToFirst() {
		click(btnGoToFirst);

		waitExpectedElement("//button[@id=\"actionsModalBtn0\"]");
	}

	public void clickOnGoToPrevious() {
		click(btnGoToPrevious);

		waitExpectedElement("//button[@id=\"actionsModalBtn0\"]");
	}

	public void clickOnGoToNext() {
		click(btnGoToNext);

		waitExpectedElement("//button[@id=\"actionsModalBtn0\"]");
	}

	public void clickOnGoToLast() {
		click(btnGoToLast);

		waitExpectedElement("//button[@id=\"actionsModalBtn0\"]");

	}

	// Create Methods

	public void fillOutTemplateName(String text) {
		sendKeys(txtTemplateName, text);
	}

	public void fillOutDescription(String text) {
		sendKeys(txtDescription, text);
	}

	public void clickOnAddTemplate() {
		click(btnAddTemplate);
	}

	// Modals

	// Create

	public void createActionTemplate() {

		loginVerificationPO = new LoginVerificationPO();

		actionsMoveToElementElement(loginVerificationPO.btnConfiguration);

		clickOnActionTemplateMenu();

		actionsMoveToElementElement(btnAddTemplate);

		clickOnGoToLast();

		int rowsB = rows("//tr[contains(@id,\"TemplateTableRow\")]");

		fillOutTemplateName(templateName);

		fillOutDescription(description);

		clickOnAddTemplate();

		refresh();

		waitExpectedElement("//button[@id=\"actionsModalBtn0\"]");

		clickOnGoToLast();

		int rowsA = rows("//tr[contains(@id,\"TemplateTableRow\")]");

		System.out.println("--------------------Creation Verification--------------------");
		boolean created = false;

		if (rowsA > rowsB) {
			created = true;
		}
	
		assertTrue(created, createdUnSuccesfully);
	
		int position = 1;
		int f = 1;
		
		for (int i = 0; i < rowsB; i++) {

			String template = getText("//tr[contains(@id,\"TemplateTableRow\")]["+f+"]/td[1]/div");
	
			if (template.equals(templateName)) {
				position = f;
				break;
			}
			
			f++;	
		}
	
		created = false;

		String templeateA = getText("//tr[contains(@id,\"TemplateTableRow\")][" + position + "]/td[1]/div");
		String descriptionA = getText("//tr[contains(@id,\"TemplateTableRow\")][" + position + "]/td[2]/div");

		System.out.println("The Template is: " + templeateA);
		System.out.println("The Description is: " + descriptionA);

		if (descriptionA.equals(description) && templeateA.equals(templateName)) {
			created = true;
		}

		assertTrue(created, createdUnSuccesfully);

		System.out.println("The record was created succesfully: " + created);
		

	}
	
	// Verfication before editing or deleting the record

	public int verification() {
		/*
		int rowsModal = rows("//div[contains(@style,\"none\") and @class=\"tablePageModalBack\"]");
		
		if (rowsModal ==0) {
			
			refresh();
			waitExpectedElement("//button[@id=\"prefixesModalBtn0\"]");
		}
		*/
		
		clickOnGoToLast();
		
		int rows = rows("//tr[contains(@id,\"TemplateTableRow\")]");
		int position = 1;
		int f = 1;
		boolean record = false;
		
		for (int i = 0; i < rows; i++) {

			String template = getText("//tr[contains(@id,\"TemplateTableRow\")]["+f+"]/td[1]/div");
			String descriptionR = getText("//tr[contains(@id,\"TemplateTableRow\")]["+f+"]/td[2]/div");
	
			if (template.contains(templateName) && descriptionR.contains(description)) {
				position = f;
				record = true;
				break;
			}
				
		
			
			f++;	
		}
		
		assertTrue(record, creationRecord);
		
		return position;
		

	}

	public void editActionTemplate() {

		loginVerificationPO = new LoginVerificationPO();

		int rows = verification();


		boolean edited = false;

		String templateE = "TestTemplate1";
		String descriptionE = "Test Template1";

		WebElement txtEditTemplateName = findElement("//tr[contains(@id,\"TemplateTableRow\")][" + rows + "]/td[1]/input");
		WebElement txtEditDescription = findElement("//tr[contains(@id,\"TemplateTableRow\")][" + rows + "]/td[2]/input");
		WebElement btnEdit = findElement("//tr[contains(@id,\"TemplateTableRow\")][" + rows + "]/td[6]/div/button[1]");

		click(btnEdit);
		
		clear(txtEditTemplateName);
		sendKeys(txtEditTemplateName, templateE);
		clear(txtEditDescription);
		sendKeys(txtEditDescription, descriptionE);

		click(btnEdit);

		waitExpectedElement("//button[@id=\"actionsModalBtn0\"]");

		refresh();

		waitExpectedElement("//button[@id=\"actionsModalBtn0\"]");

		click(btnGoToLast);

		waitExpectedElement("//button[@id=\"actionsModalBtn0\"]");

		String templateA = getText("//tr[contains(@id,\"TemplateTableRow\")][" + rows + "]/td[1]/div");
		String descriptionA = getText("//tr[contains(@id,\"TemplateTableRow\")][" + rows + "]/td[2]/div");
		
		System.out.println("-----------------------------Edition Verification------------------------------");
		
		System.out.println("The Template is: " + templateA);
		System.out.println("The Description is: " + descriptionA);

		if (descriptionA.equals(descriptionE) && templateA.equals(templateE)) {
			edited = true;
		}

		System.out.println("The record was edited with success: " + edited);

		assertTrue(edited, editionRecord);


	}
	
	public void deleteActionTemplate() {

		loginVerificationPO = new LoginVerificationPO();

		int rows = verification();

		boolean deleted = false;

		WebElement btnDelete = findElement("//tr[contains(@id,\"TemplateTableRow\")][" + rows + "]/td[6]/div/button[2]");

		click(btnDelete);

		refresh();

		waitExpectedElement("//button[@id=\"actionsModalBtn0\"]");

		click(btnGoToLast);

		waitExpectedElement("//button[@id=\"actionsModalBtn0\"]");

		rows = rows("//tr[contains(@id,\"TemplateTableRow\")]");

		String templateA = getText("//tr[contains(@id,\"TemplateTableRow\")][" + rows + "]/td[1]/div");
		String descriptionA = getText("//tr[contains(@id,\"TemplateTableRow\")][" + rows + "]/td[2]/div");
		
		
		System.out.println("---------------------------Deletion Verification--------------------------");
		
		System.out.println("The template is: " + templateA);
		System.out.println("The description is: " + descriptionA);

		if (!descriptionA.equals(description) && !templateA.equals(templateName)) {
			deleted = true;
		}

		System.out.println("The record was deleted with success: " + deleted);

		assertTrue(deleted, deletionRecord);

	}
	
	//-------------------------------------Pending------------------------------
/*
	public void addPrefix() {
		


		loginVerificationPO = new LoginVerificationPO();

		verification();

		int rows = rows("//tr[contains(@id,\"CodesTableRow\")]");

		WebElement btnModal = findElement("//tr[contains(@id,\"CodesTableRow\")][" + rows + "]/td[5]/div/button");

		click(btnModal);

		waitExpectedElement(txtPrefix);

		int rowsModalB = rows("//tr[contains(@id,\"undefinedTableRow\")]");

		sendKeys(txtPrefix, prefix);

		click(btnAddPrefix);

		waitExpectedElement("//button[@id=\"prefixesModalBtn0\"]");

		refresh();

		waitExpectedElement("//button[@id=\"prefixesModalBtn0\"]");

		clickOnGoToLast();

		btnModal = findElement("//tr[contains(@id,\"CodesTableRow\")][" + rows + "]/td[5]/div/button");

		click(btnModal);

		waitExpectedElement(txtPrefix);

		int rowsModalA = rows("//tr[contains(@id,\"undefinedTableRow\")]");

		boolean created = false;
		
		System.out.println("------------------------------Prefix Creation Verification---------------------------");

		if (rowsModalA > rowsModalB) {
			created = true;
		}

		System.out.println("The Prefix was created with success: " + created);
		assertTrue(created, createdUnSuccesfully);

		created = false;

		String prefixCreated = getText("//tr[contains(@id,\"undefinedTableRow\")][" + rowsModalA + "]/td[1]/div");
		System.out.println("The prefix is: " + prefixCreated);

		if (prefixCreated.equals(prefix)) {

			created = true;

		}

		System.out.println("The Prefix has the correct information: " + created);

		assertTrue(created, createdUnSuccesfully);

	}

	public void editPrefix() {
	

		loginVerificationPO = new LoginVerificationPO();

		verification();

		int rows = rows("//tr[contains(@id,\"CodesTableRow\")]");

		WebElement btnModal = findElement("//tr[contains(@id,\"CodesTableRow\")][" + rows + "]/td[5]/div/button");

		click(btnModal);

		waitExpectedElement(txtPrefix);

		int rowsModal = rows("//tr[contains(@id,\"undefinedTableRow\")]");
		

		WebElement btnEdit = findElement("//tr[contains(@id,\"undefinedTableRow\")][" + rowsModal + "]/td[2]/div/button[1]");

		click(btnEdit);

		String prefixEdit = "1234";

		WebElement txtEditPrefix = findElement("//tr[contains(@id,\"undefinedTableRow\")][" + rowsModal + "]/td[1]/input");

		clear(txtEditPrefix);
		
		sendKeys(txtEditPrefix, prefixEdit);

		btnEdit = findElement("//tr[contains(@id,\"undefinedTableRow\")][" + rowsModal + "]/td[2]/div/button[1]");

		click(btnEdit);
		

		refresh();

		waitExpectedElement("//button[@id=\"prefixesModalBtn0\"]");
		
		click(btnGoToLast);
		
		
		waitExpectedElement("//button[@id=\"prefixesModalBtn0\"]");
		
		
		btnModal = findElement("//tr[contains(@id,\"CodesTableRow\")][" + rows + "]/td[5]/div/button");

		click(btnModal);

		waitExpectedElement(txtPrefix);
		
		String editionText = getText("//tr[contains(@id,\"undefinedTableRow\")]["+rowsModal+"]/td[1]/div");
		
		System.out.println("--------------------------Prefix Edition Verification-----------------------");
		
		System.out.println("The record after edition is: "+editionText);
		
		boolean edited = false;
		
		if (editionText.equals(prefixEdit)) {
			edited = true;
		}
		
		System.out.println("The Prefix was edited successfully: "+edited);
		
		assertTrue(edited, editionRecord);
		
		
	}

	public void deletePrefix() {
	

		loginVerificationPO = new LoginVerificationPO();

		verification();

		int rows = rows("//tr[contains(@id,\"CodesTableRow\")]");

		WebElement btnModal = findElement("//tr[contains(@id,\"CodesTableRow\")][" + rows + "]/td[5]/div/button");

		click(btnModal);

		waitExpectedElement(txtPrefix);
		
		

		int rowsModal = rows("//tr[contains(@id,\"undefinedTableRow\")]");
		
		if (rowsModal == 0) {
			
			assertTrue(false, noRecordFound);
		}
		

		WebElement btnDelete = findElement("//tr[contains(@id,\"undefinedTableRow\")][" + rowsModal + "]/td[2]/div/button[2]");

		click(btnDelete);

		refresh();

		waitExpectedElement("//button[@id=\"prefixesModalBtn0\"]");
		
		click(btnGoToLast);
		
		
		waitExpectedElement("//button[@id=\"prefixesModalBtn0\"]");
		
		btnModal = findElement("//tr[contains(@id,\"CodesTableRow\")][" + rows + "]/td[5]/div/button");

		click(btnModal);

		waitExpectedElement(txtPrefix);
		
		int rowsModalA = rows("//tr[contains(@id,\"undefinedTableRow\")]");
		
		boolean deleted = greaterThanInt(rowsModal, rowsModalA);
	
		System.out.println("--------------------------Prefix Deletion Verification-----------------------");
		
		System.out.println("The Prefix was deleted successfully: "+deleted);
		
		assertTrue(deleted, deletionRecord);
		
		
	}*/
}
