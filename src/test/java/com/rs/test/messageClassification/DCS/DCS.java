package com.rs.test.messageClassification.DCS;

import org.testng.annotations.Test;

import com.rs.test.base.TestBaseSteven;
import com.rs.test.pageObjectModel.login.LoginVerificationPO;
import com.rs.test.pageObjectModel.messageClassification.DCS.DCSPO;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
//Done
public class DCS extends TestBaseSteven {

	LoginVerificationPO loginVerificationPO;
	DCSPO dcsPO;

	@BeforeTest
	public void beforeTest() {

		driver = initialization();
		loginVerificationPO = new LoginVerificationPO();
		dcsPO = new DCSPO();
		loginVerificationPO.login();

	}



	@Test(priority = 0)
	public void createDCS() {

		dcsPO.createDCS();

	}
	
	@Test(dependsOnMethods = "createDCS",priority = 1)
	public void deleteDCS() {

		dcsPO.deleteDCS();

	}
	
	@Test(priority = 2)
	public void filters() {

		dcsPO.filters();

	}

	@AfterTest
	public void afterTest() {

		driver.close();

	}

}
