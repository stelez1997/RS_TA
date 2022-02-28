package com.timp.test.MDR.TabelasApoioSped.Informa�oesAdicionais;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.Informa�oesAdicionais.Informa�oesAdicionaisExcluirEmMassaPO;

public class Informa�oesAdicionaisExcluirEmMassa extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	Informa�oesAdicionaisExcluirEmMassaPO informa�oesAdicionaisExcluirEmMassaPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		informa�oesAdicionaisExcluirEmMassaPO = new Informa�oesAdicionaisExcluirEmMassaPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void criar() {
		loginTC.login();
		acessarMDRPO.acessarMDR();
		boolean sucesso = informa�oesAdicionaisExcluirEmMassaPO.criar();
		assertTrue(sucesso, Criar);
		sleep(1000);
		boolean sucesso2 = informa�oesAdicionaisExcluirEmMassaPO.excluir();
		assertTrue(sucesso2, Eliminado);

	}

}
