package com.qdms.high.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.qdms.high.base.DriverIntialization;
import com.qdms.high.pages.DeliveryPage;

public class DeliveryScript extends DriverIntialization{

	@Test
	public void PlantCodeSingleSearch() throws InterruptedException, IOException {
		
//		STEP 1 : Login the System
		LoginTest.Login(); 
		
//		STEP 2 : Navigate Master
		MainNavigationTest.navigateMaster();
		 
//		STEP 3 : Navigate Plant Main Module
		MainNavigationTest.navigateCustomer(); 
		
//		STEP 4 : Navigate Plant Sub Module
		SubNavigationTest.navigateDelivery();
//		 DeleveryTest.perPageHund();
		DeliveryTest.checkBeforeSearchData("Concrete");
		
//		STEP 5 : Check Plant Code Search Button Properties
		DeliveryTest.deleverySearch();
		
//		STEP 6 : Click Plant Code Search Button 
		DeliveryTest.ClickDeleverySearch();
		
//		STEP 7 : Check Plant Code Text Box
		DeliveryTest.DeleverySearchTextBox();
		
//		STEP 8 : Input Search Data
		DeliveryTest.DeleverySearchButton();
		DeliveryTest.inputDataSearch();
		
		
//		PlantSearchTest.checkBeforeSbuSearchData("RMC");
//		PlantSearchTest.ClickSbuSearch();
//		Thread.sleep(2000);
//		PlantSearchTest.inputSbuDataSearch();
		

		
		 
		
		
		
		
	}
}
