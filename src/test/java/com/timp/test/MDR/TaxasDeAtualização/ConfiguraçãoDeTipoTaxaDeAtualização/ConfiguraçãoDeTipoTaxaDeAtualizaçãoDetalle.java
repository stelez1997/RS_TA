package com.timp.test.MDR.TaxasDeAtualiza��o.Configura��oDeTipoTaxaDeAtualiza��o;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TaxasDeAtualiza��o.Configura��oDeTipoTaxaDeAtualiza��o.Configura��oDeTipoTaxaDeAtualiza��oDetallesPO;

public class Configura��oDeTipoTaxaDeAtualiza��oDetalle extends TestBaseMassiel {

	LoginTC loginTC;
	AcessarMDRPO accesarMDRPO;
	Configura��oDeTipoTaxaDeAtualiza��oDetallesPO configura��oDeTipoTaxaDeAtualiza��oDetallePO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationM();
		loginTC = new LoginTC();
		accesarMDRPO = new AcessarMDRPO();
		configura��oDeTipoTaxaDeAtualiza��oDetallePO = new Configura��oDeTipoTaxaDeAtualiza��oDetallesPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void detalle() {

		loginTC.login();
		accesarMDRPO.acessarMDR();
		ArrayList<Boolean> sucesso = configura��oDeTipoTaxaDeAtualiza��oDetallePO.Detalle();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Detalhes);
		}
	}

}
