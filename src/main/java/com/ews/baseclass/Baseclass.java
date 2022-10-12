package com.ews.baseclass;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Listeners;

import com.relevantcodes.extentreports.LogStatus;

import utils.ExtentReportListner;



@Listeners(ExtentReportListner.class)
public class Baseclass extends ExtentReportListner{
	
	public static Logger log = LogManager.getLogger(Baseclass.class);
	public static WebDriver driver;
	
	String browserName = "chrome";
	
	
	public void browser_lunch(String browserName)
	{
		try {			
			if(browserName.equals("chrome")){
				
				//killProcessor();
				
				//WebDriver driver1;
				ChromeOptions options = new ChromeOptions();
				//options.addArguments("start-maximized");
				
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");	
				driver = new ChromeDriver(options); 
				//driver.manage().window().maximize();
				driver.manage().window().setSize(new Dimension(1440, 900));
				takeScreenhot(driver, "browser launch");
			}
			else if(browserName.equals("Firefox")){
				//WebDriver driver;
				System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\Drivers\\geckodriver");	
				driver = new FirefoxDriver(); 
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
	
	public void killProcessor()	{
		try	{
			Thread.sleep(2000);
			
			Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
			//Runtime.getRuntime().exec("taskkill /F /IM chrome.exe /T");
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
	
	public void closeBrower()
	{
		try {
			driver.close();
			driver.quit();
			
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
	
	public void launchUrl(String url) {
		try {
			driver.get(url);
			test.log(LogStatus.INFO,"Url launched :: " + url);
			Thread.sleep(2000);
			takeScreenhot(driver, "launch url");
			
			
			//zoomOut();
		} catch(Exception ex) {
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

	public void typeIn(String locator, String value, String refKey) {
		try {
			Thread.sleep(1000);
			driver.findElement(By.xpath(locator)).clear();
			Thread.sleep(1000);
			driver.findElement(By.xpath(locator)).sendKeys(value);
			test.log(LogStatus.PASS,"Typed " + value );
		} catch(Exception ex) {
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

	public void clear(String locator, String refKey) {
		try {
			Thread.sleep(1000);
			driver.findElement(By.xpath(locator)).clear();	
			test.log(LogStatus.PASS,"Clear field");
		} catch(Exception ex) {
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

	public void clickOn(String locator, String refKey) {
		try {
			Thread.sleep(1000);
			driver.findElement(By.xpath(locator)).click();	
			test.log(LogStatus.PASS,"Clicked on " + refKey);
		} catch(Exception ex) {
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

	public String getText(String locator, String refKey) {
		try {			
			Thread.sleep(1000);
			String text = driver.findElement(By.xpath(locator)).getText();
			test.log(LogStatus.PASS,"Text of " + refKey + " is :" + text);
			return text;
		} catch (Exception e) {
			test.log(LogStatus.FAIL,"Cant able to getText of " + refKey + "\n\n" + "ERROR MESSAGE :: " + e.toString());
			return null;
		}
	}

	public boolean waitTillElementVisible(String locator, String refKey, int waitSeconds) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, waitSeconds);			
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(locator))));
			return true;
		} catch (TimeoutException e) {
			return false;
		} catch (Exception e) {
			test.log(LogStatus.FAIL,"Element is not visble for " + waitSeconds + " seconds and referenceText is  " + refKey
					+ "\n\n" + "ERROR MESSAGE :: " + e.toString());
			return false;
		}
	}

	public boolean waitTillElementVisible(By by, String refKey, int waitSeconds) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, waitSeconds);
			wait.until(ExpectedConditions.elementToBeClickable(by));
			return true;
		} catch (TimeoutException e) {
			return false;
		} catch (Exception e) {
			test.log(LogStatus.FAIL,"Element is not visble for " + waitSeconds + " seconds and referenceText is  " + refKey
					+ "\n\n" + "ERROR MESSAGE :: " + e.toString());
			return false;
		}
	}

	public void waitSeconds(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		}catch(Exception ex) {
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
	
	public void refresh() {
		try {
			driver.navigate().refresh();
			Thread.sleep(3000);
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
	
	
	public static String getScreenhot(WebDriver driver, String screenshotName) throws Exception {
		String destination="";
		try	{
			String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			
			//after execution, you could see a folder "FailedTestsScreenshots" under src folder
			destination = System.getProperty("user.dir") + "/FailedTestsScreenshots/"+screenshotName+dateName+".png";
			File finalDestination = new File(destination);
			FileUtils.copyFile(source, finalDestination);
			test.log(LogStatus.PASS,"Screen " + test.addScreenCapture(destination));
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
		
		return destination;
		
	}
	
	
	public static String takeScreenhot(WebDriver driver, String screenshotName) throws Exception {
		String destination="";
		try	{
			String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			
			//after execution, you could see a folder "FailedTestsScreenshots" under src folder
			destination = System.getProperty("user.dir") + "/FailedTestsScreenshots/"+screenshotName+dateName+".png";
			File finalDestination = new File(destination);
			FileUtils.copyFile(source, finalDestination);
			//test.log(LogStatus.PASS,"Screen " + source );
			test.log(LogStatus.PASS,"Screen " + test.addScreenCapture(destination));
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
		
		return destination;
		
	}
	
	
	
	public Boolean ispresent(String locator) {
		
		Boolean value = false;
		try {
			moveToElement(locator);
			
			Thread.sleep(2000);
			
			if(driver.findElement(By.xpath(locator)).isDisplayed())
			{
				value = true;
			}
			else {
				value = false;
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
		
		return value;
	}
	
	
	public void moveToElement(String locator)	{
		try	{
			WebElement element = driver.findElement(By.id(locator));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
			Thread.sleep(2000); 
		}
		catch(Exception ex)	{
			
		}
	}
	
public Boolean isDisabled(String locator) {
		
		Boolean value = false;
		try {
			Thread.sleep(2000);
			//zoomOut();
			//zoomIn();
			Thread.sleep(2000);
			if(driver.findElement(By.xpath(locator)).isEnabled())
			{
				value = false;
			}
			else {
				value = true;
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
		
		return value;
	}
	
	
	public void drpdwn_select(String locator, String value, String refkey) {
		try {
			Select sel = new Select(driver.findElement(By.xpath(locator)));
			Thread.sleep(2000);
			
			sel.selectByValue(value);
			Thread.sleep(2000);
			
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
	
	
	public void zoomIn()	{
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("document.body.style.zoom='100%'");
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
	
	
	public void zoomOut()	{
		try {
			  Thread.sleep(2000);
			 
			  JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("document.body.style.zoom='90%'");
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
	
	
	
	public void typeIn1(String locator, String value, String refKey) {
		try {
			Thread.sleep(1000);
			driver.findElement(By.xpath(locator)).clear();
			Thread.sleep(1000);
			
			for(int i=0;i<value.length();i++) {
				char ch = value.charAt(i);
				String s = new StringBuilder().append(ch).toString();				
				driver.findElement(By.xpath(locator)).sendKeys(s);
				Thread.sleep(1000);
			}
			
			test.log(LogStatus.PASS,"Typed " + value );
		} catch(Exception ex) {
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
	
	public void keypress_Down() {
		try {
			/*
			 * Robot robot = new Robot(); robot.keyPress(KeyEvent.VK_DOWN);
			 * robot.keyRelease(KeyEvent.VK_DOWN); robot.keyPress(KeyEvent.VK_ENTER);
			 * robot.keyRelease(KeyEvent.VK_ENTER);
			 */
			 
			Actions actions = new Actions(driver);
			/*
			 * actions.keyDown(Keys.ARROW_DOWN); actions.keyDown(Keys.ENTER);
			 * actions.keyUp(Keys.ARROW_DOWN); actions.keyUp(Keys.ENTER);
			 */
		        actions.sendKeys(Keys.ARROW_DOWN);
		        actions.sendKeys(Keys.ENTER);
		        actions.build().perform();
			
			
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
	
	//log the report with success
	public void successmsg(String refKey,String text)	{
		test.log(LogStatus.PASS,"Text of " + refKey + " is :" + text);
	}

	//log the report with fail
	public void failmsg(String refKey,String text)	{
		test.log(LogStatus.FAIL,"Text of " + refKey + " is :" + text);
	}

	
	
	public void alertAccept()	{
		try	{
			Alert alert = driver.switchTo().alert(); // switch to alert
			Thread.sleep(2000);
			alert.accept();
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
	
	public void alertDismiss()	{
		try	{
			Alert alert = driver.switchTo().alert(); // switch to alert
			Thread.sleep(2000);
			alert.dismiss();
			
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
	
	public String getAlertText()	{
		String alertMessage="";
		try	{
			Alert alert = driver.switchTo().alert(); // switch to alert

			alertMessage= driver.switchTo().alert().getText(); // capture alert message
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
		
		return alertMessage;
	}
	
}
