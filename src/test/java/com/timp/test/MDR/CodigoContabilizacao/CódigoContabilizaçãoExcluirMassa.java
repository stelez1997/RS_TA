package com.timp.test.MDR.CodigoContabilizacao;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.CodigoContabilizacao.C�digoContabiliza��oExcluirMassaPO;
import com.sap.timp.pageObjectModel.MDR.DeterminacaoDeTipoDeCondicao.DeterminacaoDeTipoDeCondicaoExcluirMassaPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class C�digoContabiliza��oExcluirMassa  extends TestBaseSteven{
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	C�digoContabiliza��oExcluirMassaPO c�digoContabiliza��oExcluirMassaPO;
	
  @BeforeClass
  public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		c�digoContabiliza��oExcluirMassaPO = new C�digoContabiliza��oExcluirMassaPO();
  }

  @AfterClass
  public void afterClass() {
	//  driver.close();
  }

	@Test()
	public void criar() {
		
		loginTC.login();

		acessarMDRPO.acessarMDR();

		boolean sucesso = c�digoContabiliza��oExcluirMassaPO.criar();

		assertTrue(sucesso, Criar);


	}
	
	@Test(dependsOnMethods = "criar")
	public void exlcuir() {

		
		boolean sucesso = c�digoContabiliza��oExcluirMassaPO.excluir();

		assertTrue(sucesso, Eliminado);

	}


}
