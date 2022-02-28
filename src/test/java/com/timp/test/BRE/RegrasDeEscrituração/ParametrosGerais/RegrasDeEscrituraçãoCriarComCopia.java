package com.timp.test.BRE.RegrasDeEscritura��o.ParametrosGerais;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRE.AcessarBREPO;
import com.sap.timp.pageObjectModel.BRE.RegrasDeEscritura��o.ParametrosGerais.RegrasDeEscritura��oCriarComCopiaPO;
import com.sap.timp.pageObjectModel.BRE.RegrasDeEscritura��o.ParametrosGerais.RegrasDeEscritura��oCriarMasCaminhoPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class RegrasDeEscritura��oCriarComCopia extends TestBaseSteven{
	LoginTC loginTC;
	AcessarBREPO acessarBREPO;
	RegrasDeEscritura��oCriarComCopiaPO regrasDeEscritura��oCriarComCopiaPO;
	
	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarBREPO = new AcessarBREPO();
		regrasDeEscritura��oCriarComCopiaPO = new RegrasDeEscritura��oCriarComCopiaPO();
	}

	@AfterClass
	public void afterClass() {
		//driver.close();
	}


	@Test()
	public void criarcomCopia() {
		
		loginTC.login();
		acessarBREPO.acessarBRE();
		
		boolean sucesso = regrasDeEscritura��oCriarComCopiaPO.criar();
		assertTrue(sucesso, Criar);
	}
	
	@Test(dependsOnMethods = "criarcomCopia")
	public void excluir() {
		
		ArrayList<Boolean> sucesso2 = regrasDeEscritura��oCriarComCopiaPO.excluir();
		
		for (int i = 0; i < sucesso2.size(); i++) {
			assertTrue(sucesso2.get(i), Eliminado);
		}
	}
	
	
}
