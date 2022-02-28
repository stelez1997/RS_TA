package com.timp.test.MDR.TabelasApoioESocial.Tabela17;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela17.DescricaoDeNatDeLes�oExcluirEmMassaPO;

public class DescricaoDeNatDeLes�oExcluirEmMassa extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	DescricaoDeNatDeLes�oExcluirEmMassaPO descricaoDeNatDeLes�oExcluirEmMassaPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		descricaoDeNatDeLes�oExcluirEmMassaPO = new DescricaoDeNatDeLes�oExcluirEmMassaPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void criar() {

		loginTC.login();
		acessarMDRPO.acessarMDR();

		boolean sucesso = descricaoDeNatDeLes�oExcluirEmMassaPO.criar();
		assertTrue(sucesso, Criar);
		sleep(1000);
	}

	@Test(dependsOnMethods = "criar")
	public void excluir() {
		boolean sucesso2 = descricaoDeNatDeLes�oExcluirEmMassaPO.excluir();
		assertTrue(sucesso2, Eliminado);
	}
}
