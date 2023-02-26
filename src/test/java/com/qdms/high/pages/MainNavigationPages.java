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

public class MainNavigationPages {
	
@FindBy(xpath = "//a[@class='sc-bdVaJa ieeiNp'][@href='#/master/plantlevel']")
public static WebElement Master;



@FindBy(xpath = "//a[@class='sc-bdVaJa ieeiNp active'][@href='#/master/plantlevel']")
public static WebElement Plant;

@FindBy(xpath = "//a[@class='sc-bdVaJa ieeiNp'][@href='#/master/equipmentlevel']")
public static WebElement Equpment;

@FindBy(xpath = "//a[@class='sc-bdVaJa ieeiNp'][@href='#/master/materiallevel']")
public static WebElement Material;

@FindBy(xpath = "//a[@class='sc-bdVaJa ieeiNp'][@href='#/master/customerlevel']")
public static WebElement Customer;

@FindBy(xpath = "//a[@class='sc-bdVaJa ieeiNp'][@href='#/master/supplierlevel']")
public static WebElement Supplier;

@FindBy(xpath = "//a[@class='sc-bdVaJa ieeiNp'][@href='#/master/employeelevel']")
public static WebElement Employee;


}
