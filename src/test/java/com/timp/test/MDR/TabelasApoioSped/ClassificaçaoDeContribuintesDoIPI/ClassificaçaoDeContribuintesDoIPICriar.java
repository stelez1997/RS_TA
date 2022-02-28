package com.timp.test.MDR.TabelasApoioSped.Classifica�aoDeContribuintesDoIPI;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.Classifica�aoDeContribuintesDoIPI.Classifica�aoDeContribuintesDoIPICriarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class Classifica�aoDeContribuintesDoIPICriar extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	Classifica�aoDeContribuintesDoIPICriarPO classifica�aoDeContribuintesDoIPICriarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		classifica�aoDeContribuintesDoIPICriarPO = new Classifica�aoDeContribuintesDoIPICriarPO();
	}

	@AfterClass
	public void afterClass() {
//		driver.close();
	}

	@Test()
	public void criar() {
		loginTC.login();
		acessarMDRPO.acessarMDR();
		boolean sucesso = classifica�aoDeContribuintesDoIPICriarPO.criar();
		assertTrue(sucesso, semAcesso);

	}

}
