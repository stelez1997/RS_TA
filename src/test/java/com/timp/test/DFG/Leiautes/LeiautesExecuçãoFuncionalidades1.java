package com.timp.test.DFG.Leiautes;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.DFG.AcessarDFGPO;
import com.sap.timp.pageObjectModel.DFG.Leiautes.LeiautesExecu��oFuncionalidades1PO;

public class LeiautesExecu��oFuncionalidades1 extends TestBaseSteven {
	LoginTC loginTC;
	AcessarDFGPO acessarDFGPO;
	LeiautesExecu��oFuncionalidades1PO leiautesExecu��oFuncionalidadesPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarDFGPO = new AcessarDFGPO();
		leiautesExecu��oFuncionalidadesPO = new LeiautesExecu��oFuncionalidades1PO();
	}

	@AfterClass
	public void afterClass() {
		//driver.close();
	}

	@Test(priority = 0)
	public void ingresar() {
		loginTC.login();
	}

	@Test(priority = 1)
	public void mdrEntrar() {
		acessarDFGPO.acessarDFG();

	}

	@Test(priority = 2)
	public void criar() {
		boolean sucesso = leiautesExecu��oFuncionalidadesPO.criar();
		assertTrue(sucesso, Criar);			

	}
	
	@Test(priority = 3)
	public void Filtro() {

		boolean sucesso1 = leiautesExecu��oFuncionalidadesPO.Filtro();
		assertTrue(sucesso1, Criar);	
		

	}
	
	@Test(priority = 4)
	public void Agrupamiento() {

		/*boolean sucesso1 = leiautesExecu��oFuncionalidadesPO.Agrupamiento();
		assertTrue(sucesso1, Criar);	*/
		leiautesExecu��oFuncionalidadesPO.Agrupamiento();

	}
	

	@Test(priority = 5)
	public void Ordenar() {

		boolean sucesso1 = leiautesExecu��oFuncionalidadesPO.Ordenar();
		assertTrue(sucesso1, Criar);	
		

	}
	
	@Test(priority = 5)
	public void OrdenarPor() {

		boolean sucesso1 = leiautesExecu��oFuncionalidadesPO.OrdenarPor();
		assertTrue(sucesso1, Criar);	
		

	}
	
	@Test(priority = 6)
	public void Formato() {

		boolean sucesso1 = leiautesExecu��oFuncionalidadesPO.formato();
		assertTrue(sucesso1, Criar);	
		

	}
	
	@Test(priority = 7)
	public void separdor() {

		boolean sucesso1 = leiautesExecu��oFuncionalidadesPO.separadores();
		assertTrue(sucesso1, Criar);	
		

	}
	
	@Test(priority = 8)
	public void copiarBloco() {

		boolean sucesso1 = leiautesExecu��oFuncionalidadesPO.CopiarBloco();
		assertTrue(sucesso1, Criar);	
		

	}
	

	@Test(priority = 9)
	public void CriarConfiguracion() {

		leiautesExecu��oFuncionalidadesPO.criarConfiguracion();
		/*boolean sucesso1 = leiautesExecu��oFuncionalidadesPO.criarConfiguracion();
		assertTrue(sucesso1, Criar);	*/
		

	}
}
