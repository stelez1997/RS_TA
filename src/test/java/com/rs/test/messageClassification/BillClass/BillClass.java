package com.rs.test.messageClassification.BillClass;

import org.testng.annotations.Test;

import com.rs.test.base.TestBaseSteven;
import com.rs.test.pageObjectModel.login.LoginVerificationPO;
import com.rs.test.pageObjectModel.messageClassification.BillClass.BillClassPO;
import com.rs.test.pageObjectModel.messageClassification.DCS.DCSPO;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
//Done
public class BillClass extends TestBaseSteven {

	LoginVerificationPO loginVerificationPO;
	BillClassPO billClassPO;

	@BeforeTest
	public void beforeTest() {

		driver = initialization();
		loginVerificationPO = new LoginVerificationPO();
		billClassPO = new BillClassPO();
		loginVerificationPO.login();

	}



	@Test(priority = 0)
	public void createBillClass() {

		billClassPO.createBillClass();

	}
	
	@Test(dependsOnMethods = "createBillClass", priority = 1)
	public void editBillClass() {

		billClassPO.editBillClass();

	}
	
	
	@Test(dependsOnMethods = "createBillClass", priority = 1)
	public void deleteBillClass() {

		billClassPO.deleteBillClass();

	}
	

	@AfterTest
	public void afterTest() {

		driver.close();

	}

}
