package com.timp.test.BRB;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.BRB.AcessarBrbPO;
import static org.testng.Assert.assertTrue;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class AcessarBRB extends TestBaseSteven {


	AcessarBrbPO acessarBrbPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();

		acessarBrbPO = new AcessarBrbPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}


	@Test()
	public void brbEntrar() {
		

		boolean sucesso = acessarBrbPO.acessar();
		System.out.println(sucesso);

		assertTrue(sucesso, semAcesso);
		sleep(2000);
	}

}
