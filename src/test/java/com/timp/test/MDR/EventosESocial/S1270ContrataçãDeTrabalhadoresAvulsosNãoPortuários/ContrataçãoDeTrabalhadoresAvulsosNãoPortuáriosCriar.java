package com.timp.test.MDR.EventosESocial.S1270Contrata��DeTrabalhadoresAvulsosN�oPortu�rios;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.EventosESocial.S1270Contrata��DeTrabalhadoresAvulsosN�oPortu�rios.Contrata��oDeTrabalhadoresAvulsosN�oPortu�riosCriarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class Contrata��oDeTrabalhadoresAvulsosN�oPortu�riosCriar extends TestBaseFernando{
	LoginTC loginTC;
	AcessarMDRPO accesarMDRPO;
	Contrata��oDeTrabalhadoresAvulsosN�oPortu�riosCriarPO contrata��oDeTrabalhadoresAvulsosN�oPortu�riosCriarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationF();
		loginTC = new LoginTC();
		accesarMDRPO = new AcessarMDRPO();
		contrata��oDeTrabalhadoresAvulsosN�oPortu�riosCriarPO = new Contrata��oDeTrabalhadoresAvulsosN�oPortu�riosCriarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}


	@Test()
	public void criar() {
		loginTC.login();
		accesarMDRPO.acessarMDR();
		boolean sucesso = contrata��oDeTrabalhadoresAvulsosN�oPortu�riosCriarPO.criar();
		assertTrue(sucesso, Criar);
	}
}
