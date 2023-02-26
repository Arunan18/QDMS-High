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

import java.io.IOException;

import org.testng.annotations.Test;

import com.qdms.high.base.DriverIntialization;
import com.qdms.high.pages.PlantSearchPage;

public class Test_Script extends DriverIntialization{
	 
//	Plant Multi Search
	@Test(priority = 0)
	public void PlantMultiSearch() throws InterruptedException, IOException {
		
//		STEP 1 : Login the System
		LoginTest.Login(); 
		
//		STEP 2 : Navigate Master
		MainNavigationTest.navigateMaster();
		 
//		STEP 3 : Navigate Plant Main Module
		MainNavigationTest.navigatePlant(); 
		
//		STEP 4 : Navigate Plant Sub Module
		SubNavigationTest.navigatePlant();
		
//		STEP 5 : Take "AR" Plant Code Count Before Search
		PlantSearchTest.checkBeforeSearchData("AR");
		
//		STEP 6 : Check Plant Code Search Button Properties
		PlantSearchTest.plantCodeSearch();
		
//		STEP 7 : Click Plant Code Search Button  
		PlantSearchTest.ClickPlantCodeSearch();
		
//		STEP 8 : Check Plant Code Text Box Properties
		PlantSearchTest.plantCodeSearchTextBox();
		
//		STEP 9 : Plant Code Search Button Properties
		PlantSearchTest.plantCodeSearchButton();
		
//		STEP 10 : Input Plantcode Search Data
		PlantSearchTest.inputDataSearch();
		
//		STEP 11 : Take "RMC Ankanda Plant" Plant Count Before Search
		PlantSearchTest.checkBeforePlantSearchData("RMC Ankanda Plant");
		
//		STEP 12 : Click Plant Search Button 
		PlantSearchTest.ClickPlantSearch();
		
//		STEP 13 : Input Plant Search Data
		PlantSearchTest.inputPlantDataSearch();
		
//		STEP 14 : Take "RMC" SBU Count Before Search
		PlantSearchTest.checkBeforeSbuSearchData("RMC");
		
//		STEP 15 : Click SBU Search Button 
		PlantSearchTest.ClickSbuSearch();
		
//		STEP 16 : Input SBU Search Data
		PlantSearchTest.inputSbuDataSearch();
		
//		STEP 17 : Take "Saman" SBU Count Before Search
		PlantSearchTest.checkBeforeManagerSearchData("Saman");
		
//		STEP 18 : Click Plant Manager Search Button 
		PlantSearchTest.ClickManagerSearch();
		
//		STEP 19 : Input Plant Manager Search Data
		PlantSearchTest.inputManagerDataSearch();
		
//		STEP 20 : Take "Tokyo Supermix (Private)Limited" Address Count Before Search
		PlantSearchTest.checkBeforeAddressSearchData("Tokyo Supermix (Private)Limited, Super Mix Ready Mixed Concrete Plant, Ankanda,Kaudupelella, Matale");
		
//		STEP 21 : Click Address Search Button 
		PlantSearchTest.ClickAddressSearch();
		
//		STEP 22 : Input Address Search Data
		PlantSearchTest.inputAddressDataSearch();
		
//		STEP 23 : Take "0665708700" Mobile Number Count Before Search
		PlantSearchTest.checkBeforeContactNoSearchData("0665708700");
		
//		STEP 24 : Click Mobile Number Search Button 
		PlantSearchTest.ClickContactNoSearch();
		
//		STEP 25 : Input Mobile No Search Data
		PlantSearchTest.inputContactNoDataSearch();
		

//		Generate report Pass/Fail
		PlantSearchTest.Report();	
		Thread.sleep(1000);
	}
	
//	Employee Multi Search
	@Test(priority = 1)
	public void EmployeeMultiSearch() throws InterruptedException, IOException {
		
//		STEP 1 : Login the System
//		LoginTest.Login(); 
//		Thread.sleep(2000);
////		STEP 2 : Navigate Master
//		MainNavigationTest.navigateMaster();
		Thread.sleep(2000);
//		STEP 3 : Navigate Employee Main Module
		MainNavigationTest.navigateEmployee(); 
		Thread.sleep(2000);
//		STEP 4 : Navigate Employee Sub Module
		SubNavigationTest.navigateEmployee();
		Thread.sleep(2000);
//		STEP 5 : Take "romi" FirstName Count Before Search
		EmployeeSearchTest.checkBeforeFirstNameSearchData("romi");
		
//		STEP 6 : Check FirstName Search Button Properties
		EmployeeSearchTest.FirstnameSearch();
		
//		STEP 7 : Click Plant Code Search Button 
		EmployeeSearchTest.ClickFirstNameSearch();
		
//		STEP 8 : Check FirstName Text Box Properties
		EmployeeSearchTest.FirstnameSearchTextBox();
		
//		STEP 9 : First Name Search Button Properties
		EmployeeSearchTest.FirstnameSearch(); 
		
//		STEP 10 : Input First Name Search Data
		EmployeeSearchTest.inputFirstNameDataSearch();
		
//		STEP 11 : Take "praveent" Last Name Count Before Search
		EmployeeSearchTest.checkBeforeLastNameSearchData("praveen");
		
//		STEP 12 : Click Last Name Name Search Button 
		EmployeeSearchTest.ClickLastNameSearch();
		
//		STEP 13 : Input Last Name Search Data
		EmployeeSearchTest.inputLastNameDataSearch();
		
//		STEP 14 : Take "RMC Ankanda Plant" Plant Count Before Search
		EmployeeSearchTest.checkBeforePlantSearchData("RMC Ankanda Plant");
		
//		STEP 15 : Click Plant Search Button 
		EmployeeSearchTest.ClickPlantsSearch();
		
//		STEP 16 : Input Plant Search Data
		EmployeeSearchTest.inputPlantsDataSearch();
		
//		STEP 17 : Take "Administrator" Designation Count Before Search
		EmployeeSearchTest.checkBeforeDesignationSearchData("Administrator");
		
//		STEP 18 : Click Designation Search Button 
		EmployeeSearchTest.ClickDesignationSearch();
		
//		STEP 19 : Input Designation Search Data
		EmployeeSearchTest.inputDesignationDataSearch();
		
//		STEP 20 : Take "romipraveen8@gmail.com" Email Count Before Search
		EmployeeSearchTest.checkBeforeEmailSearchData("romipraveen8@gmail.com");
		
//		STEP 21 : Click Email Search Button 
		EmployeeSearchTest.ClickEmailSearch();
		
//		STEP 22 : Input Email Search Data
		EmployeeSearchTest.inputEmailDataSearch();
		
//		STEP 23 : Take "0665708700" Mobile Number Count Before Search
		EmployeeSearchTest.checkBeforeContactNoSearchData("0778954510");
		
//		STEP 24 : Click Mobile Number Search Button 
		EmployeeSearchTest.ClickContactNoSearch();
		
//		STEP 25 : Input Mobile No Search Data
		EmployeeSearchTest.inputContactNoDataSearch();
		

//		Generate report Pass/Fail
		EmployeeSearchTest.Report();
		
		
		
		
	}

}
