package com.timp.test.BRE.CalculoDeTributos.Edicao;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRE.AcessarBREPO;
import com.sap.timp.pageObjectModel.BRE.CalculoDeTributos.Edicao.C�lculodeTributosEdi��oSimularPO;
import com.sap.timp.pageObjectModel.BRE.RegrasdeAuditoriaN2.Edicao.RegrasdeAuditoriaN2Edi��oSimularPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class C�lculodeTributosEdi��oSimular extends TestBaseSteven {
	LoginTC loginTC;
	AcessarBREPO acessarBREPO;
	C�lculodeTributosEdi��oSimularPO c�lculodeTributosEdi��oSimularPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarBREPO = new AcessarBREPO();
		c�lculodeTributosEdi��oSimularPO = new C�lculodeTributosEdi��oSimularPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void editar() {
		loginTC.login();
		acessarBREPO.acessarBRE();
		boolean sucesso = c�lculodeTributosEdi��oSimularPO.editar();
		assertTrue(sucesso, Editar);
	}
}
