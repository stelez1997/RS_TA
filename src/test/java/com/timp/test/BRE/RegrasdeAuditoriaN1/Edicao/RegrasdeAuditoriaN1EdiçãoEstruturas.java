package com.timp.test.BRE.RegrasdeAuditoriaN1.Edicao;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRE.AcessarBREPO;
import com.sap.timp.pageObjectModel.BRE.RegrasAuditoriaN1.Edicao.RegrasdeAuditoriaN1Edi��oEstruturasPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class RegrasdeAuditoriaN1Edi��oEstruturas extends TestBaseSteven{
	LoginTC loginTC;
	AcessarBREPO acessarBREPO;
	RegrasdeAuditoriaN1Edi��oEstruturasPO regrasdeAuditoriaN1Edi��oEstruturasPO;
	
  @BeforeClass
  public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarBREPO = new AcessarBREPO();
		regrasdeAuditoriaN1Edi��oEstruturasPO = new RegrasdeAuditoriaN1Edi��oEstruturasPO();
  }

  
  @AfterClass
  public void afterClass() {
	  driver.close();
  }


	@Test()
	public void editar() {

		loginTC.login();
		acessarBREPO.acessarBRE();


		boolean sucesso = regrasdeAuditoriaN1Edi��oEstruturasPO.editar();
		assertTrue(sucesso, Editar);


	}

}
