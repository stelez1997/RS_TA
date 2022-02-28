package com.sap.timp.pageObjectModel.TCC.GestaoDeCreditoTributarioPISCONFINS.ApuracaoDeCreditoTributarioPIS.ConfiguracaoEExecucao.RegistroM200;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class RegistroM200CriarPO extends TestBaseMassiel{
	
	@FindBy(xpath = "//span[text()=\"Gest�o de Cr�dito Tribut�rio PIS/COFINS\"]")
	public WebElement gestaoCredito;
	
	@FindBy(xpath = "//span[text()=\"Apura��o de Cr�dito Tribut�rio PIS\"]")
	public WebElement apura��oCr�dito;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-pisCalculationConfiguration\"]")
	public WebElement configuracaoEExecucao;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-registerM200\"]")
	public WebElement registroM200;

	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//span[text()=\"Novo Registro M200\"]")
	public WebElement nuevo;
	
	@FindBy(xpath = "//li[@id=\"option-1\"]")
	public WebElement empresaoPC;
	
	@FindBy(xpath = "//div[@id=\"company\"]/div/div[1]/div[2]")
	public WebElement empresa;
	
	@FindBy(xpath = "//div[@id=\"uf\"]/div/div[1]/div[2]")
	public WebElement uf;
	
	@FindBy(xpath = "//div[@id=\"SP\"]")
	public WebElement ufOPC;
	
	@FindBy(xpath = "//div[@id=\"AL\"]")
	public WebElement ufOPC1;
	
	@FindBy(xpath = "//div[@id=\"branch\"]/div/div[1]/div[2]")
	public WebElement filial;
	
	@FindBy(xpath = "//div[@id=\"1000_SP_0001\"]")
	public WebElement filialOPC;
	
	@FindBy(xpath = "//div[@id=\"1000_AL_0008\"]")
	public WebElement filialOPC1;
	
	@FindBy(xpath = "//li[@id=\"option-1\"]")
	public WebElement OPC11;
	
	@FindBy(xpath = "//li[@id=\"1\"]")
	public WebElement OPC1;
	
	@FindBy(xpath = "//li[@id=\"01\"]")
	public WebElement OPC;
	
	@FindBy(xpath = "//div[@id=\"vlTotContNcPer\"]/div/div[2]")
	public WebElement valorTotalContribui��oN�oCumulativaPer�odo;
	
	@FindBy(xpath = "//div[@id=\"vlTotCredDesc\"]/div/div[2]")
	public WebElement valorCr�ditoDescontadoApuradoPr�prioPer�odoEscritura��o;
	
	@FindBy(xpath = "//div[@id=\"vlTotCredDescAnt\"]/div/div[2]")
	public WebElement valorCr�ditoDescontadoApuradoPer�odoAnteriorEscritura��o;
	
	@FindBy(xpath = "//div[@id=\"vlTotContNcDev\"]/div/div[2]")
	public WebElement valorTotalContribui��oN�oCumulativaDevida;
	
	@FindBy(xpath = "//div[@id=\"vlRetNc\"]/div/div[2]")
	public WebElement ValorRetidoFonteDeduzidoPer�odo;
	
	@FindBy(xpath = "//div[@id=\"vlOutDedNc\"]/div/div[2]")
	public WebElement outrasDedu��esPer�odo;
	
	@FindBy(xpath = "//div[@id=\"vlContNcRec\"]/div/div[2]")
	public WebElement valorContribui��oCumulativaRecolherPagar;
	
	@FindBy(xpath = "//div[@id=\"vlTotContCumPer\"]/div/div[2]")
	public WebElement valorTotalContribui��oCumulativaPer�odo;
	
	@FindBy(xpath = "//div[@id=\"vlRetCum\"]/div/div[2]")
	public WebElement valorRetidoFonteDeduzidoPer�odo;
	
	@FindBy(xpath = "//div[@id=\"vlOutDedCum\"]/div/div[2]")
	public WebElement outraDedu��esPer�odo;
	
	@FindBy(xpath = "//div[@id=\"vlContCumRec\"]/div/div[2]")
	public WebElement valordaContribui��oCumulativaRecolherPagar;
	
	@FindBy(xpath = "//div[@id=\"vlTotContRec\"]/div/div[2]")
	public WebElement valorTotalContribui��oRecolherPagarPer�odo;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//Span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//button[text()=\"N�o\"]")
	public WebElement no;
	
	public RegistroM200CriarPO() {

		PageFactory.initElements(driver, this);
	}

	public boolean Criar() {
		String url = driver.getCurrentUrl();

		boolean tp1  = false;
		boolean tc2  = false;
		boolean tq1  = false;

		if (url.contains("tq1")) {
			tq1 = true;
		}else if(url.contains("tc2")){
			tc2 = true;
		}else if(url.contains("tp1")){
			tp1 = true;
		}
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		gestaoCredito.click();
		sleep(2000);
		apura��oCr�dito.click();
		sleep(2000);
		configuracaoEExecucao.click();
		sleep(2000);
		registroM200.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();
		sleep(2000);
		
		int rows = rows("//div[@class=\"tr\" and @data-id]");

		String idRegistro = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[3]/div")).getText();
		System.out.println("Id ultimo registro: " +idRegistro);
		
		nuevo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		empresa.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		empresaoPC.click();
		sleep(10000);
		
		uf.click();
		sleep(2000);
		
		if (tc2 == true) {


			ufOPC1.click();
			sleep(2000);
			
			closeSelectTypeCheckbox(uf);
			sleep(2000);

		}else{
			ufOPC.click();
			sleep(2000);
			
			closeSelectTypeCheckbox(uf);
			sleep(2000);
			
		}
		
		
		sleep(9000);
		filial.click();
		sleep(2000);
		
		if (tc2 == true) {


			filialOPC1.click();
			sleep(2000);
			
			closeSelectTypeCheckbox(filial);
			sleep(2000);

		}else {
			filialOPC.click();
			sleep(2000);
			
			closeSelectTypeCheckbox(filial);
			sleep(2000);
			
		}
		
		valorTotalContribui��oN�oCumulativaPer�odo.click();
		sleep(2000);
		
		if (tc2 == true) {


			OPC11.click();
			sleep(2000);

		}else if (tq1==true ) {
			OPC1.click();
			sleep(2000);
			
		}else {
			OPC11.click();
			sleep(2000);
		}
		
		valorCr�ditoDescontadoApuradoPr�prioPer�odoEscritura��o.click();
		sleep(2000);
		
		if (tc2 == true) {


			OPC11.click();
			sleep(2000);

		}else if (tq1==true ) {
			OPC1.click();
			sleep(2000);
			
		}else {
			OPC11.click();
			sleep(2000);
		}
		
		valorCr�ditoDescontadoApuradoPer�odoAnteriorEscritura��o.click();
		sleep(2000);
		
		if (tc2 == true) {


			OPC11.click();
			sleep(2000);

		}else if (tq1==true ) {
			OPC1.click();
			sleep(2000);
			
		}else {
			OPC11.click();
			sleep(2000);
		}
		
		valorTotalContribui��oN�oCumulativaDevida.click();
		sleep(2000);
		
		if (tc2 == true) {


			OPC11.click();
			sleep(2000);

		}else if (tq1==true ) {
			OPC1.click();
			sleep(2000);
			
		}else {
			OPC11.click();
			sleep(2000);
		}
		
		ValorRetidoFonteDeduzidoPer�odo.click();
		sleep(2000);
		
		if (tc2 == true) {


			OPC11.click();
			sleep(2000);

		}else if (tq1==true ) {
			OPC1.click();
			sleep(2000);
			
		}else {
			OPC11.click();
			sleep(2000);
		}
		
		outrasDedu��esPer�odo.click();
		sleep(2000);
		
		if (tc2 == true) {


			OPC11.click();
			sleep(2000);

		}else if (tq1==true ) {
			OPC1.click();
			sleep(2000);
			
		}else {
			OPC11.click();
			sleep(2000);
		}
		
		valorContribui��oCumulativaRecolherPagar.click();
		sleep(2000);
		
		if (tc2 == true) {


			OPC11.click();
			sleep(2000);

		}else if (tq1==true ) {
			OPC1.click();
			sleep(2000);
			
		}else {
			OPC11.click();
			sleep(2000);
		}
		
		valorTotalContribui��oCumulativaPer�odo.click();
		sleep(2000);
		
		if (tc2 == true) {


			OPC11.click();
			sleep(2000);

		}else if (tq1==true ) {
			OPC1.click();
			sleep(2000);
			
		}else {
			OPC11.click();
			sleep(2000);
		}
		
		valorRetidoFonteDeduzidoPer�odo.click();
		sleep(2000);
		
		if (tc2 == true) {


			OPC11.click();
			sleep(2000);

		}else if (tq1==true ) {
			OPC1.click();
			sleep(2000);
			
		}else {
			OPC11.click();
			sleep(2000);
		}
		
		outraDedu��esPer�odo.click();
		sleep(2000);
		
		if (tc2 == true) {


			OPC11.click();
			sleep(2000);

		}else if (tq1==true ) {
			OPC1.click();
			sleep(2000);
			
		}else {
			OPC11.click();
			sleep(2000);
		}
		
		valordaContribui��oCumulativaRecolherPagar.click();
		sleep(2000);
		
		if (tc2 == true) {


			OPC11.click();
			sleep(2000);

		}else if (tq1==true ) {
			OPC1.click();
			sleep(2000);
			
		}else {
			OPC11.click();
			sleep(2000);
		}
		
		valorTotalContribui��oRecolherPagarPer�odo.click();
		sleep(2000);
		
		if (tc2 == true) {


			OPC11.click();
			sleep(2000);

		}else if (tq1==true ) {
			OPC1.click();
			sleep(2000);
			
		}else {
			OPC11.click();
			sleep(2000);
		}
		
		gravar.click();
		sleep(2000);
		
		sim.click();
		sleep(6000);
		
	//	waitExpectElement(biblioteca);
		sleep(16000);
		
		biblioteca.click();
		sleep(4000);
		
		
		
		int botaoNao = rows("//button[text()=\"N�o\"]");
		
		if (botaoNao > 0) {
			no.click();
		}
		
		sleep(8000);
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		idInserir("Apura��odeCr�ditoTribut�rioPISRegistroM200",id2);
		int idD = convertToInt(idRegistro);
		int id2D = convertToInt(id2);
		
		System.out.println(idD);
		System.out.println(id2D);
		
		boolean sucesso = false;
		if (idD < id2D) {
			sucesso = true;
		}
		
		System.out.println(sucesso);
		
		return sucesso;
	}
}
