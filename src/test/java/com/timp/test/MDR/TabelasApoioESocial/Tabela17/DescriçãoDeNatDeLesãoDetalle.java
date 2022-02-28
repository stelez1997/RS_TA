package com.timp.test.MDR.TabelasApoioESocial.Tabela17;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela17.Descri��oDeNatDeLes�oDetallePO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class Descri��oDeNatDeLes�oDetalle extends TestBaseMassiel {
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	Descri��oDeNatDeLes�oDetallePO descri��oDeNatDeLes�oDetallePO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationM();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		descri��oDeNatDeLes�oDetallePO = new Descri��oDeNatDeLes�oDetallePO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void detalle() {

		loginTC.login();
		acessarMDRPO.acessarMDR();

		ArrayList<Boolean> sucesso = descri��oDeNatDeLes�oDetallePO.Detalle();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualiza�ar);
		}

	}

}
