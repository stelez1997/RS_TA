package com.timp.test.DFG.Painel;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.DFG.AcessarDFGPO;
import com.sap.timp.pageObjectModel.DFG.Painel.PainelNovaConfigura��oPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class PainelNovaConfigura��o extends TestBaseSteven{
	LoginTC loginTC;
	AcessarDFGPO acessarDFGPO;
	PainelNovaConfigura��oPO painelNovaConfigura��oPO;
	
  @BeforeClass
  public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarDFGPO = new AcessarDFGPO();
		painelNovaConfigura��oPO = new PainelNovaConfigura��oPO();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }
  

	@Test(priority = 0)
	public void ingresar() {
		loginTC.login();
	}
	
  @Test(priority = 1)
	public void DFGEntrar() {
		acessarDFGPO.acessarDFG();

	}

	@Test(priority = 2)
	public void criar() {
		
	
		ArrayList<Boolean> sucesso =painelNovaConfigura��oPO.criar();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Criar);
		}
	}

}
