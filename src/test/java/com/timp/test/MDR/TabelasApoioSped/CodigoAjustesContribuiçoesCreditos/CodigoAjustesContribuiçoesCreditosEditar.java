package com.timp.test.MDR.TabelasApoioSped.CodigoAjustesContribui�oesCreditos;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.CodigoAjustesContribui�oesCreditos.CodigoAjustesContribui�oesCreditosEditarPO;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.AfterClass;

public class CodigoAjustesContribui�oesCreditosEditar extends TestBaseFernando {
	LoginTC loginTC;
	AcessarMDRPO acesarMDRPO;
	CodigoAjustesContribui�oesCreditosEditarPO codigoAjustesContribui�oesCreditosEditarPO;

	public CodigoAjustesContribui�oesCreditosEditar() {
		super();
	}

	@BeforeClass
	public void beforeClass() {
		driver = initializationF();
		loginTC = new LoginTC();
		acesarMDRPO = new AcessarMDRPO();
		codigoAjustesContribui�oesCreditosEditarPO = new CodigoAjustesContribui�oesCreditosEditarPO();
	}

	@AfterClass
	public void afterClass() {
		// driver.close();
	}

	@Test()
	public void editar() {
		loginTC.login();
		acesarMDRPO.acessarMDR();
		codigoAjustesContribui�oesCreditosEditarPO.editar();
	}
}
