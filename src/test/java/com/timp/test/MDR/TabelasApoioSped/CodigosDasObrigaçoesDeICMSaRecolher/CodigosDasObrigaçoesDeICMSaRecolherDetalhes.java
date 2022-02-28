package com.timp.test.MDR.TabelasApoioSped.CodigosDasObriga�oesDeICMSaRecolher;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.CodigosDasObriga�oesDeICMSaRecolher.CodigosDasObriga�oesDeICMSaRecolherDetalhesPO;

public class CodigosDasObriga�oesDeICMSaRecolherDetalhes extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	CodigosDasObriga�oesDeICMSaRecolherDetalhesPO codigosDasObriga�oesDeICMSaRecolherDetalhesPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		codigosDasObriga�oesDeICMSaRecolherDetalhesPO = new CodigosDasObriga�oesDeICMSaRecolherDetalhesPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void detalhes() {
		loginTC.login();
		acessarMDRPO.acessarMDR();
		ArrayList<Boolean> sucesso = codigosDasObriga�oesDeICMSaRecolherDetalhesPO.detalhes();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Detalhes);
		}
	}

}
