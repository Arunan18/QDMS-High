package com.qdms.high.testcases;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.qdms.high.base.DriverIntialization;
import com.qdms.high.pages.SupplierSearchPage;
import com.qdms.high.pages.SupplierSearchPage;

public class SupplierMultiSearch extends DriverIntialization{
	SupplierSearchPage sp= new SupplierSearchPage();
	static boolean SupplierTableData = true;
	static boolean PlantTableData = true;
	static boolean EmailTableData = true; 
	static boolean ContactNoTableData = true;
	static boolean AddressTableData = true; 
	static boolean SupplierCategoryTableData = true;
	
	@Test
public void supplierMultiSearch() throws InterruptedException, IOException {
		PageFactory.initElements(driver, sp);
		

		LoginTest.Login(); 

		MainNavigationTest.navigateMaster();

		MainNavigationTest.navigateSupplier(); 

		SubNavigationTest.navigateSupplier();
		
//		STEP 1 : Supplier - Supplier Name Search Button Properties
		Method.checkSearch(SupplierSearchPage.SupplierSearch,"STEP 1 : Supplier - Supplier Name");
		
		Method.checkBeforeSearchData("Supplier",1, SupplierSearchPage.SupplierColumn,SupplierSearchPage.SupplierColumnBefore,SupplierSearchPage.SupplierColumnAfter,"Supplier - Supplier Name");
		
//		STEP 2 : Supplier - Supplier Name Search Icon Click
		Method.ClickSearch(SupplierSearchPage.SupplierSearch, SupplierSearchPage.SearchTextBox, "STEP 2 : Supplier - Supplier Name");

//		STEP 3 : Supplier - Supplier Name Search Text Box Properties
		Method.SearchTextBox(SupplierSearchPage.SearchTextBox, "STEP 3 : Supplier - Supplier Name");
		
//		STEP 4 : Supplier - Supplier Name Search Button Properties
		Method.SearchButton(SupplierSearchPage.SearchBtn, "STEP 4 : Supplier - Supplier Name");
		 
//		STEP 5 : Supplier - Supplier Name Search Data Input
		Method.inputDataSearch(SupplierSearchPage.SearchTextBox, "STEP 5 : Supplier - Supplier Name"); 
		
//		STEP 6 : Supplier - Supplier Name Search Button Click
		Method.SearchButtonClick(SupplierSearchPage.SearchBtn, SupplierSearchPage.ResetAll, "STEP 6 : Supplier - Supplier Name");
		
//		STEP 7 : Supplier - Supplier Name Single Search Function
		Method.checkAfterSearchData(SupplierSearchPage.SupplierColumn, SupplierSearchPage.SupplierColumnBefore, SupplierSearchPage.SupplierColumnAfter,  SupplierTableData, "STEP 7 : Supplier - Supplier Name");
		
//		STEP 8 : Supplier - Plant Search Button Properties
		Method.checkSearch(SupplierSearchPage.PlantSearch,"STEP 8 : Supplier - Plant");
		
		Method.checkBeforeSearchData("Supplier",2, SupplierSearchPage.PlantColumn,SupplierSearchPage.PlantColumnBefore,SupplierSearchPage.PlantColumnAfter, "Supplier - Plant");
		
//		STEP 9 : Supplier - Plant Search Icon Click
		Method.ClickSearch(SupplierSearchPage.PlantSearch, SupplierSearchPage.SearchTextBox, "STEP 9 : Supplier - Plant");

//		STEP 10 : Supplier - Plant Search Text Box Properties
		Method.SearchTextBox(SupplierSearchPage.SearchTextBox, "STEP 10 : Supplier - Plant");
		
//		STEP 11 : Supplier - Plant Search Button Properties
		Method.SearchButton(SupplierSearchPage.SearchBtn, "STEP 11 : Supplier - Plant");
		
//		STEP 12 : Supplier - Plant Search Data Input
		Method.inputDataSearch(SupplierSearchPage.SearchTextBox, "STEP 12 : Supplier - Plant");
		
//		STEP 13 : Supplier - Plant Search Button Click
		Method.SearchButtonClick(SupplierSearchPage.SearchBtn, SupplierSearchPage.ResetAll, "STEP 13 : Supplier - Plant");
		
//		STEP 14 : Supplier - Plant Single Search Function
		Method.checkAfterSearchData(SupplierSearchPage.PlantColumn, SupplierSearchPage.PlantColumnBefore, SupplierSearchPage.PlantColumnAfter, PlantTableData, "STEP 14 : Supplier - Plant");
		
//		STEP 15 : Supplier - Email Search Button Properties
		Method.checkSearch(SupplierSearchPage.EmailSearch,"STEP 15 : Supplier - Email");
		
		Method.checkBeforeSearchData("Supplier",3, SupplierSearchPage.EmailColumn,SupplierSearchPage.EmailColumnBefore,SupplierSearchPage.EmailColumnAfter,"Supplier - Email");
		
//		STEP 16 : Supplier - Email Search Icon Click
		Method.ClickSearch(SupplierSearchPage.EmailSearch, SupplierSearchPage.SearchTextBox, "STEP 16 : Supplier - Email");

//		STEP 17 : Supplier - Email Search Text Box Properties 
		Method.SearchTextBox(SupplierSearchPage.SearchTextBox, "STEP 17 : Supplier - Email");
		
//		STEP 18 : Supplier - Email Search Button Properties
		Method.SearchButton(SupplierSearchPage.SearchBtn, "STEP 18 : Supplier - Email");
		
//		STEP 19 : Supplier - Email Search Data Input
		Method.inputDataSearch(SupplierSearchPage.SearchTextBox, "STEP 19 : Supplier - Email");
		
//		STEP 20 : Supplier - Email Search Button Click
		Method.SearchButtonClick(SupplierSearchPage.SearchBtn, SupplierSearchPage.ResetAll, "STEP 20 : Supplier - Email");
		
//		STEP 21 : Supplier - Email Single Search Function
		Method.checkAfterSearchData(SupplierSearchPage.EmailColumn, SupplierSearchPage.EmailColumnBefore, SupplierSearchPage.EmailColumnAfter,  EmailTableData, "STEP 21 : Supplier - Email");
		
//		STEP 22 : Supplier - Contact No Search Button Properties
		Method.checkSearch(SupplierSearchPage.ContactNoSearch,"STEP 22 : Supplier - Contact No");
		
		Method.checkBeforeSearchData("Supplier",4, SupplierSearchPage.ContactNoColumn,SupplierSearchPage.ContactNoColumnBefore,SupplierSearchPage.ContactNoColumnAfter,"Supplier - Contact No");
		
//		STEP 23 : Supplier - Contact No Search Icon Click
		Method.ClickSearch(SupplierSearchPage.ContactNoSearch, SupplierSearchPage.SearchTextBox, "STEP 23 : Supplier - Contact No");

//		STEP 24 : Supplier - Contact No Search Text Box Properties
		Method.SearchTextBox(SupplierSearchPage.SearchTextBox, "STEP 24 : Supplier - Contact No");
		
//		STEP 25 : Supplier - Contact No Search Button Properties
		Method.SearchButton(SupplierSearchPage.SearchBtn, "STEP 25 : Supplier - Contact No");
		
//		STEP 26 : Supplier - Contact No Search Data Input
		Method.inputDataSearch(SupplierSearchPage.SearchTextBox, "STEP 26 : Supplier - Contact No");
		
//		STEP 27 : Supplier - Contact No Search Button Click
		Method.SearchButtonClick(SupplierSearchPage.SearchBtn, SupplierSearchPage.ResetAll, "STEP 27 : Supplier - Contact No");
		
//		STEP 28 : Supplier - Contact No Single Search Function
		Method.checkAfterSearchData(SupplierSearchPage.ContactNoColumn, SupplierSearchPage.ContactNoColumnBefore, SupplierSearchPage.ContactNoColumnAfter, ContactNoTableData, "STEP 28 : Supplier - Contact No");

//		STEP 29 : Supplier - Address Search Button Properties
		Method.checkSearch(SupplierSearchPage.AddressSearch,"STEP 29 : Supplier - Address");
		
		Method.checkBeforeSearchData("Supplier",5, SupplierSearchPage.AddressColumn,SupplierSearchPage.AddressColumnBefore,SupplierSearchPage.AddressColumnAfter,"Supplier - Address");
		
//		STEP 30 : Supplier - Address Search Icon Click
		Method.ClickSearch(SupplierSearchPage.AddressSearch, SupplierSearchPage.SearchTextBox, "STEP 30 : Supplier - Address");

//		STEP 31 : Supplier - Address Search Text Box Properties
		Method.SearchTextBox(SupplierSearchPage.SearchTextBox, "STEP 31 : Supplier - Address");
		
//		STEP 32 : Supplier - Address Search Button Properties
		Method.SearchButton(SupplierSearchPage.SearchBtn, "STEP 32 : Supplier - Address");
		
//		STEP 33 : Supplier - Address Search Data Input
		Method.inputDataSearch(SupplierSearchPage.SearchTextBox, "STEP 33 : Supplier - Address");
		
//		STEP 34 : Supplier - Address Search Button Click
		Method.SearchButtonClick(SupplierSearchPage.SearchBtn, SupplierSearchPage.ResetAll, "STEP 34 : Supplier - Address");
		
//		STEP 35 : Supplier - Address Single Search Function
		Method.checkAfterSearchData(SupplierSearchPage.AddressColumn, SupplierSearchPage.AddressColumnBefore, SupplierSearchPage.AddressColumnAfter,  AddressTableData, "STEP 35 : Supplier - Address");
		
//		STEP 36 : Supplier - Supplier Category Search Button Properties
		Method.checkSearch(SupplierSearchPage.SupplierCategorySearch,"STEP 36 : Supplier - Supplier Category");
		
		Method.checkBeforeSearchData("Supplier",6, SupplierSearchPage.SupplierCategoryColumn,SupplierSearchPage.SupplierCategoryColumnBefore,SupplierSearchPage.SupplierCategoryColumnAfter,"Supplier - Supplier Category");
		
//		STEP 37 : Supplier - Supplier Category Search Icon Click
		Method.ClickSearch(SupplierSearchPage.SupplierCategorySearch, SupplierSearchPage.SearchTextBox, "STEP 37 : Supplier - Supplier Category");

//		STEP 38 : Supplier - Supplier Category Search Text Box Properties
		Method.SearchTextBox(SupplierSearchPage.SearchTextBox, "STEP 38 : Supplier - Supplier Category");
		
//		STEP 39 : Supplier - Supplier Category Search Button Properties
		Method.SearchButton(SupplierSearchPage.SearchBtn, "STEP 39 : Supplier - Supplier Category");
		
//		STEP 40 : Supplier - Supplier Category Search Data Input
		Method.inputDataSearch(SupplierSearchPage.SearchTextBox, "STEP 40 : Supplier - Supplier Category");
		
//		STEP 41 : Supplier - Supplier Category Search Button Click
		Method.SearchButtonClick(SupplierSearchPage.SearchBtn, SupplierSearchPage.ResetAll, "STEP 41 : Supplier - Supplier Category");
		
//		STEP 42 : Supplier - Supplier Category Single Search Function
		Method.checkAfterSearchData(SupplierSearchPage.SupplierCategoryColumn, SupplierSearchPage.SupplierCategoryColumnBefore, SupplierSearchPage.SupplierCategoryColumnAfter,  SupplierCategoryTableData, "STEP 42 : Supplier - Supplier Category");
		
		
//		STEP 29 : Supplier Multi Search (Check Correct Data Count Filter) ☑ 
		Method.MultipleSearch("STEP 43 : Supplier");
		
		Method.Logout();
	} 
 

}
