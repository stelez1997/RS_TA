package com.timp.test.BRE.CalculoDeTributos.Edicao;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRE.AcessarBREPO;
import com.sap.timp.pageObjectModel.BRE.CalculoDeTributos.Edicao.CalculodeTributosEdi��oRelacionamentoPO;

public class CalculodeTributosEdi��oRelacionamento extends TestBaseFernando {
	LoginTC loginTC;
	AcessarBREPO acessarBREPO;
	CalculodeTributosEdi��oRelacionamentoPO calculodeTributosEdi��oRelacionamentoPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationF();
		loginTC = new LoginTC();
		acessarBREPO = new AcessarBREPO();
		calculodeTributosEdi��oRelacionamentoPO = new CalculodeTributosEdi��oRelacionamentoPO();
	}

	@AfterClass
	public void afterClass() {
	//	driver.close();
	}

	@Test()
	public void editar() {
		loginTC.login();
		acessarBREPO.acessarBRE();
		boolean sucesso = calculodeTributosEdi��oRelacionamentoPO.relacionamiento();
		assertTrue(sucesso, Editar);
	}
}
