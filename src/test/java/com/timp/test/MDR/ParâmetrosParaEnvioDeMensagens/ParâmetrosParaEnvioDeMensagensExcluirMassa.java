package com.timp.test.MDR.Par�metrosParaEnvioDeMensagens;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.Par�metrosParaEnvioDeMensagens.Par�metrosParaEnvioDeMensagensExcluirMassaPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class Par�metrosParaEnvioDeMensagensExcluirMassa extends TestBaseFernando {
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	Par�metrosParaEnvioDeMensagensExcluirMassaPO par�metrosParaEnvioDeMensagensExcluirMassaPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationF();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		par�metrosParaEnvioDeMensagensExcluirMassaPO = new Par�metrosParaEnvioDeMensagensExcluirMassaPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test(priority = 1)
	public void criar() {

		loginTC.login();
		acessarMDRPO.acessarMDR();

		boolean sucesso = par�metrosParaEnvioDeMensagensExcluirMassaPO.criar();
		assertTrue(sucesso, Criar);
	}

	@Test(priority = 2)
	public void excluirMassa() {
		boolean sucesso = par�metrosParaEnvioDeMensagensExcluirMassaPO.exluirMassa();
		assertTrue(sucesso, Eliminado);
	}
}
