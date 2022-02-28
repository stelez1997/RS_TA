package com.timp.test.MDR.ControleDeCreditoTributario.StatusParaBancoInd�bitos;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.ControleDeCreditoTributario.StatusParaBancoInd�bitos.StatusParaBancoInd�bitosExcluirMassaPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela16.SGDPExcluirEmMassaPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class StatusParaBancoInd�bitosExcluirMassa extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	StatusParaBancoInd�bitosExcluirMassaPO statusParaBancoInd�bitosExcluirMassaPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		statusParaBancoInd�bitosExcluirMassaPO = new StatusParaBancoInd�bitosExcluirMassaPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void criar() {

		loginTC.login();
		acessarMDRPO.acessarMDR();

		boolean sucesso = statusParaBancoInd�bitosExcluirMassaPO.criar();
		assertTrue(sucesso, Criar);
		sleep(1000);
		boolean sucesso2 = statusParaBancoInd�bitosExcluirMassaPO.excluir();
		assertTrue(sucesso2, Eliminado);

	}
}
