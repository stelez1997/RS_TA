package com.timp.test.ADM.Configura��o.Configura��oTributo.Configura��oTributoAgrupamento;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.AcessarADMPO;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ADM.Configura��o.Configura��oTributo.Configura��oTributoAgrupamento.Configura��oTributoAgrupamentofiltrarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class Configura��oTributoAgrupamentofiltrar extends TestBaseSteven {
	LoginTC loginTC;
	AcessarADMPO acessarADMPO;
	Configura��oTributoAgrupamentofiltrarPO configura��oTributoAgrupamentofiltrarPO;
	
  @BeforeClass
  public void beforeClass() {
	  driver = initialization();
	  loginTC = new LoginTC();
	  acessarADMPO = new AcessarADMPO();
	  configura��oTributoAgrupamentofiltrarPO = new Configura��oTributoAgrupamentofiltrarPO();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }
  
  

	@Test()
	public void filtros() {

		loginTC.login();
		acessarADMPO.acessarADM();
		configura��oTributoAgrupamentofiltrarPO.filtro();
		sleep(2000);
		
	}

}
