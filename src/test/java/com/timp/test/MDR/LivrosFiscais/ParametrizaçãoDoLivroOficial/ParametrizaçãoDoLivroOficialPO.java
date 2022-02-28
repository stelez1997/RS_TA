package com.timp.test.MDR.LivrosFiscais.ParametrizaçãoDoLivroOficial;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.AfterClass;

public class ParametrizaçãoDoLivroOficialPO extends TestBaseFernando{
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	ParametrizaçãoDoLivroOficial parametrizaçãoDoLivroOficialPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		parametrizaçãoDoLivroOficialPO = new ParametrizaçãoDoLivroOficial();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}



	@Test()
	public void criar() {	
		loginTC.login();
		acessarMDRPO.acessarMDR();
		parametrizaçãoDoLivroOficialPO.criar();
	}
}
