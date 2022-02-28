package com.timp.test.MDR.EventosESocial.S1250AquisicaoDeProducaoRural.S1250DetAquisi��o;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.EventosESocial.S1250AquisicaoDeProducaoRural.S1250Aquisi��o.S1250Aquisi��oExcluirPO;
import com.sap.timp.pageObjectModel.MDR.EventosESocial.S1250AquisicaoDeProducaoRural.S1250DetAquisi��o.S1250DetAquisi��oExcluirPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class S1250DetAquisi��oExcluir extends TestBaseSteven {
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	S1250DetAquisi��oExcluirPO s1250DetAquisi��oExcluirPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		s1250DetAquisi��oExcluirPO = new S1250DetAquisi��oExcluirPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	
	@Test()
	public void excluir() {
		
		loginTC.login();
		
		acessarMDRPO.acessarMDR();

		boolean sucesso = s1250DetAquisi��oExcluirPO.excluir();
		assertTrue(sucesso, Eliminado);

	}

}
