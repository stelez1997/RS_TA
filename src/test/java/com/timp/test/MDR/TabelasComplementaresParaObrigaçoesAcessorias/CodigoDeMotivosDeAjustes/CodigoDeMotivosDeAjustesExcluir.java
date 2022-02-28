package com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.CodigoDeMotivosDeAjustes;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObriga�oesAcessorias.CodigoDeMotivosDeAjustes.CodigoDeMotivosDeAjustesExcluirPO;

public class CodigoDeMotivosDeAjustesExcluir extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	CodigoDeMotivosDeAjustesExcluirPO codigoDeMotivosDeAjustesExcluirPO;

	@BeforeClass
	public void beforeClass() { 

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		codigoDeMotivosDeAjustesExcluirPO = new CodigoDeMotivosDeAjustesExcluirPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void excluir() {
		loginTC.login();
		acessarMDRPO.acessarMDR();
		boolean sucesso = codigoDeMotivosDeAjustesExcluirPO.excluir();
		assertTrue(sucesso, Eliminado);

	}

}
