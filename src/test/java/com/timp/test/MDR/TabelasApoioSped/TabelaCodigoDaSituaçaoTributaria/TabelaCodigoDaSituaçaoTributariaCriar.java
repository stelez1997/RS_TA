package com.timp.test.MDR.TabelasApoioSped.TabelaCodigoDaSitua�aoTributaria;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.TabelaCodigoDaSitua�aoTributaria.TabelaCodigoDaSitua�aoTributariaCriarPO;

public class TabelaCodigoDaSitua�aoTributariaCriar extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	TabelaCodigoDaSitua�aoTributariaCriarPO tabelaCodigoDaSitua�aoTributariaCriarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		tabelaCodigoDaSitua�aoTributariaCriarPO = new TabelaCodigoDaSitua�aoTributariaCriarPO();
	}

	@AfterClass
	public void afterClass() {
		//driver.close();
	}

	@Test()
	public void criar() {
		loginTC.login();
		acessarMDRPO.acessarMDR();
		// ajusteEInforma�oesDeValoresCriarPO.criar();

		boolean sucesso = tabelaCodigoDaSitua�aoTributariaCriarPO.criar();
		;
		assertTrue(sucesso, semAcesso);

	}

}
