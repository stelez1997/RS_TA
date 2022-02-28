package com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.TabelaLogradouros;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObriga�oesAcessorias.TabelaServicos.TabelaServicosExcluirEmMassaPO;

public class TabelaLogradouro extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO accesarMDR;
	TabelaServicosExcluirEmMassaPO tabelaServicosExcluirEmMassaPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		accesarMDR = new AcessarMDRPO();
		tabelaServicosExcluirEmMassaPO = new TabelaServicosExcluirEmMassaPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test(priority = 0)
	public void ingresar() {
		loginTC.login();
	}

	@Test(priority = 1)
	public void mdrEntrar() {
		accesarMDR.acessarMDR();

	}

	@Test(priority = 2)
	public void criar() {

		boolean sucesso = tabelaServicosExcluirEmMassaPO.criar();
		assertTrue(sucesso, Criar);
		sleep(1000);

		boolean sucesso2 = tabelaServicosExcluirEmMassaPO.excluir();
		assertTrue(sucesso2, Eliminado);
	}

}
