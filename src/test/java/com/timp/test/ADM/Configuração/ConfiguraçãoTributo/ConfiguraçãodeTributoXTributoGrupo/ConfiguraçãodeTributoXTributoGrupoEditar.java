package com.timp.test.ADM.Configura��o.Configura��oTributo.Configura��odeTributoXTributoGrupo;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.AcessarADMPO;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ADM.Configura��o.Configura��oTributo.Configura��oTributoAgrupamento.Configura��oTributoAgrupamentoEditarPO;
import com.sap.timp.pageObjectModel.ADM.Configura��o.Configura��oTributo.Configura��odeTributoXTributoGrupo.Configura��odeTributoXTributoGrupoEditarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class Configura��odeTributoXTributoGrupoEditar extends TestBaseSteven {
	LoginTC loginTC;
	AcessarADMPO acessarADMPO;
	Configura��odeTributoXTributoGrupoEditarPO configura��odeTributoXTributoGrupoEditarPO;
	
  @BeforeClass
  public void beforeClass() {
	  driver = initialization();
	  loginTC = new LoginTC();
	  acessarADMPO = new AcessarADMPO();
	  configura��odeTributoXTributoGrupoEditarPO = new Configura��odeTributoXTributoGrupoEditarPO();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
	  
  }
  

	
	@Test()
	public void Editar() {

		loginTC.login();
		acessarADMPO.acessarADM();
		boolean sucesso = configura��odeTributoXTributoGrupoEditarPO.editar();
		assertTrue(sucesso, Editar);
		sleep(2000);

		
	}
}
