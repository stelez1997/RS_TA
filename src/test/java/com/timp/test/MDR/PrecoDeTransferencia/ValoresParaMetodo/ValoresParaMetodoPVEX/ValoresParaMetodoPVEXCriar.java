package com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoPVEX;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoPVEX.ValoresParaMetodoPVEXCriarPO;

public class ValoresParaMetodoPVEXCriar extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	ValoresParaMetodoPVEXCriarPO valoresParaMetodoPVEXCriarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		valoresParaMetodoPVEXCriarPO = new ValoresParaMetodoPVEXCriarPO();
	}

	@AfterClass
	public void afterClass() {
		//driver.close();
	}

	@Test()
	public void criar() {
		loginTC.login();
		acessarMDRPO.acessarMDR();
		
		boolean sucesso = valoresParaMetodoPVEXCriarPO.criar();
		assertTrue(sucesso, semAcesso);

	}

}
