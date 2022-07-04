package com.rs.test.spam.gtRules;

import org.testng.annotations.Test;

import com.rs.test.base.TestBaseSteven;
import com.rs.test.pageObjectModel.login.LoginVerificationPO;
import com.rs.test.pageObjectModel.spam.carrierTemplate.CarrierTemplatesPO;
import com.rs.test.pageObjectModel.spam.gtRules.GTRulesPO;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class GTRules extends TestBaseSteven {

	LoginVerificationPO loginVerificationPO;
	GTRulesPO gTRulesPO;

	@BeforeTest
	public void beforeTest() {

		driver = initialization();
		loginVerificationPO = new LoginVerificationPO();
		gTRulesPO = new GTRulesPO();
		loginVerificationPO.login();

	}



	@Test()
	public void filtersCarrierTemplate() {

		gTRulesPO.filters();

	}

	@AfterTest
	public void afterTest() {

		driver.close();

	}

}
