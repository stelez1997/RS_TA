package com.rs.test.configuration.countryCodes;

import org.testng.annotations.Test;

import com.rs.test.base.TestBaseSteven;
import com.rs.test.pageObjectModel.configuration.countryCodes.CountryCodesPO;
import com.rs.test.pageObjectModel.login.LoginVerificationPO;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
//Done
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
 
  @Test(priority = 1)
  public void createCountryCode() {
	 
	  countryCodesPO.createCoundtryCode();
	 
  }
  
  
  @Test(dependsOnMethods = "createCountryCode", priority = 2)
  public void editContryCode() {
	  
	  countryCodesPO.editCountryCode();
	  
  }
  
 
  @Test(dependsOnMethods = "createCountryCode",priority = 3)

  public void createModalPrefix() {
	 
	  countryCodesPO.addPrefix();
	 
  }
 
 

  @Test(dependsOnMethods = "createModalPrefix",priority = 4)

  public void editModalPrefix() {
	 
	  countryCodesPO.editPrefix();
	 
  }
  
  
  @Test(dependsOnMethods = "createModalPrefix", priority = 5)

  public void deleteModalPrefix() {
	 
	  countryCodesPO.deletePrefix();	 
  }
  
  @Test(dependsOnMethods = "createCountryCode", priority = 6)
  public void deleteCountryCode() {
	  
	  countryCodesPO.deleteCountryCode();
	  
  }
 
  @Test(priority = 0)
  public void filters() {
	 
	  countryCodesPO.filter();
	 
  }
  
 
  
  
  
  @AfterTest
  public void afterTest() {
	  
	  driver.close();
	  
  }

}
