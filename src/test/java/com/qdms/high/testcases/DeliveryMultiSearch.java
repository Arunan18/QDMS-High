package com.qdms.high.testcases;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.qdms.high.base.DriverIntialization;
import com.qdms.high.pages.DeliveryPage;

public class DeliveryMultiSearch extends DriverIntialization {

	DeliveryPage dp = new DeliveryPage();
	static boolean DeliveryTableData = true;
	static boolean ProjectTableData = true;
 
	@Test
	public void deliveryMultiearch() throws InterruptedException, IOException {
		PageFactory.initElements(driver, dp);

		LoginTest.Login();

		MainNavigationTest.navigateMaster();

		MainNavigationTest.navigateCustomer();

		SubNavigationTest.navigateDelivery();

//		STEP 1 : Delivery - Delivery Name Search Button Properties
		Method.checkSearch(DeliveryPage.DeleverySearch, "STEP 1 : Delivery - Delivery Name");
		
//		STEP 2 : Delivery - Delivery Name Search Icon Click
		Method.ClickSearch(DeliveryPage.DeleverySearch, DeliveryPage.SearchTextBox,"STEP 2 : Delivery - Delivery Name");

//		STEP 3 : Delivery - Delivery Name Search Text Box Properties
		Method.SearchTextBox(DeliveryPage.SearchTextBox, "STEP 3 : Delivery - Delivery Name");

//		STEP 4 : Delivery - Delivery Name Search Button Properties
		Method.SearchButton(DeliveryPage.SearchBtn, "STEP 4 : Delivery - Delivery Name");

//		STEP 5 : Delivery - Delivery Name Search Data Input
		Method.inputDataSearch(DeliveryPage.SearchTextBox, "STEP 5 : Delivery - Delivery Name","Delivery", 1, DeliveryPage.DeleveryColumn);

//		STEP 6 : Delivery - Delivery Name Search Button Click
		Method.SearchButtonClick(DeliveryPage.SearchBtn, DeliveryPage.ResetAll,"STEP 6 : Delivery - Delivery Name");

//		STEP 7 : Delivery - Delivery Name Single Search Function
		Method.checkAfterSearchData(DeliveryPage.DeleveryColumn, DeliveryPage.DeleveryColumnBefore,DeliveryPage.DeleveryColumnAfter, DeliveryTableData, "STEP 7 : Delivery - Delivery Name",9);

//		STEP 8 : Delivery - Project Name Search Button Properties
		Method.checkSearch(DeliveryPage.ProjectSearch, "STEP 8 : Delivery - Project Name");

//		STEP 9 : Delivery - Project Name Search Icon Click
		Method.ClickSearch(DeliveryPage.ProjectSearch, DeliveryPage.SearchTextBox,"STEP 9 : Delivery - Project Name");

//		STEP 10 : Delivery - Project Name Search Text Box Properties
		Method.SearchTextBox(DeliveryPage.SearchTextBox, "STEP 10 : Delivery - Project Name");

//		STEP 11 : Delivery - Project Name Search Button Properties
		Method.SearchButton(DeliveryPage.SearchBtn, "STEP 11 : Delivery - Project Name");

//		STEP 12 : Delivery - Project Name Search Data Input
		Method.inputDataSearch(DeliveryPage.SearchTextBox, "STEP 12 : Delivery - Project Name","Delivery", 2, DeliveryPage.ProjectColumn);

//		STEP 13 : Delivery - Project Name Search Button Click
		Method.SearchButtonClick(DeliveryPage.SearchBtn, DeliveryPage.ResetAll,
				"STEP 13 : Delivery - Project Name");

//		STEP 14 : Delivery - Project Name Single Search Function
		Method.checkAfterSearchData(DeliveryPage.ProjectColumn, DeliveryPage.ProjectColumnBefore,DeliveryPage.ProjectColumnAfter, ProjectTableData, "STEP 14 : Delivery - Project Name",1);

//		STEP 15 : Delivery Multi Search (Check Correct Data Count Filter) ☑ 
		Method.MultipleSearch("STEP 15 : Delivery");
		Method.Logout();
	}
}
