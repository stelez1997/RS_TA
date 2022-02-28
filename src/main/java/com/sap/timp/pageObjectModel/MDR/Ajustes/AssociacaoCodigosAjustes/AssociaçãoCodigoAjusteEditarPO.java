package com.sap.timp.pageObjectModel.MDR.Ajustes.AssociacaoCodigosAjustes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class Associa��oCodigoAjusteEditarPO extends TestBaseFernando{
	String URL = driver.getCurrentUrl();
	
	@FindBy(xpath = "//div[@class=\"accordion-container\"]/ul/li/div/span[text()=\"Ajustes\"]")
	public WebElement menuAjustes;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-codeAssoc\"]")
	public WebElement subMenuAjustesAssociacaoCodigoAjuste;
	
	@FindBy(xpath = "//div[contains(@class, \"icon-right\")][2]")
	public WebElement btnUltimaPagina;
	
	@FindBy(xpath = "//div[@id=\"validity\"]/div/div/input")
	public WebElement dataInicioVigencia;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement btnBiblioteca;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement btnSim;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement btnGravar;
	
	@FindBy(xpath = "//button[text()=\"N�o\"]")
	public WebElement nao;
	
	public Associa��oCodigoAjusteEditarPO(){
		PageFactory.initElements(driver, this);
	}
	
	public boolean editarAssocia��oCodigoAjuste() {
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		if(URL.contains("td1") || URL.contains("tq1")) {
			waitExpectElement(menuAjustes);
			menuAjustes.click();		
			sleep(2000);
		}		
		
		subMenuAjustesAssociacaoCodigoAjuste.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnUltimaPagina.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("Associa��oCodigoAjuste");
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement a�ao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		menu.click();
		sleep(1000);
		a�ao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		attributeToBeXpath("//div[@id=\"filial\"]/div", "class", "base-MultipleSelect3 required");
		sleep(2000);
		
		String dataInicioVigenciaValorNuevo = fechaAyer();
		System.out.println("Data a ser inserida: " +dataInicioVigenciaValorNuevo);
	
		dataInicioVigencia.clear(); // Limpio la fecha actual que tiene guardada
		dataInicioVigencia.sendKeys(dataInicioVigenciaValorNuevo); // Le envio la nueva fecha a editar	
		System.out.println(dataInicioVigenciaValorNuevo); // Imprimo la fecha que se va editar el nuevo valor
		
		sleep(1000);
		btnGravar.click();
		sleep(2000);
		waitExpectElement(btnSim);
		sleep(1000);
		nao.click();
		
		waitExpectElement(btnSim);
		sleep(2000);
		btnSim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay dark\"]");
		sleep(2000);	
		
		driver.navigate().refresh();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		attributeToBeXpath("//div[@id=\"filial\"]/div", "class", "base-MultipleSelect3 required");
		sleep(9000);
		
		// Obtengo el valor actualizado ya recargada la p�gina
		actionsMoveToElementElement(dataInicioVigencia);
		String dataInicioVigenciaEditada = dataInicioVigencia.getAttribute("value");
		System.out.println("Data Nova: " +dataInicioVigenciaEditada);
		sleep(2000);
		
		boolean sucesso = false;
		sucesso = dataInicioVigenciaEditada.equals(dataInicioVigenciaValorNuevo); // Se compara si la fecha editada que se muestra en visualizar es igual a la fecha de ayer que fue la fecha que se establecio en editar
		
		return sucesso;
	}
}
