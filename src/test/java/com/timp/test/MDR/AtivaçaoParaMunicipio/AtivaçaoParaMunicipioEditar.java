package com.timp.test.MDR.Ativa�aoParaMunicipio;


import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.Ativa�aoParaMunicipio.Ativa�aoParaMunicipioEditarPO;

public class Ativa�aoParaMunicipioEditar extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	Ativa�aoParaMunicipioEditarPO ativa�aoParaMunicipioEditarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		ativa�aoParaMunicipioEditarPO = new Ativa�aoParaMunicipioEditarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void editar() {

		loginTC.login();

		acessarMDRPO.acessarMDR();

		boolean sucesso = ativa�aoParaMunicipioEditarPO.editar();

		assertTrue(sucesso, Editar);
		sleep(2000);
	}

}
