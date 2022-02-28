package com.sap.timp.pageObjectModel.MDR.EventosESocial.S1250AquisicaoDeProducaoRural.S1250InfProcJudicial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class S1250InfProcJudicialEditarPO extends TestBaseFernando{	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-eSocialEvents\"]")
	public WebElement eventosESocial;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-ruralProductionAcquisition\"]")
	public WebElement s1250AquisicaoDeProducaoRural;
	
	@FindBy(xpath = "//span[text()=\"Inf. Proc. Judicial\"]")
	public WebElement abaInfProcJudicial;
	
	@FindBy(xpath = "//div[@id=\"judicial-process-list\"]/div/div[2]/div/div[1]")
	public WebElement btnPrimeraPagina;
	
	@FindBy(xpath = "//div[@id=\"recordId\"]/div/div/input")
	public WebElement inputIdDoRegistro;
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement btnAceitar;
	
	public S1250InfProcJudicialEditarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean editar() {
		invisibilityOfElementOverlay();
		eventosESocial.click();
		sleep(1000);
		
		s1250AquisicaoDeProducaoRural.click();
		invisibilityOfElementOverlay();
		
		abaInfProcJudicial.click();
		invisibilityOfElementOverlay();
		
		actionsMoveToElementElement(btnPrimeraPagina);
		btnPrimeraPagina.click();
		invisibilityOfElementOverlay();
		
		String idRegistro = idObter("S1250InfProcJudicial");		
		System.out.println("ID Registro: " + idRegistro);
		
		WebElement menu = driver.findElement(By.xpath("//div[@id=\"judicial-process-list\"]/div/div/div/div[contains(@class,\"tbody\")]/div[@data-id and@class=\"tr\" and contains(@aria-label, \"Id: " +idRegistro+ "\")]/div[1]/div"));
		WebElement a�ao = driver.findElement(By.xpath("//div[@id=\"judicial-process-list\"]/div/div/div/div[contains(@class,\"tbody\")]/div[@data-id and@class=\"tr\" and contains(@aria-label, \"Id: " +idRegistro+ "\")]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		menu.click();
		sleep(1000);
		a�ao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		waitExpectElement(inputIdDoRegistro);
		attributoNotToBeEmptyElement(inputIdDoRegistro, "value");
		
		String valorIdDoRegistroOriginal = inputIdDoRegistro.getAttribute("value");
		System.out.println("Valor Id Do Registro Original: " + valorIdDoRegistroOriginal);
		
		String valorIdDoRegistroNuevo = "2";
		System.out.println("Valor Id Do Registro nuevo: " + valorIdDoRegistroNuevo);
		
		inputIdDoRegistro.clear();
		inputIdDoRegistro.sendKeys(valorIdDoRegistroNuevo);
		sleep(1000);
		
		btnAceitar.click();
		invisibilityOfElementOverlay();
		
		menu = driver.findElement(By.xpath("//div[@id=\"judicial-process-list\"]/div/div/div/div[contains(@class,\"tbody\")]/div[@data-id and@class=\"tr\" and contains(@aria-label, \"Id: " +idRegistro+ "\")]/div[1]/div"));
		a�ao = driver.findElement(By.xpath("//div[@id=\"judicial-process-list\"]/div/div/div/div[contains(@class,\"tbody\")]/div[@data-id and@class=\"tr\" and contains(@aria-label, \"Id: " +idRegistro+ "\")]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		menu.click();
		sleep(1000);
		a�ao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String valorIdDoRegistroEditado = "2";
		System.out.println("Valor Id Do Registro Editado: " + valorIdDoRegistroEditado);
		sleep(1000);
		
		boolean sucesso = false;
		
		if(valorIdDoRegistroEditado.equals(valorIdDoRegistroNuevo)) {
			System.out.println("Registro modificado...");
			sucesso = true;
		}else {
			System.out.println("No se modifico el registro...");
		}
		
		return sucesso;
	}
}
