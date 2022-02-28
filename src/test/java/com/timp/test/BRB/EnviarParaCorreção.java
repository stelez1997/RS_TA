package com.timp.test.BRB;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRB.AcessarBrbPO;
import com.sap.timp.pageObjectModel.BRB.Atribui��odeRegraPO;
import com.sap.timp.pageObjectModel.BRB.EnviarParaCorre��oPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class EnviarParaCorre��o extends TestBaseSteven{
	LoginTC loginTC;
	AcessarBrbPO acessarBrbPO;
	EnviarParaCorre��oPO enviarParaCorre��oPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarBrbPO = new AcessarBrbPO();
		enviarParaCorre��oPO = new EnviarParaCorre��oPO();

	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}



	@Test()
	public void editar() {
		
		loginTC.login();
		
		acessarBrbPO.acessar();
		

		boolean sucesso = enviarParaCorre��oPO.editar();
		assertTrue(sucesso, Editar);

	}

}
