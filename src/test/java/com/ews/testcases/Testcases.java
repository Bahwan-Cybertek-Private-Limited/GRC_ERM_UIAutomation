package com.ews.testcases;

import com.ews.baseclass.Baseclass;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.ews.pages.*;

import utils.ExtentReportListner;

@Listeners(ExtentReportListner.class)
public class Testcases extends Baseclass{
	
	/*
	 * @BeforeTest public void openbrowser() { browser_lunch("chrome"); }
	 */
	
	
	@Test(priority = 1)
	public void loginPage_Validations()
	{
		//launch browser
		browser_lunch("chrome");
		
		Login loginpage = new Login();
		loginpage.login_Validations();
		
		//close application and browser..
		closeBrower();
	}
	
	@Test(priority = 2)
	public void logging()
	{
		//launch browser
		browser_lunch("chrome");
				
		Login loginpage = new Login();
		loginpage.login();
		
		//logout
		loginpage.logout();
		
		//close application and browser..
		closeBrower();
	}
	

	
	
	  @Test(priority = 3) 
	  public void analytics_Dashboard() { 
	  
	  //launch browser
	  browser_lunch("chrome");
	  
	  Login loginpage = new Login(); 
	  loginpage.login();
	  
	  Analytics anal = new Analytics();
	  anal.verify_AnalyticsDashboard();
	  
	  anal.verify_KeyRiskIndicatorsGrid();
	  
	  anal.verify_KeyRiskIndicatorsGrid_WithDate();
	 	 
	  //logout 
	  loginpage.logout();
	  
	  //close application and browser.. 
	  closeBrower(); 
	  
	  }
	  
	  
	  @Test(priority = 4) 
	  public void analytics_HeatMap() { 
		  //launch browser
		  browser_lunch("chrome");
		  
		  Login loginpage = new Login(); 
		  loginpage.login();
		  
		  Analytics anal = new Analytics();
		  anal.verify_AnalyticsDashboard();		 
		
		  anal.verify_HeatmapData();
		 		 
		  //logout 
		  loginpage.logout();
		  
		  //close application and browser.. 
		  closeBrower(); 
		  
	  }
	  
	  
	  @Test(priority = 5) 
	  public void analytics_ResudialHeatMap() { 
		  //launch browser
		  browser_lunch("chrome");
		  
		  Login loginpage = new Login(); 
		  loginpage.login();
		  
		  Analytics anal = new Analytics();
		  anal.verify_AnalyticsDashboard();		 
				  
		  anal.verify_ResidualHeatmapData();
		  
		  //logout 
		  loginpage.logout();
		  
		  //close application and browser.. 
		  closeBrower(); 
		  
	  }
		
	  
	  @Test(priority = 6) 
	  public void riskLibrary_validations() { 
		  //launch browser
		  browser_lunch("chrome");
		  
		  Login loginpage = new Login(); 
		  loginpage.login();
		  
		  RiskLibrary lib = new RiskLibrary();
		  lib.verify_RiskLibrary();
		  
		  //logout 
		  loginpage.logout();
		  
		  //close application and browser.. 
		  closeBrower(); 
		  
	  }
	  
	  
	  @Test(priority = 7) 
	  public void riskLibrary_createSingleRiskValidations() { 
		  //launch browser
		  browser_lunch("chrome");
		  
		  Login loginpage = new Login(); 
		  loginpage.login();
		  
		  RiskLibrary lib = new RiskLibrary();
		  lib.createSingleRisk_Validations();
		  
		  //logout 
		  loginpage.logout();
		  
		  //close application and browser.. 
		  closeBrower(); 
		  
	  }
	  
	  
	  @Test(priority = 8) 
	  public void riskLibrary_createSingleRisk() { 
		  //launch browser
		  browser_lunch("chrome");
		  
		  Login loginpage = new Login(); 
		  loginpage.login();
		  
		  RiskLibrary lib = new RiskLibrary();
		  lib.createSingleRisk();
		  
		  //logout 
		  loginpage.logout();
		  
		  //close application and browser.. 
		  closeBrower(); 
		  
	  }
	  
	  
	  
	  @Test(priority = 9) 
	  public void riskLibrary_verifyBulkRiskpage() { 
		  //launch browser
		  browser_lunch("chrome");
		  
		  Login loginpage = new Login(); 
		  loginpage.login();
		  
		  RiskLibrary lib = new RiskLibrary();
		  lib.verifyBulkRiskPage();
		  
		  //logout 
		  loginpage.logout();
		  
		  //close application and browser.. 
		  closeBrower(); 
		  
	  }	 
	   
	  
	  
	  @Test(priority = 10) 
	  public void controlLibrary_verifyUI() { 
		  //launch browser
		  browser_lunch("chrome");
		  
		  Login loginpage = new Login(); 
		  loginpage.login();
		  
		  ControlLibrary control = new ControlLibrary();
		  control.verify_ControlLibrary();
		  
		  //logout 
		  loginpage.logout();
		  
		  //close application and browser.. 
		  closeBrower(); 
		  
	  }	 
	  
	  
	  @Test(priority = 11) 
	  public void verify_RiskAppetite() { 
		  //launch browser
		  browser_lunch("chrome");
		  
		  Login loginpage = new Login(); 
		  loginpage.login();
		  
		  RiskAppetite control = new RiskAppetite();
		  control.verify_RiskAppetite();
		  
		  //logout 
		  loginpage.logout();
		  
		  //close application and browser.. 
		  closeBrower(); 
		  
	  }	 
	  
	  
	  
	  @Test(priority = 12) 
	  public void riskAppetite_grid() { 
		  //launch browser
		  browser_lunch("chrome");
		  
		  Login loginpage = new Login(); 
		  loginpage.login();
		  
		  RiskAppetite control = new RiskAppetite();
		  control.verfiyGrid();
		  
		  //logout 
		  loginpage.logout();
		  
		  //close application and browser.. 
		  closeBrower(); 
		  
	  }	 
	  
		
	  @Test(priority = 13) 
	  public void riskAppetite_creatQulitativeRisk() { 
		  //launch browser
		  browser_lunch("chrome");
		  
		  Login loginpage = new Login(); 
		  loginpage.login();
		  
		  RiskAppetite control = new RiskAppetite();
		  control.createRiskAppetite_Qualitative();
		  
		  //logout 
		  loginpage.logout();
		  
		  //close application and browser.. 
		  closeBrower(); 
		  
	  }	 
	  
	  
	  

	  @Test(priority = 14) 
	  public void riskAppetite_creatQuantitativeRisk() { 
		  //launch browser
		  browser_lunch("chrome");
		  
		  Login loginpage = new Login(); 
		  loginpage.login();
		  
		  RiskAppetite control = new RiskAppetite();
		  control.createRiskAppetite_Quantitative();
		  
		  //logout 
		  loginpage.logout();
		  
		  //close application and browser.. 
		  closeBrower(); 
		  
	  }	
	  
	  
	  
	  @Test(priority = 15) 
	  public void riskAppetite_verifyCancel() { 
		  //launch browser
		  browser_lunch("chrome");
		  
		  Login loginpage = new Login(); 
		  loginpage.login();
		  
		  RiskAppetite control = new RiskAppetite();
		  control.cancel_RiskAppetite();
		  
		  //logout 
		  loginpage.logout();
		  
		  //close application and browser.. 
		  closeBrower(); 
		  
	  }	
	  
	  
	  @Test(priority = 16) 
	  public void riskidentification() { 
		  //launch browser
		  browser_lunch("chrome");
		  
		  Login loginpage = new Login(); 
		  loginpage.login();
		  
		  RiskIdentification control = new RiskIdentification();
		  control.verify_RiskAppetite();
		  
		  //logout 
		  loginpage.logout();
		  
		  //close application and browser.. 
		  closeBrower(); 
		  
	  }	
	  
	  
	  
	  
	  @Test(priority = 17) 
	  public void riskidentification_verifygrid() { 
		  //launch browser
		  browser_lunch("chrome");
		  
		  Login loginpage = new Login(); 
		  loginpage.login();
		  
		  RiskIdentification control = new RiskIdentification();
		  control.verfiyGrid();
		  
		  //logout 
		  loginpage.logout();
		  
		  //close application and browser.. 
		  closeBrower(); 
		  
	  }	
	  
	  
	  @Test(priority = 18) 
	  public void riskidentification_cancelworkshop() { 
		  //launch browser
		  browser_lunch("chrome");
		  
		  Login loginpage = new Login(); 
		  loginpage.login();
		  
		  RiskIdentification control = new RiskIdentification();
		  control.cancel_workshop();
		  
		  //logout 
		  loginpage.logout();
		  
		  //close application and browser.. 
		  closeBrower(); 
		  
	  }	
	  
	  
	  @Test(priority = 19) 
	  public void riskidentification_createworkshop() { 
		  //launch browser
		  browser_lunch("chrome");
		  
		  Login loginpage = new Login(); 
		  loginpage.login();
		  
		  RiskIdentification control = new RiskIdentification();
		  control.createRiskworkshop();
		  
		  //logout 
		  loginpage.logout();
		  
		  //close application and browser.. 
		  closeBrower(); 
		  
	  }	
	  
	  
	  @Test(priority = 20) 
	  public void riskidentification_creatworshopwithoutupload() { 
		  //launch browser
		  browser_lunch("chrome");
		  
		  Login loginpage = new Login(); 
		  loginpage.login();
		  
		  RiskIdentification control = new RiskIdentification();
		  control.createRiskworkshop();
		  
		  //logout 
		  loginpage.logout();
		  
		  //close application and browser.. 
		  closeBrower(); 
		  
	  }	
	  
	  
	  
	  @Test(priority = 21) 
	  public void riskidentification_differntfileupload() { 
		  //launch browser
		  browser_lunch("chrome");
		  
		  Login loginpage = new Login(); 
		  loginpage.login();
		  
		  RiskIdentification control = new RiskIdentification();
		  control.createRiskworkshop();
		  
		  //logout 
		  loginpage.logout();
		  
		  //close application and browser.. 
		  closeBrower(); 
		  
	  }	
	  
	  
	  
	  @Test(priority = 22) 
	  public void register_CreateRiskUIValidations() { 
		  //launch browser
		  browser_lunch("chrome");
		  
		  Login loginpage = new Login(); 
		  loginpage.login();
		  
		  Register register = new Register();
		  register.register_CreateRiskRegisterUiValidations();
		  
		  //logout 
		  loginpage.logout();
		  
		  //close application and browser.. 
		  closeBrower(); 
		  
	  }	
	  
	  
	  @Test(priority = 23) 
	  public void register_CreateRisk_AddToRiskRegisterUIValidations() { 
		  //launch browser
		  browser_lunch("chrome");
		  
		  Login loginpage = new Login(); 
		  loginpage.login();
		  
		  Register register = new Register();
		  register.addToRiskRegister_UiValidations();
		  
		  //logout 
		  loginpage.logout();
		  
		  //close application and browser.. 
		  closeBrower(); 
		  
	  }	
	  
	  
	  @Test(priority = 24) 
	  public void register_CreateRisk_AdditionalinfoUIValidations() { 
		  //launch browser
		  browser_lunch("chrome");
		  
		  Login loginpage = new Login(); 
		  loginpage.login();
		  
		  Register register = new Register();
		  register.additonalinfo_UiValidations();
		   
		  //logout 
		  loginpage.logout();
		  
		  //close application and browser.. 
		  closeBrower(); 
		  
	  }	
	  
	  
	  @Test(priority = 25) 
	  public void register_CreateRisk_AddControlsUIValidations() { 
		  //launch browser
		  browser_lunch("chrome");
		  
		  Login loginpage = new Login(); 
		  loginpage.login();
		  
		  Register register = new Register();
		  register.addControls_UIValidations();
		  
		  //logout 
		  loginpage.logout();
		  
		  //close application and browser.. 
		  closeBrower(); 
		  
	  }	
	  
	  
	  @Test(priority = 26) 
	  public void register_CreateRisk_ScoringUIValidations() { 
		  //launch browser
		  browser_lunch("chrome");
		  
		  Login loginpage = new Login(); 
		  loginpage.login();
		  
		  Register register = new Register();
		  register.scoring_UIValidations();
		  
		  //logout 
		  loginpage.logout();
		  
		  //close application and browser.. 
		  closeBrower(); 
		  
	  }		
	  
	  
	  @Test(priority = 27) 
	  public void register_CreateRisk_TreatmentUIValidations() { 
		  //launch browser
		  browser_lunch("chrome");
		  
		  Login loginpage = new Login(); 
		  loginpage.login();
		  
		  Register register = new Register();
		  register.treatment_UiValidations();
		  
		  //logout 
		  loginpage.logout();
		  
		  //close application and browser.. 
		  closeBrower(); 
		  
	  }		
	  
	  
	  @Test(priority = 28) 
	  public void register_CreateRisk_UpdateScoring() { 
		  //launch browser
		  browser_lunch("chrome");
		  
		  Login loginpage = new Login(); 
		  loginpage.login();
		  
		  Register register = new Register();
		  register.update_Scoring();
		  
		  //logout 
		  loginpage.logout();
		  
		  //close application and browser.. 
		  closeBrower(); 
		  
	  }		
	  
	  
	  @Test(priority = 29) 
	  public void register_CreateRisk_UpdateTreatment() { 
		  //launch browser
		  browser_lunch("chrome");
		  
		  Login loginpage = new Login(); 
		  loginpage.login();
		  
		  Register register = new Register();
		  register.updateTreatment();
		  
		  //logout 
		  loginpage.logout();
		  
		  //close application and browser.. 
		  closeBrower(); 
		  
	  }		
	  
	  
	  @Test(priority = 30) 
	  public void register_ViewRiskUIValidations() { 
		  //launch browser
		  browser_lunch("chrome");
		  
		  Login loginpage = new Login(); 
		  loginpage.login();
		  
		  ViewRiskRegister viewregister = new ViewRiskRegister();
		  viewregister.register_ViewRiskRegisterValidations();
		  
		  //logout 
		  loginpage.logout();
		  
		  //close application and browser.. 
		  closeBrower(); 
		  
	  }	
	  
	  
	  @Test(priority = 31) 
	  public void register_ViewRisk_AddToRiskRegisterUIValidations() { 
		  //launch browser
		  browser_lunch("chrome");
		  
		  Login loginpage = new Login(); 
		  loginpage.login();
		  
		  ViewRiskRegister viewregister = new ViewRiskRegister();
		  viewregister.addToRiskRegister_UiValidations();
		  
		  //logout 
		  loginpage.logout();
		  
		  //close application and browser.. 
		  closeBrower(); 
		  
	  }	
	  
	  
	  @Test(priority = 32) 
	  public void register_ViewRisk_AdditionalinfoUIValidations() { 
		  //launch browser
		  browser_lunch("chrome");
		  
		  Login loginpage = new Login(); 
		  loginpage.login();
		  
		  ViewRiskRegister viewregister = new ViewRiskRegister();
		  viewregister.additonalinfo_UiValidations();
		  
		  //logout 
		  loginpage.logout();
		  
		  //close application and browser.. 
		  closeBrower(); 
		  
	  }	
	  
	  
	  @Test(priority = 33) 
	  public void register_ViewRisk_AddControlsUIValidations() { 
		  //launch browser
		  browser_lunch("chrome");
		  
		  Login loginpage = new Login(); 
		  loginpage.login();
		  
		  ViewRiskRegister viewregister = new ViewRiskRegister();
		  viewregister.addControls_UIValidations();
		  
		  //logout 
		  loginpage.logout();
		  
		  //close application and browser.. 
		  closeBrower(); 
		  
	  }	
	  
	  
	  @Test(priority = 34) 
	  public void register_ViewRisk_ScoringUIValidations() { 
		  //launch browser
		  browser_lunch("chrome");
		  
		  Login loginpage = new Login(); 
		  loginpage.login();
		  
		  ViewRiskRegister viewregister = new ViewRiskRegister();
		  viewregister.scoring_UIValidations();
		  
		  //logout 
		  loginpage.logout();
		  
		  //close application and browser.. 
		  closeBrower(); 
		  
	  }		
	  
	  
	  @Test(priority = 35) 
	  public void register_ViewRisk_TreatmentUIValidations() { 
		  //launch browser
		  browser_lunch("chrome");
		  
		  Login loginpage = new Login(); 
		  loginpage.login();
		  
		  ViewRiskRegister viewregister = new ViewRiskRegister();
		  viewregister.treatment_UiValidations();
		  
		  //logout 
		  loginpage.logout();
		  
		  //close application and browser.. 
		  closeBrower(); 
		  
	  }		
	  
	  
	  @Test(priority = 36) 
	  public void register_ViewRisk_UpdateScoring() { 
		  //launch browser
		  browser_lunch("chrome");
		  
		  Login loginpage = new Login(); 
		  loginpage.login();
		  
		  ViewRiskRegister viewregister = new ViewRiskRegister();
		  viewregister.update_Scoring();
		  
		  //logout 
		  loginpage.logout();
		  
		  //close application and browser.. 
		  closeBrower(); 
		  
	  }		
	  
	  
	  @Test(priority = 37) 
	  public void register_ViewRisk_UpdateTreatment() { 
		  //launch browser
		  browser_lunch("chrome");
		  
		  Login loginpage = new Login(); 
		  loginpage.login();
		  
		  ViewRiskRegister viewregister = new ViewRiskRegister();
		  viewregister.updateTreatment();
		  
		  //logout 
		  loginpage.logout();
		  
		  //close application and browser.. 
		  closeBrower(); 
		  
	  }		
	  
	  
	  @Test(priority = 38) 
	  public void register_ControlRegister() { 
		  //launch browser
		  browser_lunch("chrome");
		  
		  Login loginpage = new Login(); 
		  loginpage.login();
		  
		  Register Register = new Register();
		  Register.register_ControlUiValidations();
		  
		  //logout 
		  loginpage.logout();
		  
		  //close application and browser.. 
		  closeBrower(); 
		  
	  }		
	  
	  
	  
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
