package com.timp.test.TCC.BancoDeCr�ditoTribut�rio.Configura��odeBancodeCr�ditoTribut�rio;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TCC.AcessarTCCPO;
import com.sap.timp.pageObjectModel.TCC.BancodeCr�ditoTribut�rio.Configura��odeBancodeCr�ditoTribut�rio.Configura��odeBancodeCr�ditoTribut�rioEditarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class Configura��odeBancodeCr�ditoTribut�rioEditar extends TestBaseMassiel {

	LoginTC loginTC;
	AcessarTCCPO acessarTCCPO;
	Configura��odeBancodeCr�ditoTribut�rioEditarPO configura��odeBancodeCr�ditoTribut�rioEditarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationM();
		loginTC = new LoginTC();
		acessarTCCPO = new AcessarTCCPO();
		configura��odeBancodeCr�ditoTribut�rioEditarPO = new Configura��odeBancodeCr�ditoTribut�rioEditarPO();
	}

	@AfterClass
	public void afterClass() {
		//driver.close();
	}
	
	@Test()
	public void editar() {
		loginTC.login();
		acessarTCCPO.acessarTCC();
		
		boolean sucesso = configura��odeBancodeCr�ditoTribut�rioEditarPO.Editar();
		assertTrue(sucesso, Criar);
	}

}
