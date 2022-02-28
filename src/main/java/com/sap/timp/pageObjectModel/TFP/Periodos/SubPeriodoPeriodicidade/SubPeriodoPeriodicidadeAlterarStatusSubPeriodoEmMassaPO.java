package com.sap.timp.pageObjectModel.TFP.Periodos.SubPeriodoPeriodicidade;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseKenssy;

public class SubPeriodoPeriodicidadeAlterarStatusSubPeriodoEmMassaPO extends TestBaseKenssy{

	@FindBy(xpath = "//li[@identifier=\"accordion-item-openedSubperiods\"]")
	public WebElement subPeriodoPeriodicidad;
	
	@FindBy(xpath = "//button/span[text()=\"Alterar status Per�odo/Sub Per�odo\"]")
	public WebElement alterarStatus;	
	
	@FindBy(xpath = "//div[@id=\"type\"]/div/div[2]")
	public WebElement selecAlterarStatus;
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and text()=\"Subper�odo\"]")
	public WebElement opcSelecAlterarStatus;
	
	@FindBy(xpath = "//body")
	public WebElement clickAfuera;
	
	//DATOS PARA FILTRAR
		//EMPRESA
		@FindBy(xpath = "//div[@id=\"company\"]/div/div/div[2]")
		public WebElement empresa;
			
			@FindBy(xpath = "//div[contains(@class,\"list-option\")]/div[@id=\"3000\"]/div/label/span")
			public WebElement opcEmpresaTQ1;
			@FindBy(xpath = "//div[contains(@class,\"list-option\")]/div[@id=\"6000\"]/div/label/span")
			public WebElement opcEmpresaTC2;
			@FindBy(xpath = "//div[contains(@class,\"list-option\")]/div[@id=\"3000\"]/div/label/span")
			public WebElement opcEmpresaTP1;
	
		//FILIAL
		@FindBy(xpath = "//div[@id=\"uf\"]/div/div/div[2]")
		public WebElement uf;
		
		@FindBy(xpath = "//div[contains(@class,\"list-option\")]/div[@id=\"BA\"]/div/label/span")
		public WebElement ufTQ1;
		@FindBy(xpath = "//div[contains(@class,\"list-option\")]/div[@id=\"RJ\"]/div/label/span")
		public WebElement ufTC2;
		@FindBy(xpath = "//div[contains(@class,\"list-option\")]/div[@id=\"BA\"]/div/label/span")
		public WebElement ufTP1;
		
		
					
	//DATOS PARA ALTERAR STATUS
	//EMPRESA
		@FindBy(xpath = "//tr[@class=\"company-wrapper\"]//div[@id=\"company\"]/div/div/div[2]")
		public WebElement empresaAS;
		
		@FindBy(xpath = "//div[contains(@class,\"list-option\")]/div[@id=\"3000\"]/div/label/span")
		public WebElement opcEmpresaASTQ1;
		@FindBy(xpath = "//div[contains(@class,\"list-option\")]/div[@id=\"6000\"]/div/label/span")
		public WebElement opcEmpresaASTC2;
		@FindBy(xpath = "//div[contains(@class,\"list-option\")]/div[@id=\"3000\"]/div/label/span")
		public WebElement opcEmpresaASTP1;
		
	//ESTADO
		@FindBy(xpath = "//tr[@class=\"uf-wrapper\"]//div[@id=\"uf\"]/div/div/div[2]")
		public WebElement estadoAS;
	
		@FindBy(xpath = "//div[contains(@class,\"list-option\")]/div[@id=\"BA\"]/div/label/span")
		public WebElement opcEstadoASTQ1;
		@FindBy(xpath = "//div[contains(@class,\"list-option\")]/div[@id=\"RJ\"]/div/label/span")
		public WebElement opcEstadoASTC2;
		@FindBy(xpath = "//div[contains(@class,\"list-option\")]/div[@id=\"BA\"]/div/label/span")
		public WebElement opcEstadoASTP1;
		
	//FILIAL
		@FindBy(xpath = "//tr[@class=\"branch-wrapper\"]//div[@id=\"branch\"]/div/div/div[2]")
		public WebElement filialAS;
	
		@FindBy(xpath = "//div[contains(@class,\"list-option\")]/div[@id=\"0031\"]/div/label/span")
		public WebElement opcFilialASTQ1;
		@FindBy(xpath = "//div[contains(@class,\"list-option\")]/div[@id=\"0001\"]/div/label/span")
		public WebElement opcFilialASTC2;
		@FindBy(xpath = "//div[contains(@class,\"list-option\")]/div[@id=\"0031\"]/div/label/span")
		public WebElement opcFilialASTP1;
		
	//ANIO
		@FindBy(xpath = "//tr[@class=\"year-wrapper\"]//div[@id=\"year\"]/div/div/div[2]")
		public WebElement anioAS;
		@FindBy(xpath = "//div[contains(@class,\"list-option\")]/div[@id=\"2012\"]/div/label/span")
		public WebElement opcAnioAS;
	
	//TRIBUTO
		@FindBy(xpath = "//tr[@class=\"tax-wrapper\"]//div[@id=\"tax\"]/div/div/div[2]")
		public WebElement tributoAS;
		@FindBy(xpath = "//div[contains(@class,\"list-option\")]/div[@id=\"00\"]/div/label/span")
		public WebElement opcTributoAS;	
		
	//FILIAL
		@FindBy(xpath = "//tr[@class=\"month-wrapper\"]//div[@id=\"month\"]/div/div/div[2]")
		public WebElement mesAS;
	
		@FindBy(xpath = "//div[contains(@class,\"list-option\")]/div[@id=\"03\"]/div/label/span")
		public WebElement opcMesAS1;
		@FindBy(xpath = "//div[contains(@class,\"list-option\")]/div[@id=\"04\"]/div/label/span")
		public WebElement opcMesAS2;
		@FindBy(xpath = "//div[contains(@class,\"list-option\")]/div[@id=\"05\"]/div/label/span")
		public WebElement opcMesAS3;	
		
	@FindBy(xpath = "//div[@class=\"dialog-buttons\"]/button[text()=\"Aplicar\"]")
	public WebElement aplicar;
	
	@FindBy(xpath = "//div[@class=\"items\"]//div/div[2]/div/div/label[@for=\"0_0\"]/span")
	public WebElement alterarStatusPara200Prefechamento;
	
	@FindBy(xpath = "//button[text()=\"Alterar status\"]")
	public WebElement alterarStatusBtn;
	
	@FindBy(xpath = "//button[text()=\"Fechar\"]")
	public WebElement fecharSub;
	
	@FindBy(xpath = "//div[@class=\"items\"]//div/div[2]/div/div/label/span")
	public WebElement alterarStatusPara100Aberto;
	
	public SubPeriodoPeriodicidadeAlterarStatusSubPeriodoEmMassaPO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> alterarSubPeriodoEmMassa() {
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
		subPeriodoPeriodicidad.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		alterarStatus.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		selecAlterarStatus.click();
		sleep(2000);
		opcSelecAlterarStatus.click();
		sleep(2000);
		
		empresaAS.click();
		sleep(1000);
		
		if(tq1 == true) {
			opcEmpresaASTQ1.click();
			sleep(1000);
			closeSelectTypeCheckbox(empresaAS);
			sleep(3000);
		}else if (tc2 == true) {
			opcEmpresaASTC2.click();
			sleep(1000);
			closeSelectTypeCheckbox(empresaAS);
			sleep(3000);
		}else {
			opcEmpresaASTP1.click();
			sleep(1000);
			closeSelectTypeCheckbox(empresaAS);
			sleep(3000);
		}
		
		estadoAS.click();
		sleep(1000);
		
		if(tq1 == true) {
			opcEstadoASTQ1.click();
			sleep(1000);
			closeSelectTypeCheckbox(estadoAS);
			sleep(3000);
		}else if (tc2 == true) {
			opcEstadoASTC2.click();
			sleep(1000);
			closeSelectTypeCheckbox(estadoAS);
			sleep(3000);
		}else {
			opcEstadoASTP1.click();
			sleep(1000);
			closeSelectTypeCheckbox(estadoAS);
			sleep(3000);
		}
		
		filialAS.click();
		sleep(1000);
		
		if(tq1 == true) {
			opcFilialASTQ1.click();
			sleep(1000);
			closeSelectTypeCheckbox(filialAS);
			sleep(3000);
		}else if (tc2 == true) {
			opcFilialASTC2.click();
			sleep(1000);
			closeSelectTypeCheckbox(filialAS);
			sleep(3000);
		}else {
			opcFilialASTP1.click();
			sleep(1000);
			closeSelectTypeCheckbox(filialAS);
			sleep(3000);
		}
		
		
		tributoAS.click();
		sleep(2000);
		opcTributoAS.click();
		sleep(2000);
		clickAfuera.click();
		sleep(2000);
		
		
		
		anioAS.click();
		sleep(2000);
		opcAnioAS.click();
		sleep(2000);
		clickAfuera.click();
		sleep(2000);
		
		
		mesAS.click();
		sleep(2000);
			opcMesAS1.click();
			sleep(2000);
			opcMesAS2.click();
			sleep(2000);
			opcMesAS3.click();
			sleep(2000);
		closeSelectTypeCheckbox(mesAS);
		sleep(2000);
		
		aplicar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		alterarStatusPara200Prefechamento.click();
		sleep(2000);
		
		alterarStatusBtn.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);	
		
		
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		System.out.println("----Status 2do registro = 200 - Pre fechamento ----");
		int rows = driver.findElements(By.xpath("//div[@id=\"subPeriodTable1\"]//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		int f = 1;
		for (int i = 0; i < rows; i++) {

			String status = driver
					.findElement(By.xpath("//div[@id=\"subPeriodTable1\"]//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["
							+ rows + "]/div[8]/div"))
					.getText();
			System.out.println(" Status: "+status);
			sucesso.add(status.contains("200 - Pr�-Fechamento"));

			f = f + 1;
		}
		
		
		
		
		//**ALTERAR A 100 ABERTO
		
		alterarStatus.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		selecAlterarStatus.click();
		sleep(2000);
		opcSelecAlterarStatus.click();
		sleep(2000);
		
		empresaAS.click();
		sleep(1000);
		
		if(tq1 == true) {
			opcEmpresaASTQ1.click();
			sleep(1000);
			closeSelectTypeCheckbox(empresaAS);
			sleep(3000);
		}else if (tc2 == true) {
			opcEmpresaASTC2.click();
			sleep(1000);
			closeSelectTypeCheckbox(empresaAS);
			sleep(3000);
		}else {
			opcEmpresaASTP1.click();
			sleep(1000);
			closeSelectTypeCheckbox(empresaAS);
			sleep(3000);
		}
		
		estadoAS.click();
		sleep(1000);
		
		if(tq1 == true) {
			opcEstadoASTQ1.click();
			sleep(1000);
			closeSelectTypeCheckbox(estadoAS);
			sleep(3000);
		}else if (tc2 == true) {
			opcEstadoASTC2.click();
			sleep(1000);
			closeSelectTypeCheckbox(estadoAS);
			sleep(3000);
		}else {
			opcEstadoASTP1.click();
			sleep(1000);
			closeSelectTypeCheckbox(estadoAS);
			sleep(3000);
		}
		
		filialAS.click();
		sleep(1000);
		
		if(tq1 == true) {
			opcFilialASTQ1.click();
			sleep(1000);
			closeSelectTypeCheckbox(filialAS);
			sleep(3000);
		}else if (tc2 == true) {
			opcFilialASTC2.click();
			sleep(1000);
			closeSelectTypeCheckbox(filialAS);
			sleep(3000);
		}else {
			opcFilialASTP1.click();
			sleep(1000);
			closeSelectTypeCheckbox(filialAS);
			sleep(3000);
		}
		
		
		tributoAS.click();
		sleep(2000);
		opcTributoAS.click();
		sleep(2000);
		clickAfuera.click();
		sleep(2000);
		
		
		
		anioAS.click();
		sleep(2000);
		opcAnioAS.click();
		sleep(2000);
		clickAfuera.click();
		sleep(2000);
		
		
		mesAS.click();
		sleep(2000);
			opcMesAS1.click();
			sleep(2000);
			opcMesAS2.click();
			sleep(2000);
			opcMesAS3.click();
			sleep(2000);
		clickAfuera.click();
		sleep(2000);
		
		
		aplicar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		alterarStatusPara100Aberto.click();
		sleep(2000);
		
		alterarStatusBtn.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sucesso = new ArrayList<Boolean>();
		
		System.out.println(" ");
		System.out.println("----Status 2do registro = 100 - Aberto ----");
		int rows3 = driver.findElements(By.xpath("//div[@id=\"subPeriodTable1\"]//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		int h = 1;
		for (int i = 0; i < rows3; i++) {

			String status = driver
					.findElement(By.xpath("//div[@id=\"subPeriodTable1\"]//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["
							+ rows3 + "]/div[8]/div"))
					.getText();
			System.out.println(" Status: "+status);
			sucesso.add(status.contains("100 - Aberto"));

			h = h + 1;
		}
		
		System.out.println("");
		System.out.println(sucesso);
		
		return sucesso;
		
	}
}
