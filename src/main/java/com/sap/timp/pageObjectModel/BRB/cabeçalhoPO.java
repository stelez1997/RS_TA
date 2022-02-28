package com.sap.timp.pageObjectModel.BRB;

import java.util.ArrayList;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sap.timp.base.TestBaseSteven;

public class cabe�alhoPO extends TestBaseSteven{
	
	
	@FindBy(xpath = "//*[@id=\"searchbox\"]/div/div/input")
	public WebElement ferramenta;
	
	@FindBy(xpath = "//*[@id=\"right\"]/div/div[4]/div/div[1]/div/div[3]/div[1]/div[1]/div")
	public WebElement menu;
	
	@FindBy(xpath = "//*[@id=\"right\"]/div/div[4]/div/div[1]/div/div[3]/div[1]/div[1]/div/div[2]/ul/li[3]")
	public WebElement opcao;
	
	@FindBy(xpath = "//*[@id=\"baseTabs-wrapper\"]/div[1]/div[3]/div/div[2]")
	public WebElement cabe�alho;
	
	
	@FindBy(xpath = "//*[@id=\"editor-toolbar\"]/div/div/ul/li[1]/button")
	public WebElement gravar;
	
	@FindBy(xpath = "//*[@id=\"editor-toolbar\"]/div/ul/li[3]/button")
	public WebElement execucao;
	
	@FindBy(xpath = "//*[@id=\"right\"]/div[2]/div[1]/div/div/ul/li[1]/button")
	public WebElement executar;
	
	@FindBy(xpath = "//*[@id=\"title-input\"]")
	public WebElement titulo;
	
	@FindBy(xpath = "//*[@id=\"desc-input\"]")
	public WebElement descri�ao;
	
	@FindBy(xpath = "//*[@id=\"select\"]/div[2]")
	public WebElement imagem;
	
	@FindBy(xpath = "//div[contains(@aria-label,\"Classifica��o\")]/div/div/div[2]")
	public WebElement classifica�ao;
	
	@FindBy(xpath = "//*[@id=\"option-1\"]")
	public WebElement imagemO;
	
	@FindBy(xpath = "//*[@id=\"option-1\"]")
	public WebElement classifica�aoO;
	
	@FindBy(xpath = "//*[@id=\"right\"]/div[2]/div[1]/div/div/ul/li[8]/button")
	public WebElement imprimir;
	
	@FindBy(xpath = "//button[text()=\"N�o\"]")
	public WebElement nao;
	/*
	@FindBy(xpath = "")
	public WebElement ;
	@FindBy(xpath = "")
	public WebElement ;
	@FindBy(xpath = "")
	public WebElement ;
	@FindBy(xpath = "")
	public WebElement ;
	*/
	
	
	public cabe�alhoPO() {
	
		PageFactory.initElements(driver, this);
	}
	

	
	public void cabe�alho() {

		waitExpectXpath("//*[@id=\"acc-reports\"]/ul/li[3]");

		ferramenta.sendKeys("Prueba Automatizada");
		ferramenta.sendKeys(Keys.ENTER);
		
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);


		//waitExpectElement(menu);
		//sleep(menuT);
		
		menu.click();

		opcao.click();
		
		waitExpectXpath("//*[@id=\"accordion\"]/ul/li");
		
		cabe�alho.click();
		waitExpectElement(imagem);
		
		titulo.clear();
		titulo.sendKeys("Prueba 1");
		
		descri�ao.clear();
		descri�ao.sendKeys("Prueba1");
		
		imagem.click();
		sleep(1000);
		imagemO.click();
		
		sleep(1000);
		classifica�ao.click();
		sleep(1000);
		classifica�aoO.click();
		
		sleep(2000);
		
		gravar.click();
		sleep(2000);
		waitExpectElement(nao);
		sleep(1000);
		nao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		execucao.click();
		sleep(8000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		executar.click();
		
		sleep(2000);
		waitExpectXpath("//*[@id=\"table-fixed-wrapper\"]/div[2]/div[1]/span[1]/label");
		
		
		//imprimir.click();
		
		
	
	
	}

}
