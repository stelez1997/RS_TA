package com.sap.timp.pageObjectModel.MDR.Ajustes.AssociacaoCodigosAjustes;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class Associa��oCodigoAjusteVisualizarPO extends TestBaseFernando{
	String URL = driver.getCurrentUrl();
	
	@FindBy(xpath = "//div[@class=\"accordion-container\"]/ul/li/div/span[text()=\"Ajustes\"]")
	public WebElement menuAjustes;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-codeAssoc\"]")
	public WebElement subMenuAjustesAssociacaoCodigoAjuste;
	
	@FindBy(xpath = "//div[contains(@class, \"icon-right\")][2]")
	public WebElement btnUltimaPagina;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	// Datos de visualizar	
	@FindBy(xpath = "//span[@id=\"company\"]")
	public WebElement empresa;
	
	@FindBy(xpath = "//span[@id=\"ufOrigin\"]")
	public WebElement ufOrigem;
	
	@FindBy(xpath = "//span[@id=\"filial\"]")
	public WebElement filial;
	
	@FindBy(xpath = "//span[@id=\"adjustCode\"]")
	public WebElement codigoDeAjuste;

	@FindBy(xpath = "//span[@id=\"officialDesc\"]")
	public WebElement descri��oOficial;	
	
	@FindBy(xpath = "//span[@id=\"officialCode\"]")
	public WebElement codigoOficial;
	
	@FindBy(xpath = "//span[@id=\"spedRegister\"]")
	public WebElement codigoRegistroSPED;
	
	@FindBy(xpath = "//span[@id=\"validity\"]")
	public WebElement dataInicioVigencia;
	
	@FindBy(xpath = "//span[@id=\"ativo\"]")
	public WebElement activo;
	
	@FindBy(xpath = "//span[@id=\"book\"]")
	public WebElement linhaDoLivro;
	
	@FindBy(xpath = "//span[@id=\"tableType\"]")
	public WebElement tipoTabela;
	
	@FindBy(xpath = "//span[@id=\"accCode\"]")
	public WebElement codigosDeContabiliza��o;
	
	@FindBy(xpath = "//span[@id=\"uffDestiny\"]")
	public WebElement ufDestino;
	
	@FindBy(xpath = "//span[@id=\"padrao\"]")
	public WebElement descri��oPadr�o;
	
	@FindBy(xpath = "//span[@id=\"adjustType\"]")
	public WebElement tipoDeAjuste;	
	
	@FindBy(xpath = "//span[@id=\"release\"]")
	public WebElement tipoDeLan�amento;
	
	@FindBy(xpath = "//span[@id=\"tribute\"]")
	public WebElement tributo;
	
	@FindBy(xpath = "//span[@id=\"tributeType\"]")
	public WebElement tipoTributo;
	
	@FindBy(xpath = "//span[@id=\"devolutionField\"]")
	public WebElement devolu��o;
	
	// Datos de editar
	@FindBy(xpath = "//div[@id=\"company\"]/div/div/div/div/div/div[1]")
	public WebElement empresa1;
	
	@FindBy(xpath = "//div[@id=\"ufOrigin\"]/div/div/div/input")
	public WebElement ufOrigem1;
	
	@FindBy(xpath = "//div[@id=\"filial\"]/div/div/div/div/div/div[1]")
	public WebElement filial1;
	
	@FindBy(xpath = "//div[@id=\"adjustCode\"]/div/div/div/div/div/input")
	public WebElement codigoDeAjuste1;
	
	@FindBy(xpath = "//div[@id=\"officialCode\"]/div/div/div/input")
	public WebElement codigoOficial1;
	
	@FindBy(xpath = "//textarea[@placeholder=\"Preencher Descri��o Oficial\"]")
	public WebElement descri��oOficial1;
	
	@FindBy(xpath = "//div[@id=\"spedRegister\"]/div/div/div/input")
	public WebElement codigoDeRegistroSPED1;
	
	@FindBy(xpath = "//div[@id=\"validity\"]/div/div/input")
	public WebElement dataInicioVigencia1;
	
	@FindBy(xpath = "//div[@class=\"switch\"]/div/input")
	public WebElement activo1;
	
	@FindBy(xpath = "//div[@id=\"book\"]/div/div/input")
	public WebElement linhaDoLivro1;
	
	@FindBy(xpath = "//div[@id=\"tableType\"]/div/div/input")
	public WebElement tipoTabela1;
	
	@FindBy(xpath = "//div[@id=\"accCode\"]/div/div/input")
	public WebElement codigosDeContabiliza��o1;
	
	@FindBy(xpath = "//div[@id=\"ufDestiny\"]/div/div/div/div/div/div[1]")
	public WebElement ufDestino1;
	
	@FindBy(xpath = "//div[@id=\"padrao\"]/div/textarea")
	public WebElement descri��oPadr�o1;
	
	@FindBy(xpath = "//div[@id=\"adjustType\"]/div/div/input")
	public WebElement tipoDeAjuste1;
	
	@FindBy(xpath = "//div[@id=\"release\"]/div/div/input")
	public WebElement tipoDeLan�amento1;
	
	@FindBy(xpath = "//div[@id=\"tribute\"]/div/div/input")
	public WebElement tributo1;
	
	@FindBy(xpath = "//div[@id=\"tributeType\"]/div/div/input")
	public WebElement tipoTributo1;
	
	@FindBy(xpath = "//input[@id=\"devolution_btn\"]")
	public WebElement devolu��o1;
	
	public Associa��oCodigoAjusteVisualizarPO(){
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> visualizarAssocia��oCodigoAjuste() {
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		if(URL.contains("td1") || URL.contains("tq1")) {
			waitExpectElement(menuAjustes);
			menuAjustes.click();		
			sleep(2000);
		}		
		
		subMenuAjustesAssociacaoCodigoAjuste.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnUltimaPagina.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("Associa��oCodigoAjuste");
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement a�ao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		
		menu.click();
		sleep(1000);
		a�ao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String textoEmpresa = empresa.getText();
		String textoUFOrigem = ufOrigem.getText();
		String textoFilial = filial.getText();
		String textoCodigoDeAjuste = codigoDeAjuste.getText();
		String textoCodigoOFicial = codigoOficial.getText();
		String textodescri��oOficial = descri��oOficial.getText();
		textodescri��oOficial = capitalize(textodescri��oOficial);
		String textoCodigoRegistroSPED = codigoRegistroSPED.getText();
		String textoDataInicioVigencia = dataInicioVigencia.getText();
		String textoActivo = activo.getText();
		String textoLinhaDoLivro = linhaDoLivro.getText();
		String textoTipoTabela = tipoTabela.getText();
		String textoCodigosDeContabiliza��o = codigosDeContabiliza��o.getText();
		String textoUFDestino = ufDestino.getText();
		String textoDescri��oPadr�o = descri��oPadr�o.getText();
		String textoTipoAjuste = tipoDeAjuste.getText();
		String textoTipoDeLan�amento = tipoDeLan�amento.getText();
		String textoTributo = tributo.getText();
		String textoTipoTributo = tipoTributo.getText();
		String textoDevolu��o = devolu��o.getText();
		
		System.out.println("Empresa: " + textoEmpresa);
		System.out.println("UF Origem: " + textoUFOrigem);
		System.out.println("Filial: " + textoFilial);
		System.out.println("Codigo de Ajuste: " + textoCodigoDeAjuste);
		System.out.println("Codigo Oficial: " + textoCodigoOFicial);
		System.out.println("Descricao Oficial: " + textodescri��oOficial);
		System.out.println("Codigo Registro SPED: " + textoCodigoRegistroSPED);
		System.out.println("Data inicio Vigencia: " + textoDataInicioVigencia);
		System.out.println("Activo: " + textoActivo);
		System.out.println("Linha do Livro: " + textoLinhaDoLivro);
		System.out.println("Tipo tabela: " + textoTipoTabela);
		System.out.println("Codigo de contabilizacao: " + textoCodigosDeContabiliza��o);
		System.out.println("UF Destino: " + textoUFDestino);
		System.out.println("Descricao Padracao: " + textoDescri��oPadr�o);
		System.out.println("Tipo ajuste: " + textoTipoAjuste);
		System.out.println("Tipo de Lancamento: " + textoTipoDeLan�amento);
		System.out.println("Tributo: " + textoTributo);
		System.out.println("Tipo tributo: " + textoTipoTributo);
		System.out.println("Devolucao: " + textoDevolu��o);
		
		sleep(2000);
		biblioteca.click();
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		a�ao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		menu.click();
		sleep(2000);
		a�ao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String textoEmpresa1 = empresa1.getText();
		String textoUFOrigem1 = ufOrigem1.getAttribute("value");
		
		attributeToBeXpath("//div[@id=\"filial\"]/div", "class", "base-MultipleSelect3 required");
		String textoFilial1 = filial1.getText();
		textoFilial1 = textoFilial1.replace(" ", ""); // Reemplazo los espacios por nada para que quedee igual en visualizar y editar
		
		String textoCodigoDeAjuste1 = codigoDeAjuste1.getAttribute("value");
		String textoCodigoOFicial1 = codigoOficial1.getAttribute("value");
		String textodescri��oOficial1 = descri��oOficial1.getAttribute("value");
		textodescri��oOficial1 = capitalize(textodescri��oOficial1);
		String textoCodigoRegistroSPED1 = codigoDeRegistroSPED1.getAttribute("value");
		String textoDataInicioVigencia1 = dataInicioVigencia1.getAttribute("value");
		String textoActivo1 = activo1.isSelected() ? "Sim" : "N�o";
		String textoLinhaDoLivro1 = linhaDoLivro1.getAttribute("value");
		String textoTipoTabela1 = tipoTabela1.getAttribute("value");
		String textoCodigosDeContabiliza��o1 = codigosDeContabiliza��o1.getAttribute("value");
		String textoUFDestino1 = ufDestino1.getText();
		String textoDescri��oPadr�o1 = descri��oPadr�o1.getAttribute("value");
		String textoTipoAjuste1 = tipoDeAjuste1.getAttribute("value");
		String textoTipoDeLan�amento1 = tipoDeLan�amento1.getAttribute("value");
		String textoTributo1 = tributo1.getAttribute("value");
		String textoTipoTributo1 = tipoTributo1.getAttribute("value");
		String textoDevolu��o1 = devolu��o1.isSelected() ? "Sim" : "N�o";
		
		System.out.println("-------------------------------------------");
		System.out.println("Empresa1: " + textoEmpresa1);
		System.out.println("UF Origem1: " + textoUFOrigem1);
		System.out.println("Filial 1: " + textoFilial1);
		System.out.println("Codigo de Ajuste 1: " + textoCodigoDeAjuste1);
		System.out.println("Codigo OFicial 1: " + textoCodigoOFicial1);
		System.out.println("Descricao Oficial 1: " + textodescri��oOficial1);
		System.out.println("Codigo Registro SPED 1: " + textoCodigoRegistroSPED1);
		System.out.println("Data Inicio Vigencia 1: " + textoDataInicioVigencia1);
		System.out.println("Activo 1: " + textoActivo1);
		System.out.println("Linha do Livro 1: " + textoLinhaDoLivro1);
		System.out.println("Tipo tabela 1: " + textoTipoTabela1);
		System.out.println("Codigos de Contabilizacao 1: " + textoCodigosDeContabiliza��o1);
		System.out.println("UF Destino 1: " + textoUFDestino1);
		System.out.println("Descricao Padrao 1: " + textoDescri��oPadr�o1);
		System.out.println("Tipo ajuste 1: " + textoTipoAjuste1);
		System.out.println("Tipo de Lancamento 1: " + textoTipoDeLan�amento1);
		System.out.println("Tributo 1: " + textoTributo1);
		System.out.println("Tipo tributo 1: " + textoTipoTributo1);
		System.out.println("Devolucao 1: " + textoDevolu��o1);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		sucesso.add(textoEmpresa1.equals(textoEmpresa));
		sucesso.add(textoUFOrigem1.equals(textoUFOrigem));
		sucesso.add(textoFilial1.contains(textoFilial));
		sucesso.add(textoCodigoDeAjuste1.equals(textoCodigoDeAjuste));
		sucesso.add(textoCodigoOFicial1.contains(textoCodigoOFicial));
		sucesso.add(textodescri��oOficial.contains(textodescri��oOficial1));
		sucesso.add(textoCodigoRegistroSPED1.equals(textoCodigoRegistroSPED));
		sucesso.add(textoDataInicioVigencia1.equals(textoDataInicioVigencia1));
		sucesso.add(textoActivo1.equals(textoActivo1));
		sucesso.add(textoLinhaDoLivro1.equals(textoLinhaDoLivro));
		sucesso.add(textoTipoTabela1.equals(textoTipoTabela));
		sucesso.add(textoCodigosDeContabiliza��o.contains(textoCodigosDeContabiliza��o1));
		sucesso.add(textoUFDestino1.equals(textoUFDestino));
		sucesso.add(textoDescri��oPadr�o1.equals(textoDescri��oPadr�o));
		sucesso.add(textoTipoAjuste1.equals(textoTipoAjuste));
		sucesso.add(textoTipoDeLan�amento1.equals(textoTipoDeLan�amento));
		sucesso.add(textoTributo1.equals(textoTributo));
		sucesso.add(textoTipoTributo1.equals(textoTipoTributo));
		sucesso.add(textoDevolu��o1.equals(textoDevolu��o));
		System.out.println(sucesso);
		
		return sucesso;
	}
}
