package com.sap.timp.pageObjectModel.MDR.LivrosFiscais.ParametrosParaLivroICMSST;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class ParametrosParaLivroICMSSTVisualizarPO extends TestBaseMassiel{
	
	@FindBy(xpath = "//span[text()=\"Livros Fiscais\"]")
	public WebElement livrosfiscais;
	
	@FindBy(xpath = "//span[text()=\"Par�metros para Livro ICMS ST\"]")
	public WebElement parametrosparalivroicmsst;
	
	@FindBy(xpath = "//div[contains(@class, \"icon-right\")][2]")
	public WebElement ultimaPagina;
	
	@FindBy(xpath = "//span[@id=\"bookType\"]")
	public WebElement tipolvro;
	
	@FindBy(xpath = "//span[@id=\"company\"]")
	public WebElement empresa;
	
	@FindBy(xpath = "//span[@id=\"state\"]")
	public WebElement ufFilial;
	
	@FindBy(xpath = "//span[@id=\"branch\"]")
	public WebElement filial;
	
	@FindBy(xpath = "//span[@id=\"tax\"]")
	public WebElement tributo;
	
	@FindBy(xpath = "//span[@id=\"effectiveStartDate\"]")
	public WebElement dataInicio;
	
	@FindBy(xpath = "//span[@id=\"effectiveEndDate\"]")
	public WebElement dataVigencia;
	
	@FindBy(xpath = "//span[@id=\"branchMDRInformation\"]")
	public WebElement informacionMDRFilial;
	
	@FindBy(xpath = "//span[@id=\"branchStateSt\"]")
	public WebElement camposInformacaoMDRFilialUFST;
	
	@FindBy(xpath = "//span[@id=\"branchState\"]  ")
	public WebElement  camposInformacaoMDRFilialUF;
	
	@FindBy(xpath = "//span[@id=\"stRegistrationMDRInformation\"]")
	public WebElement  Informa��oMDRInscri��oST;
	
	@FindBy(xpath = "//span[@id=\"stRegistrationMDRInformationFields\"]")
	public WebElement  CampodeInforma��oMDRInscri��oST;
	
	@FindBy(xpath = "//span[@id=\"movementOriginInformation\"]")
	public WebElement  Informa��oOrigemdoMovimento;
	
	@FindBy(xpath = "//span[@id=\"movementOriginState\"]")
	public WebElement  CamposdeInforma��oOrigemdoMovimentoUF;
	
	@FindBy(xpath = "//span[@id=\"movementOriginBranch\"]")
	public WebElement  CamposdeInforma��oOrigemdoMovimentoUFdoParceiro;
	
	@FindBy(xpath = "//span[@id=\"movementOriginTax\"]")
	public WebElement  CamposdeInforma��oOrigemdoMovimentoTributo;
	
	@FindBy(xpath = "//span[@id=\"adjustmentsInformation\"]")
	public WebElement  Informa��odeAjustes;
	
	@FindBy(xpath = "//span[@id=\"adjustmentsInformationFields\"]")
	public WebElement  CamposdeInforma��odeAjustes;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione Tipo de Livro\"]")
	public WebElement tipolvro1;
	
	@FindBy(xpath = "//div[contains(@class,\"companyId_0_0\")]/div/div[2]/div/div/div/div[1]/div[1]")
	public WebElement empresa1;
	
	@FindBy(xpath = "//div[contains(@class,\"stateId_0_1\")]/div/div[2]/div/div/div/div[1]/div[1]")
	public WebElement ufFilial1;
	
	@FindBy(xpath = "//div[contains(@class,\"branchId_0_1\")]/div/div[2]/div/div/div/div[1]/div[1]")
	public WebElement filial1;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione Tributo\"]")
	public WebElement tributo1;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione a data de in�cio de vig�ncia\"]")
	public WebElement dataInicio1;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione a data de fim de vig�ncia\"]")
	public WebElement dataVigencia1;
	
	@FindBy(xpath = "//div[contains(@class,\"branchStructureHash_0_2\")]/div[1]/div[2]/div/div[1]/div[2]/input")
	public WebElement informacionMDRFilial1;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione Campos de Informa��o MDR Filial UF ST\"]")
	public WebElement camposInformacaoMDRFilialUFST1;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione Campos de Informa��o MDR Filial UF da Filial\"]")
	public WebElement  camposInformacaoMDRFilialUF1;
	
	@FindBy(xpath = "//div[contains(@class,\"stRegistrationStructureHash_0_5\")]/div[1]/div[2]/div/div[1]/div[2]/input")
	public WebElement  Informa��oMDRInscri��oST1;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione Campos de Informa��o MDR Inscri��o ST\"]")
	public WebElement  CampodeInforma��oMDRInscri��oST1;
	
	@FindBy(xpath = "//div[contains(@class,\"movementOriginStructureHash_0_6\")]/div[1]/div[2]/div/div[1]/div[2]/input")
	public WebElement  Informa��oOrigemdoMovimento1;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione Campos de Informa��o Origem do Movimento UF da Filial\"]")
	public WebElement  CamposdeInforma��oOrigemdoMovimentoUF1;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione Campos de Informa��o Origem do Movimento UF do Parceiro\"]")
	public WebElement  CamposdeInforma��oOrigemdoMovimentoUFdoParceiro1;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione Campos de Informa��o Origem do Movimento Tributo\"]")
	public WebElement  CamposdeInforma��oOrigemdoMovimentoTributo1;
	
	@FindBy(xpath = "//div[contains(@class,\"adjustmentsStructureHash_0_8\")]/div[1]/div[2]/div/div[1]/div[2]/input")
	public WebElement  Informa��odeAjustes1;
	
	@FindBy(xpath = "//div[contains(@class,\"adjustmentsFields_0_8\")]/div/div[2]/div/div/div/div[1]")
	public WebElement  CamposdeInforma��odeAjustes1;
	
	public  ParametrosParaLivroICMSSTVisualizarPO() {
		PageFactory.initElements(driver, this);
		
	}
	
	public ArrayList<Boolean> Visualizar() {
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		livrosfiscais.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		parametrosparalivroicmsst.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		ultimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		String idRegistro =  idObter("ParametrosParaLivroICMSST");
		
		sleep(2000);
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement visualizar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));

		menu.click();
		sleep(1000);
		visualizar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		String textotipolvro = tipolvro.getText();
		String textoempresa = empresa.getText();
		String textoufFilial = ufFilial.getText();
		String textofilial = filial.getText();
		String textotributo = tributo.getText();
		String textodataInicio = dataInicio.getText();
		String textoinformacionMDRFilial = informacionMDRFilial.getText();
		
		
		String textocamposInformacaoMDRFilialUFST = camposInformacaoMDRFilialUFST.getText();
		textocamposInformacaoMDRFilialUFST = textocamposInformacaoMDRFilialUFST.toLowerCase();
		
		String textocamposInformacaoMDRFilialUF =  camposInformacaoMDRFilialUF.getText();
		textocamposInformacaoMDRFilialUF = textocamposInformacaoMDRFilialUF.toLowerCase();
		
		
		String textoInforma��oMDRInscri��oST = Informa��oMDRInscri��oST.getText();
		
		String textoCampodeInforma��oMDRInscri��oST = CampodeInforma��oMDRInscri��oST.getText();
		textoCampodeInforma��oMDRInscri��oST = textoCampodeInforma��oMDRInscri��oST.toLowerCase();
		
		String textoInforma��oOrigemdoMovimento = Informa��oOrigemdoMovimento.getText();
		String textoCamposdeInforma��oOrigemdoMovimentoUF = CamposdeInforma��oOrigemdoMovimentoUF.getText();
		textoCamposdeInforma��oOrigemdoMovimentoUF = textoCamposdeInforma��oOrigemdoMovimentoUF.toLowerCase();
		
		String textoCamposdeInforma��oOrigemdoMovimentoUFdoParceiro = CamposdeInforma��oOrigemdoMovimentoUFdoParceiro.getText();
		textoCamposdeInforma��oOrigemdoMovimentoUFdoParceiro = textoCamposdeInforma��oOrigemdoMovimentoUFdoParceiro.toLowerCase();
		String textoCamposdeInforma��oOrigemdoMovimentoTributo = CamposdeInforma��oOrigemdoMovimentoTributo.getText();
		textoCamposdeInforma��oOrigemdoMovimentoTributo = textoCamposdeInforma��oOrigemdoMovimentoTributo.toLowerCase();
		String textoInforma��odeAjustes = Informa��odeAjustes.getText();
		textoInforma��odeAjustes = textoInforma��odeAjustes.toLowerCase();
		
		
		System.out.println("Tipo do Livro: " + textotipolvro);
		System.out.println("Empresa: " + textoempresa);
		System.out.println("UF da Filial: " + textoufFilial);
		System.out.println("Filial: " + textofilial );
		System.out.println("Tributo: " + textotributo);
		System.out.println("Data de Inicio de Vig�ncia: " + textodataInicio);
		System.out.println("Informa��o MDR Filial: " + textoinformacionMDRFilial);
		System.out.println("Campos de Informa��o de MDR de Filial - UF ST: " + textocamposInformacaoMDRFilialUFST);
		System.out.println("Campos de Informa��o de MDR de Filial - UF: " + textocamposInformacaoMDRFilialUF);
		System.out.println("Informa��o MDR Inscri��o ST: " + textoInforma��oMDRInscri��oST);
		System.out.println("Campos de Informa��o MDR Inscri��o ST: " + textoCampodeInforma��oMDRInscri��oST);
		System.out.println("Informa��o Origem do Movimento: " + textoInforma��oOrigemdoMovimento);
		System.out.println("Campos de Informa��o Origem do Movimento - UF: " + textoCamposdeInforma��oOrigemdoMovimentoUF);
		System.out.println("Campos de Informa��o Origem do Movimento - UF do Parceiro: " + textoCamposdeInforma��oOrigemdoMovimentoUFdoParceiro);
		System.out.println("Campos de Informa��o Origem do Movimento - Tributo: " + textoCamposdeInforma��oOrigemdoMovimentoTributo);
		System.out.println("Informa��o de Ajustes: " + textoInforma��odeAjustes);
		
		sleep(2000);
		biblioteca.click();
		
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		ultimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		menu1.click();
		sleep(2000);
		editar.click();
		sleep(5000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(8000);
		//attributeToBeXpath("//div[@class=\"field-element adjustmentsFields_0_8\"]/div", "class", "input-element-wrapper");
		
		sleep(2000);
		String textotipolvro1 = tipolvro1.getAttribute("value");
		String textoempresa1 = empresa1.getText();
		String textoufFilial1 = ufFilial1.getText();
		String textofilial1 = filial1.getText();
		String textotributo1 = tributo1.getAttribute("value");
		String textodataInicio1 = dataInicio1.getAttribute("value");
		String textoinformacionMDRFilial1 = informacionMDRFilial1.getAttribute("value");
		
		
		String textocamposInformacaoMDRFilialUFST1 = camposInformacaoMDRFilialUFST1.getAttribute("value");
		textocamposInformacaoMDRFilialUFST1 = textocamposInformacaoMDRFilialUFST1.toLowerCase();
		String textocamposInformacaoMDRFilialUF1 =  camposInformacaoMDRFilialUF1.getAttribute("value");
		textocamposInformacaoMDRFilialUF1 = textocamposInformacaoMDRFilialUF1.toLowerCase();
		
		
		
		String textoInforma��oMDRInscri��oST1 = Informa��oMDRInscri��oST1.getAttribute("value");
		
		String textoCampodeInforma��oMDRInscri��oST1 = CampodeInforma��oMDRInscri��oST1.getAttribute("value");
		textoCampodeInforma��oMDRInscri��oST1 =textoCampodeInforma��oMDRInscri��oST1.toLowerCase();
		
		String textoInforma��oOrigemdoMovimento1 = Informa��oOrigemdoMovimento1.getAttribute("value");
		
		
		String textoCamposdeInforma��oOrigemdoMovimentoUF1 = CamposdeInforma��oOrigemdoMovimentoUF1.getAttribute("value");
		textoCamposdeInforma��oOrigemdoMovimentoUF1= textoCamposdeInforma��oOrigemdoMovimentoUF1.toLowerCase();
		
		String textoCamposdeInforma��oOrigemdoMovimentoUFdoParceiro1 = CamposdeInforma��oOrigemdoMovimentoUFdoParceiro1.getAttribute("value");
		textoCamposdeInforma��oOrigemdoMovimentoUFdoParceiro1 = textoCamposdeInforma��oOrigemdoMovimentoUFdoParceiro1.toLowerCase();
		String textoCamposdeInforma��oOrigemdoMovimentoTributo1 = CamposdeInforma��oOrigemdoMovimentoTributo1.getAttribute("value");
		textoCamposdeInforma��oOrigemdoMovimentoTributo1 = textoCamposdeInforma��oOrigemdoMovimentoTributo1.toLowerCase();
		
		
		String textoInforma��odeAjustes1 = Informa��odeAjustes1.getAttribute("value");
		textoInforma��odeAjustes1 = textoInforma��odeAjustes1.toLowerCase();
		sleep(2000);
		//String textoCamposdeInforma��odeAjustes1 =  CamposdeInforma��odeAjustes1.getText();

		System.out.println("-------------------------------------------");
		System.out.println("Tipo do Livro: " + textotipolvro1);
		System.out.println("Empresa: " + textoempresa1);
		System.out.println("UF da Filial: " + textoufFilial1);
		System.out.println("Filial: " + textofilial1);
		System.out.println("Tributo: " + textotributo1);
		System.out.println("Data de Inicio de Vig�ncia: " + textodataInicio1);
		System.out.println("Informa��o MDR Filial: " + textoinformacionMDRFilial1);
		System.out.println("Campos de Informa��o de MDR de Filial - UF ST: " + textocamposInformacaoMDRFilialUFST1);
		System.out.println("Campos de Informa��o de MDR de Filial - UF: " + textocamposInformacaoMDRFilialUF1);
		System.out.println("Informa��o MDR Inscri��o ST: " + textoInforma��oMDRInscri��oST1);
		System.out.println("Campos de Informa��o MDR Inscri��o ST: " + textoCampodeInforma��oMDRInscri��oST1);
		System.out.println("Informa��o Origem do Movimento: " + textoInforma��oOrigemdoMovimento1);
		System.out.println("Campos de Informa��o Origem do Movimento - UF: " + textoCamposdeInforma��oOrigemdoMovimentoUF1);
		System.out.println("Campos de Informa��o Origem do Movimento - UF do Parceiro: " + textoCamposdeInforma��oOrigemdoMovimentoUFdoParceiro1);
		System.out.println("Campos de Informa��o Origem do Movimento - Tributo: " + textoCamposdeInforma��oOrigemdoMovimentoTributo1);
		System.out.println("Informa��o de Ajustes: " + textoInforma��odeAjustes1);
		sleep(2000);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		sucesso.add(textotipolvro1.contains(textotipolvro));
	 	sucesso.add(textoempresa1.contains(textoempresa));
	 	sucesso.add(textoufFilial1.contains(textoufFilial));
		sucesso.add(textofilial1.contains(textofilial));
		sucesso.add(textotributo1.contains(textotributo));
		sucesso.add(textodataInicio1.contains(textodataInicio));
		sucesso.add(textoinformacionMDRFilial1.contains(textoinformacionMDRFilial));
		sucesso.add(textocamposInformacaoMDRFilialUFST1.contains(textocamposInformacaoMDRFilialUFST));
		sucesso.add(textocamposInformacaoMDRFilialUF1.contains(textocamposInformacaoMDRFilialUF));
		sucesso.add(textoInforma��oMDRInscri��oST1.contains(textoInforma��oMDRInscri��oST));
		sucesso.add(textoCampodeInforma��oMDRInscri��oST1.contains(textoCampodeInforma��oMDRInscri��oST));
		sucesso.add(textoInforma��oOrigemdoMovimento1.contains(textoInforma��oOrigemdoMovimento));
		sucesso.add(textoCamposdeInforma��oOrigemdoMovimentoUF1.contains(textoCamposdeInforma��oOrigemdoMovimentoUF));//aqui
		sucesso.add(textoCamposdeInforma��oOrigemdoMovimentoUFdoParceiro1.contains(textoCamposdeInforma��oOrigemdoMovimentoUFdoParceiro));
		sucesso.add(textoCamposdeInforma��oOrigemdoMovimentoTributo1.contains(textoCamposdeInforma��oOrigemdoMovimentoTributo));
		sucesso.add(textoInforma��odeAjustes1.contains(textoInforma��odeAjustes));
		System.out.println(sucesso);
	     	
		return sucesso;
		
	}

}
