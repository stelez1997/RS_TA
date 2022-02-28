package com.timp.test.ADM.Configura��o.Usuarios;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.AcessarADMPO;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ADM.Configura��o.Usuarios.Usu�riosAtivarDesativarPO;
import com.sap.timp.pageObjectModel.ADM.Configura��o.Usuarios.Usu�riosDetalhesPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class Usu�riosAtivarDesativar extends TestBaseSteven {
	LoginTC  loginTC;
	AcessarADMPO  acessarADMPO;
	Usu�riosAtivarDesativarPO usu�riosAtivarDesativarPO;
	
  @BeforeClass
  public void beforeClass() {
	  driver = initialization();
	  loginTC = new LoginTC();
	  acessarADMPO = new AcessarADMPO();
	  usu�riosAtivarDesativarPO = new Usu�riosAtivarDesativarPO();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
	  
  }
  
	@Test
	public void ver() {
		loginTC.login();
		acessarADMPO.acessarADM();
		Boolean sucesso = usu�riosAtivarDesativarPO.ativar();
		assertTrue(sucesso, Criar);
		
		sleep(2000);
	}

}
