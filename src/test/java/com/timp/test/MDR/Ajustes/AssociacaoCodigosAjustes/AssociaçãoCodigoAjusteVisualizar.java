package com.timp.test.MDR.Ajustes.AssociacaoCodigosAjustes;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.Ajustes.AssociacaoCodigosAjustes.Associa��oCodigoAjusteVisualizarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class Associa��oCodigoAjusteVisualizar extends TestBaseFernando{
	  LoginTC loginTC;
	  AcessarMDRPO accesarMDRPO;
	  Associa��oCodigoAjusteVisualizarPO associa��oCodigoAjusteVisualizarPO;
	  
	  @BeforeClass
	  public void beforeClass() {
		  driver = initializationF();
		  loginTC = new LoginTC();
		  accesarMDRPO = new AcessarMDRPO();
		  associa��oCodigoAjusteVisualizarPO = new Associa��oCodigoAjusteVisualizarPO();
	  }

	  @AfterClass
	  public void afterClass() {
		  driver.close();
	  }
	  		
	  @Test() 
	  public void visualizarAssocia��oCodigoAjuste() { 	
		  
		  loginTC.login();  
		  
		  accesarMDRPO.acessarMDR();
		  
		  ArrayList<Boolean> sucesso = associa��oCodigoAjusteVisualizarPO.visualizarAssocia��oCodigoAjuste();

		  for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualiza�ar);
		  }
		  
		  sleep(2000);
	  }		 
}
