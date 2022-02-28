package com.timp.test.MDR.AtividadesFiscais.AssociacaoAtividadeFiscal;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.AtividadesFiscais.AssociacaoAtividadeFiscal.Associa��oDetalhesPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class Associa��oDetalhes extends TestBaseFernando {
	LoginTC loginTC;
	AcessarMDRPO accesarMDR;
	Associa��oDetalhesPO associa��oDetalhesPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationF();
		loginTC = new LoginTC();
		accesarMDR = new AcessarMDRPO();
		associa��oDetalhesPO = new Associa��oDetalhesPO();
	}

	@AfterClass
	public void afterClass() {
		//driver.close();
	}

	@Test()
	public void detalheAssocia��o() {

		loginTC.login();

		accesarMDR.acessarMDR();

		ArrayList<Boolean> sucesso = associa��oDetalhesPO.detalheAssocia��o();
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), "Ocurrio un error");
		}
		
		sleep(2000);
	}
}
