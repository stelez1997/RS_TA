package com.timp.test.BCB.ParametrosGeraisConfiguracao.Configuracao;

import org.testng.annotations.Test;
import org.testng.internal.annotations.TestAnnotation;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BCB.AcessarBCBPO;
import com.sap.timp.pageObjectModel.BCB.ParametrosGeraisConfiguracao.Configuracao.ParametrosGeraisConfigura��oConfigura��oFavoritosPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class ParametrosGeraisConfigura��oConfigura��oFavoritos extends TestBaseKenssy {
	LoginTC loginTC;
	AcessarBCBPO acessarBCBPO;
	ParametrosGeraisConfigura��oConfigura��oFavoritosPO parametrosGeraisConfigura��oConfigura��oFavoritosPO;


	@BeforeClass
	public void beforeClass() {
		driver = initializationKen();
		loginTC = new LoginTC();
		acessarBCBPO = new AcessarBCBPO();
		parametrosGeraisConfigura��oConfigura��oFavoritosPO = new ParametrosGeraisConfigura��oConfigura��oFavoritosPO();


	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	
	@Test()
	public void criarConfiguracao() {
		loginTC.login();
		acessarBCBPO.acessar();
		
		boolean sucesso = parametrosGeraisConfigura��oConfigura��oFavoritosPO.favoritosConfiguracao();
		assertTrue(sucesso, Criar);
	}

}
