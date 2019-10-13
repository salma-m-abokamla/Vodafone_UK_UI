package tests;

import org.testng.annotations.Test;
import com.github.KhaldAttya.Aeye.Aeye;

import io.appium.java_client.android.AndroidDriver;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

import pageObjects.ActionClass;
import pageObjects.ObjectsRepo;
import pageObjects.OpenApp;

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


public class DashboardTestCase {
	
	public AndroidDriver<?> driver;
	boolean isDisplayed = true;
	String MSSDIN ;
	WebElement Server ;
	
 @Parameters({"MSSDIN"})
  @BeforeTest
  public  void beforeTest(String MSSDIN) throws InterruptedException {
	   ActionClass.setDriver(driver);
		ObjectsRepo.setDriver(driver);
		ActionClass.wait(ObjectsRepo.Set_Dev_Settings);    
	    OpenApp.setDriver(driver);
	 	OpenApp.OpenAppFlow(MSSDIN);
	 	WelcomePayG.setDriver(driver);
	    WelcomePayG.WelcomePayGFlow();
	    ActionClass.wait(ObjectsRepo.VfLogoImageView);
  }
  @Test 
  public void DashboardTC() throws IOException {
		//Reporsatries of Screenshots 
		String repoExpected="C:"+File.separator+"MVA10_UI_Automation"+File.separator+"MVA10_UI_Automation"+File.separator+"UI_Automation_ScreenShots"+File.separator+"Expected"+File.separator;
		String repoAtual="C:"+File.separator+"MVA10_UI_Automation"+File.separator+"MVA10_UI_Automation"+File.separator+"UI_Automation_ScreenShots"+File.separator+"Actual"+File.separator;
		String repoResult="C:"+File.separator+"MVA10_UI_Automation"+File.separator+"MVA10_UI_Automation"+File.separator+"UI_Automation_ScreenShots"+File.separator+"Result"+File.separator;

		By statusBar = By.id("android:id/statusBarBackground");
		Aeye.takeAppScreenshot(driver, statusBar, repoAtual+"Actual_DashBoard_For_PAYG.png");
		Aeye.compareImages(repoAtual+"Actual_DashBoard_For_PAYG.png", repoExpected+"Expected_DashBoard_For_PAYG.png", repoResult+"DashBoard_For_PAYG_Result"+ ".png");
  }

  @Parameters({ "PLATFORM_NAME", "DEVICE_NAME","PLATFORM_VERSION" })
  @BeforeSuite
  public void beforeSuite(String PLATFORM_NAME , String DEVICE_NAME , String PLATFORM_VERSION ) throws MalformedURLException {  
      System.out.println("PLATFORM_NAME"+PLATFORM_NAME);
	 driver = ReadCapabilities.ReadCap(PLATFORM_NAME, DEVICE_NAME, PLATFORM_VERSION);
	 System.out.println("DEVICE_NAME"+DEVICE_NAME);
  
  }
  

}
