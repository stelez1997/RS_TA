package com.timp.test.MDR.TabelasApoioESocial.Tabela24;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela24.Codifica��oDeAcDeTrabDetalhesPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela26.MotivosCesBeneficiosDetalhesPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class Codifica��oDeAcDeTrabDetalhes extends TestBaseKenssy {
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	Codifica��oDeAcDeTrabDetalhesPO codifica��oDeAcDeTrabDetalhesPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationKen();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		codifica��oDeAcDeTrabDetalhesPO = new Codifica��oDeAcDeTrabDetalhesPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void detalhes() {

		loginTC.login();

		acessarMDRPO.acessarMDR();
		ArrayList<Boolean> sucesso = codifica��oDeAcDeTrabDetalhesPO.detalhes();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualiza�ar);
		}

	}

}
