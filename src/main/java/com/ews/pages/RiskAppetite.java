package com.ews.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.ews.baseclass.Baseclass;
import com.relevantcodes.extentreports.LogStatus;

public class RiskAppetite extends Baseclass {

	public String logo = "//*[@class='ews-logo']";
	public String lnk_RiskAppetite = "(//*[contains(text(),'Risk Appetite')])[1]";
	public String ERM_Module = "//*[contains(text(),'Enterprise Risk Management')]";
	public String Module_MouseOver = "//*[@class='k-widget k-drawer k-drawer-start']";
	public String lbl_RiskAppetite = "(//*[@class='user-details'])[1]";
	public String btn_ExportAs = "//*[@class='export-grid-menu-btn k-button']";
	public String btn_CreateRiskAppetite = "//*[contains(text(),'Create Risk Appetite')]";
	public String btn_Create = "//button[contains(text(),' Create ')]";
	public String btn_Cancel = "//button[contains(text(),' Cancel ')]";
	public String err_ReportingYear = "//*[@id='kendo-error-0']/div";
	public String err_ReportingDate = "//*[@id='kendo-error-1']/div";
	public String err_RiskType = "//*[@id='kendo-error-2']/div";
	public String err_Statemet = "//*[@id='kendo-error-3']/div";
	public String list_grid = "//*[@class='export-grid-menu-btn k-button']/../../..//following-sibling::div//table/tbody/tr";
	public String table_RiskId = "//*[contains(text(),'Risk Appetite Id')]";
	public String table_RiskType = "//*[contains(text(),'Risk Type')]";
	public String table_AppetiteType = "//*[contains(text(),'Appetite Type')]";
	public String table_RiskAppetiteStatement = "//*[contains(text(),'Risk Appetite Statement')]";
	public String table_RiskAppetiteCalculation = "//*[contains(text(),'Appetite Calculation')]";
	public String table_ReportingDate = "//*[contains(text(),'Reporting Date')]";
	public String table_Year = "//*[contains(text(),'Reporting Year')]";
	
	public String rdo_selectType_Qualitative = "//*[@value='Qualitative']";
	public String rdo_selectType_Quantitative = "//*[@value='Quantitative']";
	public String drp_ReportingYear = "//*[@ng-reflect-name='reportingYear']";
	public String drp_ReportingYear_select = "//*[@ng-reflect-name='reportingYear']/span/span[1]";
	public String drp_ReportingDate = "//*[@class='k-widget k-dateinput']";	
	public String drp_RiskType = "//*[@formcontrolname='riskType']";
	public String drp_RiskType_select = "//*[@formcontrolname='riskType']/span/span[1]";
	public String txt_RiskStatement = "//*[@formcontrolname='appetiteStatement']";
	public String lnk_cal_Today = "//*[@class='k-today']";
	public String lnk_Cal = "//*[@title='Toggle calendar']";
	
	
	
	public void RiskAppetite() {
		//TODO..........
	}
	
	
	
	public void verify_RiskAppetite() {
		try {
			
			Thread.sleep(3000);
			clickOn(ERM_Module,"ERM module");
			Thread.sleep(2000);
			clickOn(Module_MouseOver,"slide mouseover");
			Thread.sleep(2000);
			clickOn(lnk_RiskAppetite,"RiskLibrary tab");
			Thread.sleep(2000);
			clickOn(logo,"mouseover");
			Thread.sleep(4000);
			
			if(ispresent(lbl_RiskAppetite)) {
				test.log(LogStatus.PASS, "RiskAppetite label is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "RiskAppetite label is not displayed");
			}
			
			if(ispresent(btn_ExportAs)) {
				test.log(LogStatus.PASS, "Export as is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "Export as is not displayed");
			}
			
			if(ispresent(btn_CreateRiskAppetite)) {
				test.log(LogStatus.PASS, "CreateRiskAppetite button is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "CreateRiskAppetite button is not displayed");
			}
			
			
			List<WebElement> griddatacount = driver.findElements(By.xpath(list_grid));
			
			if(griddatacount.size() > 1) {
				test.log(LogStatus.PASS, "RiskLibrary grid data is displayed");
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
	
	
	public void verfiyGrid()
	{
		try {
			
			Thread.sleep(3000);
			clickOn(ERM_Module,"ERM module");
			Thread.sleep(2000);
			clickOn(Module_MouseOver,"slide mouseover");
			Thread.sleep(2000);
			clickOn(lnk_RiskAppetite,"RiskLibrary tab");
			Thread.sleep(2000);
			clickOn(logo,"mouseover");
			Thread.sleep(4000);
			
			if(ispresent(table_AppetiteType)) {
				test.log(LogStatus.PASS, "RiskAppetitetype table is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "RiskAppetitetype table is not displayed");
			}
			
			if(ispresent(table_ReportingDate)) {
				test.log(LogStatus.PASS, "Reporting date table is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "Reporting date table is not displayed");
			}
			
			if(ispresent(table_RiskAppetiteCalculation)) {
				test.log(LogStatus.PASS, "RiskAppetiteCalculation table is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "RiskAppetiteCalculation table is not displayed");
			}
			
			if(ispresent(table_RiskAppetiteStatement)) {
				test.log(LogStatus.PASS, "RiskAppetiteStatement table is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "RiskAppetiteStatement table is not displayed");
			}
			
			if(ispresent(table_RiskId)) {
				test.log(LogStatus.PASS, "RiskID table is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "RiskID table is not displayed");
			}
			
			
			if(ispresent(table_RiskType)) {
				test.log(LogStatus.PASS, "RiskType is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "RiskType is not displayed");
			}
			
			
			if(ispresent(table_Year)) {
				test.log(LogStatus.PASS, "Year is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "Year is not displayed");
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
	
	
	public void createRiskAppetite_Qualitative() {
		try {
			
			Thread.sleep(3000);
			clickOn(ERM_Module,"ERM module");
			Thread.sleep(2000);
			clickOn(Module_MouseOver,"slide mouseover");
			Thread.sleep(2000);
			clickOn(lnk_RiskAppetite,"RiskAppetite tab");
			Thread.sleep(2000);
			clickOn(logo,"mouseover");
			Thread.sleep(4000);
			
			clickOn(btn_CreateRiskAppetite,"Create RiskAppetite tab");
			Thread.sleep(2000);
			clickOn(rdo_selectType_Qualitative,"select Type");
			Thread.sleep(2000);
			//keypress_Down(drp_RiskType);
			Thread.sleep(2000);
			clickOn(drp_ReportingYear,"Reporting year");
			Thread.sleep(2000);
			keypress_Down();
			clickOn(lnk_Cal,"Calender link");
			Thread.sleep(2000);
			clickOn(lnk_cal_Today,"Today link in calender");
			Thread.sleep(2000);
			//typeIn(drp_ReportingDate, "03/12/2022", "Reporting Date");
			
			clickOn(drp_RiskType,"RiskType");
			Thread.sleep(2000);
			keypress_Down();
			Thread.sleep(2000);
			
			typeIn(txt_RiskStatement, "adsfasdf", "Risk statement");
			clickOn(btn_Create,"Create button");
			Thread.sleep(2000);
			
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
	
	
	public void createRiskAppetite_Quantitative() {
		try {
			
			Thread.sleep(3000);
			clickOn(ERM_Module,"ERM module");
			Thread.sleep(2000);
			clickOn(Module_MouseOver,"slide mouseover");
			Thread.sleep(2000);
			clickOn(lnk_RiskAppetite,"RiskAppetite tab");
			Thread.sleep(2000);
			clickOn(logo,"mouseover");
			Thread.sleep(4000);
			
			clickOn(btn_CreateRiskAppetite,"create RiskAppetite tab");
			Thread.sleep(2000);
			clickOn(rdo_selectType_Quantitative,"select type");
			Thread.sleep(2000);
			//keypress_Down(drp_RiskType);
			Thread.sleep(2000);
			clickOn(drp_ReportingYear,"Reporting year");
			Thread.sleep(2000);
			keypress_Down();
			clickOn(lnk_Cal,"Calender");
			Thread.sleep(2000);
			clickOn(lnk_cal_Today,"Today button in calender");
			Thread.sleep(2000);
			//typeIn(drp_ReportingDate, "03/12/2022", "Reporting Date");
			
			clickOn(drp_RiskType,"RiskTYpe");
			Thread.sleep(2000);
			keypress_Down();
			Thread.sleep(2000);
			
			typeIn(txt_RiskStatement, "adsfasdf", "Risk statement");
			clickOn(btn_Create,"Create button");
			Thread.sleep(2000);
			
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
	
	
	
	public void cancel_RiskAppetite() {
		try {
			Thread.sleep(3000);
			clickOn(ERM_Module,"ERM module");
			Thread.sleep(2000);
			clickOn(Module_MouseOver,"slide mouseover");
			Thread.sleep(2000);
			clickOn(lnk_RiskAppetite,"lnk RiskAppetite tab");
			Thread.sleep(2000);
			clickOn(logo,"mouseover");
			Thread.sleep(4000);
			
			clickOn(btn_CreateRiskAppetite,"Create RiskAppetite tab");
			Thread.sleep(2000);
			
			clickOn(btn_Cancel,"RiskLibrary tab");
			Thread.sleep(2000);
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
