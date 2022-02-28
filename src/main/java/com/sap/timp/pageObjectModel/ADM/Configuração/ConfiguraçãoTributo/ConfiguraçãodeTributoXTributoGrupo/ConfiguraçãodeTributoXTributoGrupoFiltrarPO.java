package com.sap.timp.pageObjectModel.ADM.Configura��o.Configura��oTributo.Configura��odeTributoXTributoGrupo;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class Configura��odeTributoXTributoGrupoFiltrarPO extends TestBaseSteven {
	
	@FindBy(xpath = "//div[@class=\"baseTabs-bar boxes\"]/div/div[2]")
	public WebElement Configura��o;
	
	@FindBy(xpath = "//span[text()=\"Configura��o de Tributos\"]")
	public WebElement Configura��odeTributos;
	
	@FindBy(xpath = "//span[text()=\"Configura��o de Tributo X Tributo Grupo\"]")
	public WebElement Configura��odeTributosXTributo;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-left\"]")
	public WebElement btnPrimeraPagina;

	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement btnGravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement btnSim;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement btnBiblioteca;
	
	public Configura��odeTributoXTributoGrupoFiltrarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public Boolean filtro() {

		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		Configura��o.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		
		Configura��odeTributos.click();
		sleep(3000);

		
		Configura��odeTributosXTributo.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		String idRegistro = idObter("Configura��odeTributoXTributoGrupo");
		System.out.println("ID Registro: " + idRegistro);
		
		pesquisar.sendKeys(idRegistro);
		sleep(2000);
		
		pesquisar.sendKeys(Keys. ENTER);
		sleep(2000);

		int j=1;
		ArrayList<String> data = new ArrayList<String>();
		int rows = driver.findElements(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")]")).size();

		
		Boolean sucesso = true;
		System.out.println(sucesso);
		return sucesso;
	}

}
