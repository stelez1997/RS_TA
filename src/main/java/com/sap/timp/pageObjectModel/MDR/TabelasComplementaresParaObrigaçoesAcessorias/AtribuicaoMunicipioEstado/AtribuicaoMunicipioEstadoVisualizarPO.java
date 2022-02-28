package com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObriga�oesAcessorias.AtribuicaoMunicipioEstado;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class AtribuicaoMunicipioEstadoVisualizarPO extends TestBaseSteven {
	
	
	@FindBy(xpath = "//span[text()=\"Tabelas Complementares para Obriga��es Acess�rias\"]")
	public WebElement obrigacoes;
	
	@FindBy(xpath = "//span[contains(text(),\"Atribui��o de Munic�pios por Estado\")]")
	public WebElement atribuicaoMunicipio;
	
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
	
	
	@FindBy(xpath = "//span[@id=\"ufIbge\"]")
	public WebElement codigoUFV;
	@FindBy(xpath = "//span[@id=\"descriptionIbge\"]")
	public WebElement descricaoV;
	@FindBy(xpath = "//span[@id=\"codeIbge\"]")
	public WebElement codigoIBGEV;
	@FindBy(xpath = "//span[@id=\"municipalCodeIbge\"]")
	public WebElement codigoMunicipioV;
	
	
	
	@FindBy(xpath = "//input[contains(@placeholder,\"C�digo UF\")]")
	public WebElement codigoUfE;
	@FindBy(xpath = "//input[contains(@placeholder,\"Descri��o\")]")
	public WebElement descricaoE;
	@FindBy(xpath = "//input[contains(@placeholder,\"IBGE\")]")
	public WebElement codigoIBGEE;
	@FindBy(xpath = "//input[contains(@placeholder,\"C�digo Munic�pio\")]")
	public WebElement codigoMunicipioE;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	
	public AtribuicaoMunicipioEstadoVisualizarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> visualizar() {
		sleep(2000);
		obrigacoes.click();
		sleep(2000);
		atribuicaoMunicipio.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro = idObter("AtribuicaoMunicipioEstado");
		
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

		String codigoUFV1 = codigoUFV.getText();
		String descricaoV1 = descricaoV.getText();
		String codigoIBGEV1 = codigoIBGEV.getText();
		String codigoMunicipioV1 = codigoMunicipioV.getText();


		
		System.out.println(codigoUFV1);
		System.out.println(descricaoV1);
		System.out.println(codigoIBGEV1);
		System.out.println(codigoMunicipioV1);
		
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
		attributoNotToBeEmptyElement(codigoIBGEE, "value");
		
		
		String codigoUfEE1 = codigoUfE.getAttribute("value");
		String descricaoE1 = descricaoE.getAttribute("value");
		String codigoIBGEE1 = codigoIBGEE.getAttribute("value");
		String codigoMunicipioE1 = codigoMunicipioE.getAttribute("value");
		
		System.out.println(codigoUfEE1);
		System.out.println(descricaoE1);
		System.out.println(codigoIBGEE1);
		System.out.println(codigoMunicipioE1);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		sucesso.add(codigoUFV1.contains(codigoUfEE1));
		sucesso.add(descricaoV1.contains(descricaoE1));
		sucesso.add(codigoIBGEV1.contains(codigoIBGEE1));
		sucesso.add(codigoMunicipioV1.contains(codigoMunicipioE1));
		System.out.println(sucesso);


		return sucesso;
			
	}

	

}
