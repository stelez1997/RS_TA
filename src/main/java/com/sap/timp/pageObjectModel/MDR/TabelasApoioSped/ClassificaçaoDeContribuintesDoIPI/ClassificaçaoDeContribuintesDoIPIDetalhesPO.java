package com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.Classifica�aoDeContribuintesDoIPI;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class Classifica�aoDeContribuintesDoIPIDetalhesPO extends TestBaseSteven{
	
	@FindBy(xpath = "//span[text()=\"Tabelas de Apoio - SPED\"]")
	public WebElement tabelaApoioSped;
	
	@FindBy(xpath = "//span[text()=\"4.5.5 Classifica��o de Contribuintes do IPI\"]")
	public WebElement classificacaodecontribuintes;
	
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
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement fechar;
	
	
	@FindBy(xpath = "//div[@id=\"detail-description\"][2]/div[2]/div")
	public WebElement tipoAtividadeD;
	@FindBy(xpath = "//div[@id=\"detail-description\"][3]/div[2]/div")
	public WebElement descricaoD;
	@FindBy(xpath = "//div[@id=\"detail-description\"][4]/div[2]/div")
	public WebElement dataVigenciaD;



	@FindBy(xpath = "//span[@id=\"activity-type\"]")
	public WebElement tipoAtividadeV;
	@FindBy(xpath = "//span[@id=\"description\"]")
	public WebElement descricaoV;
	@FindBy(xpath = "//span[@id=\"effective-date-from\"]")
	public WebElement dataVigenciaV;
	public Classifica�aoDeContribuintesDoIPIDetalhesPO() {

		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> detalhes() {
		sleep(2000);
		tabelaApoioSped.click();
		sleep(2000);
		classificacaodecontribuintes.click();
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro = idObter("classificacaodecontibuintessdoipi");

		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div"));
		WebElement a�ao = driver.findElement(
				By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Detalhe\"]"));

		sleep(2000);
		menu.click();
		sleep(1000);
		a�ao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(5000);

		String tipoAtividadeD1 = tipoAtividadeD.getText();
		String descricaoD1 = descricaoD.getText();
		String dataVigenciaD1 = dataVigenciaD.getText();



		System.out.println(tipoAtividadeD1);
		System.out.println(descricaoD1);
		System.out.println(dataVigenciaD1);



		sleep(6000);
		fechar.click();

		actionsMoveToElementElement(menu);

	
		a�ao = driver.findElement(
				By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));

		menu.click();
		sleep(1000);
		a�ao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		String tipoAtividadeV1 = tipoAtividadeV.getText();
		String descricaoV1 = descricaoV.getText();
		String dataVigenciaV1 = dataVigenciaV.getText();



		System.out.println(tipoAtividadeV1);
		System.out.println(descricaoV1);
		System.out.println(dataVigenciaV1);


		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();

		sucesso.add(tipoAtividadeV1.contains(tipoAtividadeD1));
		sucesso.add(descricaoV1.contains(descricaoD1));
		sucesso.add(dataVigenciaV1.contains(dataVigenciaD1));



		System.out.println(sucesso);

		return sucesso;
	}
	

}
