package com.qdms.high.testcases;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
 
import com.qdms.high.base.DriverIntialization;
import com.qdms.high.pages.MaterialSearchPage;
import com.qdms.high.pages.MaterialSearchPage;

public class MaterialMultiSearch extends DriverIntialization{
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
		
//		STEP 8 : Material - Main Category Search Button Properties
		Method.checkSearch(MaterialSearchPage.MainCatSearch,"STEP 8 : Material - Main Category");
		
		Method.checkBeforeSearchData("Material",2, MaterialSearchPage.MainCatColumn,MaterialSearchPage.MainCatColumnBefore,MaterialSearchPage.MainCatColumnAfter, "Material - Main Category");
		
//		STEP 9 : Material - Main Category Search Icon Click
		Method.ClickSearch(MaterialSearchPage.MainCatSearch, MaterialSearchPage.SearchTextBox, "STEP 9 : Material - Main Category");

//		STEP 10 : Material - Main Category Search Text Box Properties
		Method.SearchTextBox(MaterialSearchPage.SearchTextBox, "STEP 10 : Material - Main Category");
		
//		STEP 11 : Material - Main Category Search Button Properties
		Method.SearchButton(MaterialSearchPage.SearchBtn, "STEP 11 : Material - Main Category");
		
//		STEP 12 : Material - Main Category Search Data Input
		Method.inputDataSearch(MaterialSearchPage.SearchTextBox, "STEP 12 : Material - Main Category");
		
//		STEP 13 : Material - Main Category Search Button Click
		Method.SearchButtonClick(MaterialSearchPage.SearchBtn, MaterialSearchPage.ResetAll, "STEP 13 : Material - Main Category");
		
//		STEP 14 : Material - Main Category Single Search Function
		Method.checkAfterSearchData(MaterialSearchPage.MainCatColumn, MaterialSearchPage.MainCatColumnBefore, MaterialSearchPage.MainCatColumnAfter, MainCatTableData, "STEP 14 : Material - Main Category");
		
//		STEP 15 : Material - Sub Category Search Button Properties
		Method.checkSearch(MaterialSearchPage.SubCatSearch,"STEP 15 : Material - Sub Category");
		
		Method.checkBeforeSearchData("Material",3, MaterialSearchPage.SubCatColumn,MaterialSearchPage.SubCatColumnBefore,MaterialSearchPage.SubCatColumnAfter,"Material - Sub Category");
		
//		STEP 16 : Material - Sub Category Search Icon Click
		Method.ClickSearch(MaterialSearchPage.SubCatSearch, MaterialSearchPage.SearchTextBox, "STEP 16 : Material - Sub Category");

//		STEP 17 : Material - Sub Category Search Text Box Properties 
		Method.SearchTextBox(MaterialSearchPage.SearchTextBox, "STEP 17 : Material - Sub Category");
		
//		STEP 18 : Material - Sub Category Search Button Properties
		Method.SearchButton(MaterialSearchPage.SearchBtn, "STEP 18 : Material - Sub Category");
		
//		STEP 19 : Material - Sub Category Search Data Input
		Method.inputDataSearch(MaterialSearchPage.SearchTextBox, "STEP 19 : Material - Sub Category");
		
//		STEP 20 : Material - Sub Category Search Button Click
		Method.SearchButtonClick(MaterialSearchPage.SearchBtn, MaterialSearchPage.ResetAll, "STEP 20 : Material - Sub Category");
		
//		STEP 21 : Material - Sub Category Single Search Function
		Method.checkAfterSearchData(MaterialSearchPage.SubCatColumn, MaterialSearchPage.SbuColumnBefore, MaterialSearchPage.SbuColumnAfter,  SubCatTableData, "STEP 21 : Material - Sub Category");
		
//		STEP 22 : Material - Prefix Search Button Properties
		Method.checkSearch(MaterialSearchPage.PrefixSearch,"STEP 22 : Material - Prefix");
		
		Method.checkBeforeSearchData("Material",4, MaterialSearchPage.PrefixColumn,MaterialSearchPage.PrefixColumnBefore,MaterialSearchPage.PrefixColumnAfter,"Material - Prefix");
		
//		STEP 23 : Material - Prefix Search Icon Click
		Method.ClickSearch(MaterialSearchPage.PrefixSearch, MaterialSearchPage.SearchTextBox, "STEP 23 : Material - Prefix");

//		STEP 24 : Material - Prefix Search Text Box Properties
		Method.SearchTextBox(MaterialSearchPage.SearchTextBox, "STEP 24 : Material - Prefix");
		
//		STEP 25 : Material - Prefix Search Button Properties
		Method.SearchButton(MaterialSearchPage.SearchBtn, "STEP 25 : Material - Prefix");
		
//		STEP 26 : Material - Prefix Search Data Input
		Method.inputDataSearch(MaterialSearchPage.SearchTextBox, "STEP 26 : Material - Prefix");
		
//		STEP 27 : Material - Prefix Search Button Click
		Method.SearchButtonClick(MaterialSearchPage.SearchBtn, MaterialSearchPage.ResetAll, "STEP 27 : Material - Prefix");
		
//		STEP 28 : Material - Prefix Single Search Function
		Method.checkAfterSearchData(MaterialSearchPage.PrefixColumn, MaterialSearchPage.PrefixColumnBefore, MaterialSearchPage.PrefixColumnAfter, PrefixTableData, "STEP 28 : Material - Prefix");

//		STEP 29 : Material - Plant Search Button Properties
		Method.checkSearch(MaterialSearchPage.PlantSearch,"STEP 29 : Material - Plant");
		
		Method.checkBeforeSearchData("Material",5, MaterialSearchPage.PlantColumn,MaterialSearchPage.PlantColumnBefore,MaterialSearchPage.PlantColumnAfter,"Material - Plant");
		
//		STEP 30 : Material - Plant Search Icon Click
		Method.ClickSearch(MaterialSearchPage.PlantSearch, MaterialSearchPage.SearchTextBox, "STEP 30 : Material - Plant");

//		STEP 31 : Material - Plant Search Text Box Properties
		Method.SearchTextBox(MaterialSearchPage.SearchTextBox, "STEP 31 : Material - Plant");
		
//		STEP 32 : Material - Plant Search Button Properties
		Method.SearchButton(MaterialSearchPage.SearchBtn, "STEP 32 : Material - Plant");
		
//		STEP 33 : Material - Plant Search Data Input
		Method.inputDataSearch(MaterialSearchPage.SearchTextBox, "STEP 33 : Material - Plant");
		
//		STEP 34 : Material - Plant Search Button Click
		Method.SearchButtonClick(MaterialSearchPage.SearchBtn, MaterialSearchPage.ResetAll, "STEP 34 : Material - Plant");
		
//		STEP 35 : Material - Plant Single Search Function
		Method.checkAfterSearchData(MaterialSearchPage.PlantColumn, MaterialSearchPage.PlantColumnBefore, MaterialSearchPage.PlantColumnAfter,  PlantTableData, "STEP 35 : Material - Plant");
		
//		STEP 36 : Material - Material State Search Button Properties
		Method.checkSearch(MaterialSearchPage.StateSearch,"STEP 36 : Material - Material State");
		
		Method.checkBeforeSearchData("Material",6, MaterialSearchPage.StateColumn,MaterialSearchPage.StateColumnBefore,MaterialSearchPage.StateColumnAfter,"Material - Material State");
		
//		STEP 37 : Material - Material State Search Icon Click
		Method.ClickSearch(MaterialSearchPage.StateSearch, MaterialSearchPage.SearchTextBox, "STEP 37 : Material - Material State");

//		STEP 38 : Material - Material State Search Text Box Properties
		Method.SearchTextBox(MaterialSearchPage.SearchTextBox, "STEP 38 : Material - Material State");
		
//		STEP 39 : Material - Material State Search Button Properties
		Method.SearchButton(MaterialSearchPage.SearchBtn, "STEP 39 : Material - Material State");
		
//		STEP 40 : Material - Material State Search Data Input
		Method.inputDataSearch(MaterialSearchPage.SearchTextBox, "STEP 40 : Material - Material State");
		
//		STEP 41 : Material - Material State Search Button Click
		Method.SearchButtonClick(MaterialSearchPage.SearchBtn, MaterialSearchPage.ResetAll, "STEP 41 : Material - Material State");
		
//		STEP 42 : Material - Material State Single Search Function
		Method.checkAfterSearchData(MaterialSearchPage.StateColumn, MaterialSearchPage.StateColumnBefore, MaterialSearchPage.StateColumnAfter,  StateTableData, "STEP 42 : Material - Material State");
		
//		STEP 43 : Material - ERP Code Search Button Properties
		Method.checkSearch(MaterialSearchPage.ErpSearch,"STEP 43 : Material - ERP Code");
		
		Method.checkBeforeSearchData("Material",6, MaterialSearchPage.ErpColumn,MaterialSearchPage.ErpColumnBefore,MaterialSearchPage.ErpColumnAfter,"Material - ERP Code");
		
//		STEP 44 : Material - ERP Code Search Icon Click
		Method.ClickSearch(MaterialSearchPage.ErpSearch, MaterialSearchPage.SearchTextBox, "STEP 44 : Material - ERP Code");

//		STEP 45 : Material - ERP Code Search Text Box Properties
		Method.SearchTextBox(MaterialSearchPage.SearchTextBox, "STEP 45 : Material - ERP Code");
		
//		STEP 46 : Material - ERP Code Search Button Properties
		Method.SearchButton(MaterialSearchPage.SearchBtn, "STEP 46 : Material - ERP Code");
		
//		STEP 47 : Material - ERP Code Search Data Input
		Method.inputDataSearch(MaterialSearchPage.SearchTextBox, "STEP 47 : Material - ERP Code");
		
//		STEP 48 : Material - ERP Code Search Button Click
		Method.SearchButtonClick(MaterialSearchPage.SearchBtn, MaterialSearchPage.ResetAll, "STEP 48 : Material - ERP Code");
		
//		STEP 49 : Material - ERP Code Single Search Function
		Method.checkAfterSearchData(MaterialSearchPage.ErpColumn, MaterialSearchPage.ErpColumnBefore, MaterialSearchPage.ErpColumnAfter,  ErpTableData, "STEP 49 : Material - ERP Code");

//		STEP 50 : Material - SBU Search Button Properties
		Method.checkSearch(MaterialSearchPage.SbuSearch,"STEP 50 : Material - SBU");
		
		Method.checkBeforeSearchData("Material",6, MaterialSearchPage.SbuColumn,MaterialSearchPage.SbuColumnBefore,MaterialSearchPage.SbuColumnAfter,"Material - SBU");
		
//		STEP 51 : Material - SBU Search Icon Click
		Method.ClickSearch(MaterialSearchPage.SbuSearch, MaterialSearchPage.SearchTextBox, "STEP 51 : Material - SBU");

//		STEP 52 : Material - SBU Search Text Box Properties
		Method.SearchTextBox(MaterialSearchPage.SearchTextBox, "STEP 52 : Material - SBU");
		
//		STEP 53 : Material - SBU Search Button Properties
		Method.SearchButton(MaterialSearchPage.SearchBtn, "STEP 53 : Material - SBU");
		
//		STEP 54 : Material - SBU Search Data Input
		Method.inputDataSearch(MaterialSearchPage.SearchTextBox, "STEP 54 : Material - SBU");
		
//		STEP 55 : Material - SBU Search Button Click
		Method.SearchButtonClick(MaterialSearchPage.SearchBtn, MaterialSearchPage.ResetAll, "STEP 55 : Material - SBU");
		
//		STEP 56 : Material - SBU Single Search Function
		Method.checkAfterSearchData(MaterialSearchPage.SbuColumn, MaterialSearchPage.SbuColumnBefore, MaterialSearchPage.SbuColumnAfter,  SbuTableData, "STEP 56 : Material - SBU");

//		STEP 57 : Material - Source Search Button Properties
		Method.checkSearch(MaterialSearchPage.SourceSearch,"STEP 57 : Material - Source");
		
		Method.checkBeforeSearchData("Material",6, MaterialSearchPage.SourceColumn,MaterialSearchPage.SourceColumnBefore,MaterialSearchPage.SourceColumnAfter,"Material - Source");
		
//		STEP 58 : Material - Source Search Icon Click
		Method.ClickSearch(MaterialSearchPage.SourceSearch, MaterialSearchPage.SearchTextBox, "STEP 58 : Material - Source");

//		STEP 59 : Material - Source Search Text Box Properties
		Method.SearchTextBox(MaterialSearchPage.SearchTextBox, "STEP 59 : Material - Source");
		
//		STEP 60 : Material - Source Search Button Properties
		Method.SearchButton(MaterialSearchPage.SearchBtn, "STEP 60 : Material - Source");
		 
//		STEP 61 : Material - Source Search Data Input
		Method.inputDataSearch(MaterialSearchPage.SearchTextBox, "STEP 61 : Material - Source");
		
//		STEP 62 : Material - Source Search Button Click
		Method.SearchButtonClick(MaterialSearchPage.SearchBtn, MaterialSearchPage.ResetAll, "STEP 62 : Material - Source");
		
//		STEP 63 : Material - Source Single Search Function
		Method.checkAfterSearchData(MaterialSearchPage.SourceColumn, MaterialSearchPage.SourceColumnBefore, MaterialSearchPage.SourceColumnAfter,  SourceTableData, "STEP 63 : Material - Source");
		
		
//		STEP 64 : Project Multi Search (Check Correct Data Count Filter) ☑ 
		Method.MultipleSearch("STEP 43 : Material");
		
		Method.Logout();
	} 
}
