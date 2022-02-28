package com.timp.test.MDR.RegistroDeExporta�ao;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.RegistroDeExporta�ao.RegistroDeExporta�aoFiltrosAvan�adosPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class RegistroDeExporta�aoFiltrosAvan�ados extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	RegistroDeExporta�aoFiltrosAvan�adosPO registroDeExporta�aoFiltrosAvan�adosPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		registroDeExporta�aoFiltrosAvan�adosPO = new RegistroDeExporta�aoFiltrosAvan�adosPO();
	}

	@AfterClass
	public void afterClass() {
		//driver.close();
	}

	@Test()
	public void filtros() {

		loginTC.login();
		acessarMDRPO.acessarMDR();

		ArrayList<Boolean> sucesso = registroDeExporta�aoFiltrosAvan�adosPO.codigoempresa();
		sleep(2000);
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Filtros);
		}
		ArrayList<Boolean> sucesso1 = registroDeExporta�aoFiltrosAvan�adosPO.codigofilial();
		sleep(2000);
		for (int i = 0; i < sucesso1.size(); i++) {
			assertTrue(sucesso1.get(i), Filtros);
		}
		ArrayList<Boolean> sucesso2 = registroDeExporta�aoFiltrosAvan�adosPO.codigodocnum();
		sleep(2000);
		for (int i = 0; i < sucesso2.size(); i++) {
			assertTrue(sucesso2.get(i), Filtros);
		}
		ArrayList<Boolean> sucesso3 = registroDeExporta�aoFiltrosAvan�adosPO.codigocodigoitem();
		sleep(2000);
		for (int i = 0; i < sucesso3.size(); i++) {
			assertTrue(sucesso3.get(i), Filtros);
		}

		ArrayList<Boolean> sucesso4 = registroDeExporta�aoFiltrosAvan�adosPO.codigonotafiscal();
		sleep(2000);
		for (int i = 0; i < sucesso4.size(); i++) {
			assertTrue(sucesso4.get(i), Filtros);
		}

		ArrayList<Boolean> sucesso5 = registroDeExporta�aoFiltrosAvan�adosPO.codigochavenfe();
		sleep(2000);
		for (int i = 0; i < sucesso5.size(); i++) {
			assertTrue(sucesso5.get(i), Filtros);
		}

	}
}
