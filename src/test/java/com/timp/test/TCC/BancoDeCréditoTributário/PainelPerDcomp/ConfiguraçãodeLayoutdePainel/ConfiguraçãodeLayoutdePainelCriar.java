package com.timp.test.TCC.BancoDeCr�ditoTribut�rio.PainelPerDcomp.Configura��odeLayoutdePainel;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TAA.AcessarTAAPO;
import com.sap.timp.pageObjectModel.TAA.Atribui��esdeRegras.RegradeAbasCriarPO;
import com.sap.timp.pageObjectModel.TCC.AcessarTCCPO;
import com.sap.timp.pageObjectModel.TCC.BancodeCr�ditoTribut�rio.PainelPerDcomp.Configura��odeLayoutdePainel.Configura��odeLayoutdePainelCriarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class Configura��odeLayoutdePainelCriar extends TestBaseSteven {
	LoginTC loginTC;
	AcessarTCCPO acessarTCCPO;
	Configura��odeLayoutdePainelCriarPO configura��odeLayoutdePainelCriarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarTCCPO = new AcessarTCCPO();
		configura��odeLayoutdePainelCriarPO = new Configura��odeLayoutdePainelCriarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void criar() {
		loginTC.login();
		acessarTCCPO.acessarTCC();
		
		boolean sucesso = configura��odeLayoutdePainelCriarPO.criar();
		assertTrue(sucesso, Criar);
	}

}
