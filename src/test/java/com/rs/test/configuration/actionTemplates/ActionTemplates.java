package com.rs.test.configuration.actionTemplates;

import org.testng.annotations.Test;

import com.rs.test.base.TestBaseSteven;
import com.rs.test.pageObjectModel.configuration.actionTemplates.ActionTemplatesPO;
import com.rs.test.pageObjectModel.configuration.countryCodes.CountryCodesPO;
import com.rs.test.pageObjectModel.login.LoginVerificationPO;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class ActionTemplates extends TestBaseSteven{

	LoginVerificationPO loginVerificationPO;
	ActionTemplatesPO actionTemplatesPO;

  @BeforeTest
  public void beforeTest() {
	   
	  driver = initialization();
	  loginVerificationPO = new LoginVerificationPO();
	  actionTemplatesPO = new ActionTemplatesPO();
	  loginVerificationPO.login();
	  
  }
  
  @Test()
  public void createActionTemplate() {
	 
	  actionTemplatesPO.createActionTemplate();
	 
  }
  
 
  @Test(dependsOnMethods = "createActionTemplate", priority = 0)
  public void editActionTemplate() {
	  
	  actionTemplatesPO.editActionTemplate();
	  
  }
  
 /*
  @Test(dependsOnMethods = "createCountryCode",priority = 1)

  public void createModalPrefix() {
	 
	  countryCodesPO.addPrefix();
	 
  }
 
 

  @Test(dependsOnMethods = "createModalPrefix",priority = 2)

  public void editModalPrefix() {
	 
	  countryCodesPO.editPrefix();
	 
  }
  
  
  @Test(dependsOnMethods = "createModalPrefix", priority = 3)

  public void deleteModalPrefix() {
	 
	  countryCodesPO.deletePrefix();	 
  }
  */
  
  @Test(dependsOnMethods = "createActionTemplate", priority = 4)
  public void deleteActionTemplate() {
	  
	  actionTemplatesPO.deleteActionTemplate();
	  
  }
  
  @AfterTest
  public void afterTest() {
	  
	  driver.close();
	  
  }

}
