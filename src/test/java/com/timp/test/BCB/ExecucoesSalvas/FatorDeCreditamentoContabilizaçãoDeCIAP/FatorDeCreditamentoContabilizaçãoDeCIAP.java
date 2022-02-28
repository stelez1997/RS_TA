package com.timp.test.BCB.ExecucoesSalvas.FatorDeCreditamentoContabiliza��oDeCIAP;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BCB.AcessarBCBPO;
import com.sap.timp.pageObjectModel.BCB.ExecucoesSalvas.FatorDeCreditamentoContabiliza��oDeCIAP.FatorDeCreditamentoContabiliza��oDeCIAPPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class FatorDeCreditamentoContabiliza��oDeCIAP extends TestBaseMassiel{
	
	LoginTC loginTC;
	AcessarBCBPO acessarBCBPO;
	FatorDeCreditamentoContabiliza��oDeCIAPPO fatorDeCreditamentoContabiliza��oDeCIAPPO;

  @BeforeClass
  public void beforeClass() {
	  driver = initializationM();
		loginTC = new LoginTC();
		acessarBCBPO = new AcessarBCBPO();
		fatorDeCreditamentoContabiliza��oDeCIAPPO = new FatorDeCreditamentoContabiliza��oDeCIAPPO();
		
  }

  @AfterClass
  public void afterClass() {
	//  driver.close();
  }
  
  @Test(priority = 0)
	public void login() {

		loginTC.login();

	}

	@Test(priority = 1)
	public void brbEntrar() {
		 acessarBCBPO.acessar();
		
	}

	@Test(priority = 2)
	public void criarConfiguracaoExecucoes() {
		
		
		ArrayList<Boolean> sucesso = fatorDeCreditamentoContabiliza��oDeCIAPPO.criarConfiguracaoExecucoes();
		System.out.println(sucesso);
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), subniveis);
		}
	}
	
	@Test(priority = 3)
	public void CriarConfiguracao() {

		sleep(2000);
		boolean sucesso = fatorDeCreditamentoContabiliza��oDeCIAPPO.criarConfiguracao();
		assertTrue(sucesso, Criar);
		
	}
	
	@Test(priority = 4)
	public void configurarConfiguracao() {
		
		ArrayList<Boolean> sucesso = fatorDeCreditamentoContabiliza��oDeCIAPPO.configurarConfiguracao();	
		System.out.println(sucesso);
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), subniveis);
		}
	}
	
	@Test(priority = 5)
	public void executar() {
		
		sleep(2000);
		boolean sucesso = fatorDeCreditamentoContabiliza��oDeCIAPPO.executar();
		assertTrue(sucesso, Criar);
	}	
	
	@Test(priority = 6)
	public void EnviarLixeria() {
		
		
		ArrayList<Boolean> sucesso = fatorDeCreditamentoContabiliza��oDeCIAPPO.lixeira();
		System.out.println(sucesso);
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), subniveis);
		}
	}
	

}
