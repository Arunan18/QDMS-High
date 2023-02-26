//***********************************************************************************
//* Description
//*------------
//* Plant Multiple Search Functionality
//***********************************************************************************
//*
//* Author           : Suntharalingam Arunan
//* Date Written     : 25/02/2023
//* 
//*
//* 
//* Test Case Number       Date         Intis        Comments
//* ================       ====         =====        ========
//*                        25/02/2023   Arunan     Orginal Version
//*
//************************************************************************************
package com.qdms.high.testcases;

import java.io.IOException;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.qdms.high.base.DriverIntialization;
import com.qdms.high.pages.PlantSearchPage;

public class PlantMultiSearch extends DriverIntialization{
	PlantSearchPage psp= new PlantSearchPage();
	static boolean PlantCodeTableData = true;
	static boolean PlantTableData = true;
	static boolean SbuTableData = true; 
	static boolean ManagerTableData = true;
	static boolean AddressTableData = true;
	static boolean ContactNoTableData = true;
	
	@Test
public void plantMultiSearch() throws InterruptedException, IOException {
		PageFactory.initElements(driver, psp);
		

		LoginTest.Login(); 

		MainNavigationTest.navigateMaster();

		MainNavigationTest.navigatePlant(); 

		SubNavigationTest.navigatePlant();
		
//		STEP 1 : Plant - Plant Code Search Button Properties
		Method.checkSearch(PlantSearchPage.PlantCodeSearch,"STEP 1 : Plant - Plant Code");
		
		Method.checkBeforeSearchData("Plant",1, PlantSearchPage.PlantCodeColumn,PlantSearchPage.PlantCodeColumnBefore,PlantSearchPage.PlantCodeColumnAfter,"Plant Code");
		
//		STEP 2 : Plant - Plant Code Search Icon Click
		Method.ClickSearch(PlantSearchPage.PlantCodeSearch, PlantSearchPage.SearchTextBox, "STEP 2 : Plant - Plant Code");

//		STEP 3 : Plant - Plant Code Search Text Box Properties
		Method.SearchTextBox(PlantSearchPage.SearchTextBox, "STEP 3 : Plant - Plant Code");
		
//		STEP 4 : Plant - Plant Code Search Button Properties
		Method.SearchButton(PlantSearchPage.SearchBtn, "STEP 4 : Plant - Plant Code");
		 
//		STEP 5 : Plant - Plant Code Search Data Input
		Method.inputDataSearch(PlantSearchPage.SearchTextBox, "STEP 5 : Plant - Plant Code"); 
		
//		STEP 6 : Plant - Plant Code Search Button Click
		Method.SearchButtonClick(PlantSearchPage.SearchBtn, PlantSearchPage.ResetAll, "STEP 6 : Plant - Plant Code");
		
//		STEP 7 : Plant - Plant Code Single Search Function
		Method.checkAfterSearchData(PlantSearchPage.PlantCodeColumn, PlantSearchPage.PlantCodeColumnBefore, PlantSearchPage.PlantCodeColumnAfter,  PlantCodeTableData, "STEP 7 : Plant - Plant Code");
		
//		STEP 8 : Plant - Plant Search Button Properties
		Method.checkSearch(PlantSearchPage.PlantNameSearch,"STEP 8 : Plant - Plant");
		
		Method.checkBeforeSearchData("Plant",2, PlantSearchPage.PlantColumn,PlantSearchPage.PlantColumnBefore,PlantSearchPage.PlantColumnAfter, "Plant - Plant");
		
//		STEP 9 : Plant - Plant Search Icon Click
		Method.ClickSearch(PlantSearchPage.PlantNameSearch, PlantSearchPage.SearchTextBox, "STEP 9 : Plant - Plant");

//		STEP 10 : Plant - Plant Search Text Box Properties
		Method.SearchTextBox(PlantSearchPage.SearchTextBox, "STEP 10 : Plant - Plant");
		
//		STEP 11 : Plant - Plant Search Button Properties
		Method.SearchButton(PlantSearchPage.SearchBtn, "STEP 11 : Plant - Plant");
		
//		STEP 12 : Plant - Plant Search Data Input
		Method.inputDataSearch(PlantSearchPage.SearchTextBox, "STEP 12 : Plant - Plant");
		
//		STEP 13 : Plant - Plant Search Button Click
		Method.SearchButtonClick(PlantSearchPage.SearchBtn, PlantSearchPage.ResetAll, "STEP 13 : Plant - Plant");
		
//		STEP 14 : Plant - Plant Single Search Function
		Method.checkAfterSearchData(PlantSearchPage.PlantColumn, PlantSearchPage.PlantColumnBefore, PlantSearchPage.PlantColumnAfter, PlantTableData, "STEP 14 : Plant - Plant");
		
//		STEP 15 : Plant - Sub Business Unit Search Button Properties
		Method.checkSearch(PlantSearchPage.SbuSearch,"STEP 15 : Plant - Sub Business Unit");
		
		Method.checkBeforeSearchData("Plant",3, PlantSearchPage.SbuColumn,PlantSearchPage.SbuColumnBefore,PlantSearchPage.SbuColumnAfter,"Plant - Sub Business Unit");
		
//		STEP 16 : Plant - Sub Business Unit Search Icon Click
		Method.ClickSearch(PlantSearchPage.SbuSearch, PlantSearchPage.SearchTextBox, "STEP 16 : Plant - Sub Business Unit");

//		STEP 17 : Plant - Sub Business Unit Search Text Box Properties 
		Method.SearchTextBox(PlantSearchPage.SearchTextBox, "STEP 17 : Plant - Sub Business Unit");
		
//		STEP 18 : Plant - Sub Business Unit Search Button Properties
		Method.SearchButton(PlantSearchPage.SearchBtn, "STEP 18 : Plant - Sub Business Unit");
		
//		STEP 19 : Plant - Sub Business Unit Search Data Input
		Method.inputDataSearch(PlantSearchPage.SearchTextBox, "STEP 19 : Plant - Sub Business Unit");
		
//		STEP 20 : Plant - Sub Business Unit Search Button Click
		Method.SearchButtonClick(PlantSearchPage.SearchBtn, PlantSearchPage.ResetAll, "STEP 20 : Plant - Sub Business Unit");
		
//		STEP 21 : Sub Business Unit Single Search Function
		Method.checkAfterSearchData(PlantSearchPage.SbuColumn, PlantSearchPage.SbuColumnBefore, PlantSearchPage.SbuColumnAfter,  SbuTableData, "STEP 21 : Plant - Sub Business Unit");
		
//		STEP 22 : Plant - Plant Manager Search Button Properties
		Method.checkSearch(PlantSearchPage.PlantManagerSearch,"STEP 22 : Plant - Plant Manager");
		
		Method.checkBeforeSearchData("Plant",4, PlantSearchPage.managerColumn,PlantSearchPage.managerColumnBefore,PlantSearchPage.managerColumnAfter,"Plant - Plant Manager");
		
//		STEP 23 : Plant - Plant Manager Search Icon Click
		Method.ClickSearch(PlantSearchPage.PlantManagerSearch, PlantSearchPage.SearchTextBox, "STEP 23 : Plant - Plant Manager");

//		STEP 24 : Plant - Plant Manager Search Text Box Properties
		Method.SearchTextBox(PlantSearchPage.SearchTextBox, "STEP 24 : Plant - Plant Manager");
		
//		STEP 25 : Plant - Plant Manager Search Button Properties
		Method.SearchButton(PlantSearchPage.SearchBtn, "STEP 25 : Plant - Plant Manager");
		
//		STEP 26 : Plant - Plant Manager Search Data Input
		Method.inputDataSearch(PlantSearchPage.SearchTextBox, "STEP 26 : Plant - Plant Manager");
		
//		STEP 27 : Plant - Plant Manager Search Button Click
		Method.SearchButtonClick(PlantSearchPage.SearchBtn, PlantSearchPage.ResetAll, "STEP 27 : Plant - Plant Manager");
		
//		STEP 28 : Plant - Plant Manager Single Search Function
		Method.checkAfterSearchData(PlantSearchPage.managerColumn, PlantSearchPage.managerColumnBefore, PlantSearchPage.managerColumnAfter,  ManagerTableData, "STEP 28 : Plant - Plant Manager");
		
//		STEP 29 : Plant - Address Search Button Properties
		Method.checkSearch(PlantSearchPage.AddressSearch,"STEP 29 : Plant - Address");
		
		Method.checkBeforeSearchData("Plant",5, PlantSearchPage.AddressColumn,PlantSearchPage.addressColumnBefore,PlantSearchPage.addressColumnAfter,"Plant - Address");
		
//		STEP 30 : Plant - Address Search Icon Click
		Method.ClickSearch(PlantSearchPage.AddressSearch, PlantSearchPage.SearchTextBox, "STEP 30 : Plant - Address");

//		STEP 31 : Plant - Address Search Text Box Properties
		Method.SearchTextBox(PlantSearchPage.SearchTextBox, "STEP 31 : Plant - Address");
		
//		STEP 32 : Plant - Address Search Button Properties
		Method.SearchButton(PlantSearchPage.SearchBtn, "STEP 32 : Plant - Address");
		
//		STEP 33 : Plant - Plant Search Data Input
		Method.inputDataSearch(PlantSearchPage.SearchTextBox, "STEP 33 : Plant - Address");
		
//		STEP 34 : Plant - Plant Search Button Click
		Method.SearchButtonClick(PlantSearchPage.SearchBtn, PlantSearchPage.ResetAll, "STEP 34 : Plant - Address");
		
//		STEP 35 : Plant - Plant Single Search Function
		Method.checkAfterSearchData(PlantSearchPage.AddressColumn, PlantSearchPage.addressColumnBefore, PlantSearchPage.addressColumnAfter,  AddressTableData, "STEP 35 : Plant - Address");
		
//		STEP 36 : Plant - Contact No Search Button Properties
		Method.checkSearch(PlantSearchPage.ContactNoSearch,"STEP 36 : Plant - Contact No");
		
		Method.checkBeforeSearchData("Plant",6, PlantSearchPage.MobileColumn,PlantSearchPage.mobileColumnBefore,PlantSearchPage.mobileColumnAfter,"Plant - Contact No");
		
//		STEP 37 : Plant - Contact No Search Icon Click
		Method.ClickSearch(PlantSearchPage.ContactNoSearch, PlantSearchPage.SearchTextBox, "STEP 37 : Plant - Contact No");

//		STEP 38 : Plant - Contact No Search Text Box Properties
		Method.SearchTextBox(PlantSearchPage.SearchTextBox, "STEP 38 : Plant - Contact No");
		
//		STEP 39 : Plant - Contact No Search Button Properties
		Method.SearchButton(PlantSearchPage.SearchBtn, "STEP 39 : Plant - Contact No");
		
//		STEP 40 : Plant - Contact No Search Data Input
		Method.inputDataSearch(PlantSearchPage.SearchTextBox, "STEP 40 : Plant - Contact No");
		
//		STEP 41 : Plant - Contact No Search Button Click
		Method.SearchButtonClick(PlantSearchPage.SearchBtn, PlantSearchPage.ResetAll, "STEP 41 : Plant - Contact No");
		
//		STEP 42 : Plant - Contact No Single Search Function
		Method.checkAfterSearchData(PlantSearchPage.MobileColumn, PlantSearchPage.mobileColumnBefore, PlantSearchPage.mobileColumnAfter,  ContactNoTableData, "STEP 42 : Plant - Contact No");
		
//		STEP 43 : Plant Multi Search (Check Correct Data Count Filter) ☑ 
		Method.MultipleSearch("STEP 43 : Plant");
		
		Method.Logout();
	}

}