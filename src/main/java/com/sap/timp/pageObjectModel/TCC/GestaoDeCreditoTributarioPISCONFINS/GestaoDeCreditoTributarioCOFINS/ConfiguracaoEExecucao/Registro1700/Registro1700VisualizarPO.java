package com.sap.timp.pageObjectModel.TCC.GestaoDeCreditoTributarioPISCONFINS.GestaoDeCreditoTributarioCOFINS.ConfiguracaoEExecucao.Registro1700;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class Registro1700VisualizarPO extends TestBaseMassiel{
	@FindBy(xpath = "//span[text()=\"Gest�o de Cr�dito Tribut�rio PIS/COFINS\"]")
	public WebElement gestaoCredito;

	@FindBy(xpath = "//span[text()=\"Gest�o de Cr�dito Tribut�rio COFINS\"]")
	public WebElement gestaocreditocofins;

	@FindBy(xpath = "//div[@class=\"left\"]/div/div[2]/ul/li[6]/ul/li[2]/ul/li[1]/div/span[2]")
	public WebElement configuracaoEExecucao;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-register1700\"]")
	public WebElement registro1700;

	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//div[@id=\"company\"]/div/div[1]/div[1]/input")
	public WebElement empresa;
	
	@FindBy(xpath = "//div[@id=\"uf\"]/div/div[1]/div[1]/div[1]")
	public WebElement uf;
	
	@FindBy(xpath = "//div[@id=\"branch\"]/div/div[1]/div[1]/div[1]")
	public WebElement filial;
	
	@FindBy(xpath = "//div[@id=\"indNatRet\"]/div[1]/div[1]/input")
	public WebElement indicadordeNatureza;
	
	@FindBy(xpath = "//div[@id=\"vlRetApu\"]/div[1]/div[1]/input")
	public WebElement valorTotalDaReten��o;
	
	@FindBy(xpath = "//div[@id=\"vlRetDed\"]/div[1]/div[1]/input")
	public WebElement valorDaReten��oDeduzidaDaContribui��o;
	
	@FindBy(xpath = "//div[@id=\"vlRetPer\"]/div[1]/div[1]/input")
	public WebElement valorDaReten��oUtilizadaMediantePedido;
	
	@FindBy(xpath = "//div[@id=\"vlRetDcomp\"]/div[1]/div[1]/input")
	public WebElement ValorDaReten��oUtilizadaMendianteDeclara��o;
	
	@FindBy(xpath = "//div[@id=\"sldRet\"]/div[1]/div[1]/input")
	public WebElement SaldoDeReten��oUtilizarPer�odosDeApura��o;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//button[text()=\"N�o\"]")
	public WebElement no;
	
	
	public  Registro1700VisualizarPO() {

		PageFactory.initElements(driver, this);
	}

	public ArrayList<Boolean> visualizar() {
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		gestaoCredito.click();
		sleep(2000);
		gestaocreditocofins.click();
		sleep(2000);
		configuracaoEExecucao.click();
		sleep(2000);
		registro1700.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("GestionCreditoTributarioCONFINSRegistro1700");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement visualizar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"visualizar\"]"));

		menu.click();
		sleep(1000);
		visualizar.click();
		sleep(9000);
		//waitExpectElement(filial);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(4000);
		
		String empresavisualizar = empresa.getAttribute("value");
		String ufvisualizar = uf.getText();
		String filialvisualizar = filial.getText();
		String indicadordeNaturezavisualizar = indicadordeNatureza.getAttribute("value");
		String valorTotalDaReten��ovisualizar = valorTotalDaReten��o.getAttribute("value");
		String valorDaReten��oDeduzidaDaContribui��ovisualizar = valorDaReten��oDeduzidaDaContribui��o.getAttribute("value");
		String valorDaReten��oUtilizadaMediantePedidovisualizar = valorDaReten��oUtilizadaMediantePedido.getAttribute("value");
		String ValorDaReten��oUtilizadaMendianteDeclara��ovisualizar = ValorDaReten��oUtilizadaMendianteDeclara��o.getAttribute("value");
		String SaldoDeReten��oUtilizarPer�odosDeApura��ovisualizar = SaldoDeReten��oUtilizarPer�odosDeApura��o.getAttribute("value");

		System.out.println(empresavisualizar);
		System.out.println(ufvisualizar);
		System.out.println(filialvisualizar);
		System.out.println(indicadordeNaturezavisualizar);
		System.out.println(valorTotalDaReten��ovisualizar);
		System.out.println(valorDaReten��oDeduzidaDaContribui��ovisualizar);
		System.out.println(valorDaReten��oUtilizadaMediantePedidovisualizar);
		System.out.println(ValorDaReten��oUtilizadaMendianteDeclara��ovisualizar);
		System.out.println(SaldoDeReten��oUtilizarPer�odosDeApura��ovisualizar);
		
		biblioteca.click();
		sleep(4000);
		
		//no.click();
		sleep(2000);
		
		waitExpectElement(siguiente);
		sleep(2000);
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));

		menu1.click();
		sleep(1000);
		editar.click();
		sleep(3000);
	//	waitExpectElement(filial);
		sleep(4000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(4000);
		
		String empresaEditar = empresa.getAttribute("value");
		String ufEditar = uf.getText();
		String filialEditar = filial.getText();
		String indicadordeNaturezaEditar = indicadordeNatureza.getAttribute("value");
		String valorTotalDaReten��oEditar = valorTotalDaReten��o.getAttribute("value");
		String valorDaReten��oDeduzidaDaContribui��oEditar = valorDaReten��oDeduzidaDaContribui��o.getAttribute("value");
		String valorDaReten��oUtilizadaMediantePedidoEditar = valorDaReten��oUtilizadaMediantePedido.getAttribute("value");
		String ValorDaReten��oUtilizadaMendianteDeclara��oEditar = ValorDaReten��oUtilizadaMendianteDeclara��o.getAttribute("value");
		String SaldoDeReten��oUtilizarPer�odosDeApura��oEditar = SaldoDeReten��oUtilizarPer�odosDeApura��o.getAttribute("value");
		
		System.out.println("-------------------------------");
		
		System.out.println(empresaEditar);
		System.out.println(ufEditar);
		System.out.println(filialEditar);
		System.out.println(indicadordeNaturezaEditar);
		System.out.println(valorTotalDaReten��oEditar);
		System.out.println(valorDaReten��oDeduzidaDaContribui��oEditar);
		System.out.println(valorDaReten��oUtilizadaMediantePedidoEditar);
		System.out.println(ValorDaReten��oUtilizadaMendianteDeclara��oEditar);
		System.out.println(SaldoDeReten��oUtilizarPer�odosDeApura��oEditar);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		sucesso.add(empresaEditar.contains(empresavisualizar));
		sucesso.add(ufEditar.contains(ufvisualizar));
		sucesso.add(filialEditar.contains(filialvisualizar));
		sucesso.add(indicadordeNaturezaEditar.contains(indicadordeNaturezavisualizar));
		sucesso.add(valorTotalDaReten��oEditar.contains(valorTotalDaReten��ovisualizar));
		sucesso.add(valorDaReten��oDeduzidaDaContribui��oEditar.contains(valorDaReten��oDeduzidaDaContribui��ovisualizar));
		sucesso.add(valorDaReten��oUtilizadaMediantePedidoEditar.contains(valorDaReten��oUtilizadaMediantePedidovisualizar));
		sucesso.add(ValorDaReten��oUtilizadaMendianteDeclara��oEditar.contains(ValorDaReten��oUtilizadaMendianteDeclara��ovisualizar));
		sucesso.add(SaldoDeReten��oUtilizarPer�odosDeApura��oEditar.contains(SaldoDeReten��oUtilizarPer�odosDeApura��ovisualizar));
		System.out.println(sucesso);
		
		return sucesso;
	}
}
