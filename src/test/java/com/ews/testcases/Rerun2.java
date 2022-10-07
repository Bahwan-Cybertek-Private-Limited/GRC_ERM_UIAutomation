package com.ews.testcases;

import com.ews.baseclass.Baseclass;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.ews.pages.*;

import utils.ExtentReportListner;

@Listeners(ExtentReportListner.class)
public class Rerun2 extends Baseclass	{
	
	
	
	@Test(priority = 1)
	public void loginPage_Validations()
	{
		//launch browser
		browser_lunch("chrome");
		
		Login loginpage = new Login();
		loginpage.login_Validations();
		
		//close application and browser..
		closeBrower();
	}
	
	@Test(priority = 2)
	public void logging()
	{
		//launch browser
		browser_lunch("chrome");
				
		Login loginpage = new Login();
		loginpage.login();
		
		//logout
		loginpage.logout();
		
		//close application and browser..
		closeBrower();
	}
	
	  
}
