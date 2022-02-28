package com.timp.test.MDR.EventosESocial.S1250AquisicaoDeProducaoRural.S1250Aquisi��o;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.EventosESocial.S1250AquisicaoDeProducaoRural.S1250Aquisi��o.S1250Aquisi��oEditarPO;
import com.sap.timp.pageObjectModel.MDR.EventosESocial.S1250AquisicaoDeProducaoRural.S1250DadosdeEvento.S1250DadosdeEventoEditarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class S1250Aquisi��oEditar extends TestBaseSteven{

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	S1250Aquisi��oEditarPO s1250Aquisi��oEditarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		s1250Aquisi��oEditarPO = new S1250Aquisi��oEditarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}



	@Test()
	public void editar() {
		
		loginTC.login();
		acessarMDRPO.acessarMDR();

		boolean sucesso = s1250Aquisi��oEditarPO.editar();

		assertTrue(sucesso, Editar);

	}
}
