package com.sap.timp.pageObjectModel.TCC.GestaoDeCreditoTributarioPISCONFINS.GestaoDeCreditoTributarioPIS.ConfiguracaoEExecucao.Registro1220;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class Registro1220EditarPO extends TestBaseSteven {

	@FindBy(xpath = "//span[text()=\"Gest�o de Cr�dito Tribut�rio PIS/COFINS\"]")
	public WebElement gestaoCredito;

	@FindBy(xpath = "//span[text()=\"Gest�o de Cr�dito Tribut�rio PIS\"]")
	public WebElement gestaocreditopis;

	@FindBy(xpath = "//div[@class=\"left\"]/div/div[2]/ul/li[6]/ul/li[1]/ul/li[1]")
	public WebElement configuracaoEExecucao;

	@FindBy(xpath = "//li[@identifier=\"accordion-item-register1220\"]")
	public WebElement registro1220;

	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;

	@FindBy(xpath = "//div[@class=\"tr\" and @data-id][1]/div[2]/div")
	public WebElement id;

	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;

	@FindBy(xpath = "//span[text()=\"Novo Registro 1220\"]")
	public WebElement novo;

	@FindBy(xpath = "//div[@id=\"tax\"]/div/div[2]/div/div[2]")
	public WebElement tributo;

	@FindBy(xpath = "//div[text()=\"ICMS\"]")
	public WebElement tributoO;

	@FindBy(xpath = "//div[@id=\"company\"]/div/div[1]/div[2]")
	public WebElement empresa;

	@FindBy(xpath = "//label[@for=\"check-1000\"]/span")
	public WebElement empresaO;

	@FindBy(xpath = "//div[@id=\"uf\"]/div/div[1]/div[2]")
	public WebElement uf;

	@FindBy(xpath = "//label[@for=\"check-SP\"]/span")
	public WebElement ufO;
	
	@FindBy(xpath = "//div[@class=\"list-option\"]/div/div[2]")
	public WebElement uf2;

	@FindBy(xpath = "//div[@id=\"branch\"]/div/div[1]/div[2]")
	public WebElement filial;

	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label/span")
	public WebElement filialO;

	@FindBy(xpath = "//div[@id=\"origCred\"]/div/div[2]")
	public WebElement origemcredito;

	@FindBy(xpath = "//div[@id=\"vlCred\"]/div/div[2]")
	public WebElement valorcredito;

	@FindBy(xpath = "//li[@id][2]")
	public WebElement opcao;

	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcao1;

	@FindBy(xpath = "//li[@id][3]")
	public WebElement opcaotp1;

	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;

	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;

	@FindBy(xpath = "//button[text()=\"Gravar\"]")
	public WebElement gravar2;

	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;

	@FindBy(xpath = "//button[text()=\"Aplicar\"]")
	public WebElement aplicar;

	@FindBy(xpath = "//button[text()=\"Fechar\"]")
	public WebElement fechar;

	@FindBy(xpath = "//button[text()=\"N�o\"]")
	public WebElement nao;

	@FindBy(xpath = "//div[@id=\"multipleControlerId-SP\"]")
	public WebElement uf1;

	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div[2]")
	public WebElement uftp1;

	@FindBy(xpath = "//div[@id=\"multipleControlerId-BA\"]")
	public WebElement uftp12;

	@FindBy(xpath = "//div[@id=\"multipleControlerId-3000_BA_0031\"]")
	public WebElement filialtp1;
	
	@FindBy(xpath = "//div[@id=\"multipleControlerId-RJ\"]")
	public WebElement uftc2;

	

	@FindBy(xpath = "//div[@id=\"multipleControlerId-1000_SP_0001\"]")
	public WebElement filial1;
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Empresa\"]")
	public WebElement empresa1;

	@FindBy(xpath = "//div[@id=\"multipleControlerId-1010_SP_0003\"]")
	public WebElement filial2;

	@FindBy(xpath = "//div[@id=\"componentToSearchId-1000_SP_0014\"]")
	public WebElement filialtc2;

	@FindBy(xpath = "//div[@id=\"multipleControlerId-1100_RJ_0001\"]")
	public WebElement filialtc21;
	public Registro1220EditarPO() {

		PageFactory.initElements(driver, this);
	}

	public boolean editar() {

		String url = driver.getCurrentUrl();

		boolean tc2 = false;
		boolean tp1 = false;
		boolean tq1 = false;
		if (url.contains("tc2")) {
			tc2 = true;
		} else if (url.contains("tp1")) {
			tp1 = true;
		} else {
			tq1 = true;
		}

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		gestaoCredito.click();
		sleep(2000);
		gestaocreditopis.click();
		sleep(2000);
		configuracaoEExecucao.click();
		sleep(2000);
		registro1220.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		siguiente.click();

		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		String idRegistro = idObter("GestaoCr�ditoTribut�rioPISRegistro1220");
		System.out.println("ID Registro: " + idRegistro);

		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div"));
		WebElement editar = driver.findElement(
				By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		editar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		sleep(2000);
		if (tp1 == true) {

			waitExpectElement(uf1);
			sleep(2000);
			waitExpectElement(filial1);
			empresa.click();
			sleep(1000);
			opcaotp1.click();
			sleep(1000);

			String empresatexto = empresa1.getAttribute("value");
			System.out.println("Empresa antes de atualizar:" + empresatexto);

			attributeToBeXpath("//div[@id=\"uf\"]/div", "class", "base-MultipleSelect3 required");
			sleep(3000);

			uf.click();
			sleep(1000);
			uftp1.click();
			sleep(1000);
			closeSelectTypeCheckbox(uf);
			sleep(1000);

			attributeToBeXpath("//div[@id=\"branch\"]/div", "class", "base-MultipleSelect3 required");
			sleep(3000);

			filial.click();
			sleep(1000);
			filialO.click();
			sleep(1000);
			closeSelectTypeCheckbox(filial);
			sleep(1000);

			gravar.click();
			sleep(2000);
			waitExpectElement(sim);
			sim.click();
			sleep(2000);
			waitExpectElement(biblioteca);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);

			driver.navigate().refresh();

			sleep(2000);
			waitExpectElement(biblioteca);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			waitExpectElement(uftp12);
			sleep(2000);
			waitExpectElement(filialtp1);
			sleep(2000);

			String empresaatualizada = empresa1.getAttribute("value");
			System.out.println("Empres p�s atualizar:" + empresaatualizada);
			boolean sucesso = false;
			sucesso = empresaatualizada.contains(empresatexto);
			// voltando como era antes de editar
			empresa.click();
			sleep(2000);
			opcao1.click();

			attributeToBeXpath("//div[@id=\"uf\"]/div", "class", "base-MultipleSelect3 required");
			sleep(3000);

			uf.click();
			sleep(1000);
			ufO.click();
			sleep(1000);
			closeSelectTypeCheckbox(uf);
			sleep(1000);

			attributeToBeXpath("//div[@id=\"branch\"]/div", "class", "base-MultipleSelect3 required");
			sleep(3000);

			filial.click();
			sleep(1000);
			filialO.click();
			sleep(1000);
			closeSelectTypeCheckbox(filial);
			sleep(1000);

			gravar.click();
			sleep(2000);
			waitExpectElement(sim);
			sim.click();
			sleep(2000);
			waitExpectElement(biblioteca);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			System.out.println(sucesso);

			return sucesso;

		} else {
			if (tc2 == true) {
				//waitExpectElement(uf1);
				sleep(10000);
				//waitExpectElement(filialtc2);
				empresa.click();
				sleep(1000);
				opcao.click();
				sleep(1000);

				String empresatexto = empresa1.getAttribute("value");
				System.out.println("Empresa antes de atualizar:" + empresatexto);

			//	attributeToBeXpath("//div[@id=\"uf\"]/div", "class", "base-MultipleSelect3 required");
				sleep(8000);

				uf.click();
				sleep(1000);
				uf2.click();
				sleep(1000);
				closeSelectTypeCheckbox(uf);
				sleep(1000);

				attributeToBeXpath("//div[@id=\"branch\"]/div", "class", "base-MultipleSelect3 required");
				sleep(5000);

				filial.click();
				sleep(1000);
				filialO.click();
				sleep(1000);
				closeSelectTypeCheckbox(filial);
				sleep(1000);

				gravar.click();
				sleep(2000);
				waitExpectElement(sim);
				sim.click();
				sleep(2000);
				waitExpectElement(biblioteca);
				invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
				sleep(2000);

				driver.navigate().refresh();

				sleep(2000);
				waitExpectElement(biblioteca);
				invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
				sleep(2000);
				waitExpectElement(uftc2);
				sleep(2000);
				waitExpectElement(filialtc21);
				sleep(2000);

				String empresaatualizada = empresa1.getAttribute("value");
				System.out.println("Empres p�s atualizar:" + empresaatualizada);
				boolean sucesso = false;
				sucesso = empresaatualizada.contains(empresatexto);
				// voltando como era antes de editar
				empresa.click();
				sleep(2000);
				opcao1.click();
				sleep(10000);

			//	attributeToBeXpath("//div[@id=\"uf\"]/div", "class", "base-MultipleSelect3 required");
				sleep(3000);

				uf.click();
				sleep(1000);
				ufO.click();
				sleep(1000);
				closeSelectTypeCheckbox(uf);
				sleep(1000);

				attributeToBeXpath("//div[@id=\"branch\"]/div", "class", "base-MultipleSelect3 required");
				sleep(3000);

				filial.click();
				sleep(1000);
				filialO.click();
				sleep(1000);
				closeSelectTypeCheckbox(filial);
				sleep(1000);

				gravar.click();
				sleep(2000);
				waitExpectElement(sim);
				sim.click();
				sleep(2000);
				waitExpectElement(biblioteca);
				invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
				sleep(2000);
				System.out.println(sucesso);

				return sucesso;
			}else {
		
			waitExpectElement(uf1);
			sleep(2000);
			waitExpectElement(filial1);
			
			empresa.click();
			sleep(1000);
			opcao.click();
			sleep(1000);

			String empresatexto = empresa1.getAttribute("value");
			System.out.println("Empresa antes de atualizar:" + empresatexto);

			attributeToBeXpath("//div[@id=\"uf\"]/div", "class", "base-MultipleSelect3 required");
			sleep(3000);

			uf.click();
			sleep(1000);
			ufO.click();
			sleep(1000);
			closeSelectTypeCheckbox(uf);
			sleep(1000);

			attributeToBeXpath("//div[@id=\"branch\"]/div", "class", "base-MultipleSelect3 required");
			sleep(3000);

			filial.click();
			sleep(1000);
			filialO.click();
			sleep(1000);
			closeSelectTypeCheckbox(filial);
			sleep(1000);

			gravar.click();
			sleep(2000);
			waitExpectElement(sim);
			sim.click();
			sleep(2000);
			waitExpectElement(biblioteca);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);

			driver.navigate().refresh();

			sleep(2000);
			waitExpectElement(biblioteca);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			waitExpectElement(uf1);
			sleep(2000);
			waitExpectElement(filial2);
			sleep(2000);

			String empresaatualizada = empresa1.getAttribute("value");
			System.out.println("Empres p�s atualizar:" + empresaatualizada);
			boolean sucesso = false;
			sucesso = empresaatualizada.contains(empresatexto);
			// voltando como era antes de editar
			empresa.click();
			sleep(2000);
			opcao1.click();

			attributeToBeXpath("//div[@id=\"uf\"]/div", "class", "base-MultipleSelect3 required");
			sleep(3000);

			uf.click();
			sleep(1000);
			ufO.click();
			sleep(1000);
			closeSelectTypeCheckbox(uf);
			sleep(1000);

			attributeToBeXpath("//div[@id=\"branch\"]/div", "class", "base-MultipleSelect3 required");
			sleep(3000);

			filial.click();
			sleep(1000);
			filialO.click();
			sleep(1000);
			closeSelectTypeCheckbox(filial);
			sleep(1000);

			gravar.click();
			sleep(2000);
			waitExpectElement(sim);
			sim.click();
			sleep(2000);
			waitExpectElement(biblioteca);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			System.out.println(sucesso);

			return sucesso;
			}
		}
	}

}
