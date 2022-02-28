package com.timp.test.MDR.CadastroCondi�ao;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.CadastroCondi�ao.CadastroCondi�aoExcluirenMasasPO;
import com.sap.timp.pageObjectModel.MDR.HierarquiaDeCenariosDeCorre�ao.HierarquiaDeCenariosDeCorre�aoExcluirMasasPO;

public class CadastroCondi�aoExcluirMasas extends TestBaseMassiel {
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	CadastroCondi�aoExcluirenMasasPO cadastroCondi�aoExcluirenMasasPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationM();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		cadastroCondi�aoExcluirenMasasPO = new CadastroCondi�aoExcluirenMasasPO();
	}

	@AfterClass
	public void afterClass() {

		driver.close();
	}

	@Test()
	public void criar() {

		loginTC.login();

		acessarMDRPO.acessarMDR();

		boolean sucesso = cadastroCondi�aoExcluirenMasasPO.criar();
		assertTrue(sucesso, Criar);
		sleep(2000);

	}
	
	@Test(dependsOnMethods = "criar")
	public void excluir() {

		boolean sucesso2 = cadastroCondi�aoExcluirenMasasPO.HierarquiaDeCenariosDeCorre�aoExcluirMasas();
		assertTrue(sucesso2, Eliminado);
		sleep(2000);
	}
	
}
