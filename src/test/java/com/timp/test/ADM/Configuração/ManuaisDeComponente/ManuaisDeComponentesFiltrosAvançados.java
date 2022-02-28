package com.timp.test.ADM.Configura��o.ManuaisDeComponente;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.AcessarADMPO;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ADM.Configura��o.ManuaisDeComponente.ManuaisDeComponentesFiltrosAvan�adosPO;
import com.sap.timp.pageObjectModel.TDK.AcessarTDKPO;
import com.sap.timp.pageObjectModel.TDK.Execucoes.ExecucoesPublicas.ExecucoesExecucoesPublicasFiltrosAvaPO;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class ManuaisDeComponentesFiltrosAvan�ados extends TestBaseSteven {
	LoginTC loginTC;
	AcessarADMPO acessarADMPO;
	ManuaisDeComponentesFiltrosAvan�adosPO manuaisDeComponentesFiltrosAvan�adosPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarADMPO = new AcessarADMPO();
		manuaisDeComponentesFiltrosAvan�adosPO = new ManuaisDeComponentesFiltrosAvan�adosPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
		
	}


	@Test()
	public void filtros() {
		loginTC.login();
		acessarADMPO.acessarADM();
		// codigoTipoCreditoFiltrosAvan�adosPO.filtros();

		ArrayList<Boolean> sucesso = manuaisDeComponentesFiltrosAvan�adosPO.detalhes();
		sleep(2000);
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), "The results in the filter aren't equal");
		}
		sleep(2000);
	}
}
