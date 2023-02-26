package com.qdms.high.testcases;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.qdms.high.base.DriverIntialization;
import com.qdms.high.pages.CustomerSearchPage;

public class CustomerMultiSearch extends DriverIntialization{
	CustomerSearchPage cp= new CustomerSearchPage();
	static boolean CustomerTableData = true;
	static boolean PlantTableData = true;
	static boolean EmailTableData = true; 
	static boolean ContactNoTableData = true;
	
	@Test
public void customerMultiSearch() throws InterruptedException, IOException {
		PageFactory.initElements(driver, cp);
		

		LoginTest.Login(); 
 
		MainNavigationTest.navigateMaster();

		MainNavigationTest.navigateCustomer(); 

		SubNavigationTest.navigateCustomer();
		
//		STEP 1 : Customer - Customer Name Search Button Properties
		Method.checkSearch(CustomerSearchPage.CustomerSearch,"STEP 1 : Customer - Customer Name");
		
		Method.checkBeforeSearchData("Customer",1, CustomerSearchPage.CustomerColumn,CustomerSearchPage.CustomerColumnBefore,CustomerSearchPage.CustomerColumnAfter,"Customer - Customer Name");
		
//		STEP 2 : Customer - Customer Name Search Icon Click
		Method.ClickSearch(CustomerSearchPage.CustomerSearch, CustomerSearchPage.SearchTextBox, "STEP 2 : Customer - Customer Name");

//		STEP 3 : Customer - Customer Name Search Text Box Properties
		Method.SearchTextBox(CustomerSearchPage.SearchTextBox, "STEP 3 : Customer - Customer Name");
		
//		STEP 4 : Customer - Customer Name Search Button Properties
		Method.SearchButton(CustomerSearchPage.SearchBtn, "STEP 4 : Customer - Customer Name");
		 
//		STEP 5 : Customer - Customer Name Search Data Input
		Method.inputDataSearch(CustomerSearchPage.SearchTextBox, "STEP 5 : Customer - Customer Name"); 
		
//		STEP 6 : Customer - Customer Name Search Button Click
		Method.SearchButtonClick(CustomerSearchPage.SearchBtn, CustomerSearchPage.ResetAll, "STEP 6 : Customer - Customer Name");
		
//		STEP 7 : Customer - Customer Name Single Search Function
		Method.checkAfterSearchData(CustomerSearchPage.CustomerColumn, CustomerSearchPage.CustomerColumnBefore, CustomerSearchPage.CustomerColumnAfter,  CustomerTableData, "STEP 7 : Customer - Customer Name");
		
//		STEP 8 : Customer - Plant Search Button Properties
		Method.checkSearch(CustomerSearchPage.PlantSearch,"STEP 8 : Customer - Plant");
		
		Method.checkBeforeSearchData("Customer",2, CustomerSearchPage.PlantColumn,CustomerSearchPage.PlantColumnBefore,CustomerSearchPage.PlantColumnAfter, "Customer - Plant");
		
//		STEP 9 : Customer - Plant Search Icon Click
		Method.ClickSearch(CustomerSearchPage.PlantSearch, CustomerSearchPage.SearchTextBox, "STEP 9 : Customer - Plant");

//		STEP 10 : Customer - Plant Search Text Box Properties
		Method.SearchTextBox(CustomerSearchPage.SearchTextBox, "STEP 10 : Customer - Plant");
		
//		STEP 11 : Customer - Plant Search Button Properties
		Method.SearchButton(CustomerSearchPage.SearchBtn, "STEP 11 : Customer - Plant");
		
//		STEP 12 : Customer - Plant Search Data Input
		Method.inputDataSearch(CustomerSearchPage.SearchTextBox, "STEP 12 : Customer - Plant");
		
//		STEP 13 : Customer - Plant Search Button Click
		Method.SearchButtonClick(CustomerSearchPage.SearchBtn, CustomerSearchPage.ResetAll, "STEP 13 : Customer - Plant");
		
//		STEP 14 : Customer - Plant Single Search Function
		Method.checkAfterSearchData(CustomerSearchPage.PlantColumn, CustomerSearchPage.PlantColumnBefore, CustomerSearchPage.PlantColumnAfter, PlantTableData, "STEP 14 : Customer - Plant");
		
//		STEP 15 : Customer - Email Search Button Properties
		Method.checkSearch(CustomerSearchPage.EmailSearch,"STEP 15 : Customer - Email");
		
		Method.checkBeforeSearchData("Customer",3, CustomerSearchPage.EmailColumn,CustomerSearchPage.EmailColumnBefore,CustomerSearchPage.EmailColumnAfter,"Customer - Email");
		
//		STEP 16 : Customer - Email Search Icon Click
		Method.ClickSearch(CustomerSearchPage.EmailSearch, CustomerSearchPage.SearchTextBox, "STEP 16 : Customer - Email");

//		STEP 17 : Customer - Email Search Text Box Properties 
		Method.SearchTextBox(CustomerSearchPage.SearchTextBox, "STEP 17 : Customer - Email");
		
//		STEP 18 : Customer - Email Search Button Properties
		Method.SearchButton(CustomerSearchPage.SearchBtn, "STEP 18 : Customer - Email");
		
//		STEP 19 : Customer - Email Search Data Input
		Method.inputDataSearch(CustomerSearchPage.SearchTextBox, "STEP 19 : Customer - Email");
		
//		STEP 20 : Customer - Email Search Button Click
		Method.SearchButtonClick(CustomerSearchPage.SearchBtn, CustomerSearchPage.ResetAll, "STEP 20 : Customer - Email");
		
//		STEP 21 : Customer - Email Single Search Function
		Method.checkAfterSearchData(CustomerSearchPage.EmailColumn, CustomerSearchPage.EmailColumnBefore, CustomerSearchPage.EmailColumnAfter,  EmailTableData, "STEP 21 : Customer - Email");
		
//		STEP 22 : Customer - Contact No Search Button Properties
		Method.checkSearch(CustomerSearchPage.ContactNoSearch,"STEP 22 : Customer - Contact No");
		
		Method.checkBeforeSearchData("Customer",4, CustomerSearchPage.ContactNoColumn,CustomerSearchPage.ContactNoColumnBefore,CustomerSearchPage.ContactNoColumnAfter,"Customer - Contact No");
		
//		STEP 23 : Customer - Contact No Search Icon Click
		Method.ClickSearch(CustomerSearchPage.ContactNoSearch, CustomerSearchPage.SearchTextBox, "STEP 23 : Customer - Contact No");

//		STEP 24 : Customer - Contact No Search Text Box Properties
		Method.SearchTextBox(CustomerSearchPage.SearchTextBox, "STEP 24 : Customer - Contact No");
		
//		STEP 25 : Customer - Contact No Search Button Properties
		Method.SearchButton(CustomerSearchPage.SearchBtn, "STEP 25 : Customer - Contact No");
		
//		STEP 26 : Customer - Contact No Search Data Input
		Method.inputDataSearch(CustomerSearchPage.SearchTextBox, "STEP 26 : Customer - Contact No");
		
//		STEP 27 : Customer - Contact No Search Button Click
		Method.SearchButtonClick(CustomerSearchPage.SearchBtn, CustomerSearchPage.ResetAll, "STEP 27 : Customer - Contact No");
		
//		STEP 28 : Customer - Contact No Single Search Function
		Method.checkAfterSearchData(CustomerSearchPage.ContactNoColumn, CustomerSearchPage.ContactNoColumnBefore, CustomerSearchPage.ContactNoColumnAfter, ContactNoTableData, "STEP 28 : Customer - Contact No");
		
//		STEP 29 : Customer Multi Search (Check Correct Data Count Filter) ☑ 
		Method.MultipleSearch("STEP 29 : Customer");
		
//		Method.Logout();
	}

}
