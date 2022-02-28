package com.timp.test.MDR.AtividadesFiscais.AssociacaoAtividadeFiscal;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.AtividadesFiscais.AssociacaoAtividadeFiscal.Associa��oCriarPO;

public class Associa��oCriar extends TestBaseFernando {
	LoginTC loginTC;
	AcessarMDRPO accesarMDR;
	Associa��oCriarPO associa��oCriarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationF();
		loginTC = new LoginTC();
		accesarMDR = new AcessarMDRPO();
		associa��oCriarPO = new Associa��oCriarPO();
	}

	@AfterClass
	public void afterClass() {
		///driver.close();
	}

	@Test()
	public void criarAssocia��o() {

		loginTC.login();

		accesarMDR.acessarMDR();

		boolean sucesso = associa��oCriarPO.criarAssocia��o();
		assertTrue(sucesso, Criar);
		sleep(2000);
	}
}
