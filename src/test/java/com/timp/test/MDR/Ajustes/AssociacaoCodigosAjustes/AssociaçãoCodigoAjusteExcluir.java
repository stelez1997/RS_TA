package com.timp.test.MDR.Ajustes.AssociacaoCodigosAjustes;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.Ajustes.AssociacaoCodigosAjustes.Associa��oCodigoAjusteExcluirPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class Associa��oCodigoAjusteExcluir extends TestBaseFernando{
  LoginTC loginTC;
  AcessarMDRPO accesarMDRPO;
  Associa��oCodigoAjusteExcluirPO associa��oCodigoAjusteExcluirPO;
  
  @BeforeClass
  public void beforeClass() {
	  driver = initializationF();
	  loginTC = new LoginTC();
	  accesarMDRPO = new AcessarMDRPO();
	  associa��oCodigoAjusteExcluirPO = new Associa��oCodigoAjusteExcluirPO();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }
  
  
  @Test(priority = 2)
  public void excluirAssocia��oCodigoAjuste() {
	  
	  loginTC.login();
	  
	  accesarMDRPO.acessarMDR();
	  
	  boolean sucesso = associa��oCodigoAjusteExcluirPO.excluirAssocia��oCodigoAjuste();
	  assertTrue(sucesso, Eliminado);
	  
	  sleep(2000);
  }
}
