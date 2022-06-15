package com.rs.test.configuration.carrierService;

import org.testng.annotations.Test;

import com.rs.test.base.TestBaseSteven;
import com.rs.test.pageObjectModel.configuration.actionTemplates.ActionTemplatesPO;
import com.rs.test.pageObjectModel.configuration.carrierService.CarrierServicePO;
import com.rs.test.pageObjectModel.configuration.countryCodes.CountryCodesPO;
import com.rs.test.pageObjectModel.login.LoginVerificationPO;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
//Done
public class CarrierService extends TestBaseSteven{

	LoginVerificationPO loginVerificationPO;
	CarrierServicePO carrierServicePO;
	
  @BeforeTest
  public void beforeTest() {
	   
	  driver = initialization();
	  loginVerificationPO = new LoginVerificationPO();
	  carrierServicePO = new CarrierServicePO();
	  loginVerificationPO.login();
	  
  }
  
  @Test(priority = 0)
  public void filters() {
	 
	  carrierServicePO.filters();
	 
  }
  
  @Test(priority = 1)
  public void createCarrierService() {
	 
	  carrierServicePO.createCarrierService();
	 
  }
  
  
  @Test(dependsOnMethods = "createCarrierService", priority = 0)
  public void editCarrierService() {
	 
	  carrierServicePO.editCarrierService();
	 
  }
  
  @Test(dependsOnMethods = "createCarrierService", priority = 6)
  public void deleteCarrierService() {
	 
	  carrierServicePO.deleteCarrierService();
	 
  }
  
  //Route Point
  
  @Test(dependsOnMethods = "createCarrierService", priority = 1)
  public void createRoutePoint() {
	 
	  carrierServicePO.createRoutePoint();
	 
  }
  
  @Test(dependsOnMethods = "createRoutePoint", priority = 2)
  public void editRoutePoint() {
	 
	  carrierServicePO.editRoutePoint();
	 
  }
  
  @Test(dependsOnMethods = "createRoutePoint", priority = 3)
  public void deleteRoutePoint() {
	 
	  carrierServicePO.deleteRoutePoint();
	 
  }
  
  //Log Agent
  
  @Test(dependsOnMethods = "createCarrierService", priority = 4)
  public void createLogAgent() {
	 
	  carrierServicePO.createLogAgent();
	 
  }
  

  
  @Test(dependsOnMethods = "createLogAgent", priority = 5)
  public void deleteLogAgent() {
	 
	  carrierServicePO.deleteLogAgent();
	 
  }
  
  
 
  
  @AfterTest
  public void afterTest() {
	  
	 driver.close();
	  
  }

}
