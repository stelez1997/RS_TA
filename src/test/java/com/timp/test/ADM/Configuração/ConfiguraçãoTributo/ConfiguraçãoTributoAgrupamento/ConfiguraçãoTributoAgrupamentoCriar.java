package com.timp.test.ADM.Configura��o.Configura��oTributo.Configura��oTributoAgrupamento;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.AcessarADMPO;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ADM.Configura��o.Configura��oTributo.Configura��oTributoAgrupamento.Configura��oTributoAgrupamentoCriarPO;
import com.sap.timp.pageObjectModel.ADM.Configura��o.Licen�as.Licen�asDetalhesPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class Configura��oTributoAgrupamentoCriar extends TestBaseSteven{
	LoginTC loginTC;
	AcessarADMPO acessarADMPO;
	Configura��oTributoAgrupamentoCriarPO configura��oTributoAgrupamentoCriarPO;
	
  @BeforeClass
  public void beforeClass() {
	  driver = initialization();
	  loginTC = new LoginTC();
	  acessarADMPO = new AcessarADMPO();
	  configura��oTributoAgrupamentoCriarPO = new Configura��oTributoAgrupamentoCriarPO();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
	  
  }
  

	
	@Test()
	public void criar() {

		loginTC.login();
		acessarADMPO.acessarADM();
		boolean sucesso = configura��oTributoAgrupamentoCriarPO.criar();
		assertTrue(sucesso, Criar);
		sleep(2000);
		
	}

}
