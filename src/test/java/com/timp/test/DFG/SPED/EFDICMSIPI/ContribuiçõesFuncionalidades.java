package com.timp.test.DFG.SPED.EFDICMSIPI;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.DFG.AcessarDFGPO;
import com.sap.timp.pageObjectModel.DFG.SPED.EFDICMSIPI.Contribui��esFuncionalidadesPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class Contribui��esFuncionalidades extends TestBaseSteven {
	LoginTC loginTC;
	AcessarDFGPO acessarDFGPO; 
	Contribui��esFuncionalidadesPO contribui��esFuncionalidadesPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarDFGPO = new AcessarDFGPO();
		contribui��esFuncionalidadesPO = new Contribui��esFuncionalidadesPO();
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
	public void criarDFG() {
		boolean sucesso = contribui��esFuncionalidadesPO.criar();
		assertTrue(sucesso, Criar);

	}
	
	@Test(priority = 3)
	public void criarBRE() {

		boolean sucesso2 = contribui��esFuncionalidadesPO.BRE();
		assertTrue(sucesso2, Criar);
		
	}
	

	@Test(priority = 4)
	public void criarDFGSPED() {
		
		ArrayList<Boolean> sucesso3 = contribui��esFuncionalidadesPO.DFG();
		
		for (int i = 0; i < sucesso3.size(); i++) {
			assertTrue(sucesso3.get(i), visualiza�ar);
		}
		

	}
	
	
	@Test(priority = 5)
	public void editar() {
		
		boolean sucesso = contribui��esFuncionalidadesPO.editarDFG();
		
		assertTrue(sucesso, Editar);
		

	}
	
	@Test(priority = 6)
	public void informacoes() {
		
		ArrayList<Boolean> sucesso = contribui��esFuncionalidadesPO.informacao();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualiza�ar);
		}
		

	}
	
	@Test(priority = 7)
	public void blocoApuracao() {
		
		ArrayList<Boolean> sucesso = contribui��esFuncionalidadesPO.blocoApuracao();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualiza�ar);
		}
		

	}
	
	@Test(priority = 8)
	public void blocoApuracaoExecutar() {
		
		ArrayList<Boolean> sucesso = contribui��esFuncionalidadesPO.execucao();
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualiza�ar);
		}
		

	}
	
	@Test(priority = 9)
	public void arquivos() {
		
		ArrayList<Boolean> sucesso = contribui��esFuncionalidadesPO.arquivos();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualiza�ar);
		}

	}
	
	@Test(priority = 10)
	public void excluirDFG() {
		
		ArrayList<Boolean> sucesso = contribui��esFuncionalidadesPO.excluirDFG();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Eliminado);
		}

	}
	
	@Test(priority = 11)
	public void excluirBRE() {
		
		ArrayList<Boolean> sucesso = contribui��esFuncionalidadesPO.excluirBRE();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Eliminado);
		}

	}
	

}
