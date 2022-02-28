package com.sap.timp.pageObjectModel.TCC.GestaoDeCreditoTributarioICMS.Executados.Registro1200;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class Executados1200ExcluirPO extends TestBaseSteven {
	
	@FindBy(xpath = "//span[text()=\"Gest�o de Cr�dito Tribut�rio ICMS\"]")
	public WebElement gestaoCredito;

	@FindBy(xpath = "//li[@identifier=\"accordion-item-taxCreditManagement\"]/div/span[text()=\"Executados\"]")
	public WebElement executados;
	

	@FindBy(xpath = "//li[@identifier=\"accordion-item-register1200Execution\"]")
	public WebElement registro12000;
	
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement ultimaPagina;
	
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement Gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;

	

	String URL = driver.getCurrentUrl();
	
	public Executados1200ExcluirPO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> excluir() {
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		gestaoCredito.click();
		sleep(2000);
		executados.click();
		
		sleep(2000);
		registro12000.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ultimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("id-GCT-ICMS-ConfiguracaoEExecucacoRegistro1200Executados");
		System.out.println("ID Registro: " + idRegistro);
		
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();		
		//ultimo id
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[2]/div")).getText();
		System.out.println("ID Ultimo Registro: " + id);
		
		int id1 = convertToInt(id);
		int id2 = convertToInt(idRegistro);
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		if(id2 == id1) {
			System.out.println("Sim, s�o iguais");
			sucesso.add(true);
		}else {
			System.out.println("N�o s�o iguais");
			sucesso.add(false);
		}
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement excluir = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Excluir\"]"));
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		excluir.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ultimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		 rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();		
		//ultimo id
		String idultimo = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[2]/div")).getText();
		System.out.println("ID Ultimo Registro: " + id);
		
		int idc = convertToInt(idultimo);
		int idb = convertToInt(idRegistro);
			if(idc!= idb) {
			System.out.println("Sim, s�o diferente");
			sucesso.add(true);
		}else {
			System.out.println("N�o, s�o iguais");
			sucesso.add(false);
		}
		System.out.println(sucesso);
		return sucesso;
	}

}
