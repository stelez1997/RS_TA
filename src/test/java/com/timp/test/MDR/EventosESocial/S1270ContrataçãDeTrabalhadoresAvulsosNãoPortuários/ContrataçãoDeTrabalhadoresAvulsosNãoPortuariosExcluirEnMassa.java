package com.timp.test.MDR.EventosESocial.S1270Contrata��DeTrabalhadoresAvulsosN�oPortu�rios;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.EventosESocial.S1270Contrata��DeTrabalhadoresAvulsosN�oPortu�rios.Contrata��oDeTrabalhadoresAvulsosN�oPortuariosExcluirEnMassaPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class Contrata��oDeTrabalhadoresAvulsosN�oPortuariosExcluirEnMassa extends TestBaseKenssy {
	LoginTC loginTC;
	AcessarMDRPO accesarMDR;
	Contrata��oDeTrabalhadoresAvulsosN�oPortuariosExcluirEnMassaPO  contrata��oDeTrabalhadoresAvulsosN�oPortuariosExcluirEnMassaPO;
	
  @BeforeClass
  public void beforeClass() {
	  driver = initializationKen();
	  loginTC = new LoginTC();
	  accesarMDR = new AcessarMDRPO();
	  contrata��oDeTrabalhadoresAvulsosN�oPortuariosExcluirEnMassaPO = new Contrata��oDeTrabalhadoresAvulsosN�oPortuariosExcluirEnMassaPO();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }
  

  
  @Test()
  public void criar() {
	  
	loginTC.login();
	accesarMDR.acessarMDR();
	boolean sucesso = contrata��oDeTrabalhadoresAvulsosN�oPortuariosExcluirEnMassaPO.criar();
	assertTrue(sucesso, Criar);
	sleep(1000);
	
	boolean sucesso2 = contrata��oDeTrabalhadoresAvulsosN�oPortuariosExcluirEnMassaPO.excluirEmMassa();
	assertTrue(sucesso2, Eliminado);
  }
  
  @Test(dependsOnMethods = "criar")
  public void excluirEmMassa() {
	
	boolean sucesso2 = contrata��oDeTrabalhadoresAvulsosN�oPortuariosExcluirEnMassaPO.excluirEmMassa();
	assertTrue(sucesso2, Eliminado);
  }

}
