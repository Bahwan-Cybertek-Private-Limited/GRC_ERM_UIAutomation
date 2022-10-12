package com.ews.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.ews.baseclass.Baseclass;
import com.relevantcodes.extentreports.LogStatus;

public class Login extends Baseclass{
	
	//Application URL
	public String url = "http://192.168.1.80:8080/grc/#/login";
	
	// xpaths.....
	public String logo = "//*[@class='ews-logo']";
	public String txt_username = "//div[contains(text(),'User Name')]/following-sibling::input";
	public String txt_password = "//div[contains(text(),'Password')]/following-sibling::input";
	public String btn_login = "//button[contains(text(),'Login')]";
	public String err_username = "//div[contains(text(),'User Name')]/following-sibling::div/div";
	public String err_password = "//div[contains(text(),'Password')]/following-sibling::div/div";
	public String btn_Admin = "//span[@class='userProfile']";
	public String btn_logout = "//li[contains(text(),' Logout ')]";
	public String btn_ActiveDevice = "//div[@class='form-buttons']/button[contains(text(),'Logout Last active Device, Login here')]";
	
	public void Login()
	{
		///////Constructor....
	}
	
	public void lunchApplication()
	{
		try {
			//log.info("logging");
			driver.get(url);
			Thread.sleep(3000);
			test.log(LogStatus.PASS, "Application lunched");
			System.out.println("Application lunched");
		}
		catch(Exception ex)	{
			test.log(LogStatus.FAIL, "Application Not lunched");
			System.out.println("Application not lunched");
		}
		
	}
	
	// Log into application.....
	public void login()
	{
		try {
			
			//launching url.....
			launchUrl(url);
			typeIn(txt_username, "Admin", "Username textbox");
			typeIn(txt_password, "admin!01", "Password textbox");
			clickOn(btn_login, "Login button");		
			Thread.sleep(3000);
			
			String appTitle = driver.getTitle();
			String actualTitle = "GRC";
			
			if(appTitle.equalsIgnoreCase(actualTitle)) {
				test.log(LogStatus.PASS, "Application title is : "+actualTitle);
				takeScreenhot(driver, "login");
			}
			else {
				test.log(LogStatus.FAIL, "Application title is : "+actualTitle);
				takeScreenhot(driver, "login");
			}
			
		}
		catch(Exception ex) {
			test.log(LogStatus.INFO,ex.toString());
			try {
				getScreenhot(driver, "Exception");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				test.log(LogStatus.FAIL,e.toString());
			}
		}
	}

	
	// LoginPage Negative validations.....
	public void login_Validations()
	{
		try {
			
			launchUrl(url);
			// click on login button without entering credentails.....
			Thread.sleep(5000);
			if(ispresent(btn_login)) {
				clickOn(btn_login, "Login  button");
			}
			
			Thread.sleep(1000);
			// get the error text..
			String err_username_actualMessage = getText(err_username,"Username error text");
			String err_passwordText_actualMessage = getText(err_password,"Username error text");
			
			String user_expectedMsg = "User Name is required";
			String pass_expectedMsg = "Password is required";
			
			//validate error messages...
			Assert.assertEquals(err_username_actualMessage, user_expectedMsg);
			Assert.assertEquals(err_passwordText_actualMessage, pass_expectedMsg);
			
			
			refresh();
			typeIn(txt_username, "Admin9999", "Username textbox");
			clickOn(btn_login, "Login button");			
			String err_passwordText_actualMessage1 = getText(err_password,"Username error text");
			Assert.assertEquals(err_passwordText_actualMessage1, pass_expectedMsg);
			
			refresh();
			typeIn(txt_password, "admin!01", "Password textbox");
			clickOn(btn_login, "Login button");			
			String err_username_actualMessage1 = getText(err_username,"Username error text");
			Assert.assertEquals(err_username_actualMessage1, user_expectedMsg);
					
		}
		catch(Exception ex) {
			test.log(LogStatus.INFO,ex.toString());
			try {
				getScreenhot(driver, "Exception");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				test.log(LogStatus.FAIL,e.toString());
			}
		}
	}
	
	public void logout()
	{
		try {
			clickOn(btn_Admin, "Logout lable");		
			Thread.sleep(2000);
			clickOn(btn_logout, "Logout button");		
			Thread.sleep(3000);
			test.log(LogStatus.PASS, "Successfully logout");
			
			takeScreenhot(driver, "logout");
		}
		catch(Exception ex) {
			test.log(LogStatus.INFO,ex.toString());
			try {
				getScreenhot(driver, "Exception");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				test.log(LogStatus.FAIL,e.toString());
			}
		}
	}
}
