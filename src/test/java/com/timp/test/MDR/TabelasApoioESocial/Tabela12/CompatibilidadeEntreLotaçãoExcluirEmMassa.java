package com.timp.test.MDR.TabelasApoioESocial.Tabela12;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela12.CompatibilidadeEntreLota��oExcluirEmMassaPO;

public class CompatibilidadeEntreLota��oExcluirEmMassa extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	CompatibilidadeEntreLota��oExcluirEmMassaPO compatibilidadeEntreLota��oExcluirEmMassa;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		compatibilidadeEntreLota��oExcluirEmMassa = new CompatibilidadeEntreLota��oExcluirEmMassaPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void criar() {

		loginTC.login();
		acessarMDRPO.acessarMDR();

		boolean sucesso = compatibilidadeEntreLota��oExcluirEmMassa.criar();
		assertTrue(sucesso, Criar);
	}

	@Test(dependsOnMethods = "criar")
	public void excluirEmMassa() {
		boolean sucesso2 = compatibilidadeEntreLota��oExcluirEmMassa.excluir();
		assertTrue(sucesso2, Eliminado);
	}

}
