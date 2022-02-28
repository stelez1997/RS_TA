package com.timp.test.MDR.TabelasApoioSped.CodigoAjustesContribui�oesCreditos;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.CodigoAjustesContribui�oesCreditos.CodigoAjustesContribui�oesCreditosExcluirEmMassaPO;

public class CodigoAjustesContribui�oesCreditosExcluirEmMassa extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	CodigoAjustesContribui�oesCreditosExcluirEmMassaPO codigoAjustesContribui�oesCreditosExcluirEmMassaPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization(); 
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		codigoAjustesContribui�oesCreditosExcluirEmMassaPO = new CodigoAjustesContribui�oesCreditosExcluirEmMassaPO();
	}

	@AfterClass
	public void afterClass() {
		//driver.close();
	}

	@Test()
	public void criar() {
		loginTC.login();
		acessarMDRPO.acessarMDR();
		
		boolean sucesso = codigoAjustesContribui�oesCreditosExcluirEmMassaPO.criar();
		assertTrue(sucesso, Criar);
		sleep(1000);
	}
	
	@Test(dependsOnMethods = "criar")
	public void excluirEmMassa() {
		boolean sucesso2 = codigoAjustesContribui�oesCreditosExcluirEmMassaPO.excluir();
		assertTrue(sucesso2, Eliminado);
	}

}
