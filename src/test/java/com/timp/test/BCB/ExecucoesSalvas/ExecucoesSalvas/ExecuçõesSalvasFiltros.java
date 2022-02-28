package com.timp.test.BCB.ExecucoesSalvas.ExecucoesSalvas;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BCB.AcessarBCBPO;
import com.sap.timp.pageObjectModel.BCB.ExecucoesSalvas.Execu��esSalvas.Execu��esSalvasFiltrosPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class Execu��esSalvasFiltros extends TestBaseMassiel{
	LoginTC loginTC;
	AcessarBCBPO acessarBCBPO;
	Execu��esSalvasFiltrosPO execu��esSalvasFiltrosPO;
	
  @BeforeClass
  public void beforeClass() {
	  driver = initializationM();
		loginTC = new LoginTC();
		acessarBCBPO = new AcessarBCBPO();
		execu��esSalvasFiltrosPO = new Execu��esSalvasFiltrosPO();
  }

  @AfterClass
  public void afterClass() {
	driver.close();
  }
  
   @Test(priority = 0)
	public void login() {

		loginTC.login();

	}

	@Test(priority = 1)
	public void brbEntrar() {
		boolean sucesso = acessarBCBPO.acessar();
		System.out.println(sucesso);
		assertTrue(sucesso,Acessar);
	}

	@Test(priority = 2)
	public void FiltroID() {
		
	
		boolean sucesso = execu��esSalvasFiltrosPO.Filtro();

		assertTrue(sucesso, Filtros);
	}
	
	@Test(priority = 3)
	public void  NombreHierarquia() {
		
		ArrayList<Boolean> sucesso = execu��esSalvasFiltrosPO. Hierarquia();
		System.out.println(sucesso);
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), subniveis);
		}
		
	}
	
	@Test(priority = 4)
	public void FiltroEmpresa() {
			
	
		ArrayList<Boolean> sucesso =  execu��esSalvasFiltrosPO. Empresa();
		System.out.println(sucesso);
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), subniveis);
		}
	
	
	}
	
	@Test(priority = 5)
	public void FiltroUF() {
			
	
		ArrayList<Boolean> sucesso =  execu��esSalvasFiltrosPO. UF();
		System.out.println(sucesso);
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), subniveis);
		}
	
	
	}
	
	@Test(priority = 6)
	public void FiltroFilial() {
			
	
		ArrayList<Boolean> sucesso =  execu��esSalvasFiltrosPO. Filial();
		System.out.println(sucesso);
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), subniveis);
		}
	
	
	}
	
	@Test(priority = 7)
	public void FiltroTributo() {
			
	
		ArrayList<Boolean> sucesso =  execu��esSalvasFiltrosPO.Tributo();
		System.out.println(sucesso);
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), subniveis);
		}
	
	
	}
	
	/*@Test(priority = 8)
	public void FiltroSub() {
			
		 execu��esSalvasFiltrosPO.SubPeriodo();
		/*ArrayList<Boolean> sucesso =  execu��esSalvasFiltrosPO.Tributo();
		System.out.println(sucesso);
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), subniveis);
		}
	
	
	}*/
	
}
