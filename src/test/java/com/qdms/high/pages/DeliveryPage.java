package com.qdms.high.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DeliveryPage {
	@FindBy(xpath = "//div[@class='ant-dropdown ant-dropdown-placement-bottomRight ']/div/div/input")
	public static WebElement SearchTextBox;
	@FindBy(xpath = "//div[@class='ant-dropdown ant-dropdown-placement-bottomRight ']/div/div/div/button[1]")
	public static WebElement SearchBtn;

	@FindBy(xpath = "//thead[@class='ant-table-thead']/tr/th[1]/div/span[2]")
	public static WebElement DeleverySearch;
	
	@FindBy(xpath = "//thead[@class='ant-table-thead']/tr/th[2]/div/span[2]")
	public static WebElement ProjectSearch;
	
	@FindBy(xpath = "//tbody[@class='ant-table-tbody']/tr/td[1]")
	public static List<WebElement> DeleveryColumn;
	@FindBy(xpath = "//tbody[@class='ant-table-tbody']/tr/td[2]")
	public static List<WebElement> ProjectColumn;
	
	@FindBy(xpath = "//li[@title='Next Page']/button")
	public static WebElement NextPageBtn;
	@FindBy(xpath = "//li[@title='Previous Page']/button")
	public static WebElement PreviousPageBtn;
	public static String DeleveryColumnBefore = "//tbody[@class='ant-table-tbody']/tr[";
	public static String DeleveryColumnAfter="]/td[1]";  
	public static String ProjectColumnBefore = "//tbody[@class='ant-table-tbody']/tr[";
	public static String ProjectColumnAfter="]/td[2]"; 
	
	@FindBy(xpath = "//button[@type='button'][@class='ant-btn ant-btn-danger ant-btn-background-ghost']")
	public static WebElement ResetAll;
	@FindBy(xpath = "//div[@class='ant-table-filter-dropdown']")
	public static WebElement SearchBox;
	
}
