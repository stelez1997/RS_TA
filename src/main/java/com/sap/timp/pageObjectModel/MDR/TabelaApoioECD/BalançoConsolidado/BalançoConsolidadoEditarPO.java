package com.sap.timp.pageObjectModel.MDR.TabelaApoioECD.Balan�oConsolidado;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class Balan�oConsolidadoEditarPO extends TestBaseFernando{
	@FindBy(xpath = "//span[text()=\" Tabelas de Apoio ECD\"]")
	public WebElement tabelaECDE;
	
	@FindBy(xpath = "//span[text()=\" Balan�o Consolidado  \"]")
	public WebElement opcionBalancoConsolidadoElement;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement btnGravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement btnSim;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement btnBiblioteca;
	
	@FindBy(xpath = "//div[contains(@class, \"icon-left\")][1]")
	public WebElement btnPrimerPagina;
	
	@FindBy(xpath = "//div[@id=\"competence\"]/div/div/input")
	public WebElement compet�ncia;
	
	public Balan�oConsolidadoEditarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean editar() {
		sleep(2000);
		tabelaECDE.click();
		
		sleep(2000);
		opcionBalancoConsolidadoElement.click();
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnPrimerPagina.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		WebElement menu = driver.findElement(By.xpath("//div[@class = \"tr\" and @data-id][1]/div[1]/div[1]"));
		WebElement a�ao = driver.findElement(By.xpath("//div[@class = \"tr\" and @data-id][1]/div[1]/div[1]/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		menu.click();
		sleep(1000);
		a�ao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		// Se obtiene el valor que tiene actualmente el input
		String competenciaString = compet�ncia.getAttribute("value");
		System.out.println("Valor original Competencia: " + competenciaString);
		
		// Definimos el valor nuevo para editar
		String valorNuevoString = anioActual();
		System.out.println("Valor nuevo a editar Competencia: " + valorNuevoString);
		
		// Seteamos el valor nuevo
		compet�ncia.click();
		sleep(1000);
		compet�ncia.clear();
		sleep(1000);
		compet�ncia.sendKeys(valorNuevoString);
		sleep(2000);
		
		btnGravar.click();
		sleep(2000);
		btnSim.click();
		sleep(2000);		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		// Recargo la pagina
		driver.navigate().refresh();
		sleep(2000);
		waitExpectXpath("//div[@class=\"overlay loader dark\"]");
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		waitExpectElement(compet�ncia);
		attributoNotToBeEmptyElement(compet�ncia, "value");
		String valorEditado = compet�ncia.getAttribute("value"); // Se obtiene nuevamente el valor del input despues de recargar la pagina para verificar si se guardo el nuevo valor
		System.out.println("Valor editado al recargar pagina: " + valorEditado);
		System.out.println("");
		
		boolean sucesso = false;
		sucesso = valorEditado.equals(valorNuevoString); // Si es igual significa que si fue editado y que se mantiene el valor al actualizar la pagina
		System.out.println("Exito: " + sucesso);
		System.out.println("");
		
		if(!sucesso) {
			return sucesso;
		}
		
		// Se devuelve el valor original del campo
		compet�ncia.click();
		sleep(1000);
		compet�ncia.clear();
		sleep(1000);
		compet�ncia.sendKeys(competenciaString);
		sleep(2000);	
		
		btnGravar.click();
		sleep(2000);
		btnSim.click();
		sleep(2000);		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		// Recargo la pagina
		driver.navigate().refresh();
		sleep(2000);
		waitExpectXpath("//div[@class=\"overlay loader dark\"]");
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		attributoNotToBeEmptyElement(compet�ncia, "value");
		valorEditado = compet�ncia.getAttribute("value"); // Se obtiene nuevamente el valor del input despues de recargar la pagina para verificar si se guardo el valor original que tenia
		System.out.println("Valor editado al recargar pagina (valor original nuevamente): " + valorEditado);
		System.out.println("");
		
		sucesso = valorEditado.equals(competenciaString); // Si es igual significa que si fue editado y que se mantiene el valor al original
		System.out.println("Exito: " + sucesso);
		System.out.println("");
		
		return sucesso;
	}
}
