package com.timp.test.MDR.CadastroCondi�ao;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.CadastroCondi�ao.CadastroCondi�aoDetallePO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class cadastrocondicaoDetalle extends TestBaseMassiel{
	
	LoginTC loginTC;
	AcessarMDRPO accesarMDRPO;
	CadastroCondi�aoDetallePO cadastroCondi�aoDetallePO;
  
  @BeforeClass
  public void beforeClass() {
	driver = initializationM();
	loginTC = new LoginTC();
	accesarMDRPO = new AcessarMDRPO();
	cadastroCondi�aoDetallePO = new CadastroCondi�aoDetallePO();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }
  

	@Test( )
	public void detalle() {
		
		loginTC.login();

		accesarMDRPO.acessarMDR();
		
		
		ArrayList<Boolean> sucesso = cadastroCondi�aoDetallePO.Detalle();
		
		for (int i = 0; i < sucesso.size(); i++) {
				assertTrue(sucesso.get(i), Detalhes);
		}
		sleep(2000);
	}

}
