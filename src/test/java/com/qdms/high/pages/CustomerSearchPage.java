package com.qdms.high.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CustomerSearchPage {
	@FindBy(xpath = "//div[@class='ant-dropdown ant-dropdown-placement-bottomRight ']/div/div/input")
	public static WebElement SearchTextBox;
	@FindBy(xpath = "//div[@class='ant-dropdown ant-dropdown-placement-bottomRight ']/div/div/div/button[1]")
	public static WebElement SearchBtn;

	@FindBy(xpath = "//thead[@class='ant-table-thead']/tr/th[1]/div/span[2]")
	public static WebElement CustomerSearch;
	
	@FindBy(xpath = "//thead[@class='ant-table-thead']/tr/th[2]/div/span[2]")
	public static WebElement PlantSearch;
	
	@FindBy(xpath = "//thead[@class='ant-table-thead']/tr/th[3]/div/span[2]")
	public static WebElement EmailSearch;
	
	@FindBy(xpath = "//thead[@class='ant-table-thead']/tr/th[4]/div/span[2]")
	public static WebElement ContactNoSearch;
	
	
	
	@FindBy(xpath = "//button[@type='button'][@class='ant-btn ant-btn-danger ant-btn-background-ghost']")
	public static WebElement ResetAll;
	@FindBy(xpath = "//div[@class='ant-table-filter-dropdown']")
	public static WebElement SearchBox;
	
	
	@FindBy(xpath = "//li[@title='Next Page']/button")
	public static WebElement NextPageBtn;
	@FindBy(xpath = "//li[@title='Previous Page']/button")
	public static WebElement PreviousPageBtn;
	
	@FindBy(xpath = "//tbody[@class='ant-table-tbody']/tr/td[1]")
	public static List<WebElement> CustomerColumn;
	@FindBy(xpath = "//tbody[@class='ant-table-tbody']/tr/td[2]")
	public static List<WebElement> PlantColumn;
	@FindBy(xpath = "//tbody[@class='ant-table-tbody']/tr/td[3]")
	public static List<WebElement> EmailColumn;
	@FindBy(xpath = "//tbody[@class='ant-table-tbody']/tr/td[4]")
	public static List<WebElement> ContactNoColumn;

	
	
	public static String CustomerColumnBefore = "//tbody[@class='ant-table-tbody']/tr[";
	public static String CustomerColumnAfter="]/td[1]"; 
	public static String PlantColumnBefore = "//tbody[@class='ant-table-tbody']/tr[";
	public static String PlantColumnAfter="]/td[2]"; 
	public static String EmailColumnBefore = "//tbody[@class='ant-table-tbody']/tr[";
	public static String EmailColumnAfter="]/td[3]"; 
	public static String ContactNoColumnBefore = "//tbody[@class='ant-table-tbody']/tr[";
	public static String ContactNoColumnAfter="]/td[4]"; 
	
}
