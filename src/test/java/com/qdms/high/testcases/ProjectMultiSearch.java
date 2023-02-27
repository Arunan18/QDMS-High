package com.qdms.high.testcases;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.qdms.high.base.DriverIntialization;
import com.qdms.high.pages.ProjectSearchPage;
import com.qdms.high.pages.ProjectSearchPage;

public class ProjectMultiSearch extends DriverIntialization{
	ProjectSearchPage sp= new ProjectSearchPage();
	static boolean CodeTableData = true;
	static boolean PlantTableData = true; 
	static boolean ProjectTableData = true; 
	static boolean CustomerTableData = true;
	static boolean ContactPersonTableData = true; 
	static boolean ContactNoTableData = true;
	static boolean DateTableData = true;
	
	@Test
public void projectMultiSearch() throws InterruptedException, IOException {
		PageFactory.initElements(driver, sp);
		

		LoginTest.Login(); 

		MainNavigationTest.navigateMaster();

		MainNavigationTest.navigateCustomer(); 

		SubNavigationTest.navigateProject(); 
		
//		STEP 1 : Project - Code Search Button Properties
		Method.checkSearch(ProjectSearchPage.CodeSearch,"STEP 1 : Project - Code");
		
//		STEP 2 : Project - Code Search Icon Click
		Method.ClickSearch(ProjectSearchPage.CodeSearch, ProjectSearchPage.SearchTextBox, "STEP 2 : Project - Code");

//		STEP 3 : Project - Code Search Text Box Properties
		Method.SearchTextBox(ProjectSearchPage.SearchTextBox, "STEP 3 : Project - Code");
		  
//		STEP 4 : Project - Code Search Button Properties
		Method.SearchButton(ProjectSearchPage.SearchBtn, "STEP 4 : Project - Code");
		 
//		STEP 5 : Project - Code Search Data Input
		Method.inputDataSearch(ProjectSearchPage.SearchTextBox, "STEP 5 : Project - Code","Project",1, ProjectSearchPage.CodeColumn);  
		
//		STEP 6 : Project - Code Search Button Click
		Method.SearchButtonClick(ProjectSearchPage.SearchBtn, ProjectSearchPage.ResetAll, "STEP 6 : Project - Code");
		
//		STEP 7 : Project - Code Single Search Function
		Method.checkAfterSearchData(ProjectSearchPage.CodeColumn, ProjectSearchPage.CodeColumnBefore, ProjectSearchPage.CodeColumnAfter,  CodeTableData, "STEP 7 : Project - Code",7);
		
//		STEP 8 : Project - Plant Search Button Properties
		Method.checkSearch(ProjectSearchPage.PlantSearch,"STEP 8 : Project - Plant");
		
//		STEP 9 : Project - Plant Search Icon Click
		Method.ClickSearch(ProjectSearchPage.PlantSearch, ProjectSearchPage.SearchTextBox, "STEP 9 : Project - Plant");

//		STEP 10 : Project - Plant Search Text Box Properties
		Method.SearchTextBox(ProjectSearchPage.SearchTextBox, "STEP 10 : Project - Plant");
		
//		STEP 11 : Project - Plant Search Button Properties
		Method.SearchButton(ProjectSearchPage.SearchBtn, "STEP 11 : Project - Plant");
		
//		STEP 12 : Project - Plant Search Data Input
		Method.inputDataSearch(ProjectSearchPage.SearchTextBox, "STEP 12 : Project - Plant","Project",2, ProjectSearchPage.PlantColumn);
		
//		STEP 13 : Project - Plant Search Button Click
		Method.SearchButtonClick(ProjectSearchPage.SearchBtn, ProjectSearchPage.ResetAll, "STEP 13 : Project - Plant");
		
//		STEP 14 : Project - Plant Single Search Function
		Method.checkAfterSearchData(ProjectSearchPage.PlantColumn, ProjectSearchPage.PlantColumnBefore, ProjectSearchPage.PlantColumnAfter, PlantTableData, "STEP 14 : Project - Plant",7);
		
//		STEP 15 : Project - Project Search Button Properties
		Method.checkSearch(ProjectSearchPage.ProjectSearch,"STEP 15 : Project - Project");
		
//		STEP 16 : Project - Project Search Icon Click
		Method.ClickSearch(ProjectSearchPage.ProjectSearch, ProjectSearchPage.SearchTextBox, "STEP 16 : Project - Project");

//		STEP 17 : Project - Project Search Text Box Properties 
		Method.SearchTextBox(ProjectSearchPage.SearchTextBox, "STEP 17 : Project - Project");
		
//		STEP 18 : Project - Project Search Button Properties
		Method.SearchButton(ProjectSearchPage.SearchBtn, "STEP 18 : Project - Project");
		
//		STEP 19 : Project - Project Search Data Input
		Method.inputDataSearch(ProjectSearchPage.SearchTextBox, "STEP 19 : Project - Project","Project",3, ProjectSearchPage.ProjectColumn);
		
//		STEP 20 : Project - Project Search Button Click
		Method.SearchButtonClick(ProjectSearchPage.SearchBtn, ProjectSearchPage.ResetAll, "STEP 20 : Project - Project");
		
//		STEP 21 : Project - Project Single Search Function
		Method.checkAfterSearchData(ProjectSearchPage.ProjectColumn, ProjectSearchPage.ProjectColumnBefore, ProjectSearchPage.ProjectColumnAfter,  ProjectTableData, "STEP 21 : Project - Project",3);
		
//		STEP 22 : Project - Customer Search Button Properties
		Method.checkSearch(ProjectSearchPage.CustomerSearch,"STEP 22 : Project - Customer");
		
//		STEP 23 : Project - Customer Search Icon Click
		Method.ClickSearch(ProjectSearchPage.CustomerSearch, ProjectSearchPage.SearchTextBox, "STEP 23 : Project - Customer");

//		STEP 24 : Project - Customer Search Text Box Properties
		Method.SearchTextBox(ProjectSearchPage.SearchTextBox, "STEP 24 : Project - Customer");
		
//		STEP 25 : Project - Customer Search Button Properties
		Method.SearchButton(ProjectSearchPage.SearchBtn, "STEP 25 : Project - Customer");
		
//		STEP 26 : Project - Customer Search Data Input
		Method.inputDataSearch(ProjectSearchPage.SearchTextBox, "STEP 26 : Project - Customer","Project",4, ProjectSearchPage.CustomerColumn);
		
//		STEP 27 : Project - Customer Search Button Click
		Method.SearchButtonClick(ProjectSearchPage.SearchBtn, ProjectSearchPage.ResetAll, "STEP 27 : Project - Customer");
		
//		STEP 28 : Project - Customer Single Search Function
		Method.checkAfterSearchData(ProjectSearchPage.CustomerColumn, ProjectSearchPage.CustomerColumnBefore, ProjectSearchPage.CustomerColumnAfter, CustomerTableData, "STEP 28 : Project - Customer",1);

//		STEP 29 : Project - Contact Person Search Button Properties
		Method.checkSearch(ProjectSearchPage.ContactPersonSearch,"STEP 29 : Project - Contact Person");
		
//		STEP 30 : Project - Contact Person Search Icon Click
		Method.ClickSearch(ProjectSearchPage.ContactPersonSearch, ProjectSearchPage.SearchTextBox, "STEP 30 : Project - Contact Person");

//		STEP 31 : Project - Contact Person Search Text Box Properties
		Method.SearchTextBox(ProjectSearchPage.SearchTextBox, "STEP 31 : Project - Contact Person");
		
//		STEP 32 : Project - Contact Person Search Button Properties
		Method.SearchButton(ProjectSearchPage.SearchBtn, "STEP 32 : Project - Contact Person");
		
//		STEP 33 : Project - Contact Person Search Data Input
		Method.inputDataSearch(ProjectSearchPage.SearchTextBox, "STEP 33 : Project - Contact Person","Project",5, ProjectSearchPage.ContactPersonColumn);
		
//		STEP 34 : Project - Contact Person Search Button Click
		Method.SearchButtonClick(ProjectSearchPage.SearchBtn, ProjectSearchPage.ResetAll, "STEP 34 : Project - Contact Person");
		
//		STEP 35 : Project - Contact Person Single Search Function
		Method.checkAfterSearchData(ProjectSearchPage.ContactPersonColumn, ProjectSearchPage.ContactPersonColumnBefore, ProjectSearchPage.ContactPersonColumnAfter,  ContactPersonTableData, "STEP 35 : Project - Contact Person",1);
		
//		STEP 36 : Project - Contact No Search Button Properties
		Method.checkSearch(ProjectSearchPage.ContactNoSearch,"STEP 36 : Project - Contact No");
		
//		STEP 37 : Project - Contact No Search Icon Click
		Method.ClickSearch(ProjectSearchPage.ContactNoSearch, ProjectSearchPage.SearchTextBox, "STEP 37 : Project - Contact No");

//		STEP 38 : Project - Contact No Search Text Box Properties
		Method.SearchTextBox(ProjectSearchPage.SearchTextBox, "STEP 38 : Project - Contact No");
		
//		STEP 39 : Project - Contact No Search Button Properties
		Method.SearchButton(ProjectSearchPage.SearchBtn, "STEP 39 : Project - Contact No");
		
//		STEP 40 : Project - Contact No Search Data Input
		Method.inputDataSearch(ProjectSearchPage.SearchTextBox, "STEP 40 : Project - Contact No","Project",6, ProjectSearchPage.ContactNoColumn);
		
//		STEP 41 : Project - Contact No Search Button Click
		Method.SearchButtonClick(ProjectSearchPage.SearchBtn, ProjectSearchPage.ResetAll, "STEP 41 : Project - Contact No");
		
//		STEP 42 : Project - Contact No Single Search Function
		Method.checkAfterSearchData(ProjectSearchPage.ContactNoColumn, ProjectSearchPage.ContactNoColumnBefore, ProjectSearchPage.ContactNoColumnAfter,  ContactNoTableData, "STEP 42 : Project - Contact No",1);
		
//		STEP 43 : Project - Date Search Button Properties
		Method.checkSearch(ProjectSearchPage.DateSearch,"STEP 43 : Project - Date");
		
//		STEP 44 : Project - Date Search Icon Click
		Method.ClickSearch(ProjectSearchPage.DateSearch, ProjectSearchPage.SearchTextBox, "STEP 44 : Project - Date");

//		STEP 45 : Project - Date Search Text Box Properties
		Method.SearchTextBox(ProjectSearchPage.SearchTextBox, "STEP 45 : Project - Date");
		
//		STEP 46 : Project - Date Search Button Properties
		Method.SearchButton(ProjectSearchPage.SearchBtn, "STEP 46 : Project - Date");
		
//		STEP 47 : Project - Date Search Data Input
		Method.inputDataSearch(ProjectSearchPage.SearchTextBox, "STEP 47 : Project - Date","Project",7, ProjectSearchPage.DateColumn);
		
//		STEP 48 : Project - Date Search Button Click
		Method.SearchButtonClick(ProjectSearchPage.SearchBtn, ProjectSearchPage.ResetAll, "STEP 48 : Project - Date");
		
//		STEP 49 : Project - Date Single Search Function
		Method.checkAfterSearchData(ProjectSearchPage.DateColumn, ProjectSearchPage.DateColumnBefore, ProjectSearchPage.DateColumnAfter,  DateTableData, "STEP 49 : Project - Date",1);
		
		
//		STEP 50 : Project Multi Search (Check Correct Data Count Filter) ☑ 
		Method.MultipleSearch("STEP 43 : Project");
		
		Method.Logout();
	} 

}
