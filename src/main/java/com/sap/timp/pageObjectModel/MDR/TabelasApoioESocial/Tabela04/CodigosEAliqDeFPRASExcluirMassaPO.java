package com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class CodigosEAliqDeFPRASExcluirMassaPO extends TestBaseFernando{
	@FindBy(xpath = "//span[text()=\"Tabelas de Apoio e-Social\"]")
	public WebElement tabelaApoio;
	
	@FindBy(xpath = "//span[text()=\"Tabela 04 - C�digos e Al�q. de FPAS\"]")
	public WebElement tabela04;
	
	@FindBy(xpath = "//span[text()=\"Novo C�digo e Al�q. de FPAS\"]")
	public WebElement novo;	
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Codigo FPAS\"]")
	public WebElement codigo;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Base de C�lculo\"]")
	public WebElement base;
	
	@FindBy(xpath = "//textarea[@placeholder=\"Preencher Descri��o das Atividades\"]")
	public WebElement descricao;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Entidade\"]")
	public WebElement entidade;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Situa��o do Contribuinte\"]")
	public WebElement contribuinte;
	
	@FindBy(xpath = "//textarea[@placeholder=\"Preencher Combina��o de dos C�digos de Terceiros\"]")
	public WebElement combinacao;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher C�digo de Terceiros\"]")
	public WebElement codigodeterceiros;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Al�quota\"]")
	public WebElement aliquota;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Validade De\"]")
	public WebElement datainicio;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement btnUltimaPagina;
	
	@FindBy(xpath = "//button/span[text()=\"Salvar e Novo\"]")
	public WebElement salvarENovo;
	
	@FindBy(xpath = "//span[@class = \"button-icon icon-font-Sign-and-Symbols icon-persign\"]")
	public WebElement btnExcluirMassa;
	
	public CodigosEAliqDeFPRASExcluirMassaPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		sleep(2000);
		tabelaApoio.click();
		
		sleep(2000);
		tabela04.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();		
		
		String id = "0"; // Ultimo ID antes de crear un registro
		
		if(rows > 0) {
			id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
			System.out.println(id);
		}
		
		novo.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		codigo.sendKeys("07");
		sleep(1000);
	
		descricao.sendKeys("Teste da Descri��o");
		sleep(1000);
		
		base.sendKeys("7");		
		sleep(1000);
		
		entidade.sendKeys("entidade");		
		sleep(1000);
		
		contribuinte.sendKeys("situa��o");		
		sleep(1000);
		
		combinacao.sendKeys("combina��o");		
		sleep(1000);
		
		codigodeterceiros.sendKeys("7");		
		sleep(1000);
		
		aliquota.sendKeys("aliquota");		
		sleep(1000);		
		
		String data = fechaActual();
		datainicio.sendKeys(data);
		
		salvarENovo.click();
		sleep(2000);
		
		waitExpectElement(sim);
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		codigo.sendKeys("08");
		sleep(1000);
	
		descricao.sendKeys("Teste da Descri��o");
		sleep(1000);
		
		base.sendKeys("8");		
		sleep(1000);
		
		entidade.sendKeys("entidade 8");		
		sleep(1000);
		
		contribuinte.sendKeys("situa��o 8");		
		sleep(1000);
		
		combinacao.sendKeys("combina��o 8");		
		sleep(1000);
		
		codigodeterceiros.sendKeys("8");		
		sleep(1000);
		
		aliquota.sendKeys("aliquota 8");		
		sleep(1000);		
		
		datainicio.sendKeys(data);
		
		salvarENovo.click();
		sleep(2000);
		
		waitExpectElement(sim);
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);	
		
		biblioteca.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		btnUltimaPagina.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000); 
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		  
		boolean sucesso = false;
		  
		if(rows == 0) {
			return sucesso = true; 
		}
		
		// Se obtiene el ultimo registro de la tabla
		String idUltimoRegistro = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText(); 
		idInserir("CodigosEAliqDeFPRASExcluirMassa",idUltimoRegistro);
		
		int idPenultimoRegistro= convertToInt(idUltimoRegistro) - 1; // Este seria el penultimo registro, equivalente al primer registro que se crea cone sta automatizacion
		  
		sleep(2000); 
		
		  
		int idRegistroAntesDeCrearRegistroNuevo = Integer.valueOf(id); 
		int idUltimoRegistroDespuesDeCrear = Integer.valueOf(idUltimoRegistro);
		
		System.out.println("");
		System.out.println("Ultimo registro antes de registrar los nuevos: " + idRegistroAntesDeCrearRegistroNuevo); 
		System.out.println("Ultimo registro despues de crear los nuevos: " + idUltimoRegistroDespuesDeCrear);
		System.out.println("Ultimo penultimo despues de crear los nuevos: " + idPenultimoRegistro);
		System.out.println("");
		  
		//compara pra ver se o novo id criado � realmente o ultimo		  
		if (idUltimoRegistroDespuesDeCrear > idRegistroAntesDeCrearRegistroNuevo && idPenultimoRegistro > idRegistroAntesDeCrearRegistroNuevo) { 
			sucesso = true; 
		}
		  
		return sucesso;
	}
	
	public boolean exluirMassa() {
		sleep(1000);
		if(!novo.isDisplayed()) {
			return false;
		}
		sleep(2000);
		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000); 
		
		int idUltimoRegistro = convertToInt(idObter("CodigosEAliqDeFPRASExcluirMassa"));
		WebElement marcarCheckbox = driver.findElement(By.xpath("//div[@data-id=\""+idUltimoRegistro+"\"]/div[2]/label/span"));
		System.out.println("Id Ultimo registro: " + idUltimoRegistro); // Ultimo registro que es el que se crea con la automatizacion
		
		sleep(2000);
		marcarCheckbox.click();
		sleep(2000);
		
		int idPenultimoUltimoRegistro = idUltimoRegistro - 1;
		marcarCheckbox = driver.findElement(By.xpath("//div[@data-id=\""+idPenultimoUltimoRegistro+"\"]/div[2]/label/span"));
		System.out.println("Id Penultimo registro: " + idPenultimoUltimoRegistro); // Penultimo registro que es el que se crea con la automatizacion
		
		sleep(2000);
		marcarCheckbox.click();
		sleep(2000);
		
		btnExcluirMassa.click();
		sleep(2000);
		waitExpectElement(sim);
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		driver.navigate().refresh();
		waitExpectXpath("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String idUltimoRegistroDespuesDeEliminar = "0";
		
		if(rows > 0) {
			idUltimoRegistroDespuesDeEliminar = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		}
		
		int id1 = convertToInt(idUltimoRegistroDespuesDeEliminar);
		int id2 = idUltimoRegistro;
		int id3 = idPenultimoUltimoRegistro;
		
		System.out.println("Ultimo registro al eliminar en massa: " + id1); // Ultimo registro despues de excluir el registro de la automatizacion y recargar
		System.out.println("Ultimo registro: " + id2);
		System.out.println("Penultimo registro:" + id3);
		
		boolean sucesso = false;
		
		if (id1 != id2 && id1 != id3) {
			sucesso= true;
		}
		System.out.println(sucesso);
		return sucesso;
	}
}
