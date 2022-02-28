package com.timp.test.MDR.CadastrosIRPJCSLL.ContasCont�beisRBLP;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.CadastrosIRPJCSLL.ContasCont�beisRBLP.ContasCont�beisRBLPFiltroIdPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class ContasCont�beisRBLPFiltroId extends TestBaseMassiel{
	
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	ContasCont�beisRBLPFiltroIdPO  contasCont�beisRBLPFiltroIdPO;

  @BeforeClass
  public void beforeClass() {
		driver = initializationM();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		contasCont�beisRBLPFiltroIdPO  = new ContasCont�beisRBLPFiltroIdPO();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }
  


 	@Test()
 	public void filtro() {
 		loginTC.login();
 		acessarMDRPO.acessarMDR();

 		boolean sucesso = contasCont�beisRBLPFiltroIdPO.filtro();

 		assertTrue(sucesso, Filtros);
 		sleep(2000);


 	}


}
