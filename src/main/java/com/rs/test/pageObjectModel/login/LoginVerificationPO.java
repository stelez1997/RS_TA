package com.rs.test.pageObjectModel.login;


import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.rs.test.base.TestBaseSteven;

/**
 * @author stelez
 *
 */
public class LoginVerificationPO extends TestBaseSteven{

					
	
	@FindBy(xpath = "//input[@name=\"username\"]")
	public WebElement txtUsername;
	
	@FindBy(xpath = "//input[@name=\"pass\"]")
	public WebElement txtPassword;
	
	@FindBy(xpath = "//button[text()=\"Login\"]")
	public WebElement btnLogin;
	
	@FindBy(xpath = "//form[@class=\"loginForm\"]/div/span")
	public WebElement spnVerificationMessage;
	
	@FindBy(xpath = "//button[@class=\"logMenuLinkButton\"]")
	public WebElement btnLogMenu;
	
	@FindBy(xpath = "//button[@class=\"headerMenuLinkButton\" and text()=\"Configuration \"]")
	public WebElement btnConfiguration;
	
	@FindBy(xpath = "//button[@class=\"headerMenuLinkButton\" and text()=\"Cluster configuration \"]")
	public WebElement btnClusterConfiguration;
	
	@FindBy(xpath = "//button[@class=\"headerMenuLinkButton\" and text()=\"Message Classification \"]")
	public WebElement btnMessageClassification;
	
	@FindBy(xpath = "//button[@class=\"headerMenuLinkButton\" and text()=\"Spam \"]")
	public WebElement btnSpam;
	
	@FindBy(xpath = "//button[@class=\"headerMenuLinkButton\" and text()=\"Routing Rules \"]")
	public WebElement btnRoutingRules;

	
	public LoginVerificationPO() {
		PageFactory.initElements(driver, this);
	}
	
	String incorrectUsernameNPassword ="Test123";
	String correctUsernameNPassword ="admin";
	
	public void fillOutUsername(String username) {
		sendKeys(txtUsername, username);
	}
	
	public void clearUsername() {
		clear(txtUsername);
	}
	
	public void fillOutPassword(String password) {
		sendKeys(txtPassword, password);
	}
	
	public void clearPassword() {
		clear(txtPassword);
	}
	
	public void clickOnLogin() {
		
		click(btnLogin);
	}
	
	// Menu Buttons
	
	public void clickOnConfiguration() {
		
		click(btnConfiguration);
	}
	
	public void clickOnClusterConfiguration() {
		
		click(btnClusterConfiguration);
	}
	
	public void clickOnMessageClassification() {
		
		click(btnMessageClassification);
	}
	
	public void clickOnSpam() {
		
		click(btnSpam);
	}
	
	public void clickOnRoutingRules() {
		
		click(btnRoutingRules);
	}
	
	
	public void verifyLogin() {
		
		
		
		waitExpectedElement(btnLogin);
	
		
		System.out.println("--------------Incorrect Username and Password Verification-----------------------");
		
		fillOutUsername(incorrectUsernameNPassword);

		fillOutPassword(incorrectUsernameNPassword);
		
		clickOnLogin();
		
		String style = getAttribute(spnVerificationMessage,"style");
		boolean displayed = !style.contains("none");
		
		System.out.println("Error message being displayed: "+displayed);
	
		assertTrue(displayed, loginSuccesful);
		
		System.out.println("--------------Incorrect Username and Correct Password-----------------------");
		
		clearUsername();

		fillOutUsername(incorrectUsernameNPassword);

		clearPassword();

		fillOutPassword(correctUsernameNPassword);

		clickOnLogin();
		
		style = getAttribute(spnVerificationMessage,"style");
		
		displayed = !style.contains("none");
		
		System.out.println("Error message being displayed: "+displayed);
		
		assertTrue(displayed, loginSuccesful);
		
		
		System.out.println("--------------Correct Username and incorrect Password-----------------------");
		
		clearUsername();
		
		fillOutUsername(correctUsernameNPassword);
		
		clearPassword();

		fillOutPassword(incorrectUsernameNPassword);
		
		clickOnLogin();
		
		style = getAttribute(spnVerificationMessage,"style");
		
		displayed = !style.contains("none");
		
		System.out.println("Error message being displayed: "+displayed);
		
		assertTrue(displayed, loginSuccesful);
		
		
		
		
		System.out.println("--------------Correct Username and Correct Password-----------------------");
		
		clearUsername();

		fillOutUsername(correctUsernameNPassword);

		clearPassword();

		fillOutPassword(correctUsernameNPassword);
		
		clickOnLogin();
		
		waitExpectedElement(btnLogMenu);
		
		int btnLogMenuVerification = rows("//button[@class=\"logMenuLinkButton\"]");
		
		displayed= false;
		
		if (btnLogMenuVerification ==1) {
			
			displayed = true;
			
		}
		
		System.out.println("Log menu button being displayed: "+displayed);
		
		assertTrue(displayed, loginUnSuccesful);
		
	}

	
	public void login() {
		
	
		clearUsername();

		fillOutUsername(correctUsernameNPassword);
		
		clearPassword();

		fillOutPassword(correctUsernameNPassword);

		clickOnLogin();
		
		waitExpectedElement(btnLogMenu);
		
		int btnLogMenuVerification = rows("//button[@class=\"logMenuLinkButton\"]");
		
		System.out.println("Rows: "+btnLogMenuVerification);
		
		boolean displayed = false;
		
		if (btnLogMenuVerification ==1) {
			
			displayed = true;
			
		}
		
		assertTrue(displayed, loginUnSuccesful);
		
	
		
	}
	
	
	
}
