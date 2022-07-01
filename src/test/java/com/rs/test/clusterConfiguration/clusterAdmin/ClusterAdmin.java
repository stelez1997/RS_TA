package com.rs.test.clusterConfiguration.clusterAdmin;

import org.testng.annotations.Test;

import com.rs.test.base.TestBaseSteven;
import com.rs.test.pageObjectModel.clusterConfiguration.clusteRouteRules.ClusterRouteRulesPO;
import com.rs.test.pageObjectModel.clusterConfiguration.clusteSummary.ClusterSummaryPO;
import com.rs.test.pageObjectModel.clusterConfiguration.clusterAdmin.ClusterAdminPO;
import com.rs.test.pageObjectModel.clusterConfiguration.clusterClassification.ClusterClassificationPO;
import com.rs.test.pageObjectModel.login.LoginVerificationPO;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class ClusterAdmin extends TestBaseSteven{

	LoginVerificationPO loginVerificationPO;
	ClusterAdminPO clusterAdminPO;
	

  @BeforeTest
  public void beforeTest() {
	   
	  driver = initialization();
	  loginVerificationPO = new LoginVerificationPO();
	  clusterAdminPO = new ClusterAdminPO();
	  loginVerificationPO.login();
	  
  }
 
  //Queue Monitor
  @Test(priority = 0)
  public void createQueueMonitor() {
	 
	  clusterAdminPO.createQueueMonitor();
	 
  }

  @Test(dependsOnMethods = "createQueueMonitor",priority = 1)
  public void editQueueMonitor() {
	 
	  clusterAdminPO.editQueueMonitor();
	 
  }
  
  @Test(dependsOnMethods = "createQueueMonitor", priority = 2)
  public void deleteQueueMonitor() {
	 
	  clusterAdminPO.deleteQueueMonitor();
	 
  }

  
  @AfterTest
  public void afterTest() {
	  
	  driver.close();
	  
  }

}
