package com.timp.test.MDR.Par�metrosParaEnvioDeMensagens;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.Par�metrosParaEnvioDeMensagens.Par�metrosParaEnvioDeMensagensEditarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class Par�metrosParaEnvioDeMensagensEditar extends TestBaseFernando {
	LoginTC loginTC;
	AcessarMDRPO accesarMDRPO;
	Par�metrosParaEnvioDeMensagensEditarPO par�metrosParaEnvioDeMensagensEditarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationF();
		loginTC = new LoginTC();
		accesarMDRPO = new AcessarMDRPO();
		par�metrosParaEnvioDeMensagensEditarPO = new Par�metrosParaEnvioDeMensagensEditarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test(priority = 1)
	public void editar() {

		loginTC.login();
		accesarMDRPO.acessarMDR();

		boolean sucesso = par�metrosParaEnvioDeMensagensEditarPO.editar();
		assertTrue(sucesso, Editar);
	}
}
