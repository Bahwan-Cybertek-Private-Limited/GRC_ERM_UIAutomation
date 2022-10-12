package com.ews.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.ews.baseclass.*;
import com.relevantcodes.extentreports.LogStatus;



public class ControlLibrary extends Baseclass{

	public String logo = "//*[@class='ews-logo']";
	public String ERM_Module = "//*[contains(text(),'Enterprise Risk Management')]";
	public String lnk_Library = "(//*[contains(text(),'Library')])[1]";
	public String lnk_ControlLibrary = "(//*[contains(text(),'Control Library')])[1]";
	public String Module_MouseOver = "//*[@class='k-widget k-drawer k-drawer-start']";
	public String lbl_controlLib = "//*[@class='user-details']";
	public String btn_Exportas = "//*[@class='export-grid-menu-btn k-button']";
	public String btn_CreateControl = "//*[contains(text(),' Create Control')]";
	public String list_grid = "//*[@class='export-grid-menu-btn k-button']/../../..//following-sibling::div//table/tbody/tr";
	
	public void HomePage()
	{
		/////constructor...
	}
	
	
	public void verify_ControlLibrary()
	{
		try {
			
			Thread.sleep(3000);
			clickOn(ERM_Module,"ERM module");
			Thread.sleep(2000);
			clickOn(Module_MouseOver,"slide mouseover");
			Thread.sleep(2000);
			clickOn(lnk_Library,"RiskLibrary tab");
			Thread.sleep(2000);
			clickOn(lnk_ControlLibrary,"RiskLibrary tab");
			Thread.sleep(2000);
			clickOn(logo,"mouseover");
			Thread.sleep(4000);
			
			if(ispresent(lbl_controlLib)) {
				test.log(LogStatus.PASS, "control library text is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "control library text is not displayed");
			}
			
			Thread.sleep(2000);
			if(ispresent(btn_Exportas)) {
				test.log(LogStatus.PASS, "ExportAs button is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "ExportAs button is not displayed");
			}
			
			if(ispresent(btn_CreateControl)) {
				test.log(LogStatus.PASS, "Createcontrol button is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "Createcontrol button is not displayed");
			}
			
			List<WebElement> griddatacount = driver.findElements(By.xpath(list_grid));
			
			if(griddatacount.size() > 1) {
				test.log(LogStatus.PASS, "ControlLibrary data is displayed");
			}
			else {
				test.log(LogStatus.INFO, "No records found in RiskLibrary grid");
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
}
