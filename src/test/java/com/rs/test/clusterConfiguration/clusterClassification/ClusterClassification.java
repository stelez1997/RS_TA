package com.rs.test.clusterConfiguration.clusterClassification;

import org.testng.annotations.Test;

import com.rs.test.base.TestBaseSteven;
import com.rs.test.pageObjectModel.clusterConfiguration.clusterClassification.ClusterClassificationPO;
import com.rs.test.pageObjectModel.configuration.countryCodes.CountryCodesPO;
import com.rs.test.pageObjectModel.login.LoginVerificationPO;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class ClusterClassification extends TestBaseSteven{

	LoginVerificationPO loginVerificationPO;
	ClusterClassificationPO clusterClassificationPO;
  @BeforeTest
  public void beforeTest() {
	   
	  driver = initialization();
	  loginVerificationPO = new LoginVerificationPO();
	  clusterClassificationPO = new ClusterClassificationPO();
	  loginVerificationPO.login();
	  
  }
 
  @Test()
  public void createClusterClassification() {
	 
	  clusterClassificationPO.createClusterClassification();
	 
  }
  
  @Test(dependsOnMethods = "createClusterClassification", priority = 0)
  public void editClusterClassification() {
	 
	  clusterClassificationPO.editClusterClassification();
	 
  }
  
  @Test(dependsOnMethods = "createClusterClassification", priority = 1)
  public void deleteClusterClassification() {
	 
	  clusterClassificationPO.deleteClusterClassification();
	 
  }
  
  
  
  
  @AfterTest
  public void afterTest() {
	  
	  driver.close();
	  
  }

}
