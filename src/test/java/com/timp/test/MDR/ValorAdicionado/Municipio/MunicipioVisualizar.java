package com.timp.test.MDR.ValorAdicionado.Municipio;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.LivrosFiscais.LivrosFiscais.LivrosFiscaisCriarPO;
import com.sap.timp.pageObjectModel.MDR.LivrosFiscais.LivrosFiscais.LivrosFiscaisDetalhesPO;
import com.sap.timp.pageObjectModel.MDR.LivrosFiscais.ParametrosParaLivroICMSST.ParametrosParaLivroICMSSTCriarPO;
import com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObriga�oesAcessorias.TabelaOutrosDebitos.TabelaOutrosDebitosDetalhesPO;
import com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObriga�oesAcessorias.TabelaOutrosDebitos.TabelaOutrosDebitosVisualizarPO;
import com.sap.timp.pageObjectModel.MDR.ValorAdicionado.Municipio.MunicipioVisualizarPO;

public class MunicipioVisualizar extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	MunicipioVisualizarPO municipioVisualizarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		municipioVisualizarPO = new MunicipioVisualizarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}
	/*
	 * @Test(priority = 0) public void login() { loginTC.login();
	 * 
	 * }
	 * 
	 * @Test(priority = 1) public void acessarMDR() {
	 * 
	 * acessarMDRPO.acessarMDR();
	 * 
	 * }
	 */

	@Test()
	public void visualizar() {
		loginTC.login();
		acessarMDRPO.acessarMDR();

		ArrayList<Boolean> sucesso = municipioVisualizarPO.visualizar();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Detalhes);
		}
	}

}
