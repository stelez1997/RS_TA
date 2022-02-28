package com.timp.test.MDR.LivrosFiscais.Parametriza��oDoLivroOficial;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.LivrosFiscais.Parametriza��oDoLivroOficial.Parametriza��oDoLivroOficialCriarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class Parametriza��oDoLivroOficialCriar extends TestBaseMassiel{
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	Parametriza��oDoLivroOficialCriarPO parametriza��oDoLivroOficialPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationM();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		parametriza��oDoLivroOficialPO = new Parametriza��oDoLivroOficialCriarPO();
	}

	@AfterClass
	public void afterClass() {
		//driver.close();
	}



	@Test()
	public void criar() {	
		
		loginTC.login();
		acessarMDRPO.acessarMDR();
		boolean sucesso = parametriza��oDoLivroOficialPO.criar();
		assertTrue(sucesso, Criar);
	}
}
