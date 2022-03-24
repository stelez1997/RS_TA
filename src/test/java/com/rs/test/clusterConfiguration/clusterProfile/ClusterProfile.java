package com.rs.test.clusterConfiguration.clusterProfile;

import org.testng.annotations.Test;

import com.rs.test.base.TestBaseSteven;
import com.rs.test.pageObjectModel.clusterConfiguration.clusterClassification.ClusterClassificationPO;
import com.rs.test.pageObjectModel.clusterConfiguration.clusterProfile.ClusterProfilePO;
import com.rs.test.pageObjectModel.configuration.countryCodes.CountryCodesPO;
import com.rs.test.pageObjectModel.login.LoginVerificationPO;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class ClusterProfile extends TestBaseSteven{

	LoginVerificationPO loginVerificationPO;
	ClusterProfilePO clusterProfilePO;

  @BeforeTest
  public void beforeTest() {
	   
	  driver = initialization();
	  loginVerificationPO = new LoginVerificationPO();
	  clusterProfilePO = new ClusterProfilePO();
	  loginVerificationPO.login();
	  
  }
 
  @Test()
  public void createClusterProfile() {
	 
	  clusterProfilePO.editClusterProfile();
	 
  }
  
  @AfterTest
  public void afterTest() {
	  
	  driver.close();
	  
  }

}
