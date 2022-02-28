package com.timp.test.MDR.TabelasApoioSped.CodigoContribui�aoSocialApurada;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.CodigoContribui�aoSocialApurada.CodigoContribui�aoSocialApuradaExcluirPO;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

public class CodigoContribui�aoSocialApuradaExcluir extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	CodigoContribui�aoSocialApuradaExcluirPO codigoContribui�aoSocialApuradaExcluirPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		codigoContribui�aoSocialApuradaExcluirPO = new CodigoContribui�aoSocialApuradaExcluirPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void excluir() {
		loginTC.login();
		acessarMDRPO.acessarMDR();
		codigoContribui�aoSocialApuradaExcluirPO.eliminar();

	}

}
