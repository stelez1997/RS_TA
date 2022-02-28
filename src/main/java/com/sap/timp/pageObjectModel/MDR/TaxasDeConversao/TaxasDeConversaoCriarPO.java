package com.sap.timp.pageObjectModel.MDR.TaxasDeConversao;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class TaxasDeConversaoCriarPO extends TestBaseSteven {
	
	
	@FindBy(xpath = "//span[text()=\"Taxas de Convers�o\"]")
	public WebElement taxasdeconversao;
	
	@FindBy(xpath = "//span[text()=\"Nova Taxa de Convers�o\"]")
	public WebElement novo;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher o Tipo de Taxa de Atualiza��o\"]")
	public WebElement tipo;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher a descri��o do Cadastro de Tipo de Taxa de Atualiza��o\"]")
	public WebElement descricao;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione a Data de Inclus�o \"]")
	public WebElement datainclusao;
	
	@FindBy(xpath = "//input[@placeholder=\"Prencher a Taxa\"]")
	public WebElement taxa;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione a Data de In�cio de Vig�ncia \"]")
	public WebElement datainicio;
	
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
	
	@FindBy(xpath = "//div[@class=\" toast-inner\"]")
	public WebElement mensagem;
	
	public TaxasDeConversaoCriarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		
		sleep(2000);
		taxasdeconversao.click();
		
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
		
		
		//cria�ao
		novo.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		tipo.sendKeys("Tipo");
		
		sleep(2000);
		
		descricao.sendKeys("descri��o");
		
		sleep(2000);
		
		datainclusao.sendKeys(fechaActual());
		
		sleep(2000);
		
		taxa.sendKeys("7");
		
		sleep(2000);
		
		datainicio.sendKeys(fechaActual());
		
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
		
		
		idInserir("taxasdeconversao", id2);
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
