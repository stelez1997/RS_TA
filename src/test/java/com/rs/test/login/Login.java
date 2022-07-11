package com.rs.test.login;

import org.testng.annotations.Test;

import com.rs.test.base.TestBaseSteven;
import com.rs.test.pageObjectModel.login.LoginVerificationPO;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Login extends TestBaseSteven{

	LoginVerificationPO loginVerificationPO;

  @BeforeTest
  public void beforeTest() {
	   
	  driver = initialization();
	  loginVerificationPO = new LoginVerificationPO();
	  
  }
  
  @Test
  public void loginTest() {
	  
	  loginVerificationPO.verifyLogin();

  }
  
  @AfterTest
  public void afterTest() {
	  
	  driver.close();
  }

}
