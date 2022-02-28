package com.timp.test.TFP.Configura��es.Bloqueios.SubPeriodo;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TFP.AcessarTFPPO;
import com.sap.timp.pageObjectModel.TFP.Configura��es.Bloqueios.SubPeriodo.BloqueioSubPeriodoVerPO;

public class BloqueioSubPeriodoVer extends TestBaseSteven {

	LoginTC loginTC;
	AcessarTFPPO acessarTFPPO;
	BloqueioSubPeriodoVerPO bloqueioSubPeriodoVerPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarTFPPO = new AcessarTFPPO();
		bloqueioSubPeriodoVerPO = new BloqueioSubPeriodoVerPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}



	@Test()
	public void ver() {
		
		loginTC.login();
		acessarTFPPO.acessarTFP();
		
		ArrayList<Boolean> sucesso = bloqueioSubPeriodoVerPO.ver();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualiza�ar);
		}
	
		sleep(3000); 
	}

}
