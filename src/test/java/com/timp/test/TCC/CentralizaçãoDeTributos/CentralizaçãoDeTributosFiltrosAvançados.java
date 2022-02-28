package com.timp.test.TCC.Centraliza��oDeTributos;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TCC.AcessarTCCPO;
import com.sap.timp.pageObjectModel.TCC.Centraliza��oDeTributos.Centraliza��oDeTributosFiltrosAvan�adosPO;

public class Centraliza��oDeTributosFiltrosAvan�ados extends TestBaseSteven{

	LoginTC loginTC;
	AcessarTCCPO acessarTCCPO;
	Centraliza��oDeTributosFiltrosAvan�adosPO centraliza��oDeTributosFiltrosAvan�adosPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarTCCPO = new AcessarTCCPO();
		centraliza��oDeTributosFiltrosAvan�adosPO = new Centraliza��oDeTributosFiltrosAvan�adosPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()

	public void Filtro() {
		loginTC.login();
		acessarTCCPO.acessarTCC();

		centraliza��oDeTributosFiltrosAvan�adosPO.Filtros();
	}
}
