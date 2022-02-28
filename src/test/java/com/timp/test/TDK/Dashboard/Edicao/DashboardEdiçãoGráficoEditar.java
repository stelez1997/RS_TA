package com.timp.test.TDK.Dashboard.Edicao;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TDK.AcessarTDKPO;
import com.sap.timp.pageObjectModel.TDK.Dashboard.Edicao.DashboardEdi��oGr�ficoEditarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class DashboardEdi��oGr�ficoEditar extends TestBaseMassiel {
	LoginTC loginTC;
	AcessarTDKPO acessarTDKPO;
	DashboardEdi��oGr�ficoEditarPO dashboardEdi��oGr�ficoEditarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationM();
		loginTC = new LoginTC();
		acessarTDKPO = new AcessarTDKPO();
		dashboardEdi��oGr�ficoEditarPO = new DashboardEdi��oGr�ficoEditarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void editar() {
		loginTC.login();
		acessarTDKPO.acessarTDK();
		
		boolean sucesso = dashboardEdi��oGr�ficoEditarPO.Editar();
		assertTrue(sucesso, Criar);
	}
}
