package com.timp.test.MDR.TabelasApoioSped.DeParaLivroApura�aoXSpedFiscal;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.DeParaLivroApura�aoXSpedFiscal.DeParaLivroApura�aoXSpedFiscalExcluirPO;

public class DeParaLivroApura�aoXSpedFiscalExcluir extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	DeParaLivroApura�aoXSpedFiscalExcluirPO deParaLivroApura�aoXSpedFiscalExcluirPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		deParaLivroApura�aoXSpedFiscalExcluirPO = new DeParaLivroApura�aoXSpedFiscalExcluirPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void excluir() {
		loginTC.login();
		acessarMDRPO.acessarMDR();
		boolean sucesso = deParaLivroApura�aoXSpedFiscalExcluirPO.excluir();
		assertTrue(sucesso, Eliminado);

	}

}
