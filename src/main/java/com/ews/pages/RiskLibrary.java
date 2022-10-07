package com.ews.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.ews.baseclass.Baseclass;
import com.relevantcodes.extentreports.LogStatus;

public class RiskLibrary extends Baseclass {
	
	public String logo = "//*[@class='ews-logo']";
	public String ERM_Module = "//*[contains(text(),'Enterprise Risk Management')]";
	public String lnk_Library = "(//*[contains(text(),'Library')])[1]";
	public String lnk_RiskLibrary = "//*[contains(text(),'Risk Library')]";
	public String lbl_RiskLibrary = "//*[@class='user-details']";
	public String btn_CreateRisk = "//*[@ng-reflect-data='Single Risk,Bulk Upload']/button";
	public String btn_SingleRisk = "//*[@ng-reflect-data='Single Risk,Bulk Upload']/ul/li[1]";
	public String btn_BulkRisk = "//*[@ng-reflect-data='Single Risk,Bulk Upload']/ul/li[2]";
	public String txt_RiskName = "//*[@ng-reflect-name='riskName']";
	public String txt_Riskdesc = "//*[@ng-reflect-name='riskDesc']";	
	public String err_RiskName = "//*[contains(text(),' Risk Name is required')]";
	public String err_RiskDesc = "//*[contains(text(),' Risk Description is required')]";
	public String err_RiskType = "//*[contains(text(),' Risk Type is required')]";
	public String err_RiskEventType = "//*[contains(text(),' Risk Event Type is required')]";
	public String err_RiskCategory = "//*[contains(text(),' Risk Category is required')]";
	public String err_RiskPrimarysource = "//*[contains(text(),' Reason is required')]";
	public String err_Risksecondaysource = "//*[contains(text(),' Source is required')]";
	public String btn_Create = "(//*[@ng-reflect-text='Risk Name *']/../../../../div/div//following-sibling::div/button[contains(text(),' Create ')])[1]";
	public String btn_Cancel = "(//*[@ng-reflect-text='Risk Name *']/../../../../div/div//following-sibling::div/button[contains(text(),' Cancel ')])[1]";
	public String btn_ExportAs = "//*[@class='export-grid-menu-btn k-button']";
	public String list_grid = "//*[@class='export-grid-menu-btn k-button']/../../..//following-sibling::div//table/tbody/tr";
	public String Module_MouseOver = "//*[@class='k-widget k-drawer k-drawer-start']";
	public String lbl_uploadExcel = "//*[contains(text(),'Upload Excel')]";
	public String btn_uploadexcel = "//*[@name='file']/parent::div";
	public String lbl_filestoupload = "//*[contains(text(),'Drop files here to upload')]";
	public String btn_bulkriskCreate = "//*[@class='show-buttons-large']/button[contains(text(),' Create ')]";
	public String btn_bulkriskCancel = "//*[@class='show-buttons-large']/button[contains(text(),' Cancel ')]";
	public String drp_RiskType = "//*[@formcontrolname='riskType']";
	public String drp_RiskType_select = "//*[@formcontrolname='riskType']/span/span[contains(text(),'Fraud')]";
	public String drp_RiskEventType = "//*[@formcontrolname='riskEventType']";
	public String drp_RiskEventType_select = "//*[@formcontrolname='riskType']/span/span[contains(text(),'Internal')]";
	public String drp_Riskcategory = "//*[@formcontrolname='riskCategory']";
	public String drp_Riskcategory_select = "//*[@formcontrolname='riskType']/span/span[contains(text(),'Financial')]";
	public String drp_RiskPrimarysource = "//*[@formcontrolname='riskPrimSource']";
	public String drp_RiskPrimarysource_select = "//*[@formcontrolname='riskType']/span/span[contains(text(),'Extortion')]";
	public String drp_RiskSecondarysource = "//*[@formcontrolname='riskSecondSource']";
	public String drp_RiskSecondarysource_select = "//*[@formcontrolname='riskType']/span/span[contains(text(),'Audit')]";
	
	
	
	public void Library() {
		//TODO..........
	}
	
	
	public void verify_RiskLibrary() {
		try {
			
			Thread.sleep(3000);
			clickOn(ERM_Module,"ERM module");
			Thread.sleep(2000);
			clickOn(Module_MouseOver,"slide mouseover");
			Thread.sleep(2000);
			clickOn(lnk_Library,"RiskLibrary tab");
			Thread.sleep(2000);
			clickOn(lnk_RiskLibrary,"RiskLibrary tab");
			Thread.sleep(2000);
			clickOn(logo,"mouseover");
			Thread.sleep(4000);
			
			if(ispresent(lbl_RiskLibrary)) {
				test.log(LogStatus.PASS, "RiskLibrary grid is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "RiskLibrary grid is not displayed");
			}
			
			if(ispresent(btn_ExportAs)) {
				test.log(LogStatus.PASS, "ExportAs button is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "ExportAs button is not displayed");
			}
			
			if(ispresent(btn_CreateRisk)) {
				test.log(LogStatus.PASS, "CreateRisk button is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "CreateRisk button is not displayed");
			}
			
			List<WebElement> griddatacount = driver.findElements(By.xpath(list_grid));
			
			if(griddatacount.size() > 1) {
				test.log(LogStatus.PASS, "RiskLibrary data is displayed");
			}
			else {
				test.log(LogStatus.INFO, "No records found in RiskLibrary grid");
			}
		}
		catch(Exception ex) {
			
		}
	}
	
	
	
	public void createSingleRisk_Validations() {
		try {
			Thread.sleep(3000);
			clickOn(ERM_Module,"ERM module");
			Thread.sleep(2000);
			clickOn(Module_MouseOver,"slide mouseover");
			Thread.sleep(2000);
			clickOn(lnk_Library,"RiskLibrary tab");
			Thread.sleep(2000);
			
			clickOn(lnk_RiskLibrary,"link RiskLibrary");
			Thread.sleep(2000);
			
			clickOn(logo,"mouseover");
			Thread.sleep(4000);
			
			clickOn(btn_CreateRisk,"button RiskLibrary");
			Thread.sleep(2000);
			
			clickOn(btn_SingleRisk,"button singleRisk");
			Thread.sleep(2000);
			
			clickOn(btn_Create,"create RiskLibrary");
			Thread.sleep(2000);
			
			// verify validation msg's........
			verify_validations();
			
		}
		catch(Exception ex) {
			
		}
	}
	
	
	public void verifyBulkRiskPage() {
		try {
			Thread.sleep(3000);
			clickOn(ERM_Module,"ERM module");
			Thread.sleep(2000);
			clickOn(Module_MouseOver,"slide mouseover");
			Thread.sleep(2000);
			clickOn(lnk_Library,"RiskLibrary tab");
			Thread.sleep(2000);
			clickOn(lnk_RiskLibrary,"RiskLibrary tab");
			Thread.sleep(2000);
			clickOn(logo,"mouseover");
			Thread.sleep(4000);
			
			clickOn(btn_CreateRisk,"RiskLibrary tab");
			Thread.sleep(2000);
			
			clickOn(btn_BulkRisk,"RiskLibrary tab");
			Thread.sleep(2000);
						
			// verify validation msg's........
			verify_BulkRiskvalidations();
			
		}
		catch(Exception ex) {
			
		}
	}
	
	
	
	public void verify_validations() {
		try {
			
			if(ispresent(err_RiskName)) {
				test.log(LogStatus.PASS, "RiskName validation msg is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "RiskName validation msg is not displayed");
			}
			
			if(ispresent(err_RiskDesc)) {
				test.log(LogStatus.PASS, "Risk Desc validation msg is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "Risk Desc validation msg is not displayed");
			}
			
			if(ispresent(err_RiskType)) {
				test.log(LogStatus.PASS, "Risk Type validations msg is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "Risk Type validations msg is not displayed");
			}
			
			if(ispresent(err_RiskEventType)) {
				test.log(LogStatus.PASS, "Risk Eventtype validations msg is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "Risk Eventtype validations msg is not displayed");
			}
			
			if(ispresent(err_RiskPrimarysource)) {
				test.log(LogStatus.PASS, "Primarysource validation msg is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "Primarysource validation msg is not displayed");
			}
			
			if(ispresent(err_Risksecondaysource)) {
				test.log(LogStatus.PASS, "secondary validation msg is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "secondary validation msg is not displayed");
			}
			
			if(ispresent(err_RiskCategory)) {
				test.log(LogStatus.PASS, "Risk Category validation msg is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "Risk Category validation msg is not displayed");
			}
		}
		catch(Exception ex) {
			
		}
	}

	
	public void verify_BulkRiskvalidations() {
		try {
			
			if(ispresent(lbl_filestoupload)) {
				test.log(LogStatus.PASS, "Bulkrisk select filestoupload is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "Bulkrisk select filestoupload  is not displayed");
			}
			
			if(ispresent(lbl_uploadExcel)) {
				test.log(LogStatus.PASS, "upload file button is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "upload file button is not displayed");
			}
			
			if(ispresent(btn_bulkriskCreate)) {
				test.log(LogStatus.PASS, "bulkrisk create button is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "bulkrisk create button is not displayed");
			}
			
			if(ispresent(btn_bulkriskCancel)) {
				test.log(LogStatus.PASS, "bulkrisk cancel button is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "bulkrisk cancel button is not displayed");
			}
			
			if(ispresent(btn_uploadexcel)) {
				test.log(LogStatus.PASS, "upload button is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "upload button is not displayed");
			}
		}
		catch(Exception ex) {
			
		}
	}
	
	
	public void createSingleRisk() {
		try {
			
			Thread.sleep(3000);
			clickOn(ERM_Module,"ERM module");
			Thread.sleep(2000);
			clickOn(Module_MouseOver,"slide mouseover");
			Thread.sleep(2000);
			clickOn(lnk_Library,"RiskLibrary tab");
			Thread.sleep(2000);
			
			clickOn(lnk_RiskLibrary,"link RiskLibrary");
			Thread.sleep(2000);
			clickOn(logo,"mouseover");
			Thread.sleep(4000);
			
			clickOn(btn_CreateRisk,"button RiskLibrary");
			Thread.sleep(2000);
			
			clickOn(btn_SingleRisk,"button singleRisk");
			Thread.sleep(2000);
			
			typeIn(txt_RiskName, "test", "RiskName");
			typeIn(txt_Riskdesc, "test desc", "Riskdesc");
			
			clickOn(drp_RiskType, "Risk Type");
			Thread.sleep(2000);
			keypress_Down();
			Thread.sleep(2000);
			clickOn(drp_RiskEventType, "Risk EventType");
			Thread.sleep(2000);
			keypress_Down();
			Thread.sleep(2000);
			clickOn(drp_Riskcategory, "RiskCategory");
			Thread.sleep(2000);
			keypress_Down();
			Thread.sleep(2000);
			clickOn(drp_RiskPrimarysource, "Primary reason source");
			Thread.sleep(2000);
			keypress_Down();
			Thread.sleep(2000);
			clickOn(drp_RiskSecondarysource, "source");
			Thread.sleep(2000);
			keypress_Down();
			Thread.sleep(2000);
			
			
			clickOn(btn_Create,"Create SingleRisk");
			Thread.sleep(2000);
			
		}
		catch(Exception ex) {
			
		}
	}
	
}
