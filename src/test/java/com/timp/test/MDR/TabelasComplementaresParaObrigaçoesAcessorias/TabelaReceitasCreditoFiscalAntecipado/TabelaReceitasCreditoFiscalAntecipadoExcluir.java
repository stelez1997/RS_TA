package com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.TabelaReceitasCreditoFiscalAntecipado;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObriga�oesAcessorias.AgrupadorDeCFOP.AgrupadorDeCFOPCriarPO;
import com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObriga�oesAcessorias.TabelaOutrosDebitos.TabelasOutrosDebitosCriarPO;
import com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObriga�oesAcessorias.TabelaReceitasCreditoFiscalAntecipado.TabelaReceitasCreditoFiscalAntecipadoCriarPO;
import com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObriga�oesAcessorias.TabelaReceitasCreditoFiscalAntecipado.TabelaReceitasCreditoFiscalAntecipadoExcluirPO;

public class TabelaReceitasCreditoFiscalAntecipadoExcluir extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	TabelaReceitasCreditoFiscalAntecipadoExcluirPO tabelaReceitasCreditoFiscalAntecipadoExcluirPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		tabelaReceitasCreditoFiscalAntecipadoExcluirPO = new TabelaReceitasCreditoFiscalAntecipadoExcluirPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void excluir() {
		loginTC.login();
		acessarMDRPO.acessarMDR();

		boolean sucesso = tabelaReceitasCreditoFiscalAntecipadoExcluirPO.excluir();
		assertTrue(sucesso, Criar);

	}

}
