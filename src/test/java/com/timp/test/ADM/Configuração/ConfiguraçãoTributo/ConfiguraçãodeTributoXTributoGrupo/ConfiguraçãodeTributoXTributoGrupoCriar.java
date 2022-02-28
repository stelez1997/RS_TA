package com.timp.test.ADM.Configura��o.Configura��oTributo.Configura��odeTributoXTributoGrupo;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.AcessarADMPO;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ADM.Configura��o.Configura��oTributo.Configura��odeTributoXTributoGrupo.Configura��odeTributoXTributoGrupoCriarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class Configura��odeTributoXTributoGrupoCriar extends TestBaseSteven {
	LoginTC loginTC;
	AcessarADMPO acessarADMPO;
	Configura��odeTributoXTributoGrupoCriarPO configura��odeTributoXTributoGrupoCriarPO;
	
  @BeforeClass
  public void beforeClass() {
	  driver = initialization();
	  loginTC = new LoginTC(); 
	  acessarADMPO = new AcessarADMPO();
	  configura��odeTributoXTributoGrupoCriarPO = new Configura��odeTributoXTributoGrupoCriarPO();
  }
  

  @AfterClass
  public void afterClass() {
	  driver.close();
  }
  
	
	@Test()
	public void criar() {
		loginTC.login();
		acessarADMPO.acessarADM();
		boolean sucesso = configura��odeTributoXTributoGrupoCriarPO.criar();
		assertTrue(sucesso, Criar);
		sleep(2000);

		
	}

}
