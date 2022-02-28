package com.timp.test.BRE.RegrasDeEscritura��o.ParametrosGerais;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRE.AcessarBREPO;
import com.sap.timp.pageObjectModel.BRE.RegrasDeEscritura��o.ParametrosGerais.RegrasDeEscritura��oCriarMasCaminhoPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class RegrasDeEscritura��oCriarMasCaminho extends TestBaseFernando{
	LoginTC loginTC;
	AcessarBREPO acessarBREPO;
	RegrasDeEscritura��oCriarMasCaminhoPO regrasDeEscritura��oCriarMasCaminhoPO;
	
	@BeforeClass
	public void beforeClass() {
		driver = initializationF();
		loginTC = new LoginTC();
		acessarBREPO = new AcessarBREPO();
		regrasDeEscritura��oCriarMasCaminhoPO = new RegrasDeEscritura��oCriarMasCaminhoPO();
	}

	@AfterClass
	public void afterClass() {		
		//driver.close();
	}


	
	@Test()
	public void criarMaisCaminho() {
		
		loginTC.login();
		
		acessarBREPO.acessarBRE();
		
		boolean sucesso = regrasDeEscritura��oCriarMasCaminhoPO.criar();
		assertTrue(sucesso, Eliminado);
	}
}
