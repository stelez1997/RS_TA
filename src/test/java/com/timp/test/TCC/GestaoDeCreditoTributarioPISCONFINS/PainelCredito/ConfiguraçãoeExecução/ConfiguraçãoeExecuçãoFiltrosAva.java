package com.timp.test.TCC.GestaoDeCreditoTributarioPISCONFINS.PainelCredito.Configura��oeExecu��o;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TCC.AcessarTCCPO;
import com.sap.timp.pageObjectModel.TCC.BancoDeCreditoExtemporaneo.ConfiguracaoEExecucao.ConfiguracaoEExecucaoFiltrosAvan�adosPO;
import com.sap.timp.pageObjectModel.TCC.GestaoDeCreditoTributarioPISCONFINS.PainelCredito.Configura��oeExecu��o.Configura��oeExecu��oFiltrosAvaPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class Configura��oeExecu��oFiltrosAva extends TestBaseSteven {
	LoginTC loginTC;
	AcessarTCCPO acessarTCCPO;
	Configura��oeExecu��oFiltrosAvaPO configura��oeExecu��oFiltrosAvaPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarTCCPO = new AcessarTCCPO();
		configura��oeExecu��oFiltrosAvaPO = new Configura��oeExecu��oFiltrosAvaPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}


	@Test()
	public void Filtro() {
		loginTC.login();
		acessarTCCPO.acessarTCC();
		
		ArrayList<Boolean> Nome = configura��oeExecu��oFiltrosAvaPO.filtros();
		for (int i = 0; i < Nome.size(); i++) {
			assertTrue(Nome.get(i), Filtros);
		}

	}

}
