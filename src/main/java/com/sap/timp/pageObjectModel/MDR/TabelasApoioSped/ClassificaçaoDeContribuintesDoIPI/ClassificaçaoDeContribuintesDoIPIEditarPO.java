package com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.Classifica�aoDeContribuintesDoIPI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class Classifica�aoDeContribuintesDoIPIEditarPO extends TestBaseSteven{
	
	
	@FindBy(xpath = "//span[text()=\"Tabelas de Apoio - SPED\"]")
	public WebElement tabelaApoioSped;
	
	@FindBy(xpath = "//span[text()=\"4.5.5 Classifica��o de Contribuintes do IPI\"]")
	public WebElement classificacaodecontribuintes;
	
	
	@FindBy(xpath = "//span[text()=\"Novo Classifica��o de contribuintes do IPI\"]")
	public WebElement novoclassificacao;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher o c�digo do Tipo de atividade\"]")
	public WebElement tipodeatividade;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement siguiente;
	
	
	@FindBy(xpath = "//textarea[@placeholder=\"Preencher Descri��o\"]")
	public WebElement descricao;
	
	
	@FindBy(xpath = "//span[@id=\"description\"]")
	public WebElement campo;
	
	
	
	@FindBy(xpath = "//input[@placeholder=\" selecionar a Data de Inicio de Vig�ncia\"]")
	public WebElement datavigencia;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"N�o\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	
	
	public Classifica�aoDeContribuintesDoIPIEditarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean editar() {
		sleep(2000);
		tabelaApoioSped.click();
		sleep(2000);
		classificacaodecontribuintes.click();
		sleep(2000);

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
	
		//pega o ultimo id que foi gerado no criar
		String idRegistro = idObter("classificacaodecontibuintessdoipi");
		System.out.println(idRegistro);
				
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
		String enviar = "Teste da Descri��o";
		descricao.clear();
		descricao.sendKeys(enviar);
		
		sleep(2000);
		
		gravar.click();
		sleep(2000);
		sim.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		biblioteca.click();
		sleep(2000);
		//sim.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
	
		waitExpectElement(siguiente);
		sleep(2000);
		siguiente.click();
		
		
		//pega o ultimo id que foi gerado no criar
		
		
		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement visualizar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		
		actionsMoveToElementElement(menu1);
		sleep(2000);
		menu1.click();
		sleep(1000);
		
		visualizar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String textoCampo = campo.getText();
		boolean sucesso = textoCampo.equals(enviar);
		System.out.println(sucesso);
		
		return sucesso;
	}
	

}
