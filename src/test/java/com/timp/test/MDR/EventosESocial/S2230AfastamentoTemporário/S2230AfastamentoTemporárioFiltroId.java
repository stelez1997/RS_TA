package com.timp.test.MDR.EventosESocial.S2230AfastamentoTempor�rio;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.EventosESocial.S2230AfastamentoTempor�rio.S2230AfastamentoTempor�rioFiltroIdPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class S2230AfastamentoTempor�rioFiltroId extends TestBaseMassiel{
	
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	S2230AfastamentoTempor�rioFiltroIdPO s2230AfastamentoTempor�rioFiltroIdPO;

  @BeforeClass
  public void beforeClass() {
	  	driver = initializationM();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		s2230AfastamentoTempor�rioFiltroIdPO = new S2230AfastamentoTempor�rioFiltroIdPO();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }
  


	@Test()
	public void filtro() {
		
		loginTC.login();
		
		acessarMDRPO.acessarMDR();
	//	s2230AfastamentoTempor�rioFiltroIdPO.filtro();

		boolean sucesso = s2230AfastamentoTempor�rioFiltroIdPO.filtro();

		assertTrue(sucesso, Filtros);


	}

}
