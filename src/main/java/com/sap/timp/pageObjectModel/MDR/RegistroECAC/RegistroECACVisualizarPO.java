package com.sap.timp.pageObjectModel.MDR.RegistroECAC;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class RegistroECACVisualizarPO extends TestBaseMassiel {
	@FindBy(xpath = "//span[text()=\"Registro ECAC\"]")
	public WebElement registroecac;

	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//div[contains(@class, \"icon-right\")][2]")
	public WebElement ultimaPagina;

	//Campos de visualizar
	@FindBy(xpath = "//span[@id=\"id\"]")
	public WebElement Id;
	
	@FindBy(xpath = "//span[@id=\"company\"]")
	public WebElement Empresa;
	
	@FindBy(xpath = "//span[@id=\"uf\"]")
	public WebElement UF;
	
	@FindBy(xpath = "//span[@id=\"branch\"]")
	public WebElement Filial;
	
	@FindBy(xpath = "//span[@id=\"tax\"]")
	public WebElement Tributo;
	
	@FindBy(xpath = "//span[@id=\"type\"]")
	public WebElement Tipo;
	
	@FindBy(xpath = "//span[@id=\"revenueCOde\"]")
	public WebElement C�digodaReceita;
	
	@FindBy(xpath = "//span[@id=\"collectionDate\"]")
	public WebElement DatadeArrecada��o;
	
	@FindBy(xpath ="//span[@id=\"expireDate\"]")
	public WebElement DatadeVencimento;
	
	@FindBy(xpath = "//span[@id=\"documentNumber\"]")
	public WebElement N�merodocumento;
	
	@FindBy(xpath = "//span[@id=\"apurationPeriod\"]")
	public WebElement Per�ododeApura��o;
	
	@FindBy(xpath = "//span[@id=\"totalValue\"]")
	public WebElement ValorTotal;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione um(a) Empresa\"]")
	public WebElement Empresa1;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione um(a) UF\"]")
	public WebElement UF1;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione um(a) Filial\"]")
	public WebElement Filial1;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione um(a) Tributo\"]")
	public WebElement Tributo1;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencha a(o) Tipo\"]")
	public WebElement Tipo1;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencha a(o) C�digo da Receita\"]")
	public WebElement C�digodaReceita1;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione um(a) Data de Arrecada��o\"]")
	public WebElement DatadeArrecada��o1;
	
	@FindBy(xpath ="//input[@placeholder=\"Selecione um(a) Data de Vencimento\"]")
	public WebElement DatadeVencimento1;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencha a(o) N�mero do documento\"]")
	public WebElement N�merodocumento1;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione um(a) Per�odo de Apura��o\"]")
	public WebElement Per�ododeApura��o1;
	
	@FindBy(xpath = "//div[@id=\"totalValue\"]/div/div/input")
	public WebElement ValorTotal1;
	
	
	public  RegistroECACVisualizarPO() {
		PageFactory.initElements(driver, this);
	}



	public ArrayList<java.lang.Boolean> visualizar() {
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		registroecac.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		ultimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		String idRegistro = idObter("RegistroECAC");
		System.out.println(idRegistro);
		
		sleep(2000);
		WebElement menu = driver.findElement(By.xpath("//div[contains(@aria-label,\"Id: "+idRegistro+"\")]/div[1]/div"));
		WebElement visualizar = driver.findElement(By.xpath("//div[contains(@aria-label,\"Id: "+idRegistro+"\")]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		
		sleep(2000);
		menu.click();
		sleep(2000);
		visualizar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String textoEmpresa = Empresa.getText();
		String textoUF = UF.getText();
		String textoFilial = Filial.getText();
		String textoTributo = Tributo.getText();
		String textoTipo = Tipo.getText();
		String textoC�digodaReceita = C�digodaReceita.getText();
		String textoDatadeArrecada��o = DatadeArrecada��o.getText();
		String textoDatadeVencimento =  DatadeVencimento.getText();
		String textoN�merodocumento = N�merodocumento.getText();
		String textoPer�ododeApura��o = Per�ododeApura��o.getText();
		String textoValorTotal = ValorTotal.getText();


		System.out.println("-------DATOS DEL VISUALIZAR-----");
		System.out.println("Empresa: " +textoEmpresa );
		System.out.println("UF: " +textoUF );
		System.out.println("Filial: " +textoFilial );
		System.out.println("Tributo: " +textoTributo );
		System.out.println("Tipo: " +textoTipo );
		System.out.println("C�digo da Receita: " +textoC�digodaReceita );
		System.out.println("Data de Arrecada��o: " +textoDatadeArrecada��o );
		System.out.println(" Data de Vencimento: " +textoDatadeVencimento );
		System.out.println("N�mero documento: " +textoN�merodocumento );
		System.out.println("Per�odo de Apura��o: " +textoPer�ododeApura��o  );
		System.out.println("Valor Total: " +textoValorTotal );
        System.out.println("");
		biblioteca.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
		ultimaPagina.click();
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		WebElement menu1 = driver.findElement(By.xpath("//div[contains(@aria-label,\"Id: "+idRegistro+"\")]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[contains(@aria-label,\"Id: "+idRegistro+"\")]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		menu1.click();
		sleep(2000);
		editar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String textoEmpresa1 = Empresa1.getAttribute("value");
		String textoUF1 = UF1.getAttribute("value");
		String textoFilial1 = Filial1.getAttribute("value");
		String textoTributo1 = Tributo1.getAttribute("value");
		String textoTipo1 = Tipo1.getAttribute("value");
		String textoC�digodaReceita1 = C�digodaReceita1.getAttribute("value");
		String textoDatadeArrecada��o1 = DatadeArrecada��o1.getAttribute("value");
		String textoDatadeVencimento1 =  DatadeVencimento1.getAttribute("value");
		String textoN�merodocumento1 = N�merodocumento1.getAttribute("value");
		String textoPer�ododeApura��o1 = Per�ododeApura��o1.getAttribute("value");
		String textoValorTotal1 = ValorTotal1.getAttribute("value");
		
		System.out.println("-----------------------------------------------");
		System.out.println("-------DATOS DEL EDITAR-----");
		System.out.println("Empresa: " +textoEmpresa1 );
		System.out.println("UF: " +textoUF1 );
		System.out.println("Filial: " +textoFilial1 );
		System.out.println("Tributo: " +textoTributo1 );
		System.out.println("Tipo: " +textoTipo1 );
		System.out.println("C�digo da Receita: " +textoC�digodaReceita1 );
		System.out.println("Data de Arrecada��o: " +textoDatadeArrecada��o1 );
		System.out.println(" Data de Vencimento: " +textoDatadeVencimento1);
		System.out.println("N�mero documento: " +textoN�merodocumento1 );
		System.out.println("Per�odo de Apura��o: " +textoPer�ododeApura��o1  );
		System.out.println("Valor Total: " +textoValorTotal1 );
		System.out.println("");
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		sucesso.add(textoEmpresa1.equals(textoEmpresa));
		sucesso.add(textoUF1.equals(textoUF));
		sucesso.add(textoFilial1.equals(textoFilial));
		sucesso.add(textoTributo1.equals(textoTributo));
		sucesso.add(textoTipo1.equals(textoTipo)); 
		sucesso.add(textoC�digodaReceita1.equals(textoC�digodaReceita)); 
		sucesso.add(textoDatadeArrecada��o1.equals(textoDatadeArrecada��o)); 
		sucesso.add(textoDatadeVencimento1.equals(textoDatadeVencimento));   
		sucesso.add(textoN�merodocumento1.equals(textoN�merodocumento)); 
	    sucesso.add(textoPer�ododeApura��o1.equals(textoPer�ododeApura��o)); 
	    sucesso.add(textoValorTotal1.equals(textoValorTotal));
	    System.out.println(sucesso);
		return sucesso;
	}

	
}
