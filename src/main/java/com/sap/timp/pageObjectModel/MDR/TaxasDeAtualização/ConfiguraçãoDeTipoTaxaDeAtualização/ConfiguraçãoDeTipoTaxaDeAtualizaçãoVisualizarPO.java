package com.sap.timp.pageObjectModel.MDR.TaxasDeAtualiza��o.Configura��oDeTipoTaxaDeAtualiza��o;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class Configura��oDeTipoTaxaDeAtualiza��oVisualizarPO extends TestBaseMassiel{

	@FindBy(xpath = "//li[@identifier=\"accordion-item-updateRates\"]")
	public WebElement taxasDeActualizacao;

	@FindBy(xpath = "//li[@identifier=\"accordion-item-updateRateConfiguration\"]")
	public WebElement configuracaoDeTipoTaxa;

	@FindBy(xpath = "//div[contains(@class, \"icon-left\")][2]")
	public WebElement btnPrimerPagina;
	
	@FindBy(xpath = "//div[contains(@class, \"icon-right\")][2]")
	public WebElement ultimaPagina;

	@FindBy(xpath = "//span[@id=\"indexCode\"]")
	public WebElement codigoIndice;

	@FindBy(xpath = "//span[@id=\"indexName\"]")
	public WebElement nomedo�ndice;

	@FindBy(xpath = "//span[@id=\"indexDescription\"]")
	public WebElement descri��odo�ndice;

	@FindBy(xpath = "//span[@id=\"indexType\"]")
	public WebElement tipo�ndice;

	@FindBy(xpath = "//span[@id=\"coinIndex\"]")
	public WebElement moeda�ndice;

	@FindBy(xpath = "//span[@id=\"indexStartDate\"]")
	public WebElement datadeIniciodeVig�ncia;

	@FindBy(xpath = "//span[@id=\"indexEndDate\"]")
	public WebElement datadeFimdeVig�ncia;

	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;

	@FindBy(xpath = "//div[contains(@class, \"indexCode\")]/div/div[2]/div/div/div[2]/input")
	public WebElement codigoIndice1;

	@FindBy(xpath = "//div[contains(@class, \"indexName\")]/div/div[2]/div/div/div[2]/input")
	public WebElement nomedo�ndice1;

	@FindBy(xpath = "//div[contains(@class, \"indexDescription\")]/div/div[2]/div/div/div[2]/input")
	public WebElement descri��odo�ndice1;

	@FindBy(xpath = "//div[contains(@class, \"indexType\")]/div/div[2]/div/div/div[2]/input")
	public WebElement tipo�ndice1;

	@FindBy(xpath = "//div[contains(@class, \"coinIndex\")]/div/div[2]/div/div/div[2]/input")
	public WebElement moeda�ndice1;

	@FindBy(xpath = "//div[contains(@class, \"indexStartDate\")]/div/div/input")
	public WebElement datadeIniciodeVig�ncia1;

	@FindBy(xpath = "//div[contains(@class, \"indexEndDate \")]/div/div/input")
	public WebElement datadeFimdeVig�ncia1;

	public Configura��oDeTipoTaxaDeAtualiza��oVisualizarPO() {
		PageFactory.initElements(driver, this);
	}


	public ArrayList<Boolean> Visualizar() {

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
//		ultimaPagina.click();
//		sleep(2000);
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		sleep(2000);
		String idRegistro =idObter("configuracaodetipotaxadeatualizacao");
		
		System.out.println(idRegistro);
		sleep(2000);
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement visualizar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));

		menu.click();
		sleep(1000);

		visualizar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		String textoIndice = codigoIndice.getText();
		String textoNomeIndice = nomedo�ndice.getText();
		String textodescri��odo�ndice = descri��odo�ndice.getText();
		String textoNometipo�ndice = tipo�ndice.getText();
		String textoNomemoeda�ndice = moeda�ndice.getText();
		String textodatadeIniciodeVig�ncia = datadeIniciodeVig�ncia.getText();
		String textodatadeFimdeVig�ncia = datadeFimdeVig�ncia.getText();

		System.out.println("CodigoIndice: " + textoIndice);
		System.out.println("Nome do �ndice: " + textoNomeIndice);
		System.out.println("Descri��odo�ndice: " + textodescri��odo�ndice);
		System.out.println("Tipo �ndice: " + textoNometipo�ndice);
		System.out.println("Moeda �ndice: " + textoNomemoeda�ndice);
		System.out.println("Data de Inicio de Vig�nci: " + textodatadeIniciodeVig�ncia);
		System.out.println("Data de Fim de Vig�ncia: " + textodatadeFimdeVig�ncia);

		sleep(2000);
		biblioteca.click();

		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		btnPrimerPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//btnPrimerPagina.click();
		//sleep(2000);
		//invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		//sleep(2000);

		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		menu1.click();
		sleep(2000);
		editar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		String textoIndice1 = codigoIndice1.getAttribute("value");
		String textoNomeIndice1 = nomedo�ndice1.getAttribute("value");
		String textodescri��odo�ndice1 = descri��odo�ndice1.getAttribute("value");
		String textoNometipo�ndice1 = tipo�ndice1.getAttribute("value");
		String textoNomemoeda�ndice1 = moeda�ndice1.getAttribute("value");
		String textodatadeIniciodeVig�ncia1 = datadeIniciodeVig�ncia1.getAttribute("value");
		String textodatadeFimdeVig�ncia1 = datadeFimdeVig�ncia1.getAttribute("value");


		System.out.println("-------------------------------------------");
		System.out.println("CodigoIndice: " + textoIndice1);
		System.out.println("Nome do �ndice: " + textoNomeIndice1);
		System.out.println("Descri��odo�ndice: " + textodescri��odo�ndice1);
		System.out.println("Tipo �ndice: " + textoNometipo�ndice1);
		System.out.println("Moeda �ndice: " + textoNomemoeda�ndice1);
		System.out.println("Data de Inicio de Vig�nci: " + textodatadeIniciodeVig�ncia1);
		System.out.println("Data de Fim de Vig�ncia: " + textodatadeFimdeVig�ncia1);


		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		sucesso.add(textoIndice1.equals(textoIndice));
		sucesso.add(textoNomeIndice1.equals(textoNomeIndice));
		sucesso.add(textodescri��odo�ndice1.equals(textodescri��odo�ndice));
		sucesso.add(textoNometipo�ndice1.equals(textoNometipo�ndice));
		sucesso.add(textoNomemoeda�ndice1.equals(textoNomemoeda�ndice));
		sucesso.add(textodatadeIniciodeVig�ncia1.equals(textodatadeIniciodeVig�ncia));
		sucesso.add(textodatadeFimdeVig�ncia1.equals(textodatadeFimdeVig�ncia));

		return sucesso;
	}

}
