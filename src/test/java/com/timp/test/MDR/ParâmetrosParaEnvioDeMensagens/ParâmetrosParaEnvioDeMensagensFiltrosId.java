package com.timp.test.MDR.Par�metrosParaEnvioDeMensagens;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.Par�metrosParaEnvioDeMensagens.Par�metrosParaEnvioDeMensagensFiltroIdPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.remote.NewSessionPayload;
import org.testng.annotations.AfterClass;

public class Par�metrosParaEnvioDeMensagensFiltrosId extends TestBaseMassiel {
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	Par�metrosParaEnvioDeMensagensFiltroIdPO par�metrosParaEnvioDeMensagensFiltroIdPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationM();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		par�metrosParaEnvioDeMensagensFiltroIdPO = new Par�metrosParaEnvioDeMensagensFiltroIdPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test(priority = 1)
	public void filtros() {
		loginTC.login();
		acessarMDRPO.acessarMDR();

		par�metrosParaEnvioDeMensagensFiltroIdPO.filtro();
		// String sucesso = antecipacaoFiltrosPO.filtro();

		// assertEquals(sucesso, antecipacaoFiltrosPO.id.getText(), Filtros);

	}

}
