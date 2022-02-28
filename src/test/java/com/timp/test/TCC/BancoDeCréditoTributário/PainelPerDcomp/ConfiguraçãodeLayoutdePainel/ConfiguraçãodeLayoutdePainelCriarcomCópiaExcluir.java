package com.timp.test.TCC.BancoDeCr�ditoTribut�rio.PainelPerDcomp.Configura��odeLayoutdePainel;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TCC.AcessarTCCPO;
import com.sap.timp.pageObjectModel.TCC.BancodeCr�ditoTribut�rio.PainelPerDcomp.Configura��odeLayoutdePainel.Configura��odeLayoutdePainelCriarcomC�piaExcluirPO;
import com.sap.timp.pageObjectModel.TCC.BancodeCr�ditoTribut�rio.PainelPerDcomp.Configura��odeLayoutdePainel.Configura��odeLayoutdePainelEditarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class Configura��odeLayoutdePainelCriarcomC�piaExcluir extends TestBaseSteven {
	LoginTC loginTC;
	AcessarTCCPO acessarTCCPO;
	Configura��odeLayoutdePainelCriarcomC�piaExcluirPO configura��odeLayoutdePainelCriarcomC�piaExcluirPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarTCCPO = new AcessarTCCPO();
		configura��odeLayoutdePainelCriarcomC�piaExcluirPO = new Configura��odeLayoutdePainelCriarcomC�piaExcluirPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void criarComCopiaExcluir() {
		loginTC.login();
		acessarTCCPO.acessarTCC();
		
		boolean sucesso = configura��odeLayoutdePainelCriarcomC�piaExcluirPO.criar();
		assertTrue(sucesso, Criar);
	}
	
	@Test(dependsOnMethods = "criarComCopiaExcluir")
	public void excluir() {
		boolean sucesso2 = configura��odeLayoutdePainelCriarcomC�piaExcluirPO.excluir();
		assertTrue(sucesso2, Eliminado);
	}
	

}
