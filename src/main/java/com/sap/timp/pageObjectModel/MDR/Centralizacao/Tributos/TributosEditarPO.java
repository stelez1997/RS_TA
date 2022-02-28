package com.sap.timp.pageObjectModel.MDR.Centralizacao.Tributos;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class TributosEditarPO extends TestBaseSteven{
	
	@FindBy(xpath = "//li/div/span[text()=\"Centraliza��o\"]")
	public WebElement centraliza��o;
	
	@FindBy(xpath = "//li/div/span[text()=\"Tributos\"]")
	public WebElement tributos;

	@FindBy(xpath = "//*[@id=\"list\"]/div/div/div[1]/div/div[2]/div/div[3]")
	public WebElement idC;

	@FindBy(xpath = "//*[@id=\"list\"]/div/div/div[2]/div/div[5]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//*[@id=\"validity\"]/div/div[1]/input")
	public WebElement campo;
	
	@FindBy(xpath = "//*[@id=\"toolbar\"]/div/div/ul/li[1]/button")
	public WebElement btnGravar;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[3]/button[2]")
	public WebElement confirmacionGravar;
		
	@FindBy(xpath = "//*[@id=\"toolbar\"]/div/ul/li[3]/button")
	public WebElement btnRegresar;
	
	@FindBy(xpath = "/html/body/div[3]")
	public WebElement cuerpo;
		
	
	public TributosEditarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean tributosEditar() {
		String url = driver.getCurrentUrl();
		boolean tc2 = false;
		boolean td1 = false;
		boolean tp1 = false;
		boolean tq1 = false;
		
		if (url.contains("tc2")) {
			tc2 = true;
		}else if (url.contains("tp1")) {
			tp1 = true;
		}else if (url.contains("tq1")) {
			tq1 = true;
		}else {
			td1 = true;
		}
		
		centraliza��o.click();
		sleep(1000);
		tributos.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		String idRegistro = idObter("Tributos");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(4000);
		
		sleep(2000);
		menu.click();
		sleep(1000);
		editar.click();
		
		attributeToBeXpath("//div[@id=\"UF\"]/div", "class", "base-select required");
		sleep(3000);
				
		waitExpectElement(campo);
		campo.sendKeys(Keys.ENTER);
		String valor = campo.getAttribute("value");

		String enviar = "27/07/2020";
		
		campo.clear();
		sleep(1000);
		campo.sendKeys(enviar);
		campo.sendKeys(Keys.ENTER);
		//campo.sendKeys(Keys.ENTER);
		cuerpo.click();
		sleep(2000);
		btnGravar.click();
		sleep(3000);
		confirmacionGravar.click();
		sleep(2000);

		waitExpectXpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");

		driver.navigate().refresh();

		attributeToBeXpath("//div[@id=\"UF\"]/div", "class", "base-select required");
		sleep(2000);

		String nuevoTexto = campo.getAttribute("value");
		System.out.println(valor);
		System.out.println(nuevoTexto);
		boolean sucesso = nuevoTexto.equals(enviar);
		System.out.println(sucesso);

		sleep(3000);
		campo.sendKeys(Keys.ENTER);
		campo.clear();

		sleep(1000);
		campo.sendKeys(valor);
		campo.sendKeys(Keys.ENTER);
		cuerpo.click();
		
		btnGravar.click();

		sleep(3000);
		confirmacionGravar.click();
		waitExpectXpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");
		
		return sucesso;
	}
}
