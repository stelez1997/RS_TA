package com.sap.timp.pageObjectModel.TBD.Configuracao.RangeDeNumeracao;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class RangeDeNumeracaoExcluirPO extends TestBaseSteven{
	
	@FindBy(xpath = "//span[text()=\"Configura��o de TBD\"]")
	public WebElement configuracao;
	
	@FindBy(xpath = "//span[text()=\"Configura��o de Range de Numera��o\"]")
	public WebElement configuracaodereangedenumeracao;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement siguiente;

	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;

	public RangeDeNumeracaoExcluirPO() {

		PageFactory.initElements(driver, this);
	}

	public boolean excluir() {
		sleep(2000);
		configuracao.click();
		sleep(2000);

		configuracaodereangedenumeracao.click();

		sleep(2000);

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		siguiente.click();

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		// pega o ultimo id que foi gerado no criar
		String idRegistro = idObter1();

		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div"));
		WebElement excluir = driver.findElement(
				By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Excluir\"]"));

		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		excluir.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		configuracaodereangedenumeracao.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(siguiente);
		sleep(2000);
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		boolean sucesso = false;

		int exclus�o = driver.findElements(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[2]/div")).size();

		if (exclus�o == 0) {
			System.out.println("Registro n�o consta na biblioteca");
			sucesso = true;
		} else {
			System.out.println("Registo consta na biblioteca");
			sucesso = false;
		}
		System.out.println(sucesso);
		return sucesso;
		
	}


}
