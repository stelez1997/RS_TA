package com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.AtribuicaoMunicipioEstado;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObriga�oesAcessorias.AtribuicaoMunicipioEstado.AtribuicaoMunicipioEstadoExcluirEmMassaPO;

public class AtribuicaoMunicipioEstadoExcluirEmMassa extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	AtribuicaoMunicipioEstadoExcluirEmMassaPO atribuicaoMunicipioEstadoExcluirEmMassaPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		atribuicaoMunicipioEstadoExcluirEmMassaPO = new AtribuicaoMunicipioEstadoExcluirEmMassaPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void criar() {
		loginTC.login();
		acessarMDRPO.acessarMDR();
		boolean sucesso = atribuicaoMunicipioEstadoExcluirEmMassaPO.criar();
		assertTrue(sucesso, Criar);
		sleep(1000);
		boolean sucesso2 = atribuicaoMunicipioEstadoExcluirEmMassaPO.excluir();
		assertTrue(sucesso2, Eliminado);

	}

}
