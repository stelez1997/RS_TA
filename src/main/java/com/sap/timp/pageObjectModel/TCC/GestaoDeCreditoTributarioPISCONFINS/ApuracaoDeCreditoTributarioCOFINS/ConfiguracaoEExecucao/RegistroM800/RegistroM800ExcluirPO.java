package com.sap.timp.pageObjectModel.TCC.GestaoDeCreditoTributarioPISCONFINS.ApuracaoDeCreditoTributarioCOFINS.ConfiguracaoEExecucao.RegistroM800;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class RegistroM800ExcluirPO extends TestBaseSteven{
	
	@FindBy(xpath = "//span[text()=\"Gest�o de Cr�dito Tribut�rio PIS/COFINS\"]")
	public WebElement gestaoCredito;
	
	@FindBy(xpath = "//span[text()=\"Apura��o de Cr�dito Tribut�rio COFINS\"]")
	public WebElement apuracaocreditocofins;
	

	@FindBy(xpath = "//div[@class=\"left\"]/div/div[2]/ul/li[6]/ul/li[4]/ul/li[1]/div/span[2]")
	public WebElement configuracaoEExecucao;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-registerM800\"]")
	public WebElement registrom800;
	
	
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;

	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	@FindBy(xpath = "//div[text()=\"Nenhum resultado\"]")
	public WebElement nenhumResult;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;

	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	
	
	public RegistroM800ExcluirPO() {

		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> excluir() {
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		gestaoCredito.click();
		sleep(2000);
		apuracaocreditocofins.click();
		sleep(2000);
		configuracaoEExecucao.click();
		sleep(2000);
		registrom800.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("GestaoCreditoTributarioCOFINSRegistroM800");
		
		int rows = rows("//div[@class=\"tr\" and @data-id]");
		String idRegistro1 = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[3]/div")).getText();
		System.out.println("Id ultimo registro: " +idRegistro1);
		int id1 = convertToInt(idRegistro1);
		int id2 = convertToInt(idRegistro);
		System.out.println(id1);
		System.out.println(id2);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		if (id1 == id2) {
			System.out.println("Sim, s�o iguais");
			sucesso.add(true);
			
		}else {
			System.out.println("N�o s�o iguais");
			sucesso.add(false);
		}
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement excluir = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Excluir\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(2000);
		
		excluir.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		sim.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		 rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		int id3 = convertToInt(id);
		int id4 = convertToInt(idRegistro);
		System.out.println(id3);
		System.out.println(id4);
		
		if (id3 != id4) {
			sucesso.add(true);
		}
		System.out.println("Excluido com sucesso: " +sucesso);
		
		System.out.println(sucesso);
		
		return sucesso;

		
	}
		

}
