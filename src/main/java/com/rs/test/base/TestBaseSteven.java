
package com.rs.test.base;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.prefs.Preferences;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class TestBaseSteven {

	// URL
	protected String url = "http://localhost:3000/";



	public static WebDriver driver;
	public String usuarioL = "TESTEAUTOMATIZADO";
	public String senhaL = "Alltax20";
	public int menuT = 12000;

	public WebDriver initialization() {

		WebDriver driver;
		
		
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");

	
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-infobars");
		options.setExperimentalOption("useAutomationExtension", false);
		
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("credentials_enable_service", false);
		prefs.put("profile.password_manager_enabled", false);
		options.setExperimentalOption("prefs", prefs);
		
		options.setExperimentalOption("excludeSwitches",Collections.singletonList("enable-automation"));
		options.addArguments("--disable-dev-shm-usage");
		options.addArguments("--disable-extensions");
        
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		

		driver.get(url);

		return driver;
	}

	public void fecharMensagens(String rows, String xpath) {
		int rowsR = driver.findElements(By.xpath(xpath)).size();
		
		
		if (rowsR > 0) {
			WebElement fechar = driver.findElement(By.xpath(xpath));
			fechar.click();
		}
		sleep(2000);
		
		rowsR = driver.findElements(By.xpath(xpath)).size();
		
		while (rowsR > 0) {
			
			WebElement fechar = driver.findElement(By.xpath(xpath));
			fechar.click();
			
			rowsR = driver.findElements(By.xpath(xpath)).size();
			sleep(2000);
		}
		
		
	}
	
	
	public void click(WebElement element) {
		
		element.click();
		sleep(1000);
	}
	
	public WebElement findElement(String xpath) {
		
		return driver.findElement(By.xpath(xpath));
		
	}
	
	
	public void click(String xpath) {
		
		driver.findElement(By.xpath(xpath)).click();
		sleep(1000);
	}
	
	public void clear(WebElement element) {
		
		element.clear();
		sleep(1000);
	}
	
	public void sendKeys(WebElement element, String text) {
		
		element.sendKeys(text);
		sleep(1000);
		
	}
	
	public void sendKeys(String xpath, String text) {
		
		driver.findElement(By.xpath(xpath)).sendKeys(text);
		sleep(1000);
		
	}
	
	public void sendKeys(String xpath, Keys keys) {
		
		driver.findElement(By.xpath(xpath)).sendKeys(keys);
		sleep(1000);
		
	}
	
	public void sendKeys(WebElement element, Keys keys) {
		
		element.sendKeys(keys);
		sleep(1000);
		
	}
	
	
	
	public void clear(String xpath) {
		
		driver.findElement(By.xpath(xpath)).clear();
		sleep(1000);
	}
	
	
	public void refresh() {
				
		driver.navigate().refresh();
	}
	
	public String url() {
		return driver.getCurrentUrl();
	}
	
	public int rows(String xpath) {
		
		int rows = driver.findElements(By.xpath(xpath)).size();
		
		return rows;
		
	}

	public void sleep(int miliSeconds) {
		try {
			Thread.sleep(miliSeconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
		
	public void waitExpectedElement(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 3600);

		wait.until(ExpectedConditions.elementToBeClickable(element));
		
		sleep(2000);

	}

	public void waitExpectedElement(String xpath) {
		WebDriverWait wait = new WebDriverWait(driver, 360);

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
		
		sleep(2000);

	}
	

	public void actionsMoveToElementXpath(String xpath) {
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath(xpath))).perform();
	
	
	}

	public void actionsMoveToElementElement(WebElement element) {
		Actions actions = new Actions(driver);
		actions.moveToElement(element).perform();
		sleep(2000);
	}

	public void invisibilityOfElement(String xpath) {
		WebDriverWait wait = new WebDriverWait(driver, 360);
				 
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(xpath)));

	}

	public void attributeToBeXpath(String locator, String attribute, String value) {
		WebDriverWait wait = new WebDriverWait(driver, 360);

		wait.until(ExpectedConditions.attributeToBe(By.xpath(locator), attribute, value));
	}

	public void attributeToBeElement(WebElement element, String attribute, String value) {
		WebDriverWait wait = new WebDriverWait(driver, 360);

		wait.until(ExpectedConditions.attributeToBe(element, attribute, value));
	}

	public void dobleClickXpath(String locator) {

		Actions actions = new Actions(driver);
		actions.doubleClick(driver.findElement(By.xpath(locator))).perform();

	}

	public void dobleClickElement(WebElement element) {

		Actions actions = new Actions(driver);
		actions.doubleClick(element).perform();

	}

	public void moveToElement(WebElement element, WebElement hacia) {
		Actions actions = new Actions(driver);

		actions.dragAndDrop(element, hacia).perform();

	}

	public String fechaActual() {

		Date fecha = new Date();

		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

		return df.format(fecha);

	}

	public String fechaAyer() {

		Date fecha = new Date();

		Date ayer = new Date(fecha.getTime() + TimeUnit.DAYS.toMillis(-1));

		SimpleDateFormat df = new SimpleDateFormat("dd/MM/YYYY");

		return df.format(ayer);

	}
	

	public String fechaManana() {

		Date fecha = new Date();

		Date ayer = new Date(fecha.getTime() + TimeUnit.DAYS.toMillis(+1));

		SimpleDateFormat df = new SimpleDateFormat("dd/MM/YYYY");

		return df.format(ayer);

	}
	
	public String getText(WebElement element) {

		String texto = element.getText();
		
		if (texto.isEmpty()==true) {
			texto = "vazio";
		}
		
		return texto;

	}
	
	public String getText(String xpath) {

		String texto = driver.findElement(By.xpath(xpath)).getText();
		
		if (texto.isEmpty()==true) {
			texto = "vazio";
		}
		
		return texto;

	}
	
	public String getAttribute(WebElement element,String attribute) {

		String atr = element.getAttribute(attribute);
		
		return atr;

	}
	
	public String getAttribute(String xpath,String attribute) {

		String atr = driver.findElement(By.xpath(xpath)).getAttribute(attribute);
		
		return atr;

	}

	public void attributoNotToBeEmptyElement(WebElement element, String attribute) {
		WebDriverWait wait = new WebDriverWait(driver, 360);

		wait.until(ExpectedConditions.attributeToBeNotEmpty(element, attribute));
	}

	public void attributoNotToBeEmptyXpath(String xpath, String attribute) {
		WebDriverWait wait = new WebDriverWait(driver, 360);

		wait.until(ExpectedConditions.attributeToBeNotEmpty(driver.findElement(By.xpath(xpath)), attribute));
	}

	public void visibilityOfElementXpath(String xpath) {

		boolean isPresent = driver.findElement(By.xpath(xpath)).isDisplayed();

		while (isPresent == false) {
			sleep(3000);
			isPresent = driver.findElement(By.xpath(xpath)).isDisplayed();
		}

	}
	

	public void quit() {
		driver.close();
	}
	
	
	public String ordenar(String dato) {
		
		String recorrer = dato;
		
	    String[] recorrer2 = recorrer.split("");

	    Arrays.sort(recorrer2);

	    String sorted = "";

	    for(int i =0;i<recorrer2.length;i++){

	      sorted += recorrer2[i];
	    
	    }
		
		return sorted; 
	}
	
	public void closeSelectTypeCheckbox(WebElement element) {
		new Actions(driver).moveToElement(element).click().perform();
	}
	
	public String capitalize(String 
			cadena) {
		String[] split = cadena.split("");
        for (int i = 0; i < split.length; i++) {
            if(i == 0 || split[i-1].equals(" ")) {
                split[i] = split[i].toUpperCase();
            }
        }
        
        return String.join("", split);
	}
	
	public String mesActual() {
		// Obtienes el mes actual
		Month mes = LocalDate.now().getMonth();

		// Obtienes el nombre del mes
		String nombreMes = mes.getDisplayName(TextStyle.FULL, new Locale("es", "ES"));
		nombreMes = capitalize(nombreMes);
		
		return nombreMes;
	}
	
	public String anioActual() {
		// Obtienes el mes actual
		int anio = LocalDate.now().getYear();
		
		String anioString = String.valueOf(anio);
		return anioString;
	}
	
	public void idInserir(String nome,String idRegistro) {
		Preferences id = Preferences.userRoot();

		id.put(nome, idRegistro);
		
	}
	
	public String idObter(String nome) {

		Preferences id = Preferences.userRoot();

		long idRegistro = id.getLong(nome, 1);

		String idReturn = String.valueOf(idRegistro);

		return idReturn;

	}

	public void idInserir1(String idRegistro) {

		Preferences id = Preferences.userRoot();

		id.put("idR1", idRegistro);

	}

	public String idObter1() {

		Preferences id = Preferences.userRoot();

		long idRegistro = id.getLong("idR1", 1);

		String idReturn = String.valueOf(idRegistro);

		return idReturn;

	}

	public void idInserir2(String idRegistro) {

		Preferences id = Preferences.userRoot();

		id.put("idR2", idRegistro);

	}

	public String idObter2() {

		Preferences id = Preferences.userRoot();

		long idRegistro = id.getLong("idR2", 1);

		String idReturn = String.valueOf(idRegistro);

		return idReturn;

	}

	public void idInserir3(String idRegistro) {

		Preferences id = Preferences.userRoot();

		id.put("idR3", idRegistro);

	}

	public String idObter3() {

		Preferences id = Preferences.userRoot();

		long idRegistro = id.getLong("idR3", 1);

		String idReturn = String.valueOf(idRegistro);

		return idReturn;

	}

	public void idInserir4(String idRegistro) {

		Preferences id = Preferences.userRoot();

		id.put("idR4", idRegistro);

	}

	public String idObter4() {

		Preferences id = Preferences.userRoot();

		long idRegistro = id.getLong("idR4", 1);

		String idReturn = String.valueOf(idRegistro);

		return idReturn;

	}
	
	public void idInserir5(String idRegistro) {

		Preferences id = Preferences.userRoot();

		id.put("idR5", idRegistro);

	}

	public String idObter5() {

		Preferences id = Preferences.userRoot();

		long idRegistro = id.getLong("idR5", 1);

		String idReturn = String.valueOf(idRegistro);

		return idReturn;

	}
	
	
	public void idInserir6(String idRegistro) {

		Preferences id = Preferences.userRoot();

		id.put("idR6", idRegistro);

	}

	public String idObter6() {

		Preferences id = Preferences.userRoot();

		long idRegistro = id.getLong("idR6", 1);

		String idReturn = String.valueOf(idRegistro);

		return idReturn;

	}
	
	public boolean greaterThanInt(int mayor,int menor) {
		
		boolean isGreaterThan= false;
		
		if(mayor > menor) {
			isGreaterThan = true;
		}
		return isGreaterThan;
		
	}
	
	
	public void close() {
		
		driver.close();
	}
	

	//Login
	public String noRecordFound ="There are no records being displayed";
	public String loginSuccesful ="The login was successful";
	public String loginUnSuccesful ="The login was unsuccessful";
	public String createdUnSuccesfully ="The record was not created successfully";
	public String createdSuccesfully ="The record was created successfully";
	public String creationRecord ="The creation record is not being displayed";
	public String editionRecord ="The record wasn't edited sucessfully";
	public String deletionRecord ="The record wasn't deleted sucessfully";
	
	
	
	
}

