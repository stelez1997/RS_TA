package com.timp.test.MDR.Ativa�aoParaMunicipio;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.Ativa�aoParaMunicipio.Ativa�aoParaMunicipioVisualizarPO;

public class Ativa�aoParaMunicipioVisualizar extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	Ativa�aoParaMunicipioVisualizarPO ativa�aoParaMunicipioVisualizarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		ativa�aoParaMunicipioVisualizarPO = new Ativa�aoParaMunicipioVisualizarPO();
	}

	@AfterClass
	public void afterClass() {
		//driver.close();
	}

	@Test()
	public void visualizar() {

		loginTC.login();

		acessarMDRPO.acessarMDR();

		ArrayList<Boolean> sucesso = ativa�aoParaMunicipioVisualizarPO.visualizar();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualiza�ar);
		}
		
		sleep(2000);
	}

}
