package com.ews.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.ews.baseclass.Baseclass;
import com.relevantcodes.extentreports.LogStatus;

public class RiskIdentification extends Baseclass {
	
	public String logo = "//*[@class='ews-logo']";
	public String lbl_Workshop = "(//*[contains(text(),'Workshop')])[2]";
	public String lnk_workshop = "(//*[contains(text(),'Workshop')])[1]";
	public String btn_CreateWorkshop = "(//*[contains(text(),'Create Workshop')])";
	public String lnk_RiskIdentification = "(//*[contains(text(),'Risk Identification')])[1]";
	public String ERM_Module = "//*[contains(text(),'Enterprise Risk Management')]";
	public String Module_MouseOver = "//*[@class='k-widget k-drawer k-drawer-start']";
	
	public String table_WorkshopID = "//*[contains(text(),'Workshop ID')]";
	public String table_WorkshopName = "//*[contains(text(),'Workshop Name')]";
	public String table_Description = "//*[contains(text(),'Description')]";
	public String table_DateofCreation = "//*[contains(text(),'Date of creation')]";
	public String table_Status = "//*[contains(text(),'Status')]";
	public String table_Takeactions = "(//*[contains(text(),'Take Actions')])";
	
	public String lbl_CreateWorkshop = " //span[@class='page-header']";
	public String lbl_WorkshopDetails = " //*[contains(text(),'Workshop Details')]";
	public String txt_workshopName = " //*[@formcontrolname='workshopName']";
	public String txt_workshopconverName = " //*[@formcontrolname='workshopConvenerName']";
	public String txt_Startdate = "(//*[@class='k-dateinput-wrap'])[1]";
	public String txt_Enddate = "(//*[@class='k-dateinput-wrap'])[2]";
	public String txt_workshopAgenda = " //*[@formcontrolname='workshopAgenda']";
	public String txt_workshopPurpose = " //*[@formcontrolname='worskhopPurpose']";
	public String txt_WorkshopRemainder = "( //*[@role='spinbutton'])[3]";
	public String lbl_ParticipantsDetails = "(//*[@class='sub-heading'])[2]";
	public String drp_Department = "//*[@formcontrolname='department']";
	public String drp_Department_select = " //*[@formcontrolname='department']/span/span[1]";
	
	public String txt_RequiredUsers = "//*[@formcontrolname='requiredUsers']";
	public String btn_selectFiles = "//*[@type='file']";
	public String btn_Save = "//*[contains(text(),' Save ')]";
	public String btn_Cancel = "//*[contains(text(),' Cancel ')]";
	public String list_grid = "//*[@class='export-grid-menu-btn k-button']/../../..//following-sibling::div//table/tbody/tr";
	

	
	public RiskIdentification()
	{
		try {
			// TODO..............
		}
		catch(Exception ex) {
			
		}
	}
	
	
	public void verify_RiskAppetite() {
		try {
			
			Thread.sleep(3000);
			clickOn(ERM_Module,"ERM module");
			Thread.sleep(2000);
			clickOn(Module_MouseOver,"slide mouseover");
			Thread.sleep(2000);
			clickOn(lnk_RiskIdentification,"RiskLibrary tab");
			Thread.sleep(2000);
			clickOn(lnk_workshop,"RiskLibrary tab");
			Thread.sleep(2000);
			clickOn(logo,"mouseover");
			Thread.sleep(4000);
						
			if(ispresent(lbl_Workshop)) {
				test.log(LogStatus.PASS, "RiskLibrary grid is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "RiskLibrary grid is not displayed");
			}
			
			if(ispresent(btn_CreateWorkshop)) {
				test.log(LogStatus.PASS, "RiskLibrary grid is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "RiskLibrary grid is not displayed");
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
	
	
	
	
	public void verfiyGrid()
	{
		try {
			
			Thread.sleep(3000);
			clickOn(ERM_Module,"ERM module");
			Thread.sleep(2000);
			clickOn(Module_MouseOver,"slide mouseover");
			Thread.sleep(2000);
			clickOn(lnk_RiskIdentification,"RiskLibrary tab");
			Thread.sleep(2000);
			clickOn(lnk_workshop,"RiskLibrary tab");
			Thread.sleep(2000);
			clickOn(logo,"mouseover");
			Thread.sleep(4000);
			
			if(ispresent(table_DateofCreation)) {
				test.log(LogStatus.PASS, "RiskLibrary grid is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "RiskLibrary grid is not displayed");
			}
			
			if(ispresent(table_Description)) {
				test.log(LogStatus.PASS, "RiskLibrary grid is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "RiskLibrary grid is not displayed");
			}
			
			if(ispresent(table_Status)) {
				test.log(LogStatus.PASS, "RiskLibrary grid is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "RiskLibrary grid is not displayed");
			}
			
			if(ispresent(table_Takeactions)) {
				test.log(LogStatus.PASS, "RiskLibrary grid is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "RiskLibrary grid is not displayed");
			}
			
			if(ispresent(table_WorkshopID)) {
				test.log(LogStatus.PASS, "RiskLibrary grid is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "RiskLibrary grid is not displayed");
			}
			
			
			if(ispresent(table_WorkshopName)) {
				test.log(LogStatus.PASS, "RiskLibrary grid is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "RiskLibrary grid is not displayed");
			}
			
			
			
			
		}
		catch(Exception ex) {
			
		}
	}
	
	
	public void cancel_workshop() {
		try {
			Thread.sleep(3000);
			clickOn(ERM_Module,"ERM module");
			Thread.sleep(2000);
			clickOn(Module_MouseOver,"slide mouseover");
			Thread.sleep(2000);
			clickOn(lnk_RiskIdentification,"RiskLibrary tab");
			Thread.sleep(2000);
			clickOn(lnk_workshop,"RiskLibrary tab");
			Thread.sleep(2000);
			clickOn(logo,"mouseover");
			Thread.sleep(4000);
			
			clickOn(btn_CreateWorkshop,"RiskLibrary tab");
			Thread.sleep(2000);
			
			
			clickOn(btn_Cancel,"RiskLibrary tab");
			Thread.sleep(2000);
		}
		catch(Exception ex) {
			
		}
	}
	
	
	public void createRiskworkshop() {
		try {
			
			Thread.sleep(3000);
			clickOn(ERM_Module,"ERM module");
			Thread.sleep(2000);
			clickOn(Module_MouseOver,"slide mouseover");
			Thread.sleep(2000);
			clickOn(lnk_RiskIdentification,"RiskLibrary tab");
			Thread.sleep(2000);
			clickOn(lnk_workshop,"RiskLibrary tab");
			Thread.sleep(2000);
			clickOn(logo,"mouseover");
			Thread.sleep(4000);
			
			if(ispresent(lbl_Workshop)) {
				test.log(LogStatus.PASS, "RiskLibrary grid is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "RiskLibrary grid is not displayed");
			}
			
			
			clickOn(btn_CreateWorkshop,"RiskLibrary tab");
			Thread.sleep(2000);
			
			
			if(ispresent(lbl_WorkshopDetails)) {
				test.log(LogStatus.PASS, "RiskLibrary grid is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "RiskLibrary grid is not displayed");
			}
			
			if(ispresent(txt_workshopName)) {
				test.log(LogStatus.PASS, "RiskLibrary grid is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "RiskLibrary grid is not displayed");
			}
			
			if(ispresent(txt_workshopconverName)) {
				test.log(LogStatus.PASS, "RiskLibrary grid is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "RiskLibrary grid is not displayed");
			}
			
			if(ispresent(txt_Startdate)) {
				test.log(LogStatus.PASS, "RiskLibrary grid is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "RiskLibrary grid is not displayed");
			}
			
			if(ispresent(txt_Enddate)) {
				test.log(LogStatus.PASS, "RiskLibrary grid is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "RiskLibrary grid is not displayed");
			}
		}
		catch(Exception ex) {
			
		}
	}
	
	
	
	public void riskidentification_ParticipantsDetails()
	{
		try {
			
		}
		catch(Exception ex) {
			
		}
	}
}
