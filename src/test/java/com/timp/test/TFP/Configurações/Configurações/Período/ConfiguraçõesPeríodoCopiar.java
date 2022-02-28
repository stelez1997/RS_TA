package com.timp.test.TFP.Configura��es.Configura��es.Per�odo;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TFP.AcessarTFPPO;
import com.sap.timp.pageObjectModel.TFP.Configura��es.Configura��es.Per�odo.Configura��esPer�odoCopiarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class Configura��esPer�odoCopiar extends TestBaseKenssy {
	LoginTC loginTC;
	AcessarTFPPO acessarTFPPO;
	Configura��esPer�odoCopiarPO configura��esPer�odoCopiarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationKen();
		loginTC = new LoginTC();
		acessarTFPPO = new AcessarTFPPO();
		configura��esPer�odoCopiarPO = new Configura��esPer�odoCopiarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void copiar() {

		loginTC.login();

		acessarTFPPO.acessarTFP();

		boolean sucesso = configura��esPer�odoCopiarPO.copiar();
		assertTrue(sucesso, Editar);

	}

}
