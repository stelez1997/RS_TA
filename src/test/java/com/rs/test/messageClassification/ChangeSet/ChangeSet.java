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
	

	@AfterTest
	public void afterTest() {

		driver.close();

	}

}
