package com.ews.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.ews.baseclass.Baseclass;
import com.relevantcodes.extentreports.LogStatus;

public class UniqueID extends Baseclass {

	public String logo = "//*[@class='ews-logo']";
	public String ERM_Module = "//*[contains(text(),'Enterprise Risk Management')]";
	public String Module_MouseOver = "//*[@class='k-widget k-drawer k-drawer-start']";
	public String lnk_UniqueID = "//*[contains(text(),'Unique ID')]";
	
	public String Tile_Risk = "//*[@class='summary-value1']";
	public String Tile_Control = "//*[@class='summary-value2']";
	public String Tile_KRI = "//*[@class='summary-value3']";
	
	public String lbl_UniqueID = "//*[contains(text(),'Unique ID') and @class='user-details']";
	public String grid_uniqueIDNoRecords = "//tbody[@role='presentation']/tr[@class='k-grid-norecords ng-star-inserted']";
	
	public String btn_CreateUniqueID = "//*[contains(text(),'Create Unique ID')]";
	public String lbl_CreateUniqueID = "//span[contains(text(),'Create Unique ID') and @class='page-header']";
	public String lbl_EditUniqueID = "//span[contains(text(),'Edit Unique ID') and @class='page-header']";
	
	public String txt_OrgValue = "//*[@ng-reflect-name='preferenceOganization']";
	public String txt_year = "//*[@ng-reflect-name='preferenceYear']";
	public String drp_Module = "//*[@ng-reflect-text='Module *']//following-sibling::kendo-dropdownlist";
	public String txt_runningSeries = "//*[@ng-reflect-name='runningSeries']";
	public String btn_UniqueIDPriview = "//*[contains(text(),' Unique ID Preview ')]";
	public String btn_Create = "//button[contains(text(),' Create ')]";
	public String btn_Update = "//button[contains(text(),' Update ')]";
	public String btn_Cancel = "//button[contains(text(),' Cancel ')]";
	public String btn_ExportAs = "//span[contains(text(),'Export As')]";
	
	public String popup_PlsConfirm = "//*[contains(text(),'Please confirm')]";
	public String popup_No = "//button[contains(text(),'No')]";
	
	public void navigate_UniqueIDtab()	{
		try	{
			
			Thread.sleep(3000);
			clickOn(ERM_Module,"ERM module");
			Thread.sleep(2000);
			clickOn(Module_MouseOver,"slide mouseover");
			Thread.sleep(2000);
			clickOn(lnk_UniqueID,"UniqueID link");
			Thread.sleep(2000);
			
			clickOn(logo,"mouseover");
			Thread.sleep(4000);
		}
		catch(Exception ex) {
			System.out.println(ex);
			try {
				getScreenhot(driver, "Exception");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	public void ui_Validation_UniqueID()	{
		try	{
			
			navigate_UniqueIDtab();
			
			takeScreenhot(driver, "Unique id");
			if(ispresent(Tile_Risk))	{
				test.log(LogStatus.PASS, "RiskTile is displayed");
			}
			else	{
				test.log(LogStatus.FAIL, "RiskTile is not displayed");
			}
			
			if(ispresent(Tile_Control))	{
				test.log(LogStatus.PASS, "ControlTile is displayed");
			}
			else	{
				test.log(LogStatus.FAIL, "ControlTile is not displayed");
			}
			
			if(ispresent(Tile_KRI))	{
				test.log(LogStatus.PASS, "KRI is displayed");
			}
			else	{
				test.log(LogStatus.FAIL, "KRI is not displayed");
			}
		}
		catch(Exception ex) {
			System.out.println(ex);
			try {
				getScreenhot(driver, "Exception");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				test.log(LogStatus.FAIL,e.toString());
			}
		}
	}
	
	
	public void navigate_riskTile()	{
		try	{
			
			navigate_UniqueIDtab();
			
			clickOn(Tile_Risk, "RiskTile");
			Thread.sleep(2000);
			
			tile_UIValidations();
			
			createUniqueID();
			
		}
		catch(Exception ex) {
			
		}
	}
	
	
	public void navigate_controlTile()	{
		try	{
			
			navigate_UniqueIDtab();
			
			clickOn(Tile_Control, "Control Tile");
			Thread.sleep(2000);
			
			tile_UIValidations();
			
			createUniqueID();
			
		}
		catch(Exception ex) {
			
		}
	}
	
	public void navigate_kriTile()	{
		try	{
			
			navigate_UniqueIDtab();
			
			clickOn(Tile_KRI, "KRI Tile");
			Thread.sleep(2000);
			
			tile_UIValidations();
			
			createUniqueID();
			
		}
		catch(Exception ex) {
			
		}
	}
	
	public void tile_UIValidations()	{
		try	{
			Thread.sleep(3000);
			if(ispresent(lbl_UniqueID)) {
				test.log(LogStatus.PASS, "unique id is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "unique id is not displayed");
			}
			
			if(ispresent(btn_CreateUniqueID)) {
				test.log(LogStatus.PASS, "create unique id is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "create unique id is not displayed");
			}
			
			if(ispresent(btn_ExportAs)) {
				test.log(LogStatus.PASS, "Export as is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "Export as is not displayed");
			}
			
			List<WebElement> griddatacount = driver.findElements(By.xpath("//table[@role='presentation']/tbody/tr"));
			
			if(griddatacount.size() > 1) {
				test.log(LogStatus.PASS, "uniqueID risk grid data is displayed");
			}
			else {
				test.log(LogStatus.INFO, "No records found in RiskRegister grid");
			}
		}
		catch(Exception ex) {
			
		}
	}
	

	public void createUniqueID()	{
		try	{
			if(ispresent(btn_CreateUniqueID)) {
				test.log(LogStatus.PASS, "CreateUniqueID button is displayed");
				clickOn(btn_CreateUniqueID, "Create Unique ID");
				Thread.sleep(2000);
			}
			else {
				test.log(LogStatus.FAIL, "CreateUniqueID button is not displayed");
			}
			
			if(ispresent(lbl_CreateUniqueID)) {
				test.log(LogStatus.PASS, "CreateUniqueID label is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "CreateUniqueID label is not displayed");
			}
			
			if(ispresent(txt_OrgValue)) {
				test.log(LogStatus.PASS, "ORG Value is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "ORG Value is not displayed");
			}
			
			if(ispresent(txt_runningSeries)) {
				test.log(LogStatus.PASS, "Runningseries is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "Runningseries is not displayed");
			}
			
			if(ispresent(txt_year)) {
				test.log(LogStatus.PASS, "Year is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "Year is not displayed");
			}
			
			if(ispresent(drp_Module)) {
				test.log(LogStatus.PASS, "Module is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "Module is not displayed");
			}
			
			if(ispresent(btn_Create)) {
				test.log(LogStatus.PASS, "Create is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "Create is not displayed");
			}
			
			if(ispresent(btn_Cancel)) {
				test.log(LogStatus.PASS, "Cancel is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "Cancel is not displayed");
			}
			
			if(ispresent(btn_UniqueIDPriview)) {
				test.log(LogStatus.PASS, "ID Preveiw is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "ID Preveiw is not displayed");
			}
			
		}
		catch(Exception ex) {
			
		}
	}
	
	
	public void editUniqueID()	{
		try	{
			
			if(ispresent(lbl_EditUniqueID)) {
				test.log(LogStatus.PASS, "CreateUniqueID label is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "CreateUniqueID label is not displayed");
			}
			
			if(ispresent(txt_OrgValue)) {
				test.log(LogStatus.PASS, "ORG Value is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "ORG Value is not displayed");
			}
			
			if(ispresent(txt_runningSeries)) {
				test.log(LogStatus.PASS, "Runningseries is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "Runningseries is not displayed");
			}
			
			if(ispresent(txt_year)) {
				test.log(LogStatus.PASS, "Year is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "Year is not displayed");
			}
			
			if(ispresent(drp_Module)) {
				test.log(LogStatus.PASS, "Module is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "Module is not displayed");
			}
			
			if(ispresent(btn_Update)) {
				test.log(LogStatus.PASS, "Create is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "Create is not displayed");
			}
			
			if(ispresent(btn_Cancel)) {
				test.log(LogStatus.PASS, "Cancel is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "Cancel is not displayed");
			}
			
			if(ispresent(btn_UniqueIDPriview)) {
				test.log(LogStatus.PASS, "ID Preveiw is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "ID Preveiw is not displayed");
			}
			
		}
		catch(Exception ex) {
			
		}
	}
	
	public void unique_View()	{
		try	{
			List<WebElement> view = driver.findElements(By.xpath("//*[contains(text(),'View')]"));
			
			if(view.size() > 1)	{
				view.get(view.size() -1 ).click();
				Thread.sleep(2000);
				
			}
		}
		catch(Exception ex) {
			
		}
	}
	
	public void unique_Edit()	{
		try	{
			List<WebElement> view = driver.findElements(By.xpath("//*[contains(text(),'Edit')]"));
			
			if(view.size() > 1)	{
				view.get(view.size() -1 ).click();
				Thread.sleep(2000);
				
				editUniqueID();
			}
		}
		catch(Exception ex) {
			
		}
	}
	
	public void unique_Cancel()	{
		try	{
			List<WebElement> view = driver.findElements(By.xpath("//*[contains(text(),'Delete')]"));
			
			if(view.size() > 1)	{
				view.get(view.size() -1 ).click();
				Thread.sleep(2000);
							
				if(ispresent(popup_PlsConfirm))	{
					test.log(LogStatus.PASS, "Delete Popup is displayed");
					clickOn(popup_No, "No button");
					Thread.sleep(2000);
				}
				else {
					test.log(LogStatus.PASS, "Delete popup is not displayed");
				}
			}
		}
		catch(Exception ex) {
			
		}
	}
	
	
	public void unique_ViewValidations()	{
		try	{
			navigate_UniqueIDtab();
			
			clickOn(Tile_Risk, "RiskTile");
			Thread.sleep(2000);
			
			unique_View();
		}
		catch(Exception ex) {
			
		}
	}
	
	public void unique_EditValidations()	{
		try	{
			navigate_UniqueIDtab();
			
			clickOn(Tile_Risk, "RiskTile");
			Thread.sleep(2000);
			
			unique_Edit();
		}
		catch(Exception ex) {
			
		}
	}
	
	
	public void unique_DeleteValidations()	{
		try	{
			navigate_UniqueIDtab();
			
			clickOn(Tile_Risk, "RiskTile");
			Thread.sleep(2000);
			
			unique_Cancel();
		}
		catch(Exception ex) {
			
		}
	}
	
}
