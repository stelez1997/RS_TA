package com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.Informa�oesAdicionais;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class Informa�oesAdicionaisVisualizarPO extends TestBaseSteven {
	
	
	@FindBy(xpath = "//span[text()=\"Tabelas de Apoio - SPED\"]")
	public WebElement tabelaApoioSped;
	
	@FindBy(xpath = "//span[text()=\"5.2 Informa��es Adicionais - Valores Declarat�rios\"]")
	public WebElement informacoesadicionais;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//div[@class=\"thead\"]/div/div[3]")
	public WebElement idC;
	
	@FindBy(xpath = "//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]/div[3]/div")
	public WebElement idR;
	
	@FindBy(xpath = "//span[text()=\"Novo Valor Declarat�rio\"]")
	public WebElement novovalor;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher o C�digo de Valores Declarat�rios\"]")
	public WebElement codigodevalores;
	
	@FindBy(xpath = "//textarea[@placeholder=\"Preencher a descri��o do Informa��o Adicional\"]")
	public WebElement descricao;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione a Data de Inicio de Vig�ncia \"]")
	public WebElement datavigencia;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"N�o\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	@FindBy(xpath = "//div[@class=\"tr first\" and @data-id][1]/div[2]/label/span")
	public WebElement opcao;
	
	@FindBy(xpath = "//div[@class=\"tr first\" and @data-id][1]/div[1]/div")
	public WebElement engrenagem;
	
	@FindBy(xpath = "//span[@id=\"codInfoAdicional\"]")
	public WebElement codigoV;
	@FindBy(xpath = "//span[@id=\"uf\"]")
	public WebElement ufV;
	@FindBy(xpath = "//span[@id=\"sequencia\"]")
	public WebElement sequenciaV;
	@FindBy(xpath = "//span[@id=\"descricao\"]")
	public WebElement descricaoV;
	@FindBy(xpath = "//span[@id=\"vigencia\"]")
	public WebElement dataVigenciaV;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"C�digo\")]")
	public WebElement codigoE;
	@FindBy(xpath = "//input[contains(@placeholder,\"UF\")]")
	public WebElement ufE;
	@FindBy(xpath = "//input[contains(@placeholder,\"Sequ�ncia\")]")
	public WebElement sequenciaE;
	@FindBy(xpath = "//textarea[contains(@placeholder,\"descri��o\")]")
	public WebElement descricaoE;
	@FindBy(xpath = "//input[contains(@placeholder,\"Data de In�cio\")]")
	public WebElement dataVigenciaE;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	
	public Informa�oesAdicionaisVisualizarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> visualizar() {
		sleep(2000);
		tabelaApoioSped.click();
		sleep(2000);
		informacoesadicionais.click();
		sleep(2000);
		
		waitExpectElement(siguiente);
		sleep(2000);
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro = idObter("informacoesadicionais");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement a�ao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		

		sleep(2000);
		menu.click();
		sleep(1000);
		
		a�ao.click();
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		String codigoV1 = codigoV.getText();
		String ufV1 = ufV.getText();
		String sequenciaV1 = sequenciaV.getText();
		String descricaoV1 = descricaoV.getText();
		String dataVigenciaV1 = dataVigenciaV.getText();
		
		
		System.out.println(codigoV1);
		System.out.println(ufV1);
		System.out.println(sequenciaV1);
		System.out.println(descricaoV1);
		System.out.println(dataVigenciaV1);
		
		biblioteca.click();
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		a�ao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		menu.click();
		sleep(2000);
		a�ao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		attributoNotToBeEmptyElement(codigoE, "value");
		
		String codigoE1 = codigoE.getAttribute("value");
		String ufE1 = ufE.getAttribute("value");
		String sequenciaE1 = sequenciaE.getAttribute("value");
		String descricaoE1 = descricaoE.getAttribute("value");
		String dataVigenciaE1 = dataVigenciaE.getAttribute("value");
		
		
		System.out.println(codigoE1);
		System.out.println(ufE1);
		System.out.println(sequenciaE1);
		System.out.println(descricaoE1);
		System.out.println(dataVigenciaE1);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		sucesso.add(codigoV1.contains(codigoE1));
		sucesso.add(ufV1.contains(ufE1));
		sucesso.add(sequenciaV1.contains(sequenciaE1));
		sucesso.add(dataVigenciaV1.contains(dataVigenciaE1));
		System.out.println(sucesso);


		return sucesso;
			
	}

	

}
