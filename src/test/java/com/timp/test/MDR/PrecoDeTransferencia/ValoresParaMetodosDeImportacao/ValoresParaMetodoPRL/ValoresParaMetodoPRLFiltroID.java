package com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodosDeImportacao.ValoresParaMetodoPRL;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.PrecoDeTransferencia.ValoresParaMetodosDeImportacao.ValoresParaMetodoPRL.ValoresParaMetodoPRLFiltroIDPO;

public class  ValoresParaMetodoPRLFiltroID extends TestBaseSteven{
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	ValoresParaMetodoPRLFiltroIDPO valoresParaMetodoPRLFiltroIDPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		valoresParaMetodoPRLFiltroIDPO = new ValoresParaMetodoPRLFiltroIDPO();

	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void filtro() {
		loginTC.login();
		acessarMDRPO.acessarMDR();
		
		ArrayList<Boolean> sucesso = valoresParaMetodoPRLFiltroIDPO.filtro();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Filtros);
		}

	}
}
