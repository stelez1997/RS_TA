package com.rs.test.configuration.characterEncoding;

import org.testng.annotations.Test;

import com.rs.test.base.TestBaseSteven;
import com.rs.test.pageObjectModel.configuration.actionTemplates.ActionTemplatesPO;
import com.rs.test.pageObjectModel.configuration.characterEncoding.CharacterEncondingPO;
import com.rs.test.pageObjectModel.configuration.countryCodes.CountryCodesPO;
import com.rs.test.pageObjectModel.login.LoginVerificationPO;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class CharacterEncoding extends TestBaseSteven{

	LoginVerificationPO loginVerificationPO;
	CharacterEncondingPO characterEncondingPO;

  @BeforeTest
  public void beforeTest() {
	   
	  driver = initialization();
	  loginVerificationPO = new LoginVerificationPO();
	  characterEncondingPO = new CharacterEncondingPO();
	  loginVerificationPO.login();
	  
  }
  
 
  @Test(priority = 1)
  public void createCharacterEncoding() {
	 
	  characterEncondingPO.createCharacterEncoding();
	 
  }

  @Test(dependsOnMethods = "createCharacterEncoding", priority = 2)
  public void editCharacterEncoding() {
	 
	  characterEncondingPO.editCharacterEncoding();
	 
  }
  
  @Test(dependsOnMethods = "createCharacterEncoding", priority = 3)
  public void deleteCharacterEncoding() {
	 
	  characterEncondingPO.deleteCharacterEncoding();
	 
  }
 
  @Test(priority = 4)
  public void createCustomEncodeCodePoint() {
	 
	  characterEncondingPO.createCustomEncodeCodePoint();
	 
  }
  
  
  @Test(priority = 5, dependsOnMethods = "createCustomEncodeCodePoint")
  public void editCustomEncodeCodePoint() {
	 
	  characterEncondingPO.editCustomEncodeCodePoint();
	 
  }
  
  @Test(priority = 6, dependsOnMethods = "createCustomEncodeCodePoint")
  public void deleteCustomEncodeCodePoint() {
	 
	  characterEncondingPO.deleteCustomEncodeCodePoint();
	 
  }
  
  @AfterTest
  public void afterTest() {
	  
	  driver.close();
	  
  }

}
