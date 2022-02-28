package com.sap.timp.pageObjectModel.TCC.GestaoDeCreditoTributarioPISCONFINS.ApuracaoDeCreditoTributarioCOFINS.ConfiguracaoEExecucao.RegistroM610;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class RegistroM610VisualizarPO extends TestBaseSteven{
	
	@FindBy(xpath = "//span[text()=\"Gest�o de Cr�dito Tribut�rio PIS/COFINS\"]")
	public WebElement gestaoCredito;
	
	@FindBy(xpath = "//span[text()=\"Apura��o de Cr�dito Tribut�rio COFINS\"]")
	public WebElement apuracaocreditocofins;
	

	@FindBy(xpath = "//li[@identifier=\"accordion-item-pisCalculationConfiguration\" and @tabindex=\"0\"]")
	public WebElement configuracaoEExecucao;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-registerM610\"]")
	public WebElement registroM610;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Indicador de natureza da reten��o na Fonte \"]")
	public WebElement indicador1;
	
	@FindBy(xpath = "//div[@id=\"indNatRet\"]/div/div[2]")
	public WebElement indicador;
	

	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;

	@FindBy(xpath = "//input[@placeholder=\"Selecionar Empresa\"]")
	public WebElement empresa;
	
	@FindBy(xpath = "//div[@id=\"uf\"]/div/div[1]/div/div/div/div[@class=\"componentName\"]")
	public WebElement uf;
	
	@FindBy(xpath = "//div[@id=\"branch\"]/div/div[1]/div/div/div/div[@class=\"componentName\"]")
	public WebElement filial;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Tributo\"]")
	public WebElement tributo;
	
	@FindBy(xpath = "//div[@id=\"reg\"]/div/div/input")
	public WebElement registro;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar C�digo da Contribui��o social apurada no periodo \"]")
	public WebElement codigoContruicao;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Valor de Receita Bruta \"]")
	public WebElement valorReceitaBruta;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Valor da Base de C�lculo da Contribui��o \"]")
	public WebElement valorBase;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Valor total da contribui��o social apurada \"]")
	public WebElement contribuicaoSocialApurada;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Valor total dos ajustes de acr�scimo \"]")
	public WebElement ajustesAcrescimo;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Valor total dos ajustes de redu��o \"]")
	public WebElement ajusteReducao;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Valor total da contribui��o do periodo \"]")
	public WebElement contribuicaoPeriodo;
		
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;

	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"N�o\"]")
	public WebElement nao;


	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	public RegistroM610VisualizarPO() {

		PageFactory.initElements(driver, this);
	}

	public ArrayList<Boolean> visualizar() {


		sleep(300);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		gestaoCredito.click();
		sleep(2000);
		apuracaocreditocofins.click();
		sleep(2000);
		configuracaoEExecucao.click();
		sleep(2000);
		registroM610.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		siguiente.click();

		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		String idRegistro = idObter("GestaoCreditoTributarioCOFINSRegistroM610");
		System.out.println("ID Registro: " + idRegistro);

		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"visualizar\"]"));
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		editar.click();
		sleep(2000);
		waitExpectXpath("//div[@id=\"branch\"]/div/div[1]/div/div/div[@class=\"componentToSearch\"]");
		waitExpectXpath("//div[@id=\"uf\"]/div/div[1]/div/div/div[@class=\"componentToSearch\"]");
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String empresaV = empresa.getAttribute("value");
		String ufV = uf.getText();
		String filialV = filial.getText();
		String tributoV = tributo.getAttribute("value");
		String registroV = registro.getAttribute("value");
		String codigoContruicaoV = codigoContruicao.getAttribute("value");
		String valorReceitaBrutaV = valorReceitaBruta.getAttribute("value");
		String valorBaseV = valorBase.getAttribute("value");
		String contribuicaoSocialApuradaV = contribuicaoSocialApurada.getAttribute("value");
		String ajustesAcrescimoV = ajustesAcrescimo.getAttribute("value");
		String ajusteReducaoV = ajusteReducao.getAttribute("value");
		String contribuicaoPeriodoV = contribuicaoPeriodo.getAttribute("value");

		
		System.out.println("-----------Visualizar------------");
		System.out.println(empresaV);
		System.out.println(ufV);
		System.out.println(filialV);
		System.out.println(tributoV);
		System.out.println(registroV);
		System.out.println(codigoContruicaoV);
		System.out.println(valorReceitaBrutaV);
		System.out.println(valorBaseV);
		System.out.println(contribuicaoSocialApuradaV);
		System.out.println(ajustesAcrescimoV);
		System.out.println(ajusteReducaoV);
		System.out.println(contribuicaoPeriodoV);

		
		sleep(3000);
		
		biblioteca.click();
		
		sleep(6000);
		

		int botaoNao = rows("//button[text()=\"N�o\"]");
		
		if (botaoNao > 0) {
			nao.click();
		}
		
		sleep(7000);
		waitExpectElement(siguiente);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);


		menu = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div"));
		editar = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		editar.click();
		sleep(2000);
		waitExpectXpath("//div[@id=\"branch\"]/div/div[1]/div/div/div[@class=\"componentToSearch\"]");
		waitExpectXpath("//div[@id=\"uf\"]/div/div[1]/div/div/div[@class=\"componentToSearch\"]");
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(6000);
		
		
		String empresaE = empresa.getAttribute("value");
		String ufE = uf.getText();
		String filialE = filial.getText();
		String tributoE = tributo.getAttribute("value");
		String registroE = registro.getAttribute("value");
		String codigoContruicaoE = codigoContruicao.getAttribute("value");
		String valorReceitaBrutaE = valorReceitaBruta.getAttribute("value");
		String valorBaseE = valorBase.getAttribute("value");
		String contribuicaoSocialApuradaE = contribuicaoSocialApurada.getAttribute("value");
		String ajustesAcrescimoE = ajustesAcrescimo.getAttribute("value");
		String ajusteReducaoE = ajusteReducao.getAttribute("value");
		String contribuicaoPeriodoE = contribuicaoPeriodo.getAttribute("value");

		System.out.println("-----------Detalhes------------");
		System.out.println(empresaE);
		System.out.println(ufE);
		System.out.println(filialE);
		System.out.println(tributoE);
		System.out.println(registroE);
		System.out.println(codigoContruicaoE);
		System.out.println(valorReceitaBrutaE);
		System.out.println(valorBaseE);
		System.out.println(contribuicaoSocialApuradaE);
		System.out.println(ajustesAcrescimoE);
		System.out.println(ajusteReducaoE);
		System.out.println(contribuicaoPeriodoE);

		
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		sucesso.add(empresaE.equals(empresaV));
		sucesso.add(ufE.equals(ufV));
		sucesso.add(filialE.equals(filialV));
		sucesso.add(tributoE.equals(tributoV));
		sucesso.add(registroE.equals(registroV));
		sucesso.add(codigoContruicaoE.equals(codigoContruicaoV));
		sucesso.add(valorReceitaBrutaE.equals(valorReceitaBrutaV));
		sucesso.add(valorBaseE.equals(valorBaseV));
		sucesso.add(contribuicaoSocialApuradaE.equals(contribuicaoSocialApuradaV));
		sucesso.add(ajustesAcrescimoE.equals(ajustesAcrescimoV));
		sucesso.add(ajusteReducaoE.equals(ajusteReducaoV));
		sucesso.add(contribuicaoPeriodoE.equals(contribuicaoPeriodoV));

		System.out.println(sucesso);
		
		return sucesso;
		
	}

}
