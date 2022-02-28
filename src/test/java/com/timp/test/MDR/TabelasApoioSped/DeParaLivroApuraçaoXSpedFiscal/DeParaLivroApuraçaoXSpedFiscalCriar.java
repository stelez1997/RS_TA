package com.timp.test.MDR.TabelasApoioSped.DeParaLivroApura�aoXSpedFiscal;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.DeParaLivroApura�aoXSpedFiscal.DeParaLivroApura�aoXSpedFiscalCriarPO;

public class DeParaLivroApura�aoXSpedFiscalCriar extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	DeParaLivroApura�aoXSpedFiscalCriarPO deParaLivroApura�aoXSpedFiscalCriarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		deParaLivroApura�aoXSpedFiscalCriarPO = new DeParaLivroApura�aoXSpedFiscalCriarPO();
	}

	@AfterClass
	public void afterClass() {
		//driver.close();
	}

	@Test()
	public void criar() {
		loginTC.login();
		acessarMDRPO.acessarMDR();
		boolean sucesso = deParaLivroApura�aoXSpedFiscalCriarPO.criar();
		assertTrue(sucesso, semAcesso);

	}

}
