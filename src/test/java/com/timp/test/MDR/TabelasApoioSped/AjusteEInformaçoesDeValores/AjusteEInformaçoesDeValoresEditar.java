package com.timp.test.MDR.TabelasApoioSped.AjusteEInforma�oesDeValores;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.AjusteEInforma�oesDeValores.AjusteEInforma�oesDeValoresEditarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class AjusteEInforma�oesDeValoresEditar extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	AjusteEInforma�oesDeValoresEditarPO ajusteEInforma�oesDeValoresEditarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		ajusteEInforma�oesDeValoresEditarPO = new AjusteEInforma�oesDeValoresEditarPO();
	}

	@AfterClass
	public void afterClass() {
		//driver.close();
	}

	@Test()
	public void editar() {

		loginTC.login();

		acessarMDRPO.acessarMDR();

		boolean sucesso = ajusteEInforma�oesDeValoresEditarPO.editar();

		assertTrue(sucesso, visualiza�ar);
	}

}
