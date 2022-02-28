package com.sap.timp.pageObjectModel.MDR.AtividadesParaTributacao.TiposDeServicos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class TiposDeServicosCriarPO extends TestBaseSteven{
	
	
	@FindBy(xpath = "//span[text()=\"Atividades para tributa��o\"]")
	public WebElement atividadesparatributacao;
	
	@FindBy(xpath = "//span[text()=\"Tipos de Servi�os\"]")
	public WebElement tiposdeservicos;
	
	@FindBy(xpath = "//span[text()=\"Novo Tipos de Servi�os\"]")
	public WebElement novo;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher C�digo de Pa�s\"]")
	public WebElement codigopais;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Atividade para tributa��o\"]")
	public WebElement atividade;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Grupo Atividade de Tributa��o\"]")
	public WebElement grupo;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Descri��o Atividade para Tributa��o\"]")
	public WebElement descricao;
	
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"N�o\"]")
	public WebElement nao;
	
	//@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	
	
	public TiposDeServicosCriarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		sleep(2000);
		atividadesparatributacao.click();
		sleep(2000);
		
		tiposdeservicos.click();
		
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
		novo.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		codigopais.sendKeys("BR");
		
		sleep(2000);
		
		atividade.sendKeys("atividade");
		
		sleep(2000);
		grupo.sendKeys("7777");
		
		sleep(2000);
		
		descricao.sendKeys("descri��o");
		
		
		sleep(2000);
		gravar.click();
		sleep(2000);
		sim.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//biblioteca.click();
		
		//sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(siguiente);
		sleep(2000);
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		
		idInserir("TiposDeServicio",id2);
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
