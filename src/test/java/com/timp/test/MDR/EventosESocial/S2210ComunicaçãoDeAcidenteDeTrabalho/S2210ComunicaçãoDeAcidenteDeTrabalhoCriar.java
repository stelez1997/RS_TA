package com.timp.test.MDR.EventosESocial.S2210Comunica��oDeAcidenteDeTrabalho;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.EventosESocial.S2210Comunica��oDeAcidenteDeTrabalho.S2210Comunica��oDeAcidenteDeTrabalhoCriarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class S2210Comunica��oDeAcidenteDeTrabalhoCriar extends TestBaseFernando{
	LoginTC loginTC;
	AcessarMDRPO accesarMDRPO;
	S2210Comunica��oDeAcidenteDeTrabalhoCriarPO s2210Comunica��oDeAcidenteDeTrabalhoCriarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationF();
		loginTC = new LoginTC();
		accesarMDRPO = new AcessarMDRPO();
		s2210Comunica��oDeAcidenteDeTrabalhoCriarPO = new S2210Comunica��oDeAcidenteDeTrabalhoCriarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}


	@Test()
	public void criar() {
		loginTC.login();
		accesarMDRPO.acessarMDR();
		boolean sucesso = s2210Comunica��oDeAcidenteDeTrabalhoCriarPO.criar();
		assertTrue(sucesso, Criar);
	}
}
