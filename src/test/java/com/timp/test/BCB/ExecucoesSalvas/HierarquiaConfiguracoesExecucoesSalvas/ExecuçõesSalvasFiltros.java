package com.timp.test.BCB.ExecucoesSalvas.HierarquiaConfiguracoesExecucoesSalvas;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BCB.AcessarBCBPO;
import com.sap.timp.pageObjectModel.BCB.ExecucoesSalvas.HierarquiaConfiguracoesExecucoesSalvas.Execu��esSalvasFiltrosPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class Execu��esSalvasFiltros extends TestBaseKenssy{
	LoginTC loginTC;
	AcessarBCBPO acessarBCBPO;
	Execu��esSalvasFiltrosPO execu��esSalvasFiltrosPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarBCBPO = new AcessarBCBPO();
		execu��esSalvasFiltrosPO = new Execu��esSalvasFiltrosPO();
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
	public void acessarTCC() {

		boolean sucesso = acessarBCBPO.acessar();
		System.out.println(sucesso);
		assertTrue(sucesso,Acessar);

	}

	@Test(priority = 2)
	public void filtrosAvancados() {

		execu��esSalvasFiltrosPO.Filtros();

		ArrayList<Boolean> empresa = execu��esSalvasFiltrosPO.filtroHierarquia();
		for (int i = 0; i < empresa.size(); i++) {
			assertTrue(empresa.get(i), Filtros);
		}
		
		ArrayList<Boolean> empresa1 = execu��esSalvasFiltrosPO.filtroEmpresa();
		for (int i = 0; i < empresa1.size(); i++) {
			assertTrue(empresa1.get(i), Filtros);
		}
	}


}
