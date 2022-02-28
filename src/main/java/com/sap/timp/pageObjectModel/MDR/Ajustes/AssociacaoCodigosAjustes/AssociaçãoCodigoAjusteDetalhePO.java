package com.sap.timp.pageObjectModel.MDR.Ajustes.AssociacaoCodigosAjustes;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class Associa��oCodigoAjusteDetalhePO extends TestBaseFernando{
String URL = driver.getCurrentUrl();
	
	@FindBy(xpath = "//div[@class=\"accordion-container\"]/ul/li/div/span[text()=\"Ajustes\"]")
	public WebElement menuAjustes;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-codeAssoc\"]")
	public WebElement subMenuAjustesAssociacaoCodigoAjuste;
	
	@FindBy(xpath = "//div[contains(@class, \"icon-right\")][2]")
	public WebElement btnUltimaPagina;
	
	// Datos detalhe
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[1]/div/div")
	public WebElement id;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[2]/div/div")
	public WebElement empresa;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[3]/div/div")
	public WebElement ufOrigem;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[4]/div/div")
	public WebElement filial;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[5]/div/div")
	public WebElement codigoDeAjuste;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[6]/div/div")
	public WebElement descri��oPadr�o;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[9]/div/div")
	public WebElement tributo;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[10]/div/div")
	public WebElement tipoTributo;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[11]/div/div")
	public WebElement detalheTipoTributo;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[13]/div/div")
	public WebElement devolu��o;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[16]/div/div")
	public WebElement codigoContabiliza��o;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[17]/div/div")
	public WebElement codigoOficial;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[18]/div/div")
	public WebElement descri��oOficial;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[23]/div/div")
	public WebElement activo;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[24]/div/div")
	public WebElement dataInicioVigencia;
	
	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement btnCerrarDetalhe;
	
	// Datos de visualizar
	@FindBy(xpath = "//span[@id=\"codeID\"]")
	public WebElement id1;
	
	@FindBy(xpath = "//span[@id=\"company\"]")
	public WebElement empresa1;
	
	@FindBy(xpath = "//span[@id=\"ufOrigin\"]")
	public WebElement ufOrigem1;
	
	@FindBy(xpath = "//span[@id=\"filial\"]")
	public WebElement filial1;
	
	@FindBy(xpath = "//span[@id=\"adjustCode\"]")
	public WebElement codigoDeAjuste1;
	
	@FindBy(xpath = "//span[@id=\"officialCode\"]")
	public WebElement codigoOficial1;
	
	@FindBy(xpath = "//span[@id=\"officialDesc\"]")
	public WebElement descri��oOficial1;
	
	@FindBy(xpath = "//span[@id=\"spedRegister\"]")
	public WebElement codigoDeRegistroSPED1;
	
	@FindBy(xpath = "//span[@id=\"validity\"]")
	public WebElement dataInicioVigencia1;
	
	@FindBy(xpath = "//span[@id=\"ativo\"]")
	public WebElement activo1;
	
	@FindBy(xpath = "//span[@id=\"accCode\"]")
	public WebElement codigosDeContabiliza��o1;
	
	@FindBy(xpath = "//span[@id=\"uffDestiny\"]")
	public WebElement ufDestino1;
	
	@FindBy(xpath = "//span[@id=\"padrao\"]")
	public WebElement descri��oPadr�o1;
	
	@FindBy(xpath = "//span[@id=\"tribute\"]")
	public WebElement tributo1;
	
	@FindBy(xpath = "//span[@id=\"tributeType\"]")
	public WebElement tipoTributo1;
	
	@FindBy(xpath = "//span[@id=\"detailTribute\"]")
	public WebElement detalheTipoTributo1;
	
	@FindBy(xpath = "//span[@id=\"devolutionField\"]")
	public WebElement devolu��o1;
	
	public Associa��oCodigoAjusteDetalhePO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> detalheAssocia��oCodigoAjusteDetalhe() {
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
		WebElement a�ao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Detalhes\"]"));
		
		menu.click();
		sleep(1000);
		a�ao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String textoId = id.getText();
		String textoEmpresa = empresa.getText();
		String textoUFOrigem = ufOrigem.getText();
		String textoFilial = filial.getText();
		String textoCodigoAjuste = codigoDeAjuste.getText();
		String textoDescricaoPadrao = descri��oPadr�o.getText();
		String textoTributo = tributo.getText();
		String textoTipoTributo = tipoTributo.getText();
		String textoDetalheTipoTributo = detalheTipoTributo.getText();
		String textoDevolucao = devolu��o.getText();
		String textoCodigoContabilizacao = codigoContabiliza��o.getText();
		String textoCodigoOficial = codigoOficial.getText();
		String textoDescricaoOficial = descri��oOficial.getText();
		textoDescricaoOficial = capitalize(textoDescricaoOficial);
		String textoActivo = activo.getText();
		String textoDataInicioVigencia = dataInicioVigencia.getText();
		
		System.out.println("ID: " + textoId);
		System.out.println("Empresa: " + textoEmpresa);
		System.out.println("UF Origem: " + textoUFOrigem);
		System.out.println("Filial: " + textoFilial);
		System.out.println("Codigo ajuste: " + textoCodigoAjuste);
		System.out.println("Descricao Padrao: " + textoDescricaoPadrao);
		System.out.println("Tributo: " + textoTributo);
		System.out.println("Tipo Tributo: " + textoTipoTributo);
		System.out.println("Detalhe Tipo Tributo: " + textoDetalheTipoTributo);
		System.out.println("Devolucao: " + textoDevolucao);
		System.out.println("Codigo contabilizacao: " + textoCodigoContabilizacao);
		System.out.println("Codigo Oficial: " + textoCodigoOficial);
		System.out.println("Descricao Oficial: " + textoDescricaoOficial);
		System.out.println("Activo: " + textoActivo);
		System.out.println("Data inicio vigencia: " + textoDataInicioVigencia);
		
		sleep(2000);
		btnCerrarDetalhe.click();
		sleep(1000);
		
		menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		a�ao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		
		menu.click();
		sleep(1000);
		a�ao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String textoId1 = id1.getText();
		String textoEmpresa1 = empresa1.getText();
		String textoUFOrigem1 = ufOrigem1.getText();

		String textoFilial1 = filial1.getText();
		textoFilial1 = textoFilial1.replace(" ", ""); // Reemplazo los espacios por nada para que quedee igual en visualizar y editar
		
		String textoCodigoDeAjuste1 = codigoDeAjuste1.getText();
		String textoCodigoOFicial1 = codigoOficial1.getText();
		String textodescri��oOficial1 = descri��oOficial1.getText();
		textodescri��oOficial1 = capitalize(textodescri��oOficial1);
		String textoDataInicioVigencia1 = dataInicioVigencia1.getText();
		String textoActivo1 = activo1.isSelected() ? "Sim" : "N�o";
		String textoCodigosDeContabiliza��o1 = codigosDeContabiliza��o1.getText();
		String textoDescri��oPadr�o1 = descri��oPadr�o1.getText();
		textoDescri��oPadr�o1 = capitalize(textoDescri��oPadr�o1);
		String textoTributo1 = tributo1.getText();
		String textoTipoTributo1 = tipoTributo1.getText();
		String textoDetalheTipoTributo1 = detalheTipoTributo1.getText();
		String textoDevolu��o1 = devolu��o1.isSelected() ? "Sim" : "N�o";
		
		System.out.println("-------------------------------------------");
		System.out.println("ID 1: " + textoId1);
		System.out.println("Empresa1: " + textoEmpresa1);
		System.out.println("UF Origem1: " + textoUFOrigem1);
		System.out.println("Filial 1: " + textoFilial1);
		System.out.println("Codigo de Ajuste 1: " + textoCodigoDeAjuste1);
		System.out.println("Descricao Padrao 1: " + textoDescri��oPadr�o1);
		System.out.println("Tributo 1: " + textoTributo1);
		System.out.println("Tipo tributo 1: " + textoTipoTributo1);
		System.out.println("Detalhe Tipo tributo 1: " + textoDetalheTipoTributo1);
		System.out.println("Devolucao 1: " + textoDevolu��o1);
		System.out.println("Codigos de Contabilizacao 1: " + textoCodigosDeContabiliza��o1);
		System.out.println("Codigo OFicial 1: " + textoCodigoOFicial1);
		System.out.println("Descricao Oficial 1: " + textodescri��oOficial1);
		System.out.println("Activo 1: " + textoActivo1);
		System.out.println("Data Inicio Vigencia 1: " + textoDataInicioVigencia1);		
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		sucesso.add(textoEmpresa1.equals(textoEmpresa));
		sucesso.add(textoUFOrigem1.equals(textoUFOrigem));
		sucesso.add(textoFilial1.contains(textoFilial));
		sucesso.add(textoCodigoDeAjuste1.equals(textoCodigoAjuste));
		sucesso.add(textoCodigoOFicial1.contains(textoCodigoOficial));
		sucesso.add(textoDescricaoOficial.contains(textodescri��oOficial1));
		sucesso.add(textoDataInicioVigencia1.equals(textoDataInicioVigencia1));
		sucesso.add(textoActivo1.equals(textoActivo1));
		sucesso.add(textoCodigosDeContabiliza��o1.contains(textoCodigoContabilizacao));
		sucesso.add(textoDescri��oPadr�o1.equals(textoDescricaoPadrao));
		sucesso.add(textoTributo1.equals(textoTributo));
		sucesso.add(textoTipoTributo1.equals(textoTipoTributo));
		sucesso.add(textoDetalheTipoTributo1.contains(textoDetalheTipoTributo));
		sucesso.add(textoDevolu��o1.equals(textoDevolucao));
		System.out.println(sucesso);
		
		return sucesso;
	}
}
