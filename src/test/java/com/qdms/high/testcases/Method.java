//***********************************************************************************
//* Description
//*------------
//* Searching Methods
//***********************************************************************************
//*
//* Author           : Suntharalingam Arunan
//* Date Written     : 24/02/2023
//* 
//*
//* 
//* Test Case Number       Date         Intis        Comments
//* ================       ====         =====        ========
//*                        25/02/2023   Arunan     Orginal Version
//*
//************************************************************************************
package com.qdms.high.testcases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

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

public class Method extends DriverIntialization {
	static PlantSearchPage psp = new PlantSearchPage();
	static boolean SearchVisible = true;
	static boolean SearchEnable = true;
	static boolean SearchTextBoxVisible = true;
	static boolean SearchTextBoxEnable = true;
	static boolean SearchButtonVisible = true;
	static boolean SearchButtonEnable = true;
	static boolean FaxTableData = true;
	static int BeforeCount = 0;
	static int AfterCount = 0;
	static String SearchData = null;
	static boolean check = false;
	static int pagiWaitTime = 0;
	static int textWaitTime = 0;
	static boolean pass = true;
	static boolean buttonClick = false;
	static int numberOfRow = 0;
	static boolean iconClick = false;

	/*********************************************************************************************************************************************************
	 * Search Icon Properties - (Visible, Enable)
	 **********************************************************************************************************************************************************/
	public static void checkSearch(WebElement searchbtn, String colName) throws InterruptedException {
		PageFactory.initElements(driver, psp);
//		Search Icon Visivle
		testCase = extent.createTest(colName + " Search Button Properties - Visible");
		try {
			Assert.assertEquals(searchbtn.isDisplayed(), true);
			testCase.log(Status.INFO, colName + " Search Button Visible");
			testCase.log(Status.PASS, colName + " Search Button Visible Script Pass");
		} catch (AssertionError e) {
			SearchVisible = false;
			testCase.log(Status.INFO, colName + " Search Button Not Visible");
			testCase.log(Status.FAIL, colName + " Search Button Not Visible");
		} catch (NoSuchElementException e) {
			SearchVisible = false;
			testCase.log(Status.INFO, "Dont have " + colName + " Search Button Locator");
			testCase.log(Status.FAIL, "Dont have " + colName + " Search Button Locator, So Smoke Fail");
		}
//		Search Icon Enable
		if (SearchVisible) {
			testCase = extent.createTest(colName + " Search Button Properties - Enable");
			try {
				Assert.assertEquals(searchbtn.isEnabled(), true);
				testCase.log(Status.INFO, colName + " Search Button Enable");
				testCase.log(Status.PASS, colName + " Search Button Enable Script Pass");
			} catch (AssertionError e) {
				SearchEnable = false;
				testCase.log(Status.INFO, colName + " Search Button Not Enable");
				testCase.log(Status.FAIL, colName + " Search Button Not Enable");
			}
			if (SearchEnable) {

			}
		}
	}

	/*********************************************************************************************************************************************************
	 * Search Icon Click
	 **********************************************************************************************************************************************************/
	public static void ClickSearch(WebElement search, WebElement TextBox, String colName) throws InterruptedException {
		PageFactory.initElements(driver, psp);
		if (SearchVisible && SearchEnable) {
			Thread.sleep(1000);
			search.click();
			iconClick = true;
			Thread.sleep(1000);
			testCase = extent.createTest(colName + " Search Icon Click");
			try {
				Thread.sleep(2000);
				Assert.assertEquals(TextBox.isDisplayed(), true);
				testCase.log(Status.INFO, colName + " Search Icon Clicked");
				testCase.log(Status.PASS, colName + " Search Icon Clicked");
			} catch (AssertionError e) {
				testCase.log(Status.INFO, colName + " Search Icon Clicked");
				testCase.log(Status.FAIL, colName + " Search Icon Click Not Working");
			} catch (NoSuchElementException e) {

			}
		} else {
			testCase = extent.createTest(colName + " Search Icon Click");
			testCase.log(Status.INFO, colName + " Search Button Not Visible / Enable");
			testCase.log(Status.FAIL, colName + " Search Button Not Visible / Enable");
		}
	}

	/*********************************************************************************************************************************************************
	 * Search Text Box Properties - (Visible, Enable)
	 **********************************************************************************************************************************************************/
	public static void SearchTextBox(WebElement TextBox, String colName) throws InterruptedException {
		PageFactory.initElements(driver, psp);
//		Check Plant Code Search TextBox Visible

		if (iconClick) {
			testCase = extent.createTest(colName + " Search Text Box Properties - Visible");
			try {
				Thread.sleep(1000);
				Assert.assertEquals(TextBox.isDisplayed(), true);
				testCase.log(Status.INFO, colName + " Search Text Box Visible");
				testCase.log(Status.PASS, colName + " Search Text Box Visible Script Pass");
			} catch (AssertionError e) {
				SearchTextBoxVisible = false;
				testCase.log(Status.INFO, colName + " Search Text Box Not Visible");
				testCase.log(Status.FAIL, colName + " Search Text Box Not Visible");
			} catch (NoSuchElementException e) {
				SearchTextBoxVisible = false;
				testCase.log(Status.INFO,
						"Dont have" + colName + " Search Text Box Locator / Didnt Click Search Button");
				testCase.log(Status.FAIL,
						"Dont have " + colName + " Search Text Box Locator/ Didnt Click Search Button");
			}

			if (SearchTextBoxVisible) {
//			Check Plant Code Search TextBoxEnable
				testCase = extent.createTest(colName + " Search Text Box Properties - Enable");
				try {
					Assert.assertEquals(TextBox.isEnabled(), true);
					testCase.log(Status.INFO, colName + " Search Text Box Enable");
					testCase.log(Status.PASS, colName + " Search Text Box Enable Script Pass");
				} catch (AssertionError e) {
					SearchTextBoxEnable = false;
					testCase.log(Status.INFO, colName + " Search Text Box Not Enable");
					testCase.log(Status.FAIL, colName + " Search Text Box Not Enable");
				}
				if (SearchTextBoxEnable) {

				}
			}
		}
	}

	/*********************************************************************************************************************************************************
	 * Search Button Properties - (Visible, Enable)
	 **********************************************************************************************************************************************************/
	public static void SearchButton(WebElement SearchBtn, String colName) throws InterruptedException {
		PageFactory.initElements(driver, psp);

//	Check Plant Code Search TextBox Visible
		if (iconClick) {
			testCase = extent.createTest(colName + " Search Button Properties - Visible");
			try {
				Thread.sleep(1000);
				Assert.assertEquals(SearchBtn.isDisplayed(), true);
				testCase.log(Status.INFO, colName + " Search Button Visible");
				testCase.log(Status.PASS, colName + " Search Button Visible Script Pass");
			} catch (AssertionError e) {
				SearchButtonVisible = false;
				testCase.log(Status.INFO, colName + " Search Button Not Visible");
				testCase.log(Status.FAIL, colName + " Search Button Not Visible");
			} catch (NoSuchElementException e) {
				SearchButtonVisible = false;
				testCase.log(Status.INFO, "Dont have " + colName + " Search Button Locator");
				testCase.log(Status.FAIL, "Dont have " + colName + " Search Button Locator, So Smoke Fail");
			}

			if (SearchButtonVisible) {
//		Check Plant Code Search TextBox Enable
				testCase = extent.createTest(colName + " Search Button Properties - Enable");
				try {
					Assert.assertEquals(SearchBtn.isEnabled(), true);
					testCase.log(Status.INFO, colName + " Search Button Enable");
					testCase.log(Status.PASS, colName + " Search Button Enable Script Pass");
				} catch (AssertionError e) {
					SearchButtonEnable = false;
					testCase.log(Status.INFO, colName + " Search Button Not Enable");
					testCase.log(Status.FAIL, colName + " Search Button Not Enable");
				}

				if (SearchButtonEnable) {
//			
				}
			}
		}
	}

	/*********************************************************************************************************************************************************
	 * Search Button Click
	 **********************************************************************************************************************************************************/
	public static void SearchButtonClick(WebElement SearchBtn, WebElement ResetAllBtn, String colName)
			throws InterruptedException {
		PageFactory.initElements(driver, psp);

		if (SearchButtonVisible && SearchButtonEnable) {
			SearchBtn.click();
			buttonClick = true;
			testCase = extent.createTest(colName + " Search Button Click");
			try {
				Assert.assertEquals(ResetAllBtn.isDisplayed(), true);
				testCase.log(Status.INFO, colName + " Search Button Clicked");
				testCase.log(Status.PASS, colName + " Search Button Clicked");
			} catch (AssertionError e) {
				testCase.log(Status.INFO, colName + " Search Button Clicked");
				testCase.log(Status.FAIL, colName + " Search Button Click Not Working");
			}
		} else {
			testCase = extent.createTest(colName + " Search Button Click");
			testCase.log(Status.INFO, colName + " Search Button Not Visible / Enable");
			testCase.log(Status.FAIL, colName + " Search Button Not Visible / Enable");
		}
	}

	/*********************************************************************************************************************************************************
	 * Take Count Before Searching
	 **********************************************************************************************************************************************************/
	public static void checkBeforeSearchData(String tabName, int excelcolNo, List<WebElement> Column, String ColBefore,
			String colAfter, String colName) throws InterruptedException, IOException {
		PageFactory.initElements(driver, psp);
		Thread.sleep(2000);
		FileInputStream file = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\resources\\Excel-sheets\\SampleExcel.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet(tabName);
		try {
			numberOfRow = Column.size();
		} catch (NoSuchElementException e) {
			testCase = extent.createTest(colName + " Column Locater");
			testCase.log(Status.INFO, "Dont Have " + colName + " Column Locater");
			testCase.log(Status.FAIL, "Dont Have " + colName + "Column Locater");
			numberOfRow = 0;
		}
		int rowcount = sheet.getLastRowNum();
		for (int i = 0; i <= rowcount; i++) {
			XSSFRow row = sheet.getRow(i);

			check = (boolean) row.getCell(0).getBooleanCellValue();
			SearchData = (String) row.getCell(excelcolNo).getStringCellValue();
			pagiWaitTime = (int) row.getCell(10).getNumericCellValue();
			textWaitTime = (int) row.getCell(11).getNumericCellValue();
			boolean Enablity = true;
			if (Column.isEmpty()) {
				BeforeCount = 0;
			} else {
				while (Enablity) {
					Thread.sleep(pagiWaitTime);
					try {
						for (int j = 2; j <= numberOfRow; j++) {
							WebElement code = driver.findElement(By.xpath(ColBefore + j + colAfter));
							Thread.sleep(textWaitTime);
							String CodeName = code.getText();
							if (CodeName.contains(SearchData)) {
								BeforeCount = BeforeCount + 1;
							}

						}
					} catch (NoSuchElementException e) {
						System.out.println("Dont Have Text Locater in Column");
					}
					try {
						PlantSearchPage.NextPageBtn.click();
						Enablity = PlantSearchPage.NextPageBtn.isEnabled();
					} catch (NoSuchElementException e) {
//						testCase = extent.createTest(colName + " Column Pagination Next Button");
//						testCase.log(Status.INFO, "Dont have Pagination Next Button Locator");
//						testCase.log(Status.FAIL, "Dont have Pagination Next Button Locator");
						break;
					}
				}

				System.out.println("BeforeFilteringDataCount : " + BeforeCount);

				try {
					boolean firstPage = PlantSearchPage.PreviousPageBtn.isEnabled();
					while (firstPage) {
						PlantSearchPage.PreviousPageBtn.click();
						firstPage = PlantSearchPage.PreviousPageBtn.isEnabled();
					}
				} catch (NoSuchElementException e) {
//					testCase = extent.createTest(colName + " Pagination Next Button");
//					testCase.log(Status.INFO, "Dont have Pagination Next Button Locator");
//					testCase.log(Status.FAIL, "Dont have Pagination Next Button Locator");
					break;
				}
			}
			Actions act = new Actions(driver);
			act.sendKeys(Keys.PAGE_UP).build().perform();
			Thread.sleep(2000);
		}
	}

	/*********************************************************************************************************************************************************
	 * Take Count After Searching & Check Single Searched data Filtering is Corroct/
	 * Not
	 **********************************************************************************************************************************************************/
	public static void checkAfterSearchData(List<WebElement> Column, String ColBefore, String colAfter,
			boolean TableData, String colName) throws InterruptedException {
		PageFactory.initElements(driver, psp);
		if (buttonClick) {
			boolean Enablity = true;
			try {
				numberOfRow = Column.size();
			} catch (NoSuchElementException e) {
				testCase = extent.createTest("Column Locater");
				testCase.log(Status.INFO, "Dont Have Column Locater");
				testCase.log(Status.FAIL, "Dont Have Column Locater");
				numberOfRow = 0;
			}
			if (Column.isEmpty()) {
				AfterCount = 0;
			} else {
				while (Enablity) {
					Thread.sleep(3000);
					try {
						for (int j = 2; j <= numberOfRow; j++) {
							WebElement code = driver.findElement(By.xpath(ColBefore + j + colAfter));
//				Thread.sleep(1000);
							String CodeName = code.getText();
							if (CodeName.contains(SearchData)) {
								AfterCount = AfterCount + 1;
							}
							if (driver
									.findElement(
											By.xpath("//tbody[@class='ant-table-tbody']/tr[" + j + "]/td[2]/span/span"))
									.isDisplayed()) {
								TableData = true;
							}
							if (!CodeName.contains(SearchData)) {
								TableData = false;
							}
						}
					} catch (NoSuchElementException e) {
//						testCase = extent.createTest("Dont Have This Row Locater");
//						testCase.log(Status.INFO, "Dont Have This Row Locater");
//						testCase.log(Status.FAIL, "Dont Have This Row Locater");
					}
					try {
						PlantSearchPage.NextPageBtn.click();
						Enablity = PlantSearchPage.NextPageBtn.isEnabled();
					} catch (NoSuchElementException e) {
//						testCase = extent.createTest(colName + " Column Pagination Next Button");
//						testCase.log(Status.INFO, "Dont have Pagination Next Button Locator");
//						testCase.log(Status.FAIL, "Dont have Pagination Next Button Locator");
						break;
					}
				}
				System.out.println("AfterFilteringDataCount : " + AfterCount);
				boolean checke = true;
				try {
					Assert.assertEquals(BeforeCount, AfterCount);
				} catch (AssertionError e) {
					checke = false;
				}
				System.out.println("****************************************");
				System.out.println(checke + "@@@@@@@@");
				System.out.println(TableData + "$$$$$$");
				System.out.println("****************************************");
				if (checke && TableData) {
					testCase = extent.createTest(colName + " Single Search Function");
					testCase.log(Status.INFO, colName + " Single Search Work Correctly");
					testCase.log(Status.PASS, colName + " Single Search Work Correctly");
				} else {
					pass = false;
					testCase = extent.createTest(colName + " Single Search Function");
					testCase.log(Status.INFO, colName + " Single Search Work Wrongly");
					testCase.log(Status.FAIL, colName + " Single Search Work Wrongly");
				}

				BeforeCount = 0;
				AfterCount = 0;
			}
		} else {
			testCase = extent.createTest(colName + " Single Search Function");
			testCase.log(Status.INFO, "Unable to click " + colName + " Search Button, So Fail");
			testCase.log(Status.FAIL, "Unable to click " + colName + " Search Button, So Fail");
		}

	}

	/*********************************************************************************************************************************************************
	 * Input Searched Data
	 **********************************************************************************************************************************************************/
	public static void inputDataSearch(WebElement textBox, String colName) throws IOException, InterruptedException {
		PageFactory.initElements(driver, psp);
		if (SearchTextBoxVisible && SearchTextBoxEnable) {
			if (check) {
				textBox.sendKeys(SearchData);
				Thread.sleep(1000);
				testCase = extent.createTest(colName + " Search Data Input");
				try {
					Assert.assertEquals(textBox.getAttribute("value"), SearchData);
					testCase.log(Status.INFO, colName + " Input Data");
					testCase.log(Status.PASS, colName + " Input Data");
				} catch (AssertionError e) {
					testCase.log(Status.INFO, colName + " Input Data");
					testCase.log(Status.PASS, colName + " Input Data");
				}

			}

		} else {
			testCase = extent.createTest(colName + " Search Data Input");
			testCase.log(Status.INFO, colName + " Search TextBox Not Visible / Enable");
			testCase.log(Status.FAIL, colName + " Search TextBox Not Visible / Enable");
		}
	}

	/*********************************************************************************************************************************************************
	 * Check Multiple Searched data Filtering is Corroct/ Not
	 **********************************************************************************************************************************************************/
	public static void MultipleSearch(String colName) {
		PageFactory.initElements(driver, psp);
		if (pass) {
			testCase = extent.createTest(colName + " Multi Search (Check Correct Data Count Filter) ☑");
			testCase.log(Status.INFO, "Correct Data Count Filtered");
			testCase.log(Status.PASS, "Correct Data Count Filtered");
		} else {
			testCase = extent.createTest(colName + " Multi Search (Check Correct Data Count Filter) ✘");
			testCase.log(Status.INFO, "Wrong Data Count Filtered");
			testCase.log(Status.FAIL, "Wrong Data Count Filtered");
		}
	}

	public static void Logout() throws InterruptedException {
		PageFactory.initElements(driver, psp);
		try {
			driver.findElement(By.xpath("//header[@class='ant-layout-header']/ul/div/div[2]/div/div/span")).click();
			Thread.sleep(1500);
			driver.findElement(By.xpath(
					"//ul[@class='ant-dropdown-menu ant-dropdown-menu-root ant-dropdown-menu-vertical ant-dropdown-menu-light']/li[5]"))
					.click();
			Thread.sleep(1500);
		} catch (NoSuchElementException e) {

		}
	}

}
