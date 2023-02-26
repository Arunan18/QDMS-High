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
package com.qdms.high.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.qdms.high.base.DriverIntialization;
import com.qdms.high.pages.PlantSearchPage;

public class MaterialScript extends DriverIntialization{
	@Test
	public void PlantCodeSingleSearch() throws InterruptedException, IOException {
		
//		STEP 1 : Login the System
		LoginTest.Login(); 
		
//		STEP 2 : Navigate Master
		MainNavigationTest.navigateMaster();
		
//		STEP 3 : Navigate Material Main Module
		MainNavigationTest.navigateMaterial(); 
		
//		STEP 4 : Navigate Material Sub Module
		SubNavigationTest.navigateMaterial();

//		STEP 5 : Take "romi" MaterialName Count Before Search 
		MaterialSearchTest.checkBeforeMaterialSearchData("River Sand");
		
//		STEP 6 : Check Material Search Button Properties
		MaterialSearchTest.MaterialSearch();
		
//		STEP 7 : Click Plant Code Search Button 
		MaterialSearchTest.ClickMaterialSearch();
		
//		STEP 8 : Check Material Text Box Properties
		MaterialSearchTest.MaterialSearchTextBox();
		
//		STEP 9 : Material Search Button Properties
		MaterialSearchTest.MaterialSearch(); 
		
//		STEP 10 : Input Material Search Data
		MaterialSearchTest.inputMaterialDataSearch();
		
//		STEP 11 : Take "Aggregates" MainCat Count Before Search
		MaterialSearchTest.checkBeforeMainCatSearchData("Aggregates");
		
//		STEP 12 : Click Main cat Search Button 
		MaterialSearchTest.ClickMainCatSearch();
		
//		STEP 13 : Input Main Search Data
		MaterialSearchTest.inputMainCatDataSearch();
		
//		STEP 14 : Take "Fine Aggregates" Sub castegory Count Before Search
		MaterialSearchTest.checkBeforeSubCatSearchData("Fine Aggregates");
		
//		STEP 15 : Click Sub Category Search Button 
		MaterialSearchTest.ClickSubCatSearch();
		
//		STEP 16 : Input Sub category Search Data
		MaterialSearchTest.inputSubCatDataSearch();
		
//		STEP 17 : Take "Administrator" Prefix Count Before Search
		MaterialSearchTest.checkBeforePrefixSearchData("RS");
		
//		STEP 18 : Click Prefix Search Button 
		MaterialSearchTest.ClickPrefixSearch();
		
//		STEP 19 : Input Prefix Search Data
		MaterialSearchTest.inputPrefixDataSearch();
		
//		STEP 20 : Take  Plant Count Before Search
		MaterialSearchTest.checkBeforePlantSearchData("");
		
//		STEP 21 : Click Plant Search Button 
		MaterialSearchTest.ClickPlantSearch();
		
//		STEP 22 : Input Plant Search Data
		MaterialSearchTest.inputPlantDataSearch();
		
//		STEP 23 : Take "0665708700" State Count Before Search
		MaterialSearchTest.checkBeforeStateSearchData("Solid");
		
//		STEP 24 : Click State Search Button 
		MaterialSearchTest.ClickStateSearch();
		
//		STEP 25 : Input State Search Data
		MaterialSearchTest.inputStateDataSearch();
		

//		Generate report Pass/Fail
		MaterialSearchTest.Report();
		
	
		
		
		
	}		
}
