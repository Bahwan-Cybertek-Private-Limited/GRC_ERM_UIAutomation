package com.ews.pages;

import static org.testng.Assert.fail;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.ews.baseclass.Baseclass;
import com.relevantcodes.extentreports.LogStatus;

public class Register extends Baseclass {
	
	public String logo = "//*[@class='ews-logo']";
	public String ERM_Module = "//*[contains(text(),'Enterprise Risk Management')]";
	public String Module_MouseOver = "//*[@class='k-widget k-drawer k-drawer-start']";
	public String lnk_Register = "//*[contains(text(),'Register')]";
	public String lnk_CreateRegister = "//*[contains(text(),'Create Risk Register')]";
	public String drp_SelectSource = "//*[@ng-reflect-name='sourceSelect']";
	public String drp_DepartmentName = "//*[@ng-reflect-name='department']";
	public String drp_WorkshopId = "//*[@ng-reflect-name='workshopId']";
	public String drp_Owner = "//*[@ng-reflect-name='ownerName']";
	public String btn_ShowRiskLibrary = "//*[contains(text(),' Show Risk Library ')]";
	public String btn_Cancel = "//*[contains(text(),' Cancel ')]";
	public String btn_AddToRiskRegister = "//*[contains(text(),' Add to Risk Register ')]";
	
	public String chk_itemcheckbox = "//*[@ng-reflect-item-index='0']";
	public String btn_AddAdditionalInfo = "//button[contains(text(),' Add Additional Information ')]";
	public String chk_grid2checkbox = "//input[@id='k-grid2-checkbox0']";
	public String lnk_Additionalinfo = "//span[@title='additional-information']";
	public String chk_AddControlsCheckbox = "//input[@ng-reflect-item-index='0']";
	public String tab_AddControls = "//span[contains(text(),'Add Controls')]";
	public String btn_AddControls_AddRisk = "//button[contains(text(),' Add to Risk ')]";
	public String tab_Scoring = "//span[contains(text(),'Scoring')]";
	public String btn_Scoring_Edit = "//button[contains(text(),' Edit ')]";
	public String tab_Treatment = "//span[contains(text(),'Treatment')]";
	public String btn_Treatment_Edit = "//button[contains(text(),' Edit ')]";
	public String btn_AddControl_Update = "//button[contains(text(),' Edit & Update ')]";
	
	//scoring tab
	public String lbl_Scoring_InternetRisk = "//div[contains(text(),'Inherent Risk Quantitative Impact')]";
	public String lbl_Scoring_ResidualRisk = "//div[contains(text(),'Residual Risk Quantitative Impact')]";
	public String lbl_Scoring_InternetImpact = "//div[contains(text(),'Inherent Impact Rating')]";
	public String lbl_Scoring_ResidualImpact = "//div[contains(text(),'Residual Impact Rating')]";
	public String lbl_Scoring_InternetSpeed = "//div[contains(text(),'Inherent Speed of Onset')]";
	public String lbl_Scoring_ReidualSpeed = "//div[contains(text(),'Residual Speed of Onset')]";
	public String lbl_Scoring_InternetRating = "//div[contains(text(),'Inherent Likelihood Rating')]";
	public String lbl_Scoring_ResidualRating = "//div[contains(text(),'Residual Likelihood Rating')]";
	public String lbl_Scoring_InherentRiskRating = "//div[contains(text(),'Inherent Risk Rating')]";
	public String lbl_Scoring_ResidualRiskRating = "//div[contains(text(),'Residual Risk Rating')]";
	
	//Treatement tab
	public  String  lbl_Treatment_ResponseCategory = "//*[contains(text(),'Response Category')]";
	public  String lbl_Treatment_Justification = "//*[contains(text(),'Justification')]";
	
	public String lnk_BackToRegister = "//a[contains(text(),'Back to Risk Register')]";
	
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

	//Treatement 
	public String drp_treatmentResponseCategory = "//*[@ng-reflect-text='Response Category']//following-sibling::kendo-dropdownlist/span";
	public String txtarea = "//*[@ng-reflect-text='Justification']//following-sibling::textarea";
	public String btn_Treat_Update = "//button[@class='update-btn k-button k-primary']";
	public String btn_Treat_Cancel = "//button[@class='cancel-btn k-button']";
	public String btn_Treat_AddInsurance = "//*[contains(text(),'Add Insurance')]";
	
	
	public String lnk_cal_Today = "//*[@class='k-today']";
	public String lnk_FromCal = "(//*[@title='Toggle calendar'])[1]";
	
	public String lnk_ContrlRegister = "//*[@aria-label='Control Register']/span";
	public String btn_ExportAs = "//span[contains(text(),'Export As')]";
	
	
	public void register_CreateRiskRegisterUiValidations()	{
		try	{
			navigate_RegisterTab();
			
			createRisk_UIValidations();
			
			fill_RiskRegisterData();			
			
			List<WebElement> griddatacount = driver.findElements(By.xpath("//table[@role='presentation']/tbody/tr"));
			
			if(griddatacount.size() > 1) {
				test.log(LogStatus.PASS, "CreateRiskRegister grid data is displayed");
			}
			else {
				test.log(LogStatus.INFO, "No records found in RiskRegister grid");
			}
			
			if(ispresent(btn_Cancel)) {
				test.log(LogStatus.PASS, "Cancel is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "Cancel is not displayed");
			}
			
			if(ispresent(btn_AddToRiskRegister)) {
				test.log(LogStatus.PASS, "AddToRiskRegister is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "AddToRiskRegister is not displayed");
			}
			
		}
		catch(Exception ex)	{
			
		}
	}
	
	
	
	public void addToRiskRegister_UiValidations()	{
		try {
		
			navigate_RegisterTab();			
					
			fill_RiskRegisterData();
			
			verifyandcheck_gridcheckbox();
			
			clickOn(btn_AddToRiskRegister, "AddToRiskRegister button");
			Thread.sleep(2000);
			
			List<WebElement> griddatacount = driver.findElements(By.xpath("//table[@role='presentation']/tbody/tr"));
			
			if(griddatacount.size() > 1) {
				test.log(LogStatus.PASS, "CreateRiskRegister grid data is displayed");
			}
			else {
				test.log(LogStatus.INFO, "No records found in RiskRegister grid");
			}			

			if(isDisabled(btn_AddAdditionalInfo)) {
				test.log(LogStatus.PASS, "Additionalinfo is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "Additionalinfo is not displayed");
			}
		}
		catch(Exception ex) {
			
		}
	}
	
	
	public void additonalinfo_UiValidations()	{
		try {
			
			navigate_RegisterTab();			
			
			fill_RiskRegisterData();
			
			verifyandcheck_gridcheckbox();
			
			clickOn(btn_AddToRiskRegister, "AddToRiskRegister button");
			Thread.sleep(2000);
			
			List<WebElement> griddatacount = driver.findElements(By.xpath("//table[@role='presentation']/tbody/tr"));
			
			if(griddatacount.size() > 1) {
				test.log(LogStatus.PASS, "CreateRiskRegister grid data is displayed");
			}
			else {
				test.log(LogStatus.INFO, "No records found in RiskRegister grid");
			}			

			//addToRiskRegister_UiValidations();
			
			clickOn(chk_AddControlsCheckbox, "AddToRiskRegister page checkbox");
			Thread.sleep(2000);
			
			clickOn(btn_AddAdditionalInfo, "AddAdditionalInfo button");
			Thread.sleep(2000);
			
			if(ispresent(lnk_BackToRegister)) {
				test.log(LogStatus.PASS, "BackToRiskRegister link is displayed");
				
				List<WebElement> griddatacount1 = driver.findElements(By.xpath("(//table[@role='presentation']/tbody)[1]/tr"));
				
				if(griddatacount1.size() > 1) {
					test.log(LogStatus.PASS, "Additionalinfo grid data is displayed");
				}
				else {
					test.log(LogStatus.INFO, "No records found in Additionalinfo grid");
				}				
				
			}
			else {
				test.log(LogStatus.FAIL, "BackToRiskRegister link is not displayed");
			}
			
			
		}
		catch(Exception ex) {
			
		}
	}
	
	
	public void createRisk_UIValidations()	{
		try	{
			if(ispresent(drp_SelectSource)) {
				test.log(LogStatus.PASS, "SelectSource is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "SelectSource is not displayed");
			}
			
			if(ispresent(drp_DepartmentName)) {
				test.log(LogStatus.PASS, "Department is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "Department is not displayed");
			}
			
			if(ispresent(btn_ShowRiskLibrary) && isDisabled(btn_ShowRiskLibrary)) {
				test.log(LogStatus.PASS, "ShowRiskLibrary button  is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "ShowRiskLibrary button is not displayed");
			}
			
		}
		catch(Exception ex) {
			
		}
	}
	
	
	
	public void navigate_RegisterTab()	{
		try {
			Thread.sleep(3000);
			clickOn(ERM_Module,"ERM module");
			Thread.sleep(2000);
			clickOn(Module_MouseOver,"slide mouseover");
			Thread.sleep(2000);
			clickOn(lnk_Register,"Register link");
			Thread.sleep(2000);
			clickOn(lnk_CreateRegister,"CreateRegister link");
			Thread.sleep(2000);
			
			clickOn(logo,"mouseover");
			Thread.sleep(4000);
		}
		catch(Exception ex)	{
			
		}
	}
	

	public void fill_RiskRegisterData()	{
		try	{
			clickOn(drp_SelectSource,"selectsource");

			Thread.sleep(2000);
			keypress_Down();
			
			clickOn(drp_DepartmentName,"DepartmentName");
			Thread.sleep(2000);
			/*
			 * List<WebElement> list = driver.findElements(By.
			 * xpath("//*[@class='k-animation-container k-animation-container-shown']//li//span"
			 * )); System.out.println(list.size());
			 * System.out.println(list.get(0).getText());
			 */
			keypress_Down();
			
			
			clickOn(drp_WorkshopId,"Workshopid");
			Thread.sleep(2000);
			
			
			keypress_Down();
			
			clickOn(drp_Owner,"Owner");
			Thread.sleep(2000);
			keypress_Down();
			
			clickOn(btn_ShowRiskLibrary,"ShowRiskLibrary button");
			Thread.sleep(2000);
		}
		catch(Exception ex) {
			
		}
	}
	
	
	public void addControls_UIValidations()	{
		try	{
			
			navigate_RegisterTab();			
			
			fill_RiskRegisterData();
			
			verifyandcheck_gridcheckbox();
			
			clickOn(btn_AddToRiskRegister, "AddToRiskRegister button");
			Thread.sleep(2000);
			
			clickOn(chk_AddControlsCheckbox, "AddToRiskRegister page checkbox");
			Thread.sleep(2000);
			
			clickOn(btn_AddAdditionalInfo, "AddAdditionalInfo button");
			Thread.sleep(2000);
			
			
			List<WebElement> griddatacount = driver.findElements(By.xpath("(//table[@role='presentation']/tbody)[2]/tr"));
			
			if(griddatacount.size() > 1) {
				test.log(LogStatus.PASS, "AddControl grid data is displayed");
			}
			else {
				test.log(LogStatus.INFO, "No records found in AddControl grid");
			}	
			
			
			if(isDisabled(btn_AddControls_AddRisk)) {
				test.log(LogStatus.PASS, "AddRisk is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "AddRisk is not displayed");
			}
		}
		catch(Exception ex)	{
			
		}
	}
	
	
	public void scoring_UIValidations()	{
		try	{
			
			navigate_RegisterTab();				
			
			fill_RiskRegisterData();			
			
			verifyandcheck_gridcheckbox();
						
			clickOn(btn_AddToRiskRegister, "AddToRiskRegister button");
			Thread.sleep(2000);
			
			clickOn(chk_AddControlsCheckbox, "AddToRiskRegister page checkbox");
			Thread.sleep(2000);
			
			clickOn(btn_AddAdditionalInfo, " AddAdditionalInfo button");
			Thread.sleep(2000);			
			
			clickOn(tab_Scoring,"scoring tab");
			Thread.sleep(2000);
			keypress_Down();			
			
			List<WebElement> griddatacount = driver.findElements(By.xpath("(//table[@role='presentation']/tbody)[2]/tr"));
			
			if(griddatacount.size() > 1) {
				test.log(LogStatus.PASS, "Control grid data is displayed");
			}
			else {
				test.log(LogStatus.INFO, "No records found in Control grid");
			}	
			
			Thread.sleep(3000);
			if(ispresent(lbl_Scoring_InherentRiskRating)) {
				test.log(LogStatus.PASS, "Scoring_InherentRiskRating is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "Scoring_InherentRiskRating is not displayed");
			}
			
			if(ispresent(lbl_Scoring_InternetImpact)) {
				test.log(LogStatus.PASS, "Scoring_InternetImpact is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "Scoring_InternetImpact is not displayed");
			}
			
			if(ispresent(lbl_Scoring_InternetRating)) {
				test.log(LogStatus.PASS, "Scoring_InternetRating is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "Scoring_InternetRating is not displayed");
			}
			
			if(ispresent(lbl_Scoring_InternetRisk)) {
				test.log(LogStatus.PASS, "Scoring_InternetRisk is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "Scoring_InternetRisk is not displayed");
			}
			
			if(ispresent(lbl_Scoring_InternetSpeed)) {
				test.log(LogStatus.PASS, "Scoring_InternetSpeed is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "Scoring_InternetSpeed is not displayed");
			}
			
			if(ispresent(lbl_Scoring_ReidualSpeed)) {
				test.log(LogStatus.PASS, "Scoring_ReidualSpeed is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "Scoring_ReidualSpeed is not displayed");
			}
			
			if(ispresent(lbl_Scoring_ResidualImpact)) {
				test.log(LogStatus.PASS, "Scoring_ResidualImpact is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "Scoring_ResidualImpact is not displayed");
			}
			
			if(ispresent(lbl_Scoring_ResidualRating)) {
				test.log(LogStatus.PASS, "Scoring_ResidualRating is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "Scoring_ResidualRating is not displayed");
			}
			
			if(ispresent(lbl_Scoring_ResidualRisk)) {
				test.log(LogStatus.PASS, "Scoring_ResidualRisk is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "Scoring_ResidualRisk is not displayed");
			}
			
			if(ispresent(lbl_Scoring_ResidualRiskRating)) {
				test.log(LogStatus.PASS, "Scoring_ResidualRiskRating is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "Scoring_ResidualRiskRating is not displayed");
			}
			
			if(ispresent(btn_Scoring_Edit)) {
				test.log(LogStatus.PASS, "Editbutton is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "Editbutton is not displayed");
			}
			
			if(!isDisabled(btn_Scoring_Edit)) {
				test.log(LogStatus.PASS, "Editbutton is Enabled");
			}
			else {
				test.log(LogStatus.FAIL, "Editbutton is not Enabled");
			}
			
		}
		catch(Exception ex)	{
			
		}
	}
	
	
	public void treatment_UiValidations()	{
		try	{
			
			navigate_RegisterTab();			
			
			fill_RiskRegisterData();
			
			verifyandcheck_gridcheckbox();
			
			clickOn(btn_AddToRiskRegister, "AddToRiskRegister button");
			Thread.sleep(2000);
			
			clickOn(chk_AddControlsCheckbox, "AddToRiskRegister page checkbox");
			Thread.sleep(2000);
			
			clickOn(btn_AddAdditionalInfo, "AddAdditionalInfo button");
			Thread.sleep(2000);		
			
			clickOn(tab_Treatment,"Treatment tab");
			Thread.sleep(2000);
						
			if(ispresent(lbl_Treatment_Justification)) {
				test.log(LogStatus.PASS, "Treatment_Justification is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "Treatment_Justification is not displayed");
			}
			
			if(ispresent(lbl_Treatment_ResponseCategory)) {
				test.log(LogStatus.PASS, "Treatment_ResponseCategory is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "Treatment_ResponseCategory is not displayed");
			}
			
			if(ispresent(btn_Treatment_Edit)) {
				test.log(LogStatus.PASS, "Editbutton is displayed");
			}
			else {
				test.log(LogStatus.FAIL, "Editbutton is not displayed");
			}
			
			if(!isDisabled(btn_Treatment_Edit)) {
				test.log(LogStatus.PASS, "Editbutton is Enabled");
			}
			else {
				test.log(LogStatus.FAIL, "Editbutton is not Enabled");
			}
		}
		catch(Exception ex)	{
			
		}
	}
	
	
	public void update_Scoring()	{
		try	{
			navigate_RegisterTab();			
			
			fill_RiskRegisterData();
			
			verifyandcheck_gridcheckbox();
			
			clickOn(btn_AddToRiskRegister, "AddToRiskRegister button");
			Thread.sleep(2000);
			
			clickOn(chk_AddControlsCheckbox, "AddToRiskRegister page checkbox");
			Thread.sleep(2000);
			
			clickOn(btn_AddAdditionalInfo, "AddAdditionalInfo button");
			Thread.sleep(2000);			
			
			clickOn(tab_Scoring,"scoring tab");
			Thread.sleep(2000);
			keypress_Down();		
			
			clickOn(btn_Scoring_Edit,"scoring Edit button");
			Thread.sleep(2000);
			
			JavascriptExecutor js = (JavascriptExecutor) driver;			 
		    //specify the number of pixels the page has to be scrolled
		    js.executeScript("window.scrollBy(0,3000)");		       
		    Thread.sleep(2000);
		    
			typeIn(txt_InherentRiskQuantitativeImpace, "500", "InherentRiskQuantitativeImpace");
			Thread.sleep(2000);
			
			clickOn(drp_InherentRiskQuantitativeImpace,"InherentRiskQuantitativeImpace");
			Thread.sleep(4000);
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
			
			clickOn(btn_UpdateScoring, "UpdateScoring");
			Thread.sleep(2000);
			
		}
		catch(Exception ex) {
			
		}
	}
	
	
	public void updateTreatment()	{
		try	{
			
			navigate_RegisterTab();			
			
			fill_RiskRegisterData();
			
			verifyandcheck_gridcheckbox();
			
			clickOn(btn_AddToRiskRegister, "AddToRiskRegister button");
			Thread.sleep(2000);
			
			clickOn(chk_AddControlsCheckbox, "AddToRiskRegister page checkbox");
			Thread.sleep(2000);
			
			clickOn(btn_AddAdditionalInfo, "AddAdditionalInfo button");
			Thread.sleep(2000);		
			
			clickOn(tab_Treatment,"Treatment tab");
			Thread.sleep(2000);
			
			clickOn(btn_Treatment_Edit,"Treatment Edit button");
			Thread.sleep(2000);
			
			/*
			 * clickOn(drp_treatmentResponseCategory,"treatmentResponseCategory");
			 * Thread.sleep(2000); keypress_Down(); Thread.sleep(2000);
			 */
			
			typeIn(txtarea, "testing", "Justification");
			Thread.sleep(2000);
			
			clickOn(btn_Treat_Update,"Treatment update button");
			Thread.sleep(3000);
			
			String update_msg = "//*[@class='k-notification-content']";
			System.out.println(update_msg);
			if(getText(update_msg, "update msg").contains("Treatment Details Saved/Updated Successfully")) {
				successmsg("Treatement Update", update_msg);
			}
			else {
				failmsg("Treatement update", "success msg is not displayed..");
			}
		}
		catch(Exception ex) {
			
		}
	}
	
	
	public void verifyandcheck_gridcheckbox()	{
		try	{
			
			Thread.sleep(2000);
			JavascriptExecutor js = (JavascriptExecutor) driver;			 
		    //specify the number of pixels the page has to be scrolled
		    js.executeScript("window.scrollBy(0,3000)");		       
		    Thread.sleep(2000);
		    
			List<WebElement> gridcheckboxcount = driver.findElements(By.xpath("//table[@role='presentation']/tbody/tr/td[1]"));
			
		//	boolean chk = false;
			for(int i=0;i<gridcheckboxcount.size();i++)
			{
				String ischkselected = gridcheckboxcount.get(i).getAttribute("aria-selected");
				
				if(ischkselected.equalsIgnoreCase("true")) {
					int j = i; j=++j;
					String chk2 = "//table[@role='presentation']/tbody/tr["+j+"]/td[1]/input";
					clickOn(chk2, " checkbox");
					//clickOn(chk_itemcheckbox, "checkbox");
					//chk = true;
					//break;
				}
			}
			
			if(gridcheckboxcount.size() > 1)	{
				gridcheckboxcount.get(gridcheckboxcount.size() - 1).click();
				Thread.sleep(2000);
			}
			
			/*
			 * List<WebElement> gridcheckboxcount1 =
			 * driver.findElements(By.xpath("//table[@role='presentation']/tbody/tr/td[2]"))
			 * ; for(int i=0;i<gridcheckboxcount1.size();i++) { //String ischkselected =
			 * gridcheckboxcount1.get(i).getText();
			 * 
			 * if(gridcheckboxcount1.get(i).getText().equalsIgnoreCase("BCT/ERM/R/122")) {
			 * int j = i; j=++j; String chk1 =
			 * "//table[@role='presentation']/tbody/tr["+j+"]/td[1]/input"; clickOn(chk1,
			 * " checkbox"); //chk = true; //break; } }
			 */
			
			
			//select checkbox if nothing is selected
			/*
			 * if(!chk) { clickOn(chk_itemcheckbox, "checkbox"); Thread.sleep(2000); }
			 */
			
			
		}
		catch(Exception ex) {
			
		}
	}

	
	public void treatement_AddActionPlan(String category)	{
		try	{
			
			if(category.equalsIgnoreCase("Reduce")) {
				
				String No_Records = "//*[contains(text(),'Add Action Plan')]/parent::kendo-grid-toolbar//following-sibling::div[@role='grid']/kendo-grid-list//tbody/tr[@class='k-grid-norecords ng-star-inserted']";
				if(ispresent(No_Records)) {
					treatment_ResponseCategory_AddAction();
					Thread.sleep(2000);
					if(!ispresent(No_Records)) {
						successmsg("Treatment", "No Records in AddAction");
					}
					else {
						failmsg("Treatment", "Record is not update in AddAction");
					}
				}
				else {
					List<WebElement> tablecount_before = driver.findElements(By.xpath("//*[contains(text(),'Add Action Plan')]/parent::kendo-grid-toolbar//following-sibling::div[@role='grid']/kendo-grid-list//tbody/tr"));
					
					treatment_ResponseCategory_AddAction();
					
					List<WebElement> tablecount_after = driver.findElements(By.xpath("//*[contains(text(),'Add Action Plan')]/parent::kendo-grid-toolbar//following-sibling::div[@role='grid']/kendo-grid-list//tbody/tr"));
					
					if(tablecount_after.size() > tablecount_before.size())	{
						successmsg("Treatment", "AddAction table is updated");
					}
					else {
						failmsg("Treatment", "AddAction table is not updated");
					}
				}
			}
			else if(category.equalsIgnoreCase("Share")) {
				
				String No_Records = "//*[contains(text(),'Add Insurance')]/parent::kendo-grid-toolbar//following-sibling::div[@role='grid']/kendo-grid-list//tbody/tr[@class='k-grid-norecords ng-star-inserted']";
				if(ispresent(No_Records)) {
					treatment_RiskCategory_Addinsurance();
					Thread.sleep(2000);
					if(!ispresent(No_Records)) {
						successmsg("Treatment", "No Records in AddAction");
					}
					else {
						failmsg("Treatment", "Record is not update in AddAction");
					}
				}
				else {
					List<WebElement> tablecount_before = driver.findElements(By.xpath("//*[contains(text(),'Add Insurance')]/parent::kendo-grid-toolbar//following-sibling::div[@role='grid']/kendo-grid-list//tbody/tr"));
					
					treatment_RiskCategory_Addinsurance();
					
					List<WebElement> tablecount_after = driver.findElements(By.xpath("//*[contains(text(),'Add Insurance')]/parent::kendo-grid-toolbar//following-sibling::div[@role='grid']/kendo-grid-list//tbody/tr"));
					
					if(tablecount_after.size() > tablecount_before.size())	{
						successmsg("Treatment", "AddAction table is updated");
					}
					else {
						failmsg("Treatment", "AddAction table is not updated");
					}
				}
			}
		}		
		catch(Exception ex) {
			
		}
	}
	
	public void treatment_ResponseCategory_AddAction()	{
		try	{
			
				String Actionplan = "//*[contains(text(),'Add Action Plan')]/parent::kendo-grid-toolbar//following-sibling::div[@role='grid']/kendo-grid-list//tbody/tr[1]/td[1]/input";
				String Justification = "//*[contains(text(),'Add Action Plan')]/parent::kendo-grid-toolbar//following-sibling::div[@role='grid']/kendo-grid-list//tbody/tr[1]/td[2]/input";
				String parties_Responsible = "//*[contains(text(),'Add Action Plan')]/parent::kendo-grid-toolbar//following-sibling::div[@role='grid']/kendo-grid-list//tbody/tr[1]/td[3]";
				String Timeline = "//*[contains(text(),'Add Action Plan')]/parent::kendo-grid-toolbar//following-sibling::div[@role='grid']/kendo-grid-list//tbody/tr[1]/td[4]";
				String Actions_Add = "//*[contains(text(),'Add Action Plan')]/parent::kendo-grid-toolbar//following-sibling::div[@role='grid']/kendo-grid-list//tbody/tr[1]/td[5]/button[contains(text(),'Add')]";
				String Actions_Disard = "//*[contains(text(),'Add Action Plan')]/parent::kendo-grid-toolbar//following-sibling::div[@role='grid']/kendo-grid-list//tbody/tr[1]/td[5]/button[contains(text(),'Discard')]";
								
				typeIn(Actionplan, "ActionPlan", "testing");
				Thread.sleep(2000);
				
				typeIn(Justification, "Justification", "testing");
				Thread.sleep(2000);
				
				clickOn(parties_Responsible, "Parties Responsible");
				Thread.sleep(2000);
				keypress_Down();
				
				clickOn(lnk_FromCal,"Fromdate calender");
				Thread.sleep(2000);
				
				clickOn(lnk_cal_Today,"select Date from calender");
				Thread.sleep(2000);
				
				clickOn(Actions_Add, "Add Actionplan");
				Thread.sleep(2000);
				
				
			
		}
		catch(Exception ex) {
			
		}
	}
	
	
	public void treatment_RiskCategory_Addinsurance()	{
		try	{
			String Justification = "//*[contains(text(),'Add Insurance')]/parent::kendo-grid-toolbar//following-sibling::div[@role='grid']/kendo-grid-list//tbody/tr[1]/td[1]/input";
			String InsuranceCompanyName = "//*[contains(text(),'Add Insurance')]/parent::kendo-grid-toolbar//following-sibling::div[@role='grid']/kendo-grid-list//tbody/tr[1]/td[2]/input";
			String InsuranceNumber = "//*[contains(text(),'Add Insurance')]/parent::kendo-grid-toolbar//following-sibling::div[@role='grid']/kendo-grid-list//tbody/tr[1]/td[3]/input";
			String TypeofInsurance = "//*[contains(text(),'Add Insurance')]/parent::kendo-grid-toolbar//following-sibling::div[@role='grid']/kendo-grid-list//tbody/tr[1]/td[4]/input";
			String SumInsured = "//*[contains(text(),'Add Insurance')]/parent::kendo-grid-toolbar//following-sibling::div[@role='grid']/kendo-grid-list//tbody/tr[1]/td[5]/input";
			String InsuranceAdd = "//*[contains(text(),'Add Insurance')]/parent::kendo-grid-toolbar//following-sibling::div[@role='grid']/kendo-grid-list//tbody/tr[1]/td[7]/button[contains(text(),'Add')]";
			String InsuranceDiscard = "//*[contains(text(),'Add Insurance')]/parent::kendo-grid-toolbar//following-sibling::div[@role='grid']/kendo-grid-list//tbody/tr[1]/td[7]/button[contains(text(),'Discard')]";
			
			
			typeIn(Justification, "AddInsurance", "testing");
			Thread.sleep(2000);
			
			typeIn(InsuranceCompanyName, "AddInsurance", "testing");
			Thread.sleep(2000);
			
			typeIn(InsuranceNumber, "AddInsurance", "123");
			Thread.sleep(2000);
			
			typeIn(TypeofInsurance, "AddInsurance", "testing");
			Thread.sleep(2000);
			
			typeIn(SumInsured, "AddInsurance", "testing");
			Thread.sleep(2000);
						
			clickOn(lnk_FromCal,"Fromdate calender");
			Thread.sleep(2000);
			
			clickOn(lnk_cal_Today,"select Date from calender");
			Thread.sleep(2000);
			
			clickOn(InsuranceAdd, "Add AddInsurance");
			Thread.sleep(2000);
			
			
		}
		catch(Exception ex) {
			
		}
	}
	
	
	
	public void register_ControlUiValidations()	{
		try	{
			navigate_ControlRegisterTab();
			
			Thread.sleep(2000);
			
			if(ispresent(btn_ExportAs))	{
				successmsg("Export button", "Export button is displayed");
			}
			else {
				failmsg("Export button", "Export button is not displayed");
			}
						
			List<WebElement> griddatacount = driver.findElements(By.xpath("//table[@role='presentation']/tbody/tr"));
			
			if(griddatacount.size() > 1) {
				test.log(LogStatus.PASS, "CreateRiskRegister grid data is displayed");
			}
			else {
				test.log(LogStatus.INFO, "No records found in RiskRegister grid");
			}
			
			
		}
		catch(Exception ex)	{
			
		}
	}
	
	
	public void navigate_ControlRegisterTab()	{
		try {
			Thread.sleep(3000);
			clickOn(ERM_Module,"ERM module");
			Thread.sleep(2000);
			clickOn(Module_MouseOver,"slide mouseover");
			Thread.sleep(2000);
			clickOn(lnk_Register,"Register link");
			Thread.sleep(2000);
			clickOn(lnk_ContrlRegister,"ControlRegister link");
			Thread.sleep(2000);
			
			clickOn(logo,"mouseover");
			Thread.sleep(4000);
		}
		catch(Exception ex)	{
			
		}
	}
	
	
}
