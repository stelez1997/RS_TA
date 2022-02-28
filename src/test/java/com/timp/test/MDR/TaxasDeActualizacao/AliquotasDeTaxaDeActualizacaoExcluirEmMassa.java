package com.timp.test.MDR.TaxasDeActualizacao;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TaxasDeActualizacao.AliquotasDeTaxaDeActualizacaoExcluirEmMassaPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class AliquotasDeTaxaDeActualizacaoExcluirEmMassa extends TestBaseKenssy {
	LoginTC loginTC;
	AcessarMDRPO accesarMDR;
	AliquotasDeTaxaDeActualizacaoExcluirEmMassaPO aliquotaDeTaxaDeActualizacaoExcluirEmMassaPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationKen();
		loginTC = new LoginTC();
		accesarMDR = new AcessarMDRPO();
		aliquotaDeTaxaDeActualizacaoExcluirEmMassaPO = new AliquotasDeTaxaDeActualizacaoExcluirEmMassaPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test(priority = 0)
	public void ingresar() {
		loginTC.login();
	}

	@Test(priority = 1)
	public void mdrEntrar() {
		accesarMDR.acessarMDR();

	}

	@Test(priority = 2)
	public void excluirEmMassa() {
		boolean sucesso = aliquotaDeTaxaDeActualizacaoExcluirEmMassaPO.criar();
		assertTrue(sucesso, Criar);
		sleep(1000);

		boolean sucesso2 = aliquotaDeTaxaDeActualizacaoExcluirEmMassaPO.excluir();
		assertTrue(sucesso2, Eliminado);
	}

}
