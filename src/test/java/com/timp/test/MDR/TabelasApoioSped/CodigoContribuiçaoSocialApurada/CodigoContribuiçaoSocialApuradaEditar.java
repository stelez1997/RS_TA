package com.timp.test.MDR.TabelasApoioSped.CodigoContribui�aoSocialApurada;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.CodigoContribui�aoSocialApurada.CodigoContribui�aoSocialApuradaEditarPO;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

public class CodigoContribui�aoSocialApuradaEditar extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	CodigoContribui�aoSocialApuradaEditarPO codigoContribui�aoSocialApuradaEditarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		codigoContribui�aoSocialApuradaEditarPO = new CodigoContribui�aoSocialApuradaEditarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void editar() {
		loginTC.login();
		acessarMDRPO.acessarMDR();
		boolean sucesso = codigoContribui�aoSocialApuradaEditarPO.editar();

		assertTrue(sucesso, Editar);
	}

}
