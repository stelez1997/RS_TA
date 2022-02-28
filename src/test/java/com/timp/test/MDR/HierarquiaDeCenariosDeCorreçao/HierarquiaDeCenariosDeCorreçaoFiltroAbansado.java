package com.timp.test.MDR.HierarquiaDeCenariosDeCorre�ao;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.HierarquiaDeCenariosDeCorre�ao.HierarquiaDeCenariosDeCorre�aoFiltrosAbansadosPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class HierarquiaDeCenariosDeCorre�aoFiltroAbansado extends TestBaseMassiel {

	LoginTC loginTC;
	AcessarMDRPO accesarMDRPO;
	HierarquiaDeCenariosDeCorre�aoFiltrosAbansadosPO hierarquiaDeCenariosDeCorre�aoFiltrosAbansadosPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationM();
		accesarMDRPO = new AcessarMDRPO();
		loginTC = new LoginTC();
		hierarquiaDeCenariosDeCorre�aoFiltrosAbansadosPO = new HierarquiaDeCenariosDeCorre�aoFiltrosAbansadosPO();
	}

	@AfterClass
	public void afterClass() {
		//driver.close();
	}

	@Test()
	public void Filtro() {

		loginTC.login();

		accesarMDRPO.acessarMDR();

		ArrayList<Boolean> tributo = hierarquiaDeCenariosDeCorre�aoFiltrosAbansadosPO.filtroTributo();
		for (int i = 0; i < tributo.size(); i++) {
			assertTrue(tributo.get(i), Filtros);
		}

		ArrayList<Boolean> usuarioCriacao = hierarquiaDeCenariosDeCorre�aoFiltrosAbansadosPO.filtroUsuarioCriacao();
		for (int i = 0; i < usuarioCriacao.size(); i++) {
			assertTrue(usuarioCriacao.get(i), Filtros);
		}

		ArrayList<Boolean> dataCriacao = hierarquiaDeCenariosDeCorre�aoFiltrosAbansadosPO.filtroDataCriacao();
		for (int i = 0; i < dataCriacao.size(); i++) {
			assertTrue(dataCriacao.get(i), Filtros);
		}

		ArrayList<Boolean> usuarioModificado = hierarquiaDeCenariosDeCorre�aoFiltrosAbansadosPO
				.filtroUsuarioModificado();
		for (int i = 0; i < usuarioModificado.size(); i++) {
			assertTrue(usuarioModificado.get(i), Filtros);
		}

		ArrayList<Boolean> dataModificado = hierarquiaDeCenariosDeCorre�aoFiltrosAbansadosPO.filtroDataModificado();
		for (int i = 0; i < dataModificado.size(); i++) {
			assertTrue(dataModificado.get(i), Filtros);
		}

	}

}
