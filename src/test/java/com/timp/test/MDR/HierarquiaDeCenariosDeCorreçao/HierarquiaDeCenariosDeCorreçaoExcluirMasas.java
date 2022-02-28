package com.timp.test.MDR.HierarquiaDeCenariosDeCorre�ao;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.HierarquiaDeCenariosDeCorre�ao.HierarquiaDeCenariosDeCorre�aoExcluirMasasPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class HierarquiaDeCenariosDeCorre�aoExcluirMasas extends TestBaseMassiel {
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	HierarquiaDeCenariosDeCorre�aoExcluirMasasPO hierarquiaDeCenariosDeCorre�aoExcluirMasasPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationM();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		hierarquiaDeCenariosDeCorre�aoExcluirMasasPO = new HierarquiaDeCenariosDeCorre�aoExcluirMasasPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void criar() {

		loginTC.login();

		acessarMDRPO.acessarMDR();

		boolean sucesso = hierarquiaDeCenariosDeCorre�aoExcluirMasasPO.criar();
		assertTrue(sucesso, Criar);

	}

	@Test(dependsOnMethods = "criar")
	public void excluir() {

		boolean sucesso2 = hierarquiaDeCenariosDeCorre�aoExcluirMasasPO.HierarquiaDeCenariosDeCorre�aoExcluirMasas();
		assertTrue(sucesso2, Eliminado);
	}

}
