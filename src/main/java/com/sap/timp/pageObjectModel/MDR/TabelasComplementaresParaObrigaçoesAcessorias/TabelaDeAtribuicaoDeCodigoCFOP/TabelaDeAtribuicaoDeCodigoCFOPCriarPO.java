package com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObriga�oesAcessorias.TabelaDeAtribuicaoDeCodigoCFOP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class TabelaDeAtribuicaoDeCodigoCFOPCriarPO extends TestBaseSteven {
	
	
	@FindBy(xpath = "//span[text()=\"Tabelas Complementares para Obriga��es Acess�rias\"]")
	public WebElement tabelacomplementares;
	
	@FindBy(xpath = "//span[text()=\"Tabela de Atribui��o de C�digo CFOP / C�digo de Ajuste para obriga��o\"]")
	public WebElement tabeladeatribuicaodecodigocfop;
	
	@FindBy(xpath = "//span[text()=\"Nova Tabela de Atribui��o de C�digo CFOP\"]")
	public WebElement novotabela;
	
	@FindBy(xpath = "//div[@id=\"obligation\"]/div/div[2]")
	public WebElement obrigacao;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcaoobrigacao;
	
	
	@FindBy(xpath = "//div[@id=\"cfop\"]/div/div/div[2]")
	public WebElement cfop;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcaocfop;
	
	@FindBy(xpath = "//div[@id=\"adjustment\"]/div/div/div[2]")
	public WebElement ajuste;
	
	@FindBy(xpath = "//li[@id][3]")
	public WebElement opcaoajuste;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Data Inicial\"]")
	public WebElement dataincial;
	
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement siguiente;
	
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"N�o\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	
	
	public TabelaDeAtribuicaoDeCodigoCFOPCriarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		sleep(2000);
		tabelacomplementares.click();
		sleep(2000);
		
		tabeladeatribuicaodecodigocfop.click();
		
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
		novotabela.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		obrigacao.click();
		
		sleep(2000);
		
		opcaoobrigacao.click();
		
		sleep(2000);
		cfop.click();;
		
		sleep(2000);
		
		opcaocfop.click();
		
		sleep(2000);
		
		ajuste.click();
		
		sleep(2000);
		
		opcaoajuste.click();
		
		sleep(2000);
		
		String data=fechaActual();
		dataincial.sendKeys(data);
		
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
		
		
		idInserir("TabelaDeAtribuicaoDeCodigoCFOP", id2);
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
