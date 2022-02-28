package com.timp.test.MDR.RegistroDeExporta�ao;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.RegistroDeExporta�ao.RegistroDeExporta�aoCriarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class RegistroDeExporta�aoCriar extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	RegistroDeExporta�aoCriarPO registroDeExporta�aoCriarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		registroDeExporta�aoCriarPO = new RegistroDeExporta�aoCriarPO();
	}

	@AfterClass
	public void afterClass() {

		driver.close();

	}
	@Test()
	public void criar() {

		loginTC.login();
		acessarMDRPO.acessarMDR();

		boolean sucesso = registroDeExporta�aoCriarPO.criar();
		assertTrue(sucesso, semAcesso);

	}

}
