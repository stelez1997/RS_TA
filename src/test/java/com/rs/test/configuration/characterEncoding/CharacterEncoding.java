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
 
  @Test()
  public void createActionTemplate() {
	 
	  characterEncondingPO.createCharacterEncoding();
	 
  }

  @Test(dependsOnMethods = "createActionTemplate", priority = 1)
  public void editActionTemplate() {
	 
	  characterEncondingPO.editCharacterEncoding();
	 
  }
  
  @Test(dependsOnMethods = "createActionTemplate", priority = 2)
  public void deleteActionTemplate() {
	 
	  characterEncondingPO.deleteActionTemplate();
	 
  }

  
  @AfterTest
  public void afterTest() {
	  
	  driver.close();
	  
  }

}
