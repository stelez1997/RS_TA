package com.timp.test.BCB.ParametrosGeraisConfiguracao.Configuracao;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BCB.AcessarBCBPO;
import com.sap.timp.pageObjectModel.BCB.ParametrosGeraisConfiguracao.Configuracao.ParametrosGeraisConfigura��oConfigura��oDetalhesPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class ParametrosGeraisConfigura��oConfigura��oDetalhes  extends TestBaseKenssy {
	LoginTC loginTC;
	AcessarBCBPO acessarBCBPO;
	ParametrosGeraisConfigura��oConfigura��oDetalhesPO parametrosGeraisConfigura��oConfigura��oDetalhesPO;


	@BeforeClass
	public void beforeClass() {
		driver = initializationKen();
		loginTC = new LoginTC();
		acessarBCBPO = new AcessarBCBPO();
		parametrosGeraisConfigura��oConfigura��oDetalhesPO = new ParametrosGeraisConfigura��oConfigura��oDetalhesPO();


	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void detalhes() {
		loginTC.login();
		acessarBCBPO.acessar();
		
		//parametrosGeraisConfigura��oConfigura��oDetalhesPO.parametrosGeraisDetalhes();
		ArrayList<Boolean> sucesso = parametrosGeraisConfigura��oConfigura��oDetalhesPO.parametrosGeraisDetalhes();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Detalhes);
		}

	}

}
