package com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.CodigosDasObriga�oesDeICMSaRecolher;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class CodigosDasObriga�oesDeICMSaRecolherDetalhesPO extends TestBaseSteven {
	
	
	@FindBy(xpath = "//span[text()=\"Tabelas de Apoio - SPED\"]")
	public WebElement tabelaApoioSped;
	
	@FindBy(xpath = "//span[text()=\"5.4 C�digos das Obriga��es de ICMS a Recolher\"]")
	public WebElement codigosdasobriga�oesdeicmsarecolher;
	
	@FindBy(xpath = "//span[text()=\"Novo C�digo de Obriga��es de ICMS a Recolher\"]")
	public WebElement novocodigodeobriga�oes;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher o C�digo de Obriga��es de ICMS\"]")
	public WebElement codigodeobriga�oesdeicms;
	
	@FindBy(xpath = "//textarea[@placeholder=\"Preencher a descri��o do C�digo das Obriga��es de ICMS a Recolher\"]")
	public WebElement descricao;
	

	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement siguiente;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione a Data de Inicio de Vig�ncia \"]")
	public WebElement datavigencia;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"N�o\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	

	@FindBy(xpath = "//div[@id=\"detail-description\"][1]/div[2]/div")
	public WebElement codigoObrigacaoICMSD;
	@FindBy(xpath = "//div[@id=\"detail-description\"][2]/div[2]/div")
	public WebElement descricaoD;
	@FindBy(xpath = "//div[@id=\"detail-description\"][3]/div[2]/div")
	public WebElement ativoD;



	@FindBy(xpath = "//span[@id=\"codObrigacoesIcms\"]")
	public WebElement codigoObrigacaoICMSV;
	@FindBy(xpath = "//span[@id=\"descricao\"]")
	public WebElement descricaoV;
	@FindBy(xpath = "//span[@id=\"inativo\"]")
	public WebElement ativoV;



	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement fechar;
	public CodigosDasObriga�oesDeICMSaRecolherDetalhesPO() {

		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> detalhes() {
		sleep(2000);
		tabelaApoioSped.click();
		sleep(2000);
		
		codigosdasobriga�oesdeicmsarecolher.click();
		
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro = idObter("codigosdasobrigacoesdeicmsarecolher");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div"));
		WebElement a�ao = driver.findElement(
				By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Detalhes\"]"));

		sleep(2000);
		menu.click();
		sleep(1000);

		a�ao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(5000);

		String codigoObrigacaoICMSD1 = codigoObrigacaoICMSD.getText();
		String descricaoD1 = descricaoD.getText();
		String ativoD1 = ativoD.getText();



		System.out.println(codigoObrigacaoICMSD1);
		System.out.println(descricaoD1);
		System.out.println(ativoD1);



		sleep(2000);
		fechar.click();

		actionsMoveToElementElement(menu);

		menu = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div"));
		a�ao = driver.findElement(
				By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));

		menu.click();
		sleep(1000);
		a�ao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		String codigoObrigacaoV1 = codigoObrigacaoICMSV.getText();
		String descricaoV1 = descricaoV.getText();
		String ativoV1 = ativoV.getText();



		System.out.println(codigoObrigacaoV1);
		System.out.println(descricaoV1);
		System.out.println(ativoV1);


		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();

		sucesso.add(codigoObrigacaoV1.contains(codigoObrigacaoICMSD1));
		sucesso.add(descricaoV1.contains(descricaoD1));
		sucesso.add(ativoV1.contains(ativoD1));



		System.out.println(sucesso);

		return sucesso;
		
	}
	
	

}
