package com.timp.test.MDR.TaxasDeAtualiza��o.Configura��oDeTipoTaxaDeAtualiza��o;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TaxasDeAtualiza��o.Configura��oDeTipoTaxaDeAtualiza��o.Configura��oDeTipoTaxaDeAtualiza��oVisualizarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

@Test
public class Configura��oDeTipoTaxaDeAtualiza��oVisualizar extends TestBaseMassiel {

	LoginTC loginTC;
	AcessarMDRPO acesarMDRPO;
	Configura��oDeTipoTaxaDeAtualiza��oVisualizarPO configura��oDeTipoTaxaDeAtualiza��oVisualizarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationM();
		loginTC = new LoginTC();
		acesarMDRPO = new AcessarMDRPO();
		configura��oDeTipoTaxaDeAtualiza��oVisualizarPO = new Configura��oDeTipoTaxaDeAtualiza��oVisualizarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void visualizar() {
		loginTC.login();
		acesarMDRPO.acessarMDR();
		ArrayList<Boolean> sucesso = configura��oDeTipoTaxaDeAtualiza��oVisualizarPO.Visualizar();
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualiza�ar);
		}

	}

}
