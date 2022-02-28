package com.timp.test.MDR.TabelasApoioESocial.Tabela24;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela16.SGDPCriarPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela24.Codifica��oDeAcDeTrabCriarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class Codifica��oDeAcDeTrabCriar extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	Codifica��oDeAcDeTrabCriarPO codifica��oDeAcDeTrabCriarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		codifica��oDeAcDeTrabCriarPO = new Codifica��oDeAcDeTrabCriarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();

	}

	@Test()
	public void criar() {

		loginTC.login();

		acessarMDRPO.acessarMDR();

		boolean sucesso = codifica��oDeAcDeTrabCriarPO.criar();

		assertTrue(sucesso, Criar);

	}
}
