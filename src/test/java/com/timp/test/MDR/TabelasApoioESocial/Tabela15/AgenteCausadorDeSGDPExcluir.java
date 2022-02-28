package com.timp.test.MDR.TabelasApoioESocial.Tabela15;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela14.AgenteCausadorDeAcidenteExcluirPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela15.AgenteCausadorDeSGDPExcluirPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class AgenteCausadorDeSGDPExcluir extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	AgenteCausadorDeSGDPExcluirPO agenteCausadorDeSGDPExcluirPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		agenteCausadorDeSGDPExcluirPO = new AgenteCausadorDeSGDPExcluirPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void excluirr() {

		loginTC.login();
		acessarMDRPO.acessarMDR();
		boolean sucesso = agenteCausadorDeSGDPExcluirPO.excluir();
		assertTrue(sucesso, Editar);

	}

}
