package com.timp.test.BRE.RegrasdeAuditoriaN2.ParametrosGerais;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRE.AcessarBREPO;
import com.sap.timp.pageObjectModel.BRE.RegrasdeAuditoriaN2.ParametrosGerais.RegrasDeAuditoriaN2CriarCaminhosPO;
import com.sap.timp.pageObjectModel.BRE.RegrasdeAuditoriaN2.ParametrosGerais.RegrasdeAuditoriaN2LixeiraExcluirdefinitivamentePO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class RegrasdeAuditoriaN2LixeiraExcluirdefinitivamente extends TestBaseSteven {
	LoginTC loginTC;
	AcessarBREPO acessarBREPO;
	RegrasdeAuditoriaN2LixeiraExcluirdefinitivamentePO regrasdeAuditoriaN2LixeiraExcluirdefinitivamentePO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarBREPO = new AcessarBREPO();
		regrasdeAuditoriaN2LixeiraExcluirdefinitivamentePO = new RegrasdeAuditoriaN2LixeiraExcluirdefinitivamentePO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}



	@Test()
	public void lexeira() {
		loginTC.login();
		acessarBREPO.acessarBRE();
		boolean sucesso = regrasdeAuditoriaN2LixeiraExcluirdefinitivamentePO.lexeira();
		assertTrue(sucesso, Criar);
		sleep(3000);
		boolean sucesso1 = regrasdeAuditoriaN2LixeiraExcluirdefinitivamentePO.excluirDefinitivo();
		assertTrue(sucesso1, Criar);

	}

}
