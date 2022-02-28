package com.timp.test.MDR.Ativa�aoParaMunicipio;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.Ativa�aoParaMunicipio.Ativa�aoParaMunicipioExcluirPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class Ativa�aoParaMunicipioExcluir extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	Ativa�aoParaMunicipioExcluirPO ativa�aoParaMunicipioExcluirPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		ativa�aoParaMunicipioExcluirPO = new Ativa�aoParaMunicipioExcluirPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}


	@Test()
	public void excluir() {
		
		loginTC.login();
		
		acessarMDRPO.acessarMDR();	
		
		boolean sucesso = ativa�aoParaMunicipioExcluirPO.excluir();
		assertTrue(sucesso, Eliminado);
		sleep(2000);
	}

}
