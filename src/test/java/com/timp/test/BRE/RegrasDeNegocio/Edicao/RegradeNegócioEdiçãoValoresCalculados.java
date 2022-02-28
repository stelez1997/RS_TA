package com.timp.test.BRE.RegrasDeNegocio.Edicao;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRE.AcessarBREPO;
import com.sap.timp.pageObjectModel.BRE.CalculoDeTributos.Edicao.C�lculodeTributosValoresCalculadosPO;
import com.sap.timp.pageObjectModel.BRE.RegrasDeNegocio.Edicao.RegradeNeg�cioEdi��oValoresCalculadosPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class RegradeNeg�cioEdi��oValoresCalculados extends TestBaseSteven {

	LoginTC loginTC;
	AcessarBREPO acessarBREPO;
	RegradeNeg�cioEdi��oValoresCalculadosPO regradeNeg�cioEdi��oValoresCalculadosPO;
	
@BeforeClass
public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarBREPO = new AcessarBREPO();
		regradeNeg�cioEdi��oValoresCalculadosPO = new RegradeNeg�cioEdi��oValoresCalculadosPO();
}


@AfterClass
public void afterClass() {
	driver.close();
}

	@Test()
	public void editar() {
		
		loginTC.login();
		acessarBREPO.acessarBRE();

		boolean sucesso = regradeNeg�cioEdi��oValoresCalculadosPO.editar();
		assertTrue(sucesso, Editar);


	}


}
