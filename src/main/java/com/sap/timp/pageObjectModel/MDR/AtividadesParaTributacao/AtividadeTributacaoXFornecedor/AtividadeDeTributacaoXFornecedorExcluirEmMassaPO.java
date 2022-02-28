package com.sap.timp.pageObjectModel.MDR.AtividadesParaTributacao.AtividadeTributacaoXFornecedor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class AtividadeDeTributacaoXFornecedorExcluirEmMassaPO extends TestBaseSteven{
	
	@FindBy(xpath = "//span[text()=\"Atividades para tributa��o\"]")
	public WebElement atividadesTributacao;
	@FindBy(xpath = "//span[text()=\"Atividade de Tributa��o x Fornecedor\"]")
	public WebElement atividadeTributacaoXFornecedor;
	
	
	@FindBy(xpath = "//span[contains(text(),\"Novo\")]")
	public WebElement novo;
	
	@FindBy(xpath = "//div[@id=\"taxActivity\"]/div/div/div[2]")
	public WebElement atividadesparatributacao;
	
	@FindBy(xpath = "//li[@id][2]")
	public WebElement opcaoatividade;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcao;
	
	
	@FindBy(xpath = "//div[@id=\"supplier\"]/div/div/div[2]")
	public WebElement contafornecedor;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Centro\"]")
	public WebElement centro;
	
	@FindBy(xpath = "//div[@id=\"providedInMunicipality\"]/div/div/div[2]")
	public WebElement prestado;
	
	@FindBy(xpath = "//div[@id=\"fiscalNoteCategory\"]/div/div/div[2]")
	public WebElement notafiscal;
	
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	@FindBy(xpath = "//div[@class=\"tr\" and @data-id]/div[4]/div")
	public WebElement motivo;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//button/span[contains(@class,\"icon-persign\")]")
	public WebElement excluirMassa;
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement aceitar;

	@FindBy(xpath = "//div[@class=\" toast-inner\"]")
	public WebElement mensagem;
	
	
	
	public AtividadeDeTributacaoXFornecedorExcluirEmMassaPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		
		sleep(2000);
		atividadesTributacao.click();
		sleep(1000);
		atividadeTributacaoXFornecedor.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		sleep(2000);
		System.out.println(id);
		
		novo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		//Primeiro Registro
		
		atividadesparatributacao.click();
		
		sleep(2000);
		
		opcaoatividade.click();
		
		sleep(2000);
		contafornecedor.click();;
		
		sleep(2000);
		opcao.click();
		
		sleep(2000);
		
		centro.sendKeys("07");
		
		sleep(2000);
		
		prestado.click();
		
		sleep(2000);
		
		opcaoatividade.click();
		
		
		sleep(2000);
		
		notafiscal.click();
		sleep(2000);
		
		opcao.click();
		

		sleep(2000);
		gravar.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		sim.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		novo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		//Segundo Registro
		
		atividadesparatributacao.click();
		
		sleep(2000);
		
		opcaoatividade.click();
		
		sleep(2000);
		contafornecedor.click();;
		
		sleep(2000);
		opcao.click();
		
		sleep(2000);
		
		centro.sendKeys("07");
		
		sleep(2000);
		
		prestado.click();
		
		sleep(2000);
		
		opcaoatividade.click();
		
		
		sleep(2000);
		
		notafiscal.click();
		sleep(2000);
		
		opcao.click();
		
		sleep(2000);
		gravar.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
	
		waitExpectElement(siguiente);
		sleep(2000);
		siguiente.click();
		
		sleep(3000);
		
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

		boolean sucesso = false;
		
		if (idRegistroD1 > idD && idRegistroD2 > idD) {
			sucesso = true;
		}else {
			sucesso = false;
		}
		System.out.println(sucesso);
		
		
		return sucesso;
		
		
	}	
	
	
	public boolean excluir() {
		
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String idRegistro1 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();

		
		WebElement check1 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[2]/label/span"));
		check1.click();
		sleep(1000);
		rows = rows-1;
		
		String idRegistro2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		WebElement check2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[2]/label/span"));
		check2.click();
		
		sleep(1000);
		
		excluirMassa.click();
		sleep(1000);
		waitExpectElement(aceitar);
		sleep(1000);
		aceitar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
		
		driver.navigate().refresh();
		waitExpectElement(siguiente);
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		int id1 = convertToInt(id);
		int id2 = convertToInt(idRegistro1);
		int id3 = convertToInt(idRegistro2);
		
		System.out.println(" Id Ultimo Registro: "+ id1);
		System.out.println("Id Excluir Registro 1: " + id2);
		System.out.println("Id Excluir Registro 2: " + id3);
		
		boolean sucesso = false;
		
		if (id1 != id2 && id1!=id3) {
			sucesso = true;
		}else {
			sucesso=false;
		}
		
		
		
		return sucesso;
	}

}
