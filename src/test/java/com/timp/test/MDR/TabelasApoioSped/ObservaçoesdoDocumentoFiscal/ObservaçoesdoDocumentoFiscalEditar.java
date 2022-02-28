package com.timp.test.MDR.TabelasApoioSped.Observa�oesdoDocumentoFiscal;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.Observa�oesdoDocumentoFiscal.Observa�oesdoDocumentoFiscalEditarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class Observa�oesdoDocumentoFiscalEditar extends TestBaseMassiel {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	Observa�oesdoDocumentoFiscalEditarPO observa�oesdoDocumentoFiscalEditarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationM(); 
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		observa�oesdoDocumentoFiscalEditarPO = new Observa�oesdoDocumentoFiscalEditarPO();
	}

	@AfterClass
	public void afterClass() {
		//driver.close();
	}

	@Test()
	public void editar() {
		loginTC.login();
		acessarMDRPO.acessarMDR();
		// observa�oesdoDocumentoFiscalEditarPO.editar();
		boolean sucesso = observa�oesdoDocumentoFiscalEditarPO.editar();

		assertTrue(sucesso, Editar);

	}

}
