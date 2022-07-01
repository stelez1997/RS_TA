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
  
  @Test(dependsOnMethods = "createCarrierService", priority = 12)
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
  
  //MO Char
  @Test(dependsOnMethods = "createCarrierService", priority = 6)
  public void createMOChar() {
	 
	  carrierServicePO.createMOChar();
	 
  }
  
  @Test(dependsOnMethods = "createMOChar", priority = 7)
  public void editMOChar() {
	 
	  carrierServicePO.editMOChar();
	 
  }
  
  @Test(dependsOnMethods = "createMOChar", priority = 8)
  public void deleteMOChar() {
	 
	  carrierServicePO.deleteMOChar();
	 
  }
  
  
  //MT Char
  @Test(dependsOnMethods = "createCarrierService", priority = 9)
  public void createMTChar() {
	 
	  carrierServicePO.createMTChar();
	 
  }
 

  @Test(dependsOnMethods = "createMTChar", priority = 10)
  public void editMTChar() {
	 
	  carrierServicePO.editMTChar();
	 
  }
  

  @Test(dependsOnMethods = "createMTChar", priority = 11)
  public void deleteMTChar() {
	 
	  carrierServicePO.deleteMTChar();
	 
  }
  
  //MSG Props
  @Test(dependsOnMethods = "createCarrierService", priority = 9)
  public void createMSGProps() {
	 
	  carrierServicePO.createMSGProps();
	 
  }
  

  @Test(dependsOnMethods = "createMSGProps", priority = 9)
  public void editMSGProps() {
	 
	  carrierServicePO.editMSGProps();
	 
  }
  

  @Test(dependsOnMethods = "createMSGProps", priority = 9)
  public void deleteMSGProps() {
	 
	  carrierServicePO.deleteMSGProps();
	 
  }
 
  
  @AfterTest
  public void afterTest() {
	  
	 driver.close();
	  
  }

}
