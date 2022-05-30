package com.rs.test.clusterConfiguration.routeRules;

import org.testng.annotations.Test;

import com.rs.test.base.TestBaseSteven;
import com.rs.test.pageObjectModel.clusterConfiguration.clusterClassification.ClusterClassificationPO;
import com.rs.test.pageObjectModel.clusterConfiguration.routeRules.RouteRulesPO;
import com.rs.test.pageObjectModel.login.LoginVerificationPO;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class RouteRules extends TestBaseSteven{

	LoginVerificationPO loginVerificationPO;
	RouteRulesPO routeRulesPO;

  @BeforeTest
  public void beforeTest() {
	   
	  driver = initialization();
	  loginVerificationPO = new LoginVerificationPO();
	  routeRulesPO = new RouteRulesPO();
	  loginVerificationPO.login();
	  
  }
 /*
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
  */
  
  @Test()
  public void SMSxClusterRouteRules() {
	 
	  routeRulesPO.SMSxFilters();
	 
  }
  
  @AfterTest
  public void afterTest() {
	  
	  driver.close();
	  
  }

}
