package com.sap.timp.pageObjectModel.TCC.GestaoDeCreditoTributarioICMS.Executados.Registro1200;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class Executados1200EditarPO extends TestBaseMassiel{
	@FindBy(xpath = "//span[text()=\"Gest�o de Cr�dito Tribut�rio ICMS\"]")
	public WebElement gestaoCredito;

	@FindBy(xpath = "//li[@identifier=\"accordion-item-taxCreditManagement\"]/div/span[text()=\"Executados\"]")
	public WebElement executados;

	@FindBy(xpath = "//li[@identifier=\"accordion-item-register1200Execution\"]")
	public WebElement executadosregistro1200;

	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement btnUltimaPagina;

	@FindBy(xpath = "//span[text()=\"Executar\"]")
	public WebElement btnExecutar;

	@FindBy(xpath = "//td[@id=\"companyInput\"]/div/div/div[2]")
	public WebElement cboEmpresa;

	@FindBy(xpath = "//li[contains(@class, \"list-item\") and @tabindex=\"0\" and @id][1]")
	public WebElement opcionEmpresa;

	@FindBy(xpath = "//div[@class= \"list-option\"][1]/div/div[2]")
	public WebElement opcionCheck;

	@FindBy(xpath = "//td[@id=\"stateInput\"]/div/div/div[2]")
	public WebElement cboEstado;

	@FindBy(xpath = "//td[@id=\"branchInput\"]/div/div/div[2]")
	public WebElement cboFilial;

	@FindBy(xpath = "//td[@id=\"subInput\"]/div/div/span")
	public WebElement Subperiodo;

	@FindBy(xpath = "//td[@id=\"subInput\"]/div/div/input")
	public WebElement SubperiodoInput;

	@FindBy(xpath = "//div[@id=\"executor-head\"][1]/div[2]/div[@class=\"sub-periodo\"]")
	public WebElement inputSubperiodo;


	@FindBy(xpath = "//button[text()=\"Executar\"]")
	public WebElement btnExecutar2;

	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement btnGravar;

	public Executados1200EditarPO() {
		PageFactory.initElements(driver, this);
	}

	public boolean editar() {

		System.out.println("---------- Editar --------- " );
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

		gestaoCredito.click();
		sleep(2000);

		executados.click();
		sleep(4000);

		executadosregistro1200.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		btnUltimaPagina.click();
		invisibilityOfElementOverlay();

		String idRegistroConfiguracaoEExecucao = idObter("id-GCT-ICMS-ConfiguracaoEExecucacoRegistro1200Executados");
		System.out.println("");
		System.out.println("ID Registro Excecutado: " + idRegistroConfiguracaoEExecucao);

		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistroConfiguracaoEExecucao+"\"]/div[1]/div"));
		WebElement a�ao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistroConfiguracaoEExecucao+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));

		menu.click();
		sleep(1000);
		a�ao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		String valor = inputSubperiodo.getText();
		System.out.println("valor actual " + valor);

		btnExecutar.click();
		invisibilityOfElementOverlay();

		waitExpectElement(cboEmpresa);
		sleep(2000);

		cboEmpresa.click();
		sleep(1000);
		opcionEmpresa.click();
		sleep(1000);

		attributeToBeXpath("//td[@id=\"stateInput\"]/div", "class", "base-MultipleSelect3 required");
		cboEstado.click();
		sleep(1000);
		opcionCheck.click();
		closeSelectTypeCheckbox(cboEstado);
		sleep(1000);

		actionsMoveToElementElement(Subperiodo);
		Subperiodo.click();
		sleep(2000);


		WebElement flechaAtrasCalendario = driver.findElement(By.xpath("//div[@tabindex=\"0\" and @class=\"left-arrow icon icon-font-Sign-and-Symbols icon-leftmenu\"]"));
		flechaAtrasCalendario.click();

		String anio = "2016";

		WebElement anioCalendar = driver.findElement(By.xpath("//div[@tabindex=\"0\" and contains(@class, \"year\") and text()=\"" + anio + "\"]"));
		anioCalendar.click();
		sleep(3000);


		WebElement monthCalendar = driver.findElement(By.xpath("//div[@tabindex=\"0\" and contains(@class, \"month\") and text()=\"Fev\"]"));
		monthCalendar.click();
		sleep(3000);

		WebElement subperiodoCalendar = driver.findElement(By.xpath("//span[@class=\"subperiod-text\" and text()=\"1M\"]"));
		subperiodoCalendar.click();
		sleep(3000);


		String enviar = SubperiodoInput.getAttribute("value");
		enviar = enviar.replace(" ", "");
		System.out.println("Texto Enviado " + enviar);

		btnExecutar2.click();
		sleep(1000);

		invisibilityOfElementOverlay();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		String nuevoTexto = inputSubperiodo.getText();
		nuevoTexto = nuevoTexto.replace("-", ",");
		nuevoTexto = nuevoTexto.replace(" ", "");
		System.out.println("nuevo Texto " + nuevoTexto);
		
		boolean sucesso= nuevoTexto.contains(enviar);
		System.out.println(sucesso);
		return sucesso;
	}

}

