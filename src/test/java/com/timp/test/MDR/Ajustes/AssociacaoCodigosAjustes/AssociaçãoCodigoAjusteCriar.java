package com.timp.test.MDR.Ajustes.AssociacaoCodigosAjustes;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.Ajustes.AssociacaoCodigosAjustes.Associa��oCodigoAjusteCriarPO;


public class Associa��oCodigoAjusteCriar extends TestBaseFernando{
  LoginTC loginTC;
  AcessarMDRPO accesarMDRPO;
  Associa��oCodigoAjusteCriarPO associa��oCodigoAjusteCriarPO;
 
  
  @BeforeClass
  public void beforeClass() {

	  driver = initializationF(); 
	  loginTC = new LoginTC();
	  accesarMDRPO = new AcessarMDRPO();
	  associa��oCodigoAjusteCriarPO = new Associa��oCodigoAjusteCriarPO();
  }

  @AfterClass
  public void afterClass() {
	// driver.close();
  }
 
  
  @Test()
  public void criarAssocia��oCodigoAjuste() {
	  
	  loginTC.login();
	  
	  accesarMDRPO.acessarMDR();
	  
	  boolean sucesso = associa��oCodigoAjusteCriarPO.criarAssocia��oCodigoAjusteCriar();
	  assertTrue(sucesso, Criar);
	  sleep(2000);
	  
  }
}
