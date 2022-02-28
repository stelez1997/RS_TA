package com.timp.test.LOG.LogDeA��es;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.LOG.AcessarLOGPO;
import com.sap.timp.pageObjectModel.LOG.LogDeA��es.LogDeA��esDetalhesPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class LogDeA��esDetalhes extends TestBaseMassiel{
	LoginTC loginTC;
	AcessarLOGPO acessarLOGPO;
	LogDeA��esDetalhesPO  logDeA��esDetalhesPO ;
	
  @BeforeClass
  public void beforeClass() {
	  driver = initializationM();
	  loginTC = new LoginTC();
	  acessarLOGPO = new AcessarLOGPO();
	  logDeA��esDetalhesPO = new LogDeA��esDetalhesPO();
  }

  @AfterClass
  public void afterClass() {
  }
  
  @Test(priority = 0)
	public void login() {
		loginTC.login();

	}

	@Test(priority = 1)
	public void AcessarLOG() {

		acessarLOGPO.acessarLOG();
	
	}
	
	@Test(priority = 2)
	public void Detalle() {

		ArrayList<Boolean> sucesso = logDeA��esDetalhesPO.detalle();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualiza�ar);
		}
	
	}


}
