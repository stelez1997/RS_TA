package com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.TabelaDeAtribuicaoDeCodigoCFOP;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObriga�oesAcessorias.TabelaDeAtribuicaoDeCodigoCFOP.TabelaDeAtribuicaoDeCodigoCFOPCriarPO;

public class TabelaDeAtribuicaoDeCodigoCFOPCriar extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	TabelaDeAtribuicaoDeCodigoCFOPCriarPO tabelaDeAtribuicaoDeCodigoCFOPCriarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		tabelaDeAtribuicaoDeCodigoCFOPCriarPO = new TabelaDeAtribuicaoDeCodigoCFOPCriarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void criar() {
		loginTC.login();
		acessarMDRPO.acessarMDR();
		boolean sucesso = tabelaDeAtribuicaoDeCodigoCFOPCriarPO.criar();
		assertTrue(sucesso, semAcesso);

	}

}
