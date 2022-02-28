package com.sap.timp.pageObjectModel.MDR.TaxasDeAtualiza��o.Configura��oDeTipoTaxaDeAtualiza��o;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class Configura��DeTipoTaxaDeAtualiza��oEditarPO extends TestBaseFernando{
	String URL = driver.getCurrentUrl();
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-updateRates\"]")
	public WebElement taxasDeActualizacao;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-updateRateConfiguration\"]")
	public WebElement configuracaoDeTipoTaxa;
	
	@FindBy(xpath = "//div[contains(@class, \"icon-left\")][2]")
	public WebElement btnPrimerPagina;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement btnBiblioteca;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement btnSim;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement btnGravar;
	
	@FindBy(xpath = "//div[contains(@class, \"indexEndDate \")]/div/div/input")
	public WebElement dataFimVigencia;
	
	public Configura��DeTipoTaxaDeAtualiza��oEditarPO() {
		PageFactory.initElements(driver, this);
	}
	@Override
	public void actionsMoveToElementElement(WebElement element) {
		// TODO Auto-generated method stub
		super.actionsMoveToElementElement(element);
	}
	
	public boolean editar() {
		sleep(2000);
		taxasDeActualizacao.click();
		
		sleep(1000);
		configuracaoDeTipoTaxa.click();
		
		sleep(2000);		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnPrimerPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("configuracaodetipotaxadeatualizacao");
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement a�ao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		menu.click();
		sleep(1000);
		a�ao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String dataFinVigenciaNuevo = fechaManana();
		dataFimVigencia.clear(); // Limpio la fecha actual que tiene guardada
		dataFimVigencia.sendKeys(dataFinVigenciaNuevo); // Le envio la nueva fecha a editar	
		System.out.println(dataFinVigenciaNuevo); // Imprimo la fecha que se va editar el nuevo valor
		
		sleep(2000);
		btnGravar.click();
		sleep(2000);
		btnSim.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay dark\"]");
		sleep(1000);
		
		driver.navigate().refresh();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		// Obtengo el valor actualizado ya recargada la p�gina
		attributoNotToBeEmptyElement(dataFimVigencia, "value");
		String dataFinVigenciaEditado = dataFimVigencia.getAttribute("value");
		System.out.println(dataFinVigenciaEditado);
		sleep(2000);
		
		boolean sucesso = false;
		sucesso = dataFinVigenciaEditado.equals(dataFinVigenciaNuevo); // Se compara si la fecha editada que se muestra en visualizar es igual a la fecha de ayer que fue la fecha que se establecio en editar
		
		return sucesso;
	}
}
