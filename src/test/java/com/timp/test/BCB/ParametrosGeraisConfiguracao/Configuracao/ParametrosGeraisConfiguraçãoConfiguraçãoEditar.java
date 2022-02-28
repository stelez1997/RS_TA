package com.timp.test.BCB.ParametrosGeraisConfiguracao.Configuracao;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BCB.AcessarBCBPO;
import com.sap.timp.pageObjectModel.BCB.ParametrosGeraisConfiguracao.Configuracao.ParametrosGeraisConfigura��oConfigura��oEditarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class ParametrosGeraisConfigura��oConfigura��oEditar extends TestBaseSteven {

	LoginTC loginTC;
	AcessarBCBPO acessarBCBPO;
	ParametrosGeraisConfigura��oConfigura��oEditarPO parametrosGeraisConfigura��oEditarPO;
	
  @BeforeClass
  public void beforeClass() {
	driver = initialization();
	loginTC = new LoginTC();
	acessarBCBPO = new AcessarBCBPO();
	parametrosGeraisConfigura��oEditarPO = new ParametrosGeraisConfigura��oConfigura��oEditarPO();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }


  @Test()
  public void editar() {
	  loginTC.login();
		acessarBCBPO.acessar();
		
	//  parametrosGeraisConfigura��oEditarPO.editar();
	  
	boolean sucesso = parametrosGeraisConfigura��oEditarPO.editar();

	assertTrue(sucesso, Editar);

  }

}
