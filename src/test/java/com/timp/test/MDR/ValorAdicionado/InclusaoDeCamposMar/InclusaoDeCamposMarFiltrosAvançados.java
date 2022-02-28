package com.timp.test.MDR.ValorAdicionado.InclusaoDeCamposMar;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;

import com.sap.timp.pageObjectModel.MDR.ValorAdicionado.InclusaoDeCamposMar.InclusaoDeCamposMarFiltrosAvan�adosPO;

public class InclusaoDeCamposMarFiltrosAvan�ados extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	InclusaoDeCamposMarFiltrosAvan�adosPO inclusaoDeCamposMarFiltrosAvan�adosPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		inclusaoDeCamposMarFiltrosAvan�adosPO = new InclusaoDeCamposMarFiltrosAvan�adosPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void filtros() {
		loginTC.login();
		acessarMDRPO.acessarMDR();

		ArrayList<Boolean> sucesso = inclusaoDeCamposMarFiltrosAvan�adosPO.filtrosusuario();
		sleep(2000);
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Filtros);
		}
		ArrayList<Boolean> sucesso1 = inclusaoDeCamposMarFiltrosAvan�adosPO.filtrodatacriacao();
		sleep(2000);
		for (int i = 0; i < sucesso1.size(); i++) {
			assertTrue(sucesso1.get(i), Filtros);
		}
		ArrayList<Boolean> sucesso2 = inclusaoDeCamposMarFiltrosAvan�adosPO.filtrousuariomodificacao();
		sleep(2000);
		for (int i = 0; i < sucesso2.size(); i++) {
			assertTrue(sucesso2.get(i), Filtros);
		}
		ArrayList<Boolean> sucesso3 = inclusaoDeCamposMarFiltrosAvan�adosPO.filtrodatamodificacao();
		sleep(2000);
		for (int i = 0; i < sucesso3.size(); i++) {
			assertTrue(sucesso3.get(i), Filtros);
		}

	}
}
