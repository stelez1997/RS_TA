package com.timp.test.TCC.BancoDeOcorrencias.Executados;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TCC.AcessarTCCPO;
import com.sap.timp.pageObjectModel.TCC.BancoDeCreditoExtemporaneo.Executados.ExecutadosEditarPO;
import com.sap.timp.pageObjectModel.TCC.BancoDeOcorrencias.Executados.BancodeOcorr�nciasExecutadosEditarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class BancodeOcorr�nciasExecutadosEditar extends TestBaseSteven {
	LoginTC loginTC;
	AcessarTCCPO acessarTCCPO;
	BancodeOcorr�nciasExecutadosEditarPO bancodeOcorr�nciasExecutadosEditarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarTCCPO = new AcessarTCCPO();
		bancodeOcorr�nciasExecutadosEditarPO = new BancodeOcorr�nciasExecutadosEditarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void executarEditar() {
		loginTC.login();
		acessarTCCPO.acessarTCC();
		
		boolean sucesso = bancodeOcorr�nciasExecutadosEditarPO.editar();
		assertTrue(sucesso, Criar);
		 
	}
}
