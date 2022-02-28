package com.timp.test.MDR.TabelasApoioSped.TabelaCodigoDaSitua�aoTributaria;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;

import com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.TabelaCodigoDaSitua�aoTributaria.TabelaCodigoDaSitua�aoTributariaEditarPO;

public class TabelaCodigoDaSitua�aoTributariaEditar extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	TabelaCodigoDaSitua�aoTributariaEditarPO tabelaCodigoDaSitua�aoTributariaEditarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		tabelaCodigoDaSitua�aoTributariaEditarPO = new TabelaCodigoDaSitua�aoTributariaEditarPO();
	}

	@AfterClass
	public void afterClass() {
		 driver.close();
	}

	@Test()
	public void editar() {
		loginTC.login();
		acessarMDRPO.acessarMDR();
		boolean sucesso = tabelaCodigoDaSitua�aoTributariaEditarPO.editar();

		assertTrue(sucesso, Editar);

	}

}
