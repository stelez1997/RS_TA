package com.timp.test.MDR.TabelasApoioSped.DeParaLivroApura�aoXSpedFiscal;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.DeParaLivroApura�aoXSpedFiscal.DeParaLivroApura�aoXSpedFiscalVisualizarPO;

public class DeParaLivroApura�aoXSpedFiscalVisualizar extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	DeParaLivroApura�aoXSpedFiscalVisualizarPO deParaLivroApura�aoXSpedFiscalVisualizarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		deParaLivroApura�aoXSpedFiscalVisualizarPO = new DeParaLivroApura�aoXSpedFiscalVisualizarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void visualizar() {
		loginTC.login();
		acessarMDRPO.acessarMDR();
		ArrayList<Boolean> sucesso = deParaLivroApura�aoXSpedFiscalVisualizarPO.visualizar();

		for (int i = 0; i < sucesso.size(); i++) {

			assertTrue(sucesso.get(i), visualiza�ar);

		}
	}

}
