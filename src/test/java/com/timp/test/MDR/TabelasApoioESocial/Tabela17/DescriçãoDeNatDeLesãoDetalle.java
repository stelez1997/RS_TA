package com.timp.test.MDR.TabelasApoioESocial.Tabela17;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela17.DescriçãoDeNatDeLesãoDetallePO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class DescriçãoDeNatDeLesãoDetalle extends TestBaseMassiel {
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	DescriçãoDeNatDeLesãoDetallePO descriçãoDeNatDeLesãoDetallePO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationM();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		descriçãoDeNatDeLesãoDetallePO = new DescriçãoDeNatDeLesãoDetallePO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void detalle() {

		loginTC.login();
		acessarMDRPO.acessarMDR();

		ArrayList<Boolean> sucesso = descriçãoDeNatDeLesãoDetallePO.Detalle();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizaçar);
		}

	}

}
