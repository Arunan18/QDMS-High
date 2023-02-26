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
package com.qdms.high.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PlantSearchPage {
	@FindBy(xpath = "//div[@class='ant-dropdown ant-dropdown-placement-bottomRight ']/div/div/input")
	public static WebElement SearchTextBox;
	@FindBy(xpath = "//div[@class='ant-dropdown ant-dropdown-placement-bottomRight ']/div/div/div/button[1]")
	public static WebElement SearchBtn;

	@FindBy(xpath = "//thead[@class='ant-table-thead']/tr/th[1]/div/span[2]")
	public static WebElement PlantCodeSearch;
	
	@FindBy(xpath = "//thead[@class='ant-table-thead']/tr/th[2]/div/span[2]")
	public static WebElement PlantNameSearch;
	
	@FindBy(xpath = "//thead[@class='ant-table-thead']/tr/th[3]/div/span[2]")
	public static WebElement SbuSearch;
	
	@FindBy(xpath = "//thead[@class='ant-table-thead']/tr/th[4]/div/span[2]")
	public static WebElement PlantManagerSearch;
	
	@FindBy(xpath = "//thead[@class='ant-table-thead']/tr/th[5]/div/span[2]")
	public static WebElement AddressSearch;
	
	@FindBy(xpath = "//thead[@class='ant-table-thead']/tr/th[6]/div/span[2]")
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
	public static List<WebElement> PlantCodeColumn;
	@FindBy(xpath = "//tbody[@class='ant-table-tbody']/tr/td[2]")
	public static List<WebElement> PlantColumn;
	@FindBy(xpath = "//tbody[@class='ant-table-tbody']/tr/td[3]")
	public static List<WebElement> SbuColumn;
	@FindBy(xpath = "//tbody[@class='ant-table-tbody']/tr/td[4]")
	public static List<WebElement> managerColumn;
	@FindBy(xpath = "//tbody[@class='ant-table-tbody']/tr/td[5]")
	public static List<WebElement> AddressColumn;
	@FindBy(xpath = "//tbody[@class='ant-table-tbody']/tr/td[6]")
	public static List<WebElement> MobileColumn;
	
	
	public static String PlantCodeColumnBefore = "//tbody[@class='ant-table-tbody']/tr[";
	public static String PlantCodeColumnAfter="]/td[1]"; 
	public static String PlantColumnBefore = "//tbody[@class='ant-table-tbody']/tr[";
	public static String PlantColumnAfter="]/td[2]"; 
	public static String SbuColumnBefore = "//tbody[@class='ant-table-tbody']/tr[";
	public static String SbuColumnAfter="]/td[3]"; 
	public static String managerColumnBefore = "//tbody[@class='ant-table-tbody']/tr[";
	public static String managerColumnAfter="]/td[4]"; 
	public static String addressColumnBefore = "//tbody[@class='ant-table-tbody']/tr[";
	public static String addressColumnAfter="]/td[5]"; 
	public static String mobileColumnBefore = "//tbody[@class='ant-table-tbody']/tr[";
	public static String mobileColumnAfter="]/td[6]"; 
	
	
}
