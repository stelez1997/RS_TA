package com.timp.test.MDR.Par�metrosParaEnvioDeMensagens;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.Par�metrosParaEnvioDeMensagens.Par�metrosParaEnvioDeMensagensDetalhesPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class Par�metrosParaEnvioDeMensagensDetalhes extends TestBaseFernando {
	LoginTC loginTC;
	AcessarMDRPO accesarMDRPO;
	Par�metrosParaEnvioDeMensagensDetalhesPO par�metrosParaEnvioDeMensagensDetalhesPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationF();
		loginTC = new LoginTC();
		accesarMDRPO = new AcessarMDRPO();
		par�metrosParaEnvioDeMensagensDetalhesPO = new Par�metrosParaEnvioDeMensagensDetalhesPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test(priority = 1)
	public void detalhes() {

		loginTC.login();
		accesarMDRPO.acessarMDR();

		ArrayList<Boolean> sucesso = par�metrosParaEnvioDeMensagensDetalhesPO.detalhes();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Detalhes);
		}
	}
}
