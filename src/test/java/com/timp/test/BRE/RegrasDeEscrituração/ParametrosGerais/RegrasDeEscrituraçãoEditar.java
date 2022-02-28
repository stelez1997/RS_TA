package com.timp.test.BRE.RegrasDeEscritura��o.ParametrosGerais;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRE.AcessarBREPO;
import com.sap.timp.pageObjectModel.BRE.RegrasDeEscritura��o.ParametrosGerais.RegrasDeEscritura��oCriarComCopiaPO;
import com.sap.timp.pageObjectModel.BRE.RegrasDeEscritura��o.ParametrosGerais.RegrasDeEscritura��oCriarMasCaminhoPO;
import com.sap.timp.pageObjectModel.BRE.RegrasDeEscritura��o.ParametrosGerais.RegrasDeEscritura��oEditarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class RegrasDeEscritura��oEditar extends TestBaseSteven{
	LoginTC loginTC;
	AcessarBREPO acessarBREPO;
	RegrasDeEscritura��oEditarPO regrasDeEscritura��oEditarPO;
	
	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarBREPO = new AcessarBREPO();
		regrasDeEscritura��oEditarPO = new RegrasDeEscritura��oEditarPO();
	}

	@AfterClass
	public void afterClass() {
		//driver.close();
	}


	@Test()
	public void editar() {
		
		loginTC.login();
		
		acessarBREPO.acessarBRE();
		
		ArrayList<Boolean> sucesso = regrasDeEscritura��oEditarPO.editar();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), editado);
		}
		
		
	}
}
