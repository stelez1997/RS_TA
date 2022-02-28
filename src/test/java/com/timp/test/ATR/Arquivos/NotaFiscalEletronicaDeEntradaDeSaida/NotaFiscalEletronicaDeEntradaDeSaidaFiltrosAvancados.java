package com.timp.test.ATR.Arquivos.NotaFiscalEletronicaDeEntradaDeSaida;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ATR.AcessarATRPO;
import com.sap.timp.pageObjectModel.ATR.Arquivos.NotaFiscalEletronicaDeEntradaDeSaida.NotaFiscalEletronicaDeEntradaDeSaidaFiltrosAvan�adosPO;

public class NotaFiscalEletronicaDeEntradaDeSaidaFiltrosAvancados extends TestBaseSteven {
	
	LoginTC loginTC;
	AcessarATRPO acessarATRPO;
	NotaFiscalEletronicaDeEntradaDeSaidaFiltrosAvan�adosPO notaFiscalEletronicaDeEntradaDeSaidaFiltrosAvan�adosPO;
	
	@BeforeClass
	  public void beforeClass() {
		  
		  driver = initialization();
		  loginTC = new LoginTC();
		  acessarATRPO = new AcessarATRPO();
		  notaFiscalEletronicaDeEntradaDeSaidaFiltrosAvan�adosPO = new  NotaFiscalEletronicaDeEntradaDeSaidaFiltrosAvan�adosPO();
	  }

	  @AfterClass
	  public void afterClass() {
		  driver.close();
	  }
	  

	 	@Test()
	 	public void filtroAvansado() {
	 		
	 		loginTC.login();
	 		
	 		 acessarATRPO.acessarATR();
	 		 
	 		
	 		ArrayList<Boolean> sucesso = notaFiscalEletronicaDeEntradaDeSaidaFiltrosAvan�adosPO.filtro();
			for (int i = 0; i < sucesso.size(); i++) {
				assertTrue(sucesso.get(i), Filtros);
			}
	 		
			sleep(3000);
	 		
	 	}
   
	
}
