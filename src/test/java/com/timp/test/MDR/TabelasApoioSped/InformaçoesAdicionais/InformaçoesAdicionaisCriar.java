package com.timp.test.MDR.TabelasApoioSped.Informa�oesAdicionais;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.Informa�oesAdicionais.Informa�oesAdicionaisCriarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class Informa�oesAdicionaisCriar extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	Informa�oesAdicionaisCriarPO informa�oesAdicionaisCriarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		informa�oesAdicionaisCriarPO = new Informa�oesAdicionaisCriarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void criar() {
		loginTC.login();
		acessarMDRPO.acessarMDR();
		// informa�oesAdicionaisCriarPO.criar();

		boolean sucesso = informa�oesAdicionaisCriarPO.criar();
		assertTrue(sucesso, semAcesso);

	}

}
