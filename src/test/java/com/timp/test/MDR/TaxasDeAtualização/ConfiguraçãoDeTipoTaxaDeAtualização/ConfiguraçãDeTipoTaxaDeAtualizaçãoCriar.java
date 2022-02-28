package com.timp.test.MDR.TaxasDeAtualiza��o.Configura��oDeTipoTaxaDeAtualiza��o;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TaxasDeAtualiza��o.Configura��oDeTipoTaxaDeAtualiza��o.Configura��DeTipoTaxaDeAtualiza��oCriarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class Configura��DeTipoTaxaDeAtualiza��oCriar extends TestBaseMassiel {
	LoginTC loginTC;
	AcessarMDRPO acesarMDRPO;
	Configura��DeTipoTaxaDeAtualiza��oCriarPO configura��DeTipoTaxaDeAtualiza��oCriarPO;

	public Configura��DeTipoTaxaDeAtualiza��oCriar() {
		super();
	}

	@BeforeClass
	public void beforeClass() {
		driver = initializationM();
		loginTC = new LoginTC();
		acesarMDRPO = new AcessarMDRPO();
		configura��DeTipoTaxaDeAtualiza��oCriarPO = new Configura��DeTipoTaxaDeAtualiza��oCriarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void criar() {
		loginTC.login();
		acesarMDRPO.acessarMDR();
		boolean sucesso = configura��DeTipoTaxaDeAtualiza��oCriarPO.criar();
		assertTrue(sucesso, Criar);
	}
}
