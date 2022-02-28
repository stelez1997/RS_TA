package com.timp.test.MDR.ControleDeCreditoTributario.StatusParaBancoInd�bitos;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.ControleDeCreditoTributario.StatusParaBCE.StatusParaBCEExcluirPO;
import com.sap.timp.pageObjectModel.MDR.ControleDeCreditoTributario.StatusParaBancoInd�bitos.StatusParaBancoInd�bitosExcluirPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class StatusParaBancoInd�bitosExcluir extends TestBaseSteven {
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	StatusParaBancoInd�bitosExcluirPO statusParaBancoInd�bitosExcluirPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		statusParaBancoInd�bitosExcluirPO = new StatusParaBancoInd�bitosExcluirPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void excluir() {

		loginTC.login();
		acessarMDRPO.acessarMDR();

		boolean sucesso = statusParaBancoInd�bitosExcluirPO.excluir();

		assertTrue(sucesso, Eliminado);

	}
}
