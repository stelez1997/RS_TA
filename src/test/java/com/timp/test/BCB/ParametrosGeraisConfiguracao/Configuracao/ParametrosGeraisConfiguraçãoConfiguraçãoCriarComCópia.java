package com.timp.test.BCB.ParametrosGeraisConfiguracao.Configuracao;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BCB.AcessarBCBPO;
import com.sap.timp.pageObjectModel.BCB.ParametrosGeraisConfiguracao.Configuracao.ParametrosGeraisConfigura��oConfigura��oCriarComC�piaPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class ParametrosGeraisConfigura��oConfigura��oCriarComC�pia extends TestBaseSteven {
	LoginTC loginTC;
	AcessarBCBPO acessarBCBPO;
	ParametrosGeraisConfigura��oConfigura��oCriarComC�piaPO parametrosGeraisConfigura��oConfigura��oCriarComC�piaPO;


	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarBCBPO = new AcessarBCBPO();
		parametrosGeraisConfigura��oConfigura��oCriarComC�piaPO = new ParametrosGeraisConfigura��oConfigura��oCriarComC�piaPO();


	}

	@AfterClass
	public void afterClass() {
		 driver.close();
	}

	@Test()
	public void criarConfiguracaoHierarquia() {
		loginTC.login();
		acessarBCBPO.acessar();
		
		
		ArrayList<Boolean> sucesso = parametrosGeraisConfigura��oConfigura��oCriarComC�piaPO.editar();
		System.out.println("veamos: "+sucesso);
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Criar);
		}
		
	}
	
	@Test(dependsOnMethods = "criarConfiguracaoHierarquia")
	public void excluirr() {
		
		boolean sucesso = parametrosGeraisConfigura��oConfigura��oCriarComC�piaPO.excluir();
		assertTrue(sucesso, Editar);

	}

}
