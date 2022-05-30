package com.rs.test.clusterConfiguration.clusterCallToAction;

import org.testng.annotations.Test;

import com.rs.test.base.TestBaseSteven;
import com.rs.test.pageObjectModel.clusterConfiguration.clusterCallToAction.ClusterCallToActionPO;
import com.rs.test.pageObjectModel.login.LoginVerificationPO;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
//Done
public class ClusterCallToAction extends TestBaseSteven{

	LoginVerificationPO loginVerificationPO;
	ClusterCallToActionPO clusterCallToActionPO;
  @BeforeTest
  public void beforeTest() {
	   
	  driver = initialization();
	  loginVerificationPO = new LoginVerificationPO();
	  clusterCallToActionPO = new ClusterCallToActionPO();
	  loginVerificationPO.login();
	  
  }
 
  @Test(priority = 1)
  public void createClusterCallToAction() {
	 
	  clusterCallToActionPO.createClusterCallToAction();
	 
  }
  

  
  @Test(dependsOnMethods = "createClusterCallToAction", priority = 0)
  public void editClusterCallToAction() {
	 
	  clusterCallToActionPO.editClusterCallToAction();
	
  }
  
  @Test(dependsOnMethods = "createClusterCallToAction", priority = 1)
  public void deleteClusterCallToAction() {
	 
	  clusterCallToActionPO.deleteClusterCallToAction();
	 
  }
  
  @Test(priority = 2)
  public void filters() {
	 
	  clusterCallToActionPO.filters();
	
  }
  
  
  
  
  @AfterTest
  public void afterTest() {
	  
	  driver.close();
	  
  }

}
