package com.rs.test.messageClassification.ChangeSet;

import org.testng.annotations.Test;

import com.rs.test.base.TestBaseSteven;
import com.rs.test.pageObjectModel.login.LoginVerificationPO;
import com.rs.test.pageObjectModel.messageClassification.BillClass.BillClassPO;
import com.rs.test.pageObjectModel.messageClassification.ChangeSet.ChangeSetPO;
import com.rs.test.pageObjectModel.messageClassification.DCS.DCSPO;
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
	public void createChangeSetMessageClassification() {

		changeSetPO.createChangeSetMessageClassification();

	}
	

	@Test(dependsOnMethods = "createChangeSetMessageClassification", priority = 3)
	public void editChangeSetMessageClassification() {

		changeSetPO.editChangeSetMessageClassification();

	}
	
	@Test(dependsOnMethods = "createChangeSetMessageClassification", priority = 4)
	public void deleteChangeSetMessageClassification() {

		changeSetPO.deleteChangeSetMessageClassification();

	}
	
	@Test(dependsOnMethods = "createChangeSet", priority = 5)
	public void deleteChangeSet() {

		changeSetPO.deleteChangeSet();

	}
	
	@AfterTest
	public void afterTest() {

		driver.close();

	}

}
