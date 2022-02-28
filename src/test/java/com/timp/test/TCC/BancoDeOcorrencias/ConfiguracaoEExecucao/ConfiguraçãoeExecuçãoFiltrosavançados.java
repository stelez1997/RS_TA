package com.timp.test.TCC.BancoDeOcorrencias.ConfiguracaoEExecucao;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TCC.AcessarTCCPO;
import com.sap.timp.pageObjectModel.TCC.BancoDeOcorrencias.ConfiguracaoEExecucao.Configura��oeExecu��oFiltrosavan�adosPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class Configura��oeExecu��oFiltrosavan�ados extends TestBaseSteven {
	LoginTC loginTC;
	AcessarTCCPO acessarTCCPO;
	Configura��oeExecu��oFiltrosavan�adosPO configura��oeExecu��oFiltrosavan�adosPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarTCCPO = new AcessarTCCPO();
		configura��oeExecu��oFiltrosavan�adosPO = new Configura��oeExecu��oFiltrosavan�adosPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void filtros() {

		loginTC.login();
		acessarTCCPO.acessarTCC();

		ArrayList<Boolean> sucesso = configura��oeExecu��oFiltrosavan�adosPO.filtros();
		sleep(2000);
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), "The results in the filter aren't equal");
		}

	}

}
