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
import com.qdms.high.pages.SbuNavigationPages;

public class SubNavigationTest extends DriverIntialization{
	static SbuNavigationPages snp = new SbuNavigationPages();
	
//	Navigate SBU
	public static void navigateSbu() throws InterruptedException {
		PageFactory.initElements(driver, snp);
		Thread.sleep(2000);
		SbuNavigationPages.Sbu.click();
	}
	
//	Navigate Plant
	public static void navigatePlant() throws InterruptedException {
		PageFactory.initElements(driver, snp);
		Thread.sleep(2000);
		SbuNavigationPages.Plant.click();
	}
	
//	Navigate Equipment
	public static void navigateEquipment() throws InterruptedException {
		PageFactory.initElements(driver, snp);
		Thread.sleep(2000);
		SbuNavigationPages.Equipment.click();
	}
	
//	Navigate PlantEquipment
	public static void navigatePlantEquipment() throws InterruptedException {
		PageFactory.initElements(driver, snp);
		Thread.sleep(2000);
		SbuNavigationPages.PlantEquipment.click();
	}
	
//	Navigate MaterialMainCategory
	public static void navigateMaterialMainCategory() throws InterruptedException {
		PageFactory.initElements(driver, snp);
		Thread.sleep(2000);
		SbuNavigationPages.MaterialMainCategory.click();
	}
	
//	Navigate MaterialSubCategory
	public static void navigateMaterialSubCategory() throws InterruptedException {
		PageFactory.initElements(driver, snp);
		Thread.sleep(2000);
		SbuNavigationPages.MaterialSubCategory.click();
	}
	
//	Navigate MaterialState
	public static void navigateMaterialState() throws InterruptedException {
		PageFactory.initElements(driver, snp);
		Thread.sleep(2000);
		SbuNavigationPages.MaterialState.click();
	}
	
//	Navigate Source
	public static void navigateSource() throws InterruptedException {
		PageFactory.initElements(driver, snp);
		Thread.sleep(2000);
		SbuNavigationPages.Source.click();
	}
	
//	Navigate Material
	public static void navigateMaterial() throws InterruptedException {
		PageFactory.initElements(driver, snp);
		Thread.sleep(2000);
		SbuNavigationPages.Material.click();
	}
	
//	Navigate Unit
	public static void navigateUnit() throws InterruptedException {
		PageFactory.initElements(driver, snp);
		Thread.sleep(2000);
		SbuNavigationPages.Unit.click();
	}
	
//	Navigate Customer
	public static void navigateCustomer() throws InterruptedException {
		PageFactory.initElements(driver, snp);
		Thread.sleep(2000);
		SbuNavigationPages.Customer.click();
	}
	
//	Navigate Project
	public static void navigateProject() throws InterruptedException {
		PageFactory.initElements(driver, snp);
		Thread.sleep(2000);
		SbuNavigationPages.Project.click();
	}
	
//	Navigate Delivery
	public static void navigateDelivery() throws InterruptedException {
		PageFactory.initElements(driver, snp);
		Thread.sleep(2000);
		SbuNavigationPages.Delivery.click();
	}
	
//	Navigate SupplierCategory
	public static void navigateSupplierCategory() throws InterruptedException {
		PageFactory.initElements(driver, snp);
		Thread.sleep(2000);
		SbuNavigationPages.SupplierCategory.click();
	}
	
	
//	Navigate Supplier
	public static void navigateSupplier() throws InterruptedException {
		PageFactory.initElements(driver, snp);
		Thread.sleep(2000);
		SbuNavigationPages.Supplier.click();
	}
	
	
//	Navigate Designation
	public static void navigateDesignation() throws InterruptedException {
		PageFactory.initElements(driver, snp);
		Thread.sleep(2000);
		SbuNavigationPages.Designation.click();
	}
	
	
//	Navigate Role
	public static void navigateRole() throws InterruptedException {
		PageFactory.initElements(driver, snp);
		Thread.sleep(2000);
		SbuNavigationPages.Role.click();
	}
	
	
//	Navigate Employee
	public static void navigateEmployee() throws InterruptedException {
		PageFactory.initElements(driver, snp);
		Thread.sleep(2000);
		SbuNavigationPages.Employee.click();
	}
	
//	Navigate User
	public static void navigateUser() throws InterruptedException {
		PageFactory.initElements(driver, snp);
		Thread.sleep(2000);
		SbuNavigationPages.User.click();
	}

}
