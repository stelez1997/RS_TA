package com.timp.test.TCC.BancoDeCr�ditoTribut�rio.Configura��odeBancodeCr�ditoTribut�rio;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TCC.AcessarTCCPO;
import com.sap.timp.pageObjectModel.TCC.BancodeCr�ditoTribut�rio.Configura��odeBancodeCr�ditoTribut�rio.Configura��odeBancodeCr�ditoTribut�rioCriarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class Configura��odeBancodeCr�ditoTribut�rioCriar extends TestBaseMassiel {
	LoginTC loginTC;
	AcessarTCCPO acessarTCCPO;
	Configura��odeBancodeCr�ditoTribut�rioCriarPO configura��odeBancodeCr�ditoTribut�rioCriarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationM();
		loginTC = new LoginTC();
		acessarTCCPO = new AcessarTCCPO();
		configura��odeBancodeCr�ditoTribut�rioCriarPO = new Configura��odeBancodeCr�ditoTribut�rioCriarPO();
	}

	@AfterClass
	public void afterClass() {
		// driver.close();
	}


	@Test()
	public void criar() {
		loginTC.login();
		acessarTCCPO.acessarTCC();
		
		boolean sucesso = configura��odeBancodeCr�ditoTribut�rioCriarPO.criar();
		assertTrue(sucesso, Criar);
	}

}
