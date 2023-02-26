package com.qdms.high.testcases;

import java.io.FileInputStream;
import java.io.IOException;

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
import com.qdms.high.pages.PlantSearchPage;

public class DeliveryTest extends DriverIntialization {
	static DeliveryPage dp = new DeliveryPage();

	static boolean DeleverySearchVisible = true;
	static boolean DeleverySearchEnable = true;
	static boolean SearchTextBoxVisible = true;
	static boolean SearchTextBoxEnable = true;
	static boolean SearchButtonVisible = true;
	static boolean SearchButtonEnable = true;
	static boolean TableData = true;
	static int BeforeFilteringDataCount = 0;
	static int AfterFilteringDataCount = 0;

//	Delevery Search Button
	public static void deleverySearch() {
		PageFactory.initElements(driver, dp);
//		Check Delevery Search Properties
		testCase = extent.createTest("Delevery Search Button Visible");
		try {
			Assert.assertEquals(DeliveryPage.DeleverySearch.isDisplayed(), true);
			testCase.log(Status.INFO, "Delevery Search Button Visible");
			testCase.log(Status.PASS, "Delevery Search Button Visible Script Pass").assignCategory("High-Severity");
		} catch (AssertionError e) {
			DeleverySearchVisible = false;
			testCase.log(Status.INFO, "Delevery Search Button Not Visible");
			testCase.log(Status.FAIL, "Delevery Search Button Not Visible").assignCategory("High-Severity");
		} catch (NoSuchElementException e) {
			DeleverySearchVisible = false;
			testCase.log(Status.INFO, "Dont have Delevery Search Button Locator");
			testCase.log(Status.FAIL, "Dont have Delevery Search Button Locator, So Smoke Fail")
					.assignCategory("High-Severity");
		}

		if (DeleverySearchVisible) {
//			Check Delevery Search Enable
			testCase = extent.createTest("Delevery Search Button Enable");
			try {
				Assert.assertEquals(DeliveryPage.DeleverySearch.isEnabled(), true);
				testCase.log(Status.INFO, "Delevery Search Button Enable");
				testCase.log(Status.PASS, "Delevery Search Button Enable Script Pass").assignCategory("High-Severity");
			} catch (AssertionError e) {
				DeleverySearchEnable = false;
				testCase.log(Status.INFO, "Delevery Search Button Not Enable");
				testCase.log(Status.FAIL, "Delevery Search Button Not Enable").assignCategory("High-Severity");
			}

			if (DeleverySearchEnable) {
//				
			}
		}
	}

//	Check Delevery Search Button Click
	public static void ClickDeleverySearch() throws InterruptedException {
		PageFactory.initElements(driver, dp);
		if (DeleverySearchVisible && DeleverySearchEnable) {
			DeliveryPage.DeleverySearch.click();
		}
	}

//	Delevery input TextBox Properties
	public static void DeleverySearchTextBox() throws InterruptedException {
		PageFactory.initElements(driver, dp);

//		Check Delevery Search TextBox Visible
		testCase = extent.createTest("Delevery Search Text Box Visible");
		try {
			Thread.sleep(1000);
			Assert.assertEquals(DeliveryPage.DeleverySearch.isDisplayed(), true);
			testCase.log(Status.INFO, "Delevery Search Text Box Visible");
			testCase.log(Status.PASS, "Delevery Search Text Box Visible Script Pass").assignCategory("High-Severity");
		} catch (AssertionError e) {
			SearchTextBoxVisible = false;
			testCase.log(Status.INFO, "Delevery Search Text Box Not Visible");
			testCase.log(Status.FAIL, "Delevery Search Text Box Not Visible").assignCategory("High-Severity");
		} catch (NoSuchElementException e) {
			SearchTextBoxVisible = false;
			testCase.log(Status.INFO, "Dont have Delevery Search Text Box Locator");
			testCase.log(Status.FAIL, "Dont have Delevery Search Text Box Locator, So Smoke Fail")
					.assignCategory("High-Severity");
		}

		if (SearchTextBoxVisible) {
//			Check Delevery Search TextBoxEnable
			testCase = extent.createTest("Delevery Search Text Box Enable");
			try {
				Assert.assertEquals(DeliveryPage.DeleverySearch.isEnabled(), true);
				testCase.log(Status.INFO, "Delevery Search Text Box Enable");
				testCase.log(Status.PASS, "Delevery Search Text Box Enable Script Pass")
						.assignCategory("High-Severity");
			} catch (AssertionError e) {
				SearchTextBoxEnable = false;
				testCase.log(Status.INFO, "Delevery Search Text Box Not Enable");
				testCase.log(Status.FAIL, "Delevery Search Text Box Not Enable").assignCategory("High-Severity");
			}

			if (SearchTextBoxEnable) {
//				
			}
		}
	}

//Delevery Search Button Properties
	public static void DeleverySearchButton() throws InterruptedException {
		PageFactory.initElements(driver, dp);

//	Check Delevery Search TextBox Visible
		testCase = extent.createTest("Delevery Search Button Visible");
		try {
			Thread.sleep(1000);
			Assert.assertEquals(DeliveryPage.SearchTextBox.isDisplayed(), true);
			testCase.log(Status.INFO, "Delevery Search Button Visible");
			testCase.log(Status.PASS, "Delevery Search Button Visible Script Pass").assignCategory("High-Severity");
		} catch (AssertionError e) {
			SearchButtonVisible = false;
			testCase.log(Status.INFO, "Delevery Search Button Not Visible");
			testCase.log(Status.FAIL, "Delevery Search Button Not Visible").assignCategory("High-Severity");
		} catch (NoSuchElementException e) {
			SearchButtonVisible = false;
			testCase.log(Status.INFO, "Dont have Delevery Search Button Locator");
			testCase.log(Status.FAIL, "Dont have Delevery Search Button Locator, So Smoke Fail")
					.assignCategory("High-Severity");
		}

		if (SearchButtonVisible) {
//		Check Delevery Search TextBoxEnable
			testCase = extent.createTest("Delevery Search Button Enable");
			try {
				Assert.assertEquals(DeliveryPage.SearchTextBox.isEnabled(), true);
				testCase.log(Status.INFO, "Delevery Search Button Enable");
				testCase.log(Status.PASS, "Delevery Search Button Enable Script Pass").assignCategory("High-Severity");
			} catch (AssertionError e) {
				SearchButtonEnable = false;
				testCase.log(Status.INFO, "Delevery Search Button Not Enable");
				testCase.log(Status.FAIL, "Delevery Search Button Not Enable").assignCategory("High-Severity");
			}

			if (SearchButtonEnable) {
//			
			}
		}
	}

//Delevery input TextBox Properties
	public static void DeleverySearchButtonClick() throws InterruptedException {
		PageFactory.initElements(driver, dp);

		if (SearchButtonVisible && SearchButtonEnable) {
			DeliveryPage.DeleverySearch.click();
		}
	}

//	Input Search Data
	public static void inputDataSearch() throws IOException, InterruptedException {
		PageFactory.initElements(driver, dp);
		if (SearchTextBoxVisible && SearchTextBoxEnable) {

			DeliveryPage.SearchTextBox.sendKeys("Concrete");
			DeleverySearchButtonClick();
			Thread.sleep(1000);
			checkAfterSearchData("Concrete");
			Thread.sleep(1000);
			if ((BeforeFilteringDataCount == AfterFilteringDataCount) && TableData) {
				testCase = extent.createTest("Check Correct Data Count Filter In Delevery");
				testCase.log(Status.INFO, "Correct Data Count Filtered");
				testCase.log(Status.PASS, "Correct Data Count Filtered").assignCategory("High-Severity");
			} else {
				testCase = extent.createTest("Check Correct Data Count Filter");
				testCase.log(Status.INFO, "Wrong Data Count Filtered");
				testCase.log(Status.FAIL, "Wrong Data Count Filtered").assignCategory("High-Severity");
			}

		}

	}

//	BeforeFilteringDataCount
	public static void checkBeforeSearchData(String Sbu) throws InterruptedException {
		PageFactory.initElements(driver, dp);
		boolean Enablity = true;
		while (Enablity) { 
			Thread.sleep(2000);
			for (int j = 2; j <= DeliveryPage.DeleveryColumn.size(); j++) {
				WebElement code = driver
						.findElement(By.xpath(DeliveryPage.DeleveryColumnBefore + j + DeliveryPage.DeleveryColumnAfter));
				Thread.sleep(1000);
				String CodeName = code.getText();
				if (CodeName.contains(Sbu)) {
					System.out.println(CodeName);
					BeforeFilteringDataCount = BeforeFilteringDataCount + 1;
				}
			}
			DeliveryPage.NextPageBtn.click();
			Enablity = DeliveryPage.NextPageBtn.isEnabled();
		}

		System.out.println("BeforeFilteringDataCount : " + BeforeFilteringDataCount);

//		boolean firstPage = true;
//		while (firstPage) {
//			DeleveryPage.PreviousPageBtn.click();
//			firstPage = DeleveryPage.PreviousPageBtn.isEnabled();
//		}
		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_UP).build().perform();
		Thread.sleep(2000);
//		driver.navigate().refresh();
	}

//	afterFilteringDataCount
	public static void checkAfterSearchData(String Sbu) throws InterruptedException {
		PageFactory.initElements(driver, dp);
		
		boolean Enablity = true;
		while (Enablity) { 
			Thread.sleep(3000);
			for (int j = 2; j <= DeliveryPage.DeleveryColumn.size(); j++) {
				WebElement code = driver
						.findElement(By.xpath(DeliveryPage.DeleveryColumnBefore + j + DeliveryPage.DeleveryColumnAfter));
//				Thread.sleep(1000);
				String CodeName = code.getText();
				if (CodeName.contains(Sbu)) {
					AfterFilteringDataCount = AfterFilteringDataCount + 1;
				}
				if (!CodeName.contains(Sbu)) {
					TableData = false;
				}
			}
			DeliveryPage.NextPageBtn.click();
			Enablity = DeliveryPage.NextPageBtn.isEnabled();

		}
		System.out.println("AfterFilteringDataCount : " + AfterFilteringDataCount);
	}

//	*************************************************************************************
//	*************************************************************************************
//	BeforeFilteringDataCount
	static int BeforeFilteringDataCountSbu = 0;
	static int AfterFilteringDataCountSbu = 0;
	static boolean SbuTableData = true;

//	Check Delevery Search Button Click
	public static void ClickSbuSearch() throws InterruptedException {
		PageFactory.initElements(driver, dp);
		PlantSearchPage.SbuSearch.click();

	}

//	Input SBU Search Data
	public static void inputSbuDataSearch() throws IOException, InterruptedException {
		PageFactory.initElements(driver, dp);

		DeliveryPage.SearchTextBox.sendKeys("RMC");
		Thread.sleep(1000);
		checkAfterSbuSearchData("RMC");
		Thread.sleep(1000);
		if ((BeforeFilteringDataCountSbu == AfterFilteringDataCountSbu) && SbuTableData) {
			testCase = extent.createTest("Check Correct Data Count Filter In SBU");
			testCase.log(Status.INFO, "Correct Data Count Filtered");
			testCase.log(Status.PASS, "Correct Data Count Filtered").assignCategory("High-Severity");
		} else {
			testCase = extent.createTest("Check Correct Data Count Filter In SBU");
			testCase.log(Status.INFO, "Wrong Data Count Filtered");
			testCase.log(Status.FAIL, "Wrong Data Count Filtered").assignCategory("High-Severity");
		}

	}

//	
	public static void checkBeforeSbuSearchData(String Sbu) throws InterruptedException {
		PageFactory.initElements(driver, dp);
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
		PageFactory.initElements(driver, dp);
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
					TableData = false;
				}
			}
			if (PlantSearchPage.NextPageBtn.isEnabled()) {
				PlantSearchPage.NextPageBtn.click();
			}
			Enablity = PlantSearchPage.NextPageBtn.isEnabled();

		}
		System.out.println("AfterFilteringDataCountSbu : " + AfterFilteringDataCountSbu);
	}

	public static void Report() {
		if ((BeforeFilteringDataCountSbu == AfterFilteringDataCountSbu) && SbuTableData) {
			testCase = extent.createTest("Check Correct Data Count Filter In SBU");
			testCase.log(Status.INFO, "Correct Data Count Filtered");
			testCase.log(Status.PASS, "Correct Data Count Filtered").assignCategory("High-Severity");
		} else {
			testCase = extent.createTest("Check Correct Data Count Filter In SBU");
			testCase.log(Status.INFO, "Wrong Data Count Filtered");
			testCase.log(Status.FAIL, "Wrong Data Count Filtered").assignCategory("High-Severity");
		}
	}
	
	

}
