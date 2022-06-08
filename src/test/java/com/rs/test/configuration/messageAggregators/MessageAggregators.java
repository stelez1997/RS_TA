package com.rs.test.configuration.messageAggregators;

import org.testng.annotations.Test;

import com.rs.test.base.TestBaseSteven;
import com.rs.test.pageObjectModel.configuration.countryCodes.CountryCodesPO;
import com.rs.test.pageObjectModel.configuration.messageAggregators.MessageAggregatorsPO;
import com.rs.test.pageObjectModel.configuration.messageGateway.MessageGatewayPO;
import com.rs.test.pageObjectModel.login.LoginVerificationPO;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
//Done
public class MessageAggregators extends TestBaseSteven{

	LoginVerificationPO loginVerificationPO;
	MessageAggregatorsPO messageAggregatorsPO;
	
  @BeforeTest
  public void beforeTest() {
	   
	  driver = initialization();
	  loginVerificationPO = new LoginVerificationPO();
	  messageAggregatorsPO = new MessageAggregatorsPO();
	  loginVerificationPO.login();
	  
  }

  @Test(priority = 0)
  public void filters() {
	 
	  messageAggregatorsPO.filters();
	 
  }
  
  @Test(priority = 1)
  public void createMessageAggregator() {
	 
	  messageAggregatorsPO.createMessageAggregators();
	 
  }
  

  @Test(dependsOnMethods = "createMessageAggregator", priority = 1)
  public void editMessageAggregator() {
	 
	  messageAggregatorsPO.editMessageAggregator();
	 
  }

  // ---------------------------------------Rt Points------------------------------------------

  @Test(dependsOnMethods = "createMessageAggregator", priority = 2)
  public void createRoutePoints() {
	 
	  messageAggregatorsPO.createRTPoints();
	 
  }
  
  @Test(dependsOnMethods = "createRoutePoints", priority = 1)
  public void editRoutePoints() {
	 
	  messageAggregatorsPO.editRTPoints();
	 
  }
		   
  
  
  @Test(dependsOnMethods = "createRoutePoints", priority = 2)
  public void deleteRoutePoints() {
	 
	  messageAggregatorsPO.deleteRTPoints();
	 
  }
  
  //----------------------------------------------Peer Blocks----------------------------------


  @Test(dependsOnMethods = "createMessageAggregator", priority = 3)
  public void createPeerBlock() {
		 
	  messageAggregatorsPO.createPeerBlock();
	 
  }
  
  
  
  @Test(dependsOnMethods = "createPeerBlock", priority = 1)
  public void editPeerBlock() {
		 
	  messageAggregatorsPO.editPeerBlock();
	 
  }
  
  @Test(dependsOnMethods = "createMessageAggregator", priority = 4)
  public void deleteMessageAggregator() {
	 
	  messageAggregatorsPO.deleteMessageAggregator();
	 
  }
  
  
  @AfterTest
  public void afterTest() {
	  
	  driver.close();
	  
  }

}
