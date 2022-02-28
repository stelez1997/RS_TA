package com.timp.test.TPC;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TPC.AcessarTPCPO;
import com.sap.timp.pageObjectModel.TPC.Par�metrosGeraisAprovarPO;
import com.sap.timp.pageObjectModel.TPC.Par�metrosGeraisCamposManuaisPO;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Par�metrosGeraisCamposManuais extends TestBaseSteven {
	LoginTC loginTC;
	AcessarTPCPO acessarTPCPO;
	Par�metrosGeraisCamposManuaisPO par�metrosGeraisCamposManuaisPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarTPCPO = new AcessarTPCPO();
		par�metrosGeraisCamposManuaisPO = new Par�metrosGeraisCamposManuaisPO();
	}

	@AfterClass
	public void afterClass() {
		// driver.close();
	}

	@Test(priority = 0)
	public void ingresar() {
		loginTC.login();
	}

	@Test(priority = 1)
	public void ingresarTPC() {

		acessarTPCPO.acessarTPC();

	}

	@Test(priority = 2)
	public void aprovado() {

		boolean sucesso = par�metrosGeraisCamposManuaisPO.manuais();
	}
}
