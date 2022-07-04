package com.rs.test.pageObjectModel.spam.gtRules;

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
public class GTRulesPO extends TestBaseSteven {

	public GTRulesPO() {
		PageFactory.initElements(driver, this);
	}

	// menu
	@FindBy(xpath = "//a[text()=\"GT Spam\"]")
	public WebElement menuGtSpam;

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
	public WebElement txtSearchGT;

	@FindBy(xpath = "//div[@class=\"searchBarElement\"][2]//child::input")
	public WebElement txtSearchRuleId;

	@FindBy(xpath = "//div[@class=\"searchBarElement\"][3]//child::select")
	public WebElement cboSearchType;

	@FindBy(xpath = "//button[contains(@id,\"searchBtn\")]")
	public WebElement btnSearch;

	LoginVerificationPO loginVerificationPO;

	// Menu

	public void clickOnGTSpamMenu() {
		click(menuGtSpam);

		visibilityOfElementXpath("//tr[contains(@id,\"RulesTable\")][1]");
	}

	// Pagination

	public void clickOnGoToFirst() {
		click(btnGoToFirst);

		visibilityOfElementXpath("//tr[contains(@id,\"RulesTable\")][1]");
	}

	public void clickOnGoToPrevious() {
		click(btnGoToPrevious);

		visibilityOfElementXpath("//tr[contains(@id,\"RulesTable\")][1]");
	}

	public void clickOnGoToNext() {
		click(btnGoToNext);

		visibilityOfElementXpath("//tr[contains(@id,\"RulesTable\")][1]");
	}

	public void clickOnGoToLast() {
		click(btnGoToLast);

		visibilityOfElementXpath("//tr[contains(@id,\"RulesTable\")][1]");
	}

	// Search Methods

	public void fillOutSearchGT(String text) {
		sendKeys(txtSearchGT, text);
	}

	public void clearSearchGT() {
		clearByBackSpace(txtSearchGT);
	}

	public void clickOnSearchButton() {
		click(btnSearch);

		sleep(4000);
	}

	public void fillOutSearchRuleId(String text) {
		sendKeys(txtSearchRuleId, text);
	}
	
	public void clearSearchRuleId() {
		clearByBackSpace(txtSearchRuleId);
	}

	public void clickOnCboType() {
		click(cboSearchType);
	}

	public void filters() {
		

		loginVerificationPO = new LoginVerificationPO();

		actionsMoveToElementElement(loginVerificationPO.btnSpam);

		clickOnGTSpamMenu();

		actionsMoveToElementElement(btnSearch);

		clickOnGoToLast();

		ArrayList<String> data = getFilterData();
		
		// ------------------------------------------Rule Id

		fillOutSearchGT(data.get(0));

		clickOnSearchButton();

		verifyFilter("GT", data, 0, 3);

		clearSearchGT();

		sleep(2000);

		clickOnSearchButton();

		// ------------------------------------------Destionation Carrier

		fillOutSearchRuleId(data.get(1));

		clickOnSearchButton();

		verifyFilter("Rule ID", data, 1, 2);

		clearSearchRuleId();

		sleep(2000);

		clickOnSearchButton();

		// ------------------------------------------SAP Spam Template

		sendKeys(cboSearchType, data.get(2));
		sleep(2000);

		clickOnSearchButton();

		verifyFilter("Type", data, 2, 4);

		clickOnSearchButton();

		click("//select[@id=\"addorigGTType\"]/option[contains(text(),\"Select an\") or (not(text()))]");

		clickOnSearchButton();

	}

	public void verifyFilter(String filter, ArrayList<String> data, int index, int td) {

		int rows = rows("//tr[contains(@id,\"RulesTable\")]");

		System.out.println("-----------------------------" + filter + " Verification------------------------");

		System.out.println("-----The value selected is: " + data.get(index));
		String result = "";
		boolean filtered = false;
		int j = 1;

		for (int i = 0; i < rows; i++) {

			filtered = false;
			result = getText("//tr[contains(@id,\"RulesTable\")][" + j + "]/td[" + td + "]/div");
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

		int rows = rows("//tr[contains(@id,\"RulesTable\")]");

		ArrayList<String> data = new ArrayList<String>();

		int j = 1;

		for (int i = 0; i < rows; i++) {

			String gt = getText("//tr[contains(@id,\"RulesTable\")][" + j + "]/td[3]/div");
			String ruleID = getText("//tr[contains(@id,\"RulesTable\")][" + j + "]/td[2]/div");
			String type = getText("//tr[contains(@id,\"RulesTable\")][" + j + "]/td[4]/div");

			if (!gt.equals("empty") && !ruleID.equals("empty") && !type.equals("empty")) {

				data.add(gt);
				data.add(ruleID);
				data.add(type);
				System.out.println("--------------------------------------");
				System.out.println("The data to be used is: ");
				System.out.println("GT: " + gt);
				System.out.println("RuleID: " + ruleID);
				System.out.println("Type: " + type);
				break;

			}
			j++;
		}

		return data;

	}

}
