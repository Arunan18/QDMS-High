package com.qdms.high.testcases;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.qdms.high.base.DriverIntialization;
import com.qdms.high.pages.MaterialSearchPage;

public class MaterialSingleSearch extends DriverIntialization{
	MaterialSearchPage sp= new MaterialSearchPage();
	static boolean MaterialTableData = true;
	static boolean MainCatTableData = true;
	static boolean SubCatTableData = true; 
	static boolean PrefixTableData = true;
	static boolean PlantTableData = true; 
	static boolean StateTableData = true;
	static boolean ErpTableData = true;
	static boolean SbuTableData = true;
	static boolean SourceTableData = true;
	
	@Test
public void projectMultiSearch() throws InterruptedException, IOException {
		PageFactory.initElements(driver, sp);
		

		LoginTest.Login();  

		MainNavigationTest.navigateMaster();

		MainNavigationTest.navigateMaterial(); 

		SubNavigationTest.navigateMaterial();
		
//		STEP 1 : Material - Material Name Search Button Properties
		Method.checkSearch(MaterialSearchPage.MaterialSearch,"STEP 1 : Material - Material Name");
		
		Method.checkBeforeSearchData("Material",1, MaterialSearchPage.MaterialColumn,MaterialSearchPage.MaterialColumnBefore,MaterialSearchPage.MaterialColumnAfter,"Material - Material Name");
		
//		STEP 2 : Material - Material Name Search Icon Click
		Method.ClickSearch(MaterialSearchPage.MaterialSearch, MaterialSearchPage.SearchTextBox, "STEP 2 : Material - Material Name");

//		STEP 3 : Material - Material Name Search Text Box Properties
		Method.SearchTextBox(MaterialSearchPage.SearchTextBox, "STEP 3 : Material - Material Name");
		
//		STEP 4 : Material - Material Name Search Button Properties
		Method.SearchButton(MaterialSearchPage.SearchBtn, "STEP 4 : Material - Material Name");
		 
//		STEP 5 : Material - Material Name Search Data Input
		Method.inputDataSearch(MaterialSearchPage.SearchTextBox, "STEP 5 : Material - Material Name"); 
		
//		STEP 6 : Material - Material Name Search Button Click
		Method.SearchButtonClick(MaterialSearchPage.SearchBtn, MaterialSearchPage.ResetAll, "STEP 6 : Material - Material Name");
		
//		STEP 7 : Material - Material Name Single Search Function
		Method.checkAfterSearchData(MaterialSearchPage.MaterialColumn, MaterialSearchPage.MaterialColumnBefore, MaterialSearchPage.MaterialColumnAfter,  MaterialTableData, "STEP 7 : Material - Material Name");
		
		Method.Logout();
	}
}
