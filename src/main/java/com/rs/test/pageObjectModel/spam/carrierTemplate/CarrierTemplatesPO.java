package com.rs.test.pageObjectModel.spam.carrierTemplate;

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
public class CarrierTemplatesPO extends TestBaseSteven {

	public CarrierTemplatesPO() {
		PageFactory.initElements(driver, this);
	}

	// menu
	@FindBy(xpath = "//button[text()=\"Spam \"]//ancestor::div[@class=\"headerMenu\"]//child::a[contains(text(),\"Car\") and contains(text(),\"Tem\")]")
	public WebElement menuCarrierTemplates;

	// pagination

	@FindBy(xpath = "//div[@class=\"tablePageSection\"]/div/div/button[text()=\"<<\"]")
	public WebElement btnGoToFirst;

	@FindBy(xpath = "//div[@class=\"tablePageSection\"]/div/div/button[text()=\"<\"]")
	public WebElement btnGoToPrevious;

	@FindBy(xpath = "//div[@class=\"tablePageSection\"]/div/div/button[text()=\">>\"]")
	public WebElement btnGoToLast;

	@FindBy(xpath = "//div[@class=\"tablePageSection\"]/div/div/button[text()=\">\"]")
	public WebElement btnGoToNext;

	// Search

	@FindBy(xpath = "//div[@class=\"searchBarElement\"][1]//child::input")
	public WebElement txtSearchRuleID;

	@FindBy(xpath = "//div[@class=\"searchBarElement\"][2]//child::select")
	public WebElement cboSearchDestionationCarrierService;

	@FindBy(xpath = "//div[@class=\"searchBarElement\"][3]//child::select")
	public WebElement cboSearchSapSpam;

	@FindBy(xpath = "//button[contains(@id,\"searchBtn\")]")
	public WebElement btnSearch;

	LoginVerificationPO loginVerificationPO;

	// Menu

	public void clickOnCarrierTemplatesMenu() {
		click(menuCarrierTemplates);

		visibilityOfElementXpath("//tr[contains(@id,\"TemplatesTableRow\")][1]");
	}

	// Pagination

	public void clickOnGoToFirst() {
		click(btnGoToFirst);

		visibilityOfElementXpath("//tr[contains(@id,\"TemplatesTableRow\")][1]");
	}

	public void clickOnGoToPrevious() {
		click(btnGoToPrevious);

		visibilityOfElementXpath("//tr[contains(@id,\"TemplatesTableRow\")][1]");
	}

	public void clickOnGoToNext() {
		click(btnGoToNext);

		visibilityOfElementXpath("//tr[contains(@id,\"TemplatesTableRow\")][1]");
	}

	public void clickOnGoToLast() {
		click(btnGoToLast);

		visibilityOfElementXpath("//tr[contains(@id,\"TemplatesTableRow\")][1]");
	}

	// Search Methods

	public void fillOutRuleID(String text) {
		sendKeys(txtSearchRuleID, text);
	}

	public void clearSearchRuleID() {
		clearByBackSpace(txtSearchRuleID);
	}

	public void clickOnSearchButton() {
		click(btnSearch);

		sleep(4000);
	}

	public void clickOnCboDestinationCarrier() {
		click(cboSearchDestionationCarrierService);
	}

	public void clickOnCboSapSpam() {
		click(cboSearchSapSpam);
	}

	public void filters() {
		

		loginVerificationPO = new LoginVerificationPO();

		actionsMoveToElementElement(loginVerificationPO.btnSpam);

		clickOnCarrierTemplatesMenu();

		actionsMoveToElementElement(btnSearch);

		clickOnGoToLast();

		ArrayList<String> data = getFilterData();

		// ------------------------------------------Rule Id

		fillOutRuleID(data.get(0));

		clickOnSearchButton();

		verifyFilter("Rule Id", data, 0, 2);

		clearSearchRuleID();

		sleep(2000);

		clickOnSearchButton();

		// ------------------------------------------Destionation Carrier

		sendKeys(cboSearchDestionationCarrierService, data.get(1));
		sleep(2000);

		clickOnSearchButton();

		verifyFilter("Destionation Carrier Service", data, 1, 3);

		clickOnCboDestinationCarrier();
	
		click("//select[@id=\"adddestServiceName\"]/option[contains(text(),\"Select an\") or (not(text()))]");

		clickOnSearchButton();

		// ------------------------------------------SAP Spam Template

		sendKeys(cboSearchSapSpam, data.get(2));
		sleep(2000);

		clickOnSearchButton();

		verifyFilter("SAP Spam Template", data, 2, 4);

		clickOnSearchButton();

		click("//select[@id=\"addspamTemplateName\"]/option[contains(text(),\"Select an\") or (not(text()))]");

		clickOnSearchButton();

	}

	public void verifyFilter(String filter, ArrayList<String> data, int index, int td) {

		int rows = rows("//tr[contains(@id,\"TemplatesTableRow\")]");

		System.out.println("-----------------------------" + filter + " Verification------------------------");

		System.out.println("-----The value selected is: " + data.get(index));
		String result = "";
		boolean filtered = false;
		int j = 1;

		for (int i = 0; i < rows; i++) {

			filtered = false;
			result = getText("//tr[contains(@id,\"TemplatesTableRow\")][" + j + "]/td[" + td + "]/div");
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

		int rows = rows("//tr[contains(@id,\"TemplatesTableRow\")]");

		ArrayList<String> data = new ArrayList<String>();

		int j = 1;

		for (int i = 0; i < rows; i++) {

			String ruleId = getText("//tr[contains(@id,\"TemplatesTableRow\")][" + j + "]/td[2]/div");
			String destinationCarrier = getText("//tr[contains(@id,\"TemplatesTableRow\")][" + j + "]/td[3]/div");
			String sapSpam = getText("//tr[contains(@id,\"TemplatesTableRow\")][" + j + "]/td[4]/div");

			if (!ruleId.equals("empty") && !destinationCarrier.equals("empty") && !sapSpam.equals("empty")) {

				data.add(ruleId);
				data.add(destinationCarrier);
				data.add(sapSpam);
				System.out.println("--------------------------------------");
				System.out.println("The data to be used is: ");
				System.out.println("Rule Id: " + ruleId);
				System.out.println("Destionation Carrier: " + destinationCarrier);
				System.out.println("SAP Spam Template: " + sapSpam);
				break;

			}
			j++;
		}

		return data;

	}

}
