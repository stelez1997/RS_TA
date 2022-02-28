package com.timp.test.MDR.DeterminacaoDeRelevanciaDeTarefa.DeterminacaoDeRelevanciaPorRegra;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.DeterminacaoDeRelevanciaDeTarefa.DeterminacaoDeRelevanciaPorRegra.DeterminacaoDeRelevanciaPorRegraVisualizarPO;

public class DeterminacaoDeRelevanciaPorRegraVisualizar extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	DeterminacaoDeRelevanciaPorRegraVisualizarPO determinacaoDeRelevanciaPorRegraVisualizarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		determinacaoDeRelevanciaPorRegraVisualizarPO = new DeterminacaoDeRelevanciaPorRegraVisualizarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void Visualizar() {

		loginTC.login();
		acessarMDRPO.acessarMDR();

		ArrayList<Boolean> sucesso = determinacaoDeRelevanciaPorRegraVisualizarPO.visualizar();

		for (int i = 0; i < sucesso.size(); i++) {

			assertTrue(sucesso.get(i), visualizašar);

		}
	}

}