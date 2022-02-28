package com.timp.test.MDR.Par�metrosParaEnvioDeMensagens;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.Par�metrosParaEnvioDeMensagens.Par�metrosParaEnvioDeMensagensExcluirPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class Par�metrosParaEnvioDeMensagensExcluir extends TestBaseFernando {
	LoginTC loginTC;
	AcessarMDRPO accesarMDRPO;
	Par�metrosParaEnvioDeMensagensExcluirPO par�metrosParaEnvioDeMensagensExcluirPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationF();
		loginTC = new LoginTC();
		accesarMDRPO = new AcessarMDRPO();
		par�metrosParaEnvioDeMensagensExcluirPO = new Par�metrosParaEnvioDeMensagensExcluirPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test(priority = 1)
	public void excluir() {

		loginTC.login();
		accesarMDRPO.acessarMDR();

		boolean sucesso = par�metrosParaEnvioDeMensagensExcluirPO.excluir();
		assertTrue(sucesso, Eliminado);
	}
}
