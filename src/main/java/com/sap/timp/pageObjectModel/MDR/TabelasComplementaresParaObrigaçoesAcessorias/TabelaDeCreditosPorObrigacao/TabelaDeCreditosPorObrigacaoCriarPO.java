package com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObriga�oesAcessorias.TabelaDeCreditosPorObrigacao;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class TabelaDeCreditosPorObrigacaoCriarPO extends TestBaseSteven{
	
	
	@FindBy(xpath = "//span[text()=\"Tabelas Complementares para Obriga��es Acess�rias\"]")
	public WebElement tabelacomplementares;
	
	@FindBy(xpath = "//span[text()=\"Tabela de Cr�ditos por Obriga��o\"]")
	public WebElement tabeladecreditosporobrigacao;
	
	@FindBy(xpath = "//span[text()=\"Novo Cr�dito por Obriga��o\"]")
	public WebElement novocreditoporobrigacao;
	
	@FindBy(xpath = "//div[@id=\"obligation\"]/div/div[2]")
	public WebElement obrigacao;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcaoobrigacao;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher  um C�digo de Cr�dito\"]")
	public WebElement codigodecredito;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher  uma  Descri��o Cr�dito\"]")
	public WebElement descricaocredito;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher  uma  Vig�ncia de\"]")
	public WebElement datainicial;
	
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement siguiente;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione a Data de Inicio de Vig�ncia \"]")
	public WebElement datavigencia;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"N�o\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	
	
	public TabelaDeCreditosPorObrigacaoCriarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		sleep(2000);
		tabelacomplementares.click();
		sleep(2000);
		
		tabeladecreditosporobrigacao.click();
		
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
	
		//conta o numero de linhas
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		System.out.println(id);
		
		sleep(2000);
		//cria�ao
		novocreditoporobrigacao.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		obrigacao.click();
		
		sleep(2000);
		
		opcaoobrigacao.click();
		
		sleep(2000);
		codigodecredito.sendKeys("9");
		
		sleep(2000);
		
		descricaocredito.sendKeys("Credito9");
		
		sleep(2000);
		
		String data=fechaActual();
		datainicial.sendKeys(data);
		
		sleep(2000);
		gravar.click();
		sleep(2000);
		sim.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		biblioteca.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(siguiente);
		sleep(2000);
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		
		idInserir("TabelaDeCreditoPorObrigacao", id2);
		int idD = Integer.valueOf(id);
		int id2D = Integer.valueOf(id2);
		
		System.out.println(idD);
		System.out.println(id2D);
		
		boolean sucesso = false;
		if (idD < id2D) {
			sucesso = true;
		}
		
		
		System.out.println(sucesso);
		return sucesso;
		
	}	
	

}
