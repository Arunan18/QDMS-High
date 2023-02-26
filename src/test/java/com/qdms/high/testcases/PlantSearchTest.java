//***********************************************************************************
//* Description
//*------------
//* Add Sbu functionaltiy
//***********************************************************************************
//*
//* Author           : Suntharalingam Arunan
//* Date Written     : 22/02/2023
//* 
//*
//* 
//* Test Case Number       Date         Intis        Comments
//* ================       ====         =====        ========
//*                        22/02/2023   Arunan     Orginal Version
//*
//************************************************************************************
package com.qdms.high.testcases;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.aventstack.extentreports.Status;
import com.qdms.high.base.DriverIntialization;
import com.qdms.high.pages.PlantSearchPage;

public class PlantSearchTest extends DriverIntialization {
	static PlantSearchPage psp = new PlantSearchPage();
	static boolean PlantCodeSearchVisible = true;
	static boolean PlantCodeSearchEnable = true;
	static boolean PlantCodeSearchTextBoxVisible = true;
	static boolean PlantCodeSearchTextBoxEnable = true;
	static boolean PlantCodeSearchButtonVisible = true;
	static boolean PlantCodeSearchButtonEnable = true;
	static boolean PlantCodeTableData = true; 
	static boolean PlantTableData = true;
	static boolean SbuTableData = true;
	static boolean ManagerTableData = true;
	static boolean AddressTableData = true;
	static boolean ContactNoTableData = true;
	static boolean FaxTableData = true;
	static int BeforeFilteringDataCount = 0;
	static int AfterFilteringDataCount = 0;
	static int BeforeFilteringDataCountPlant = 0;
	static int AfterFilteringDataCountPlant = 0;
	static int BeforeFilteringDataCountSbu = 0;
	static int AfterFilteringDataCountSbu = 0;
	static int BeforeFilteringDataCountManager = 0;
	static int AfterFilteringDataCountManager = 0;
	static int BeforeFilteringDataCountAddress = 0;
	static int AfterFilteringDataCountAddress = 0;
	static int BeforeFilteringDataCountContactNo = 0;
	static int AfterFilteringDataCountContactNo = 0;
	static boolean checkCode=true;
	static boolean checkPlant=true;
	static boolean checkSbu=true;
	static boolean checkManager=true;
	static boolean checkAddress=true;
	static boolean checkContactNo=true;
	

//	Plant Code Search Button
	public static void plantCodeSearch() { 
		PageFactory.initElements(driver, psp);
//		Check Plant Code Search Properties
		testCase = extent.createTest("Plant Code Search Button Visible");
		try {
			Assert.assertEquals(PlantSearchPage.PlantCodeSearch.isDisplayed(), true);
			testCase.log(Status.INFO, "Plant Code Search Button Visible");
			testCase.log(Status.PASS, "Plant Code Search Button Visible Script Pass").assignCategory("High-Severity");
		} catch (AssertionError e) {
			PlantCodeSearchVisible = false;
			testCase.log(Status.INFO, "Plant Code Search Button Not Visible");
			testCase.log(Status.FAIL, "Plant Code Search Button Not Visible").assignCategory("High-Severity");
		} catch (NoSuchElementException e) {
			PlantCodeSearchVisible = false;
			testCase.log(Status.INFO, "Dont have Plant Code Search Button Locator");
			testCase.log(Status.FAIL, "Dont have Plant Code Search Button Locator, So Smoke Fail")
					.assignCategory("High-Severity");
		}

		if (PlantCodeSearchVisible) {
//			Check Plant Code Search Enable
			testCase = extent.createTest("Plant Code Search Button Enable");
			try {
				Assert.assertEquals(PlantSearchPage.PlantCodeSearch.isEnabled(), true);
				testCase.log(Status.INFO, "Plant Code Search Button Enable");
				testCase.log(Status.PASS, "Plant Code Search Button Enable Script Pass")
						.assignCategory("High-Severity");
			} catch (AssertionError e) {
				PlantCodeSearchEnable = false;
				testCase.log(Status.INFO, "Plant Code Search Button Not Enable");
				testCase.log(Status.FAIL, "Plant Code Search Button Not Enable").assignCategory("High-Severity");
			}

			if (PlantCodeSearchEnable) {
//				
			}
		}
	}

//	Check Plant Code Search Button Click
	public static void ClickPlantCodeSearch() throws InterruptedException {
		PageFactory.initElements(driver, psp);
		if (PlantCodeSearchVisible && PlantCodeSearchEnable) {
			PlantSearchPage.PlantCodeSearch.click();
		}
	}

//	Plant Code input TextBox Properties
	public static void plantCodeSearchTextBox() throws InterruptedException {
		PageFactory.initElements(driver, psp);

//		Check Plant Code Search TextBox Visible
		testCase = extent.createTest("Plant Code Search Text Box Visible");
		try {
			Thread.sleep(1000);
			Assert.assertEquals(PlantSearchPage.SearchTextBox.isDisplayed(), true);
			testCase.log(Status.INFO, "Plant Code Search Text Box Visible");
			testCase.log(Status.PASS, "Plant Code Search Text Box Visible Script Pass").assignCategory("High-Severity");
		} catch (AssertionError e) {
			PlantCodeSearchTextBoxVisible = false;
			testCase.log(Status.INFO, "Plant Code Search Text Box Not Visible");
			testCase.log(Status.FAIL, "Plant Code Search Text Box Not Visible").assignCategory("High-Severity");
		} catch (NoSuchElementException e) {
			PlantCodeSearchTextBoxVisible = false;
			testCase.log(Status.INFO, "Dont have Plant Code Search Text Box Locator");
			testCase.log(Status.FAIL, "Dont have Plant Code Search Text Box Locator, So Smoke Fail")
					.assignCategory("High-Severity");
		}

		if (PlantCodeSearchTextBoxVisible) {
//			Check Plant Code Search TextBoxEnable
			testCase = extent.createTest("Plant Code Search Text Box Enable");
			try {
				Assert.assertEquals(PlantSearchPage.SearchTextBox.isEnabled(), true);
				testCase.log(Status.INFO, "Plant Code Search Text Box Enable");
				testCase.log(Status.PASS, "Plant Code Search Text Box Enable Script Pass")
						.assignCategory("High-Severity");
			} catch (AssertionError e) {
				PlantCodeSearchTextBoxEnable = false;
				testCase.log(Status.INFO, "Plant Code Search Text Box Not Enable");
				testCase.log(Status.FAIL, "Plant Code Search Text Box Not Enable").assignCategory("High-Severity");
			}

			if (PlantCodeSearchTextBoxEnable) {
//				
			}
		}
	}

//Plant Code Search Button Properties
	public static void plantCodeSearchButton() throws InterruptedException {
		PageFactory.initElements(driver, psp);

//	Check Plant Code Search TextBox Visible
		testCase = extent.createTest("Plant Code Search Button Visible");
		try {
			Thread.sleep(1000);
			Assert.assertEquals(PlantSearchPage.SearchTextBox.isDisplayed(), true);
			testCase.log(Status.INFO, "Plant Code Search Button Visible");
			testCase.log(Status.PASS, "Plant Code Search Button Visible Script Pass").assignCategory("High-Severity");
		} catch (AssertionError e) {
			PlantCodeSearchButtonVisible = false;
			testCase.log(Status.INFO, "Plant Code Search Button Not Visible");
			testCase.log(Status.FAIL, "Plant Code Search Button Not Visible").assignCategory("High-Severity");
		} catch (NoSuchElementException e) {
			PlantCodeSearchButtonVisible = false;
			testCase.log(Status.INFO, "Dont have Plant Code Search Button Locator");
			testCase.log(Status.FAIL, "Dont have Plant Code Search Button Locator, So Smoke Fail")
					.assignCategory("High-Severity");
		}

		if (PlantCodeSearchButtonVisible) {
//		Check Plant Code Search TextBoxEnable
			testCase = extent.createTest("Plant Code Search Button Enable");
			try {
				Assert.assertEquals(PlantSearchPage.SearchTextBox.isEnabled(), true);
				testCase.log(Status.INFO, "Plant Code Search Button Enable");
				testCase.log(Status.PASS, "Plant Code Search Button Enable Script Pass")
						.assignCategory("High-Severity");
			} catch (AssertionError e) {
				PlantCodeSearchButtonEnable = false;
				testCase.log(Status.INFO, "Plant Code Search Button Not Enable");
				testCase.log(Status.FAIL, "Plant Code Search Button Not Enable").assignCategory("High-Severity");
			}

			if (PlantCodeSearchButtonEnable) {
//			
			}
		}
	}

//Plant Code input TextBox Properties
	public static void plantCodeSearchButtonClick() throws InterruptedException {
		PageFactory.initElements(driver, psp);

		if (PlantCodeSearchButtonVisible && PlantCodeSearchButtonEnable) {
			PlantSearchPage.SearchBtn.click();
		}
	}

//	Input Search Data
	public static void inputDataSearch() throws IOException, InterruptedException {
		PageFactory.initElements(driver, psp);
		if (PlantCodeSearchTextBoxVisible && PlantCodeSearchTextBoxEnable) {
			FileInputStream file = new FileInputStream(
					System.getProperty("user.dir") + "\\src\\test\\resources\\Excel-sheets\\SampleExcel.xlsx");
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			XSSFSheet sheet = workbook.getSheet("PlantSearch");

			int rowcount = sheet.getLastRowNum();
			for (int i = 0; i <= rowcount; i++) {
				XSSFRow row = sheet.getRow(i);

				boolean check = (boolean) row.getCell(0).getBooleanCellValue();
				String PlanteCode = (String) row.getCell(1).getStringCellValue();

				if (check) {
					PlantSearchPage.SearchTextBox.sendKeys(PlanteCode);
					plantCodeSearchButtonClick();
					Thread.sleep(1000);
					checkAfterSearchData(PlanteCode);
					Thread.sleep(1000);
					boolean checke=true;
					try {
						Assert.assertEquals(BeforeFilteringDataCount, AfterFilteringDataCount);
					} catch (AssertionError e) {
						checke=false;
					}
					if (checke && PlantCodeTableData) {
						checkCode=true;
					} else {
						checkCode=false;
					}

				}

			}
		}
	}

//	BeforeFilteringDataCount
	public static void checkBeforeSearchData(String Sbu) throws InterruptedException {
		PageFactory.initElements(driver, psp);
		boolean Enablity = true;
		while (Enablity) {
//			Thread.sleep(3000);
			for (int j = 2; j <= PlantSearchPage.PlantCodeColumn.size(); j++) {
				WebElement code = driver
						.findElement(By.xpath(PlantSearchPage.PlantColumnBefore + j + PlantSearchPage.PlantCodeColumnAfter));
				Thread.sleep(500);
				String CodeName = code.getText();
				if (CodeName.contains(Sbu)) {
					BeforeFilteringDataCount = BeforeFilteringDataCount + 1;
				}
			}
			PlantSearchPage.NextPageBtn.click();
			Enablity = PlantSearchPage.NextPageBtn.isEnabled();
		}

		System.out.println("BeforeFilteringDataCount : " + BeforeFilteringDataCount);

		boolean firstPage = PlantSearchPage.PreviousPageBtn.isEnabled();
		while (firstPage) {
			PlantSearchPage.PreviousPageBtn.click();
			firstPage = PlantSearchPage.PreviousPageBtn.isEnabled();
		}
		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_UP).build().perform();
		Thread.sleep(2000);
//		driver.navigate().refresh();
	}

//	afterFilteringDataCount
	public static void checkAfterSearchData(String Sbu) throws InterruptedException {
		PageFactory.initElements(driver, psp);
		boolean Enablity = true;
		while (Enablity) {
			Thread.sleep(3000);
			for (int j = 2; j <= PlantSearchPage.PlantCodeColumn.size(); j++) {
				WebElement code = driver
						.findElement(By.xpath(PlantSearchPage.PlantCodeColumnBefore + j + PlantSearchPage.PlantCodeColumnAfter));
//				Thread.sleep(1000);
				String CodeName = code.getText();
				if (CodeName.contains(Sbu)) {
					AfterFilteringDataCount = AfterFilteringDataCount + 1;
				}
				if (!CodeName.contains(Sbu)) {
					PlantCodeTableData = false;
				}
			}
			PlantSearchPage.NextPageBtn.click();
			Enablity = PlantSearchPage.NextPageBtn.isEnabled();

		}
		System.out.println("AfterFilteringDataCount : " + AfterFilteringDataCount);
	}

	
	
//	***********************************************************PLANT*****************************************************
//	Check Plant Code Search Button Click
	public static void ClickPlantSearch() throws InterruptedException {
		PageFactory.initElements(driver, psp);
		PlantSearchPage.PlantNameSearch.click();

	}

//	Input SBU Search Data
	public static void inputPlantDataSearch() throws IOException, InterruptedException {
		PageFactory.initElements(driver, psp);

		FileInputStream file = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\resources\\Excel-sheets\\SampleExcel.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("PlantSearch");

		int rowcount = sheet.getLastRowNum();
		for (int i = 0; i <= rowcount; i++) {
			XSSFRow row = sheet.getRow(i);

			boolean check = (boolean) row.getCell(0).getBooleanCellValue();
			String PlantName = (String) row.getCell(2).getStringCellValue();

			if (check) {
				Thread.sleep(1000);
				PlantSearchPage.SearchTextBox.sendKeys(PlantName);
				Thread.sleep(1000);
				checkAfterPlantSearchData(PlantName);
				Thread.sleep(1000);
				boolean checkee= true;
				try {
					Assert.assertEquals(BeforeFilteringDataCountPlant, AfterFilteringDataCountPlant);
					checkee=true;
				} catch (AssertionError e) {
					checkee=false;
				}
				if (checkee && PlantTableData) {
					checkPlant=true;
				} else {
					checkPlant=false;
				}

			}

		}
	}

//	
	public static void checkBeforePlantSearchData(String Plant) throws InterruptedException {
		PageFactory.initElements(driver, psp);
		boolean Enablity = true;
		while (Enablity) {
//			Thread.sleep(3000);
			for (int j = 2; j <= PlantSearchPage.PlantColumn.size(); j++) {
				WebElement code = driver
						.findElement(By.xpath(PlantSearchPage.PlantColumnBefore + j + PlantSearchPage.PlantColumnAfter));
				Thread.sleep(1000);
				String CodeName = code.getText();
				if (CodeName.contains(Plant)) {
					BeforeFilteringDataCountPlant = BeforeFilteringDataCountPlant + 1;
				}
			}
			if (PlantSearchPage.NextPageBtn.isEnabled()) {
				PlantSearchPage.NextPageBtn.click();
			}
			Enablity = PlantSearchPage.NextPageBtn.isEnabled();
		}

		System.out.println("BeforeFilteringDataCountPlant : " + BeforeFilteringDataCountPlant);

		boolean firstPage = PlantSearchPage.PreviousPageBtn.isEnabled();
		while (firstPage) {
			PlantSearchPage.PreviousPageBtn.click();
			firstPage = PlantSearchPage.PreviousPageBtn.isEnabled();
		}
		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_UP).build().perform();
		Thread.sleep(2000);
//		driver.navigate().refresh();
	}

//	afterFilteringDataCount
	public static void checkAfterPlantSearchData(String Plant) throws InterruptedException {
		PageFactory.initElements(driver, psp);
		boolean Enablity = true;
		while (Enablity) {
			Thread.sleep(3000);
			for (int j = 2; j <= PlantSearchPage.PlantColumn.size(); j++) {
				WebElement code = driver
						.findElement(By.xpath(PlantSearchPage.PlantColumnBefore + j + PlantSearchPage.PlantColumnAfter));
//				Thread.sleep(1000);
				String CodeName = code.getText();
				if (CodeName.contains(Plant)) {
					AfterFilteringDataCountPlant = AfterFilteringDataCountPlant + 1;
				}
				if (!CodeName.contains(Plant)) {
					PlantTableData = false;
				}
			} 
			if(PlantSearchPage.NextPageBtn.isEnabled()) {
			PlantSearchPage.NextPageBtn.click();
			}
			Enablity = PlantSearchPage.NextPageBtn.isEnabled();

		}
		System.out.println("AfterFilteringDataCountPlant : " + AfterFilteringDataCountPlant);
	}
//	********************************************SBU********************************************************************

//	Check Plant Code Search Button Click
	public static void ClickSbuSearch() throws InterruptedException {
		PageFactory.initElements(driver, psp);
		PlantSearchPage.SbuSearch.click();

	}

//	Input SBU Search Data
	public static void inputSbuDataSearch() throws IOException, InterruptedException {
		PageFactory.initElements(driver, psp);

		FileInputStream file = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\resources\\Excel-sheets\\SampleExcel.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("PlantSearch");

		int rowcount = sheet.getLastRowNum();
		for (int i = 0; i <= rowcount; i++) {
			XSSFRow row = sheet.getRow(i);

			boolean check = (boolean) row.getCell(0).getBooleanCellValue();
			String sbu = (String) row.getCell(3).getStringCellValue();

			if (check) {
				Thread.sleep(1000);
				PlantSearchPage.SearchTextBox.sendKeys("RMC");
				Thread.sleep(1000);
				checkAfterSbuSearchData("RMC");
				Thread.sleep(1000);
				boolean checkee= true;
				try {
					Assert.assertEquals(BeforeFilteringDataCountPlant, AfterFilteringDataCountPlant);
					checkee=true;
				} catch (AssertionError e) {
					checkee=false;
				}
				if (checkee && SbuTableData) {
					checkSbu=true;
				} else {
					checkSbu=false;
				}

			}

		}
	}

//	Before Filter
	public static void checkBeforeSbuSearchData(String Sbu) throws InterruptedException {
		PageFactory.initElements(driver, psp);
		boolean Enablity = true;
		while (Enablity) {
//			Thread.sleep(3000);
			for (int j = 2; j <= PlantSearchPage.SbuColumn.size(); j++) {
				WebElement code = driver
						.findElement(By.xpath(PlantSearchPage.SbuColumnBefore + j + PlantSearchPage.SbuColumnAfter));
				Thread.sleep(1000);
				String CodeName = code.getText();
				if (CodeName.contains(Sbu)) {
					BeforeFilteringDataCountSbu = BeforeFilteringDataCountSbu + 1;
				}
			}
			if (PlantSearchPage.NextPageBtn.isEnabled()) {
				PlantSearchPage.NextPageBtn.click();
			}
			Enablity = PlantSearchPage.NextPageBtn.isEnabled();
		}

		System.out.println("BeforeFilteringDataCountSbu : " + BeforeFilteringDataCountSbu);

		boolean firstPage = PlantSearchPage.PreviousPageBtn.isEnabled();
		while (firstPage) {
			PlantSearchPage.PreviousPageBtn.click();
			firstPage = PlantSearchPage.PreviousPageBtn.isEnabled();
		}
		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_UP).build().perform();
		Thread.sleep(2000);
//		driver.navigate().refresh();
	}

//	afterFilteringDataCount
	public static void checkAfterSbuSearchData(String Sbu) throws InterruptedException {
		PageFactory.initElements(driver, psp);
		boolean Enablity = true;
		while (Enablity) {
			Thread.sleep(3000);
			for (int j = 2; j <= PlantSearchPage.SbuColumn.size(); j++) {
				WebElement code = driver
						.findElement(By.xpath(PlantSearchPage.SbuColumnBefore + j + PlantSearchPage.SbuColumnAfter));
//				Thread.sleep(1000);
				String CodeName = code.getText();
				if (CodeName.contains(Sbu)) {
					AfterFilteringDataCountSbu = AfterFilteringDataCountSbu + 1;
				}
				if (!CodeName.contains(Sbu)) {
					PlantTableData = false;
				}
			} 
			if(PlantSearchPage.NextPageBtn.isEnabled()) {
			PlantSearchPage.NextPageBtn.click();
			}
			Enablity = PlantSearchPage.NextPageBtn.isEnabled();

		}
		System.out.println("AfterFilteringDataCountSbu : " + AfterFilteringDataCountSbu);
	}
//	***********************************************Manager**************************************************************
//	Check Plant Code Search Button Click
	public static void ClickManagerSearch() throws InterruptedException {
		PageFactory.initElements(driver, psp);
		PlantSearchPage.PlantManagerSearch.click();

	}

//	Input SBU Search Data
	public static void inputManagerDataSearch() throws IOException, InterruptedException {
		PageFactory.initElements(driver, psp);

		FileInputStream file = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\resources\\Excel-sheets\\SampleExcel.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("PlantSearch");

		int rowcount = sheet.getLastRowNum();
		for (int i = 0; i <= rowcount; i++) {
			XSSFRow row = sheet.getRow(i);

			boolean check = (boolean) row.getCell(0).getBooleanCellValue();
			String PlantManager = (String) row.getCell(4).getStringCellValue();

			if (check) {
				Thread.sleep(1000);
				PlantSearchPage.SearchTextBox.sendKeys(PlantManager);
				Thread.sleep(1000);
				checkAfterManagerSearchData(PlantManager);
				Thread.sleep(1000);
				boolean checkee= true;
				try {
					Assert.assertEquals(BeforeFilteringDataCountPlant, AfterFilteringDataCountPlant);
					checkee=true;
				} catch (AssertionError e) {
					checkee=false;
				}
				if (checkee && ManagerTableData) {
					checkManager=true;
				} else {
					checkManager=false;
				}

			}

		}
	}

//	Before Filter
	public static void checkBeforeManagerSearchData(String Manager) throws InterruptedException {
		PageFactory.initElements(driver, psp);
		boolean Enablity = true;
		while (Enablity) {
//			Thread.sleep(3000);
			for (int j = 2; j <= PlantSearchPage.managerColumn.size(); j++) {
				WebElement code = driver
						.findElement(By.xpath(PlantSearchPage.managerColumnBefore + j + PlantSearchPage.managerColumnAfter));
				Thread.sleep(1000);
				String CodeName = code.getText();
				if (CodeName.contains(Manager)) {
					BeforeFilteringDataCountManager = BeforeFilteringDataCountManager + 1;
				}
			}
			if (PlantSearchPage.NextPageBtn.isEnabled()) {
				PlantSearchPage.NextPageBtn.click();
			}
			Enablity = PlantSearchPage.NextPageBtn.isEnabled();
		}

		System.out.println("BeforeFilteringDataCountManager : " + BeforeFilteringDataCountManager);

		boolean firstPage = PlantSearchPage.PreviousPageBtn.isEnabled();
		while (firstPage) {
			PlantSearchPage.PreviousPageBtn.click();
			firstPage = PlantSearchPage.PreviousPageBtn.isEnabled();
		}
		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_UP).build().perform();
		Thread.sleep(2000);
//		driver.navigate().refresh();
	}

//	afterFilteringDataCount
	public static void checkAfterManagerSearchData(String Manager) throws InterruptedException {
		PageFactory.initElements(driver, psp);
		boolean Enablity = true;
		while (Enablity) {
			Thread.sleep(3000);
			for (int j = 2; j <= PlantSearchPage.managerColumn.size(); j++) {
				WebElement code = driver
						.findElement(By.xpath(PlantSearchPage.managerColumnBefore + j + PlantSearchPage.managerColumnAfter));
//				Thread.sleep(1000);
				String CodeName = code.getText();
				if (CodeName.contains(Manager)) {
					AfterFilteringDataCountManager = AfterFilteringDataCountManager + 1;
				}
				if (!CodeName.contains(Manager)) {
					ManagerTableData = false;
				}
			} 
			if(PlantSearchPage.NextPageBtn.isEnabled()) {
			PlantSearchPage.NextPageBtn.click();
			}
			Enablity = PlantSearchPage.NextPageBtn.isEnabled();

		}
		System.out.println("AfterFilteringDataCountManager : " + AfterFilteringDataCountManager);
	}
//	*****************************************Address*******************************************************************
	
//	Check Plant Code Search Button Click
	public static void ClickAddressSearch() throws InterruptedException {
		PageFactory.initElements(driver, psp);
		PlantSearchPage.AddressSearch.click();

	}

//	Input SBU Search Data
	public static void inputAddressDataSearch() throws IOException, InterruptedException {
		PageFactory.initElements(driver, psp);

		FileInputStream file = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\resources\\Excel-sheets\\SampleExcel.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("PlantSearch");

		int rowcount = sheet.getLastRowNum();
		for (int i = 0; i <= rowcount; i++) {
			XSSFRow row = sheet.getRow(i);

			boolean check = (boolean) row.getCell(0).getBooleanCellValue();
			String Address = (String) row.getCell(5).getStringCellValue();

			if (check) {
				Thread.sleep(2000);
				PlantSearchPage.SearchTextBox.sendKeys(Address);
				Thread.sleep(1000);
				checkAfterAddressSearchData(Address);
				Thread.sleep(1000);
				boolean checkee= true;
				try {
					Assert.assertEquals(BeforeFilteringDataCountAddress, AfterFilteringDataCountAddress);
					checkee=true;
				} catch (AssertionError e) {
					checkee=false;
				}
				if (checkee && AddressTableData) {
					checkAddress=true;
				} else {
					checkAddress=false;
				}

			}

		}
	}

//	Before Filter
	public static void checkBeforeAddressSearchData(String Address) throws InterruptedException {
		PageFactory.initElements(driver, psp);
		boolean Enablity = true;
		while (Enablity) {
//			Thread.sleep(3000);
			for (int j = 2; j <= PlantSearchPage.AddressColumn.size(); j++) {
				WebElement code = driver
						.findElement(By.xpath(PlantSearchPage.addressColumnBefore + j + PlantSearchPage.addressColumnAfter));
				Thread.sleep(1000);
				String CodeName = code.getText();
				if (CodeName.contains(Address)) {
					BeforeFilteringDataCountAddress = BeforeFilteringDataCountAddress + 1;
				}
			}
			if (PlantSearchPage.NextPageBtn.isEnabled()) {
				PlantSearchPage.NextPageBtn.click();
			}
			Enablity = PlantSearchPage.NextPageBtn.isEnabled();
		}

		System.out.println("BeforeFilteringDataCountAddress : " + BeforeFilteringDataCountAddress);

		boolean firstPage = PlantSearchPage.PreviousPageBtn.isEnabled();
		while (firstPage) {
			PlantSearchPage.PreviousPageBtn.click();
			firstPage = PlantSearchPage.PreviousPageBtn.isEnabled();
		}
		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_UP).build().perform();
		Thread.sleep(2000);
//		driver.navigate().refresh();
	}

//	afterFilteringDataCount
	public static void checkAfterAddressSearchData(String Address) throws InterruptedException {
		PageFactory.initElements(driver, psp);
		boolean Enablity = true;
		while (Enablity) {
			Thread.sleep(3000);
			for (int j = 2; j <= PlantSearchPage.AddressColumn.size(); j++) {
				WebElement code = driver
						.findElement(By.xpath(PlantSearchPage.addressColumnBefore + j + PlantSearchPage.addressColumnAfter));
//				Thread.sleep(1000);
				String CodeName = code.getText();
				if (CodeName.contains(Address)) {
					AfterFilteringDataCountAddress = AfterFilteringDataCountAddress + 1;
				}
				if (!CodeName.contains(Address)) {
					AddressTableData = false;
				}
			} 
			if(PlantSearchPage.NextPageBtn.isEnabled()) {
			PlantSearchPage.NextPageBtn.click();
			}
			Enablity = PlantSearchPage.NextPageBtn.isEnabled();

		}
		System.out.println("AfterFilteringDataCountAddress : " + AfterFilteringDataCountAddress);
	}
//	**********************************************CONTACT NO *********************************************************
//	Check Plant Code Search Button Click
	public static void ClickContactNoSearch() throws InterruptedException {
		PageFactory.initElements(driver, psp);
		PlantSearchPage.ContactNoSearch.click();

	}

//	Input SBU Search Data
	public static void inputContactNoDataSearch() throws IOException, InterruptedException {
		PageFactory.initElements(driver, psp);

		FileInputStream file = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\resources\\Excel-sheets\\SampleExcel.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("PlantSearch");

		int rowcount = sheet.getLastRowNum();
		for (int i = 0; i <= rowcount; i++) {
			XSSFRow row = sheet.getRow(i);

			boolean check = (boolean) row.getCell(0).getBooleanCellValue();
			String ContactNo = (String) row.getCell(6).getStringCellValue();

			if (check) {
				Thread.sleep(1000);
				PlantSearchPage.SearchTextBox.sendKeys(ContactNo);
				Thread.sleep(1000);
				checkAfterContactNoSearchData(ContactNo);
				Thread.sleep(1000);
				boolean checkee= true;
				try {
					Assert.assertEquals(BeforeFilteringDataCountContactNo, AfterFilteringDataCountContactNo);
					checkee=true;
				} catch (AssertionError e) {
					checkee=false;
				}
				if (checkee && ContactNoTableData) {
					checkContactNo=true;
				} else {
					checkContactNo=false;
				}

			}

		}
	}

//	Before Filter
	public static void checkBeforeContactNoSearchData(String ContactNo) throws InterruptedException {
		PageFactory.initElements(driver, psp);
		boolean Enablity = true;
		while (Enablity) {
//			Thread.sleep(3000);
			for (int j = 2; j <= PlantSearchPage.MobileColumn.size(); j++) {
				WebElement code = driver
						.findElement(By.xpath(PlantSearchPage.mobileColumnBefore + j + PlantSearchPage.mobileColumnAfter));
				Thread.sleep(1000);
				String CodeName = code.getText();
				if (CodeName.contains(ContactNo)) {
					BeforeFilteringDataCountContactNo = BeforeFilteringDataCountContactNo + 1;
				}
			}
			if (PlantSearchPage.NextPageBtn.isEnabled()) {
				PlantSearchPage.NextPageBtn.click();
			}
			Enablity = PlantSearchPage.NextPageBtn.isEnabled();
		}

		System.out.println("BeforeFilteringDataCountContactNo : " + BeforeFilteringDataCountContactNo);

		boolean firstPage = PlantSearchPage.PreviousPageBtn.isEnabled();
		while (firstPage) {
			PlantSearchPage.PreviousPageBtn.click();
			firstPage = PlantSearchPage.PreviousPageBtn.isEnabled();
		}
		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_UP).build().perform();
		Thread.sleep(2000);
//		driver.navigate().refresh();
	}

//	afterFilteringDataCount
	public static void checkAfterContactNoSearchData(String ContactNo) throws InterruptedException {
		PageFactory.initElements(driver, psp);
		boolean Enablity = true;
		while (Enablity) {
			Thread.sleep(3000);
			for (int j = 2; j <= PlantSearchPage.MobileColumn.size(); j++) {
				WebElement code = driver
						.findElement(By.xpath(PlantSearchPage.mobileColumnBefore + j + PlantSearchPage.mobileColumnAfter));
//				Thread.sleep(1000);
				String CodeName = code.getText();
				if (CodeName.contains(ContactNo)) {
					AfterFilteringDataCountContactNo= AfterFilteringDataCountContactNo + 1;
				}
				if (!CodeName.contains(ContactNo)) {
					AddressTableData = false;
				}
			} 
			if(PlantSearchPage.NextPageBtn.isEnabled()) {
			PlantSearchPage.NextPageBtn.click();
			}
			Enablity = PlantSearchPage.NextPageBtn.isEnabled();

		}
		System.out.println("AfterFilteringDataCountContactNo : " + AfterFilteringDataCountContactNo);
	}
	
//**********************************************************REPORT*********************************************************
	
	public static void Report() {
		PageFactory.initElements(driver, psp); 
		if (checkCode && checkPlant && checkSbu && checkManager && checkAddress && checkContactNo) { 
			testCase = extent.createTest("PLANT-MULTI SEARCH - Check Correct Data Count Filter");
			testCase.log(Status.INFO, "Correct Data Count Filtered");
			testCase.log(Status.PASS, "Correct Data Count Filtered").assignCategory("High-Severity");
		} else { 
			testCase = extent.createTest("PLANT-MULTI SEARCH - Check Correct Data Count Filter");
			testCase.log(Status.INFO, "Wrong Data Count Filtered");
			testCase.log(Status.FAIL, "Wrong Data Count Filtered").assignCategory("High-Severity");
		}
	}
}
