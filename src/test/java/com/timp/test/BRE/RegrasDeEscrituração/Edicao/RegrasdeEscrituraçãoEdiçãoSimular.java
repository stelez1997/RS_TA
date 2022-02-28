package com.timp.test.BRE.RegrasDeEscritura��o.Edicao;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRE.AcessarBREPO;
import com.sap.timp.pageObjectModel.BRE.RegrasDeEscritura��o.Edicao.RegrasdeEscritura��oEdi��oSimularPO;
import com.sap.timp.pageObjectModel.BRE.RegrasdeAuditoriaN2.Edicao.RegrasdeAuditoriaN2Edi��oSimularPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class RegrasdeEscritura��oEdi��oSimular extends TestBaseSteven {
	LoginTC loginTC;
	AcessarBREPO acessarBREPO;
	RegrasdeEscritura��oEdi��oSimularPO bRERegradeEscritura��oEdi��oSimularPO;
	
  @BeforeClass
  public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarBREPO = new AcessarBREPO();
		bRERegradeEscritura��oEdi��oSimularPO = new RegrasdeEscritura��oEdi��oSimularPO();
  }

  
  @AfterClass
  public void afterClass() {

	  //driver.close();


  }


	@Test()
	public void simular() {
		
		loginTC.login();
		
		acessarBREPO.acessarBRE();

		boolean sucesso = bRERegradeEscritura��oEdi��oSimularPO.editar();
		assertTrue(sucesso, Editar);

	}

}
