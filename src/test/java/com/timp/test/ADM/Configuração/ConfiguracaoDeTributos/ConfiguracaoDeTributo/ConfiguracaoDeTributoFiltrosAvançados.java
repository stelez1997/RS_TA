package com.timp.test.ADM.Configura��o.ConfiguracaoDeTributos.ConfiguracaoDeTributo;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.AcessarADMPO;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ADM.Configura��o.ConfiguracaoDeTributos.ConfiguracaoDeTributo.ConfiguracaoDeTributosFiltrosAvan�adosPO;

public class ConfiguracaoDeTributoFiltrosAvan�ados extends TestBaseSteven{
	LoginTC loginTC;
	AcessarADMPO acessarADMPO;
	ConfiguracaoDeTributosFiltrosAvan�adosPO configuracaoDeTributosFiltrosAvan�adosPO;
	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarADMPO = new AcessarADMPO();
		configuracaoDeTributosFiltrosAvan�adosPO = new ConfiguracaoDeTributosFiltrosAvan�adosPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}
	

	@Test()
	public void filtro() {
		loginTC.login();
		acessarADMPO.acessarADM();

		ArrayList<Boolean> sucesso = configuracaoDeTributosFiltrosAvan�adosPO.filtro();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Filtros);
		}		
		
		sleep(2000);

	}	
}
