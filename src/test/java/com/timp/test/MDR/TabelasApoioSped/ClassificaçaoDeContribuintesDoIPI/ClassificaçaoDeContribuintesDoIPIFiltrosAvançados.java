package com.timp.test.MDR.TabelasApoioSped.Classifica�aoDeContribuintesDoIPI;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.Classifica�aoDeContribuintesDoIPI.Classifica�aoDeContribuintesDoIPIFiltrosAvan�adosPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class Classifica�aoDeContribuintesDoIPIFiltrosAvan�ados extends TestBaseSteven {
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	Classifica�aoDeContribuintesDoIPIFiltrosAvan�adosPO classifica�aoDeContribuintesDoIPIFiltrosAvan�adosPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		classifica�aoDeContribuintesDoIPIFiltrosAvan�adosPO = new Classifica�aoDeContribuintesDoIPIFiltrosAvan�adosPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void filtros() {
		loginTC.login();
		acessarMDRPO.acessarMDR();
		// classifica�aoDeContribuintesDoIPIFiltrosAvan�adosPO.filtros();

		ArrayList<Boolean> sucesso = classifica�aoDeContribuintesDoIPIFiltrosAvan�adosPO.filtros();
		// sleep(2000);
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), "The results in the filter aren't equal");
		}

	}

}
