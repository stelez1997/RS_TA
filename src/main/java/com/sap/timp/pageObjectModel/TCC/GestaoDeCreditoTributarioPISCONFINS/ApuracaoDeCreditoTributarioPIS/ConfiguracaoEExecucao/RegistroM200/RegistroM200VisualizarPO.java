package com.sap.timp.pageObjectModel.TCC.GestaoDeCreditoTributarioPISCONFINS.ApuracaoDeCreditoTributarioPIS.ConfiguracaoEExecucao.RegistroM200;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class RegistroM200VisualizarPO extends TestBaseMassiel{

	@FindBy(xpath = "//span[text()=\"Gest�o de Cr�dito Tribut�rio PIS/COFINS\"]")
	public WebElement gestaoCredito;
	
	@FindBy(xpath = "//span[text()=\"Apura��o de Cr�dito Tribut�rio PIS\"]")
	public WebElement apura��oCr�dito;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-pisCalculationConfiguration\"]")
	public WebElement configuracaoEExecucao;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-registerM200\"]")
	public WebElement registroM200;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//button[text()=\"N�o\"]")
	public WebElement no;

	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//div[@id=\"company\"]/div/div[1]/div[1]/input")
	public WebElement empresa;
	
	@FindBy(xpath = "//div[@id=\"uf\"]/div/div[1]/div[1]/div[1]")
	public WebElement uf;
	
	@FindBy(xpath = "//div[@id=\"branch\"]/div/div[1]/div[1]/div[1]")
	public WebElement filial;
	
	@FindBy(xpath = "//div[@id=\"vlTotContNcPer\"]/div[1]/div[1]/input")
	public WebElement valorTotalContribui��oN�oCumulativaPer�odo;
	
	@FindBy(xpath = "//div[@id=\"vlTotCredDesc\"]/div[1]/div[1]/input")
	public WebElement valorCr�ditoDescontadoApuradoPr�prioPer�odoEscritura��o;
	
	@FindBy(xpath = "//div[@id=\"vlTotCredDescAnt\"]/div[1]/div[1]/input")
	public WebElement valorCr�ditoDescontadoApuradoPer�odoAnteriorEscritura��o;
	
	@FindBy(xpath = "//div[@id=\"vlTotContNcDev\"]/div[1]/div[1]/input")
	public WebElement valorTotalContribui��oN�oCumulativaDevida;
	
	@FindBy(xpath = "//div[@id=\"vlRetNc\"]/div[1]/div[1]/input")
	public WebElement ValorRetidoFonteDeduzidoPer�odo;
	
	@FindBy(xpath = "//div[@id=\"vlOutDedNc\"]/div[1]/div[1]/input")
	public WebElement outrasDedu��esPer�odo;
	
	@FindBy(xpath = "//div[@id=\"vlContNcRec\"]/div[1]/div[1]/input")
	public WebElement valorContribui��oCumulativaRecolherPagar;
	
	@FindBy(xpath = "//div[@id=\"vlTotContCumPer\"]/div[1]/div[1]/input")
	public WebElement valorTotalContribui��oCumulativaPer�odo;
	
	@FindBy(xpath = "//div[@id=\"vlRetCum\"]/div[1]/div[1]/input")
	public WebElement valorRetidoFonteDeduzidoPer�odo;
	
	@FindBy(xpath = "//div[@id=\"vlOutDedCum\"]/div[1]/div[1]/input")
	public WebElement outraDedu��esPer�odo;
	
	@FindBy(xpath = "//div[@id=\"vlContCumRec\"]/div[1]/div[1]/input")
	public WebElement valordaContribui��oCumulativaRecolherPagar;
	
	@FindBy(xpath = "//div[@id=\"vlTotContRec\"]/div[1]/div[1]/input")
	public WebElement valorTotalContribui��oRecolherPagarPer�odo;
	
	public RegistroM200VisualizarPO() {

		PageFactory.initElements(driver, this);
	}

	public ArrayList<Boolean> visualizar() {
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		gestaoCredito.click();
		sleep(2000);
		apura��oCr�dito.click();
		sleep(2000);
		configuracaoEExecucao.click();
		sleep(2000);
		registroM200.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();
		sleep(2000);
		
		String idRegistro = idObter("Apura��odeCr�ditoTribut�rioPISRegistroM200");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement visualizar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"visualizar\"]"));

		menu.click();
		sleep(1000);
		visualizar.click();
		sleep(6000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(filial);
		sleep(2000);
		
		String empresavisualizar = empresa.getAttribute("value");
		String ufvisualizar = uf.getText();
		String filialvisualizar = filial.getText();
		String valorTotalContribui��oN�oCumulativaPer�odovisualizar = valorTotalContribui��oN�oCumulativaPer�odo.getAttribute("value");
		String valorCr�ditoDescontadoApuradoPr�prioPer�odoEscritura��ovisualizar = valorCr�ditoDescontadoApuradoPr�prioPer�odoEscritura��o.getAttribute("value");
		String valorCr�ditoDescontadoApuradoPer�odoAnteriorEscritura��ovisualizar = valorCr�ditoDescontadoApuradoPer�odoAnteriorEscritura��o.getAttribute("value");
		String valorTotalContribui��oN�oCumulativaDevidavisualizar = valorTotalContribui��oN�oCumulativaDevida.getAttribute("value");
		String ValorRetidoFonteDeduzidoPer�odovisualizar = ValorRetidoFonteDeduzidoPer�odo.getAttribute("value");
		String outrasDedu��esPer�odovisualizar = outrasDedu��esPer�odo.getAttribute("value");
		String valorContribui��oCumulativaRecolherPagarvisualizar = valorContribui��oCumulativaRecolherPagar.getAttribute("value");
		String valorTotalContribui��oCumulativaPer�odovisualizar = valorTotalContribui��oCumulativaPer�odo.getAttribute("value");
		String valorRetidoFonteDeduzidoPer�odovisualizar = 	valorRetidoFonteDeduzidoPer�odo.getAttribute("value");
		String OutraDedu��esPer�odovisualizar = outraDedu��esPer�odo.getAttribute("value");
		String valordaContribui��oCumulativaRecolherPagarvisualizar = valordaContribui��oCumulativaRecolherPagar.getAttribute("value");
		String valorTotalContribui��oRecolherPagarPer�odovisualizar = valorTotalContribui��oRecolherPagarPer�odo.getAttribute("value");
		
		System.out.println(empresavisualizar);
		System.out.println(ufvisualizar);
		System.out.println(filialvisualizar);
		System.out.println(valorTotalContribui��oN�oCumulativaPer�odovisualizar);
		System.out.println(valorCr�ditoDescontadoApuradoPr�prioPer�odoEscritura��ovisualizar);
		System.out.println(valorCr�ditoDescontadoApuradoPer�odoAnteriorEscritura��ovisualizar);
		System.out.println(valorTotalContribui��oN�oCumulativaDevidavisualizar);
		System.out.println(ValorRetidoFonteDeduzidoPer�odovisualizar);
		System.out.println(outrasDedu��esPer�odovisualizar);
		System.out.println(valorContribui��oCumulativaRecolherPagarvisualizar);
		System.out.println(valorTotalContribui��oCumulativaPer�odovisualizar);
		System.out.println(valorRetidoFonteDeduzidoPer�odovisualizar);
		System.out.println(OutraDedu��esPer�odovisualizar);
		System.out.println(valordaContribui��oCumulativaRecolherPagarvisualizar);
		System.out.println(valorTotalContribui��oRecolherPagarPer�odovisualizar);
		
		biblioteca.click();
		sleep(4000);
		
		no.click();
		sleep(15000);
			
	
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));

		menu1.click();
		sleep(1000);
		editar.click();
		sleep(6000);
		
		sleep(4000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		//waitExpectElement(filial);
		sleep(16000);
		
		String empresaEditar = empresa.getAttribute("value");
		String ufEditar = uf.getText();
		String filialEditar = filial.getText();
		String valorTotalContribui��oN�oCumulativaPer�odoEditar = valorTotalContribui��oN�oCumulativaPer�odo.getAttribute("value");
		String valorCr�ditoDescontadoApuradoPr�prioPer�odoEscritura��oEditar = valorCr�ditoDescontadoApuradoPr�prioPer�odoEscritura��o.getAttribute("value");
		String valorCr�ditoDescontadoApuradoPer�odoAnteriorEscritura��oEditar = valorCr�ditoDescontadoApuradoPer�odoAnteriorEscritura��o.getAttribute("value");
		String valorTotalContribui��oN�oCumulativaDevidaEditar = valorTotalContribui��oN�oCumulativaDevida.getAttribute("value");
		String ValorRetidoFonteDeduzidoPer�odoEditar = ValorRetidoFonteDeduzidoPer�odo.getAttribute("value");
		String outrasDedu��esPer�odoEditar = outrasDedu��esPer�odo.getAttribute("value");
		String valorContribui��oCumulativaRecolherPagarEditar = valorContribui��oCumulativaRecolherPagar.getAttribute("value");
		String valorTotalContribui��oCumulativaPer�odoEditar = valorTotalContribui��oCumulativaPer�odo.getAttribute("value");
		String valorRetidoFonteDeduzidoPer�odoEditar = valorRetidoFonteDeduzidoPer�odo.getAttribute("value");
		String outraDedu��esPer�odoEditar = outraDedu��esPer�odo.getAttribute("value");
		String valordaContribui��oCumulativaRecolherPagarEditar = valordaContribui��oCumulativaRecolherPagar.getAttribute("value");
		String valorTotalContribui��oRecolherPagarPer�odoEditar = valorTotalContribui��oRecolherPagarPer�odo.getAttribute("value");
		
		System.out.println("------------------------------");
		System.out.println(empresaEditar);
		System.out.println(ufEditar);
		System.out.println(filialEditar);
		System.out.println(valorTotalContribui��oN�oCumulativaPer�odoEditar);
		System.out.println(valorCr�ditoDescontadoApuradoPr�prioPer�odoEscritura��oEditar);
		System.out.println(valorCr�ditoDescontadoApuradoPer�odoAnteriorEscritura��oEditar);
		System.out.println(valorTotalContribui��oN�oCumulativaDevidaEditar);
		System.out.println(ValorRetidoFonteDeduzidoPer�odoEditar);
		System.out.println(outrasDedu��esPer�odoEditar);
		System.out.println(valorContribui��oCumulativaRecolherPagarEditar);
		System.out.println(valorTotalContribui��oCumulativaPer�odoEditar);
		System.out.println(valorRetidoFonteDeduzidoPer�odoEditar);
		System.out.println(outraDedu��esPer�odoEditar);
		System.out.println(valordaContribui��oCumulativaRecolherPagarEditar);
		System.out.println(valorTotalContribui��oRecolherPagarPer�odoEditar);
		
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		sucesso.add(empresaEditar.contains(empresavisualizar));
		sucesso.add(ufEditar.contains(ufvisualizar));
		sucesso.add(filialEditar.contains(filialvisualizar));
		sucesso.add(valorTotalContribui��oN�oCumulativaPer�odoEditar.contains(valorTotalContribui��oN�oCumulativaPer�odovisualizar));
		sucesso.add(valorCr�ditoDescontadoApuradoPr�prioPer�odoEscritura��oEditar.contains(valorCr�ditoDescontadoApuradoPr�prioPer�odoEscritura��ovisualizar));
		sucesso.add(valorCr�ditoDescontadoApuradoPer�odoAnteriorEscritura��oEditar.contains(valorCr�ditoDescontadoApuradoPer�odoAnteriorEscritura��ovisualizar));
		sucesso.add(valorTotalContribui��oN�oCumulativaDevidaEditar.contains(valorTotalContribui��oN�oCumulativaDevidavisualizar));
		sucesso.add(ValorRetidoFonteDeduzidoPer�odoEditar.contains(ValorRetidoFonteDeduzidoPer�odovisualizar));
		sucesso.add(outrasDedu��esPer�odoEditar.contains(outrasDedu��esPer�odovisualizar));
		sucesso.add(valorContribui��oCumulativaRecolherPagarEditar.contains(valorContribui��oCumulativaRecolherPagarvisualizar));
		sucesso.add(valorTotalContribui��oCumulativaPer�odoEditar.contains(valorTotalContribui��oCumulativaPer�odovisualizar));
		sucesso.add(valorRetidoFonteDeduzidoPer�odoEditar.contains(valorRetidoFonteDeduzidoPer�odovisualizar));
		sucesso.add(outraDedu��esPer�odoEditar.contains(OutraDedu��esPer�odovisualizar));
		sucesso.add(valordaContribui��oCumulativaRecolherPagarEditar.contains(valordaContribui��oCumulativaRecolherPagarvisualizar));
		sucesso.add(valorTotalContribui��oRecolherPagarPer�odoEditar.contains(valorTotalContribui��oRecolherPagarPer�odovisualizar));
		
		System.out.println(sucesso);
		return sucesso;
	}
	
	
	
}
