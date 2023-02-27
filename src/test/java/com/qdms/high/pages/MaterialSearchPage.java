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
package com.qdms.high.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qdms.high.base.DriverIntialization;

public class MaterialSearchPage extends DriverIntialization{
	@FindBy(xpath = "//div[@class='ant-dropdown ant-dropdown-placement-bottomRight ']/div/div/input")
	public static WebElement SearchTextBox;
	@FindBy(xpath = "//div[@class='ant-dropdown ant-dropdown-placement-bottomRight ']/div/div/div/button[1]")
	public static WebElement SearchBtn;

	@FindBy(xpath = "//thead[@class='ant-table-thead']/tr/th[1]/div/span[2]")
	public static WebElement MaterialSearch;
	
	@FindBy(xpath = "//thead[@class='ant-table-thead']/tr/th[2]/div/span[2]")
	public static WebElement MainCatSearch;
	
	@FindBy(xpath = "//thead[@class='ant-table-thead']/tr/th[3]/div/span[2]")
	public static WebElement SubCatSearch;
	
	@FindBy(xpath = "//thead[@class='ant-table-thead']/tr/th[4]/div/span[2]")
	public static WebElement PrefixSearch;
	
	@FindBy(xpath = "//thead[@class='ant-table-thead']/tr/th[5]/div/span[2]")
	public static WebElement PlantSearch;
	
	@FindBy(xpath = "//thead[@class='ant-table-thead']/tr/th[6]/div/span[2]")
	public static WebElement StateSearch;
	
	@FindBy(xpath = "//thead[@class='ant-table-thead']/tr/th[8]/div/span[2]")
	public static WebElement ErpSearch;
	
	@FindBy(xpath = "//thead[@class='ant-table-thead']/tr/th[9]/div/span[2]")
	public static WebElement SbuSearch;
	
	@FindBy(xpath = "//thead[@class='ant-table-thead']/tr/th[10]/div/span[2]")
	public static WebElement SourceSearch;
	
	
	@FindBy(xpath = "//li[@title='Next Page']/button")
	public static WebElement NextPageBtn;
	@FindBy(xpath = "//li[@title='Previous Page']/button")
	public static WebElement PreviousPageBtn;
	@FindBy(xpath = "//tbody[@class='ant-table-tbody']/tr/td[1]")
	public static List<WebElement> MaterialColumn;
	@FindBy(xpath = "//tbody[@class='ant-table-tbody']/tr/td[2]")
	public static List<WebElement> MainCatColumn;
	@FindBy(xpath = "//tbody[@class='ant-table-tbody']/tr/td[3]")
	public static List<WebElement> SubCatColumn;
	@FindBy(xpath = "//tbody[@class='ant-table-tbody']/tr/td[4]")
	public static List<WebElement> PrefixColumn;
	@FindBy(xpath = "//tbody[@class='ant-table-tbody']/tr/td[5]")
	public static List<WebElement> PlantColumn;
	@FindBy(xpath = "//tbody[@class='ant-table-tbody']/tr/td[6]")
	public static List<WebElement> StateColumn;
	@FindBy(xpath = "//tbody[@class='ant-table-tbody']/tr/td[8]")
	public static List<WebElement> ErpColumn;
	@FindBy(xpath = "//tbody[@class='ant-table-tbody']/tr/td[9]")
	public static List<WebElement> SbuColumn;
	@FindBy(xpath = "//tbody[@class='ant-table-tbody']/tr/td[10]")
	public static List<WebElement> SourceColumn;
	
	@FindBy(xpath = "//button[@type='button'][@class='ant-btn ant-btn-danger ant-btn-background-ghost']")
	public static WebElement ResetAll;
	@FindBy(xpath = "//div[@class='ant-table-filter-dropdown']")
	public static WebElement SearchBox;
	
	public static String MaterialColumnBefore = "//tbody[@class='ant-table-tbody']/tr[";
	public static String MaterialColumnAfter="]/td[1]"; 
	public static String MainCatColumnBefore = "//tbody[@class='ant-table-tbody']/tr[";
	public static String MainCatColumnAfter="]/td[2]"; 
	public static String SubCatColumnBefore = "//tbody[@class='ant-table-tbody']/tr[";
	public static String SubCatColumnAfter="]/td[3]"; 
	public static String PrefixColumnBefore = "//tbody[@class='ant-table-tbody']/tr[";
	public static String PrefixColumnAfter="]/td[4]"; 
	public static String PlantColumnBefore = "//tbody[@class='ant-table-tbody']/tr[";
	public static String PlantColumnAfter="]/td[5]"; 
	public static String StateColumnBefore = "//tbody[@class='ant-table-tbody']/tr[";
	public static String StateColumnAfter="]/td[6]"; 
	public static String ErpColumnBefore = "//tbody[@class='ant-table-tbody']/tr[";
	public static String ErpColumnAfter="]/td[8]"; 
	public static String SbuColumnBefore = "//tbody[@class='ant-table-tbody']/tr[";
	public static String SbuColumnAfter="]/td[9]"; 
	public static String SourceColumnBefore = "//tbody[@class='ant-table-tbody']/tr[";
	public static String SourceColumnAfter="]/td[10]"; 
	
	@FindBy(xpath = "//ul[@class='ant-pagination mini ant-table-pagination ant-table-pagination-right']/li/div")
	public static WebElement CurrentPaginationOpction;
	@FindBy(xpath = "//*[@class='ant-select-item ant-select-item-option'][@title='100 / page']")
	public static WebElement Page_100;
	

}
