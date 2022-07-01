package com.rs.test.pageObjectModel.clusterConfiguration.clusterAdmin;

import static org.testng.Assert.assertTrue;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.rs.test.base.TestBaseSteven;
import com.rs.test.pageObjectModel.login.LoginVerificationPO;

/**
 * @author stelez
 *
 */
public class ClusterAdminPO extends TestBaseSteven {

	public ClusterAdminPO() {
		PageFactory.initElements(driver, this);
	}

	// menu
	@FindBy(xpath = "//div[@class=\"headerMenuDropdown\"]/a[contains(text(),\"Cluster Admin\")]")
	public WebElement menuClusterAdmin;

	// pagination

	@FindBy(xpath = "//h1[text()=\"Queue Monitor\"]//parent::div//following-sibling::div[@class=\"tablePage\"]//button[text()=\"<<\"]")
	public WebElement btnGoToFirst;

	@FindBy(xpath = "//h1[text()=\"Queue Monitor\"]//parent::div//following-sibling::div[@class=\"tablePage\"]//button[text()=\"<\"]")
	public WebElement btnGoToPrevious;

	@FindBy(xpath = "//h1[text()=\"Queue Monitor\"]//parent::div//following-sibling::div[@class=\"tablePage\"]//button[text()=\">>\"]")
	public WebElement btnGoToLast;

	@FindBy(xpath = "//h1[text()=\"Queue Monitor\"]//parent::div//following-sibling::div[@class=\"tablePage\"]//button[text()=\">\"]")
	public WebElement btnGoToNext;

	// Create

	@FindBy(xpath = "//input[@name=\"queueName\"]")
	public WebElement txtQueue;

	@FindBy(xpath = "//input[@name=\"threshold\"]")
	public WebElement txtThreshold;

	@FindBy(xpath = "//select[@name=\"addmessageTypeName\"]")
	public WebElement cboHub;

	@FindBy(xpath = "//select[@name=\"addmessageTypeName\"]/option[not(contains(text(),\"option\"))and text()][1]")
	public WebElement cboHubO;
	
	@FindBy(xpath = "//select[@name=\"addcontrolModeName\"]")
	public WebElement cboControlMode;

	@FindBy(xpath = "//select[@name=\"addcontrolModeName\"]/option[not(contains(text(),\"option\"))and text()][1]")
	public WebElement cboControlModeO;
	
	@FindBy(xpath = "//select[@name=\"addflowCutoff\"]")
	public WebElement cboFlowCutOff;

	@FindBy(xpath = "//select[@name=\"addflowCutoff\"]/option[not(contains(text(),\"option\"))and text()][1]")
	public WebElement cboFlowCutOffO;

	@FindBy(xpath = "//button[@id=\"Queue MonitorAddBtn\"]")
	public WebElement btnAddQueueMonitor;

	LoginVerificationPO loginVerificationPO;

	// Menu

	public void clickOnClusterAdminMenu() {
		click(menuClusterAdmin);
		
	}

	// Pagination

	public void clickOnGoToFirst() {
		click(btnGoToFirst);
		visibilityOfElementXpath("//tr[contains(@id,\"MonitorTable\")][1]");
	}

	public void clickOnGoToPrevious() {
		click(btnGoToPrevious);
		visibilityOfElementXpath("//tr[contains(@id,\"MonitorTable\")][1]");
	}

	public void clickOnGoToNext() {
		click(btnGoToNext);
		visibilityOfElementXpath("//tr[contains(@id,\"MonitorTable\")][1]");
	}

	public void clickOnGoToLast() {
		click(btnGoToLast);
		visibilityOfElementXpath("//tr[contains(@id,\"MonitorTable\")][1]");
	}

	// Create Methods
	String cboHubText = "";
	String cboControlModeText = "";
	String cboFlowCutOffText = "";
	
	public void fillOutQueue(String text) {
		sendKeys(txtQueue, text);
	}

	public void fillOutThreshold(String text) {
		sendKeys(txtThreshold, text);
	}
	
	public void selectHub() {
		
		click(cboHub);
		sleep(500);
		cboHubText = getText(cboHubO);
		click(cboHubO);
		
	}
	
	public void selectControlMode() {
		
		click(cboControlMode);
		sleep(500);
		cboControlModeText = getText(cboControlModeO);
		click(cboControlModeO);
		
	}
	
	public void selectFlowCutOff() {
		
		click(cboFlowCutOff);
		sleep(500);
		cboFlowCutOffText = getText(cboFlowCutOffO);
		click(cboFlowCutOffO);
		
	}
	
	public void clickOnBtnAddQueueMonitor() {
		click(btnAddQueueMonitor);
	}
	
	String id = "5";
	String queue = "TA_Test";
	String threshold = "10001";
	public void createQueueMonitor() {
		
		loginVerificationPO = new LoginVerificationPO();

		actionsMoveToElementElement(loginVerificationPO.btnClusterConfiguration);

		clickOnClusterAdminMenu();

		actionsMoveToElementElement(btnGoToFirst);
		
		visibilityOfElementXpath("//tr[contains(@id,\"MonitorTable\")][1]");

		clickOnGoToLast();
		
		int rowsB = rows("//tr[contains(@id,\"MonitorTable\")]");
		
		
		fillOutQueue(queue);
		selectHub();
		selectControlMode();
		fillOutThreshold(threshold);
		selectFlowCutOff();
		
		clickOnBtnAddQueueMonitor();
		
		sleep(5000);
		refresh();
		visibilityOfElementXpath("//tr[contains(@id,\"MonitorTable\")][1]");
		
		clickOnGoToLast();
		
		visibilityOfElementXpath("//tr[contains(@id,\"MonitorTable\")][1]");
		
		int rowsA = rows("//tr[contains(@id,\"MonitorTable\")]");
		
		boolean created = greaterThanInt(rowsA, rowsB);
		
		System.out.println("Record Created: "+created);
		assertTrue(created, createdUnSuccesfully);
		
		created = false;
		
		String queueA = getText("//tr[contains(@id,\"MonitorTable\")]["+rowsA+"]/td[2]");
		String hubA = getText("//tr[contains(@id,\"MonitorTable\")]["+rowsA+"]/td[3]");
		String controlModeA = getText("//tr[contains(@id,\"MonitorTable\")]["+rowsA+"]/td[4]");
		String thresholdA = getText("//tr[contains(@id,\"MonitorTable\")]["+rowsA+"]/td[5]");
		String flowCutOffA = getText("//tr[contains(@id,\"MonitorTable\")]["+rowsA+"]/td[6]");
		
		System.out.println("--------------Creation Verification----------------------------");
		System.out.println("Info Entered-----");
		System.out.println("Queue: "+queue);
		System.out.println("Hub: "+cboHubText);
		System.out.println("Control Mode: "+cboControlModeText);
		System.out.println("Threshold: "+threshold);
		System.out.println("flow CutOff: "+cboFlowCutOffText);
		System.out.println("Info after creation----------");
		System.out.println("Queue: "+queueA);
		System.out.println("Hub: "+hubA);
		System.out.println("Control Mode: "+controlModeA);
		System.out.println("Threshold: "+thresholdA);
		System.out.println("flow CutOff: "+flowCutOffA);
		
		
		if (queueA.equals(queue) && hubA.equals(cboHubText) && controlModeA.equals(cboControlModeText)
				&& thresholdA.equals(threshold) && flowCutOffA.equals(cboFlowCutOffText)) {
			created = true;
		}
		
		System.out.println("Record created successfully: "+created);
		assertTrue(created, createdUnSuccesfully);
		
		
		
		

	}

	// Verfication before editing or deleting the record

	public void verification() {

		loginVerificationPO = new LoginVerificationPO();

		actionsMoveToElementElement(loginVerificationPO.btnClusterConfiguration);

		clickOnClusterAdminMenu();

		actionsMoveToElementElement(btnGoToFirst);
		
		
		visibilityOfElementXpath("//tr[contains(@id,\"MonitorTable\")][1]");

		clickOnGoToLast();
		
		visibilityOfElementXpath("//tr[contains(@id,\"MonitorTable\")][1]");
		
		boolean record = false;
		
		System.out.println("-----------------------------Test Record Verification------------------------------");
		
		int rows = rows("//tr[contains(@id,\"MonitorTable\")]");
		int j = 1;
		for (int i = 0; i < rows; i++) {
			
			String queue = getText("//tr[contains(@id,\"MonitorTable\")][" + j + "]/td[2]/div");
			
			if (queue.contains(this.queue)) {
				record = true;
				break;
			}
			
			if (j == rows) {
				assertTrue(false, creationRecord);
			}
			j++;
		}

		System.out.println("The testing record is being displayed: " + record);

		assertTrue(record, this.creationRecord);

	}

	public void editQueueMonitor() {

		verification();
		
		
		int rows = rows("//tr[contains(@id,\"MonitorTable\")]");

		boolean edited = false;
		
		int position = getQueuePosition();

		String thresholdE = "100002";

		WebElement cboEditControlMode = findElement("//tr[contains(@id,\"MonitorTable\")][" + position + "]//select[contains(@id,\"editcontrol\")]");
		WebElement cboEditControlModeO = findElement("//tr[contains(@id,\"MonitorTable\")][" + position + "]//select[contains(@id,\"editcontrol\")]/option[text()][2]");
		
		WebElement txtEditThreshold = findElement("//tr[contains(@id,\"MonitorTable\")][" + position + "]//input[contains(@id,\"thresholdEdit\")]");
		
		WebElement cboEditFlowCutOff = findElement("//tr[contains(@id,\"MonitorTable\")][" + position + "]//select[contains(@id,\"editflow\")]");
		WebElement cboEditFlowCutOffO = findElement("//tr[contains(@id,\"MonitorTable\")][" + position + "]//select[contains(@id,\"editflow\")]/option[text()][2]");
		
		WebElement btnEdit = findElement(
				"//tr[contains(@id,\"MonitorTable\")][" + rows + "]//child::button[contains(@id,\"edit\")]");
	
		click(btnEdit);
		
		click(cboEditControlMode);
		sleep(500);
		cboControlModeText = getText(cboEditControlModeO);
		click(cboEditControlModeO);
		
		clearByBackSpace(txtEditThreshold);
		sendKeys(txtEditThreshold, thresholdE);
		
		click(cboEditFlowCutOff);
		sleep(500);
		cboFlowCutOffText = getText(cboEditFlowCutOffO);
		click(cboEditFlowCutOffO);

		click(btnEdit);
		sleep(5000);

		visibilityOfElementXpath("//tr[contains(@id,\"MonitorTable\")][1]");

		refresh();

		visibilityOfElementXpath("//tr[contains(@id,\"MonitorTable\")][1]");
		
		click(btnGoToLast);

		visibilityOfElementXpath("//tr[contains(@id,\"MonitorTable\")][1]");
		
		position = getQueuePosition();

		String controlModeA = getText("//tr[contains(@id,\"MonitorTable\")][" + position + "]/td[4]/div");
		String thresholdA = getText("//tr[contains(@id,\"MonitorTable\")][" + position + "]/td[5]/div");
		String flowCutOffA = getText("//tr[contains(@id,\"MonitorTable\")][" + position + "]/td[6]/div");

		System.out.println("-----------------------------Edition Verification------------------------------");
		System.out.println("Info entered------");
		System.out.println("Control Mode: "+cboControlModeText);
		System.out.println("Threshold: "+thresholdE);
		System.out.println("Flow CutOff: "+cboFlowCutOffText);
		System.out.println("Info after edition-----");
		System.out.println("Control Mode: "+controlModeA);
		System.out.println("Threshold: "+thresholdA);
		System.out.println("Flow CutOff: "+flowCutOffA);

		if (controlModeA.equals(cboControlModeText) && thresholdA.equals(thresholdE) && flowCutOffA.equals(cboFlowCutOffText)) {
			edited = true;
		}

		System.out.println("The record was edited with success: " + edited);

		assertTrue(edited, editionRecord);

		

	}
	
	public int getQueuePosition() {
		
		int rows = rows("//tr[contains(@id,\"MonitorTable\")]");
		int j = 1;
		for (int i = 0; i < rows; i++) {
			
			String queue = getText("//tr[contains(@id,\"MonitorTable\")][" + j + "]/td[2]/div");
			
			if (queue.contains(this.queue)) {
				break;
			}
			
			if (j == rows) {
				assertTrue(false, creationRecord);
			}
			j++;
		}
		
		return j;
	}
	
	
	public void deleteQueueMonitor() {

		verification();
		
		int position = getQueuePosition();
		
		int rowsB = rows("//tr[contains(@id, \"MonitorTable\")]");

		WebElement btnDelete = findElement(
				"//tr[contains(@id, \"MonitorTable\")][" + position + "]//child::button[contains(@id,\"delete\")]");
		click(btnDelete);
		sleep(5000);

		refresh();

		waitExpectedElement("//tr[contains(@id, \"MonitorTable\")][1]");

		clickOnGoToLast();
		
		waitExpectedElement("//tr[contains(@id, \"MonitorTable\")][1]");

		int rowsA = rows("//tr[contains(@id, \"MonitorTable\")]");

		boolean deleted = greaterThanInt(rowsB, rowsA);

		System.out.println("Record deleted succesfully: " + deleted);
		assertTrue(deleted, deletionRecord);


		

	}
	
	
	
}
