package com.timp.test.MDR.CadastrosIRPJCSLL.DEPARAContasCont�beis;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.CadastrosIRPJCSLL.DEPARAContasCont�beis.DEPARAContasCont�beisCriarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class DEPARAContasCont�beisCriar extends TestBaseMassiel {
	
	LoginTC loginTC;
	AcessarMDRPO accesarMDRPO;
	DEPARAContasCont�beisCriarPO dEPARAContasCont�beisCriarPO;
 
  @BeforeClass
  public void beforeClass() {
	     driver = initializationM();
		accesarMDRPO = new AcessarMDRPO();
		loginTC = new LoginTC();
		dEPARAContasCont�beisCriarPO = new DEPARAContasCont�beisCriarPO();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }


	@Test()
	public void criar() {
		
		loginTC.login();
		accesarMDRPO.acessarMDR();
		
		//dEPARAContasCont�beisCriarPO.Criar();
		  boolean sucesso = dEPARAContasCont�beisCriarPO.Criar();
		  assertTrue(sucesso, Criar);
		  sleep(2000);
	  }

}
