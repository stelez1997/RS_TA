package com.sap.timp.pageObjectModel.MDR.Empresas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class EmpresasEditarPO extends TestBaseSteven{
	

	@FindBy(xpath = "//li/div/span[text()=\"Empresas\"]")
	public WebElement empresa;
	
	@FindBy(xpath = "//*[@id=\"list\"]/div/div[1]/div/div[3]/div[1]/div[1]/div")
	public WebElement menu;
	
	
	 @FindBy(xpath = "//*[@id=\"list\"]/div/div[1]/div/div[3]/div[1]/div[1]/div/div[2]/ul/li[3]")
	public WebElement editar;
	
	@FindBy(xpath = "//*[@id=\"toolbar\"]/div/div/ul/li/button")
	public WebElement gravar;
	
	@FindBy(xpath = "//div[@id=\"municipalInscription\"]/div/div/input")
	public WebElement campo;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[3]/button[2]")
	public WebElement sim;

	
	
	public EmpresasEditarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean editar() {
		
		empresa.click();
		sleep(2000);
		waitExpectXpath("//*[@id=\"list\"]/div/div[1]/div/div[3]/div[1]/div[1]/div");

		sleep(2000);
		
		menu.click();
		editar.click();
		
		waitExpectElement(campo);
		sleep(10000);
		
		String valor = "";
	
		valor = campo.getAttribute("value");
		
		String enviar = "Prueba 10";
		
		campo.clear();
		campo.sendKeys(enviar);
		sleep(12000);
		
		gravar.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		sim.click();
		sleep(3000);		 

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		driver.navigate().refresh();
		
		waitExpectElement(campo);

		sleep(2000);
		
		String nuevoTexto = campo.getAttribute("value");

		boolean sucesso = nuevoTexto.equals(enviar);
		
		sleep(1000);
		campo.clear();
		sleep(1000);
		campo.sendKeys(valor);
		
		gravar.click();
		
		sleep(2000);
		sim.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		//waitExpectXpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");
		
		System.out.println(sucesso);
		return sucesso;
		
		
		
		
	}
	
	
}
