package com.qdms.high.testcases;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.qdms.high.base.DriverIntialization;
import com.qdms.high.pages.EmployeeSearchPage;
import com.qdms.high.pages.EmployeeSearchPage;

public class EmployeeMultiSearch extends DriverIntialization {
	EmployeeSearchPage emp = new EmployeeSearchPage();
	static boolean FirstNameTableData = true;
	static boolean LastNameTableData = true;
	static boolean PlantTableData = true;
	static boolean DesignationTableData = true;
	static boolean EmailTableData = true;
	static boolean ContactNoTableData = true;


	@Test
	public void employeeMultiearch() throws InterruptedException, IOException {
		PageFactory.initElements(driver, emp);

		LoginTest.Login();
		 
		MainNavigationTest.navigateMaster();
 
		MainNavigationTest.navigateEmployee();
		  
		SubNavigationTest.navigateEmployee();
		
//		STEP 1 : Employee - First Name Search Button Properties
		Method.checkSearch(EmployeeSearchPage.FirstNameSearch, "STEP 1 : Employee - First Name");
		 
		Method.checkBeforeSearchData("Employee", 1, EmployeeSearchPage.FirstNameColumn, EmployeeSearchPage.FirstNameColumnBefore,
				EmployeeSearchPage.FirstNameColumnAfter, "Employee - First Name");
		
//		STEP 2 : Employee - First Name Search Icon Click
		Method.ClickSearch(EmployeeSearchPage.FirstNameSearch, EmployeeSearchPage.SearchTextBox, "STEP 2 : Employee - First Name");

//		STEP 3 : Employee - First Name Search Text Box Properties
		Method.SearchTextBox(EmployeeSearchPage.SearchTextBox, "STEP 3 : Employee - First Name");

//		STEP 4 : Employee - First Name Search Button Properties
		Method.SearchButton(EmployeeSearchPage.SearchBtn, "STEP 4 : Employee - First Name");

//		STEP 5 : Employee - First Name Search Data Input
		Method.inputDataSearch(EmployeeSearchPage.SearchTextBox, "STEP 5 : Employee - First Name");

//		STEP 6 : Employee - First Name Search Button Click
		Method.SearchButtonClick(EmployeeSearchPage.SearchBtn, EmployeeSearchPage.ResetAll, "STEP 6 : Employee - First Name");

//		STEP 7 : Employee - First Name Single Search Function
		Method.checkAfterSearchData(EmployeeSearchPage.FirstNameColumn, EmployeeSearchPage.FirstNameColumnBefore,
				EmployeeSearchPage.FirstNameColumnAfter, FirstNameTableData, "STEP 7 : Employee - First Name");

//		STEP 8 : Employee - Last Name Search Button Properties
		Method.checkSearch(EmployeeSearchPage.LastNameSearch, "STEP 8 : Employee - Last Name");

		Method.checkBeforeSearchData("Employee", 2, EmployeeSearchPage.LastNameColumn, EmployeeSearchPage.LastNameColumnBefore,
				EmployeeSearchPage.LastNameColumnAfter, "Employee - Last Name");

//		STEP 9 : Employee - Last Name Search Icon Click
		Method.ClickSearch(EmployeeSearchPage.LastNameSearch, EmployeeSearchPage.SearchTextBox, "STEP 9 : Employee - Last Name");

//		STEP 10 : Employee - Last Name Search Text Box Properties
		Method.SearchTextBox(EmployeeSearchPage.SearchTextBox, "STEP 10 : Employee - Last Name");

//		STEP 11 : Employee - Last Name Search Button Properties
		Method.SearchButton(EmployeeSearchPage.SearchBtn, "STEP 11 : Employee - Last Name");

//		STEP 12 : Employee - Last Name Search Data Input
		Method.inputDataSearch(EmployeeSearchPage.SearchTextBox, "STEP 12 : Employee - Last Name");

//		STEP 13 : Employee - Last Name Search Button Click
		Method.SearchButtonClick(EmployeeSearchPage.SearchBtn, EmployeeSearchPage.ResetAll, "STEP 13 : Employee - Last Name");

//		STEP 14 : Employee - Last Name Single Search Function
		Method.checkAfterSearchData(EmployeeSearchPage.LastNameColumn, EmployeeSearchPage.LastNameColumnBefore,
				EmployeeSearchPage.LastNameColumnAfter, LastNameTableData, "STEP 14 : Employee - Last Name");

//		STEP 15 : Employee - Plant Search Button Properties
		Method.checkSearch(EmployeeSearchPage.PlantSearch, "STEP 15 : Employee - Plant");

		Method.checkBeforeSearchData("Employee", 3, EmployeeSearchPage.PlantColumn, EmployeeSearchPage.PlantColumnBefore,
				EmployeeSearchPage.PlantColumnAfter, "Employee - Plant");

//		STEP 16 : Employee - Plant Search Icon Click
		Method.ClickSearch(EmployeeSearchPage.PlantSearch, EmployeeSearchPage.SearchTextBox, "STEP 16 : Employee - Plant");

//		STEP 17 : Employee - Plant Search Text Box Properties 
		Method.SearchTextBox(EmployeeSearchPage.SearchTextBox, "STEP 17 : Employee - Plant");

//		STEP 18 : Employee - Plant Search Button Properties
		Method.SearchButton(EmployeeSearchPage.SearchBtn, "STEP 18 : Employee - Plant");

//		STEP 19 : Employee - Plant Search Data Input
		Method.inputDataSearch(EmployeeSearchPage.SearchTextBox, "STEP 19 : Employee - Plant");

//		STEP 20 : Employee - Plant Search Button Click
		Method.SearchButtonClick(EmployeeSearchPage.SearchBtn, EmployeeSearchPage.ResetAll, "STEP 20 : Employee - Plant");

//		STEP 21 : Employee - Plant Single Search Function
		Method.checkAfterSearchData(EmployeeSearchPage.PlantColumn, EmployeeSearchPage.PlantColumnBefore,
				EmployeeSearchPage.PlantColumnAfter, PlantTableData, "STEP 21 : Employee - Plant");

//		STEP 22 : Employee - Designation Search Button Properties
		Method.checkSearch(EmployeeSearchPage.DesignationSearch, "STEP 22 : Employee - Designation");

		Method.checkBeforeSearchData("Employee", 4, EmployeeSearchPage.DesignationColumn, EmployeeSearchPage.DesignationColumnBefore,
				EmployeeSearchPage.DesignationColumnAfter, "Employee - Designation");

//		STEP 23 : Employee - Designation Search Icon Click
		Method.ClickSearch(EmployeeSearchPage.DesignationSearch, EmployeeSearchPage.SearchTextBox,
				"STEP 23 : Employee - Designation");

//		STEP 24 : Employee - Designation Search Text Box Properties
		Method.SearchTextBox(EmployeeSearchPage.SearchTextBox, "STEP 24 : Employee - Designation");

//		STEP 25 : Employee - Designation Search Button Properties
		Method.SearchButton(EmployeeSearchPage.SearchBtn, "STEP 25 : Employee - Designation");

//		STEP 26 : Employee - Designation Search Data Input
		Method.inputDataSearch(EmployeeSearchPage.SearchTextBox, "STEP 26 : Employee - Designation");

//		STEP 27 : Employee - Designation Search Button Click
		Method.SearchButtonClick(EmployeeSearchPage.SearchBtn, EmployeeSearchPage.ResetAll, "STEP 27 : Employee - Designation");

//		STEP 28 : Employee - Designation Single Search Function
		Method.checkAfterSearchData(EmployeeSearchPage.DesignationColumn, EmployeeSearchPage.DesignationColumnBefore,
				EmployeeSearchPage.DesignationColumnAfter, DesignationTableData, "STEP 28 : Employee - Designation");

//		STEP 29 : Employee - Email Search Button Properties
		Method.checkSearch(EmployeeSearchPage.EmailSearch, "STEP 29 : Employee - Email");

		Method.checkBeforeSearchData("Employee", 5, EmployeeSearchPage.EmailColumn, EmployeeSearchPage.EmailColumnBefore,
				EmployeeSearchPage.EmailColumnAfter, "Employee - Email");

//		STEP 30 : Employee - Email Search Icon Click
		Method.ClickSearch(EmployeeSearchPage.EmailSearch, EmployeeSearchPage.SearchTextBox, "STEP 30 : Employee - Email");

//		STEP 31 : Employee - Email Search Text Box Properties
		Method.SearchTextBox(EmployeeSearchPage.SearchTextBox, "STEP 31 : Employee - Email");

//		STEP 32 : Employee - Email Search Button Properties
		Method.SearchButton(EmployeeSearchPage.SearchBtn, "STEP 32 : Employee - Email");

//		STEP 33 : Employee - Email Search Data Input
		Method.inputDataSearch(EmployeeSearchPage.SearchTextBox, "STEP 33 : Employee - Email");

//		STEP 34 : Employee - Email Search Button Click
		Method.SearchButtonClick(EmployeeSearchPage.SearchBtn, EmployeeSearchPage.ResetAll, "STEP 34 : Employee - Email");

//		STEP 35 : Employee - Email Single Search Function
		Method.checkAfterSearchData(EmployeeSearchPage.EmailColumn, EmployeeSearchPage.EmailColumnBefore,
				EmployeeSearchPage.EmailColumnAfter, EmailTableData, "STEP 35 : Employee - Email");

//		STEP 36 : Contact No Search Button Properties
		Method.checkSearch(EmployeeSearchPage.ContactNoSearch, "STEP 36 : Contact No");

		Method.checkBeforeSearchData("Employee", 6, EmployeeSearchPage.ContactNoColumn, EmployeeSearchPage.ContactNoColumnBefore,
				EmployeeSearchPage.ContactNoColumnAfter, "Contact No");

//		STEP 37 : Employee - Contact No Search Icon Click
		Method.ClickSearch(EmployeeSearchPage.ContactNoSearch, EmployeeSearchPage.SearchTextBox, "STEP 37 : Employee - Contact No");

//		STEP 38 : Employee - Contact No Search Text Box Properties
		Method.SearchTextBox(EmployeeSearchPage.SearchTextBox, "STEP 38 : Employee - Contact No");

//		STEP 39 : Employee - Contact No Search Button Properties
		Method.SearchButton(EmployeeSearchPage.SearchBtn, "STEP 39 : Employee - Contact No");

//		STEP 40 : Employee - Contact No Search Data Input
		Method.inputDataSearch(EmployeeSearchPage.SearchTextBox, "STEP 40 : Employee - Contact No");

//		STEP 41 : Employee - Contact No Search Button Click
		Method.SearchButtonClick(EmployeeSearchPage.SearchBtn, EmployeeSearchPage.ResetAll, "STEP 41 : Employee - Contact No");

//		STEP 42 : Employee - Contact No Single Search Function
		Method.checkAfterSearchData(EmployeeSearchPage.ContactNoColumn, EmployeeSearchPage.ContactNoColumnBefore,
				EmployeeSearchPage.ContactNoColumnAfter, ContactNoTableData, "STEP 42 : Employee - Contact No");

//		STEP 43 : Employee Multi Search (Check Correct Data Count Filter) ☑ 
		Method.MultipleSearch("STEP 43 : Employee");
		
		Method.Logout();
	}
}
