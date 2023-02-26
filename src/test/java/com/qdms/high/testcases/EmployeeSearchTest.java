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
import com.qdms.high.pages.EmployeeSearchPage;
import com.qdms.high.pages.EmployeeSearchPage;

public class EmployeeSearchTest extends DriverIntialization{
	static EmployeeSearchPage psp = new EmployeeSearchPage();
	static boolean FirstNameSearchVisible = true;
	static boolean FirstNameSearchEnable = true;
	static boolean SearchTextBoxVisible = true;
	static boolean SearchTextBoxEnable = true;
	static boolean SearchButtonVisible = true;
	static boolean SearchButtonEnable = true;
	static boolean FirstNameTableData = true;
	static boolean LastNameTableData = true;
	static boolean PlantTableData = true;
	static boolean DesignationTableData = true;
	static boolean EmailTableData = true;
	static boolean ContactNoTableData = true;
	static int BeforeFilteringFirstNameDataCount = 0;
	static int AfterFilteringFirstNameDataCount = 0; 
	static int BeforeFilteringLastNameDataCount = 0;
	static int AfterFilteringLastNameDataCount = 0;
	static int BeforeFilteringPlantDataCount = 0;
	static int AfterFilteringPlantDataCount = 0;
	static int BeforeFilteringDesignationDataCount = 0;
	static int AfterFilteringDesignationDataCount = 0;
	static int BeforeFilteringEmailDataCount = 0;
	static int AfterFilteringEmailDataCount = 0;
	static int BeforeFilteringContactNoDataCount = 0;
	static int AfterFilteringContactNoDataCount = 0;
	static boolean checkFirstName=true;
	static boolean checkLastName=true;
	static boolean checkPlant=true;
	static boolean checkDesignation=true;
	static boolean checkEmail=true;
	static boolean checkContactNo=true;
	

//	FirstName Search Button
	public static void FirstnameSearch() {
		PageFactory.initElements(driver, psp);
//		Check Plant Code Search Properties
		testCase = extent.createTest("Employee FirstName Search Button Visible");
		try {
			Assert.assertEquals(EmployeeSearchPage.FirstNameSearch.isDisplayed(), true);
			testCase.log(Status.INFO, "Employee FirstName Search Button Visible");
			testCase.log(Status.PASS, "Employee FirstName Search Button Visible Script Pass").assignCategory("High-Severity");
		} catch (AssertionError e) {
			FirstNameSearchVisible = false;
			testCase.log(Status.INFO, "Employee FirstName Search Button Not Visible");
			testCase.log(Status.FAIL, "Employee FirstName Search Button Not Visible").assignCategory("High-Severity");
		} catch (NoSuchElementException e) {
			FirstNameSearchVisible = false;
			testCase.log(Status.INFO, "Dont have Employee FirstName Search Button Locator");
			testCase.log(Status.FAIL, "Dont have Employee FirstName Search Button Locator, So Smoke Fail")
					.assignCategory("High-Severity");
		}

		if (FirstNameSearchVisible) {
//			Check Employee FirstName Search Enable
			testCase = extent.createTest("Employee FirstName Search Button Enable");
			try {
				Assert.assertEquals(EmployeeSearchPage.FirstNameSearch.isEnabled(), true);
				testCase.log(Status.INFO, "Employee FirstName Search Button Enable");
				testCase.log(Status.PASS, "Employee FirstName Search Button Enable Script Pass")
						.assignCategory("High-Severity");
			} catch (AssertionError e) {
				FirstNameSearchEnable = false;
				testCase.log(Status.INFO, "Employee FirstName Search Button Not Enable");
				testCase.log(Status.FAIL, "Employee FirstName Search Button Not Enable").assignCategory("High-Severity");
			}

			if (FirstNameSearchEnable) {
//				
			}
		}
	}

//	Check Employee FirstName Search Button Click
	public static void ClickFirstNameSearch() throws InterruptedException {
		PageFactory.initElements(driver, psp);
		if (FirstNameSearchVisible && FirstNameSearchEnable) {
			EmployeeSearchPage.FirstNameSearch.click();
		}
	}

//	Search input TextBox Properties
	public static void FirstnameSearchTextBox() throws InterruptedException {
		PageFactory.initElements(driver, psp);

//		Check Search TextBox Visible
		testCase = extent.createTest("Employee FirstName Search Text Box Visible");
		try {
			Thread.sleep(1000);
			Assert.assertEquals(EmployeeSearchPage.SearchTextBox.isDisplayed(), true);
			testCase.log(Status.INFO, "Employee FirstName Search Text Box Visible");
			testCase.log(Status.PASS, "Employee FirstName Search Text Box Visible Script Pass").assignCategory("High-Severity");
		} catch (AssertionError e) {
			SearchTextBoxVisible = false;
			testCase.log(Status.INFO, "Employee FirstName Search Text Box Not Visible");
			testCase.log(Status.FAIL, "Employee FirstName Search Text Box Not Visible").assignCategory("High-Severity");
		} catch (NoSuchElementException e) {
			SearchTextBoxVisible = false;
			testCase.log(Status.INFO, "Dont have Employee FirstName Search Text Box Locator");
			testCase.log(Status.FAIL, "Dont have Employee FirstName Search Text Box Locator, So Smoke Fail")
					.assignCategory("High-Severity");
		}

		if (SearchTextBoxVisible) {
//			Check Employee FirstName Search TextBoxEnable
			testCase = extent.createTest("Employee FirstName Search Text Box Enable");
			try {
				Assert.assertEquals(EmployeeSearchPage.SearchTextBox.isEnabled(), true);
				testCase.log(Status.INFO, "Employee FirstName Search Text Box Enable");
				testCase.log(Status.PASS, "Employee FirstName Search Text Box Enable Script Pass")
						.assignCategory("High-Severity");
			} catch (AssertionError e) {
				SearchTextBoxEnable = false;
				testCase.log(Status.INFO, "Employee FirstName Search Text Box Not Enable");
				testCase.log(Status.FAIL, "Employee FirstName Search Text Box Not Enable").assignCategory("High-Severity");
			}

			if (SearchTextBoxEnable) {
//				
			}
		}
	}

//Plant Code Search Button Properties
	public static void plantCodeSearchButton() throws InterruptedException {
		PageFactory.initElements(driver, psp);

//	Check Plant Code Search TextBox Visible
		testCase = extent.createTest("Employee Search Button Visible");
		try {
			Thread.sleep(1000);
			Assert.assertEquals(EmployeeSearchPage.SearchTextBox.isDisplayed(), true);
			testCase.log(Status.INFO, "Plant Code Search Button Visible");
			testCase.log(Status.PASS, "Plant Code Search Button Visible Script Pass").assignCategory("High-Severity");
		} catch (AssertionError e) {
			SearchButtonVisible = false;
			testCase.log(Status.INFO, "Plant Code Search Button Not Visible");
			testCase.log(Status.FAIL, "Plant Code Search Button Not Visible").assignCategory("High-Severity");
		} catch (NoSuchElementException e) {
			SearchButtonVisible = false;
			testCase.log(Status.INFO, "Dont have Plant Code Search Button Locator");
			testCase.log(Status.FAIL, "Dont have Plant Code Search Button Locator, So Smoke Fail")
					.assignCategory("High-Severity");
		}

		if (SearchButtonVisible) {
//		Check Plant Code Search TextBoxEnable
			testCase = extent.createTest("Plant Code Search Button Enable");
			try {
				Assert.assertEquals(EmployeeSearchPage.SearchTextBox.isEnabled(), true);
				testCase.log(Status.INFO, "Plant Code Search Button Enable");
				testCase.log(Status.PASS, "Plant Code Search Button Enable Script Pass")
						.assignCategory("High-Severity");
			} catch (AssertionError e) {
				SearchButtonEnable = false;
				testCase.log(Status.INFO, "Plant Code Search Button Not Enable");
				testCase.log(Status.FAIL, "Plant Code Search Button Not Enable").assignCategory("High-Severity");
			}

			if (SearchButtonEnable) {
//			
			}
		}
	}

//Plant Code input TextBox Properties
	public static void FirstNameSearchButtonClick() throws InterruptedException {
		PageFactory.initElements(driver, psp);

		if (SearchButtonVisible && SearchButtonEnable) {
			EmployeeSearchPage.FirstNameSearch.click();
		}
	}

//	Input Search Data
	public static void inputFirstNameDataSearch() throws IOException, InterruptedException {
		PageFactory.initElements(driver, psp);
		if (SearchTextBoxVisible && SearchTextBoxEnable) {
			FileInputStream file = new FileInputStream(
					System.getProperty("user.dir") + "\\src\\test\\resources\\Excel-sheets\\SampleExcel.xlsx");
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			XSSFSheet sheet = workbook.getSheet("Employee");

			int rowcount = sheet.getLastRowNum();
			for (int i = 0; i <= rowcount; i++) {
				XSSFRow row = sheet.getRow(i);

				boolean check = (boolean) row.getCell(0).getBooleanCellValue();
				String FirstName = (String) row.getCell(1).getStringCellValue();

				if (check) {
					EmployeeSearchPage.SearchTextBox.sendKeys(FirstName);
					FirstNameSearchButtonClick();
					Thread.sleep(1000);
					checkAfterSearchData(FirstName);
					Thread.sleep(1000);
					boolean checke=true;
					try {
						Assert.assertEquals(BeforeFilteringFirstNameDataCount, AfterFilteringFirstNameDataCount);
					} catch (AssertionError e) {
						checke=false;
					}
					if (checke && FirstNameTableData) {
						checkFirstName=true;
					} else {
						checkFirstName=false;
					}

				}

			}
		}
	}

//	BeforeFilteringFirstNameDataCount
	public static void checkBeforeFirstNameSearchData(String FirstName) throws InterruptedException {
		PageFactory.initElements(driver, psp);
		boolean Enablity = true;
		while (Enablity) {
//			Thread.sleep(3000);
			for (int j = 2; j <= EmployeeSearchPage.FirstNameColumn.size(); j++) {
				WebElement code = driver
						.findElement(By.xpath(EmployeeSearchPage.FirstNameColumnBefore + j + EmployeeSearchPage.FirstNameColumnAfter));
				Thread.sleep(1000);
				String CodeName = code.getText();
				if (CodeName.contains(FirstName)) {
					BeforeFilteringFirstNameDataCount = BeforeFilteringFirstNameDataCount + 1;
				}
			}
			EmployeeSearchPage.NextPageBtn.click();
			Enablity = EmployeeSearchPage.NextPageBtn.isEnabled();
		}

		System.out.println("BeforeFilteringFirstNameDataCount : " + BeforeFilteringFirstNameDataCount);

		boolean firstPage = EmployeeSearchPage.PreviousPageBtn.isEnabled();
		while (firstPage) {
			EmployeeSearchPage.PreviousPageBtn.click();
			firstPage = EmployeeSearchPage.PreviousPageBtn.isEnabled();
		}
		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_UP).build().perform();
		Thread.sleep(2000);
//		driver.navigate().refresh();
	}

//	AfterFilteringFirstNameDataCount
	public static void checkAfterSearchData(String FirstName) throws InterruptedException {
		PageFactory.initElements(driver, psp);
		boolean Enablity = true;
		while (Enablity) {
			Thread.sleep(3000);
			for (int j = 2; j <= EmployeeSearchPage.FirstNameColumn.size(); j++) {
				WebElement code = driver
						.findElement(By.xpath(EmployeeSearchPage.FirstNameColumnBefore + j + EmployeeSearchPage.FirstNameColumnAfter));
//				Thread.sleep(1000);
				String CodeName = code.getText();
				if (CodeName.contains(FirstName)) {
					AfterFilteringFirstNameDataCount = AfterFilteringFirstNameDataCount + 1;
				}
				if (!CodeName.contains(FirstName)) {
					FirstNameTableData = false;
				}
			}
			EmployeeSearchPage.NextPageBtn.click();
			Enablity = EmployeeSearchPage.NextPageBtn.isEnabled();

		}
		System.out.println("AfterFilteringFirstNameDataCount : " + AfterFilteringFirstNameDataCount);
	}

	
//	***********************************************************LAST NAME*****************************************************
//	Check LastName  Search Button Click
	public static void ClickLastNameSearch() throws InterruptedException {
		PageFactory.initElements(driver, psp);
		EmployeeSearchPage.LastNameSearch.click();

	}

//	Input SBU Search Data
	public static void inputLastNameDataSearch() throws IOException, InterruptedException {
		PageFactory.initElements(driver, psp);

		FileInputStream file = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\resources\\Excel-sheets\\SampleExcel.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Employee");

		int rowcount = sheet.getLastRowNum();
		for (int i = 0; i <= rowcount; i++) {
			XSSFRow row = sheet.getRow(i);

			boolean check = (boolean) row.getCell(0).getBooleanCellValue();
			String LastName = (String) row.getCell(2).getStringCellValue();

			if (check) {
				Thread.sleep(1000);
				EmployeeSearchPage.SearchTextBox.sendKeys(LastName);
				Thread.sleep(1000);
				checkAfterLastNameSearchData(LastName);
				Thread.sleep(1000);
				boolean checkee= true;
				try {
					Assert.assertEquals(BeforeFilteringLastNameDataCount, AfterFilteringLastNameDataCount);
					checkee=true;
				} catch (AssertionError e) {
					checkee=false;
				}
				if (checkee && LastNameTableData) {
					checkLastName=true;
				} else {
					checkLastName=false;
				}

			}

		}
	}

//	
	public static void checkBeforeLastNameSearchData(String LastName) throws InterruptedException {
		PageFactory.initElements(driver, psp);
		boolean Enablity = true;
		while (Enablity) {
//			Thread.sleep(3000);
			for (int j = 2; j <= EmployeeSearchPage.LastNameColumn.size(); j++) {
				WebElement code = driver
						.findElement(By.xpath(EmployeeSearchPage.LastNameColumnBefore + j + EmployeeSearchPage.LastNameColumnAfter));
				Thread.sleep(1000);
				String CodeName = code.getText();
				if (CodeName.contains(LastName)) {
					BeforeFilteringLastNameDataCount = BeforeFilteringLastNameDataCount + 1;
				}
			}
			if (EmployeeSearchPage.NextPageBtn.isEnabled()) {
				EmployeeSearchPage.NextPageBtn.click();
			}
			Enablity = EmployeeSearchPage.NextPageBtn.isEnabled();
		}

		System.out.println("BeforeFilteringLastNameDataCount : " + BeforeFilteringLastNameDataCount);

		boolean firstPage = EmployeeSearchPage.PreviousPageBtn.isEnabled();
		while (firstPage) {
			EmployeeSearchPage.PreviousPageBtn.click();
			firstPage = EmployeeSearchPage.PreviousPageBtn.isEnabled();
		}
		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_UP).build().perform();
		Thread.sleep(2000);
//		driver.navigate().refresh();
	}

//	AfterFilteringFirstNameDataCount
	public static void checkAfterLastNameSearchData(String LastName) throws InterruptedException {
		PageFactory.initElements(driver, psp);
		boolean Enablity = true;
		while (Enablity) {
			Thread.sleep(3000);
			for (int j = 2; j <= EmployeeSearchPage.LastNameColumn.size(); j++) {
				WebElement code = driver
						.findElement(By.xpath(EmployeeSearchPage.LastNameColumnBefore + j + EmployeeSearchPage.LastNameColumnAfter));
//				Thread.sleep(1000);
				String CodeName = code.getText();
				if (CodeName.contains(LastName)) {
					AfterFilteringLastNameDataCount = AfterFilteringLastNameDataCount + 1;
				}
				if (!CodeName.contains(LastName)) {
					LastNameTableData = false;
				}
			} 
			if(EmployeeSearchPage.NextPageBtn.isEnabled()) {
			EmployeeSearchPage.NextPageBtn.click();
			}
			Enablity = EmployeeSearchPage.NextPageBtn.isEnabled();

		}
		System.out.println("AfterFilteringLastNameDataCount : " + AfterFilteringLastNameDataCount);
	}
//	********************************************PLANT********************************************************************

//	Check Plant Code Search Button Click
	public static void ClickPlantsSearch() throws InterruptedException {
		PageFactory.initElements(driver, psp);
		EmployeeSearchPage.PlantSearch.click();

	}

//	Input SBU Search Data
	public static void inputPlantsDataSearch() throws IOException, InterruptedException {
		PageFactory.initElements(driver, psp);

		FileInputStream file = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\resources\\Excel-sheets\\SampleExcel.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Employee");

		int rowcount = sheet.getLastRowNum();
		for (int i = 0; i <= rowcount; i++) {
			XSSFRow row = sheet.getRow(i);

			boolean check = (boolean) row.getCell(0).getBooleanCellValue();
			String Plant = (String) row.getCell(3).getStringCellValue();

			if (check) {
				Thread.sleep(1000);
				EmployeeSearchPage.SearchTextBox.sendKeys("RMC");
				Thread.sleep(1000);
				checkAfterSbuSearchData("RMC");
				Thread.sleep(1000);
				boolean checkee= true;
				try {
					Assert.assertEquals(BeforeFilteringPlantDataCount, AfterFilteringPlantDataCount);
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

//	Before Filter
	public static void checkBeforePlantSearchData(String Plant) throws InterruptedException {
		PageFactory.initElements(driver, psp);
		boolean Enablity = true;
		while (Enablity) {
//			Thread.sleep(3000);
			for (int j = 2; j <= EmployeeSearchPage.PlantColumn.size(); j++) {
				WebElement code = driver
						.findElement(By.xpath(EmployeeSearchPage.PlantColumnBefore + j + EmployeeSearchPage.PlantColumnAfter));
				Thread.sleep(1000);
				String CodeName = code.getText();
				if (CodeName.contains(Plant)) {
					BeforeFilteringPlantDataCount = BeforeFilteringPlantDataCount + 1;
				}
			}
			if (EmployeeSearchPage.NextPageBtn.isEnabled()) {
				EmployeeSearchPage.NextPageBtn.click();
			}
			Enablity = EmployeeSearchPage.NextPageBtn.isEnabled();
		}

		System.out.println("BeforeFilteringPlantDataCount : " + BeforeFilteringPlantDataCount);

		boolean firstPage = EmployeeSearchPage.PreviousPageBtn.isEnabled();
		while (firstPage) {
			EmployeeSearchPage.PreviousPageBtn.click();
			firstPage = EmployeeSearchPage.PreviousPageBtn.isEnabled();
		}
		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_UP).build().perform();
		Thread.sleep(2000);
//		driver.navigate().refresh();
	}

//	AfterFilteringPlantDataCount
	public static void checkAfterSbuSearchData(String Plant) throws InterruptedException {
		PageFactory.initElements(driver, psp);
		boolean Enablity = true;
		while (Enablity) {
			Thread.sleep(3000);
			for (int j = 2; j <= EmployeeSearchPage.PlantColumn.size(); j++) {
				WebElement code = driver
						.findElement(By.xpath(EmployeeSearchPage.PlantColumnBefore + j + EmployeeSearchPage.PlantColumnAfter));
//				Thread.sleep(1000);
				String CodeName = code.getText();
				if (CodeName.contains(Plant)) {
					AfterFilteringPlantDataCount = AfterFilteringPlantDataCount + 1;
				}
				if (!CodeName.contains(Plant)) {
					PlantTableData = false;
				}
			} 
			if(EmployeeSearchPage.NextPageBtn.isEnabled()) {
			EmployeeSearchPage.NextPageBtn.click();
			}
			Enablity = EmployeeSearchPage.NextPageBtn.isEnabled();

		}
		System.out.println("AfterFilteringPlantDataCount : " + AfterFilteringPlantDataCount);
	}
//	***********************************************Designation**************************************************************
//	Check Designation Search Button Click
	public static void ClickDesignationSearch() throws InterruptedException {
		PageFactory.initElements(driver, psp);
		EmployeeSearchPage.DesignationSearch.click();

	}

//	Input SBU Search Data
	public static void inputDesignationDataSearch() throws IOException, InterruptedException {
		PageFactory.initElements(driver, psp);

		FileInputStream file = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\resources\\Excel-sheets\\SampleExcel.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Employee");

		int rowcount = sheet.getLastRowNum();
		for (int i = 0; i <= rowcount; i++) {
			XSSFRow row = sheet.getRow(i);

			boolean check = (boolean) row.getCell(0).getBooleanCellValue();
			String Designation = (String) row.getCell(4).getStringCellValue();

			if (check) {
				Thread.sleep(1000);
				EmployeeSearchPage.SearchTextBox.sendKeys(Designation);
				Thread.sleep(1000);
				checkAfterManagerSearchData(Designation);
				Thread.sleep(1000);
				boolean checkee= true;
				try {
					Assert.assertEquals(BeforeFilteringDesignationDataCount, AfterFilteringDesignationDataCount);
					checkee=true;
				} catch (AssertionError e) {
					checkee=false;
				}
				if (checkee && DesignationTableData) {
					checkDesignation=true;
				} else {
					checkDesignation=false;
				}

			}

		}
	}

//	Before Filter
	public static void checkBeforeDesignationSearchData(String Designation) throws InterruptedException {
		PageFactory.initElements(driver, psp);
		boolean Enablity = true;
		while (Enablity) {
//			Thread.sleep(3000);
			for (int j = 2; j <= EmployeeSearchPage.DesignationColumn.size(); j++) {
				WebElement code = driver
						.findElement(By.xpath(EmployeeSearchPage.DesignationColumnBefore + j + EmployeeSearchPage.DesignationColumnAfter));
				Thread.sleep(1000);
				String CodeName = code.getText();
				if (CodeName.contains(Designation)) {
					BeforeFilteringDesignationDataCount = BeforeFilteringDesignationDataCount + 1;
				}
			}
			if (EmployeeSearchPage.NextPageBtn.isEnabled()) {
				EmployeeSearchPage.NextPageBtn.click();
			}
			Enablity = EmployeeSearchPage.NextPageBtn.isEnabled();
		}

		System.out.println("BeforeFilteringDesignationDataCount : " + BeforeFilteringDesignationDataCount);
		boolean firstPage = EmployeeSearchPage.PreviousPageBtn.isEnabled();
		while (firstPage) {
			EmployeeSearchPage.PreviousPageBtn.click();
			firstPage = EmployeeSearchPage.PreviousPageBtn.isEnabled();
		}
		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_UP).build().perform();
		Thread.sleep(2000);
//		driver.navigate().refresh();
	}

//	AfterFilteringFirstNameDataCount
	public static void checkAfterManagerSearchData(String Designation) throws InterruptedException {
		PageFactory.initElements(driver, psp);
		boolean Enablity = true;
		while (Enablity) {
			Thread.sleep(3000);
			for (int j = 2; j <= EmployeeSearchPage.DesignationColumn.size(); j++) {
				WebElement code = driver
						.findElement(By.xpath(EmployeeSearchPage.DesignationColumnBefore + j + EmployeeSearchPage.DesignationColumnAfter));
//				Thread.sleep(1000);
				String CodeName = code.getText();
				if (CodeName.contains(Designation)) {
					AfterFilteringDesignationDataCount = AfterFilteringDesignationDataCount + 1;
				}
				if (!CodeName.contains(Designation)) {
					DesignationTableData = false;
				}
			} 
			if(EmployeeSearchPage.NextPageBtn.isEnabled()) {
			EmployeeSearchPage.NextPageBtn.click();
			}
			Enablity = EmployeeSearchPage.NextPageBtn.isEnabled();

		}
		System.out.println("AfterFilteringDesignationDataCount : " + AfterFilteringDesignationDataCount);
	}
//	*****************************************Email*******************************************************************
	
//	Check Plant Code Search Button Click
	public static void ClickEmailSearch() throws InterruptedException {
		PageFactory.initElements(driver, psp);
		EmployeeSearchPage.EmailSearch.click();

	}

//	Input SBU Search Data
	public static void inputEmailDataSearch() throws IOException, InterruptedException {
		PageFactory.initElements(driver, psp);

		FileInputStream file = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\resources\\Excel-sheets\\SampleExcel.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Employee");

		int rowcount = sheet.getLastRowNum();
		for (int i = 0; i <= rowcount; i++) {
			XSSFRow row = sheet.getRow(i);

			boolean check = (boolean) row.getCell(0).getBooleanCellValue();
			String Email = (String) row.getCell(5).getStringCellValue();

			if (check) {
				Thread.sleep(2000);
				EmployeeSearchPage.SearchTextBox.sendKeys(Email);
				Thread.sleep(1000);
				checkAfterEmailSearchData(Email);
				Thread.sleep(1000);
				boolean checkee= true;
				try {
					Assert.assertEquals(BeforeFilteringEmailDataCount, AfterFilteringEmailDataCount);
					checkee=true;
				} catch (AssertionError e) {
					checkee=false;
				}
				if (checkee && EmailTableData) {
					checkEmail=true;
				} else {
					checkEmail=false;
				}

			}

		}
	}

//	Before Filter
	public static void checkBeforeEmailSearchData(String Email) throws InterruptedException {
		PageFactory.initElements(driver, psp);
		boolean Enablity = true;
		while (Enablity) {
//			Thread.sleep(3000);
			for (int j = 2; j <= EmployeeSearchPage.EmailColumn.size(); j++) {
				WebElement code = driver
						.findElement(By.xpath(EmployeeSearchPage.EmailColumnBefore + j + EmployeeSearchPage.EmailColumnAfter));
				Thread.sleep(1000);
				String CodeName = code.getText();
				if (CodeName.contentEquals(Email)) {
					BeforeFilteringEmailDataCount = BeforeFilteringEmailDataCount + 1;
				}
			}
			if (EmployeeSearchPage.NextPageBtn.isEnabled()) {
				EmployeeSearchPage.NextPageBtn.click();
			}
			Enablity = EmployeeSearchPage.NextPageBtn.isEnabled();
		}

		System.out.println("BeforeFilteringEmailDataCount : " + BeforeFilteringEmailDataCount);

		boolean firstPage = EmployeeSearchPage.PreviousPageBtn.isEnabled();
		while (firstPage) {
			EmployeeSearchPage.PreviousPageBtn.click();
			firstPage = EmployeeSearchPage.PreviousPageBtn.isEnabled();
		}
		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_UP).build().perform();
		Thread.sleep(2000);
//		driver.navigate().refresh();
	}

//	AfterFilteringFirstNameDataCount
	public static void checkAfterEmailSearchData(String Email) throws InterruptedException {
		PageFactory.initElements(driver, psp);
		boolean Enablity = true;
		while (Enablity) {
			Thread.sleep(3000);
			for (int j = 2; j <= EmployeeSearchPage.EmailColumn.size(); j++) {
				WebElement code = driver
						.findElement(By.xpath(EmployeeSearchPage.EmailColumnBefore + j + EmployeeSearchPage.EmailColumnAfter));
//				Thread.sleep(1000);
				String CodeName = code.getText();
				if (CodeName.contains(Email)) {
					AfterFilteringEmailDataCount = AfterFilteringEmailDataCount + 1;
				}
				if (!CodeName.contains(Email)) {
					EmailTableData = false;
				}
			} 
			if(EmployeeSearchPage.NextPageBtn.isEnabled()) {
			EmployeeSearchPage.NextPageBtn.click();
			}
			Enablity = EmployeeSearchPage.NextPageBtn.isEnabled();

		}
		System.out.println("AfterFilteringEmailDataCount : " + AfterFilteringEmailDataCount);
	}
//	**********************************************CONTACT NO *********************************************************
//	Check Plant Code Search Button Click
	public static void ClickContactNoSearch() throws InterruptedException {
		PageFactory.initElements(driver, psp);
		EmployeeSearchPage.ContactNoSearch.click();

	}

//	Input SBU Search Data
	public static void inputContactNoDataSearch() throws IOException, InterruptedException {
		PageFactory.initElements(driver, psp);

		FileInputStream file = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\resources\\Excel-sheets\\SampleExcel.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Employee");

		int rowcount = sheet.getLastRowNum();
		for (int i = 0; i <= rowcount; i++) {
			XSSFRow row = sheet.getRow(i);

			boolean check = (boolean) row.getCell(0).getBooleanCellValue();
			String ContactNo = (String) row.getCell(6).getStringCellValue();

			if (check) {
				Thread.sleep(1000);
				EmployeeSearchPage.SearchTextBox.sendKeys(ContactNo);
				Thread.sleep(1000);
				checkAfterContactNoSearchData(ContactNo);
				Thread.sleep(1000);
				boolean checkee= true;
				try {
					Assert.assertEquals(BeforeFilteringContactNoDataCount, AfterFilteringContactNoDataCount);
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
			for (int j = 2; j <= EmployeeSearchPage.ContactNoColumn.size(); j++) {
				WebElement code = driver
						.findElement(By.xpath(EmployeeSearchPage.ContactNoColumnBefore + j + EmployeeSearchPage.ContactNoColumnAfter));
				Thread.sleep(1000);
				String CodeName = code.getText();
				if (CodeName.contains(ContactNo)) {
					BeforeFilteringContactNoDataCount = BeforeFilteringContactNoDataCount + 1;
				}
			}
			if (EmployeeSearchPage.NextPageBtn.isEnabled()) {
				EmployeeSearchPage.NextPageBtn.click();
			}
			Enablity = EmployeeSearchPage.NextPageBtn.isEnabled();
		}

		System.out.println("BeforeFilteringContactNoDataCount : " + BeforeFilteringContactNoDataCount);

		boolean firstPage = EmployeeSearchPage.PreviousPageBtn.isEnabled();
		while (firstPage) {
			EmployeeSearchPage.PreviousPageBtn.click();
			firstPage = EmployeeSearchPage.PreviousPageBtn.isEnabled();
		}
		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_UP).build().perform();
		Thread.sleep(2000);
//		driver.navigate().refresh();
	}

//	AfterFilteringFirstNameDataCount
	public static void checkAfterContactNoSearchData(String ContactNo) throws InterruptedException {
		PageFactory.initElements(driver, psp);
		boolean Enablity = true;
		while (Enablity) {
			Thread.sleep(3000);
			for (int j = 2; j <= EmployeeSearchPage.ContactNoColumn.size(); j++) {
				WebElement code = driver
						.findElement(By.xpath(EmployeeSearchPage.ContactNoColumnBefore + j + EmployeeSearchPage.ContactNoColumnAfter));
//				Thread.sleep(1000);
				String CodeName = code.getText();
				if (CodeName.contains(ContactNo)) {
					AfterFilteringContactNoDataCount= AfterFilteringContactNoDataCount + 1;
				}
				if (!CodeName.contains(ContactNo)) {
					EmailTableData = false;
				}
			} 
			if(EmployeeSearchPage.NextPageBtn.isEnabled()) {
			EmployeeSearchPage.NextPageBtn.click();
			}
			Enablity = EmployeeSearchPage.NextPageBtn.isEnabled();

		}
		System.out.println("AfterFilteringContactNoDataCount : " + AfterFilteringContactNoDataCount);
	}
	
//**********************************************************REPORT*********************************************************
	
	public static void Report() {
		PageFactory.initElements(driver, psp);  
		if (checkFirstName && checkLastName && checkPlant && checkDesignation && checkEmail && checkContactNo) { 
			testCase = extent.createTest("EMPLOYEE-MULTI SEARCH - Check Correct Data Count Filter");
			testCase.log(Status.INFO, "Correct Data Count Filtered");
			testCase.log(Status.PASS, "Correct Data Count Filtered").assignCategory("High-Severity");
		} else { 
			testCase = extent.createTest("EMPLOYEE-MULTI SEARCH - Check Correct Data Count Filter");
			testCase.log(Status.INFO, "Wrong Data Count Filtered");
			testCase.log(Status.FAIL, "Wrong Data Count Filtered").assignCategory("High-Severity");
		}
	}
}