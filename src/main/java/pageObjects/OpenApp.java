package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

public class OpenApp {

	public static AndroidDriver driver ;
	private static WebElement  element = null;

	public static void setDriver(AndroidDriver driverInstance) {
		 driver = driverInstance;
		 
	}

	public static void OpenAppFlow (String MSSDIN) throws InterruptedException{	
		ObjectsRepo.setDriver(driver);
		ActionClass.setDriver(driver);
		ObjectsRepo.setDevSettings(driver).click();
		ObjectsRepo.txtbx_MSSDIN_Displayed(driver).click();
		ObjectsRepo.txtbx_MSSDIN_Type(driver).clear();
		ObjectsRepo.txtbx_MSSDIN_Type(driver).sendKeys(MSSDIN);
		ObjectsRepo.cta_MSISDN_Save(driver).click();
		ObjectsRepo.devSett_Server_Displayed (driver).click();
		ActionClass.scrollDown();
		ActionClass.wait(ObjectsRepo.Server_DX_INT);
		ObjectsRepo.set_Server_DX_INT(driver).click();
		ObjectsRepo.devSett_UseTestToken(driver).click();
		ObjectsRepo.devSett_UseHardCodedMSISDEN(driver).click();
		ActionClass.scrollDown();
		ActionClass.scrollDown();
		ObjectsRepo.devSett_Save(driver).click();

	}
	
	


}
