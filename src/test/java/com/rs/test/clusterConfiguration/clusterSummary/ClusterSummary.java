package com.rs.test.clusterConfiguration.clusterSummary;

import org.testng.annotations.Test;

import com.rs.test.base.TestBaseSteven;
import com.rs.test.pageObjectModel.clusterConfiguration.clusteRouteRules.ClusterRouteRulesPO;
import com.rs.test.pageObjectModel.clusterConfiguration.clusteSummary.ClusterSummaryPO;
import com.rs.test.pageObjectModel.clusterConfiguration.clusterClassification.ClusterClassificationPO;
import com.rs.test.pageObjectModel.login.LoginVerificationPO;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class ClusterSummary extends TestBaseSteven{

	LoginVerificationPO loginVerificationPO;
	ClusterSummaryPO clusterSummaryPO;
	

  @BeforeTest
  public void beforeTest() {
	   
	  driver = initialization();
	  loginVerificationPO = new LoginVerificationPO();
	  clusterSummaryPO = new ClusterSummaryPO();
	  loginVerificationPO.login();
	  
  }
 
  //Suggest Classification
  @Test(priority = 0)
  public void createSuggestClassification() {
	 
	  clusterSummaryPO.createSuggestClassification();
	 
  }
  

  @Test(dependsOnMethods = "createSuggestClassification", priority = 1)
  public void editSuggestClassification() {
	 
	  clusterSummaryPO.editSuggestClassification();
	 
  }

  @Test(dependsOnMethods = "createSuggestClassification", priority = 2)
  public void deleteSuggestClassification() {
	 
	  clusterSummaryPO.deleteSuggestClassifaction();
	 
  }


  
  @AfterTest
  public void afterTest() {
	  
	  driver.close();
	  
  }

}
