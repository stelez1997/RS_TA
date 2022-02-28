package com.timp.test.MDR.TabelasApoioSped.DeParaLivroApura�aoXSpedFiscal;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.DeParaLivroApura�aoXSpedFiscal.DeParaLivroApura�aoXSpedFiscalEditarPO;

public class DeParaLivroApura�aoXSpedFiscalEditar extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	DeParaLivroApura�aoXSpedFiscalEditarPO deParaLivroApura�aoXSpedFiscalEditarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		deParaLivroApura�aoXSpedFiscalEditarPO = new DeParaLivroApura�aoXSpedFiscalEditarPO();
	}

	@AfterClass
	public void afterClass() {
		//driver.close();
	}

	@Test()
	public void editar() {
		loginTC.login();
		acessarMDRPO.acessarMDR();
		boolean sucesso = deParaLivroApura�aoXSpedFiscalEditarPO.editar();

		assertTrue(sucesso, Editar);
	}

}
