package com.rs.test.spam.carrierTemplate;

import org.testng.annotations.Test;

import com.rs.test.base.TestBaseSteven;
import com.rs.test.pageObjectModel.login.LoginVerificationPO;
import com.rs.test.pageObjectModel.spam.carrierTemplate.CarrierTemplatesPO;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class CarrierTemplate extends TestBaseSteven {

	LoginVerificationPO loginVerificationPO;
	CarrierTemplatesPO carrierTemplatesPO;

	@BeforeTest
	public void beforeTest() {

		driver = initialization();
		loginVerificationPO = new LoginVerificationPO();
		carrierTemplatesPO = new CarrierTemplatesPO();
		loginVerificationPO.login();

	}



	@Test()
	public void filtersActionTemplate() {

		carrierTemplatesPO.filters();

	}

	@AfterTest
	public void afterTest() {

		driver.close();

	}

}
