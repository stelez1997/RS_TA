package com.timp.test.ADM.Configura��o.Configura��oTributo.Configura��oTributoTributoXEstrutura;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.AcessarADMPO;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ADM.Configura��o.Configura��oTributo.Configura��oTributoAgrupamento.Configura��oTributoAgrupamentoCriarPO;
import com.sap.timp.pageObjectModel.ADM.Configura��o.Configura��oTributo.Configura��oTributoTributoXEstrutura.Configura��oTributoTributoXEstruturaCriarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class Configura��oTributoTributoXEstruturaCriar extends TestBaseKenssy{
	LoginTC loginTC;
	AcessarADMPO acessarADMPO;
	Configura��oTributoTributoXEstruturaCriarPO configura��oTributoTributoXEstruturaCriarPO;
	
  @BeforeClass
  public void beforeClass() {
	  driver = initializationKen();
	  loginTC = new LoginTC();
	  acessarADMPO = new AcessarADMPO();
	  configura��oTributoTributoXEstruturaCriarPO = new Configura��oTributoTributoXEstruturaCriarPO();
  }

  @AfterClass
  public void afterClass() {

	  //driver.close();
	  

  }

	@Test()
	public void criar() {
		loginTC.login();
		acessarADMPO.acessarADM();
		
		boolean sucesso = configura��oTributoTributoXEstruturaCriarPO.criar();
		assertTrue(sucesso, Criar);
		
		sleep(2000);
	}
	
	@Test(dependsOnMethods = "criar")
	public void excluir() {
		
		
		boolean sucesso = configura��oTributoTributoXEstruturaCriarPO.excluir();
		assertTrue(sucesso, Criar);
		
		sleep(2000);
	}


}
