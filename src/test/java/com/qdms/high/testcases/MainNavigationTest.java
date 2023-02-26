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
package com.qdms.high.testcases;

import org.openqa.selenium.support.PageFactory;

import com.qdms.high.base.DriverIntialization;
import com.qdms.high.pages.MainNavigationPages;

public class MainNavigationTest extends DriverIntialization{
	static MainNavigationPages mnp = new MainNavigationPages();
	
//	Navigate Master
	public static void navigateMaster() throws InterruptedException {
		PageFactory.initElements(driver, mnp);
		Thread.sleep(2500);
		MainNavigationPages.Master.click();
	}
	
	
//	Navigate Plant
	public static void navigatePlant() throws InterruptedException {
		PageFactory.initElements(driver, mnp);
		Thread.sleep(2000);
		MainNavigationPages.Plant.click();
	}
	
//	Navigate Equpment
	public static void navigateEqupment() throws InterruptedException {
		PageFactory.initElements(driver, mnp);
		Thread.sleep(2000);
		MainNavigationPages.Equpment.click();
	}
	
//	Navigate Material
	public static void navigateMaterial() throws InterruptedException {
		PageFactory.initElements(driver, mnp);
		Thread.sleep(2000);
		MainNavigationPages.Material.click();
	}
	
//	Navigate Customer
	public static void navigateCustomer() throws InterruptedException {
		PageFactory.initElements(driver, mnp);
		Thread.sleep(2000);
		MainNavigationPages.Customer.click();
	}
	
//	Navigate Supplier
	public static void navigateSupplier() throws InterruptedException {
		PageFactory.initElements(driver, mnp);
		Thread.sleep(2000);
		MainNavigationPages.Supplier.click();
	}

//	Navigate Employee
	public static void navigateEmployee() throws InterruptedException {
		PageFactory.initElements(driver, mnp);
		Thread.sleep(2500);
		MainNavigationPages.Employee.click();
	}

}
