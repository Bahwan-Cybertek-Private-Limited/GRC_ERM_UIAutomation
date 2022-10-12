package com.ews.pages;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.ews.baseclass.Baseclass;
import com.relevantcodes.extentreports.LogStatus;

public class Analytics extends Baseclass{
	
	public String logo = "//*[@class='ews-logo']";
	public String ERM_Module = "//*[contains(text(),'Enterprise Risk Management')]";
	public String lnk_Analytics = "(//*[contains(text(),'Analytics')])[1]";
	public String lbl_KeyIndicators = "//*[@class='summary-container']/div//div[contains(text(),'Key Risk Indicators ')]";
	public String lbl_Incidents = "//*[contains(text(),'Incidents')]";
	public String lbl_Vulnerablites = "//*[contains(text(),'Vulnerabilities')]";
	public String lbl_AssestPendingApprovals = "//*[contains(text(),'Asset Pending Approval')]";
	public String lbl_HeatMapInhernt = "//*[contains(text(),'Heat Map Inherent')]";
	public String lbl_HeatMapResidual = "//*[contains(text(),'Heat Map Residual')]";
	public String txt_FromDate = "(//*[@class='k-input'])[1]";
	public String txt_ToDate = "(//*[@class='k-input'])[2]";
	public String btn_Search = "//*[contains(text(),' Search ')]";
	public String btn_GetAllData = "//*[contains(text(),'Get All Data')]";
	public String grid_Keyindicators = "//*[contains(text(),'Key Risk Indicators')]";
	public String btn_ExportAs = "//*[@class='export-grid-menu-btn k-button']";
	public String Module_MouseOver = "//*[@class='k-widget k-drawer k-drawer-start']";
	public String heatmap_gridCount = "//*[@class='k-grid-table']/tbody/tr";
	public String Resudial_Heatmap = "(//*[contains(text(),'Get All Data')])[2]";
	public String lnk_cal_Today = "//*[@class='k-today']";
	public String lnk_FromCal = "(//*[@title='Toggle calendar'])[1]";
	public String lnk_ToCal = "(//*[@title='Toggle calendar'])[2]";
	
	public void Analytics()
	{
		///////constructor.............
	}
	
	public void verify_AnalyticsDashboard()
	{
		try {			
			Thread.sleep(3000);
			clickOn(ERM_Module,"ERM module");
			Thread.sleep(2000);
			clickOn(Module_MouseOver,"slide mouseover");
			Thread.sleep(3000);
			clickOn(lnk_Analytics,"Analytics tab");
			Thread.sleep(2000);
			
			clickOn(logo,"mouseover");
			Thread.sleep(4000);
			
			
			if(ispresent(lbl_KeyIndicators)) {
				test.log(LogStatus.PASS, "Key indicators is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "Key indicators is not displayed");
			}
			
			if(ispresent(lbl_Incidents)) {
				test.log(LogStatus.PASS, "incidents is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "incidents is not displayed");
			}
			
			if(ispresent(lbl_Vulnerablites)) {
				test.log(LogStatus.PASS, "Vulnerablites is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "Vulnerablites is not displayed");
			}
			
			if(ispresent(lbl_AssestPendingApprovals)) {
				test.log(LogStatus.PASS, "AssestPendingApporvals is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "AssestPendingApporvals is not displayed");
			}
			
			if(ispresent(lbl_HeatMapInhernt)) {
				test.log(LogStatus.PASS, "HeatMapInhernt is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "HeatMapInhernt is not displayed");
			}
			
			if(ispresent(lbl_HeatMapResidual)) {
				test.log(LogStatus.PASS, "HeatMapResidual is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "HeatMapResidual is not displayed");
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
	
	
	
	// verify grid without dates......
	public void verify_KeyRiskIndicatorsGrid()
	{
		try {
			Thread.sleep(3000);
			clickOn(ERM_Module,"ERM module");
			Thread.sleep(2000);
			clickOn(Module_MouseOver,"slide mouseover");
			Thread.sleep(2000);
			clickOn(lnk_Analytics,"Analytics tab");
			Thread.sleep(2000);
			
			clickOn(logo,"mouseover");
			Thread.sleep(4000);
			
			if(ispresent(lbl_KeyIndicators)) {
				test.log(LogStatus.PASS, "Key indicators is displayed");
				clickOn(lbl_KeyIndicators,"Keyindicators tile");
				Thread.sleep(2000);
				
				//typeIn(txt_FromDate,"26-06-2022","From date");
				//typeIn(txt_ToDate,"27-06-2022","To date");
				clickOn(btn_GetAllData,"Get AllData button");
				Thread.sleep(7000);
				
				if(ispresent(grid_Keyindicators)) {
					test.log(LogStatus.PASS, "KeyRiskIndicators is displayed");
				}
				else {
					test.log(LogStatus.FAIL, "KeyRiskIndicators is not displayed");
				}
				
				Thread.sleep(2000);
				if(ispresent(btn_ExportAs)) {
					test.log(LogStatus.PASS, "ExportAs button is displayed");
				}
				else {
					test.log(LogStatus.FAIL, "ExportAs button is not displayed");
				}
				
			}
			else {
				test.log(LogStatus.FAIL, "Key Risk indicators is not displayed");
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
	
	
	//verify grid with dattes
	public void verify_KeyRiskIndicatorsGrid_WithDate()
	{
		try {
			Thread.sleep(3000);
			clickOn(ERM_Module,"ERM module");
			Thread.sleep(2000);
			clickOn(Module_MouseOver,"slide mouseover");
			Thread.sleep(2000);
			clickOn(lnk_Analytics,"Analytics tab");
			Thread.sleep(2000);
			
			clickOn(logo,"mouseover");
			Thread.sleep(4000);
			
			if(ispresent(lbl_KeyIndicators)) {
				test.log(LogStatus.PASS, "Key indicators is displayed");
				clickOn(lbl_KeyIndicators,"Keyindicators tile");
				Thread.sleep(2000);
				
				clickOn(lnk_FromCal,"Fromdate calender");
				Thread.sleep(2000);				
				clickOn(lnk_cal_Today,"select Date from calender");
				Thread.sleep(2000);
				
				clickOn(lnk_ToCal,"Todate calender");
				Thread.sleep(2000);				
				clickOn(lnk_cal_Today,"select Date TO calender");
				Thread.sleep(2000);
				
				//typeIn1(txt_FromDate,"26-06-2022","From date");
				//typeIn1(txt_ToDate,"27-06-2022","To date");
				
				clickOn(btn_Search,"Search button");
				Thread.sleep(2000);
				
				if(ispresent(grid_Keyindicators)) {
					test.log(LogStatus.PASS, "KeyRiskIndicators is displayed");
				}
				else {
					test.log(LogStatus.FAIL, "KeyRiskIndicators is not displayed");
				}
				
				Thread.sleep(2000);
				if(ispresent(btn_ExportAs)) {
					test.log(LogStatus.PASS, "ExportAs button is displayed");
				}
				else {
					test.log(LogStatus.FAIL, "ExportAs button is not displayed");
				}
				
			}
			else {
				test.log(LogStatus.FAIL, "Key Risk indicators is not displayed");
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
	
	
	//verify Inherent heatmap data.......
		public void verify_HeatmapData()
		{
			try {
				Thread.sleep(3000);
				clickOn(ERM_Module,"ERM module");
				Thread.sleep(2000);
				clickOn(Module_MouseOver,"slide mouseover");
				Thread.sleep(2000);
				clickOn(lnk_Analytics,"Analytics tab");
				Thread.sleep(2000);
				
				clickOn(logo,"mouseover");
				Thread.sleep(4000);
				
				if(ispresent(btn_GetAllData)) {
					test.log(LogStatus.PASS, "heatmap data is displayed");
					
					clickOn(btn_GetAllData,"Getall data");
					Thread.sleep(2000);
					
					if(ispresent(btn_ExportAs)) {
						test.log(LogStatus.PASS, "ExportAs button is displayed");
					}
					else {
						test.log(LogStatus.FAIL, "ExportAs button is not displayed");
					}
					
					List<WebElement> griddatacount = driver.findElements(By.xpath(heatmap_gridCount));
					
					if(griddatacount.size() > 1) {
						test.log(LogStatus.PASS, "heatmap grid data is displayed");
					}
					else {
						test.log(LogStatus.INFO, "No records found in heatmap grid");
					}
				}
				else {
					test.log(LogStatus.FAIL, "GetAllData is not displayed");
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

		
		
		
		//verify Resudial heatmap data.......
		public void verify_ResidualHeatmapData()
		{
			try {
				Thread.sleep(3000);
				clickOn(ERM_Module,"ERM module");
				Thread.sleep(2000);
				clickOn(Module_MouseOver,"slide mouseover");
				Thread.sleep(2000);
				clickOn(lnk_Analytics,"Analytics tab");
				Thread.sleep(2000);
				clickOn(logo,"mouseover");
				Thread.sleep(4000);
				
				if(ispresent(Resudial_Heatmap)) {
					test.log(LogStatus.PASS, "Resudial heatmap data is displayed");
					
					clickOn(Resudial_Heatmap,"Resudial heatmap");
					Thread.sleep(2000);
					
					JavascriptExecutor js = (JavascriptExecutor) driver;
				    js.executeScript("window.scrollBy(2000,0)");
				       
				    Thread.sleep(2000);
					if(ispresent(btn_ExportAs)) {
						test.log(LogStatus.PASS, "ExportAs button is displayed");
					}
					else {
						test.log(LogStatus.FAIL, "ExportAs button is not displayed");
					}
					
					List<WebElement> griddatacount = driver.findElements(By.xpath(heatmap_gridCount));
					
					if(griddatacount.size() > 1) {
						test.log(LogStatus.PASS, "Resudial heatmap grid data is displayed");
					}
					else {
						test.log(LogStatus.INFO, "No records found in Resudial heatmap grid");
					}
				}
				else {
					test.log(LogStatus.FAIL, "Key Risk indicators is not displayed");
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
