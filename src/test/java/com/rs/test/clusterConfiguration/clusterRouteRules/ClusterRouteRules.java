package com.rs.test.clusterConfiguration.clusterRouteRules;

import org.testng.annotations.Test;

import com.rs.test.base.TestBaseSteven;
import com.rs.test.pageObjectModel.clusterConfiguration.clusteRouteRules.ClusterRouteRulesPO;
import com.rs.test.pageObjectModel.clusterConfiguration.clusterClassification.ClusterClassificationPO;
import com.rs.test.pageObjectModel.login.LoginVerificationPO;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class ClusterRouteRules extends TestBaseSteven{

	LoginVerificationPO loginVerificationPO;
	ClusterRouteRulesPO routeRulesPO;

  @BeforeTest
  public void beforeTest() {
	   
	  driver = initialization();
	  loginVerificationPO = new LoginVerificationPO();
	  routeRulesPO = new ClusterRouteRulesPO();
	  loginVerificationPO.login();
	  
  }
 
  //----------------------------------SMSX Cluster Router Rules
  @Test(priority = 0)
  public void createSMSXClusterRouteRules() {
	 
	  routeRulesPO.createSMSxClusterRouteRules();
	 
  }
  @Test(dependsOnMethods = "createSMSXClusterRouteRules", priority = 1)
  public void editSMSXClusterRouteRules() {
	 
	  routeRulesPO.editSMSxClusterRouteRules();
	 
  }
  
  @Test(dependsOnMethods = "createSMSXClusterRouteRules", priority = 2)
  public void deleteSMSXClusterRouteRules() {
	 
	  routeRulesPO.deleteSMSxClusterRouteRules();
	 
  }
  

//----------------------------------ISMS Cluster Router Rules
  @Test(priority = 3)
  public void createISMSClusterRouteRules() {
	 
	  routeRulesPO.createISMSClusterRouteRules();
	 
  }
  
  @Test(dependsOnMethods = "createISMSClusterRouteRules", priority = 4)
  public void editISMSClusterRouteRules() {
	 
	  routeRulesPO.editISMSClusterRouteRules();
	 
  }
  
  @Test(dependsOnMethods = "createISMSClusterRouteRules", priority = 5)
  public void deleteISMSClusterRouteRules() {
	 
	  routeRulesPO.deleteISMSClusterRouteRules();
	 
  }
  
  
  @Test(priority = 6)
  public void filtersSMSxClusterRouteRules() {
	 
	  routeRulesPO.SMSxFilters();
	 
  }
 
  
  @Test(priority = 7)
  public void filtersISMSClusterRouteRules() {
	 
	  routeRulesPO.ISMSFilters();
	 
  }
  
  @AfterTest
  public void afterTest() {
	  
	  driver.close();
	  
  }

}
