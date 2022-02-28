package com.timp.test.MDR.Ajustes.AssociacaoCodigosAjustes;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.Ajustes.AssociacaoCodigosAjustes.Associa��oCodigoAjusteEditarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class Associa��oCodigoAjusteEditar extends TestBaseFernando{
	  LoginTC loginTC;
	  AcessarMDRPO accesarMDRPO;
	  Associa��oCodigoAjusteEditarPO associa��oCodigoAjusteEditarPO;
	  
	  @BeforeClass
	  public void beforeClass() {
		  driver = initializationF();
		  loginTC = new LoginTC();
		  accesarMDRPO = new AcessarMDRPO();
		  associa��oCodigoAjusteEditarPO = new Associa��oCodigoAjusteEditarPO();
	  }
	
	  @AfterClass
	  public void afterClass() {

		 // driver.close();

	  }
	  

	  
	  @Test()
	  public void associa��oCodigoAjusteEditar() {
		  
		  loginTC.login();
		  
		  accesarMDRPO.acessarMDR();
		  
		  boolean sucesso = associa��oCodigoAjusteEditarPO.editarAssocia��oCodigoAjuste();
		  assertTrue(sucesso, Editar);
		  sleep(2000);
	  }
}
