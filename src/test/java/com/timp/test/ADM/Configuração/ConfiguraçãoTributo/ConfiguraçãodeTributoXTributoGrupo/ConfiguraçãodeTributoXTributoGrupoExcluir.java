package com.timp.test.ADM.Configura��o.Configura��oTributo.Configura��odeTributoXTributoGrupo;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.AcessarADMPO;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ADM.Configura��o.Configura��oTributo.Configura��odeTributoXTributoGrupo.Configura��odeTributoXTributoGrupoEditarPO;
import com.sap.timp.pageObjectModel.ADM.Configura��o.Configura��oTributo.Configura��odeTributoXTributoGrupo.Configura��odeTributoXTributoGrupoExcluirPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class Configura��odeTributoXTributoGrupoExcluir extends TestBaseSteven {
	LoginTC loginTC;
	AcessarADMPO acessarADMPO;
	Configura��odeTributoXTributoGrupoExcluirPO configura��odeTributoXTributoGrupoExcluirPO;
	
  @BeforeClass
  public void beforeClass() {
	  driver = initialization();
	  loginTC = new LoginTC();
	  acessarADMPO = new AcessarADMPO();
	  configura��odeTributoXTributoGrupoExcluirPO = new Configura��odeTributoXTributoGrupoExcluirPO();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
	  
  }

	@Test()
	public void Excluir() {
		loginTC.login();
		acessarADMPO.acessarADM();
		boolean sucesso = configura��odeTributoXTributoGrupoExcluirPO.excluir();

		assertTrue(sucesso, Eliminado);
		sleep(2000);

	}
	

}
