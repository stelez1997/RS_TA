package com.timp.test.MDR.TabelasApoioSped.CodigoDeAjusteDaApura�aoDoIPI;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.CodigoDeAjusteDaApura�aoDoIPI.CodigoDeAjusteDaApura�aoDoIPIEditarPO;

public class CodigoDeAjusteDaApura�aoDoIPIEditar extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	CodigoDeAjusteDaApura�aoDoIPIEditarPO codigoDeAjusteDaApura�aoDoIPIEditarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		codigoDeAjusteDaApura�aoDoIPIEditarPO = new CodigoDeAjusteDaApura�aoDoIPIEditarPO();
	}

	@AfterClass
	public void afterClass() {
		//driver.close();
	}

	@Test()
	public void editar() {
		loginTC.login();
		acessarMDRPO.acessarMDR();
		boolean sucesso = codigoDeAjusteDaApura�aoDoIPIEditarPO.editar();

		assertTrue(sucesso, Editar);
	}

}
