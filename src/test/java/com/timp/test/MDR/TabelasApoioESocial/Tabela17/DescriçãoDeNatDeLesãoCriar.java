package com.timp.test.MDR.TabelasApoioESocial.Tabela17;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela17.Descri��oDeNatDeLes�oCriarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class Descri��oDeNatDeLes�oCriar extends TestBaseMassiel {
	LoginTC loginTC;
	AcessarMDRPO acesarMDRPO;
	Descri��oDeNatDeLes�oCriarPO descri��oDeNatDeLes�oCriarPO;

	public Descri��oDeNatDeLes�oCriar() {
		super();
	}

	@BeforeClass
	public void beforeClass() {
		driver = initializationM();
		loginTC = new LoginTC();
		acesarMDRPO = new AcessarMDRPO();
		descri��oDeNatDeLes�oCriarPO = new Descri��oDeNatDeLes�oCriarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void criar() {
		loginTC.login();
		acesarMDRPO.acessarMDR();
		boolean sucesso = descri��oDeNatDeLes�oCriarPO.criar();
		assertTrue(sucesso, Criar);
	}
}
