package com.timp.test.MDR.TaxasDeAtualiza��o.Configura��oDeTipoTaxaDeAtualiza��o;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TaxasDeAtualiza��o.Configura��oDeTipoTaxaDeAtualiza��o.Configura��DeTipoTaxaDeAtualiza��oExcluirPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class Configura��DeTipoTaxaDeAtualiza��oExcluir extends TestBaseFernando {
	LoginTC loginTC;
	AcessarMDRPO acesarMDRPO;
	Configura��DeTipoTaxaDeAtualiza��oExcluirPO configura��DeTipoTaxaDeAtualiza��oExcluirPO;

	public Configura��DeTipoTaxaDeAtualiza��oExcluir() {
		super();
	}

	@BeforeClass
	public void beforeClass() {
		driver = initializationF();
		loginTC = new LoginTC();
		acesarMDRPO = new AcessarMDRPO();
		configura��DeTipoTaxaDeAtualiza��oExcluirPO = new Configura��DeTipoTaxaDeAtualiza��oExcluirPO();
	}

	@AfterClass
	public void afterClass() {
	}

	@Test()
	public void excluir() {
		loginTC.login();
		acesarMDRPO.acessarMDR();
		boolean sucesso = configura��DeTipoTaxaDeAtualiza��oExcluirPO.excluir();
		assertTrue(sucesso, Eliminado);
	}
}
