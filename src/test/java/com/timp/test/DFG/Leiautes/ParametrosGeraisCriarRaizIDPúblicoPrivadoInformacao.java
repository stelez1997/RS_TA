package com.timp.test.DFG.Leiautes;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.DFG.AcessarDFGPO;
import com.sap.timp.pageObjectModel.DFG.Leiautes.ParametrosGeraisCriarRaizIDP�blicoPrivadoInformacaoPO;

public class ParametrosGeraisCriarRaizIDP�blicoPrivadoInformacao extends TestBaseFernando{
	LoginTC loginTC;
	AcessarDFGPO acessarDFGPO;
	ParametrosGeraisCriarRaizIDP�blicoPrivadoInformacaoPO parametrosGeraisCriarRaizIDP�blicoPrivadoInformacaoPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarDFGPO = new AcessarDFGPO();
		parametrosGeraisCriarRaizIDP�blicoPrivadoInformacaoPO = new ParametrosGeraisCriarRaizIDP�blicoPrivadoInformacaoPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}



	@Test()
	public void criar() {
		loginTC.login();
		acessarDFGPO.acessarDFG();
		boolean sucesso = parametrosGeraisCriarRaizIDP�blicoPrivadoInformacaoPO.informacao();
		assertTrue(sucesso, Criar);
	}
}
