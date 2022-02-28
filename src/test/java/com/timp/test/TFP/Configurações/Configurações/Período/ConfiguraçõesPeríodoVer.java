package com.timp.test.TFP.Configura��es.Configura��es.Per�odo;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TFP.AcessarTFPPO;
import com.sap.timp.pageObjectModel.TFP.Configura��es.Configura��es.Per�odo.Configura��esPer�odoVerPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class Configura��esPer�odoVer extends TestBaseKenssy {

	LoginTC loginTC;
	AcessarTFPPO acessarTFPPO;
	Configura��esPer�odoVerPO configura��esPer�odoVerPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationKen();
		loginTC = new LoginTC();
		acessarTFPPO = new AcessarTFPPO();
		configura��esPer�odoVerPO = new Configura��esPer�odoVerPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void ver() {
		loginTC.login();

		acessarTFPPO.acessarTFP();

		ArrayList<Boolean> sucesso = configura��esPer�odoVerPO.ver();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualiza�ar);
		}

	}

}
