package com.timp.test.BRE.RegrasDeNegocio.ParametrosGerais;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRE.AcessarBREPO;
import com.sap.timp.pageObjectModel.BRE.RegrasDeNegocio.ParametrosGerais.RegrasdeNeg�cioExcluirdefinitivamentePO;
import com.sap.timp.pageObjectModel.BRE.RegrasdeAuditoriaN2.ParametrosGerais.RegrasDeAuditoriaN2CriarCaminhosPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class RegrasdeNeg�cioExcluirdefinitivamente extends TestBaseSteven {
	LoginTC loginTC;
	AcessarBREPO acessarBREPO;
	RegrasdeNeg�cioExcluirdefinitivamentePO regrasdeNeg�cioExcluirdefinitivamentePO;
	
  @BeforeClass
  public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarBREPO = new AcessarBREPO();
		regrasdeNeg�cioExcluirdefinitivamentePO = new RegrasdeNeg�cioExcluirdefinitivamentePO();
  }

  
  @AfterClass
  public void afterClass() {
//	  driver.close();
  }


	@Test()
	public void criar() {
		
		loginTC.login();
		acessarBREPO.acessarBRE();

		boolean sucesso = regrasdeNeg�cioExcluirdefinitivamentePO.criar();
		assertTrue(sucesso, Criar);
		sleep(3000);
		boolean sucesso2 = regrasdeNeg�cioExcluirdefinitivamentePO.lexeira();
		assertTrue(sucesso2, Criar);
		sleep(3000);
		boolean sucesso1 = regrasdeNeg�cioExcluirdefinitivamentePO.excluirDefinitivo();
		assertTrue(sucesso1, Criar);

	}

}
