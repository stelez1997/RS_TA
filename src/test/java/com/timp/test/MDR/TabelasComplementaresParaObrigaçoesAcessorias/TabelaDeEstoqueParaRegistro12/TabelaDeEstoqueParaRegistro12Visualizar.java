package com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.TabelaDeEstoqueParaRegistro12;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObriga�oesAcessorias.TabelaDeEstoqueParaRegistro12.TabelaDeEstoqueParaRegistro12VisualizarPO;

public class TabelaDeEstoqueParaRegistro12Visualizar extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	TabelaDeEstoqueParaRegistro12VisualizarPO tabelaDeEstoqueParaRegistro12VisualizarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		tabelaDeEstoqueParaRegistro12VisualizarPO = new TabelaDeEstoqueParaRegistro12VisualizarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void visualizar() {
		loginTC.login();
		acessarMDRPO.acessarMDR();

		ArrayList<Boolean> sucesso = tabelaDeEstoqueParaRegistro12VisualizarPO.visualizar();

		for (int i = 0; i < sucesso.size(); i++) {

			assertTrue(sucesso.get(i), visualiza�ar);

		}
	}

}
