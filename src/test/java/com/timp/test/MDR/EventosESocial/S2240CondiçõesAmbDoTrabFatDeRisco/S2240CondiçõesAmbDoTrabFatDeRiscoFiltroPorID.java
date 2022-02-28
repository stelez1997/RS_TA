package com.timp.test.MDR.EventosESocial.S2240Condi��esAmbDoTrabFatDeRisco;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.EventosESocial.S2240Condi��esAmbDoTrabFatDeRisco.S2240Condi��esAmbDoTrabFatDeRiscoFiltroPorIDPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class S2240Condi��esAmbDoTrabFatDeRiscoFiltroPorID extends TestBaseKenssy {
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	S2240Condi��esAmbDoTrabFatDeRiscoFiltroPorIDPO s2240Condi��esAmbDoTrabFatDeRiscoFiltroPorIDPO;
	
  @BeforeClass
  public void beforeClass() {
	  driver = initializationKen();
	  loginTC = new LoginTC();
	  acessarMDRPO = new AcessarMDRPO();
	  s2240Condi��esAmbDoTrabFatDeRiscoFiltroPorIDPO = new S2240Condi��esAmbDoTrabFatDeRiscoFiltroPorIDPO();
  }

  @AfterClass
 	public void afterClass() {
 		driver.close();
 	}


 	@Test()
	  public void filtroPorId() {
 		
		loginTC.login();

		acessarMDRPO.acessarMDR();
 		 
 		boolean dato = s2240Condi��esAmbDoTrabFatDeRiscoFiltroPorIDPO.filtroPorId();
		   
		 assertTrue(dato, filtros);
	  }


}
