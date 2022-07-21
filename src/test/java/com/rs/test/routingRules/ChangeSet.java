package com.rs.test.routingRules;

import org.testng.annotations.Test;

import com.rs.test.base.TestBaseSteven;
import com.rs.test.pageObjectModel.login.LoginVerificationPO;
import com.rs.test.pageObjectModel.routingRules.ChangeSet.ChangeSetPO;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
//Done
public class ChangeSet extends TestBaseSteven {

	LoginVerificationPO loginVerificationPO;
	ChangeSetPO changeSetPO;
	

	@BeforeTest
	public void beforeTest() {

		driver = initialization();
		loginVerificationPO = new LoginVerificationPO();
		changeSetPO = new ChangeSetPO();
		loginVerificationPO.login();

	}



	@Test(priority = 0)
	public void createChangeSet() {

		changeSetPO.createChangeSet();

	}
	
	@Test(dependsOnMethods = "createChangeSet", priority = 1)
	public void editChangeSet() {

		changeSetPO.editChangeSet();

	}
	
	@Test(dependsOnMethods = "createChangeSet", priority = 2)
	public void deleteChangeSet() {

		changeSetPO.deleteChangeSet();

	}
	
	@Test()
	public void createRoutingRulesChangeSet() {

		changeSetPO.createRoutingRulesChangeSet();

	}
	
	@Test()
	public void editRoutingRulesChangeSet() {

		changeSetPO.editRoutingRulesChangeSet();

	}
	
	@Test()
	public void deleteRoutingRulesChangeSet() {

		changeSetPO.deleteRoutingRulesChangeSet();

	}

	
	@AfterTest
	public void afterTest() {

		//driver.close();

	}

}
