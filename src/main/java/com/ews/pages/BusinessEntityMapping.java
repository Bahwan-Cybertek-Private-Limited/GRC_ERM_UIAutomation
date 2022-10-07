package com.ews.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.ews.baseclass.Baseclass;
import com.relevantcodes.extentreports.LogStatus;

public class BusinessEntityMapping extends Baseclass	{

	public String logo = "//*[@class='ews-logo']";
	public String ERM_Module = "//*[contains(text(),'Enterprise Risk Management')]";
	public String Module_MouseOver = "//*[@class='k-widget k-drawer k-drawer-start']";
	public String lnk_BusinessEntity = "//*[contains(text(),'Business Entity Mapping')]";
	
	public String HierarchyVersions = "//span[contains(text(),'Organization Hierarchy Versions')]";
	
	public String btn_CreateNewVersion = "//*[contains(text(),'Create New Version')]";
	public String lbl_CreateOrgHierarchy = "//*[contains(text(),'Create Organization Hierarchy') and @class='page-header']";
	public String lbl_MidTitle = "//*[contains(text(),' Add Levels ')]";
	public String txt_OrgName = "//*[@formcontrolname='organizationName']";
	public String txt_LevelstoCreate = "//*[@role='spinbutton']";
	public String btn_Threshold_Save = "//button[contains(text(),' Save & Proceed ')]";
	public String btn_Threshold_Cancel = "//*[contains(text(),' Cancel ')]";
	
	public String brdcrumb = "//*[@title='add-organization-hierarchy']";
	public String txt_LevelName = "//*[@formcontrolname='levelName']";
	public String btn_Level_Save = "//*[@formcontrolname='levelName']/following-sibling::button[contains(text(),'Save')]";
	public String lnk_OrgnisationalChart = "//*[contains(text(),'View Organization Chart')]";
	public String btn_AddMember = "//*[contains(text(),'Add Member')]";
	
	public String txt_BoardMemberID = "//tbody[@role='presentation']/tr[1]/td[2]/input";
	public String txt_RegistrationId = "//tbody[@role='presentation']/tr[1]/td[3]/input";
	public String txt_Name = "//tbody[@role='presentation']/tr[1]/td[4]//span[@class='k-icon k-i-arrow-s']";
	public String txt_Designation = "//tbody[@role='presentation']/tr[1]/td[5]";
	public String txt_EmailID = "//tbody[@role='presentation']/tr[1]/td[6]";
	public String txt_ParentID = "//tbody[@role='presentation']/tr[1]/td[7]";
	public String btn_Action_Add = "//*[contains(text(),'Remove')]//following-sibling::button[contains(text(),'Add')]";
	public String btn_Action_Discard = "//*[contains(text(),'Discard')]";
	public String btn_Action_Edit = "//*[contains(text(),'Edit')]";
	public String btn_Action_Remove = "//*[contains(text(),'Remove')]";
	public String btn_BoardMemeber_Save = "//button[contains(text(),' Save & Proceed to Next Level ')]";
	
	public String btn_AddBusinessUnit = "//*[contains(text(),'Add Business Unit')]";
	public String txt_BusinessUnitName = "//tbody[@role='presentation']/tr[1]/td[3]/input";
	public String drp_ParentMapping = "//tbody[@role='presentation']/tr[1]/td[4]";
	public String drp_BLMapping = "//tbody[@role='presentation']/tr[1]/td[5]";
	public String drp_Weightage = "//tbody[@role='presentation']/tr[1]/td[6]";
	public String drp_BUHeadName = "//tbody[@role='presentation']/tr[1]/td[7]//span[@class='k-icon k-i-arrow-s']";
	public String txt_BUHeadEmpID = "//tbody[@role='presentation']/tr[1]/td[8]/input";
	public String txt_BUHeadDesignation = "//tbody[@role='presentation']/tr[1]/td[9]/input";
	public String drp_BURiskOwnerName = "//tbody[@role='presentation']/tr[1]/td[10]//span[@class='k-icon k-i-arrow-s']";
	public String txt_BURiskOwnerID = "//tbody[@role='presentation']/tr[1]/td[11]/input";
	public String txt_BURiskOwnerDesignation = "//tbody[@role='presentation']/tr[1]/td[12]/input";
	public String drp_RiskChampionName = "//tbody[@role='presentation']/tr[1]/td[13]//span[@class='k-icon k-i-arrow-s']";
	public String txt_EMPID = "//tbody[@role='presentation']/tr[1]/td[14]/input";
	public String txt_Designation1 = "//tbody[@role='presentation']/tr[1]/td[15]/input";
	public String btn_BU_Save = "//span[contains(text(),'Save')]";
	
	public String popup_Organisationchart = "//*[@class='k-window-title k-dialog-title']";
	public String popup_Organisationchart_Close = "//*[@class='k-window-actions k-dialog-actions']";
	
	
	
	public void navigate_BusinessEntityMappingtab()	{
		try	{
			
			Thread.sleep(3000);
			clickOn(ERM_Module,"ERM module");
			Thread.sleep(2000);
			clickOn(Module_MouseOver,"slide mouseover");
			Thread.sleep(2000);
			clickOn(lnk_BusinessEntity,"RiskMonitoring link");
			Thread.sleep(2000);
			
			clickOn(logo,"mouseover");
			Thread.sleep(4000);
		}
		catch(Exception ex)	{
			
		}
	}
	
	
	public void UIValidations_CreateRiskKRI()	{
		try	{
			navigate_BusinessEntityMappingtab();
			
			if(ispresent(HierarchyVersions))	{
				test.log(LogStatus.PASS, "HierarchyVersions is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "HierarchyVersions is not displayed");
			}
			
			if(ispresent(btn_CreateNewVersion))	{
				test.log(LogStatus.PASS, "createnewversion button is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "createnewversion button is not displayed");
			}
			
			List<WebElement> gridcount = driver.findElements(By.xpath("//kendo-grid-list[@role='presentation']//tbody/tr"));
			
			if(gridcount.size() > 1)	{
				test.log(LogStatus.PASS, " grid is displayed");
			}
			else {
				test.log(LogStatus.FAIL, " grid is not displayed");
			}
			
		}
		catch(Exception ex)	{
			
		}
	}
	
	
	public void UIValidations_CreateNewVersion()	{
		try	{
			if(ispresent(btn_CreateNewVersion)) {
				clickOn(btn_CreateNewVersion, "create New Version");
				Thread.sleep(2000);
				
				if(ispresent(lbl_CreateOrgHierarchy))	{
					test.log(LogStatus.PASS, "createHierarchy button is displayed");
				}
				else {
					test.log(LogStatus.FAIL, "createHierarchy button is not displayed");
				}
				
				if(ispresent(txt_OrgName))	{
					test.log(LogStatus.PASS, "orgname button is displayed");
				}
				else {
					test.log(LogStatus.FAIL, "orgname button is not displayed");
				}
				
				if(ispresent(txt_LevelstoCreate))	{
					test.log(LogStatus.PASS, "Levelcreate button is displayed");
					
				}
				else {
					test.log(LogStatus.FAIL, "Levelcreate button is not displayed");
				}
				
				if(ispresent(btn_Threshold_Cancel))	{
					test.log(LogStatus.PASS, "save button is displayed");
				}
				else {
					test.log(LogStatus.FAIL, "save button is not displayed");
				}
				
				if(ispresent(btn_Threshold_Save))	{
					test.log(LogStatus.PASS, "Save button is displayed");
				}
				else {
					test.log(LogStatus.FAIL, "save button is not displayed");
				}
			}
			else	{
				test.log(LogStatus.FAIL, "create button is not displayed");
			}
			
		}
		catch(Exception ex)	{
			
		}
	}
	
	
	public void createHierarchy()	{
		try	{
			
				if(ispresent(btn_CreateNewVersion)) {
					clickOn(btn_CreateNewVersion, "create New Version");
					Thread.sleep(2000);
					
					typeIn(txt_OrgName, "orgName", "orgname");
					Thread.sleep(2000);
					
					typeIn(txt_LevelstoCreate, "1", "Levels");
					Thread.sleep(2000);
					
					clickOn(btn_Threshold_Save, "Save button");
					Thread.sleep(2000);
					
					if(ispresent(txt_LevelName))	{
						typeIn(txt_LevelName, "testing", "levelname");
						Thread.sleep(2000);
						
						clickOn(btn_Level_Save, "Save");
						Thread.sleep(2000);
						
						clickOn(btn_AddMember, "Add Member");
						Thread.sleep(2000);
						
					}
				}	
			}
		catch(Exception ex) {
			
		}
	}
	
	
	public void add_level()	{
		try	{
			typeIn(txt_LevelstoCreate, "1", "Levels");
			Thread.sleep(2000);
			
			clickOn(btn_Threshold_Save, "Save button");
			Thread.sleep(2000);
			
			if(ispresent(txt_LevelName))	{
				typeIn(txt_LevelName, "testing", "levelname");
				Thread.sleep(2000);
				
				clickOn(btn_Level_Save, "Save");
				Thread.sleep(2000);
				
				clickOn(btn_AddMember, "Add Member");
				Thread.sleep(2000);
				
			}
		}
		catch(Exception ex) {
			
		}
	}
	
	
	public void viewAction()	{
		try	{
			List<WebElement> viewbutton = driver.findElements(By.xpath("//button[contains(text(),'View')]"));
			
			if(viewbutton.size() > 1)	{
				test.log(LogStatus.PASS, "Viewbutton is displayed");
				
				viewbutton.get(viewbutton.size() - 1).click();
				Thread.sleep(2000);
				
				if(ispresent(lnk_OrgnisationalChart))	{
					test.log(LogStatus.PASS, "View Details page is displayed");
				}
				else {
					test.log(LogStatus.FAIL, "View Details page is not displayed");
				}
			}
			else {
				test.log(LogStatus.FAIL, "Viewbutton is not displayed");
			}
		}
		catch(Exception ex) {
			
		}
	}
	
	public void fillDetails()	{
		try	{
			typeIn(txt_BoardMemberID, "1", "BoardMemberID");
			Thread.sleep(2000);
			
			typeIn(txt_RegistrationId, "2", "BoardMemberID");
			Thread.sleep(2000);
			
			clickOn(txt_Name, "Boardmember Name");
			Thread.sleep(2000);
			keypress_Down();
			Thread.sleep(2000);
			
			clickOn(btn_Action_Add, "Add button");
			Thread.sleep(2000);
			
			clickOn(btn_BoardMemeber_Save, "save button");
			Thread.sleep(2000);
			
			clickOn(btn_AddBusinessUnit, "Add BusinessUnit button");
			Thread.sleep(2000);
			
			typeIn(txt_BusinessUnitName, "BusinessUnit Name", "BU Name");
			Thread.sleep(2000);
			
			clickOn(drp_ParentMapping, "parenting mapping");
			Thread.sleep(2000);
			keypress_Down();
			
			clickOn(drp_BLMapping, "BL mapping");
			Thread.sleep(2000);
			keypress_Down();
			
			clickOn(drp_Weightage, "weightage");
			Thread.sleep(2000);
			keypress_Down();
			
			clickOn(drp_BUHeadName, "BU HeadName");
			Thread.sleep(2000);
			keypress_Down();
			
			clickOn(drp_BURiskOwnerName, "BU RiskOWnerName");
			Thread.sleep(2000);
			keypress_Down();
			
			clickOn(drp_RiskChampionName, "BU Risk Champion Name");
			Thread.sleep(2000);
			keypress_Down();
			
			clickOn(btn_Action_Add, "BU Action Add button");
			Thread.sleep(2000);
			
			clickOn(btn_BU_Save, "BU Save");
			Thread.sleep(2000);
			
		}
		catch(Exception ex)	{
			
		}
	}
	
	
	public void verify_OrganisationChart()	{
		try	{
			
			List<WebElement> viewbutton = driver.findElements(By.xpath("//button[contains(text(),'View')]"));
			
			if(viewbutton.size() > 1)	{
				viewbutton.get(viewbutton.size() - 1).click();
				Thread.sleep(2000);
				
				clickOn(lnk_OrgnisationalChart, "Organisation chart");
				Thread.sleep(2000);
				
				if(ispresent(popup_Organisationchart))	{
					test.log(LogStatus.PASS, "popup Organisation chart is displayed");
					Thread.sleep(2000);
										
					clickOn(popup_Organisationchart_Close, "popup close");
					Thread.sleep(2000);
					
				}				
				
			}
		}
		catch(Exception ex) {
			
		}
	}
	
	
	public void edit_OHG()	{
		try	{
			List<WebElement> editbutton = driver.findElements(By.xpath("//button[contains(text(),'Edit')]"));
			
			if(editbutton.size() > 1)	{
				test.log(LogStatus.PASS, "Editbutton is displayed");
				
				Thread.sleep(2000);
				
				editbutton.get(editbutton.size() - 1).click();
				Thread.sleep(2000);
			}
			else {
				test.log(LogStatus.FAIL, "Editbutton is not displayed");
			}
		}
		catch(Exception ex) {
			
		}
	}
	
	
	public void verify_edit_OHG()	{
		try	{
			List<WebElement> editbutton = driver.findElements(By.xpath("//button[contains(text(),'Edit')]"));
			
			if(editbutton.size() >= 1)	{
				test.log(LogStatus.PASS, "Editbutton is displayed");		
				test.log(LogStatus.PASS, "Data  already present");
			}
			else {
				add_level();
				fillDetails();
			}
		}
		catch(Exception ex) {
			
		}
	}
	
	
	
	
	
}
