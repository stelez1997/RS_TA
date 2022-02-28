package com.timp.test.ADM.Configura��o.Configura��oTributo.Configura��oTributoAgrupamento;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.AcessarADMPO;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ADM.Configura��o.Configura��oTributo.Configura��oTributoAgrupamento.Configura��oTributoAgrupamentoCriarPO;
import com.sap.timp.pageObjectModel.ADM.Configura��o.Configura��oTributo.Configura��oTributoAgrupamento.Configura��oTributoAgrupamentoEditarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class Configura��oTributoAgrupamentoEditar extends TestBaseSteven {
	LoginTC loginTC;
	AcessarADMPO acessarADMPO;
	Configura��oTributoAgrupamentoEditarPO configura��oTributoAgrupamentoEditarPO;
	
  @BeforeClass
  public void beforeClass() {
	  driver = initialization();
	  loginTC = new LoginTC();
	  acessarADMPO = new AcessarADMPO();
	  configura��oTributoAgrupamentoEditarPO = new Configura��oTributoAgrupamentoEditarPO();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
	  
  }

	
	@Test()
	public void Editar() {

		loginTC.login();
		acessarADMPO.acessarADM();
		
		boolean sucesso = configura��oTributoAgrupamentoEditarPO.editar();
		assertTrue(sucesso, Editar);

		sleep(2000);
	}

}
