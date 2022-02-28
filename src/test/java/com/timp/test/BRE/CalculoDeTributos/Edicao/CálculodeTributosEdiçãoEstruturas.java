package com.timp.test.BRE.CalculoDeTributos.Edicao;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRE.AcessarBREPO;
import com.sap.timp.pageObjectModel.BRE.CalculoDeTributos.Edicao.C�lculodeTributosEdi��oEstruturasPO;
import com.sap.timp.pageObjectModel.BRE.RegrasdeAuditoriaN2.Edicao.RegrasdeAuditoriaN2Edi��oTabelasPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class C�lculodeTributosEdi��oEstruturas extends TestBaseSteven {
	LoginTC loginTC;
	AcessarBREPO acessarBREPO;
	C�lculodeTributosEdi��oEstruturasPO c�lculodeTributosEdi��oEstruturasPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarBREPO = new AcessarBREPO();
		c�lculodeTributosEdi��oEstruturasPO = new C�lculodeTributosEdi��oEstruturasPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void editar() {
		loginTC.login();
		acessarBREPO.acessarBRE();
		boolean sucesso = c�lculodeTributosEdi��oEstruturasPO.editar();
		assertTrue(sucesso, Editar);
	}
}
