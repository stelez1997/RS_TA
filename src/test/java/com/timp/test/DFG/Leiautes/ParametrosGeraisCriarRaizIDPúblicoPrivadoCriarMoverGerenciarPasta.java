package com.timp.test.DFG.Leiautes;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.DFG.AcessarDFGPO;
import com.sap.timp.pageObjectModel.DFG.Leiautes.ParametrosGeraisCriarRaizIDP�blicoPrivadoCriarMoverGerenciarPastaPO;

public class ParametrosGeraisCriarRaizIDP�blicoPrivadoCriarMoverGerenciarPasta extends TestBaseFernando{
	LoginTC loginTC;
	AcessarDFGPO acessarDFGPO;
	ParametrosGeraisCriarRaizIDP�blicoPrivadoCriarMoverGerenciarPastaPO parametrosGeraisCriarRaizIDP�blicoPrivadoCriarMoverGerenciarPastaPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationF();
		loginTC = new LoginTC();
		acessarDFGPO = new AcessarDFGPO();
		parametrosGeraisCriarRaizIDP�blicoPrivadoCriarMoverGerenciarPastaPO = new ParametrosGeraisCriarRaizIDP�blicoPrivadoCriarMoverGerenciarPastaPO();
	}

	@AfterClass
	public void afterClass() {
	//	driver.close();
	}



	@Test()
	public void criarGerenciarMoverPasta() {
		loginTC.login();
		acessarDFGPO.acessarDFG();
		boolean sucesso = parametrosGeraisCriarRaizIDP�blicoPrivadoCriarMoverGerenciarPastaPO.criarGerenciarMoverPasta();
		assertTrue(sucesso, Criar);
	}
}
