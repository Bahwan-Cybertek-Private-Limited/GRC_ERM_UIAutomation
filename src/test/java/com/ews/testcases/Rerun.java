package com.ews.testcases;

import com.ews.baseclass.Baseclass;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.ews.pages.*;

import utils.ExtentReportListner;

@Listeners(ExtentReportListner.class)
public class Rerun extends Baseclass	{
	
	
	  @Test(priority = 39) 
	  public void unique_uiValidations() { 
		  //launch browser
		  browser_lunch("chrome");
		  
		  Login loginpage = new Login(); 
		  loginpage.login();
		  
		  UniqueID UniqueID = new UniqueID();
		  UniqueID.ui_Validation_UniqueID();
		  
		  //logout 
		  loginpage.logout();
		  
		  //close application and browser.. 
		  closeBrower(); 
		  
	  }		
	  
	  
	  @Test(priority = 40) 
	  public void unique_RiskValidations() { 
		  //launch browser
		  browser_lunch("chrome");
		  
		  Login loginpage = new Login(); 
		  loginpage.login();
		  
		  UniqueID UniqueID = new UniqueID();
		  UniqueID.navigate_riskTile();
		  
		  //logout 
		  loginpage.logout();
		  
		  //close application and browser.. 
		  closeBrower(); 
		  
	  }		
	  
	  
	  @Test(priority = 41) 
	  public void unique_controlValidations() { 
		  //launch browser
		  browser_lunch("chrome");
		  
		  Login loginpage = new Login(); 
		  loginpage.login();
		  
		  UniqueID UniqueID = new UniqueID();
		  UniqueID.navigate_controlTile();
		  
		  //logout 
		  loginpage.logout();
		  
		  //close application and browser.. 
		  closeBrower(); 
		  
	  }	
	  
	  @Test(priority = 42) 
	  public void unique_KRIValidations() { 
		  //launch browser
		  browser_lunch("chrome");
		  
		  Login loginpage = new Login(); 
		  loginpage.login();
		  
		  UniqueID UniqueID = new UniqueID();
		  UniqueID.navigate_kriTile();
		  
		  //logout 
		  loginpage.logout();
		  
		  //close application and browser.. 
		  closeBrower(); 
		  
	  }
	  
	  
	  @Test(priority = 43) 
	  public void unique_RiskViewValidations() { 
		  //launch browser
		  browser_lunch("chrome");
		  
		  Login loginpage = new Login(); 
		  loginpage.login();
		  
		  UniqueID UniqueID = new UniqueID();
		  UniqueID.unique_ViewValidations();
		  
		  //logout 
		  loginpage.logout();
		  
		  //close application and browser.. 
		  closeBrower(); 
		  
	  }	
	  
	  
	  @Test(priority = 44) 
	  public void unique_RiskEditValidations() { 
		  //launch browser
		  browser_lunch("chrome");
		  
		  Login loginpage = new Login(); 
		  loginpage.login();
		  
		  UniqueID UniqueID = new UniqueID();
		  UniqueID.unique_EditValidations();
		  
		  //logout 
		  loginpage.logout();
		  
		  //close application and browser.. 
		  closeBrower(); 
		  
	  }	
	  
	  @Test(priority = 45) 
	  public void unique_RiskDeleteValidations() { 
		  //launch browser
		  browser_lunch("chrome");
		  
		  Login loginpage = new Login(); 
		  loginpage.login();
		  
		  UniqueID UniqueID = new UniqueID();
		  UniqueID.unique_DeleteValidations();
		  
		  //logout 
		  loginpage.logout();
		  
		  //close application and browser.. 
		  closeBrower(); 
		  
	  }	
	  
	  
	  @Test(priority = 46) 
	  public void bem_UIValidations() { 
		  //launch browser
		  browser_lunch("chrome");
		  
		  Login loginpage = new Login(); 
		  loginpage.login();
		  
		  BusinessEntityMapping BusinessEntityMapping = new BusinessEntityMapping();
		  BusinessEntityMapping.UIValidations_CreateRiskKRI();
		  
		  //logout 
		  loginpage.logout();
		  
		  //close application and browser.. 
		  closeBrower(); 
		  
	  }	
	  
	  
	  @Test(priority = 47) 
	  public void bem_CreateVersionValidations() { 
		  //launch browser
		  browser_lunch("chrome");
		  
		  Login loginpage = new Login(); 
		  loginpage.login();
		  
		  BusinessEntityMapping BusinessEntityMapping = new BusinessEntityMapping();
		  BusinessEntityMapping.navigate_BusinessEntityMappingtab();
		  		  
		  BusinessEntityMapping.UIValidations_CreateNewVersion();
		  
		  //logout 
		  loginpage.logout();
		  
		  //close application and browser.. 
		  closeBrower(); 
		  
	  }	
	  
	  
	  @Test(priority = 47) 
	  public void bem_CreateHierarchy() { 
		  //launch browser
		  browser_lunch("chrome");
		  
		  Login loginpage = new Login(); 
		  loginpage.login();
		  
		  BusinessEntityMapping BusinessEntityMapping = new BusinessEntityMapping();
		  BusinessEntityMapping.navigate_BusinessEntityMappingtab();
		  		  
		  BusinessEntityMapping.createHierarchy();
		  
		  BusinessEntityMapping.fillDetails();		  
		  
		  //logout 
		  loginpage.logout();
		  
		  //close application and browser.. 
		  closeBrower(); 
		  
	  }	
	  
	  
	  @Test(priority = 48) 
	  public void bem_ViewOrganisationChart() { 
		  //launch browser
		  browser_lunch("chrome");
		  
		  Login loginpage = new Login(); 
		  loginpage.login();
		  
		  BusinessEntityMapping BusinessEntityMapping = new BusinessEntityMapping();
		  BusinessEntityMapping.navigate_BusinessEntityMappingtab();
		  		  
		  BusinessEntityMapping.createHierarchy();
		  
		  BusinessEntityMapping.verify_OrganisationChart();	  
		  
		  //logout 
		  loginpage.logout();
		  
		  //close application and browser.. 
		  closeBrower(); 
		  
	  }	
	  
	  
	  @Test(priority = 49) 
	  public void bem_EditOHG() { 
		  //launch browser
		  browser_lunch("chrome");
		  
		  Login loginpage = new Login(); 
		  loginpage.login();
		  
		  BusinessEntityMapping BusinessEntityMapping = new BusinessEntityMapping();
		  BusinessEntityMapping.navigate_BusinessEntityMappingtab();
		  
		  BusinessEntityMapping.edit_OHG();
		  
		  BusinessEntityMapping.verify_edit_OHG();
		  		  
		  //logout 
		  loginpage.logout();
		  
		  //close application and browser.. 
		  closeBrower(); 
		  
	  }	
	  
	  
	  @Test(priority = 50) 
	  public void bem_ViewOHG() { 
		  //launch browser
		  browser_lunch("chrome");
		  
		  Login loginpage = new Login(); 
		  loginpage.login();
		  
		  BusinessEntityMapping BusinessEntityMapping = new BusinessEntityMapping();
		  BusinessEntityMapping.navigate_BusinessEntityMappingtab();
		  
		  BusinessEntityMapping.viewAction();	  
		  		  
		  //logout 
		  loginpage.logout();
		  
		  //close application and browser.. 
		  closeBrower(); 
		  
	  }	
	  
	  
	  
	  @Test(priority = 51) 
	  public void riskMonitoring_UIValidations() { 
		  //launch browser
		  browser_lunch("chrome");
		  
		  Login loginpage = new Login(); 
		  loginpage.login();
		  
		  RiskMonitoring RiskMonitoring = new RiskMonitoring();
		  RiskMonitoring.navigate_RiskMonitoringtab();
		  
		  RiskMonitoring.UIValidations_CreateRiskKRI();	  
		  		  
		  //logout 
		  loginpage.logout();
		  
		  //close application and browser.. 
		  closeBrower(); 
		  
	  }	
	  
	  
	  
	  @Test(priority = 52) 
	  public void riskMonitoring_CreateKRI() { 
		  //launch browser
		  browser_lunch("chrome");
		  
		  Login loginpage = new Login(); 
		  loginpage.login();
		  
		  RiskMonitoring RiskMonitoring = new RiskMonitoring();
		  RiskMonitoring.navigate_RiskMonitoringtab();
		  
		  RiskMonitoring.createKRI();	  
		  		  
		  //logout 
		  loginpage.logout();
		  
		  //close application and browser.. 
		  closeBrower(); 
		  
	  }	
	  
	  
	  @Test(priority = 53) 
	  public void riskMonitoring_CancelKRI() { 
		  //launch browser
		  browser_lunch("chrome");
		  
		  Login loginpage = new Login(); 
		  loginpage.login();
		  
		  RiskMonitoring RiskMonitoring = new RiskMonitoring();
		  RiskMonitoring.navigate_RiskMonitoringtab();
		  
		  RiskMonitoring.cancelKRI();	  
		  		  
		  //logout 
		  loginpage.logout();
		  
		  //close application and browser.. 
		  closeBrower(); 
		  
	  }	
	  
	  
	  @Test(priority = 54) 
	  public void riskMonitoring_ViewKRI() { 
		  //launch browser
		  browser_lunch("chrome");
		  
		  Login loginpage = new Login(); 
		  loginpage.login();
		  
		  RiskMonitoring RiskMonitoring = new RiskMonitoring();
		  RiskMonitoring.navigate_RiskMonitoringtab();
		  
		  RiskMonitoring.viewKRI();	  
		  		  
		  //logout 
		  loginpage.logout();
		  
		  //close application and browser.. 
		  closeBrower(); 
		  
	  }	
	  
	  
	  @Test(priority = 55) 
	  public void riskMonitoring_ViewKRIBack() { 
		  //launch browser
		  browser_lunch("chrome");
		  
		  Login loginpage = new Login(); 
		  loginpage.login();
		  
		  RiskMonitoring RiskMonitoring = new RiskMonitoring();
		  RiskMonitoring.navigate_RiskMonitoringtab();
		  
		  RiskMonitoring.viewKRI_Back();	  
		  		  
		  //logout 
		  loginpage.logout();
		  
		  //close application and browser.. 
		  closeBrower(); 
		  
	  }	
	  
	  
	  @Test(priority = 56) 
	  public void riskMonitoring_ViewKRIEdit() { 
		  //launch browser
		  browser_lunch("chrome");
		  
		  Login loginpage = new Login(); 
		  loginpage.login();
		  
		  RiskMonitoring RiskMonitoring = new RiskMonitoring();
		  RiskMonitoring.navigate_RiskMonitoringtab();
		  
		  RiskMonitoring.viewKRI_Edit();	  
		  		  
		  //logout 
		  //loginpage.logout();
		  
		  //close application and browser.. 
		  closeBrower(); 
		  
	  }	
	  
	  
	  @Test(priority = 57) 
	  public void riskMonitoring_ViewKRIEditCancel() { 
		  //launch browser
		  browser_lunch("chrome");
		  
		  Login loginpage = new Login(); 
		  loginpage.login();
		  
		  RiskMonitoring RiskMonitoring = new RiskMonitoring();
		  RiskMonitoring.navigate_RiskMonitoringtab();
		  
		  RiskMonitoring.viewKRI_EditCancel();	  
		  		  
		  //logout 
		  loginpage.logout();
		  
		  //close application and browser.. 
		  closeBrower(); 
		  
	  }	
	  
	  
	  
	  @Test(priority = 58) 
	  public void riskMonitoring_MapUIValidations() { 
		  //launch browser
		  browser_lunch("chrome");
		  
		  Login loginpage = new Login(); 
		  loginpage.login();
		  
		  RiskMonitoring RiskMonitoring = new RiskMonitoring();
		  RiskMonitoring.navigate_RiskMonitoringtab();
		  
		  RiskMonitoring.map_UI();	  
		  		  
		  //logout 
		  loginpage.logout();
		  
		  //close application and browser.. 
		  closeBrower(); 
		  
	  }	
	  
	  
	  @Test(priority = 59) 
	  public void riskMonitoring_MapBusinessLine() { 
		  //launch browser
		  browser_lunch("chrome");
		  
		  Login loginpage = new Login(); 
		  loginpage.login();
		  
		  RiskMonitoring RiskMonitoring = new RiskMonitoring();
		  RiskMonitoring.navigate_RiskMonitoringtab();
		  
		  RiskMonitoring.map_BusinessLine();	  
		  		  
		  //logout 
		  loginpage.logout();
		  
		  //close application and browser.. 
		  closeBrower(); 
		  
	  }	
	  
	  
	  @Test(priority = 60) 
	  public void riskMonitoring_MapThreshold() { 
		  //launch browser
		  browser_lunch("chrome");
		  
		  Login loginpage = new Login(); 
		  loginpage.login();
		  
		  RiskMonitoring RiskMonitoring = new RiskMonitoring();
		  RiskMonitoring.navigate_RiskMonitoringtab();
		  
		  RiskMonitoring.map_Threshold();	  
		  		  
		  //logout 
		  loginpage.logout();
		  
		  //close application and browser.. 
		  closeBrower(); 
		  
	  }	
	  
	  
	  @Test(priority = 61) 
	  public void riskMonitoring_MapFormula() { 
		  //launch browser
		  browser_lunch("chrome");
		  
		  Login loginpage = new Login(); 
		  loginpage.login();
		  
		  RiskMonitoring RiskMonitoring = new RiskMonitoring();
		  RiskMonitoring.navigate_RiskMonitoringtab();
		  
		  RiskMonitoring.map_Formula();  
		  		  
		  //logout 
		  loginpage.logout();
		  
		  //close application and browser.. 
		  closeBrower(); 
		  
	  }	
	  
	  
	  @Test(priority = 62) 
	  public void riskMonitoring_MapOtherDetails() { 
		  //launch browser
		  browser_lunch("chrome");
		  
		  Login loginpage = new Login(); 
		  loginpage.login();
		  
		  RiskMonitoring RiskMonitoring = new RiskMonitoring();
		  RiskMonitoring.navigate_RiskMonitoringtab();
		  
		  RiskMonitoring.map_OtherDetails();  
		  		  
		  //logout 
		  loginpage.logout();
		  
		  //close application and browser.. 
		  closeBrower(); 
		  
	  }	
	  
	  
	  @Test(priority = 63) 
	  public void riskMonitoring_MapKRIandControlRegister() { 
		  //launch browser
		  browser_lunch("chrome");
		  
		  Login loginpage = new Login(); 
		  loginpage.login();
		  
		  RiskMonitoring RiskMonitoring = new RiskMonitoring();
		  RiskMonitoring.navigate_RiskMonitoringtab();
		  
		  RiskMonitoring.map_MapKRIandControlRegister();  
		  		  
		  //logout 
		  loginpage.logout();
		  
		  //close application and browser.. 
		  closeBrower(); 
		  
	  }	
	  
	  
	  @Test(priority = 64) 
	  public void riskMonitoring_DeleteKRI() { 
		  //launch browser
		  browser_lunch("chrome");
		  
		  Login loginpage = new Login(); 
		  loginpage.login();
		  
		  RiskMonitoring RiskMonitoring = new RiskMonitoring();
		  RiskMonitoring.navigate_RiskMonitoringtab();
		  
		  RiskMonitoring.deleteKRI();  
		  		  
		  //logout 
		  loginpage.logout();
		  
		  //close application and browser.. 
		  closeBrower(); 
		  
	  }	
	  
	  
	  @Test(priority = 65) 
	  public void riskMonitoring_UpdateKRIUIValidations() { 
		  //launch browser
		  browser_lunch("chrome");
		  
		  Login loginpage = new Login(); 
		  loginpage.login();
		  
		  RiskMonitoring RiskMonitoring = new RiskMonitoring();
		  RiskMonitoring.navigate_UpdateKRIMetrics();
		  
		  RiskMonitoring.UIValidations_UpdateRiskKRI();  
		  		  
		  //logout 
		  loginpage.logout();
		  
		  //close application and browser.. 
		  closeBrower(); 
		  
	  }	
	  
	  
	  @Test(priority = 66) 
	  public void riskMonitoring_UpdateKRIMetricsUIValidations() { 
		  //launch browser
		  browser_lunch("chrome");
		  
		  Login loginpage = new Login(); 
		  loginpage.login();
		  
		  RiskMonitoring RiskMonitoring = new RiskMonitoring();
		  RiskMonitoring.navigate_UpdateKRIMetrics();
		  
		  RiskMonitoring.UIValidations_UpdateKRI();  
		  		  
		  //logout 
		  loginpage.logout();
		  
		  //close application and browser.. 
		  closeBrower(); 
		  
	  }	
	  
	  
	  @Test(priority = 67) 
	  public void riskMonitoring_ViewKRIUIValidations() { 
		  //launch browser
		  browser_lunch("chrome");
		  
		  Login loginpage = new Login(); 
		  loginpage.login();
		  
		  RiskMonitoring RiskMonitoring = new RiskMonitoring();
		  RiskMonitoring.navigate_ViewKRI();
		  
		  RiskMonitoring.verify_viewKRI();  
		  		  
		  //logout 
		  loginpage.logout();
		  
		  //close application and browser.. 
		  closeBrower(); 
		  
	  }	
	  
	  
	  @Test(priority = 68) 
	  public void riskMonitoring_ViewKRIUIValidationswithDate() { 
		  //launch browser
		  browser_lunch("chrome");
		  
		  Login loginpage = new Login(); 
		  loginpage.login();
		  
		  RiskMonitoring RiskMonitoring = new RiskMonitoring();
		  RiskMonitoring.navigate_ViewKRI();
		  
		  RiskMonitoring.verify_KeyRiskIndicatorsGrid_WithDate();  
		  		  
		  //logout 
		  loginpage.logout();
		  
		  //close application and browser.. 
		  closeBrower(); 
		  
	  }	
	  
	  
	  @Test(priority = 69) 
	  public void riskAssesment_CreateRiskAssesmentUIValidations() { 
		  //launch browser
		  browser_lunch("chrome");
		  
		  Login loginpage = new Login(); 
		  loginpage.login();
		  
		  RiskAssesment RiskAssesment = new RiskAssesment();
		  RiskAssesment.navigate_RiskAssesementtab();
		  
		  RiskAssesment.UIValidations_CreateRiskAssesment();  
		  		  
		  //logout 
		  loginpage.logout();
		  
		  //close application and browser.. 
		  closeBrower(); 
		  
	  }	
	  
	  
	  @Test(priority = 70) 
	  public void riskAssesment_AssesUIValidations() { 
		  //launch browser
		  browser_lunch("chrome");
		  
		  Login loginpage = new Login(); 
		  loginpage.login();
		  
		  RiskAssesment RiskAssesment = new RiskAssesment();
		  RiskAssesment.navigate_RiskAssesementtab();
		  
		  RiskAssesment.CreateRiskAssesment_Assess();  
		  
		  RiskAssesment.uiValidations_AddRiskAssement();
		  
		  //logout 
		  loginpage.logout();
		  
		  //close application and browser.. 
		  closeBrower(); 
		  
	  }	
	  
	  
	  @Test(priority = 70) 
	  public void riskAssesment_ControlAssesmentUIValidations() { 
		  //launch browser
		  browser_lunch("chrome");
		  
		  Login loginpage = new Login(); 
		  loginpage.login();
		  
		  RiskAssesment RiskAssesment = new RiskAssesment();
		  RiskAssesment.navigate_RiskAssesementtab();
		  
		  RiskAssesment.CreateRiskAssesment_Assess();  
		  
		  RiskAssesment.controlAssesment();
		  
		  //logout 
		  loginpage.logout();
		  
		  //close application and browser.. 
		  closeBrower(); 
		  
	  }	
	  
	  
	  @Test(priority = 71) 
	  public void riskAssesment_ControlAssesValidations() { 
		  //launch browser
		  browser_lunch("chrome");
		  
		  Login loginpage = new Login(); 
		  loginpage.login();
		  
		  RiskAssesment RiskAssesment = new RiskAssesment();
		  RiskAssesment.navigate_RiskAssesementtab();
		  
		  RiskAssesment.CreateRiskAssesment_Assess();  
		  
		  RiskAssesment.controlAssesment_Asses();
		  
		  //logout 
		  loginpage.logout();
		  
		  //close application and browser.. 
		  closeBrower(); 
		  
	  }	
	  
	  
	  @Test(priority = 72) 
	  public void riskAssesment_RiskAssesmentValidations() { 
		  //launch browser
		  browser_lunch("chrome");
		  
		  Login loginpage = new Login(); 
		  loginpage.login();
		  
		  RiskAssesment RiskAssesment = new RiskAssesment();
		  RiskAssesment.navigate_RiskAssesementtab();
		  
		  RiskAssesment.CreateRiskAssesment_Assess();  
		  
		  RiskAssesment.riskAssesment();
		  
		  //logout 
		  loginpage.logout();
		  
		  //close application and browser.. 
		  closeBrower(); 
		  
	  }	
	  
	  
	  @Test(priority = 73) 
	  public void riskAssesment_TreatmentValidations() { 
		  //launch browser
		  browser_lunch("chrome");
		  
		  Login loginpage = new Login(); 
		  loginpage.login();
		  
		  RiskAssesment RiskAssesment = new RiskAssesment();
		  RiskAssesment.navigate_RiskAssesementtab();
		  
		  RiskAssesment.CreateRiskAssesment_Assess();  
		  
		  RiskAssesment.treatment();
		  
		  //logout 
		  loginpage.logout();
		  
		  //close application and browser.. 
		  closeBrower(); 
		  
	  }	
	  
	  
	  @Test(priority = 73) 
	  public void riskAssesment_NextAssesmentValidations() { 
		  //launch browser
		  browser_lunch("chrome");
		  
		  Login loginpage = new Login(); 
		  loginpage.login();
		  
		  RiskAssesment RiskAssesment = new RiskAssesment();
		  RiskAssesment.navigate_RiskAssesementtab();
		  
		  RiskAssesment.CreateRiskAssesment_Assess();  
		  
		  RiskAssesment.nextAssesment();
		  
		  //logout 
		  loginpage.logout();
		  
		  //close application and browser.. 
		  closeBrower(); 
		  
	  }	
	  
	  
	  @Test(priority = 74) 
	  public void riskAssesment_Submission_UIValidations() { 
		  //launch browser
		  browser_lunch("chrome");
		  
		  Login loginpage = new Login(); 
		  loginpage.login();
		  
		  RiskAssesment RiskAssesment = new RiskAssesment();
		  RiskAssesment.navigate_RiskAssesmentSubmission();
		  
		  RiskAssesment.uiValidations_RiskAssesmentSubmission();  
		  
		  //logout 
		  loginpage.logout();
		  
		  //close application and browser.. 
		  closeBrower(); 
		  
	  }	
	  
	  
	  @Test(priority = 75) 
	  public void riskAssesment_SubmissionApprove_UIValidations() { 
		  //launch browser
		  browser_lunch("chrome");
		  
		  Login loginpage = new Login(); 
		  loginpage.login();
		  
		  RiskAssesment RiskAssesment = new RiskAssesment();
		  RiskAssesment.navigate_RiskAssesmentSubmission();
		  
		  RiskAssesment.riskAssesmentDetails_submitforApproval();  
		  
		  RiskAssesment.approve_riskAssesmentView();
		  
		  //logout 
		  loginpage.logout();
		  
		  //close application and browser.. 
		  closeBrower(); 
		  
	  }	
	  
	  
	  @Test(priority = 76) 
	  public void riskAssesment_Approve_UIValidations() { 
		  //launch browser
		  browser_lunch("chrome");
		  
		  Login loginpage = new Login(); 
		  loginpage.login();
		  
		  RiskAssesment RiskAssesment = new RiskAssesment();
		  RiskAssesment.navigate_approveRiskAssesment();
		  
		  RiskAssesment.approve_UIValidations();  
		  
		  //logout 
		  loginpage.logout();
		  
		  //close application and browser.. 
		  closeBrower(); 
		  
	  }	
	  
	  
	  @Test(priority = 77) 
	  public void riskAssesment_Approve_RiskAssesmentDetails() { 
		  //launch browser
		  browser_lunch("chrome");
		  
		  Login loginpage = new Login(); 
		  loginpage.login();
		  
		  RiskAssesment RiskAssesment = new RiskAssesment();
		  RiskAssesment.navigate_approveRiskAssesment();
		  
		  RiskAssesment.approve_UIValidations();  
		  
		  RiskAssesment.riskAssesmentDetails_approveAssesment();  
		  
		  //logout 
		  loginpage.logout();
		  
		  //close application and browser.. 
		  closeBrower(); 
		  
	  }	
	  
	  
}
