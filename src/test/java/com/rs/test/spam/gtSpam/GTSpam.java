package com.rs.test.spam.gtSpam;

import org.testng.annotations.Test;

import com.rs.test.base.TestBaseSteven;
import com.rs.test.pageObjectModel.login.LoginVerificationPO;
import com.rs.test.pageObjectModel.spam.carrierTemplate.CarrierTemplatesPO;
import com.rs.test.pageObjectModel.spam.gtSpam.GTSpamPO;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class GTSpam extends TestBaseSteven {

	LoginVerificationPO loginVerificationPO;
	GTSpamPO gTSpamPO;

	@BeforeTest
	public void beforeTest() {

		driver = initialization();
		loginVerificationPO = new LoginVerificationPO();
		gTSpamPO = new GTSpamPO();
		loginVerificationPO.login();

	}



	@Test()
	public void filtersCarrierTemplate() {

		gTSpamPO.filters();

	}

	@AfterTest
	public void afterTest() {

		driver.close();

	}

}
