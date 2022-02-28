package com.timp.test.MDR.TabelasApoioESocial.Tabela17;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela17.Descri��oDeNatDeLes�oExcluirPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class Descri��oDeNatDeLes�oExcluir extends TestBaseFernando {
	LoginTC loginTC;
	AcessarMDRPO acesarMDRPO;
	Descri��oDeNatDeLes�oExcluirPO descri��oDeNatDeLes�oExcluirPO;

	public Descri��oDeNatDeLes�oExcluir() {
		super();
	}

	@BeforeClass
	public void beforeClass() {
		driver = initializationF();
		loginTC = new LoginTC();
		acesarMDRPO = new AcessarMDRPO();
		descri��oDeNatDeLes�oExcluirPO = new Descri��oDeNatDeLes�oExcluirPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void excluir() {
		loginTC.login();
		acesarMDRPO.acessarMDR();
		boolean sucesso = descri��oDeNatDeLes�oExcluirPO.excluir();
		assertTrue(sucesso, Eliminado);
	}
}
