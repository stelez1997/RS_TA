package com.timp.test.TCC.GestaoDeCreditoTributarioPISCONFINS.PainelCredito.Configura��oeExecu��o;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TCC.AcessarTCCPO;
import com.sap.timp.pageObjectModel.TCC.GestaoDeCreditoTributarioPISCONFINS.PainelCredito.Configura��oeExecu��o.Configura��oeExecu��oExcluirPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class Configura��oeExecu��oExcluir extends TestBaseKenssy{
	LoginTC loginTC;
	AcessarTCCPO acessarTCCPO;
	Configura��oeExecu��oExcluirPO configura��oeExecu��oExcluirPO;
	
	@BeforeClass
	public void beforeClass() {

		driver = initializationKen();
		loginTC = new LoginTC();
		acessarTCCPO = new AcessarTCCPO();
		configura��oeExecu��oExcluirPO = new Configura��oeExecu��oExcluirPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void executar() {
		loginTC.login();
		acessarTCCPO.acessarTCC();
		
		boolean sucesso = configura��oeExecu��oExcluirPO.excluir();
		assertTrue(sucesso, "executar");
	}

}
