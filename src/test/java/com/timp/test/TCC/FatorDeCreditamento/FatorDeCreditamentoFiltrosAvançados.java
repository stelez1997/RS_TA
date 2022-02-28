package com.timp.test.TCC.FatorDeCreditamento;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TCC.AcessarTCCPO;
import com.sap.timp.pageObjectModel.TCC.Centraliza��oDeTributos.Centraliza��oDeTributosFiltrosAvan�adosPO;
import com.sap.timp.pageObjectModel.TCC.FatorDeCreditamento.FatorDeCreditamentoFiltrosAvan�adosPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class FatorDeCreditamentoFiltrosAvan�ados extends TestBaseSteven{
	LoginTC loginTC;
	AcessarTCCPO acessarTCCPO;
	FatorDeCreditamentoFiltrosAvan�adosPO fatorDeCreditamentoFiltrosAvan�adosPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarTCCPO = new AcessarTCCPO();
		fatorDeCreditamentoFiltrosAvan�adosPO = new FatorDeCreditamentoFiltrosAvan�adosPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}


	@Test()
	public void Filtro() {
		loginTC.login();
		acessarTCCPO.acessarTCC();
		
		boolean sucesso = fatorDeCreditamentoFiltrosAvan�adosPO.Filtros();
		assertTrue(sucesso, Filtros);
	}
}
