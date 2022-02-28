package com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.CodigoDeAjusteDaApura�aoDoIPI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class CodigoDeAjusteDaApura�aoDoIPIEditarPO extends TestBaseSteven{
	
	@FindBy(xpath = "//span[text()=\"Tabelas de Apoio - SPED\"]")
	public WebElement tabelaApoioSped;
	
	@FindBy(xpath = "//span[text()=\"4.5.4 C�digo de Ajuste da Apura��o do IPI\"]")
	public WebElement codigodeajuste;
	
	@FindBy(xpath = "//span[text()=\"Novo C�digo de Ajuste da Apura��o do IPI\"]")
	public WebElement novocodigodeajuste;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher o C�digo de ajuste de IPI\"]")
	public WebElement codigo;
	
	@FindBy(xpath = "//div[@class=\"element\" and @id=\"codeAjusteIndicador\"]/div/div/div[2]")
	public WebElement indicadorajuste;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcaoindicadorajuste;
	
	@FindBy(xpath = "//div[@id=\"descricao\"]/div/textarea")
	public WebElement descricao;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione a Data de Inicio de Vig�ncia \"]")
	public WebElement datavigencia;

	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcaolinha;
	
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement siguiente;
	

	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"N�o\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//span[@id=\"descricao\"]")
	public WebElement campo;
	
	public CodigoDeAjusteDaApura�aoDoIPIEditarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean editar() {
		sleep(2000);
		tabelaApoioSped.click();
		sleep(2000);
		
		codigodeajuste.click();
		
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro = idObter("codigodeajustedaapuracaodoipi");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		
		editar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		waitExpectElement(descricao);
		sleep(2000);
		
		//edi�ao
		
		String descri�ao = "Teste";
		
		descricao.clear();
		
		sleep(2000);
		
		descricao.sendKeys(descri�ao);
		
		
		
		sleep(2000);
		gravar.click();
		sleep(2000);
	
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		biblioteca.click();
		sleep(2000);
		
		sim.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(siguiente);
		sleep(2000);
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		//pega o ultimo id que foi gerado no criar
		String idRegistro1 = idObter("codigodeajustedaapuracaodoipi");
		
		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div"));
		WebElement Editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		actionsMoveToElementElement(menu1);
		sleep(2000);
		menu1.click();
		sleep(1000);
		
		Editar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		waitExpectElement(descricao);
		sleep(2000);
		
		//String sucesso = driver.findElement(By.xpath("//table[@class=\"edit\"]")).getAttribute("class");
		
		boolean sucesso = descri�ao.contains(descricao.getAttribute("value"));
		System.out.println(sucesso);	
		return sucesso;
		
	}
	

}
