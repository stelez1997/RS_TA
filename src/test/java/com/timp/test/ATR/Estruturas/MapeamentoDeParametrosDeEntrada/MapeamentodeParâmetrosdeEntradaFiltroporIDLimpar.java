package com.timp.test.ATR.Estruturas.MapeamentoDeParametrosDeEntrada;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ATR.AcessarATRPO;
import com.sap.timp.pageObjectModel.ATR.Estruturas.MapeamentoDeParametrosDeEntrada.MapeamentodePar�metrosdeEntradaFiltroporIDLimparPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class MapeamentodePar�metrosdeEntradaFiltroporIDLimpar extends TestBaseSteven {
	LoginTC loginTC;
	AcessarATRPO acessarATRPO;
	MapeamentodePar�metrosdeEntradaFiltroporIDLimparPO mapeamentodePar�metrosdeEntradaFiltroporIDLimparPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarATRPO = new AcessarATRPO();
		mapeamentodePar�metrosdeEntradaFiltroporIDLimparPO = new MapeamentodePar�metrosdeEntradaFiltroporIDLimparPO();

	}

	@AfterClass
	public void afterClass() {
		 driver.close();
	}



	@Test()
	public void filtro() {
		
		loginTC.login();
		 acessarATRPO.acessarATR();

		boolean sucesso = mapeamentodePar�metrosdeEntradaFiltroporIDLimparPO.filtro();
		assertTrue(sucesso, Filtros);
		sleep(2000);
	}

}
