package com.timp.test.TDK.Kpis.Edicao;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TDK.AcessarTDKPO;
import com.sap.timp.pageObjectModel.TDK.Kpis.Edicao.KpisCartaoIndicadorExcluirPO;

public class KpisCartaoIndicadorExcluir extends TestBaseSteven {

	LoginTC loginTC;
	AcessarTDKPO acessarTDKPO;
	KpisCartaoIndicadorExcluirPO kpisCartaoIndicadorExcluirPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarTDKPO = new AcessarTDKPO();
		kpisCartaoIndicadorExcluirPO = new KpisCartaoIndicadorExcluirPO();

	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void cartaoindicadroexcluir() {
		loginTC.login();
		acessarTDKPO.acessarTDK();
		
		boolean sucesso = kpisCartaoIndicadorExcluirPO.cartaoindicadorexcluir();
		assertTrue(sucesso, "O Cart�o  n�o foi excluido");
	}
}
