package com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.TabelaDeCodigoEClasseParaQuadro;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObriga�oesAcessorias.TabelaDeCodigoEClasseParaQuadro.TabelaDeCodigoEClasseParaQuadroEditarPO;

public class TabelaDeCodigoEClasseParaQuadroEditar extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	TabelaDeCodigoEClasseParaQuadroEditarPO tabelaDeCodigoEClasseParaQuadroEditarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		tabelaDeCodigoEClasseParaQuadroEditarPO = new TabelaDeCodigoEClasseParaQuadroEditarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void editar() {
		loginTC.login();
		acessarMDRPO.acessarMDR();
		boolean sucesso = tabelaDeCodigoEClasseParaQuadroEditarPO.editar();

		assertTrue(sucesso, Editar);

	}

}
