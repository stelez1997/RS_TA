package com.timp.test.MDR.ParametrosContabilizacao.ContasDefaultPorTributo;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.ParametrosContabilizacao.ContasDefaultPorTributo.ContasDefaultPorTributoEditarPO;

public class ContasDefaultPorTributoEditar extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	ContasDefaultPorTributoEditarPO contasDefaultPorTributoEditarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		contasDefaultPorTributoEditarPO = new ContasDefaultPorTributoEditarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void editar() {

		loginTC.login();

		acessarMDRPO.acessarMDR();

		boolean sucesso = contasDefaultPorTributoEditarPO.editar();

		assertTrue(sucesso, visualiza�ar);
	}

}
