package com.timp.test.TDK.Kpis.Edicao;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TDK.AcessarTDKPO;
import com.sap.timp.pageObjectModel.TDK.Kpis.Edicao.KpisLinksRapidosEditarPO;

public class KpisLinksRapidosEditar extends TestBaseSteven {
	LoginTC loginTC;
	AcessarTDKPO acessarTDKPO;
	KpisLinksRapidosEditarPO kpisLinksRapidosEditarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarTDKPO = new AcessarTDKPO();
		kpisLinksRapidosEditarPO = new KpisLinksRapidosEditarPO();
	}

	@AfterClass
	public void afterClass() {
		 driver.close();
	}

	@Test()
	public void linksrapidos() {
		loginTC.login();
		acessarTDKPO.acessarTDK();
		
		ArrayList<Boolean> sucesso = kpisLinksRapidosEditarPO.linksrapidos();
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), "N�o foi poss�vel editar o link r�pido");
		}
	}
}
