package com.ews.testcases;

import com.ews.baseclass.Baseclass;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.ews.pages.*;

import utils.ExtentReportListner;

@Listeners(ExtentReportListner.class)
public class Rerun extends Baseclass	{
	
	
	  @Test(priority = 39) 
	  public void unique_uiValidations() { 
		  //launch browser
		  browser_lunch("chrome");
		  
		  Login loginpage = new Login(); 
		  loginpage.login();
		  
		  UniqueID UniqueID = new UniqueID();
		  UniqueID.ui_Validation_UniqueID();
		  
		  //logout 
		  loginpage.logout();
		  
		  //close application and browser.. 
		  closeBrower(); 
		  
	  }		
	  
	  	  
	  
}
