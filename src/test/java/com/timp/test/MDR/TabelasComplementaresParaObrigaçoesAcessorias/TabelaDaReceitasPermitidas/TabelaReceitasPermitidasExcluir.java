package com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.TabelaDaReceitasPermitidas;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObriga�oesAcessorias.CodigoDIPAM.CodigoDIPAMCriarPO;
import com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObriga�oesAcessorias.TabelaCodigoReceitas.TabelaCodigoReceitasCriarPO;
import com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObriga�oesAcessorias.TabelaReceitasPermitidas.TabelaReceitasPermitidasCriarPO;
import com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObriga�oesAcessorias.TabelaReceitasPermitidas.TabelaReceitasPermitidasExcluirPO;

public class TabelaReceitasPermitidasExcluir extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	TabelaReceitasPermitidasExcluirPO tabelaReceitasPermitidasExcluirPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		tabelaReceitasPermitidasExcluirPO = new TabelaReceitasPermitidasExcluirPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void excluir() {
		loginTC.login();
		acessarMDRPO.acessarMDR();

		boolean sucesso = tabelaReceitasPermitidasExcluirPO.eliminar();
		assertTrue(sucesso, Eliminado);

	}

}
