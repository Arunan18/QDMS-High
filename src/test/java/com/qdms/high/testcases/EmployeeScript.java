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

public class EmployeeScript extends DriverIntialization{
	
		 
		
		@Test
		public void PlantCodeSingleSearch() throws InterruptedException, IOException {
			
//			STEP 1 : Login the System
			LoginTest.Login(); 
			Thread.sleep(2000);
//			STEP 2 : Navigate Master
			MainNavigationTest.navigateMaster();
			Thread.sleep(2000);
//			STEP 3 : Navigate Employee Main Module
			MainNavigationTest.navigateEmployee(); 
			Thread.sleep(2000);
//			STEP 4 : Navigate Employee Sub Module
			SubNavigationTest.navigateEmployee();
			Thread.sleep(2000);
//			STEP 5 : Take "romi" FirstName Count Before Search
			EmployeeSearchTest.checkBeforeFirstNameSearchData("romi");
			
//			STEP 6 : Check FirstName Search Button Properties
			EmployeeSearchTest.FirstnameSearch();
			
//			STEP 7 : Click Plant Code Search Button 
			EmployeeSearchTest.ClickFirstNameSearch();
			
//			STEP 8 : Check FirstName Text Box Properties
			EmployeeSearchTest.FirstnameSearchTextBox();
			
//			STEP 9 : First Name Search Button Properties
			EmployeeSearchTest.FirstnameSearch(); 
			
//			STEP 10 : Input First Name Search Data
			EmployeeSearchTest.inputFirstNameDataSearch();
			
//			STEP 11 : Take "praveent" Last Name Count Before Search
			EmployeeSearchTest.checkBeforeLastNameSearchData("praveen");
			
//			STEP 12 : Click Last Name Name Search Button 
			EmployeeSearchTest.ClickLastNameSearch();
			
//			STEP 13 : Input Last Name Search Data
			EmployeeSearchTest.inputLastNameDataSearch();
			
//			STEP 14 : Take "RMC Ankanda Plant" Plant Count Before Search
			EmployeeSearchTest.checkBeforePlantSearchData("RMC Ankanda Plant");
			
//			STEP 15 : Click Plant Search Button 
			EmployeeSearchTest.ClickPlantsSearch();
			
//			STEP 16 : Input Plant Search Data
			EmployeeSearchTest.inputPlantsDataSearch();
			
//			STEP 17 : Take "Administrator" Designation Count Before Search
			EmployeeSearchTest.checkBeforeDesignationSearchData("Administrator");
			
//			STEP 18 : Click Designation Search Button 
			EmployeeSearchTest.ClickDesignationSearch();
			
//			STEP 19 : Input Designation Search Data
			EmployeeSearchTest.inputDesignationDataSearch();
			
//			STEP 20 : Take "romipraveen8@gmail.com" Email Count Before Search
			EmployeeSearchTest.checkBeforeEmailSearchData("romipraveen8@gmail.com");
			
//			STEP 21 : Click Email Search Button 
			EmployeeSearchTest.ClickEmailSearch();
			
//			STEP 22 : Input Email Search Data
			EmployeeSearchTest.inputEmailDataSearch();
			
//			STEP 23 : Take "0665708700" Mobile Number Count Before Search
			EmployeeSearchTest.checkBeforeContactNoSearchData("0778954510");
			
//			STEP 24 : Click Mobile Number Search Button 
			EmployeeSearchTest.ClickContactNoSearch();
			
//			STEP 25 : Input Mobile No Search Data
			EmployeeSearchTest.inputContactNoDataSearch();
			

//			Generate report Pass/Fail
			EmployeeSearchTest.Report();
			
			
			
			
		}

	}

