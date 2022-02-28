package com.timp.test.TDK.Dashboard.Edicao;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TDK.AcessarTDKPO;
import com.sap.timp.pageObjectModel.TDK.Dashboard.Edicao.DashboardEdi��oGr�ficoPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class DashboardEdi��oGr�fico extends TestBaseMassiel {
	LoginTC loginTC;
	AcessarTDKPO acessarTDKPO;
	DashboardEdi��oGr�ficoPO dashboardEdi��oGr�ficoPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationM();
		loginTC = new LoginTC();
		acessarTDKPO = new AcessarTDKPO();
		dashboardEdi��oGr�ficoPO = new DashboardEdi��oGr�ficoPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void editar() {
		loginTC.login();
		acessarTDKPO.acessarTDK();
		
		boolean sucesso = dashboardEdi��oGr�ficoPO.Editar();
		assertTrue(sucesso, Criar);
	}
}
