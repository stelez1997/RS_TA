package com.timp.test.BSC;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRB.AcessarBrbPO;
import com.sap.timp.pageObjectModel.BSC.AcessarBSCPO;
import com.sap.timp.pageObjectModel.BSC.Corre��odeNFRejeitarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class Corre��odeNFRejeitar extends TestBaseMassiel{

	LoginTC loginTC;
	AcessarBSCPO acessarBSC;
	AcessarBrbPO acessarBrbPO;
	Corre��odeNFRejeitarPO  corre��odeNFRejeitarPO;

	@BeforeClass
	public void beforeClass() {	  
		driver = initializationM();
		loginTC = new LoginTC();
		acessarBrbPO = new AcessarBrbPO();
		corre��odeNFRejeitarPO = new Corre��odeNFRejeitarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void  rejeitar() {
		loginTC.login();
		acessarBrbPO.acessar();

		ArrayList<Boolean> rejeitar =   corre��odeNFRejeitarPO.Rejeitar();
		for (int i = 0; i < rejeitar.size(); i++) {
			assertTrue(rejeitar.get(i), Filtros);
		}
	}
}
