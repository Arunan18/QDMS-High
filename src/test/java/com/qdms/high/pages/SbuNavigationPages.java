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

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SbuNavigationPages {
	
	@FindBy(xpath = "//div[@class='sc-htoDjs jApeNY']/div[1]")
	public static WebElement Sbu;
	
	@FindBy(xpath = "//div[@class='sc-htoDjs jApeNY']/div[2]")
	public static WebElement Plant;
	
	@FindBy(xpath = "//div[@class='sc-htoDjs jApeNY']/div[1]")
	public static WebElement Equipment;
	
	@FindBy(xpath = "//div[@class='sc-htoDjs jApeNY']/div[2]")
	public static WebElement PlantEquipment
;
	
	@FindBy(xpath = "//div[@class='sc-htoDjs jApeNY']/div[1]")
	public static WebElement MaterialMainCategory;
	
	@FindBy(xpath = "//div[@class='sc-htoDjs jApeNY']/div[2]")
	public static WebElement MaterialSubCategory
;
	
	@FindBy(xpath = "//div[@class='sc-htoDjs jApeNY']/div[3]")
	public static WebElement MaterialState
;
	
	@FindBy(xpath = "//div[@class='sc-htoDjs jApeNY']/div[4]")
	public static WebElement Source;
	
	@FindBy(xpath = "//div[@class='sc-htoDjs jApeNY']/div[5]")
	public static WebElement Material;
	
	@FindBy(xpath = "//div[@class='sc-htoDjs jApeNY']/div[6]")
	public static WebElement Unit;
	
	@FindBy(xpath = "//div[@class='sc-htoDjs jApeNY']/div[1]")
	public static WebElement Customer;
	
	@FindBy(xpath = "//div[@class='sc-htoDjs jApeNY']/div[2]")
	public static WebElement Project;
	
	@FindBy(xpath = "//div[@class='sc-htoDjs jApeNY']/div[3]")
	public static WebElement Delivery;
	
	@FindBy(xpath = "//div[@class='sc-htoDjs jApeNY']/div[1]")
	public static WebElement SupplierCategory
;
	
	@FindBy(xpath = "//div[@class='sc-htoDjs jApeNY']/div[2]")
	public static WebElement Supplier;
	
	@FindBy(xpath = "//div[@class='sc-htoDjs jApeNY']/div[1]")
	public static WebElement Designation;
	
	@FindBy(xpath = "//div[@class='sc-htoDjs jApeNY']/div[2]")
	public static WebElement Role;
	
	@FindBy(xpath = "//div[@class='sc-htoDjs jApeNY']/div[3]")
	public static WebElement Employee;
	
	@FindBy(xpath = "//div[@class='sc-htoDjs jApeNY']/div[4]")
	public static WebElement User;
}
