package com.timp.test.TCC.BancoDeCr�ditoTribut�rio.Configura��odeBancodeCr�ditoTribut�rio;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TCC.AcessarTCCPO;
import com.sap.timp.pageObjectModel.TCC.BancodeCr�ditoTribut�rio.Configura��odeBancodeCr�ditoTribut�rio.Configura��odeBancodeCr�ditoTribut�rioExcluirPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class Configura��odeBancodeCr�ditoTribut�rioExcluir extends TestBaseSteven {
	LoginTC loginTC;
	AcessarTCCPO acessarTCCPO;
	Configura��odeBancodeCr�ditoTribut�rioExcluirPO configura��odeBancodeCr�ditoTribut�rioExcluirPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarTCCPO = new AcessarTCCPO();
		configura��odeBancodeCr�ditoTribut�rioExcluirPO = new Configura��odeBancodeCr�ditoTribut�rioExcluirPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void excluir() {
		loginTC.login();
		acessarTCCPO.acessarTCC();
		
		boolean sucesso2 = configura��odeBancodeCr�ditoTribut�rioExcluirPO.excluir();
		assertTrue(sucesso2, Eliminado);
	}

}
