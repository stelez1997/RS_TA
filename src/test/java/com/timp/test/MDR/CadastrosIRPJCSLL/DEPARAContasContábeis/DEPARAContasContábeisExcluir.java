package com.timp.test.MDR.CadastrosIRPJCSLL.DEPARAContasCont�beis;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.CadastrosIRPJCSLL.DEPARAContasCont�beis.DEPARAContasCont�beisExluirPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class DEPARAContasCont�beisExcluir extends TestBaseMassiel{
	
	LoginTC loginTC;
	AcessarMDRPO accesarMDRPO;
	DEPARAContasCont�beisExluirPO dEPARAContasCont�beisExluirPO;

  @BeforeClass
  public void beforeClass() {
	  driver = initializationM();
	  accesarMDRPO = new AcessarMDRPO();
	  loginTC = new LoginTC(); 
	  dEPARAContasCont�beisExluirPO = new DEPARAContasCont�beisExluirPO();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }


  
  @Test()
  public void excluir() {
	  
	  loginTC.login();
		accesarMDRPO.acessarMDR();
	  
	 
	  boolean sucesso =  dEPARAContasCont�beisExluirPO.Excluir();
	  assertTrue(sucesso, Editar);
	  sleep(2000);
	
	}
}
