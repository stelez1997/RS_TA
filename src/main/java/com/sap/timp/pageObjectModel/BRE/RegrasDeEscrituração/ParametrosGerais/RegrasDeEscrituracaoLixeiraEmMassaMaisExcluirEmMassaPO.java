package com.sap.timp.pageObjectModel.BRE.RegrasDeEscritura��o.ParametrosGerais;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class RegrasDeEscrituracaoLixeiraEmMassaMaisExcluirEmMassaPO extends TestBaseSteven{
	@FindBy(xpath = "//li[@identifier=\"accordion-item-b_rules\"]")
	public WebElement regraDeEscrituracao;
	
	@FindBy(xpath = "//span[contains(text(),\"Nova Regra\")]")
	public WebElement novo;
	
	@FindBy(xpath = "//td[contains(@class, \"title-field\")]/div/div/input")
	public WebElement nome;
	
	@FindBy(xpath = "//td[contains(@class, \"ruletype-field\")]/div/div/div[2]")
	public WebElement tipoDeRegra;
	
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and @id and text()=\"Escritura��o\"][1]")
	public WebElement opcTipoDeRegra;
	
	@FindBy(xpath = "//td[contains(@class, \"tribute-field\")]/div/div/div[2]")
	public WebElement tipoTributo;
	
	@FindBy(xpath = "//div[@class=\"list-option\"]/div/div[text()=\"ICMS\"]")
	public WebElement opcionTipoTributo;
	
	@FindBy(xpath = "//td[contains(@class, \"datastructureCategory-field\")]/div/div/div[2]")
	public WebElement grupoDeEstrutura;
	
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and @id and text()=\"Ajuste\"][1]")
	public WebElement opcionGrupoDeEstrutura;
	
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and @id and text()=\"Ajustes\"][1]")
	public WebElement opcionGrupoDeEstruturatp1;

	
	@FindBy(xpath = "//td[contains(@class, \"datastructure-field\")]/div/div/div[2]")
	public WebElement estruturaDeDatos;
	
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and @id and text()=\"Ajustes Fiscais\"][1]")
	public WebElement opcionEstruturaDeDatos;
	
	@FindBy(xpath = "//td[contains(@class, \"regulation-field\")]/div/div/div[2]")
	public WebElement regulamento;
	
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and @id and text()=\"TA-TESTE\"][1]")
	public WebElement opcionRegulamento;
	
	@FindBy(xpath = "//td[contains(@class, \"EffectiveDateFrom\")]/div/div/input")
	public WebElement dataValidadeDe;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Aplicar\"]")
	public WebElement aplicar;
	
	@FindBy(xpath = "//span[text()=\"Justificativa\"]")
	public WebElement justi;
	
	@FindBy(xpath = "//span[text()=\"Lixeira\"]")
	public WebElement lixeira;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"N�o\"]")
	public WebElement N�o;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	@FindBy(xpath = "//div[@class=\"tr\" and @data-id]/div[4]/div")
	public WebElement motivo;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement aceitar;
	
	@FindBy(xpath = "//span[@id=\"textLabel\"]")
	public WebElement mensagem;
	
	@FindBy(xpath = "//li[@class=\"base-toast  toast-success   \"]/div")
	public WebElement mensagembloqueio;
	
	@FindBy(xpath = "//span[text()=\"Adicionar Caminho\"]")
	public WebElement adicionarCaminho;
	
	
	public RegrasDeEscrituracaoLixeiraEmMassaMaisExcluirEmMassaPO() {

		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> criar() {
		
		String url = driver.getCurrentUrl();
		
		boolean tc2 = false;
		boolean td1 = false;
		boolean tp1 = false;
		boolean tq1 = false;
		
		if (url.contains("tc2")) {
			tc2 = true;
		}else if (url.contains("tp1")) {
			tp1 = true;
		}else if (url.contains("tq1")) {
			tq1 = true;
		}else {
			td1 = true;
		}
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		regraDeEscrituracao.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		

		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		sleep(2000);
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		sleep(2000);
		System.out.println("Ultimo id Na biblioteca:"+id);
	
		novo.click();
		sleep(2000);
		
		
		//Primeiro registro
		waitExpectElement(nome);
		sleep(2000);
		
		nome.click();
		sleep(1000);
		nome.sendKeys("TA-TESTE Escrituracao 1 - N�O MEXER QA");
		sleep(1000);
		
		tipoDeRegra.click();
		sleep(1000);
		opcTipoDeRegra.click();
		sleep(1000);
		
		tipoTributo.click();
		sleep(1000);
		opcionTipoTributo.click();
		closeSelectTypeCheckbox(tipoTributo);
		sleep(1000);
		
		
		grupoDeEstrutura.click();
		sleep(1000);

		if(tp1 == true) {
			opcionGrupoDeEstruturatp1.click();
			sleep(1000);
		}else {
			opcionGrupoDeEstrutura.click();
			sleep(1000);
		}

	
		
		sleep(1000);
		

		actionsMoveToElementXpath("//td[contains(@class,\"EffectiveDateTo\")]/div/div/input");
		estruturaDeDatos.click();
		sleep(1000);
		opcionEstruturaDeDatos.click();
		sleep(1000);
		
		regulamento.click();
		sleep(1000);
		opcionRegulamento.click();
		sleep(1000);
		
		dataValidadeDe.click();
		sleep(1000);
		dataValidadeDe.sendKeys("01/01/2013");
		sleep(2000);
		aplicar.click();
		sleep(2000);
		waitExpectElement(adicionarCaminho);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		biblioteca.click();
	
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(regraDeEscrituracao);
		sleep(2000);
		regraDeEscrituracao.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//-----------SEGUNDO----------------
		novo.click();
		sleep(2000);
		waitExpectElement(nome);
		sleep(2000);
		
		nome.click();
		sleep(1000);
		nome.sendKeys("TA-TESTE Escrituracao 2- N�O MEXER QA");
		sleep(1000);
		
		tipoDeRegra.click();
		sleep(1000);
		opcTipoDeRegra.click();
		sleep(1000);
		
		tipoTributo.click();
		sleep(1000);
		opcionTipoTributo.click();
		closeSelectTypeCheckbox(tipoTributo);
		sleep(1000);
		
		
		grupoDeEstrutura.click();
		sleep(1000);

		if(tp1 == true) {
			opcionGrupoDeEstruturatp1.click();
			sleep(1000);
		}else {
			opcionGrupoDeEstrutura.click();
			sleep(1000);
		}

	
		
		sleep(1000);
		

		actionsMoveToElementXpath("//td[contains(@class,\"EffectiveDateTo\")]/div/div/input");
		estruturaDeDatos.click();
		sleep(1000);
		opcionEstruturaDeDatos.click();
		sleep(1000);
		
		regulamento.click();
		sleep(1000);
		opcionRegulamento.click();
		sleep(1000);
		
		dataValidadeDe.click();
		sleep(1000);
		dataValidadeDe.sendKeys("01/01/2013");
		
		sleep(2000);
		aplicar.click();
		sleep(2000);
		waitExpectElement(adicionarCaminho);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		biblioteca.click();

		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(regraDeEscrituracao);
		sleep(2000);
		regraDeEscrituracao.click();
		sleep(2000);
		waitExpectElement(siguiente);
		sleep(2000);
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String idRegistro1 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		rows = rows-1;
		
		String idRegistro2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		sleep(2000);
		System.out.println(id);
		System.out.println(idRegistro1);
		System.out.println(idRegistro2);
		
		double idD = convertToDouble(id);
		double idRegistroD1 = convertToDouble(idRegistro1);
		double idRegistroD2 = convertToDouble(idRegistro2);

		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		boolean sucesso1 =false;
		if (idRegistroD1 > idD && idRegistroD2 > idD) {
			System.out.println("Sim s�o os ids criados nesse teste");
			sucesso1 = true;
			sucesso.add(sucesso1);
		}else {
			System.out.println("N�o s�o os ids criados nesse teste");
			sucesso1 = false;
			sucesso.add(sucesso1);
		}
		//Lixeira em massa
		
		int rows1 = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		WebElement check1 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows1+"]/div[2]/label/span"));
		check1.click();
		sleep(2000);
		
		rows1 = rows1-1;
		
		WebElement check2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows1+"]/div[2]/label/span"));
		check2.click();
		sleep(2000);
		
		WebElement lixeiraemmassa = driver.findElement(By.xpath("//span[@class=\"button-icon icon-font-Finance-and-Office icon-trash\"]"));
		lixeiraemmassa.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		//--------------------------- excluir em massa ---------------------------------
		//waitExpectElement(mensagem);
		//sleep(2000);
		waitExpectElement(mensagembloqueio);
		sleep(2000);
		lixeira.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(siguiente);
		sleep(2000);
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		int rows2 = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String idRegistro1lixeira = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows2+"]/div[3]/div")).getText();
		
		rows2 = rows2-1;
		
		String idRegistro2lixeira = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows2+"]/div[3]/div")).getText();
		
		sleep(2000);
		System.out.println(idRegistro1lixeira);
		System.out.println(idRegistro2lixeira);
		
		double idRegistroD1lixeira = convertToDouble(idRegistro1lixeira);
		double idRegistroD2lixeira = convertToDouble(idRegistro2lixeira);

	
		boolean sucesso2 =false;
		if (idRegistroD1lixeira == idRegistroD1 && idRegistroD2lixeira == idRegistroD2) {
			System.out.println("S�o os mesmos id's que foram criado");
			sucesso2 = true;
			sucesso.add(sucesso2);
		}else {
			System.out.println("N�o s�o os mesmos id's que foram criado");
			sucesso2 = false;
			sucesso.add(sucesso2);
		}
		
		int rows3 = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		WebElement check3 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows3+"]/div[2]/label/span"));
		check3.click();
		sleep(2000);
		
		rows3 = rows3-1;
		
		WebElement check4 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows3+"]/div[2]/label/span"));
		check4.click();
		sleep(2000);
		
		WebElement excluirmassa = driver.findElement(By.xpath("//span[@class=\"button-icon icon-font-Sign-and-Symbols icon-persign\"]"));
		excluirmassa.click();
		
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		//waitExpectElement(mensagem);
		//sleep(2000);
		waitExpectElement(mensagembloqueio);
		sleep(2000);
		lixeira.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(siguiente);
		sleep(2000);
		siguiente.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows4=driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String idB = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows4+"]/div[3]/div")).getText();

		sleep(2000);
		
		System.out.println("Id do �ltimo item na lixeira: "+idB);
		
		double idBD = convertToDouble(idB);
		//compara pra ver se o novo id criado � realmente o ultimo
		boolean sucesso3 = false;
		if (idBD != idRegistroD1lixeira && idBD!=idRegistroD2lixeira) {
			System.out.println("Os ids n�o constam na biblioteca");
			sucesso3 = true;
			sucesso.add(sucesso3);
		}else {
			System.out.println("Os ids constam na biblioteca");
			sucesso3=false;
			sucesso.add(sucesso3);
		}
		
		System.out.println(sucesso);
		return sucesso;
		
	}


}
