package com.sap.timp.pageObjectModel.TCC.GestaoDeCreditoTributarioPISCONFINS.ApuracaoDeCreditoTributarioPIS.ConfiguracaoEExecucao.RegistroM105;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class RegistroM105VisualizarPO extends TestBaseMassiel{
	@FindBy(xpath = "//span[text()=\"Gest�o de Cr�dito Tribut�rio PIS/COFINS\"]")
	public WebElement gestaoCredito;
	
	@FindBy(xpath = "//span[text()=\"Apura��o de Cr�dito Tribut�rio PIS\"]")
	public WebElement apura��oCr�dito;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-pisCalculationConfiguration\"]")
	public WebElement configuracaoEExecucao;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-registerM105\"]")
	public WebElement registroM105;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//div[@id=\"company\"]/div/div[1]/div[1]/input")
	public WebElement empresa;
	
	@FindBy(xpath = "//div[@id=\"uf\"]/div/div[1]/div[1]/div[1]")
	public WebElement uf;
	
	@FindBy(xpath = "//div[@id=\"branch\"]/div/div[1]/div[1]/div[1]")
	public WebElement filial;
	
	@FindBy(xpath = "//div[@id=\"natBcCred\"]/div[1]/div[1]/input")
	public WebElement C�digoBaseC�lculoCr�ditoApuradoPer�odo;
	
	@FindBy(xpath = "//div[@id=\"cstPis\"]/div/div/input")
	public WebElement C�digoSitua��oTribut�riaReferenteAOPIS;
	
	@FindBy(xpath = "//div[@id=\"vlBcPisTot\"]/div[1]/div[1]/input")
	public WebElement ValorTotalBaseC�lculoEscrituradaDocumentosOpera��es;
	
	@FindBy(xpath = "//div[@id=\"vlBcPisCum\"]/div[1]/div[1]/input")
	public WebElement ParcelaValorTotalBaseC�lculoInformada;
	
	@FindBy(xpath = "//div[@id=\"vlBcPisNc\"]/div[1]/div[1]/input")
	public WebElement ValorTotalBaseC�lculoCr�ditoVinculadaReceitasIncid�nciaCumulativa;
	
	@FindBy(xpath = "//div[@id=\"vlBcPis\"]/div[1]/div[1]/input")
	public WebElement ValorBaseC�lculoCr�ditoVinculadaTipoCreditoEscrituraM500;
	
	@FindBy(xpath = "//div[@id=\"quantBcPisTot\"]/div[1]/div[1]/input")
	public WebElement QuantidadeTotalBaseC�lculoCr�ditoApuradoUnidadeMedidaProduto;
	
	@FindBy(xpath = "//div[@id=\"quantBcPis\"]/div[1]/div[1]/input")
	public WebElement ParcelaBaseC�lculoCr�ditoQuantidadeVinculadaTipoCr�ditoEscrituradoM500;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//button[text()=\"N�o\"]")
	public WebElement no;
	
	public RegistroM105VisualizarPO() {

		PageFactory.initElements(driver, this);
	}

	public ArrayList<Boolean> Visualizar() {
		
		String url = driver.getCurrentUrl();

		boolean tp1  = false;
		boolean tc2  = false;
		boolean tq1  = false;

		if (url.contains("tq1")) {
			tq1 = true;
		}else if(url.contains("tc2")){
			tc2 = true;
		}else if(url.contains("tp1")){
			tp1 = true;
		}
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		gestaoCredito.click();
		sleep(2000);
		apura��oCr�dito.click();
		sleep(2000);
		configuracaoEExecucao.click();
		sleep(2000);
		registroM105.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();
		sleep(2000);
		
		String idRegistro = idObter("Apura��odeCr�ditoTribut�rioPISRegistroM105");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement visualizar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"visualizar\"]"));

		menu.click();
		sleep(1000);
		visualizar.click();
		sleep(19000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		//waitExpectElement(filial);
		sleep(2000);
		
		String empresavisualizar = empresa.getAttribute("value");
		String ufvisualizar = uf.getText();
		String filialvisualizar = filial.getText();
		String C�digoBaseC�lculoCr�ditoApuradoPer�odovisualizar = C�digoBaseC�lculoCr�ditoApuradoPer�odo.getAttribute("value");
		String C�digoSitua��oTribut�riaReferenteAOPISvisualizar = C�digoSitua��oTribut�riaReferenteAOPIS.getAttribute("value");
		String ValorTotalBaseC�lculoEscrituradaDocumentosOpera��esvisualizar = ValorTotalBaseC�lculoEscrituradaDocumentosOpera��es.getAttribute("value");
		String ParcelaValorTotalBaseC�lculoInformadavisualizar = ParcelaValorTotalBaseC�lculoInformada.getAttribute("value");
		String ValorTotalBaseC�lculoCr�ditoVinculadaReceitasIncid�nciaCumulativavisualizar = ValorTotalBaseC�lculoCr�ditoVinculadaReceitasIncid�nciaCumulativa.getAttribute("value");
		String ValorBaseC�lculoCr�ditoVinculadaTipoCreditoEscrituraM500visualizar = ValorBaseC�lculoCr�ditoVinculadaTipoCreditoEscrituraM500.getAttribute("value");
		String QuantidadeTotalBaseC�lculoCr�ditoApuradoUnidadeMedidaProdutovisualizar = QuantidadeTotalBaseC�lculoCr�ditoApuradoUnidadeMedidaProduto.getAttribute("value");
		String ParcelaBaseC�lculoCr�ditoQuantidadeVinculadaTipoCr�ditoEscrituradoM500visualizar = ParcelaBaseC�lculoCr�ditoQuantidadeVinculadaTipoCr�ditoEscrituradoM500.getAttribute("value");
		
		System.out.println(empresavisualizar);
		System.out.println(ufvisualizar);
		System.out.println(filialvisualizar);
		System.out.println(C�digoBaseC�lculoCr�ditoApuradoPer�odovisualizar);
		System.out.println(C�digoSitua��oTribut�riaReferenteAOPISvisualizar);
		System.out.println(ValorTotalBaseC�lculoEscrituradaDocumentosOpera��esvisualizar);
		System.out.println(ParcelaValorTotalBaseC�lculoInformadavisualizar);
		System.out.println(ValorTotalBaseC�lculoCr�ditoVinculadaReceitasIncid�nciaCumulativavisualizar);
		System.out.println(ValorBaseC�lculoCr�ditoVinculadaTipoCreditoEscrituraM500visualizar);
		System.out.println(QuantidadeTotalBaseC�lculoCr�ditoApuradoUnidadeMedidaProdutovisualizar);
		System.out.println(ParcelaBaseC�lculoCr�ditoQuantidadeVinculadaTipoCr�ditoEscrituradoM500visualizar);
		
		biblioteca.click();
		sleep(4000);
		
		no.click();
		sleep(8000);
			
	
		sleep(4000);
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));

		menu1.click();
		sleep(1000);
		editar.click();
		sleep(26000);
		
		sleep(4000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(filial);
		sleep(2000);
		
		String empresaEditar = empresa.getAttribute("value");
		String ufEditar = uf.getText();
		String filialEditar = filial.getText();
		String C�digoBaseC�lculoCr�ditoApuradoPer�odoEditar = C�digoBaseC�lculoCr�ditoApuradoPer�odo.getAttribute("value");
		String C�digoSitua��oTribut�riaReferenteAOPISEditar= C�digoSitua��oTribut�riaReferenteAOPIS.getAttribute("value");
		String ValorTotalBaseC�lculoEscrituradaDocumentosOpera��esEditar = ValorTotalBaseC�lculoEscrituradaDocumentosOpera��es.getAttribute("value");
		String ParcelaValorTotalBaseC�lculoInformadaEditar = ParcelaValorTotalBaseC�lculoInformada.getAttribute("value");
		String ValorTotalBaseC�lculoCr�ditoVinculadaReceitasIncid�nciaCumulativaEditar = ValorTotalBaseC�lculoCr�ditoVinculadaReceitasIncid�nciaCumulativa.getAttribute("value");
		String ValorBaseC�lculoCr�ditoVinculadaTipoCreditoEscrituraM500Editar = ValorBaseC�lculoCr�ditoVinculadaTipoCreditoEscrituraM500.getAttribute("value");
		String QuantidadeTotalBaseC�lculoCr�ditoApuradoUnidadeMedidaProdutoEditar = QuantidadeTotalBaseC�lculoCr�ditoApuradoUnidadeMedidaProduto.getAttribute("value");
		String ParcelaBaseC�lculoCr�ditoQuantidadeVinculadaTipoCr�ditoEscrituradoM500Editar = ParcelaBaseC�lculoCr�ditoQuantidadeVinculadaTipoCr�ditoEscrituradoM500.getAttribute("value");
		
		System.out.println("------------------------------");
		
		System.out.println(empresaEditar);
		System.out.println(ufEditar);
		System.out.println(filialEditar);
		System.out.println(C�digoBaseC�lculoCr�ditoApuradoPer�odoEditar);
		System.out.println(C�digoSitua��oTribut�riaReferenteAOPISEditar);
		System.out.println(ValorTotalBaseC�lculoEscrituradaDocumentosOpera��esEditar);
		System.out.println(ParcelaValorTotalBaseC�lculoInformadaEditar);
		System.out.println(ValorTotalBaseC�lculoCr�ditoVinculadaReceitasIncid�nciaCumulativaEditar);
		System.out.println(ValorBaseC�lculoCr�ditoVinculadaTipoCreditoEscrituraM500Editar);
		System.out.println(QuantidadeTotalBaseC�lculoCr�ditoApuradoUnidadeMedidaProdutoEditar);
		System.out.println(ParcelaBaseC�lculoCr�ditoQuantidadeVinculadaTipoCr�ditoEscrituradoM500Editar);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		sucesso.add(empresaEditar.contains(empresavisualizar));
		sucesso.add(ufEditar.contains(ufvisualizar));
		sucesso.add(filialEditar.contains(filialvisualizar));
		sucesso.add(C�digoBaseC�lculoCr�ditoApuradoPer�odoEditar.contains(C�digoBaseC�lculoCr�ditoApuradoPer�odovisualizar));
		sucesso.add(C�digoSitua��oTribut�riaReferenteAOPISEditar.contains(C�digoSitua��oTribut�riaReferenteAOPISvisualizar));
		sucesso.add(ValorTotalBaseC�lculoEscrituradaDocumentosOpera��esEditar.contains(ValorTotalBaseC�lculoEscrituradaDocumentosOpera��esvisualizar));
		sucesso.add(ParcelaValorTotalBaseC�lculoInformadaEditar.contains(ParcelaValorTotalBaseC�lculoInformadavisualizar));
		sucesso.add(ValorTotalBaseC�lculoCr�ditoVinculadaReceitasIncid�nciaCumulativaEditar.contains(ValorTotalBaseC�lculoCr�ditoVinculadaReceitasIncid�nciaCumulativavisualizar));
		sucesso.add(ValorBaseC�lculoCr�ditoVinculadaTipoCreditoEscrituraM500Editar.contains(ValorBaseC�lculoCr�ditoVinculadaTipoCreditoEscrituraM500visualizar));
		sucesso.add(QuantidadeTotalBaseC�lculoCr�ditoApuradoUnidadeMedidaProdutoEditar.contains(QuantidadeTotalBaseC�lculoCr�ditoApuradoUnidadeMedidaProdutovisualizar));
		sucesso.add(ParcelaBaseC�lculoCr�ditoQuantidadeVinculadaTipoCr�ditoEscrituradoM500Editar.contains(ParcelaBaseC�lculoCr�ditoQuantidadeVinculadaTipoCr�ditoEscrituradoM500visualizar));
		System.out.println(sucesso);
		
		return sucesso;
	}
}
