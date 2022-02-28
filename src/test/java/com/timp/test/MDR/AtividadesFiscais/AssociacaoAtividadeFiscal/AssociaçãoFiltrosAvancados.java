package com.timp.test.MDR.AtividadesFiscais.AssociacaoAtividadeFiscal;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.AtividadesFiscais.AssociacaoAtividadeFiscal.Associa��oFiltrosAvancadosPO;
import com.sap.timp.pageObjectModel.MDR.AtividadesFiscais.GrupoAtividadeFiscal.GrupoAtividadeFiltrosAvancadosPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class Associa��oFiltrosAvancados extends TestBaseFernando{
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	Associa��oFiltrosAvancadosPO associa��oFiltrosAvancadosPO;
	

	@BeforeClass
	public void beforeClass() {

		driver = initializationF();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		associa��oFiltrosAvancadosPO = new Associa��oFiltrosAvancadosPO();
		
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}



	@Test()
	  public void filtrosAvanzados() {
		
		loginTC.login();

		acessarMDRPO.acessarMDR();

		
		ArrayList<Boolean> empresa = associa��oFiltrosAvancadosPO.filtroEmpresa();
		for (int i = 0; i < empresa.size(); i++) {
			assertTrue(empresa.get(i), Filtros);
		}
		
		ArrayList<Boolean> uf = associa��oFiltrosAvancadosPO.filtroUF();
		for (int i = 0; i < uf.size(); i++) {
			assertTrue(uf.get(i), Filtros);
		}
		
		ArrayList<Boolean> filial = associa��oFiltrosAvancadosPO.filtroFilial();
		for (int i = 0; i < filial.size(); i++) {
			assertTrue(filial.get(i), Filtros);
		}
		
		ArrayList<Boolean> tributo = associa��oFiltrosAvancadosPO.filtroTributo();
		for (int i = 0; i < tributo.size(); i++) {
			assertTrue(tributo.get(i), Filtros);
		}
		sleep(2000);
	  }

}
