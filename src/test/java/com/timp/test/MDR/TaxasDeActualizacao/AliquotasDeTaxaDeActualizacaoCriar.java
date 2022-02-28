package com.timp.test.MDR.TaxasDeActualizacao;

import org.testng.annotations.Test;
import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela15.AgenteCausadorDeSGDPCriarPO;
import com.sap.timp.pageObjectModel.MDR.TaxasDeActualizacao.AliquotasDeTaxaDeActualizacaoCriarPO;
import org.testng.annotations.BeforeClass;
import static org.testng.Assert.assertTrue;
import org.testng.annotations.AfterClass;

public class AliquotasDeTaxaDeActualizacaoCriar extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	AliquotasDeTaxaDeActualizacaoCriarPO aliquotasDeTaxaDeActualizacaoCriarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		aliquotasDeTaxaDeActualizacaoCriarPO = new AliquotasDeTaxaDeActualizacaoCriarPO();
	}

	@AfterClass
	public void afterClass() {

	}

	@Test(priority = 0)
	public void login() {
		loginTC.login();

	}

	@Test(priority = 1)
	public void acessarMDR() {

		acessarMDRPO.acessarMDR();

	}

	@Test(priority = 2)
	public void criar() {

		boolean sucesso = aliquotasDeTaxaDeActualizacaoCriarPO.criar();

		assertTrue(sucesso, Criar);

	}
}
