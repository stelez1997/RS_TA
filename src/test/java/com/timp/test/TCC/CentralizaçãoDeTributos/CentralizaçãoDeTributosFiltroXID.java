package com.timp.test.TCC.Centraliza��oDeTributos;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TCC.AcessarTCCPO;
import com.sap.timp.pageObjectModel.TCC.Centraliza��oDeTributos.Centraliza��oDeTributosFiltroXIDPO;
import com.sap.timp.pageObjectModel.TCC.Centraliza��oDeTributos.Centraliza��oDeTributosFiltrosAvan�adosPO;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Centraliza��oDeTributosFiltroXID extends TestBaseSteven {
	LoginTC loginTC;
	AcessarTCCPO acessarTCCPO;
	Centraliza��oDeTributosFiltroXIDPO centraliza��oDeTributosFiltroXIDPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarTCCPO = new AcessarTCCPO();
		centraliza��oDeTributosFiltroXIDPO = new Centraliza��oDeTributosFiltroXIDPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}


	@Test()

	public void Filtro() {
		loginTC.login();
		acessarTCCPO.acessarTCC();

		centraliza��oDeTributosFiltroXIDPO.Filtros();

	}
}
