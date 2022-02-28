package com.timp.test.ADM.Configura��o.Usuarios;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.AcessarADMPO;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ADM.Configura��o.Usuarios.Usu�riosDetalhesPO;
import com.sap.timp.pageObjectModel.ADM.Configura��o.Usuarios.Usu�riosVisualizarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class Usu�riosDetalhes extends TestBaseSteven {
	LoginTC loginTC;
	AcessarADMPO acessarADMPO;
	Usu�riosDetalhesPO usu�riosDetalhesPO;
	
  @BeforeClass
  public void beforeClass() {
	  driver = initialization();
	  loginTC = new LoginTC();
	  acessarADMPO = new AcessarADMPO();
	  usu�riosDetalhesPO = new Usu�riosDetalhesPO();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
	  
  }

	
	@Test
	public void ver() {
		loginTC.login();
		
		acessarADMPO.acessarADM();
		
		ArrayList<Boolean> sucesso = usu�riosDetalhesPO.Visualizar();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualiza�ar);
		}
		sleep(2000);
	}

}
