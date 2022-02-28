package com.timp.test.TFP.Configura��es.Configura��es.Per�odo;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TFP.AcessarTFPPO;
import com.sap.timp.pageObjectModel.TFP.Configura��es.Configura��es.Per�odo.Configura��esPer�odoExcluirPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class Configura��esPer�odoExcluir extends TestBaseKenssy {
	LoginTC loginTC;
	AcessarTFPPO acessarTFPPO;
	Configura��esPer�odoExcluirPO configura��esPer�odoExcluirPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationKen();
		loginTC = new LoginTC();
		acessarTFPPO = new AcessarTFPPO();
		configura��esPer�odoExcluirPO = new Configura��esPer�odoExcluirPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void excluir() {
		loginTC.login();

		acessarTFPPO.acessarTFP();

		boolean sucesso = configura��esPer�odoExcluirPO.excluir();
		assertTrue(sucesso, Editar);
	}
}
