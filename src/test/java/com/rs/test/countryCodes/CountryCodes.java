package com.rs.test.countryCodes;

import org.testng.annotations.Test;

import com.rs.test.base.TestBaseSteven;
import com.rs.test.pageObjectModel.countryCodes.CountryCodesPO;
import com.rs.test.pageObjectModel.login.LoginVerificationPO;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class CountryCodes extends TestBaseSteven{

	LoginVerificationPO loginVerificationPO;
	CountryCodesPO countryCodesPO;

  @BeforeTest
  public void beforeTest() {
	   
	  driver = initialization();
	  loginVerificationPO = new LoginVerificationPO();
	  countryCodesPO = new CountryCodesPO();
	  loginVerificationPO.login();
	  
  }
  
  @Test()
  public void create() {
	 
	  countryCodesPO.createCoundtryCode();
	 
  }
  
  
  @Test(dependsOnMethods = "create", priority = 0)
  public void edit() {
	  
	  countryCodesPO.edit();
	  
  }
  
 
  @Test(dependsOnMethods = "create",priority = 1)

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
  
  @Test(dependsOnMethods = "create", priority = 4)
  public void delete() {
	  
	  countryCodesPO.delete();
	  
  }
  
  @AfterTest
  public void afterTest() {
	  
	  driver.close();
	  
  }

}
