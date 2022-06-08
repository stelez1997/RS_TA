
package com.rs.test.base;

import static org.testng.Assert.assertTrue;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.prefs.Preferences;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class TestBaseSteven {

	// URL
	protected String url = "http://localhost:3000/";
	
	//How to include variables on the attributes 
	//div[@class=\"searchBarElement\"][1]//child::select/option[text()=\"" + data.get(0) + "\"]

	public static WebDriver driver;

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
	
	public void click(WebElement element) {
		
		element.click();
		sleep(500);
	}
	
	public WebElement findElement(String xpath) {
		
		return driver.findElement(By.xpath(xpath));
		
	}
	
	
	public void click(String xpath) {

		driver.findElement(By.xpath(xpath)).click();
		sleep(500);
	}
	
	public void clear(WebElement element) {
		
		element.clear();
		sleep(1000);

	}
	
	public void clear(String xpath) {
		
		findElement(xpath).clear();
		sleep(1000);

	}
	
	public void clearByBackSpace(WebElement element) {
		
		String value = getAttribute(element, "value");
		
		for (int i = 0; i < value.length(); i++) {
			sendKeys(element, Keys.BACK_SPACE);
		}
		
	}
	
	
	
	public void sendKeys(WebElement element, String text) {
		
		element.sendKeys(text);
		sleep(500);
		
	}
	
	public void sendKeys(WebElement element, int number) {
		
		element.sendKeys(String.valueOf(number));
		sleep(500);
		
	}
	
	
	public void sendKeys(String xpath, String text) {
		
		driver.findElement(By.xpath(xpath)).sendKeys(text);
		sleep(500);
		
	}
	
	public void sendKeys(String xpath, Keys keys) {
		
		driver.findElement(By.xpath(xpath)).sendKeys(keys);
		sleep(500);
		
	}
	
	public void sendKeys(WebElement element, Keys keys) {
		
		element.sendKeys(keys);
		sleep(500);
		
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
		
		sleep(1000);

	}

	public void waitExpectedElement(String xpath) {
		WebDriverWait wait = new WebDriverWait(driver, 360);

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
		
		sleep(1000);

	}
	

	public void actionsMoveToElementXpath(String xpath) {
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath(xpath))).perform();
	
	
	}

	public void actionsMoveToElementElement(WebElement element) {
		Actions actions = new Actions(driver);
		actions.moveToElement(element).perform();
		sleep(1000);
	}
	
	public void actionsMoveToElementElement(String xpath) {
		Actions actions = new Actions(driver);
		actions.moveToElement(findElement(xpath)).perform();
		sleep(1000);
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
	
	public void scrollDown(int times) {
		
		actionsMoveToElementElement("//body");
		
		for (int i = 0; i < times; i++) {
			findElement("//body").sendKeys(Keys.ARROW_DOWN);
			findElement("//body").sendKeys(Keys.ARROW_DOWN);
			findElement("//body").sendKeys(Keys.ARROW_DOWN);
			findElement("//body").sendKeys(Keys.ARROW_DOWN);
		}
		
	}
	
	public void scrollUp(int times) {
		
		click("//body");
		
		for (int i = 0; i < times; i++) {
			findElement("//body").sendKeys(Keys.ARROW_UP);
			findElement("//body").sendKeys(Keys.ARROW_UP);
			findElement("//body").sendKeys(Keys.ARROW_UP);
			findElement("//body").sendKeys(Keys.ARROW_UP);
		}
		
	}
	
	public void orderTable(WebElement header, String verificationId, String idToBeVerified) {
		
		
		while (!idToBeVerified.equals(verificationId)) {
			
			click(header);
			
		}
		
		
		
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
			texto = "empty";
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

		int rows = rows(xpath);

		while (rows == 0) {
			rows = rows(xpath);
		}
		
		sleep(1000);

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
	/*
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

*/
	
	public boolean greaterThanInt(int mayor,int menor) {
		
		boolean isGreaterThan= false;
		
		if(mayor > menor) {
			isGreaterThan = true;
		}
		return isGreaterThan;
		
	}
	
	public boolean greaterThanInt(String mayor,String menor) {
		
		boolean isGreaterThan= false;
		int mayorI = Integer.parseInt(mayor);
		int menorI = Integer.parseInt(menor);

		
		if(mayorI > menorI) {
			isGreaterThan = true;
		}
		return isGreaterThan;
		
	}
	
	public int random(int range) {
		
		Random randomNum = new Random();
		
		int n = randomNum.nextInt(range);
		
		if (n <0) {
			n = n*-1;
		}
		
		return n;
		
		
	}
	
	public String convertToString(int number) {
		
		return String.valueOf(number);
		
	}
	
	public String convertToString(double number) {
		
		return String.valueOf(number);
		
	}
	
	public String convertToString(float number) {
		
		return String.valueOf(number);
		
	}
	
	public Integer convertToInt(String number) {
		
		return Integer.valueOf(number);
		
	}
	
	public Double convertToDouble(String number) {
		
		return Double.valueOf(number);
		
	}
	
	public Float convertToFloat(String number) {
		
		return Float.valueOf(number);
		
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
	public String editionRecord ="The record wasn't edited successfully";
	public String deletionRecord ="The record wasn't deleted successfully";
	public String testRecord ="The testing record is being displayed";
	public String filtersNotWorking ="The filters are not working as expected";
	
	
	
	
}

