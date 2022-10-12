package com.ews.testcases;

import com.ews.baseclass.Baseclass;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.ews.pages.*;

import utils.ExtentReportListner;

@Listeners(ExtentReportListner.class)
public class Rerun extends Baseclass	{
	
	
	 @Test(priority = 8) 
	  public void riskLibrary_createSingleRisk() { 
		  //launch browser
		  browser_lunch("chrome");
		  
		  Login loginpage = new Login(); 
		  loginpage.login();
		  
		  RiskLibrary lib = new RiskLibrary();
		  lib.createSingleRisk();
		  
		  //logout 
		  loginpage.logout();
		  
		  //close application and browser.. 
		  closeBrower(); 
		  
	  }
	  
	 
	  @Test(priority = 22) 
	  public void register_CreateRiskUIValidations() { 
		  //launch browser
		  browser_lunch("chrome");
		  
		  Login loginpage = new Login(); 
		  loginpage.login();
		  
		  Register register = new Register();
		  register.register_CreateRiskRegisterUiValidations();
		  
		  //logout 
		  loginpage.logout();
		  
		  //close application and browser.. 
		  closeBrower(); 
		  
	  }	
	  
	  
	  @Test(priority = 23) 
	  public void register_CreateRisk_AddToRiskRegisterUIValidations() { 
		  //launch browser
		  browser_lunch("chrome");
		  
		  Login loginpage = new Login(); 
		  loginpage.login();
		  
		  Register register = new Register();
		  register.addToRiskRegister_UiValidations();
		  
		  //logout 
		  loginpage.logout();
		  
		  //close application and browser.. 
		  closeBrower(); 
		  
	  }	
	
		  
	  
}
