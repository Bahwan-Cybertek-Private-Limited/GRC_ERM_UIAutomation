package com.ews.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.ews.baseclass.Baseclass;
import com.relevantcodes.extentreports.LogStatus;

public class RiskMonitoring extends Baseclass	{
	
	public String logo = "//*[@class='ews-logo']";
	public String ERM_Module = "//*[contains(text(),'Enterprise Risk Management')]";
	public String Module_MouseOver = "//*[@class='k-widget k-drawer k-drawer-start']";
	public String lnk_RiskMonitoring = "//*[contains(text(),'Risk Monitoring')]";
	public String lnk_CreateKRI = "//*[contains(text(),'Create KRI')]";
	public String lbl_KeyRiskIndicators = "//span[contains(text(),'Key Risk Indicators')]";
	public String btn_CreateKRI = "//button[contains(text(),'Create KRI')]";
	
	// grid count
	//kendo-grid-list[@role='presentation']//tr
	
	public String lbl_CreateKRI = "//span[contains(text(),'Create KRI')]/parent::kendo-splitter-pane/span";
	public String txt_KRIName = "//*[@ng-reflect-name='kriName']";
	public String txt_KRIDesc = "//*[@ng-reflect-name='kriDesc']";
	public String drp_NatureofKRI = "//*[@ng-reflect-name='natureOfKri']";
	public String drp_RiskIndicatorType = "//*[@ng-reflect-name='riskIndicatorType']";
	public String drp_EnterpriseKI = "//*[@ng-reflect-name='enterpriseKi']";
	public String btn_Cancel = "(//*[contains(text(),' Cancel ')])[1]";
	public String btn_Create = "//span[contains(text(),'Create KRI')]/parent::kendo-splitter-pane/parent::div//following-sibling::div//*[contains(text(),' Create ')]";
	
	//view button count
	//button[contains(text(),'View')]
	
	public String lbl_ViewKRI = "//*[contains(text(),'View KRI')]/parent::kendo-splitter-pane";
	public String btn_ViewKRI_Edit = "//*[contains(text(),'View KRI')]/parent::kendo-splitter-pane/parent::div/parent::div//following-sibling::div/button[@ng-reflect-icon='edit']";
	public String btn_ViewKRI_Back = "//*[contains(text(),'View KRI')]/parent::kendo-splitter-pane/parent::div/parent::div//following-sibling::div/button[@ng-reflect-icon='columns']";
	public String lbl_KRIName = "//*[@class='main-divider']//div[contains(text(),'KRI Name')]";
	public String lbl_KRIDesc = "//*[@class='main-divider']//div[contains(text(),'Description')]";
	public String lbl_NatureofKRI = "//*[@class='main-divider']//div[contains(text(),'Nature of KRI')]";
	public String lbl_RiskIndicatorType = "//*[@class='main-divider']//div[contains(text(),'Risk Indicator Type')]";
	public String lbl_EnterpriseKRI = "//*[@class='main-divider']//div[contains(text(),'Enterprise KI')]";
	public String lbl_KRIID = "//*[@class='main-divider']//div[contains(text(),'KRI ID')]";
	
	
	//map button count
	//button[contains(text(),'Map')]
	
	public String lbl_MapKRI = "//span[contains(text(),'Map KRI')]/parent::kendo-splitter-pane";
	public String subtab_MapBusinessLine = "//*[contains(text(),'Map Business Line')]";
	public String subtab_ThresholdDefinition = "//*[contains(text(),'Threshold Definition')]";
	public String subtab_Formula = "//*[contains(text(),'Formula')]";
	public String subtab_OtherDetails = "//*[contains(text(),'Other Details')]";
	public String subtab_MapRiskandControlRegister = "//*[contains(text(),'Map KRI to Risk & Control Register')]";
	
	//Map Business Line...
	public String drp_BusinessLin1 = "//*[@ng-reflect-name='buninessLineOne']";
	public String drp_BusinessLin2 = "//*[@ng-reflect-name='buninessLineTwo']";
	public String drp_RiskEventType1 = "//*[@ng-reflect-name='riskEventTypeOne']";
	public String drp_RiskEventType2 = "//*[@ng-reflect-name='riskEventTypeTwo']";
	public String drp_RiskCategory = "//*[@ng-reflect-name='riskCategory']";
	public String drp_CauseCategory = "//*[@ng-reflect-name='causeCategory']";
	public String drp_Location = "//*[@ng-reflect-name='location']";
	public String drp_dataCollection = "//*[@ng-reflect-name='dataCollection']";
	public String drp_countDataCollectionField = "//*[@ng-reflect-name='countDataCollectField']";
	public String drp_Owner = "//*[@ng-reflect-name='owner']";
	public String btn_Map_Save = "//*[contains(text(),' Save ')]";
	public String btn_Map_Cancel = "//*[contains(text(),' Cancel ')]";
	public String btn_Map_Edit = "//*[contains(text(),' Edit ')]";
	public String btn_Map_Update = "//*[contains(text(),' Update ')]";
	
	//Threshold Definition..
	public String Currency = "//*[@formcontrolname='currency']";
	public String Threshold = "//*[@formcontrolname='threshold']";
	public String MeasuringScale = "//*[@formcontrolname='measuringScale']";
	public String warningLevel = "//*[@formcontrolname='warningLevel']/input";
	public String EscalationLevel = "//*[@formcontrolname='escalationLevel']/input";
	public String btn_Threshold_Save = "//*[contains(text(),' Save ')]";
	public String btn_Threshold_Cancel = "//*[contains(text(),' Cancel ')]";
	public String btn_threshold_Edit = "//*[contains(text(),' Edit ')]";
	public String btn_threshold_Update = "//*[contains(text(),' Update ')]";
	
	//Formula...
	public String fieldName1 = "//*[@formcontrolname='fieldNameOne']/input";
	public String fieldName2 = "//*[@formcontrolname='fieldNameTwo']/input";
	public String drp_Formaula = "//*[@formcontrolname='formula']";
	public String txtarea_Description  = "//*[@formcontrolname='description']";
	public String btn_Formula_Save = "//*[contains(text(),' Save ')]";
	public String btn_Formula_Cancel = "//*[contains(text(),' Cancel ')]";
	public String btn_formula_Edit = "//*[contains(text(),' Edit ')]";
	public String btn_formula_Update = "//*[contains(text(),' Update ')]";
	
	//Other Details...
	public String lnk_cal_Today = "//*[@class='k-today']";
	public String lnk_StartDate = "(//*[@title='Toggle calendar'])[1]";
	public String drp_ReviewFrequency = "//*[@formcontrolname='reviewFrequency']";
	public String uploadFile = "//*[@class='k-button k-upload-button']/input";
	public String btn_OtherDetails_Save = "//*[contains(text(),' Save ')]";
	public String btn_OtherDetails_Cancel = "//*[contains(text(),' Cancel ')]";
	
	//MapKRI and Control Register ...
	public String btn_MaptoKRI = "//*[contains(text(),' Map to KRI ')]";
	public String chk_MapKRIRiskCheckbox = "//*[contains(text(),' Map to KRI ')]/parent::div//following-sibling::div//kendo-grid-list//tr[1]/td[1]";
	//map kri notification
	public String lbl_MapKRIInserted = "//*[@role='tabpanel']//div[@class='ng-star-inserted']//kendo-grid-list//tr[@class='k-master-row ng-star-inserted']";
	
	public String plsConfirm = "//*[contains(text(),'Please confirm')]";
	public String yes = "//*[@class='ng-tns-c453-5 k-dialog-buttongroup k-dialog-button-layout-stretched ng-star-inserted']/button[contains(text(),'Yes')]";
	
	public String popup_Yes = "//button[contains(text(),'Yes')]";
	public String popup_No = "//button[contains(text(),'No')]";
	//Update KRI TAB...
	public String lnk_UpdateKRI = "//*[contains(text(),'Update KRI Metrics')]";
	public String lbl_UpdateKRIMetrics = "//div[contains(text(),'Update KRI Metrics')]";
	// get grid coutn
	//div[contains(text(),'Update KRI Metrics')]/parent::div//kendo-grid//tr
	
	//get update kri button count
	//button[contains(text(),'Update KRI') and @aria-disabled='false']
	
	//get coutn for RISK ID
	//*[@class='page-wrapper ng-untouched ng-pristine ng-invalid']/div[3]//kendo-grid-list//tr
	
	public String drp_Frequency = "//*[@formcontrolname='frequency']";
	public String drp_FinancialYear = "//*[@formcontrolname='financialYear']";
	public String Attrition = "//*[@formcontrolname='fieldOneValue']/input";
	public String Remarks = "//*[@formcontrolname='remarks']";
	public String UploadFile1 = "//*[@class='k-button k-upload-button']";
	public String btn_RiskIDDetails_Save = "//*[contains(text(),' Save ')]";
	public String btn_RiskIDDetails_Cancel = "//*[contains(text(),' Cancel ')]";
	
	public String lbl_LastUpdatedDetails = "//*[contains(text(),'Last updated details')]";
	
	//View KRI TAB...
	public String lnk_ViewKRI = "//*[contains(text(),'View KRI')]";
	public String lbl_CreationDate = "//*[contains(text(),' Creation Date ')]";
		
	public String btn_GetAllData = "//*[contains(text(),'Get All Data')]";		
	public String btn_Search = "//*[contains(text(),' Search ')]";
	public String grid_Keyindicators = "//*[contains(text(),'Key Risk Indicators')]";
	public String btn_ExportAs = "//*[@class='export-grid-menu-btn k-button']";
	public String gridwithdate_Norecords = "(//table[@role='presentation'])[2]//tr[@class='k-grid-norecords']";
	public String lnk_FromCal = "(//*[@title='Toggle calendar'])[1]";
	public String lnk_ToCal = "(//*[@title='Toggle calendar'])[2]";
	
	

	
	
	public void navigate_RiskMonitoringtab()	{
		try	{
			
			Thread.sleep(3000);
			clickOn(ERM_Module,"ERM module");
			Thread.sleep(2000);
			clickOn(Module_MouseOver,"slide mouseover");
			Thread.sleep(2000);
			clickOn(lnk_RiskMonitoring,"RiskMonitoring link");
			Thread.sleep(2000);
			clickOn(lnk_CreateKRI,"CreateKRI link");
			Thread.sleep(2000);
			
			clickOn(logo,"mouseover");
			Thread.sleep(4000);
		}
		catch(Exception ex)	{
			
		}
	}
	
	
	public void UIValidations_CreateRiskKRI()	{
		try	{
			if(ispresent(lbl_KeyRiskIndicators))	{
				test.log(LogStatus.PASS, "RiskAssesment is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "RiskAssesment is not displayed");
			}
			
			if(ispresent(btn_CreateKRI))	{
				test.log(LogStatus.PASS, "ExportAs button is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "ExportAs button is not displayed");
			}
			
			List<WebElement> gridcount = driver.findElements(By.xpath("//kendo-grid-list[@role='presentation']//tbody/tr"));
			
			if(gridcount.size() > 1)	{
				test.log(LogStatus.PASS, "RiskAssesment grid is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "RiskAssesment grid is not displayed");
			}
			
		}
		catch(Exception ex)	{
			
		}
	}
	
	
	public void createKRI()	{
		try	{
			clickOn(btn_CreateKRI, "CreateKRI button");
			Thread.sleep(2000);
			
			if(ispresent(lbl_CreateKRI))	{
				test.log(LogStatus.PASS, "CreateKRI page is displayed");
				
				typeIn(txt_KRIName, "KRIName", "KRIName");
				Thread.sleep(2000);
				
				typeIn(txt_KRIDesc, "KRIDesc", "KRIDesc");
				Thread.sleep(2000);
				
				clickOn(drp_NatureofKRI, "Nature of KRI");
				Thread.sleep(2000);
				keypress_Down();
				Thread.sleep(2000);
				
				clickOn(drp_RiskIndicatorType, "RiskIndicatorType");
				Thread.sleep(2000);
				keypress_Down();
				Thread.sleep(2000);
				
				clickOn(drp_EnterpriseKI, "Enterprise KRI");
				Thread.sleep(2000);
				keypress_Down();
				Thread.sleep(2000);
				
				clickOn(btn_Create, "Create KRI");
				Thread.sleep(2000);
				
				String update_msg = "//*[@class='k-notification-content']";
				System.out.println(update_msg);
				if(getText(update_msg, "update msg").contains("KRI is Created")) {
					successmsg("KRI Create", update_msg);
				}
				else {
					failmsg("KRI Create", "success msg is not displayed..");
				}
			}
			else {
				test.log(LogStatus.FAIL, "CreateKRI page is not displayed");
			}
			
		}
		catch(Exception ex) {
			
		}
	}
	
	
	public void cancelKRI()	{
		try	{
			clickOn(btn_CreateKRI, "CreateKRI button");
			Thread.sleep(2000);
			
			if(ispresent(btn_Cancel))	{
				test.log(LogStatus.PASS, "CreateKRI page is displayed");
				
				clickOn(btn_Cancel, "Cancel KRI");
				Thread.sleep(2000);
			}
			else {
				test.log(LogStatus.FAIL, "CreateKRI page is not displayed");
			}
		}
		catch(Exception ex)	{
			
		}
	}
	
	
	public void viewKRI()	{
		try	{
			List<WebElement> viewbutton = driver.findElements(By.xpath("//button[contains(text(),'View')]"));
			
			if(viewbutton.size() > 1) {
				test.log(LogStatus.PASS, "ViewKRI button is displayed");
				
				viewbutton.get(2).click();
				
				if(ispresent(lbl_ViewKRI))	{
					test.log(LogStatus.PASS, "ViewKRI page is displayed");
					
					if(ispresent(btn_ViewKRI_Edit))	{
						test.log(LogStatus.PASS, "ViewKRI edit button is displayed");
					}
					else {
						test.log(LogStatus.FAIL, "ViewKRI edit button is not displayed");
					}
					
					if(ispresent(btn_ViewKRI_Back))	{
						test.log(LogStatus.PASS, "ViewKRI back button is displayed");
					}
					else {
						test.log(LogStatus.FAIL, "ViewKRI back button is not displayed");
					}
					
					if(ispresent(lbl_KRIName))	{
						test.log(LogStatus.PASS, "KRI Name is displayed");
					}
					else {
						test.log(LogStatus.FAIL, "KRI Name is not displayed");
					}
					
					if(ispresent(lbl_KRIDesc))	{
						test.log(LogStatus.PASS, "KRI Desc is displayed");
					}
					else {
						test.log(LogStatus.FAIL, "KRI Desc is not displayed");
					}
					
					if(ispresent(lbl_RiskIndicatorType))	{
						test.log(LogStatus.PASS, "RiskIndicators is displayed");
					}
					else {
						test.log(LogStatus.FAIL, "RiskIndicators is not displayed");
					}
					
					if(ispresent(lbl_NatureofKRI))	{
						test.log(LogStatus.PASS, "NatureofKRI is displayed");
					}
					else {
						test.log(LogStatus.FAIL, "NatureofKRI is not displayed");
					}
					
					if(ispresent(lbl_EnterpriseKRI))	{
						test.log(LogStatus.PASS, "EnterpriseKRI is displayed");
					}
					else {
						test.log(LogStatus.FAIL, "EnterpriseKRI is not displayed");
					}
					
					if(ispresent(lbl_KRIID))	{
						test.log(LogStatus.PASS, "KRI ID is displayed");
					}
					else {
						test.log(LogStatus.FAIL, "KRI ID is not displayed");
					}
				}
				else 	{
					test.log(LogStatus.FAIL, "ViewKRI page is not displayed");
				}
			}
			else 	{
				test.log(LogStatus.FAIL, "ViewKRI button is not displayed");
			}
		}
		catch(Exception ex) {
			
		}
	}
	
	
	public void viewKRI_Back()	{
		try	{
			List<WebElement> viewbutton = driver.findElements(By.xpath("//button[contains(text(),'View')]"));
			
			if(viewbutton.size() > 1) {
				test.log(LogStatus.PASS, "ViewKRI button is displayed");
				
				viewbutton.get(2).click();
				
				if(ispresent(lbl_ViewKRI))	{
					test.log(LogStatus.PASS, "ViewKRI page is displayed");
					
					clickOn(btn_ViewKRI_Back, "ViewKRI Backbutton");
					Thread.sleep(2000);
				}
				else {
					test.log(LogStatus.FAIL, "ViewKRI page is not displayed");
				}
			}
			else 	{
				test.log(LogStatus.FAIL, "ViewKRI button is not displayed");
			}
		}
		catch(Exception ex) {
			
		}
	}
	
	
	public void viewKRI_Edit()	{
		try	{
			List<WebElement> viewbutton = driver.findElements(By.xpath("//button[contains(text(),'View')]"));
			
			if(viewbutton.size() > 1) {
				test.log(LogStatus.PASS, "ViewKRI button is displayed");
				
				viewbutton.get(2).click();
				
				if(ispresent(lbl_ViewKRI))	{
					test.log(LogStatus.PASS, "ViewKRI page is displayed");
					
					clickOn(btn_ViewKRI_Edit, "ViewKRI edit button");
					Thread.sleep(2000);
					
					editRisk();
				}
				else {
					test.log(LogStatus.FAIL, "ViewKRI page is not displayed");
				}
			}
			else 	{
				test.log(LogStatus.FAIL, "ViewKRI button is not displayed");
			}
		}
		catch(Exception ex) {
			
		}
	}
	
	
	public void viewKRI_EditCancel()	{
		try	{
			List<WebElement> viewbutton = driver.findElements(By.xpath("//button[contains(text(),'View')]"));
			
			if(viewbutton.size() > 1) {
				test.log(LogStatus.PASS, "ViewKRI button is displayed");
				
				viewbutton.get(2).click();
				
				if(ispresent(lbl_ViewKRI))	{
					test.log(LogStatus.PASS, "ViewKRI page is displayed");
					
					clickOn(btn_ViewKRI_Edit, "ViewKRI edit button");
					Thread.sleep(2000);
					
					if(ispresent(txt_KRIName))	{
						test.log(LogStatus.PASS, "RISK EDIT page is displayed");
						
						clickOn(btn_Cancel, "Cancel edit risk");
						Thread.sleep(2000);
					}
					else {
						test.log(LogStatus.FAIL, "RISK EDIT page is not displayed");
					}				
					
				}
				else {
					test.log(LogStatus.FAIL, "ViewKRI page is not displayed");
				}
			}
			else 	{
				test.log(LogStatus.FAIL, "ViewKRI button is not displayed");
			}
		}
		catch(Exception ex) {
			
		}
	}
	
	
	
	public void editRisk()	{
		try	{
			typeIn(txt_KRIName, "KRI Name", "KRI Name");
			Thread.sleep(2000);
			
			typeIn(txt_KRIDesc, "KRI Desc", "KRI Desc");
			Thread.sleep(2000);
			
			clickOn(drp_NatureofKRI, "Nature of KRI");
			Thread.sleep(2000);
			keypress_Down();
			Thread.sleep(2000);
			
			clickOn(drp_RiskIndicatorType, "RiskIndicator type of KRI");
			Thread.sleep(2000);
			keypress_Down();
			Thread.sleep(2000);
			
			clickOn(drp_EnterpriseKI, "Enterprise KI");
			Thread.sleep(2000);
			keypress_Down();
			Thread.sleep(2000);
			
			clickOn(btn_RiskIDDetails_Save, "Save button");
			Thread.sleep(2000);
		}
		catch(Exception ex) {
			
		}
	}
	
	
	public void map_UI()	{
		try	{
			List<WebElement> mapbutton = driver.findElements(By.xpath("//button[contains(text(),'Map')]"));
			
			if(mapbutton.size() > 1) {
				test.log(LogStatus.PASS, "MAP KRI button is displayed");
				
				mapbutton.get(2).click();
				
				if(ispresent(lbl_MapKRI))	{
					test.log(LogStatus.PASS, "MAP KRI page is displayed");
										
					if(ispresent(lbl_KRIName))	{
						test.log(LogStatus.PASS, "KRI Name is displayed");
					}
					else {
						test.log(LogStatus.FAIL, "KRIName is not displayed");
					}
					
					if(ispresent(lbl_KRIDesc))	{
						test.log(LogStatus.PASS, "KRIDesc is displayed");
					}
					else {
						test.log(LogStatus.FAIL, "KRIDesc is not displayed");
					}
					
					if(ispresent(lbl_RiskIndicatorType))	{
						test.log(LogStatus.PASS, "RiskIndicator is displayed");
					}
					else {
						test.log(LogStatus.FAIL, "RiskIndicator is not displayed");
					}
					
					if(ispresent(lbl_NatureofKRI))	{
						test.log(LogStatus.PASS, "NatureofKRI is displayed");
					}
					else {
						test.log(LogStatus.FAIL, "NatureofKRI is not displayed");
					}
					
					if(ispresent(lbl_EnterpriseKRI))	{
						test.log(LogStatus.PASS, "EnterpriseKRI is displayed");
					}
					else {
						test.log(LogStatus.FAIL, "EnterpriseKRI is not displayed");
					}
					
					if(ispresent(lbl_KRIID))	{
						test.log(LogStatus.PASS, "KRIID is displayed");
					}
					else {
						test.log(LogStatus.FAIL, "KRIID is not displayed");
					}
					
					if(ispresent(subtab_MapBusinessLine))	{
						test.log(LogStatus.PASS, "Map BusinessLine is displayed");
					}
					else {
						test.log(LogStatus.FAIL, "Map BusinessLine is not displayed");
					}
					
					if(ispresent(subtab_Formula))	{
						test.log(LogStatus.PASS, "Formula is displayed");
					}
					else {
						test.log(LogStatus.FAIL, "Formula is not displayed");
					}
					if(ispresent(subtab_MapRiskandControlRegister))	{
						test.log(LogStatus.PASS, "MapRiskandControlRegister is displayed");
					}
					else {
						test.log(LogStatus.FAIL, "MapRiskandControlRegister is not displayed");
					}
					if(ispresent(subtab_ThresholdDefinition))	{
						test.log(LogStatus.PASS, "ThresholdDefinition is displayed");
					}
					else {
						test.log(LogStatus.FAIL, "ThresholdDefinition is not displayed");
					}
					if(ispresent(subtab_OtherDetails))	{
						test.log(LogStatus.PASS, "Other Details tab is displayed");
					}
					else {
						test.log(LogStatus.FAIL, "Other Details tab is not displayed");
					}
					
				}
				else 	{
					test.log(LogStatus.FAIL, "MAP KRI page is not displayed");
				}
			}
			else 	{
				test.log(LogStatus.FAIL, "MAP KRI button is not displayed");
			}
		}
		catch(Exception ex) {
			
		}
	}
	
	
	public void map_BusinessLine()	{
		try	{
			List<WebElement> mapbutton = driver.findElements(By.xpath("//button[contains(text(),'Map')]"));
			
			if(mapbutton.size() > 1) {
				test.log(LogStatus.PASS, "MAP KRI button is displayed");
				
				mapbutton.get(2).click();
				
				if(ispresent(lbl_MapKRI))	{
					test.log(LogStatus.PASS, "MAP KRI page is displayed");
										
					clickOn(subtab_MapBusinessLine, "Map business line");
					Thread.sleep(2000);
					
					if(ispresent(btn_Map_Edit))	{
						businessLine_update();
					}
					else	{
						businessLine();
					}
				}
				else 	{
					test.log(LogStatus.FAIL, "MAP KRI page is not displayed");
				}
			}
			else 	{
				test.log(LogStatus.FAIL, "MAP KRI button is not displayed");
			}
		}
		catch(Exception ex) {
			
		}
	}
	
	
	public void businessLine()	{
		try	{
			clickOn(drp_BusinessLin1, "BusinessLine1");
			Thread.sleep(2000);
			keypress_Down();
			Thread.sleep(2000);
			
			clickOn(drp_BusinessLin2, "BusinessLine2");
			Thread.sleep(2000);
			keypress_Down();
			Thread.sleep(2000);
			
			clickOn(drp_RiskEventType1, "RiskEventType1");
			Thread.sleep(2000);
			keypress_Down();
			Thread.sleep(2000);
			
			clickOn(drp_RiskEventType2, "RiskEventType2");
			Thread.sleep(2000);
			keypress_Down();
			Thread.sleep(2000);
			
			clickOn(drp_RiskCategory, "RiskCategory");
			Thread.sleep(2000);
			keypress_Down();
			Thread.sleep(2000);
			
			clickOn(drp_CauseCategory, "CauseCategory");
			Thread.sleep(2000);
			keypress_Down();
			Thread.sleep(2000);
			
			clickOn(drp_Location, "Location");
			Thread.sleep(2000);
			keypress_Down();
			Thread.sleep(2000);
			
			clickOn(drp_dataCollection, "datacollection");
			Thread.sleep(2000);
			keypress_Down();
			Thread.sleep(2000);
			
			JavascriptExecutor js = (JavascriptExecutor) driver;			 
		    //specify the number of pixels the page has to be scrolled
		    js.executeScript("window.scrollBy(0,4000)");		       
		    Thread.sleep(2000);
			clickOn(drp_countDataCollectionField, "countDataCollectionField");
			Thread.sleep(2000);
			keypress_Down();
			Thread.sleep(2000);
			
			clickOn(drp_Owner, "Owner");
			Thread.sleep(2000);
			keypress_Down();
			Thread.sleep(2000);
			
			clickOn(btn_Map_Save, "Save Map");
			Thread.sleep(5000);
			
			String update_msg = "//*[@class='k-notification-content']";
			System.out.println(update_msg);
			if(getText(update_msg, "update msg").contains("Business Line Mapping is Created")) {
				successmsg("Business Line is created", update_msg);
			}
			else {
				failmsg("KRI Create", "success msg is not displayed..");
			}
		}
		catch(Exception ex) {
			
		}
	}
	
	
	public void businessLine_update()	{
		try	{
			
			if(ispresent(btn_Map_Edit))	{
					
				test.log(LogStatus.PASS, "MAP Edit button is displayed");
				
				clickOn(btn_Map_Edit, "Business Line Edit button");
				Thread.sleep(2000);
				
				clickOn(drp_BusinessLin1, "BusinessLine1");
				Thread.sleep(2000);
				keypress_Down();
				Thread.sleep(2000);
				
				clickOn(drp_BusinessLin2, "BusinessLine2");
				Thread.sleep(2000);
				keypress_Down();
				Thread.sleep(2000);
				
				clickOn(drp_RiskEventType1, "RiskEventType1");
				Thread.sleep(2000);
				keypress_Down();
				Thread.sleep(2000);
				
				clickOn(drp_RiskEventType2, "RiskEventType2");
				Thread.sleep(2000);
				keypress_Down();
				Thread.sleep(2000);
				
				clickOn(drp_RiskCategory, "RiskCategory");
				Thread.sleep(2000);
				keypress_Down();
				Thread.sleep(2000);
				
				clickOn(drp_CauseCategory, "CauseCategory");
				Thread.sleep(2000);
				keypress_Down();
				Thread.sleep(2000);
				
				clickOn(drp_Location, "Location");
				Thread.sleep(2000);
				keypress_Down();
				Thread.sleep(2000);
				
				clickOn(drp_dataCollection, "datacollection");
				Thread.sleep(2000);
				keypress_Down();
				Thread.sleep(2000);
				
				JavascriptExecutor js = (JavascriptExecutor) driver;			 
			    //specify the number of pixels the page has to be scrolled
			    js.executeScript("window.scrollBy(0,4000)");		       
			    Thread.sleep(2000);
				clickOn(drp_countDataCollectionField, "countDataCollectionField");
				Thread.sleep(2000);
				keypress_Down();
				Thread.sleep(2000);
				
				clickOn(drp_Owner, "Owner");
				Thread.sleep(2000);
				keypress_Down();
				Thread.sleep(2000);
				
				clickOn(btn_Map_Update, "Map update");
				Thread.sleep(5000);
				
				String update_msg = "//*[@class='k-notification-content']";
				System.out.println(update_msg);
				if(getText(update_msg, "update msg").contains("Business Line Mapping updated")) {
					successmsg("Business Line is created", update_msg);
				}
				else {
					failmsg("KRI Create", "success msg is not displayed..");
				}
			}
			else	{
				test.log(LogStatus.FAIL, "MAP Edit button is not displayed");
			}
		}
		catch(Exception ex) {
			
		}
	}
	
	
	public void map_Threshold()	{
		try	{
			List<WebElement> mapbutton = driver.findElements(By.xpath("//button[contains(text(),'Map')]"));
			
			if(mapbutton.size() > 1) {
				test.log(LogStatus.PASS, "MAP KRI button is displayed");
				
				mapbutton.get(2).click();
				
				if(ispresent(lbl_MapKRI))	{
					test.log(LogStatus.PASS, "MAP KRI page is displayed");
										
					clickOn(subtab_ThresholdDefinition, "Map Threshold");
					Thread.sleep(2000);
					
					if(ispresent(btn_Map_Edit))	{
						thesholdDefinition_Update();
					}
					else	{
						thesholdDefinition();
					}
				}
				else 	{
					test.log(LogStatus.FAIL, "MAP KRI page is not displayed");
				}
			}
			else 	{
				test.log(LogStatus.FAIL, "MAP KRI button is not displayed");
			}
		}
		catch(Exception ex) {
			
		}
	}
	
	
	public void thesholdDefinition() {
		try	{
			clickOn(subtab_ThresholdDefinition, "Threshold Definition");
			Thread.sleep(2000);
						
			clickOn(Currency, "currency");
			Thread.sleep(2000);
			keypress_Down();
			Thread.sleep(2000);
			
			clickOn(Threshold, "Threshold");
			Thread.sleep(2000);
			keypress_Down();
			Thread.sleep(2000);
			
			clickOn(MeasuringScale, "MeasuringScale");
			Thread.sleep(2000);
			keypress_Down();
			Thread.sleep(2000);
			
			typeIn(warningLevel, "10", warningLevel);
			Thread.sleep(2000);
			
			typeIn(EscalationLevel, "5", EscalationLevel);
			Thread.sleep(2000);
			
			clickOn(btn_Threshold_Save, "Save");
			Thread.sleep(2000);
			
			String update_msg = "//*[@class='k-notification-content']";
			System.out.println(update_msg);
			if(getText(update_msg, "update msg").contains("Threshold Created")) {
				successmsg("Threshold is created", update_msg);
			}
			else {
				failmsg("KRI Create", "success msg is not displayed..");
			}
		}
		catch(Exception ex) {
			
		}
	}
	
	
	public void thesholdDefinition_Update() {
		try	{
			
			if(ispresent(btn_threshold_Edit))	{
				
				clickOn(btn_threshold_Edit, "Threshold Definition Edit");
				Thread.sleep(2000);
				
				clickOn(Currency, "currency");
				Thread.sleep(2000);
				keypress_Down();
				Thread.sleep(2000);
				
				clickOn(Threshold, "Threshold");
				Thread.sleep(2000);
				keypress_Down();
				Thread.sleep(2000);
				
				clickOn(MeasuringScale, "MeasuringScale");
				Thread.sleep(2000);
				keypress_Down();
				Thread.sleep(2000);
				
				typeIn(warningLevel, "20", warningLevel);
				Thread.sleep(2000);
				
				typeIn(EscalationLevel, "5", EscalationLevel);
				Thread.sleep(2000);
				
				clickOn(btn_threshold_Update, "updated");
				Thread.sleep(2000);
				
				String update_msg = "//*[@class='k-notification-content']";
				System.out.println(update_msg);
				if(getText(update_msg, "update msg").contains("Threshold updated")
						|| getText(update_msg, "update msg").contains("Threshold Updated")) {
					successmsg("Threshold is updated", update_msg);
				}
				else {
					failmsg("KRI Create", "success msg is not displayed..");
				}
			}
			else	{
				
			}
		}
		catch(Exception ex) {
			
		}
	}
	
	
	public void map_Formula()	{
		try	{
			List<WebElement> mapbutton = driver.findElements(By.xpath("//button[contains(text(),'Map')]"));
			
			if(mapbutton.size() > 1) {
				test.log(LogStatus.PASS, "MAP KRI button is displayed");
				
				mapbutton.get(2).click();
				
				if(ispresent(lbl_MapKRI))	{
					test.log(LogStatus.PASS, "MAP KRI page is displayed");
										
					clickOn(subtab_Formula, "Map Formula");
					Thread.sleep(2000);
					
					if(ispresent(btn_Map_Edit))	{
						formula_update();
					}
					else	{
						formula();
					}
				}
				else 	{
					test.log(LogStatus.FAIL, "MAP KRI page is not displayed");
				}
			}
			else 	{
				test.log(LogStatus.FAIL, "MAP KRI button is not displayed");
			}
		}
		catch(Exception ex) {
			
		}
	}
	
	
	public void formula() {
		try	{
			clickOn(subtab_Formula, "Formula");
			Thread.sleep(2000);
			
			typeIn(fieldName1, "100", "fieldName1");
			Thread.sleep(2000);
						
			typeIn(fieldName2, "20", "fieldName2");
			Thread.sleep(2000);
			
			clickOn(drp_Formaula, "formula");
			Thread.sleep(2000);
			keypress_Down();
			Thread.sleep(2000);
			
			typeIn(txtarea_Description, "Description", "Description");
			Thread.sleep(2000);
			
			clickOn(btn_Formula_Save, "Save");
			Thread.sleep(4000);
			
			String update_msg = "//*[@class='k-notification-content']";
			System.out.println(update_msg);
			if(getText(update_msg, "update msg").contains("Formula Created")) {
				successmsg("Formula is created", update_msg);
			}
			else {
				failmsg("KRI Create", "success msg is not displayed..");
			}
		}
		catch(Exception ex) {
			
		}
	}
	
	
	public void formula_update() {
		try	{
			if(ispresent(btn_Map_Edit))	{
				
				successmsg("MAP Formula Editbutton", "Editbutton");
				
				clickOn(btn_formula_Edit, "Formula");
				Thread.sleep(2000);
				
				/*
				 * typeIn(fieldName1, "100", "fieldName1"); Thread.sleep(2000);
				 * 
				 * typeIn(fieldName2, "20", "fieldName2"); Thread.sleep(2000);
				 */
				
				clickOn(drp_Formaula, "formula");
				Thread.sleep(2000);
				keypress_Down();
				Thread.sleep(2000);
				
				typeIn(txtarea_Description, "Description", "Description");
				Thread.sleep(2000);
				
				/*
				 * clickOn(btn_formula_Update, "update"); Thread.sleep(3000);
				 * 
				 * String update_msg = "//*[@class='k-notification-content']";
				 * System.out.println(getText(update_msg, "update msg")); if(getText(update_msg,
				 * "update msg").contains("Formula Updated")) { successmsg("Formula is created",
				 * update_msg); } else { failmsg("KRI Create",
				 * "success  msg is not displayed.."); }
				 */
			}
			else	{
				failmsg("Map Formula", "success  msg is not displayed..");
			}
		}
		catch(Exception ex) {
			
		}
	}
	
	
	public void map_OtherDetails()	{
		try	{
			List<WebElement> mapbutton = driver.findElements(By.xpath("//button[contains(text(),'Map')]"));
			
			if(mapbutton.size() > 1) {
				test.log(LogStatus.PASS, "MAP KRI button is displayed");
				
				mapbutton.get(2).click();
				
				if(ispresent(lbl_MapKRI))	{
					test.log(LogStatus.PASS, "MAP KRI page is displayed");
										
					clickOn(subtab_OtherDetails, "Map OtherDetails");
					Thread.sleep(2000);
					
					if(ispresent(btn_Map_Edit))	{
						test.log(LogStatus.PASS, "Edit button is displayed");
					}
					else	{
						otherDetails();
					}
				}
				else 	{
					test.log(LogStatus.FAIL, "MAP KRI page is not displayed");
				}
			}
			else 	{
				test.log(LogStatus.FAIL, "MAP KRI button is not displayed");
			}
		}
		catch(Exception ex) {
			
		}
	}
	
	
	
	public void otherDetails() {
		try	{
			clickOn(subtab_OtherDetails, "OtherDetails");
			Thread.sleep(2000);
			
			clickOn(lnk_StartDate, "Calender");
			Thread.sleep(2000);
					
			clickOn(lnk_cal_Today, "Calender today");
			Thread.sleep(2000);
			
			clickOn(drp_ReviewFrequency, "Frequency");
			Thread.sleep(2000);
			keypress_Down();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//*[@class='k-button k-upload-button']/input")).sendKeys("D:\\Mahesh\\Projects\\EWS_Application\\TestData.xlsx");
			Thread.sleep(2000);
			
			String update_msg = "//*[@class='k-notification-content']";
			System.out.println(update_msg);
			if(getText(update_msg, "update msg").contains("Other Details Created")) {
				successmsg("Other Details is created", update_msg);
			}
			else {
				failmsg("KRI Create", "success msg is not displayed..");
			}
		}
		catch(Exception ex) {
			
		}
	}
	
	
	public void map_MapKRIandControlRegister()	{
		try	{
			List<WebElement> mapbutton = driver.findElements(By.xpath("//button[contains(text(),'Map')]"));
			
			if(mapbutton.size() > 1) {
				test.log(LogStatus.PASS, "MAP KRI button is displayed");
				
				mapbutton.get(2).click();
				
				if(ispresent(lbl_MapKRI))	{
					test.log(LogStatus.PASS, "MAP KRI page is displayed");
										
					clickOn(subtab_MapRiskandControlRegister, "Map MapRiskandControlRegister");
					Thread.sleep(2000);
					
					mapKRIandControlRegister();
				}
				else 	{
					test.log(LogStatus.FAIL, "MAP KRI page is not displayed");
				}
			}
			else 	{
				test.log(LogStatus.FAIL, "MAP KRI button is not displayed");
			}
		}
		catch(Exception ex) {
			
		}
	}
	
	public void mapKRIandControlRegister() {
		try	{
			clickOn(subtab_MapRiskandControlRegister, "OtherDetails");
			Thread.sleep(2000);
			
			List<WebElement> grid = driver.findElements(By.xpath("(//table[@role='presentation'])[2]//tr"));
			if(grid.size() > 1) {
				test.log(LogStatus.PASS, "grid is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "grid is not displayed");
			}
		}
		catch(Exception ex) {
			
		}
	}
	
	
	public void deleteKRI() {
		try	{
			
			List<WebElement> grid = driver.findElements(By.xpath("//button[contains(text(),'Delete')]"));
			
			if(grid.size() > 1) {
				test.log(LogStatus.PASS, "grid is displayed");
				
				grid.get(grid.size() - 1).click();
				Thread.sleep(3000);
				
				if(ispresent(plsConfirm)) {
					clickOn(popup_No, "Popup No button");
					Thread.sleep(2000);
				}
				/*
				 * alertDismiss(); Thread.sleep(2000);
				 */
			}
			else {
				test.log(LogStatus.FAIL, "grid is not displayed");
			}
		}
		catch(Exception ex) {
			
		}
	}
	
	
	
	public void navigate_UpdateKRIMetrics()	{
		try	{
			
			Thread.sleep(3000);
			clickOn(ERM_Module,"ERM module");
			Thread.sleep(2000);
			clickOn(Module_MouseOver,"slide mouseover");
			Thread.sleep(2000);
			clickOn(lnk_RiskMonitoring,"RiskMonitoring link");
			Thread.sleep(2000);
			clickOn(lnk_UpdateKRI,"UpdateKRI link");
			Thread.sleep(2000);
			
			clickOn(logo,"mouseover");
			Thread.sleep(4000);
		}
		catch(Exception ex)	{
			
		}
	}
	
	
	public void UIValidations_UpdateRiskKRI()	{
		try	{
			if(ispresent(lbl_UpdateKRIMetrics))	{
				test.log(LogStatus.PASS, "update KRI is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "update KRI is not displayed");
			}
						
			
			List<WebElement> gridcount = driver.findElements(By.xpath("//kendo-grid-list[@role='presentation']//tbody/tr"));
			
			if(gridcount.size() > 1)	{
				test.log(LogStatus.PASS, "update grid is displayed");
				
			}
			else {
				test.log(LogStatus.FAIL, "update grid is not displayed");
			}
			
		}
		catch(Exception ex)	{
			
		}
	}
	
	
	public void UIValidations_UpdateKRI()	{
		try	{
			if(ispresent(lbl_UpdateKRIMetrics))	{
				test.log(LogStatus.PASS, "update KRI is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "update KRI is not displayed");
			}
						
			
			List<WebElement> gridcount = driver.findElements(By.xpath("//kendo-grid-list[@role='presentation']//tbody/tr"));
			
			if(gridcount.size() > 1)	{
				test.log(LogStatus.PASS, "update grid is displayed");
				
				List<WebElement> updateKRIbutton = driver.findElements(By.xpath("//button[contains(text(),'Update KRI') and @aria-disabled='false']"));
				updateKRIbutton.get(updateKRIbutton.size() - 1).click();
				Thread.sleep(2000);
								
				List<WebElement> updateKRIMetricsDetails = driver.findElements(By.xpath("//*[@class='page-wrapper ng-untouched ng-pristine ng-invalid']/div[3]//kendo-grid-list//tr"));
				if(updateKRIMetricsDetails.size() > 1) {
					test.log(LogStatus.PASS, "Update KRI Metrics details grid is displayed");
				}
				else {
					test.log(LogStatus.PASS, "No recordsUpdate KRI Metrics details grid");
				}
				
				if(ispresent(drp_Frequency) || ispresent(Attrition))	{
					test.log(LogStatus.PASS, "Financialyear/Attrition is not displayed");
				}
				else	{
					test.log(LogStatus.FAIL, "Financialyear/Attrition is not displayed");
				}
				
				if(ispresent(drp_FinancialYear))	{
					test.log(LogStatus.PASS, "Financialyear is not displayed");
				}
				else	{
					test.log(LogStatus.FAIL, "Financialyear is not displayed");
				}
				
				if(ispresent(Remarks))	{
					test.log(LogStatus.PASS, "Remarks is not displayed");
				}
				else	{
					test.log(LogStatus.FAIL, "Remarks is not displayed");
				}
				
				if(ispresent(UploadFile1))	{
					test.log(LogStatus.PASS, "uploadfile is not displayed");
				}
				else	{
					test.log(LogStatus.FAIL, "uploadfile is not displayed");
				}
				
				if(ispresent(btn_RiskIDDetails_Cancel))	{
					test.log(LogStatus.PASS, "Cancel is not displayed");
				}
				else	{
					test.log(LogStatus.FAIL, "Cancel is not displayed");
				}
				
				if(ispresent(btn_RiskIDDetails_Save))	{
					test.log(LogStatus.PASS, "Save is not displayed");
				}
				else	{
					test.log(LogStatus.FAIL, "Save is not displayed");
				}
				
				if(ispresent(lbl_LastUpdatedDetails))	{
					test.log(LogStatus.PASS, "LastupdatedDetails is not displayed");
				}
				else	{
					test.log(LogStatus.FAIL, "LastupdatedDetails is not displayed");
				}
				
				
				List<WebElement> LastupdateDetails = driver.findElements(By.xpath("(//kendo-grid-list[@role='presentation'])[2]//tbody/tr"));
				if(LastupdateDetails.size() > 1) {
					test.log(LogStatus.PASS, "LastUpdate details grid is displayed");
				}
				else {
					test.log(LogStatus.PASS, "No Records inLastUpdate details grid");
				}
				
			}
			else {
				test.log(LogStatus.FAIL, "update grid is not displayed");
			}
			
		}
		catch(Exception ex)	{
			
		}
	}
	
	
	public void navigate_ViewKRI()	{
		try	{
			
			Thread.sleep(3000);
			clickOn(ERM_Module,"ERM module");
			Thread.sleep(2000);
			clickOn(Module_MouseOver,"slide mouseover");
			Thread.sleep(2000);
			clickOn(lnk_RiskMonitoring,"RiskMonitoring link");
			Thread.sleep(2000);
			clickOn(lnk_ViewKRI,"ViewKRI link");
			Thread.sleep(2000);
			
			clickOn(logo,"mouseover");
			Thread.sleep(4000);
		}
		catch(Exception ex)	{
			
		}
	}
	
	
	// verify grid without dates......
		public void verify_viewKRI()
		{
			try {
			
				if(ispresent(lbl_CreationDate)) {
					test.log(LogStatus.PASS, "viewKRI is displayed");
					
					clickOn(btn_GetAllData,"Get AllData button");
					Thread.sleep(7000);
					
					if(ispresent(grid_Keyindicators)) {
						test.log(LogStatus.PASS, "KeyRiskIndicators is displayed");
					}
					else {
						test.log(LogStatus.FAIL, "KeyRiskIndicators is not displayed");
					}
					
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
				
			}
		}
		
		
		//verify grid with dattes
		public void verify_KeyRiskIndicatorsGrid_WithDate()
		{
			try {
				
				if(ispresent(lbl_CreationDate)) {
					test.log(LogStatus.PASS, "Key indicators is displayed");
										
					clickOn(lnk_FromCal,"Fromdate calender");
					Thread.sleep(2000);				
					clickOn(lnk_cal_Today,"select Date from calender");
					Thread.sleep(2000);
					
					clickOn(lnk_ToCal,"Todate calender");
					Thread.sleep(2000);				
					clickOn(lnk_cal_Today,"select Date from calender");
					Thread.sleep(2000);
				
					clickOn(btn_Search,"Search button");
					Thread.sleep(2000);
					
					if(ispresent(grid_Keyindicators)) {
						test.log(LogStatus.PASS, "KeyRiskIndicators is displayed");
					}
					else {
						test.log(LogStatus.FAIL, "KeyRiskIndicators is not displayed");
					}
					
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
				
			}
		}
		
	
	
}
