package com.sap.timp.pageObjectModel.DFG.Leiautes.Execucao;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class LeiautesExecucacoFuncionalidades4Pt3PO extends TestBaseFernando{
	@FindBy(xpath = "//span[@class=\"icon icon-font-File-and-Folders icon-layout padding-right \"]")
	public WebElement verLeiautes;
	
	@FindBy(xpath = "//span[text()=\"Raiz\"]")
	public WebElement raiz;
	
	@FindBy(xpath = "//div[contains(@class, \"icon-right\")][2]")
	public WebElement btnUltimaPagina;
		
	@FindBy(xpath = "//span[text()=\"Adicionar bloco\"]")
	public WebElement btnAdicionarBloco;
	
	@FindBy(xpath = "//div[@block-id=\"2\"]/div/div/div[3]/button")
	public WebElement adicionarRegistro3;
	
	@FindBy(xpath = "//span[text()=\"Campos Especiais\"]")
	public WebElement btnCamposEspeciais;
	
	@FindBy(xpath = "//div[@block-id=\"2\"]/div/div/div[@class=\"block-name\"]/div/div[2]/div/div/div[2]/input")
	public WebElement nombreBloco3;
	
	@FindBy(xpath = "//div[@block-id=\"2\"]/div/div/div[@class=\"record-name\"]/div/div[2]/div/div/div[2]/input")
	public WebElement nombreRegistro3;
	
	@FindBy(xpath = "//div/span[text()=\"Ajustes Fiscais\"][1]")
	public WebElement abaAjusteFiscais;
	
	@FindBy(xpath = "//div/span[text()=\"Ajustes\"][1]")
	public WebElement subAbaAjusteFiscais;
	
	@FindBy(xpath = "//div/span[contains(text(),\"C�digo da empresa\")]")
	public WebElement codigoEmpresa;
	
	@FindBy(xpath = "//div/span[contains(text(),\"C�digo da filial\")]")
	public WebElement codigoFilial;
	
	@FindBy(xpath = "//div/span[contains(text(),\"Data de lan�amento\")]")
	public WebElement dataLanzamento;
	
	@FindBy(xpath = "//li[14]/div/div/span[contains(text(),\"Valor do ajuste\")][1]")
	public WebElement valorAjuste;
	
	@FindBy(xpath = "//li[@data-id=\"sf\"]/div/div/span[contains(text(),\"Sequ�ncia\")][1]")
	public WebElement campoSequencia;
	
	@FindBy(xpath = "//div[@class=\"sequence-typeCB\"]/div[3]/label/span")
	public WebElement sequenciamentoLinha;	
	
	@FindBy(xpath = "//button[text()=\"Aplicar\"]")
	public WebElement btnAplicar;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement btnGravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement btnSim;
	
	@FindBy(xpath = "//button[text()=\"N�o\"]")
	public WebElement btnNao;
	
	public LeiautesExecucacoFuncionalidades4Pt3PO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> sequencia() {		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		raiz.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(4000);

		String idRegistro = idObter1();
		//String idRegistro = "1879";
		System.out.println("");
		System.out.println("ID Registro: " + idRegistro);
		System.out.println("");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement a�ao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		System.out.println(idRegistro); // Ultimo registro que es el que se crea con la automatizacion

		menu.click();
		sleep(1000);
		a�ao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnAdicionarBloco.click();
		sleep(2000);
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		adicionarRegistro3.click();
		sleep(2000);
		
		nombreBloco3.sendKeys("Bloco 3");
		sleep(2000);
		
		nombreRegistro3.sendKeys(" Registro 1");
		sleep(2000);
		
		abaAjusteFiscais.click();
		sleep(2000);
		
		subAbaAjusteFiscais.click();
		sleep(2000);
		
		//ARRASTRAR ELEMENTOS
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		actionsMoveToElementXpath("//*[@id=\"block-list-wrapper\"]/div[3]/div[3]/div/div[5]");
		sleep(2000);
		
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		moveToElement(codigoEmpresa, driver.findElement(By.xpath("//div[@block-id=\"2\"]/div[@class=\"columns-container\"]/div")));
		sleep(2000);
		
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		moveToElement(codigoFilial, driver.findElement(By.xpath("//div[@block-id=\"2\"]/div[@class=\"columns-container\"]/div")));
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		moveToElement(dataLanzamento, driver.findElement(By.xpath("//div[@block-id=\"2\"]/div[@class=\"columns-container\"]/div")));
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		moveToElement(valorAjuste, driver.findElement(By.xpath("//div[@block-id=\"2\"]/div[@class=\"columns-container\"]/div")));
		sleep(2000);
		
		abaAjusteFiscais.click();
		sleep(2000);
		
		btnCamposEspeciais.click();
		sleep(2000);
				
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		actionsMoveToElementElement(campoSequencia);
		moveToElement(campoSequencia, driver.findElement(By.xpath("//div[@block-id=\"2\"]/div[@class=\"columns-container\"]/div")));
		sleep(2000);		
		
		waitExpectElement(sequenciamentoLinha);
		sequenciamentoLinha.click();
		sleep(2000);	
	
		btnAplicar.click();
		sleep(2000);
		
		btnGravar.click();
		sleep(3000);
		waitExpectElement(btnNao);
		sleep(2000);
		
		btnNao.click();
		sleep(2000);
		waitExpectElement(btnSim);
		sleep(2000);
		
		btnSim.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int mensaje = driver.findElements(By.xpath("//span[contains(text(),\"O Leiaute foi atualizado com sucesso\")]")).size();
		System.out.println(mensaje);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		if (mensaje > 0) {
			sucesso.add(true);
			
		}else {
			sucesso.add(false);
		}
		
		return sucesso;
	}
}
