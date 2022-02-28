package com.timp.test.BCB;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BCB.AcessarBCBPO;
import com.sap.timp.pageObjectModel.BCB.AjustesePagamentosHierarquiaConfigura��oTodasasfuncionalidadesPO;
import com.sap.timp.pageObjectModel.BCB.Demais.HierarquiaConfiguracao.DemaisHierarquiaConfiguracaoTodasAsFuncionalidadesParte1PO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class AjustesePagamentosHierarquiaConfigura��oTodasasfuncionalidades extends TestBaseSteven {
	LoginTC loginTC;
	AcessarBCBPO acessarBCBPO;
	AjustesePagamentosHierarquiaConfigura��oTodasasfuncionalidadesPO ajustesePagamentosHierarquiaConfigura��oTodasasfuncionalidadesPO;


	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarBCBPO = new AcessarBCBPO();
		ajustesePagamentosHierarquiaConfigura��oTodasasfuncionalidadesPO = new AjustesePagamentosHierarquiaConfigura��oTodasasfuncionalidadesPO();
	}

	@AfterClass
	public void afterClass() {
		//driver.close();
	}
	
	@Test(priority = 0)
	public void login() {
		loginTC.login();
	}

	@Test(priority = 1)
	public void taaEntrar() {
		boolean sucesso = ajustesePagamentosHierarquiaConfigura��oTodasasfuncionalidadesPO.accesarTaa();
		System.out.println(sucesso);
		assertTrue(sucesso,Acessar);
	}
	
	@Test(priority = 2)
	public void tpcEntrar() {
		boolean sucesso = ajustesePagamentosHierarquiaConfigura��oTodasasfuncionalidadesPO.accesarTpc();
		System.out.println(sucesso);
		assertTrue(sucesso,Acessar);
	}
	@Test(priority = 3)
	public void bcbEntrar() {
		boolean sucesso = ajustesePagamentosHierarquiaConfigura��oTodasasfuncionalidadesPO.accesarBCB();
		System.out.println(sucesso);
		assertTrue(sucesso,Acessar);
	}
	@Test(priority = 4)
	public void criarHerarquia() {
		ArrayList<Boolean> sucesso = ajustesePagamentosHierarquiaConfigura��oTodasasfuncionalidadesPO.criarHerarquia();
		//System.out.println(sucesso);
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), subniveis);
		}
	}
	@Test(priority = 5)
	public void criarConfiguracao() {
		ArrayList<Boolean> sucesso = ajustesePagamentosHierarquiaConfigura��oTodasasfuncionalidadesPO.criarConfiguracao();
		System.out.println(sucesso);
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), subniveis);
		}
	}
	  @Test(priority = 6)
	  public void editarConfiguracion() {

		boolean sucesso = ajustesePagamentosHierarquiaConfigura��oTodasasfuncionalidadesPO.editarConfiguracao();

		assertTrue(sucesso, Editar);

	  }

}
