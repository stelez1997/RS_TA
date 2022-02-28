package com.timp.test.MDR.TabelasApoioSped.CodigoAjustesContribui�oesCreditos;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.CodigoAjustesContribui�oesCreditos.CodigoAjustesContribui�aoCreditosExcluirPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class CodigoAjustesContribui�aoCreditosExcluir extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	CodigoAjustesContribui�aoCreditosExcluirPO codigoAjustesContribui�aoCreditosExcluirPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		codigoAjustesContribui�aoCreditosExcluirPO = new CodigoAjustesContribui�aoCreditosExcluirPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void excluir() {
		loginTC.login();
		acessarMDRPO.acessarMDR();
		boolean sucesso = codigoAjustesContribui�aoCreditosExcluirPO.excluir();
		assertTrue(sucesso, Eliminado);

	}

}
