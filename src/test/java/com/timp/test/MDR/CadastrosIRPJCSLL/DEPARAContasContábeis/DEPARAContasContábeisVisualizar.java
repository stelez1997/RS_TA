package com.timp.test.MDR.CadastrosIRPJCSLL.DEPARAContasCont�beis;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.CadastrosIRPJCSLL.DEPARAContasCont�beis.DEPARAContasCont�beisVisualizarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class DEPARAContasCont�beisVisualizar extends TestBaseMassiel{
	LoginTC loginTC;
	AcessarMDRPO accesarMDRPO;
	DEPARAContasCont�beisVisualizarPO dEPARAContasCont�beisVisualizarPO;

  @BeforeClass
  public void beforeClass() {
	  	driver = initializationM();
		accesarMDRPO = new AcessarMDRPO();
		loginTC = new LoginTC();
		dEPARAContasCont�beisVisualizarPO = new DEPARAContasCont�beisVisualizarPO();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }



	@Test()
	public void visualizar() {
		
		loginTC.login();
		accesarMDRPO.acessarMDR();
		
		ArrayList<Boolean> sucesso = dEPARAContasCont�beisVisualizarPO.visualizar();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualiza�ar);
		}
		
		sleep(2000);
	}
}
