package com.timp.test.MDR.TabelasApoioSped.Observa�oesdoDocumentoFiscal;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.Informa�oesAdicionais.Informa�oesAdicionaisExcluirPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.Observa�oesdoDocumentoFiscal.Observa�oesdoDocumentoFiscalExcluirPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class Obserba�oesdoDocumentoFiscalExcluir extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	Observa�oesdoDocumentoFiscalExcluirPO observa�oesdoDocumentoFiscalExcluirPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		observa�oesdoDocumentoFiscalExcluirPO = new Observa�oesdoDocumentoFiscalExcluirPO();

	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void excluir() {
		loginTC.login();
		acessarMDRPO.acessarMDR();
		boolean sucesso = observa�oesdoDocumentoFiscalExcluirPO.excluir();

		assertTrue(sucesso, Eliminado);

	}

}
