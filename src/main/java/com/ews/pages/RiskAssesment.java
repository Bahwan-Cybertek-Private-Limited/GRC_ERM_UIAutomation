package com.ews.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.ews.baseclass.Baseclass;
import com.relevantcodes.extentreports.LogStatus;

public class RiskAssesment extends Baseclass	{

	
	public String logo = "//*[@class='ews-logo']";
	public String ERM_Module = "//*[contains(text(),'Enterprise Risk Management')]";
	public String Module_MouseOver = "//*[@class='k-widget k-drawer k-drawer-start']";
	public String lnk_RiskAssesment = "//*[contains(text(),'Risk Assessment')]";
	public String lnk_CreateRiskAssesment = "//*[contains(text(),'Create Risk Assessment')]";
	public String lbl_RiskAssesment = "//*[@class='user-details']";
	public String btn_ExportAs = "//span[contains(text(),'Export As')]";
	public String btn_Asses = "//*[contains(text(),' Assess ')]";
	public String lbl_RiskID = "//*[@class='divider']//div[contains(text(),'Risk ID')]";
	public String lbl_RiskName = "//*[@class='divider']//div[contains(text(),'Risk Name')]";
	public String lbl_RiskCategory = "//*[@class='divider']//div[contains(text(),'Risk Category')]";
	public String lbl_Department = "//*[@class='divider']//div[contains(text(),'Department ')]";
	public String lbl_Department1 = "//*[@class='divider']//div[contains(text(),'Department')]";
	public String lbl_InternetImapct = "//*[@class='divider']//div[contains(text(),'Inherent Impact')]";
	public String lbl_InternetLikelihood = "//*[@class='divider']//div[contains(text(),'Inherent Likelihood')]";
	public String lbl_InternetRiskscore = "//*[@class='divider']//div[contains(text(),'Inherent Risk Score')]";
	public String lbl_ResidualRisk = "//*[@class='divider']//div[contains(text(),'Residual Risk')]";
	public String lbl_TypeofRisk = "//*[@class='divider']//div[contains(text(),'Type of Risk')]";
	public String lbl_RiskEventType = "//*[@class='divider']//div[contains(text(),'Risk Event Type')]";
	public String lbl_RiskDescription = "//*[@class='divider']//div[contains(text(),'Risk Description ')]";
	public String lbl_RiskDescription1 = "//*[@class='divider']//div[contains(text(),'Risk Description')]";
	public String sub_ControlAssesment = "//*[@class='tabs-container']//span[contains(text(),'Control Assessment')]";
	public String sub_RiskAssesment = "//*[@class='tabs-container']//span[contains(text(),'Risk Assessment')]";
	public String sub_Treatment = "//*[@class='tabs-container']//span[contains(text(),'Treatment')]";
	public String sub_NextAssesment = "//*[@class='tabs-container']//span[contains(text(),'Next Assessment')]";
	public String btn_sub_ControlAssesment_Assess ="//kendo-grid-list[@role='presentation']//tbody/tr/td/button[contains(text(),'Assess')]";
	
	
	public String popup_lbl_ControlAssesemtn = "//div[@role='dialog']/kendo-dialog-titlebar//span[contains(text(),'Control Assessment')]";
	public String popup_txt_DocumentExmained = "//*[@ng-reflect-name='documentsExamined']";
	public String popup_drp_DesignEffectiveness = "//*[@ng-reflect-name='designEffectiveness']";
	public String popup_drp_ControlEffectiveness = "//*[@ng-reflect-name='controlEffectiveness']";
	public String popup_txt_Reason = "//*[@ng-reflect-name='reason']";
	public String popup_fileupload = "//*[@class='k-button k-upload-button']/input";
	public String popup_Save = "//*[contains(text(),' Save ')]";
	public String popup_Edit = "//*[contains(text(),' Edit ')]";
	public String popup_Close = "//*[@class='k-button k-bare k-button-icon k-window-action k-dialog-action k-dialog-close']";
	
	//control grid count
	//kendo-grid-list[@role='presentation']//tbody/tr
	
	public String drp_NextAssesment = "//*[@ng-reflect-text-field='assessmentType']/span";
	public String btn_NextAssesementSubmit = "//*[contains(text(),' Submit ')]";
	
	public String lbl_RiskAsses_Justification = "//div[contains(text(),'Justification')]";
	public String txt_RiskAssess_Justification = "//*[@ng-reflect-name='justification']";
	
	public String lbl_Scoring_InternetRisk = "//div[contains(text(),'Inherent Risk Quantitative Impact')]";
	public String lbl_Scoring_ResidualRisk = "//div[contains(text(),'Residual Risk Quantitative Impact')]";
	public String lbl_Scoring_InternetImpact = "//div[contains(text(),'Inherent Impact Rating')]";
	public String lbl_Scoring_ResidualImpact = "//div[contains(text(),'Residual Impact Rating')]";
	public String lbl_Scoring_InternetSpeed = "//div[contains(text(),'Inherent Speed of Onset')]";
	public String lbl_Scoring_ReidualSpeed = "//div[contains(text(),'Residual Speed of Onset')]";
	public String lbl_Scoring_InternetRating = "//div[contains(text(),'Inherent Likelihood Rating')]";
	public String lbl_Scoring_ResidualRating = "//div[contains(text(),'Residual Likelihood Rating')]";
	public String lbl_Scoring_InherentRiskRating = "//div[contains(text(),'Inherent Risk Rating')]";
	public String lbl_Scoring_ResidualRiskRating = "//div[contains(text(),'Residual risk rating') or contains(text(),'Residual Risk Rating')]";
	
	public String txt_InherentRiskQuantitativeImpace = "//*[@ng-reflect-text='Inherent Risk Quantitative Imp']//following-sibling::kendo-numerictextbox//input";
	public String drp_InherentRiskQuantitativeImpace= "//*[@ng-reflect-text='Inherent Risk Quantitative Imp']//following-sibling::kendo-dropdownlist";
	public String txt_ResidualRiskQuantitativeImpace = "//*[@ng-reflect-text='Residual Risk Quantitative Imp']//following-sibling::kendo-numerictextbox//input";
	public String drp_ResidualRiskQuantitativeImpace= "//*[@ng-reflect-text='Residual Risk Quantitative Imp']//following-sibling::kendo-dropdownlist";
	public String drp_InherentImpactRating= "//*[@ng-reflect-text='Inherent Impact Rating']//following-sibling::kendo-dropdownlist/span";
	public String drp_ResidualImpactRating= "//*[@ng-reflect-text='Residual Impact Rating']//following-sibling::kendo-dropdownlist/span";
	public String txt_InternetSpeedonset= "//*[@ng-reflect-text='Inherent Speed of Onset']//following-sibling::kendo-numerictextbox//input";
	public String txt_ResidualSpeedonset= "//*[@ng-reflect-text='Residual Speed of Onset']//following-sibling::kendo-numerictextbox//input";
	public String drp_InherentRating= "//*[@ng-reflect-text='Inherent Likelihood Rating']//following-sibling::kendo-dropdownlist/span";
	public String drp_ResidualRating= "//*[@ng-reflect-text='Residual Likelihood Rating']//following-sibling::kendo-dropdownlist/span";
	public String btn_UpdateScoring = "//*[contains(text(),' Update ')]";
	
	//Treatement tab
	public  String lbl_Treatment_ResponseCategory = "//div[contains(text(),'Response Category')]";
	public  String lbl_Treatment_Justification = "//div[contains(text(),'Justification')]";
	
	public String drp_treatmentResponseCategory = "//*[@ng-reflect-text='Response Category']//following-sibling::kendo-dropdownlist/span";
	public String txtarea = "//*[@ng-reflect-text='Justification']//following-sibling::textarea";
		
	//RiskAssesment Submission tab...
	public String lnk_RiskAssementSubmission = "//*[contains(text(),'Risk Assessment Submission ')]";
	public String lbl_Submission_RiskAssesement = "//*[@class='page-wrapper']//*[contains(text(),'Risk Assessment')]";
	public String btn_SubmitforApproval = "//*[@class='k-button-icontext k-button k-grid-edit-command ng-star-inserted']";
	public String lbl_RiskAssesmentDetails = "//*[contains(text(),'Risk Assessment Details')]";
	public String txt_Remarks = "//*[@ng-reflect-name='remarks']";
	public String txtarea_Remarks = "//*[@ng-reflect-name='comments']";
	public String btn_Cancel = "//*[@class='show-buttons-large']/button[contains(text(),' Cancel ')]";
	public String btn_Submit = "//*[@class='show-buttons-large']/button[contains(text(),' Submit ')]";
	public String btn_submitforApproval = "(//*[@class='k-button-icontext k-button k-grid-edit-command ng-star-inserted'])[1]";
	
	
	//Approve RiskAssesment tab....
	public String lnk_ApproveRiskAssement = "//*[contains(text(),'Approve Risk Assessment')]";
	public String lbl_Approve_RiskAssesement = "//*[@class='page-wrapper']//*[contains(text(),'Risk Assessment')]";
	public String bnt_Action = "//*[contains(text(),'Action')]";
	public String btn_Action1 = "(//*[contains(text(),'Action')])[2]";
	public String lbl_LastUpdatedDetails = "//*[contains(text(),'Last updated details')]";
	public String table_Norecords = "//*[@class='k-grid-norecords ng-star-inserted']";
	
	
	public void navigate_RiskAssesementtab()	{
		try	{
			
			Thread.sleep(3000);
			clickOn(ERM_Module,"ERM module");
			Thread.sleep(2000);
			clickOn(Module_MouseOver,"slide mouseover");
			Thread.sleep(2000);
			clickOn(lnk_RiskAssesment,"Register link");
			Thread.sleep(2000);
			clickOn(lnk_CreateRiskAssesment,"CreateRiskAssesment link");
			Thread.sleep(2000);
			
			clickOn(logo,"mouseover");
			Thread.sleep(4000);
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
	
	
	public void UIValidations_CreateRiskAssesment()	{
		try	{
			if(ispresent(lbl_RiskAssesment))	{
				test.log(LogStatus.PASS, "RiskAssesment is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "RiskAssesment is not displayed");
			}
			
			Thread.sleep(2000);
			if(ispresent(btn_ExportAs))	{
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
	
	
	public void CreateRiskAssesment_Assess()	{
		try	{
		
			List<WebElement> gridcheckboxcount1 = driver.findElements(By.xpath("//table[@role='presentation']/tbody/tr/td[2]"));
			for(int i=0;i<gridcheckboxcount1.size();i++)
			{			
				
				if(gridcheckboxcount1.get(i).getText().equalsIgnoreCase("BCT/ERM/R/122")) {
					int j = i; j=++j;
					String chk1 = "//table[@role='presentation']/tbody/tr["+j+"]/td[1]/input";
					clickOn(chk1, " checkbox");
					
				}
			}
			
			clickOn(btn_Asses, "Asses button");
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
	
	
	public void uiValidations_AddRiskAssement()	{
		try	{
			
			if(ispresent(lbl_RiskID))	{
				test.log(LogStatus.PASS, "RiskID is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "RiskID is not displayed");
			}
			
			if(ispresent(lbl_RiskName))	{
				test.log(LogStatus.PASS, "RiskName is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "RiskName is not displayed");
			}
			
			if(ispresent(lbl_RiskCategory))	{
				test.log(LogStatus.PASS, "RiskCategory is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "RiskCategory is not displayed");
			}
			
			if(ispresent(lbl_Department))	{
				test.log(LogStatus.PASS, "Department is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "Department is not displayed");
			}
			
			if(ispresent(lbl_InternetImapct))	{
				test.log(LogStatus.PASS, "InternetImapct is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "InternetImapct is not displayed");
			}
			
			if(ispresent(lbl_InternetLikelihood))	{
				test.log(LogStatus.PASS, "InternetLikelihood is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "InternetLikelihood is not displayed");
			}
			
			if(ispresent(lbl_InternetRiskscore))	{
				test.log(LogStatus.PASS, "InternetRiskscore is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "InternetRiskscore is not displayed");
			}
			
			if(ispresent(lbl_ResidualRisk))	{
				test.log(LogStatus.PASS, "ResidualRisk is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "ResidualRisk is not displayed");
			}
			
			if(ispresent(lbl_TypeofRisk))	{
				test.log(LogStatus.PASS, "TypeofRisk is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "TypeofRisk is not displayed");
			}
			
			if(ispresent(lbl_RiskEventType))	{
				test.log(LogStatus.PASS, "RiskEventType is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "RiskEventType is not displayed");
			}
			
			if(ispresent(lbl_RiskDescription))	{
				test.log(LogStatus.PASS, "RiskDescription is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "RiskDescription is not displayed");
			}
			
			if(ispresent(sub_ControlAssesment))	{
				test.log(LogStatus.PASS, "ControlAssesment is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "ControlAssesment is not displayed");
			}
			
			if(ispresent(sub_NextAssesment))	{
				test.log(LogStatus.PASS, "NextAssesment is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "NextAssesment is not displayed");
			}
			
			if(ispresent(sub_Treatment))	{
				test.log(LogStatus.PASS, "Treatment is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "Treatment is not displayed");
			}
			
			if(ispresent(sub_RiskAssesment))	{
				test.log(LogStatus.PASS, "RiskAssesment is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "RiskAssesment is not displayed");
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
	
	
	
	public void controlAssesment()	{
		try	{
			
			List<WebElement> gridcount = driver.findElements(By.xpath("//kendo-grid-list[@role='presentation']//tbody/tr"));
			
			if(gridcount.size() > 1 ) {
				test.log(LogStatus.PASS, "ControlAssesment grid is displayed");
			}
			else	{
				test.log(LogStatus.PASS, "No records in ControlAssesment grid");
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
	
	
	public void controlAssesment_Asses()	{
		try	{
			List<WebElement> gridcount = driver.findElements(By.xpath("//kendo-grid-list[@role='presentation']//tbody/tr"));
			
			if(gridcount.size() > 1 ) {
				test.log(LogStatus.PASS, "ControlAssesment grid is displayed");
				
				clickOn(btn_Asses, "Asses Button");
				Thread.sleep(2000);
				
				//popup validations....
				if(ispresent(popup_lbl_ControlAssesemtn))	{
					
					if(ispresent(popup_Edit))	{
						test.log(LogStatus.PASS, "Edit popup is displayed");
						clickOn(popup_Edit, "Edit button");
						Thread.sleep(2000);
						
						if(ispresent(popup_txt_DocumentExmained))	{
							test.log(LogStatus.PASS, "DocumentExamained popup is displayed");
						}
						else {
							test.log(LogStatus.FAIL, "DocumentExamained popup is not displayed");
						}
						
						if(ispresent(popup_drp_DesignEffectiveness))	{
							test.log(LogStatus.PASS, "DesignEffectiveness popup is displayed");
						}
						else {
							test.log(LogStatus.FAIL, "DesignEffectiveness popup is not displayed");
						}
						
						if(ispresent(popup_drp_ControlEffectiveness))	{
							test.log(LogStatus.PASS, "ControlEffectiveness popup is displayed");
						}
						else {
							test.log(LogStatus.FAIL, "ControlEffectiveness popup is not displayed");
						}
						
						if(ispresent(popup_txt_Reason))	{
							test.log(LogStatus.PASS, "Reason popup is displayed");
						}
						else {
							test.log(LogStatus.FAIL, "Reason popup is not displayed");
						}
						
						if(ispresent(popup_Save))	{
							test.log(LogStatus.PASS, "Save popup is displayed");
						}
						else {
							test.log(LogStatus.FAIL, "Save popup is not displayed");
						}
						
						if(ispresent(popup_Close))	{
							test.log(LogStatus.PASS, "Close popup is displayed");
						}
						else {
							test.log(LogStatus.FAIL, "Close popup is not displayed");
						}
						
						Thread.sleep(3000);
					}
					else {
						test.log(LogStatus.PASS, "ControlAssesment popup is not displayed");
					}					
				}
				else 	{
					
				}
			}
			else	{
				test.log(LogStatus.PASS, "NO records in ControlAssesment grid is not displayed");
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
	
	
	public void riskAssesment()	{
		try	{
			
			clickOn(sub_RiskAssesment, "RiskAssesment");
			Thread.sleep(2000);
						
			if(ispresent(btn_Asses))	{
				
				test.log(LogStatus.PASS, "Asses button is displayed");
				
				if(ispresent(lbl_Scoring_InternetRisk))	{
					test.log(LogStatus.PASS, "InternetRisk is displayed");
				}
				else {
					test.log(LogStatus.FAIL, "InternetRisk is not displayed");
				}
				
				if(ispresent(lbl_Scoring_ResidualRisk))	{
					test.log(LogStatus.PASS, "ResidualRisk is displayed");
				}
				else {
					test.log(LogStatus.FAIL, "ResidualRisk is not displayed");
				}
				
				if(ispresent(lbl_Scoring_InternetImpact))	{
					test.log(LogStatus.PASS, "InternetImpact is displayed");
				}
				else {
					test.log(LogStatus.FAIL, "InternetImpact is not displayed");
				}
				
				if(ispresent(lbl_Scoring_ResidualImpact))	{
					test.log(LogStatus.PASS, "ResidualImpact is displayed");
				}
				else {
					test.log(LogStatus.FAIL, "ResidualImpact is not displayed");
				}
				
				if(ispresent(lbl_Scoring_InternetSpeed))	{
					test.log(LogStatus.PASS, "InternetSpeed is displayed");
				}
				else {
					test.log(LogStatus.FAIL, "InternetSpeed is not displayed");
				}
				
				if(ispresent(lbl_Scoring_ReidualSpeed))	{
					test.log(LogStatus.PASS, "ReidualSpeed is displayed");
				}
				else {
					test.log(LogStatus.FAIL, "ReidualSpeed is not displayed");
				}
				
				if(ispresent(lbl_Scoring_InternetRating))	{
					test.log(LogStatus.PASS, "InternetRating is displayed");
				}
				else {
					test.log(LogStatus.FAIL, "InternetRating is not displayed");
				}
				
				if(ispresent(lbl_Scoring_ResidualRating))	{
					test.log(LogStatus.PASS, "ResidualRating is displayed");
				}
				else {
					test.log(LogStatus.FAIL, "ResidualRating is not displayed");
				}
				
				if(ispresent(lbl_Scoring_InherentRiskRating))	{
					test.log(LogStatus.PASS, "InherentRiskRating is displayed");
				}
				else {
					test.log(LogStatus.FAIL, "InherentRiskRating is not displayed");
				}
				
				JavascriptExecutor js = (JavascriptExecutor) driver;			 
			    //specify the number of pixels the page has to be scrolled
			    js.executeScript("window.scrollBy(0,3000)");		       
			    Thread.sleep(2000);
			    
				if(ispresent(lbl_Scoring_ResidualRiskRating))	{
					test.log(LogStatus.PASS, "ResidualRiskRating is displayed");
				}
				else {
					test.log(LogStatus.FAIL, "ResidualRiskRating is not displayed");
				}
				
				if(ispresent(lbl_RiskAsses_Justification))	{
					test.log(LogStatus.PASS, "Justification is displayed");
				}
				else {
					test.log(LogStatus.FAIL, "Justification is not displayed");
				}
			}
			else	{
				test.log(LogStatus.PASS, "Assess button is not displayed");
				update_RiskAssesment();
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
	
	
	public void treatment()	{
		try	{
			clickOn(sub_Treatment, "Treatment");
			Thread.sleep(2000);
			
			if(ispresent(btn_Asses))	{
				
				test.log(LogStatus.PASS, "Assess button is displayed");
				
				if(ispresent(lbl_Treatment_ResponseCategory))	{
					test.log(LogStatus.PASS, "ResponseCategory is displayed");
				}
				else {
					test.log(LogStatus.FAIL, "ResponseCategory is not displayed");
				}
				
				if(ispresent(lbl_Treatment_Justification))	{
					test.log(LogStatus.PASS, "Justification is displayed");
				}
				else {
					test.log(LogStatus.FAIL, "Justification is not displayed");
				}
			}
			else {
				test.log(LogStatus.PASS, "Assess button is not displayed");
				update_Treatment();
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
	
	
	public void nextAssesment()	{
		try	{
			clickOn(sub_NextAssesment, "Treatment");
			Thread.sleep(2000);
			
			if(ispresent(drp_NextAssesment))	{
				test.log(LogStatus.PASS, "NextAssesment is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "NextAssesment is not displayed");
			}
			
			if(ispresent(btn_NextAssesementSubmit))	{
				test.log(LogStatus.PASS, "NextAssesementSubmit is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "NextAssesementSubmit is not displayed");
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
	
	
	public void update_RiskAssesment()	{
		try	{				
			
			clickOn(sub_RiskAssesment, "RiskAssement");
			Thread.sleep(2000);
			
			if(ispresent(btn_Asses))	{
				clickOn(btn_Asses,"Assess button");
				Thread.sleep(2000);
			}
			
			typeIn(txt_InherentRiskQuantitativeImpace, "500", "InherentRiskQuantitativeImpace");
			Thread.sleep(2000);
			
			clickOn(drp_InherentRiskQuantitativeImpace,"InherentRiskQuantitativeImpace");
			Thread.sleep(2000);
			keypress_Down();
			Thread.sleep(2000);
						
			typeIn(txt_ResidualRiskQuantitativeImpace, "400", "ResidualRiskQuantitativeImpace");
			Thread.sleep(2000);
			
			clickOn(drp_ResidualRiskQuantitativeImpace,"ResidualRiskQuantitativeImpace");
			Thread.sleep(2000);
			keypress_Down();
			Thread.sleep(2000);
			
			clickOn(drp_InherentImpactRating,"InherentImpactRating");
			Thread.sleep(2000);
			keypress_Down();
			Thread.sleep(2000);
			
			clickOn(drp_ResidualImpactRating,"ResidualImpactRating");
			Thread.sleep(2000);
			keypress_Down();
			Thread.sleep(2000);
			
			typeIn(txt_InternetSpeedonset, "5", "InternetSpeedonset");
			Thread.sleep(2000);
			
			typeIn(txt_ResidualSpeedonset, "5", "ResidualSpeedonset");
			Thread.sleep(2000);
			
			clickOn(drp_InherentRating,"InherentRating");
			Thread.sleep(2000);
			keypress_Down();
			Thread.sleep(2000);
			
			clickOn(drp_ResidualRating,"ResidualRating");
			Thread.sleep(2000);
			keypress_Down();
			Thread.sleep(2000);
			
			typeIn(txt_RiskAssess_Justification, "Justification", "Justification");
			Thread.sleep(2000);
			
			clickOn(btn_UpdateScoring, "UpdateScoring");
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
	
	
	public void update_Treatment()	{
		try	{
			clickOn(sub_Treatment, "Treatment tab");
			Thread.sleep(2000);
			
			if(ispresent(btn_Asses))	{
				clickOn(btn_Asses, "Assess button");
				Thread.sleep(2000);
			}
			
			clickOn(drp_treatmentResponseCategory, "Response Category");
			Thread.sleep(2000);
			keypress_Down();
			Thread.sleep(2000);
			
			typeIn(txtarea, "Justification", "Justification");
			Thread.sleep(2000);
			
			clickOn(btn_UpdateScoring, "UpdateScoring");
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
	
	
	public void navigate_RiskAssesmentSubmission()	{
		try	{
			
			Thread.sleep(3000);
			clickOn(ERM_Module,"ERM module");
			Thread.sleep(2000);
			clickOn(Module_MouseOver,"slide mouseover");
			Thread.sleep(2000);
			clickOn(lnk_RiskAssesment,"RiskAssesment link");
			Thread.sleep(2000);
			clickOn(lnk_RiskAssementSubmission,"RiskAssesment submission link");
			Thread.sleep(2000);
			
			clickOn(logo,"mouseover");
			Thread.sleep(4000);
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
	
	
	public void uiValidations_RiskAssesmentSubmission()	{
		try	{
			if(ispresent(lbl_Submission_RiskAssesement))	{
				test.log(LogStatus.PASS, "RiskAssement submission is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "RiskAssement submission is not displayed");
			}
			
			Thread.sleep(2000);
			if(ispresent(btn_ExportAs))	{
				test.log(LogStatus.PASS, "ExportAs button is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "ExportAs button is not displayed");
			}
			
			List<WebElement> gridcount = driver.findElements(By.xpath("//kendo-grid-list[@role='presentation']//tbody/tr"));
			
			if(gridcount.size() > 1 ) {
				test.log(LogStatus.PASS, "RiskAssesment submission grid is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "RiskAssesment submission grid is not displayed");
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
	
	
	public void riskAssesmentDetails_submitforApproval()	{
		try	{
			List<WebElement> submitforApproval = driver.findElements(By.xpath("//tbody[@role='presentation']/tr"));
			
			if(submitforApproval.size() > 1) {
				test.log(LogStatus.PASS, "RiskAssesment submission grid is displayed");
								
			    List<WebElement> submitforApprovalbutton = driver.findElements(By.xpath("//*[contains(text(),'Submit for Approval') and @class='k-button-icontext k-button k-grid-edit-command']"));
			  	
			    JavascriptExecutor js = (JavascriptExecutor) driver;
			    js.executeScript("arguments[0].scrollIntoView();",  submitforApprovalbutton.get(submitforApprovalbutton.size() - 1));
				
			    submitforApprovalbutton.get(submitforApprovalbutton.size() - 1).click();
				Thread.sleep(2000);
			}
			else {
				test.log(LogStatus.FAIL, "RiskAssesment submission grid is not displayed");
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
	
	
	public void approve_riskAssesmentView()	{
		try	{
			if(ispresent(lbl_Scoring_InternetRisk))	{
				test.log(LogStatus.PASS, "InternetRisk is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "InternetRisk is not displayed");
			}
			
			if(ispresent(lbl_Scoring_ResidualRisk))	{
				test.log(LogStatus.PASS, "ResidualRisk is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "ResidualRisk is not displayed");
			}
			
			if(ispresent(lbl_Scoring_InternetImpact))	{
				test.log(LogStatus.PASS, "InternetImpact is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "InternetImpact is not displayed");
			}
			
			if(ispresent(lbl_Scoring_ResidualImpact))	{
				test.log(LogStatus.PASS, "ResidualImpact is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "ResidualImpact is not displayed");
			}
			
			if(ispresent(lbl_Scoring_InternetSpeed))	{
				test.log(LogStatus.PASS, "InternetSpeed is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "InternetSpeed is not displayed");
			}
			
			if(ispresent(lbl_Scoring_ReidualSpeed))	{
				test.log(LogStatus.PASS, "ReidualSpeed is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "ReidualSpeed is not displayed");
			}
			
			if(ispresent(lbl_Scoring_InternetRating))	{
				test.log(LogStatus.PASS, "InternetRating is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "InternetRating is not displayed");
			}
			
			if(ispresent(lbl_Scoring_ResidualRating))	{
				test.log(LogStatus.PASS, "ResidualRating is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "ResidualRating is not displayed");
			}
			
			if(ispresent(lbl_Scoring_InherentRiskRating))	{
				test.log(LogStatus.PASS, "InherentRiskRating is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "InherentRiskRating is not displayed");
			}
			
			if(ispresent(lbl_Scoring_ResidualRiskRating))	{
				test.log(LogStatus.PASS, "ResidualRiskRating is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "ResidualRiskRating is not displayed");
			}
			
			if(ispresent(txt_Remarks))	{
				test.log(LogStatus.PASS, "Justification is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "Justification is not displayed");
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
	
	public void approve_RiskAssesment()	{
		try	{
			uiValidations_AddRiskAssement();
			
			approve_riskAssesmentView();
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
	
	
	public void navigate_approveRiskAssesment()	{
		try	{
			
			Thread.sleep(3000);
			clickOn(ERM_Module,"ERM module");
			Thread.sleep(2000);
			clickOn(Module_MouseOver,"slide mouseover");
			Thread.sleep(2000);
			clickOn(lnk_RiskAssesment,"RiskAssesment link");
			Thread.sleep(2000);
			clickOn(lnk_ApproveRiskAssement,"RiskAssesment approve link");
			Thread.sleep(2000);
			
			clickOn(logo,"mouseover");
			Thread.sleep(4000);
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
	
	
	public void approve_UIValidations()	{
		try	{
			List<WebElement> gridcount = driver.findElements(By.xpath("//kendo-grid-list[@role='presentation']//tbody/tr"));
			
			if(gridcount.size() > 1)	{
				test.log(LogStatus.PASS, "grid is displayed");
				
				List<WebElement> Actions = driver.findElements(By.xpath("(//*[contains(text(),'Action')])[2]"));
				
				clickOn(btn_Action1, "Action button");
				Thread.sleep(2000);
				
				
			}
			else {
				test.log(LogStatus.FAIL, "grid is not displayed");
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
	
	
	public void riskAssesmentDetails_approveAssesment()	{
		try	{
			if(ispresent(lbl_RiskID))	{
				test.log(LogStatus.PASS, "RiskID is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "RiskID is not displayed");
			}
			
			if(ispresent(lbl_RiskName))	{
				test.log(LogStatus.PASS, "RiskName is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "RiskName is not displayed");
			}
			
			if(ispresent(lbl_RiskCategory))	{
				test.log(LogStatus.PASS, "RiskCategory is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "RiskCategory is not displayed");
			}
			
			if(ispresent(lbl_Department1))	{
				test.log(LogStatus.PASS, "Department is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "Department is not displayed");
			}
			
			if(ispresent(lbl_InternetImapct))	{
				test.log(LogStatus.PASS, "InternetImapct is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "InternetImapct is not displayed");
			}
			
			if(ispresent(lbl_InternetLikelihood))	{
				test.log(LogStatus.PASS, "InternetLikelihood is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "InternetLikelihood is not displayed");
			}
			
			if(ispresent(lbl_InternetRiskscore))	{
				test.log(LogStatus.PASS, "InternetRiskscore is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "InternetRiskscore is not displayed");
			}
			
			if(ispresent(lbl_ResidualRisk))	{
				test.log(LogStatus.PASS, "ResidualRisk is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "ResidualRisk is not displayed");
			}
			
			if(ispresent(lbl_TypeofRisk))	{
				test.log(LogStatus.PASS, "TypeofRisk is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "TypeofRisk is not displayed");
			}
			
			if(ispresent(lbl_RiskEventType))	{
				test.log(LogStatus.PASS, "RiskEventType is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "RiskEventType is not displayed");
			}
			
			if(ispresent(lbl_RiskDescription1))	{
				test.log(LogStatus.PASS, "RiskDescription is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "RiskDescription is not displayed");
			}
			
			typeIn(txtarea_Remarks, "Remarks", "Remarks");
			Thread.sleep(2000);
			
			
			if(ispresent(lbl_LastUpdatedDetails))	{
				test.log(LogStatus.PASS, "LastUpdatedDetails is displayed");
				
				if(!ispresent(table_Norecords))	{
					test.log(LogStatus.PASS, "LastUpdatedDetails grid is displayed");
				}
				else 	{
					test.log(LogStatus.FAIL, "LastUpdatedDetails grid is not displayed");
				}
			}
			else {
				test.log(LogStatus.FAIL, "LastUpdatedDetails is not displayed");
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
