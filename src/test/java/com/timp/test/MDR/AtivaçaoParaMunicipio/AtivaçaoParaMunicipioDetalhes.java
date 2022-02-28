package com.timp.test.MDR.Ativa�aoParaMunicipio;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.Ativa�aoParaMunicipio.Ativa�aoParaMunicipioDestalhesPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class Ativa�aoParaMunicipioDetalhes extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	Ativa�aoParaMunicipioDestalhesPO ativa�aoParaMunicipioDestalhesPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		ativa�aoParaMunicipioDestalhesPO = new Ativa�aoParaMunicipioDestalhesPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void detalhes() {

		loginTC.login();
		
		acessarMDRPO.acessarMDR();

		ArrayList<Boolean> sucesso = ativa�aoParaMunicipioDestalhesPO.detalhes();

		for (int i = 0; i < sucesso.size(); i++) {

			assertTrue(sucesso.get(i), Detalhes);

		}
		sleep(2000);
	}

}
