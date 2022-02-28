
package com.timp.test.ADM.Configura��o.ManuaisDeComponente;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.AcessarADMPO;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ADM.Configura��o.Configura��oTributo.Configura��odeTributoXTributoGrupo.Configura��odeTributoXTributoGrupoCriarPO;
import com.sap.timp.pageObjectModel.ADM.Configura��o.ManuaisDeComponente.ManuaisDeComponenteCriarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class ManuaisDeComponenteCriar extends TestBaseSteven {
	LoginTC loginTC;
	AcessarADMPO acessarADMPO;
	ManuaisDeComponenteCriarPO manuaisDeComponenteCriarPO;
	
  @BeforeClass
  public void beforeClass() {
	  driver = initialization();
	  loginTC = new LoginTC();
	  acessarADMPO = new AcessarADMPO();
	  manuaisDeComponenteCriarPO = new ManuaisDeComponenteCriarPO();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
	  
  }
  

	
	@Test()
	public void criar() {
		loginTC.login();
		acessarADMPO.acessarADM();
		boolean sucesso = manuaisDeComponenteCriarPO.criar();
		assertTrue(sucesso, Criar);
		sleep(2000);
		
	}
}

