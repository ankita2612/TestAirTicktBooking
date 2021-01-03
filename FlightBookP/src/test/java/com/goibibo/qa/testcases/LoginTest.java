package com.goibibo.qa.testcases;

import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

import com.goibibo.qa.base.TestBase;
import com.goibibo.qa.pages.LoginPage;


public class LoginTest extends TestBase {
	
	LoginTest loginTest;
	//Created constructor of this page.
	public LoginTest() {
		super();	//it will call super class constrcuor to call testbase class constructor.
	}
		
	@BeforeMethod
	public void setUp() {
		initialization();
		loginTest = new LoginTest();
		//create object of onewaytrippage class
		}
	
	
	@Test

	public void verifyLoginWithValidCred () throws InterruptedException

	{

	// Reading the data from excel file by the specified path

	           
	            String xl = "C://Users//HP//git//TestAirwayFramewrk//FlightBookP//src//main//java//TestData//testdata.xlsx";

	            String Sheet = "Sheet1";

	            int rowCount = getRowCount(xl, Sheet);

	            for (int i=1;i<=rowCount;i++)

	            {

	                        String FromValue=getCellValue(xl, Sheet, i, 1);

	                        String ToValue=getCellValue(xl, Sheet, i, 2);

	                       

	                        //Passing From Value and To Value as parameters

	                        LoginPage selctVlue = new LoginPage(driver);

	                        selctVlue.SelectVlue(FromValue,ToValue);
	 
	//Submitting the data by clicking on Search button                   

	                        LoginPage clckSerchBtn = new LoginPage(driver);

	                        clckSerchBtn.clickSearchBtn();
//select flight	                        
	                        
	                        LoginPage selectflght = new LoginPage(driver);

	                        selectflght.WaitforPopupandselectFlight();
	                        
	                        String EmailId=getCellValue(xl, Sheet, i, 3);
	                        String MobilNumbr=getCellValue(xl, Sheet, i, 4);
	                        String FirstName=getCellValue(xl, Sheet, i, 5);
	                        String LastName=getCellValue(xl, Sheet, i, 6);
	                       

	                        //Passing From Value and To Value as parameters

	                        LoginPage ContinueAftrEntrngDtls = new LoginPage(driver);

	                        ContinueAftrEntrngDtls.ContinueAfterentringDetails(EmailId, MobilNumbr, FirstName, LastName);
	                        

	            }
	}
}