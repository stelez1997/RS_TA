package com.timp.test.BRB;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRB.AcessarBrbPO;
import com.sap.timp.pageObjectModel.BRB.RegrasPO;
import com.sap.timp.pageObjectModel.BRB.cabe�alhoPO;

public class Cabe�alho extends TestBaseSteven {

	LoginTC loginTC;
	AcessarBrbPO acessarBrbPO;
	cabe�alhoPO cabe�alhoPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarBrbPO = new AcessarBrbPO();
		cabe�alhoPO = new cabe�alhoPO();

	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}


	@Test()
	public void cabe�alho() {
		
		loginTC.login();
		
		acessarBrbPO.acessar();
		
		cabe�alhoPO.cabe�alho();
		sleep(2000);
	}

}
