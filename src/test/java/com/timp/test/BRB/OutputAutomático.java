package com.timp.test.BRB;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRB.AcessarBrbPO;
import com.sap.timp.pageObjectModel.BRB.DuplicidadePO;
import com.sap.timp.pageObjectModel.BRB.OutputAutom�ticoPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class OutputAutom�tico extends TestBaseSteven {
	LoginTC loginTC;
	AcessarBrbPO acessarBrbPO;
	OutputAutom�ticoPO outputAutom�ticoPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarBrbPO = new AcessarBrbPO();
		outputAutom�ticoPO = new OutputAutom�ticoPO();

	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void outputAutomatico() {		
		loginTC.login();		
		acessarBrbPO.acessar();		
		
		boolean sucesso = outputAutom�ticoPO.outputAutomatico();
		assertTrue(sucesso, Editar);
	}
}
