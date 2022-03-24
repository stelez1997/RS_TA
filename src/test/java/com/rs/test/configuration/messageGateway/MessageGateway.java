package com.rs.test.configuration.messageGateway;

import org.testng.annotations.Test;

import com.rs.test.base.TestBaseSteven;
import com.rs.test.pageObjectModel.configuration.countryCodes.CountryCodesPO;
import com.rs.test.pageObjectModel.configuration.messageGateway.MessageGatewayPO;
import com.rs.test.pageObjectModel.login.LoginVerificationPO;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class MessageGateway extends TestBaseSteven{

	LoginVerificationPO loginVerificationPO;
	MessageGatewayPO messageGatewayPO;

  @BeforeTest
  public void beforeTest() {
	   
	  driver = initialization();
	  loginVerificationPO = new LoginVerificationPO();
	  messageGatewayPO = new MessageGatewayPO();
	  loginVerificationPO.login();
	  
  }
  
  @Test()
  public void createMessageGateway() {
	 
	  messageGatewayPO.createMessageGateway();
	 
  }
  
  
  @Test(dependsOnMethods = "createMessageGateway", priority = 0)
  public void edit() {
	  
	  messageGatewayPO.editMessageGateway();
	  
  }
 
  
  @Test(dependsOnMethods = "createMessageGateway", priority = 1)
  public void delete() {
	  
	  messageGatewayPO.deleteMessageGateway();
	  
  }
  
  @AfterTest
  public void afterTest() {
	  
	  driver.close();
	  
  }

}
