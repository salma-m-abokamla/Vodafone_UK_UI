package PAYG_Simply;


import org.testng.annotations.Test;
import com.github.KhaldAttya.Aeye.Aeye;

import io.appium.java_client.android.AndroidDriver;

import static org.testng.Assert.fail;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import pageObjects.OpenApp;
import pageObjects.ActionClass;
import pageObjects.ObjectsRepo;

import pageObjects.ReadCapabilities;
import pageObjects.WelcomePayG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;

import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;


public class NoAlertsVOV {
	
	public AndroidDriver<?> driver;
	boolean ResultFlag = true;
	String MSSDIN ;

	  @BeforeTest
	  @Parameters({"MSSDIN"})
  public  void beforeTest(String MSSDIN) throws InterruptedException {
		ActionClass.setDriver(driver);
		ObjectsRepo.setDriver(driver);
		ActionClass.wait(ObjectsRepo.Set_Dev_Settings);
	    OpenApp.setDriver(driver);
	 	OpenApp.OpenAppFlow(MSSDIN);
	 	ActionClass.wait(ObjectsRepo.Welcome_GetStarted_CTA);
	 	WelcomePayG.setDriver(driver);
	    WelcomePayG.WelcomePayGFlow();
	    ActionClass.wait(ObjectsRepo.VfLogoImageView);
  }
  @Test 
  public void DashboardTC() throws IOException, InterruptedException {
		//Reporsatries of Screenshots 
		String repoExpected="C:"+File.separator+"MVA10_UI_Automation"+File.separator+"Automation_UK_UI"+File.separator+"UI_Automation_ScreenShots"+File.separator+"Expected"+File.separator;
		String repoActual="C:"+File.separator+"MVA10_UI_Automation"+File.separator+"Automation_UK_UI"+File.separator+"UI_Automation_ScreenShots"+File.separator+"Actual"+File.separator;
		String repoResult="C:"+File.separator+"MVA10_UI_Automation"+File.separator+"Automation_UK_UI"+File.separator+"UI_Automation_ScreenShots"+File.separator+"Results"+File.separator;
		ObjectsRepo.CloseVoV(driver).click();
		ActionClass.wait(ObjectsRepo.NoAlertMsg);
		By statusBar = By.id("android:id/statusBarBackground");
		Aeye.takeElementScreenshot(driver, ObjectsRepo.NoAlertMsg, repoActual+"Actual_NoAlertMsg_For_PAYG.png");
	    Aeye.compareImages(repoActual+"Actual_NoAlertMsg_For_PAYG.png",repoExpected+"Expected_NoAlertMsg_For_PAYG.png", repoResult+"NoAlertMsg_For_PAYG_Result.png");
	    
  }
  
  @Parameters({ "PLATFORM_NAME", "DEVICE_NAME","PLATFORM_VERSION" })
  @BeforeSuite
  public void beforeSuite(String PLATFORM_NAME , String DEVICE_NAME , String PLATFORM_VERSION ) throws MalformedURLException {  
      System.out.println("PLATFORM_NAME"+PLATFORM_NAME);
	 driver = ReadCapabilities.ReadCap(PLATFORM_NAME, DEVICE_NAME, PLATFORM_VERSION);
	 System.out.println("DEVICE_NAME"+DEVICE_NAME);
  
  }
  

}
