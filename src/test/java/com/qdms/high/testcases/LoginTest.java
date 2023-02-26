package com.qdms.high.testcases;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.qdms.high.base.DriverIntialization;
import com.qdms.high.pages.LoginPage;

public class LoginTest extends DriverIntialization {

	static LoginPage loginpg = new LoginPage();


	public static   void Login() throws InterruptedException, IOException {
		PageFactory.initElements(driver, loginpg);

		FileInputStream file = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\resources\\Excel-sheets\\SampleExcel.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Login");

		int rowcount = sheet.getLastRowNum();
		for (int i = 0; i <= rowcount; i++) {
			XSSFRow row = sheet.getRow(0);

			String uName = (String) row.getCell(0).getStringCellValue();
			String pWord = (String) row.getCell(1).getStringCellValue();

			LoginPage.Username.sendKeys(uName);
			LoginPage.Password.sendKeys(pWord);
			LoginPage.LoginButton.click();

			

		}
	}

}
