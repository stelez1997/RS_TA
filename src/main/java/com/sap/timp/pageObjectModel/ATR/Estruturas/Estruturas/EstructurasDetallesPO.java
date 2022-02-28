package com.sap.timp.pageObjectModel.ATR.Estruturas.Estruturas;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class EstructurasDetallesPO extends TestBaseSteven{
	@FindBy(xpath = "//*[@id=\"baseTabs-wrapper\"]/div[2]/div/div[1]/ul/li[1]/div/span[2]")
	public WebElement estruturas;

	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[2]/div[2]/div")
	public WebElement vers�o;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[3]/div[2]/div[1]")
	public WebElement grupo;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[4]/div[2]/div")
	public WebElement descri��o;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[5]/div[2]/div")
	public WebElement activo;
	
	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement fechar; 
	
	@FindBy(xpath = "//*[@id=\"list\"]/div/div[1]/div/div[3]/div[1]/div[4]/div")
	public WebElement descri��oTabla;
	
	@FindBy(xpath = "//*[@id=\"list\"]/div/div[1]/div/div[3]/div[1]/div[5]/div")
	public WebElement vers�oTabla;
	
	@FindBy(xpath = "//*[@id=\"list\"]/div/div[1]/div/div[3]/div[1]/div[8]/div")
	public WebElement activoTabla;

	public EstructurasDetallesPO() {

		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> Detalles() {
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		estruturas.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		WebElement menu = driver.findElement(By.xpath("//*[@id=\"list\"]/div/div[1]/div/div[3]/div[1]/div[1]/div/div[1]/span[2]"));
		WebElement detalle = driver.findElement(By.xpath("//*[@id=\"list\"]/div/div[1]/div/div[3]/div[1]/div[1]/div/div[2]/ul/li[1]/span[1]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		
		detalle .click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		String nomevers�o = vers�o.getText();
		String nomegrupo = grupo.getText();
		String nomedescri��o = descri��o.getText();
		String nomeActivo = activo.getText();
		
		System.out.println(nomevers�o);
		System.out.println(nomegrupo);
		System.out.println(nomedescri��o);
		System.out.println(nomeActivo);
		
		fechar.click();
		sleep(2000);
		waitExpectElement(siguiente);
		sleep(2000);
		
		String nomedescri��o2 = descri��oTabla.getText();
		String nomevers�o2 = vers�oTabla.getText();
		String nomeActivo2 = activoTabla.getText();
		
		
		System.out.println("-----------");
		System.out.println(nomedescri��o2);
		System.out.println(nomevers�o2);
		System.out.println(nomeActivo2);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		sucesso.add(nomevers�o.contains(nomevers�o2));
		sucesso.add(nomedescri��o.contains(nomedescri��o2));
		sucesso.add(nomeActivo.contains(nomeActivo2));

		System.out.println(sucesso);
		
		
		return sucesso;
	}
}
