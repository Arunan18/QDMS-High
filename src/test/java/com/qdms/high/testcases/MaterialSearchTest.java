//***********************************************************************************
//* Description
//*------------
//* Add Sbu functionaltiy
//***********************************************************************************
//*
//* Author           : Suntharalingam Arunan
//* Date Written     : 24/02/2023
//* 
//*
//* 
//* Test Case Number       Date         Intis        Comments
//* ================       ====         =====        ========
//*                        24/02/2023   Arunan     Orginal Version
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
import com.qdms.high.pages.DeliveryPage;
import com.qdms.high.pages.MaterialSearchPage;

public class MaterialSearchTest extends DriverIntialization{
	static MaterialSearchPage psp = new MaterialSearchPage();
	static boolean MaterialSearchVisible = true;
	static boolean MaterialSearchEnable = true;
	static boolean SearchTextBoxVisible = true;
	static boolean SearchTextBoxEnable = true;
	static boolean SearchButtonVisible = true;
	static boolean SearchButtonEnable = true;
	
	static boolean MaterialTableData = true;
	static boolean MainCatTableData = true;
	static boolean SubCatTableData = true;
	static boolean PrefixTableData = true;
	static boolean PlantTableData = true;
	static boolean StateTableData = true;
	static boolean ErpTableData = true;
	static boolean SbuTableData = true;
	static boolean SourceTableData = true;
	
	static int BeforeFilteringMaterialDataCount = 0;
	static int AfterFilteringMaterialDataCount = 0; 
	static int BeforeFilteringMainCatDataCount = 0;
	static int AfterFilteringMainCatDataCount = 0;
	static int BeforeFilteringSubCatDataCount = 0;
	static int AfterFilteringSubCatDataCount = 0; 
	static int BeforeFilteringPrefixDataCount = 0;
	static int AfterFilteringPrefixDataCount = 0;
	static int BeforeFilteringPlantDataCount = 0;
	static int AfterFilteringPlantDataCount = 0;
	static int BeforeFilteringStateDataCount = 0;
	static int AfterFilteringStateDataCount = 0;
	static int BeforeFilteringErpDataCount = 0;
	static int AfterFilteringErpDataCount = 0;
	static int BeforeFilteringSbuDataCount = 0;
	static int AfterFilteringSbuDataCount = 0;
	static int BeforeFilteringSourceDataCount = 0;
	static int AfterFilteringSourceDataCount = 0;
	
	static boolean checkMaterial=true;
	static boolean checkMainCat=true;
	static boolean checkSubCat=true;
	static boolean checkPrefix=true;
	static boolean checkPlant=true;
	static boolean checkState=true;
	static boolean checkErp=true;
	static boolean checkSbu=true;
	static boolean checkSource=true;
	
/*	********************************************************************************************************************
									MATERIAL NAME SEARCH BUTTON PROPERTIES
	*********************************************************************************************************************/
	public static void MaterialSearch() {
		PageFactory.initElements(driver, psp);

/*********************************************************************************************************************
									MATERIAL NAME SEARCH BUTTON PROPERTIES - VISIBLE
*********************************************************************************************************************/
		testCase = extent.createTest("Material Name Search Button Visible");
		try {
			Assert.assertEquals(MaterialSearchPage.MaterialSearch.isDisplayed(), true);
			testCase.log(Status.INFO, "Material Name Search Button Visible");
			testCase.log(Status.PASS, "Material Name Search Button Visible Script Pass").assignCategory("High-Severity");
		} catch (AssertionError e) {
			MaterialSearchVisible = false;
			testCase.log(Status.INFO, "Material Name Search Button Not Visible");
			testCase.log(Status.FAIL, "Material Name Search Button Not Visible").assignCategory("High-Severity");
		} catch (NoSuchElementException e) {
			MaterialSearchVisible = false;
			testCase.log(Status.INFO, "Dont have Material Name Search Button Locator");
			testCase.log(Status.FAIL, "Dont have Material Name Search Button Locator, So Smoke Fail")
					.assignCategory("High-Severity");
		}
		 
		
/*********************************************************************************************************************
							MATERIAL NAME SEARCH BUTTON PROPERTIES - ENABLE
*********************************************************************************************************************/
		if (MaterialSearchVisible) {
			testCase = extent.createTest("Material Name Search Button Enable");
			try {
				Assert.assertEquals(MaterialSearchPage.MaterialSearch.isEnabled(), true);
				testCase.log(Status.INFO, "Material Name Search Button Enable");
				testCase.log(Status.PASS, "Material Name Search Button Enable Script Pass")
						.assignCategory("High-Severity");
			} catch (AssertionError e) {
				MaterialSearchEnable = false;
				testCase.log(Status.INFO, "Material Name Search Button Not Enable");
				testCase.log(Status.FAIL, "Material Name Search Button Not Enable").assignCategory("High-Severity");
			}

			if (MaterialSearchEnable) {
//				
			}
		}
	}

 /*************************************************************************************************************************
 * 									MATERIAL NAME SEARCH BUTTON CLICK
 *************************************************************************************************************************/
 
	public static void ClickMaterialSearch() throws InterruptedException {
		PageFactory.initElements(driver, psp);
		if (MaterialSearchVisible && MaterialSearchEnable) {
			MaterialSearchPage.MaterialSearch.click();
		}
	}


/*********************************************************************************************************************
									MATERIAL NAME SEARCH TEXTBOX PROPERTIES 
*********************************************************************************************************************/
	public static void MaterialSearchTextBox() throws InterruptedException {
		PageFactory.initElements(driver, psp);
		
/*********************************************************************************************************************
									MATERIAL NAME SEARCH TEXTBOX PROPERTIES - VISIBLE
*********************************************************************************************************************/
		testCase = extent.createTest("Material Name Search Text Box Visible");
		try {
			Thread.sleep(1000);
			Assert.assertEquals(MaterialSearchPage.SearchTextBox.isDisplayed(), true);
			testCase.log(Status.INFO, "Material Name Search Text Box Visible");
			testCase.log(Status.PASS, "Material Name Search Text Box Visible Script Pass").assignCategory("High-Severity");
		} catch (AssertionError e) {
			SearchTextBoxVisible = false;
			testCase.log(Status.INFO, "Material Name Search Text Box Not Visible");
			testCase.log(Status.FAIL, "Material Name Search Text Box Not Visible").assignCategory("High-Severity");
		} catch (NoSuchElementException e) {
			SearchTextBoxVisible = false;
			testCase.log(Status.INFO, "Dont have Material Name Search Text Box Locator");
			testCase.log(Status.FAIL, "Dont have Material Name Search Text Box Locator, So Smoke Fail")
					.assignCategory("High-Severity");
		}

		
/*********************************************************************************************************************
							MATERIAL NAME SEARCH TEXTBOX PROPERTIES - ENABLE
*********************************************************************************************************************/
		if (SearchTextBoxVisible) {
			testCase = extent.createTest("Material Name Search Text Box Enable");
			try {
				Assert.assertEquals(MaterialSearchPage.SearchTextBox.isEnabled(), true);
				testCase.log(Status.INFO, "Material Name Search Text Box Enable");
				testCase.log(Status.PASS, "Material Name Search Text Box Enable Script Pass")
						.assignCategory("High-Severity");
			} catch (AssertionError e) {
				SearchTextBoxEnable = false;
				testCase.log(Status.INFO, "Material Name Search Text Box Not Enable");
				testCase.log(Status.FAIL, "Material Name Search Text Box Not Enable").assignCategory("High-Severity");
			}

			if (SearchTextBoxEnable) {
//				
			}
		}
	}

	
/*********************************************************************************************************************
						MATERIAL NAME SEARCH BUTTON PROPERTIES 
*********************************************************************************************************************/
	public static void MaterialSearchButton() throws InterruptedException {
		PageFactory.initElements(driver, psp);

/*********************************************************************************************************************
					MATERIAL NAME SEARCH BUTTON PROPERTIES  - VISIBLE
*********************************************************************************************************************/
		
		testCase = extent.createTest("Material Search Button Visible");
		try {
			Thread.sleep(1000);
			Assert.assertEquals(MaterialSearchPage.SearchTextBox.isDisplayed(), true);
			testCase.log(Status.INFO, "Material Search Button Visible");
			testCase.log(Status.PASS, "Material Search Button Visible Script Pass").assignCategory("High-Severity");
		} catch (AssertionError e) {
			SearchButtonVisible = false;
			testCase.log(Status.INFO, "Material Search Button Not Visible");
			testCase.log(Status.FAIL, "Material Search Button Not Visible").assignCategory("High-Severity");
		} catch (NoSuchElementException e) {
			SearchButtonVisible = false;
			testCase.log(Status.INFO, "Dont have Material Search Button Locator");
			testCase.log(Status.FAIL, "Dont have Material Search Button Locator, So Smoke Fail")
					.assignCategory("High-Severity");
		}

		
/*********************************************************************************************************************
					MATERIAL NAME SEARCH BUTTON PROPERTIES - ENABLE
*********************************************************************************************************************/
		if (SearchButtonVisible) {
			testCase = extent.createTest("Material Search Button Enable");
			try {
				Assert.assertEquals(MaterialSearchPage.SearchTextBox.isEnabled(), true);
				testCase.log(Status.INFO, "Material Search Button Enable");
				testCase.log(Status.PASS, "Material Search Button Enable Script Pass")
						.assignCategory("High-Severity");
			} catch (AssertionError e) {
				SearchButtonEnable = false;
				testCase.log(Status.INFO, "Material Search Button Not Enable");
				testCase.log(Status.FAIL, "Material Search Button Not Enable").assignCategory("High-Severity");
			}

			if (SearchButtonEnable) {			
			}
		}
	}

//Material input TextBox Properties
	public static void MaterialSearchButtonClick() throws InterruptedException {
		PageFactory.initElements(driver, psp);

		if (SearchButtonVisible && SearchButtonEnable) {
			MaterialSearchPage.MaterialSearch.click();
		}
	}

//	Input Material Search Data
	public static void inputMaterialDataSearch() throws IOException, InterruptedException {
		PageFactory.initElements(driver, psp);
		if (SearchTextBoxVisible && SearchTextBoxEnable) {
			FileInputStream file = new FileInputStream(
					System.getProperty("user.dir") + "\\src\\test\\resources\\Excel-sheets\\SampleExcel.xlsx");
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			XSSFSheet sheet = workbook.getSheet("Material");

			int rowcount = sheet.getLastRowNum();
			for (int i = 0; i <= rowcount; i++) {
				XSSFRow row = sheet.getRow(i);

				boolean check = (boolean) row.getCell(0).getBooleanCellValue();
				String MaterialName = (String) row.getCell(1).getStringCellValue();

				if (check) {
					MaterialSearchPage.SearchTextBox.sendKeys(MaterialName);
					MaterialSearchButtonClick();
					Thread.sleep(1000);
					checkAfterMaterialSearchData(MaterialName);
					Thread.sleep(1000);
					boolean checke=true;
					try {
						Assert.assertEquals(BeforeFilteringMaterialDataCount, AfterFilteringMaterialDataCount);
					} catch (AssertionError e) {
						checke=false;
					}
					if (checke && MaterialTableData) {
						checkMaterial=true;
					} else {
						checkMaterial=false;
					}

				}

			}
		}
	}

//	BeforeFiltering Material DataCount
	public static void checkBeforeMaterialSearchData(String Material) throws InterruptedException {
		PageFactory.initElements(driver, psp);
		boolean Enablity = true;
		while (Enablity) {
			Thread.sleep(2000);
			for (int j = 2; j <= MaterialSearchPage.MaterialColumn.size(); j++) {
				WebElement code = driver
						.findElement(By.xpath(MaterialSearchPage.MaterialColumnBefore + j + MaterialSearchPage.MaterialColumnAfter));
				Thread.sleep(500);
				String CodeName = code.getText();
				if (CodeName.contains(Material)) {
					BeforeFilteringMaterialDataCount = BeforeFilteringMaterialDataCount + 1;
				}
			}
			Thread.sleep(1000);
			MaterialSearchPage.NextPageBtn.click();
			Enablity = MaterialSearchPage.NextPageBtn.isEnabled();
		}

		System.out.println("BeforeFilteringMaterialDataCount : " + BeforeFilteringMaterialDataCount);

		boolean firstPage = MaterialSearchPage.PreviousPageBtn.isEnabled();
		while (firstPage) {
			MaterialSearchPage.PreviousPageBtn.click();
			firstPage = MaterialSearchPage.PreviousPageBtn.isEnabled();
		}
		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_UP).build().perform();
		Thread.sleep(3000);
		act.sendKeys(Keys.PAGE_UP).build().perform();
		Thread.sleep(3000);
	}

//	AfterFiltering Material DataCount
	public static void checkAfterMaterialSearchData(String Material) throws InterruptedException {
		PageFactory.initElements(driver, psp);
		boolean Enablity = true;
		while (Enablity) {
			Thread.sleep(3000);
			for (int j = 2; j <= MaterialSearchPage.MaterialColumn.size(); j++) {
				WebElement code = driver
						.findElement(By.xpath(MaterialSearchPage.MaterialColumnBefore + j + MaterialSearchPage.MaterialColumnAfter));
				String CodeName = code.getText();
				if (CodeName.contains(Material)) {
					AfterFilteringMaterialDataCount = AfterFilteringMaterialDataCount + 1;
				}
				if (!CodeName.contains(Material)) {
					MaterialTableData = false;
				}
			}
			MaterialSearchPage.NextPageBtn.click();
			Enablity = MaterialSearchPage.NextPageBtn.isEnabled();

		}
		System.out.println("AfterFilteringMaterialDataCount : " + AfterFilteringMaterialDataCount);
	}

	
//	****************************************Material Main Category*****************************************************
//	Check Main Category Search Button Click
	public static void ClickMainCatSearch() throws InterruptedException {
		PageFactory.initElements(driver, psp);
		MaterialSearchPage.MainCatSearch.click();

	}

//	Input Main Category Search Data
	public static void inputMainCatDataSearch() throws IOException, InterruptedException {
		PageFactory.initElements(driver, psp);

		FileInputStream file = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\resources\\Excel-sheets\\SampleExcel.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Material");

		int rowcount = sheet.getLastRowNum();
		for (int i = 0; i <= rowcount; i++) {
			XSSFRow row = sheet.getRow(i);

			boolean check = (boolean) row.getCell(0).getBooleanCellValue();
			String MainCat = (String) row.getCell(2).getStringCellValue();

			if (check) {
				Thread.sleep(1000);
				MaterialSearchPage.SearchTextBox.sendKeys(MainCat);
				Thread.sleep(1000);
				checkAfterMainCatSearchData(MainCat);
				Thread.sleep(1000);
				boolean checkee= true;
				try {
					Assert.assertEquals(BeforeFilteringMainCatDataCount, AfterFilteringMainCatDataCount);
					checkee=true;
				} catch (AssertionError e) {
					checkee=false;
				}
				if (checkee && MainCatTableData) {
					checkMainCat=true;
				} else {
					checkMainCat=false;
				}

			}

		}
	}

//	Take Main Category Count Before searcing Main Category	
	public static void checkBeforeMainCatSearchData(String MainCat) throws InterruptedException {
		PageFactory.initElements(driver, psp);
		boolean Enablity = true;
		while (Enablity) {
			for (int j = 2; j <= MaterialSearchPage.MainCatColumn.size(); j++) {
				WebElement code = driver
						.findElement(By.xpath(MaterialSearchPage.MainCatColumnBefore + j + MaterialSearchPage.MainCatColumnAfter));
				Thread.sleep(1000);
				String CodeName = code.getText();
				if (CodeName.contains(MainCat)) {
					BeforeFilteringMainCatDataCount = BeforeFilteringMainCatDataCount + 1;
				}
			}
			if (MaterialSearchPage.NextPageBtn.isEnabled()) {
				MaterialSearchPage.NextPageBtn.click();
			}
			Enablity = MaterialSearchPage.NextPageBtn.isEnabled();
		}

		System.out.println("BeforeFilteringMainCatDataCount : " + BeforeFilteringMainCatDataCount);

		boolean firstPage = MaterialSearchPage.PreviousPageBtn.isEnabled();
		while (firstPage) {
			MaterialSearchPage.PreviousPageBtn.click();
			firstPage = MaterialSearchPage.PreviousPageBtn.isEnabled();
		}
		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_UP).build().perform();
		Thread.sleep(2000);
	}

//	After Filtering Main Category Data Count
	public static void checkAfterMainCatSearchData(String MainCat) throws InterruptedException {
		PageFactory.initElements(driver, psp);
		boolean Enablity = true;
		while (Enablity) {
			Thread.sleep(3000);
			for (int j = 2; j <= MaterialSearchPage.MainCatColumn.size(); j++) {
				WebElement code = driver
						.findElement(By.xpath(MaterialSearchPage.MainCatColumnBefore + j + MaterialSearchPage.MainCatColumnAfter));
//				Thread.sleep(1000);
				String CodeName = code.getText();
				if (CodeName.contains(MainCat)) {
					AfterFilteringMainCatDataCount = AfterFilteringMainCatDataCount + 1;
				}
				if (!CodeName.contains(MainCat)) {
					MainCatTableData = false;
				}
			} 
			if(MaterialSearchPage.NextPageBtn.isEnabled()) {
			MaterialSearchPage.NextPageBtn.click();
			}
			Enablity = MaterialSearchPage.NextPageBtn.isEnabled();

		}
		System.out.println("AfterFilteringMainCatDataCount : " + AfterFilteringMainCatDataCount);
	}
//	********************************************Sub Category********************************************************************

//	Check Sub Category Search Button Click
	public static void ClickSubCatSearch() throws InterruptedException {
		PageFactory.initElements(driver, psp);
		MaterialSearchPage.SubCatSearch.click();

	}

//	Input Sub Category Search Data
	public static void inputSubCatDataSearch() throws IOException, InterruptedException {
		PageFactory.initElements(driver, psp);

		FileInputStream file = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\resources\\Excel-sheets\\SampleExcel.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Material");

		int rowcount = sheet.getLastRowNum();
		for (int i = 0; i <= rowcount; i++) {
			XSSFRow row = sheet.getRow(i);

			boolean check = (boolean) row.getCell(0).getBooleanCellValue();
			String SubCat = (String) row.getCell(3).getStringCellValue();

			if (check) {
				Thread.sleep(1000);
				MaterialSearchPage.SearchTextBox.sendKeys(SubCat);
				Thread.sleep(1000);
				checkAfterSbuSearchData(SubCat);
				Thread.sleep(1000);
				boolean checkee= true;
				try {
					Assert.assertEquals(BeforeFilteringSubCatDataCount, AfterFilteringSubCatDataCount);
					checkee=true;
				} catch (AssertionError e) {
					checkee=false;
				}
				if (checkee && SubCatTableData) {
					checkPlant=true;
				} else {
					checkPlant=false;
				}

			}

		}
	}

//	Take Sub Category Count Before Filter
	public static void checkBeforeSubCatSearchData(String Plant) throws InterruptedException {
		PageFactory.initElements(driver, psp);
		boolean Enablity = true;
		while (Enablity) {
			for (int j = 2; j <= MaterialSearchPage.SubCatColumn.size(); j++) {
				WebElement code = driver
						.findElement(By.xpath(MaterialSearchPage.SubCatColumnBefore + j + MaterialSearchPage.SubCatColumnAfter));
				Thread.sleep(1000);
				String CodeName = code.getText();
				if (CodeName.contains(Plant)) {
					BeforeFilteringSubCatDataCount = BeforeFilteringSubCatDataCount + 1;
				}
			}
			if (MaterialSearchPage.NextPageBtn.isEnabled()) {
				MaterialSearchPage.NextPageBtn.click();
			}
			Enablity = MaterialSearchPage.NextPageBtn.isEnabled();
		}

		System.out.println("BeforeFilteringSubCatDataCount : " + BeforeFilteringSubCatDataCount);

		boolean firstPage = MaterialSearchPage.PreviousPageBtn.isEnabled();
		while (firstPage) {
			MaterialSearchPage.PreviousPageBtn.click();
			firstPage = MaterialSearchPage.PreviousPageBtn.isEnabled();
		}
		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_UP).build().perform();
		Thread.sleep(2000);
	}

//	After Filtering Sub Category Count
	public static void checkAfterSbuSearchData(String SubCat) throws InterruptedException {
		PageFactory.initElements(driver, psp);
		boolean Enablity = true;
		while (Enablity) {
			Thread.sleep(3000);
			for (int j = 2; j <= MaterialSearchPage.SubCatColumn.size(); j++) {
				WebElement code = driver
						.findElement(By.xpath(MaterialSearchPage.SubCatColumnBefore + j + MaterialSearchPage.SubCatColumnAfter));
				String CodeName = code.getText();
				if (CodeName.contains(SubCat)) {
					AfterFilteringSubCatDataCount = AfterFilteringSubCatDataCount + 1;
				}
				if (!CodeName.contains(SubCat)) {
					SubCatTableData = false;
				}
			} 
			if(MaterialSearchPage.NextPageBtn.isEnabled()) {
			MaterialSearchPage.NextPageBtn.click();
			}
			Enablity = MaterialSearchPage.NextPageBtn.isEnabled();

		}
		System.out.println("AfterFilteringSubCatDataCount : " + AfterFilteringSubCatDataCount);
	}
//	***********************************************PreFix**************************************************************
//	Click PreFix Search Button Click
	public static void ClickPrefixSearch() throws InterruptedException {
		PageFactory.initElements(driver, psp);
		MaterialSearchPage.PrefixSearch.click();

	}

//	Input PreFix Search Data
	public static void inputPrefixDataSearch() throws IOException, InterruptedException {
		PageFactory.initElements(driver, psp);

		FileInputStream file = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\resources\\Excel-sheets\\SampleExcel.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Material");

		int rowcount = sheet.getLastRowNum();
		for (int i = 0; i <= rowcount; i++) {
			XSSFRow row = sheet.getRow(i);

			boolean check = (boolean) row.getCell(0).getBooleanCellValue();
			String Prefix = (String) row.getCell(4).getStringCellValue();

			if (check) {
				Thread.sleep(1000);
				MaterialSearchPage.SearchTextBox.sendKeys(Prefix);
				Thread.sleep(1000);
				checkAfterPrefixSearchData(Prefix);
				Thread.sleep(1000);
				boolean checkee= true;
				try {
					Assert.assertEquals(BeforeFilteringPrefixDataCount, AfterFilteringPrefixDataCount);
					checkee=true;
				} catch (AssertionError e) {
					checkee=false;
				}
				if (checkee && PrefixTableData) {
					checkPrefix=true;
				} else {
					checkPrefix=false;
				}

			}

		}
	}

//	Take PreFix Data Count Before Filter
	public static void checkBeforePrefixSearchData(String Prefix) throws InterruptedException {
		PageFactory.initElements(driver, psp);
		boolean Enablity = true;
		while (Enablity) {
			for (int j = 2; j <= MaterialSearchPage.PrefixColumn.size(); j++) {
				WebElement code = driver
						.findElement(By.xpath(MaterialSearchPage.PrefixColumnBefore + j + MaterialSearchPage.PrefixColumnAfter));
				Thread.sleep(1000);
				String CodeName = code.getText();
				if (CodeName.contains(Prefix)) {
					BeforeFilteringPrefixDataCount = BeforeFilteringPrefixDataCount + 1;
				}
			}
			if (MaterialSearchPage.NextPageBtn.isEnabled()) {
				MaterialSearchPage.NextPageBtn.click();
			}
			Enablity = MaterialSearchPage.NextPageBtn.isEnabled();
		}

		System.out.println("BeforeFilteringPrefixDataCount : " + BeforeFilteringPrefixDataCount);
		boolean firstPage = MaterialSearchPage.PreviousPageBtn.isEnabled();
		while (firstPage) {
			MaterialSearchPage.PreviousPageBtn.click();
			firstPage = MaterialSearchPage.PreviousPageBtn.isEnabled();
		}
		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_UP).build().perform();
		Thread.sleep(2000);
	}

//	After Filtering PreFix Data Count
	public static void checkAfterPrefixSearchData(String Prefix) throws InterruptedException {
		PageFactory.initElements(driver, psp);
		boolean Enablity = true;
		while (Enablity) {
			Thread.sleep(3000);
			for (int j = 2; j <= MaterialSearchPage.PrefixColumn.size(); j++) {
				WebElement code = driver
						.findElement(By.xpath(MaterialSearchPage.PrefixColumnBefore + j + MaterialSearchPage.PrefixColumnAfter));
				String CodeName = code.getText();
				if (CodeName.contains(Prefix)) {
					AfterFilteringPrefixDataCount = AfterFilteringPrefixDataCount + 1;
				}
				if (!CodeName.contains(Prefix)) {
					PrefixTableData = false;
				}
			} 
			if(MaterialSearchPage.NextPageBtn.isEnabled()) {
			MaterialSearchPage.NextPageBtn.click();
			}
			Enablity = MaterialSearchPage.NextPageBtn.isEnabled();

		}
		System.out.println("AfterFilteringPrefixDataCount : " + AfterFilteringPrefixDataCount);
	}
//	*****************************************Plant*******************************************************************
	
//	Check Plant Search Button Click
	public static void ClickPlantSearch() throws InterruptedException {
		PageFactory.initElements(driver, psp);
		MaterialSearchPage.PlantSearch.click();

	}

//	Input Plant Search Data
	public static void inputPlantDataSearch() throws IOException, InterruptedException {
		PageFactory.initElements(driver, psp);

		FileInputStream file = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\resources\\Excel-sheets\\SampleExcel.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Material");

		int rowcount = sheet.getLastRowNum();
		for (int i = 0; i <= rowcount; i++) {
			XSSFRow row = sheet.getRow(i);

			boolean check = (boolean) row.getCell(0).getBooleanCellValue();
			String Plant = (String) row.getCell(5).getStringCellValue();

			if (check) {
				Thread.sleep(2000);
				MaterialSearchPage.SearchTextBox.sendKeys(Plant);
				Thread.sleep(1000);
				checkAfterPlantSearchData(Plant);
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

//	Take Plant Count Before Filter
	public static void checkBeforePlantSearchData(String Plant) throws InterruptedException {
		PageFactory.initElements(driver, psp);
		boolean Enablity = true;
		while (Enablity) {
			for (int j = 2; j <= MaterialSearchPage.PlantColumn.size(); j++) {
				WebElement code = driver
						.findElement(By.xpath(MaterialSearchPage.PlantColumnBefore + j + MaterialSearchPage.PlantColumnAfter));
				Thread.sleep(1000);
				String CodeName = code.getText();
				if (CodeName.contains(Plant)) {
					BeforeFilteringPlantDataCount = BeforeFilteringPlantDataCount + 1;
				}
			}
			if (MaterialSearchPage.NextPageBtn.isEnabled()) {
				MaterialSearchPage.NextPageBtn.click();
			}
			Enablity = MaterialSearchPage.NextPageBtn.isEnabled();
		}

		System.out.println("BeforeFilteringPlantDataCount : " + BeforeFilteringPlantDataCount);

		boolean firstPage = MaterialSearchPage.PreviousPageBtn.isEnabled();
		while (firstPage) {
			MaterialSearchPage.PreviousPageBtn.click();
			firstPage = MaterialSearchPage.PreviousPageBtn.isEnabled();
		}
		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_UP).build().perform();
		Thread.sleep(2000);
	}

//	After Filtering Plant Data Count
	public static void checkAfterPlantSearchData(String Plant) throws InterruptedException {
		PageFactory.initElements(driver, psp);
		boolean Enablity = true;
		while (Enablity) {
			Thread.sleep(3000);
			for (int j = 2; j <= MaterialSearchPage.PlantColumn.size(); j++) {
				WebElement code = driver
						.findElement(By.xpath(MaterialSearchPage.PlantColumnBefore + j + MaterialSearchPage.PlantColumnAfter));
				String CodeName = code.getText();
				if (CodeName.contains(Plant)) {
					AfterFilteringPlantDataCount = AfterFilteringPlantDataCount + 1;
				}
				if (!CodeName.contains(Plant)) {
					PlantTableData = false;
				}
			} 
			if(MaterialSearchPage.NextPageBtn.isEnabled()) {
			MaterialSearchPage.NextPageBtn.click();
			}
			Enablity = MaterialSearchPage.NextPageBtn.isEnabled();

		}
		System.out.println("AfterFilteringPlantDataCount : " + AfterFilteringPlantDataCount);
	}
//	**********************************************Material State *********************************************************
//	Check Material State  Search Button Click
	public static void ClickStateSearch() throws InterruptedException {
		PageFactory.initElements(driver, psp);
		MaterialSearchPage.StateSearch.click();

	}

//	Input Material State Search Data
	public static void inputStateDataSearch() throws IOException, InterruptedException {
		PageFactory.initElements(driver, psp);

		FileInputStream file = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\resources\\Excel-sheets\\SampleExcel.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Material");

		int rowcount = sheet.getLastRowNum();
		for (int i = 0; i <= rowcount; i++) {
			XSSFRow row = sheet.getRow(i);

			boolean check = (boolean) row.getCell(0).getBooleanCellValue();
			String State = (String) row.getCell(6).getStringCellValue();

			if (check) {
				Thread.sleep(1000);
				MaterialSearchPage.SearchTextBox.sendKeys(State);
				Thread.sleep(1000);
				checkAfterStateSearchData(State);
				Thread.sleep(1000);
				boolean checkee= true;
				try {
					Assert.assertEquals(BeforeFilteringStateDataCount, AfterFilteringStateDataCount);
					checkee=true;
				} catch (AssertionError e) {
					checkee=false;
				}
				if (checkee && StateTableData) {
					checkState=true;
				} else {
					checkState=false;
				}

			}

		}
	}

//	Take Material State count Before Filter
	public static void checkBeforeStateSearchData(String State) throws InterruptedException {
		PageFactory.initElements(driver, psp);
		boolean Enablity = true;
		while (Enablity) {
			for (int j = 2; j <= MaterialSearchPage.StateColumn.size(); j++) {
				WebElement code = driver
						.findElement(By.xpath(MaterialSearchPage.StateColumnBefore + j + MaterialSearchPage.StateColumnAfter));
				Thread.sleep(1000);
				String CodeName = code.getText();
				if (CodeName.contains(State)) {
					BeforeFilteringStateDataCount = BeforeFilteringStateDataCount + 1;
				}
			}
			if (MaterialSearchPage.NextPageBtn.isEnabled()) {
				MaterialSearchPage.NextPageBtn.click();
			}
			Enablity = MaterialSearchPage.NextPageBtn.isEnabled();
		}

		System.out.println("BeforeFilteringStateDataCount : " + BeforeFilteringStateDataCount);

		boolean firstPage = MaterialSearchPage.PreviousPageBtn.isEnabled();
		while (firstPage) {
			MaterialSearchPage.PreviousPageBtn.click();
			firstPage = MaterialSearchPage.PreviousPageBtn.isEnabled();
		}
		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_UP).build().perform();
		Thread.sleep(2000);
	}

//	After Filtering State Data Count
	public static void checkAfterStateSearchData(String State) throws InterruptedException {
		PageFactory.initElements(driver, psp);
		boolean Enablity = true;
		while (Enablity) {
			Thread.sleep(3000);
			for (int j = 2; j <= MaterialSearchPage.StateColumn.size(); j++) {
				WebElement code = driver
						.findElement(By.xpath(MaterialSearchPage.StateColumnBefore + j + MaterialSearchPage.StateColumnAfter));
				String CodeName = code.getText();
				if (CodeName.contains(State)) {
					AfterFilteringStateDataCount= AfterFilteringStateDataCount + 1;
				}
				if (!CodeName.contains(State)) {
					StateTableData = false;
				}
			} 
			if(MaterialSearchPage.NextPageBtn.isEnabled()) {
			MaterialSearchPage.NextPageBtn.click();
			}
			Enablity = MaterialSearchPage.NextPageBtn.isEnabled();

		}
		System.out.println("AfterFilteringStateDataCount : " + AfterFilteringStateDataCount);
	}
	
//**************************************************************************************************************************************
//	EMPLOYEE-MULTI SEARCH - Check Correct Data Count Filter
//**************************************************************************************************************************************
	
	public static void perPageHund() throws InterruptedException {
		PageFactory.initElements(driver, psp);
		MaterialSearchPage.CurrentPaginationOpction.click();
		Thread.sleep(2000);
		MaterialSearchPage.Page_100.click();
	} 
	
	
	public static void Report() {
		PageFactory.initElements(driver, psp);  
		if (checkMaterial && checkMainCat && checkSubCat && checkPrefix && checkPlant && checkState) { 
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
