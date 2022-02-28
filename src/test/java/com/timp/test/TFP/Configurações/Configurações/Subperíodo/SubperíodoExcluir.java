package com.timp.test.TFP.Configura��es.Configura��es.Subper�odo;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TFP.AcessarTFPPO;
import com.sap.timp.pageObjectModel.TFP.Configura��es.Configura��es.Subper�odo.Subper�odoExcluirPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class Subper�odoExcluir extends TestBaseMassiel {
	LoginTC loginTC;
	AcessarTFPPO acessarTFPPO;
	Subper�odoExcluirPO subper�odoExcluirPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationM();
		loginTC = new LoginTC();
		acessarTFPPO = new AcessarTFPPO();
		subper�odoExcluirPO = new Subper�odoExcluirPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void excluir() {
		loginTC.login();
		acessarTFPPO.acessarTFP();

		boolean sucesso2 = subper�odoExcluirPO.Excluir();
		assertTrue(sucesso2, Eliminado);
	}
}
