package com.timp.test.ADM.Configura��o.Configura��oTributo.Configura��odeTributoXTributoGrupo;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.AcessarADMPO;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ADM.Configura��o.Configura��oTributo.Configura��oTributoAgrupamento.Configura��oTributoAgrupamentoVisualizarPO;
import com.sap.timp.pageObjectModel.ADM.Configura��o.Configura��oTributo.Configura��odeTributoXTributoGrupo.Configura��odeTributoXTributoGrupoVisualizarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class Configura��odeTributoXTributoGrupoVisualizar extends TestBaseSteven {
	LoginTC loginTC;
	AcessarADMPO acessarADMPO;
	Configura��odeTributoXTributoGrupoVisualizarPO configura��odeTributoXTributoGrupoVisualizarPO;
	
  @BeforeClass
  public void beforeClass() {
	  driver = initialization();
	  loginTC = new LoginTC();
	  acessarADMPO = new AcessarADMPO();
	  configura��odeTributoXTributoGrupoVisualizarPO = new Configura��odeTributoXTributoGrupoVisualizarPO();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
	  
  }
  

	
	@Test()
	public void visualizar() {
		loginTC.login();
		acessarADMPO.acessarADM();
		ArrayList<Boolean> sucesso = configura��odeTributoXTributoGrupoVisualizarPO.ver();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualiza�ar);
		}
		
		sleep(2000);
	} 

}
