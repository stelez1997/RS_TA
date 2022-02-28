package com.timp.test.MDR.Siscoserv.RegistroRP;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.Siscoserv.RegistroRP.RegistroRPExcluirEmMassaPO;

public class RegistroRPExcluirEmMassa extends TestBaseSteven{
   
	
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	RegistroRPExcluirEmMassaPO registroRPExcluirEmMassaPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		registroRPExcluirEmMassaPO = new RegistroRPExcluirEmMassaPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void criar() {
		loginTC.login();
		acessarMDRPO.acessarMDR();

		boolean sucesso = registroRPExcluirEmMassaPO.criar();
		assertTrue(sucesso, Criar);

		sleep(1000);
	}
	
	@Test(dependsOnMethods = "criar")
	public void excluir() {
		boolean sucesso2 = registroRPExcluirEmMassaPO.excluir();
		assertTrue(sucesso2, Eliminado);

	}
}
