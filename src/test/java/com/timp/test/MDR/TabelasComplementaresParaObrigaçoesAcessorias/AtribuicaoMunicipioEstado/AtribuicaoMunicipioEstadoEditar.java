package com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.AtribuicaoMunicipioEstado;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObriga�oesAcessorias.AtribuicaoMunicipioEstado.AtribuicaoMunicipioEstadoCriarPO;
import com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObriga�oesAcessorias.AtribuicaoMunicipioEstado.AtribuicaoMunicipioEstadoEditarPO;
import com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObriga�oesAcessorias.CodigoDIPAM.CodigoDIPAMCriarPO;
import com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObriga�oesAcessorias.TabelaCodigoReceitas.TabelaCodigoReceitasCriarPO;

public class AtribuicaoMunicipioEstadoEditar extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	AtribuicaoMunicipioEstadoEditarPO atribuicaoMunicipioEstadoEditarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		atribuicaoMunicipioEstadoEditarPO = new AtribuicaoMunicipioEstadoEditarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void editar() {
		loginTC.login();
		acessarMDRPO.acessarMDR();
		boolean sucesso = atribuicaoMunicipioEstadoEditarPO.editar();
		assertTrue(sucesso, Criar);

	}

}
