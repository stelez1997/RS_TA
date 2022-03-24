package com.rs.test.configuration.carrierService;

import org.testng.annotations.Test;

import com.rs.test.base.TestBaseSteven;
import com.rs.test.pageObjectModel.configuration.actionTemplates.ActionTemplatesPO;
import com.rs.test.pageObjectModel.configuration.carrierService.CarrierServicePO;
import com.rs.test.pageObjectModel.configuration.countryCodes.CountryCodesPO;
import com.rs.test.pageObjectModel.login.LoginVerificationPO;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

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
  
  @Test()
  public void createCarrierService() {
	 
	  carrierServicePO.createCarrierService();
	 
  }
  
  
  @Test(dependsOnMethods = "createCarrierService", priority = 0)
  public void editCarrierService() {
	 
	  carrierServicePO.editCarrierService();
	 
  }
  
  @Test(dependsOnMethods = "createCarrierService", priority = 1)
  public void deleteCarrierService() {
	 
	  carrierServicePO.deleteCarrierService();
	 
  }
  
 
  
  @AfterTest
  public void afterTest() {
	  
	 driver.close();
	  
  }

}
