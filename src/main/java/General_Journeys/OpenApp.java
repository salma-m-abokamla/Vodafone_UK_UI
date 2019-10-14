package General_Journeys;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import GeneralActions.ActionClass;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import pageObjects.ObjectsRepo;

public class OpenApp {

	public static AndroidDriver driver ;
	private static WebElement  element = null;

	public static void setDriver(AndroidDriver driverInstance) {
		 driver = driverInstance;
		 
	}

	public static void OpenAppFlow (String MSSDIN , String Server) throws InterruptedException{	
		ObjectsRepo.setDriver(driver);
		ActionClass.setDriver(driver);
		ObjectsRepo.setDevSettings(driver).click();
		ObjectsRepo.txtbx_MSSDIN_Displayed(driver).click();
		ObjectsRepo.txtbx_MSSDIN_Type(driver).clear();
		ObjectsRepo.txtbx_MSSDIN_Type(driver).sendKeys(MSSDIN);
		ObjectsRepo.cta_MSISDN_Save(driver).click();
		ObjectsRepo.devSett_Server_Displayed (driver).click();
		ActionClass.scrollDown();
		if(Server == "DX_INT")
		{
		ActionClass.wait(ObjectsRepo.Server_DX_INT);
		ObjectsRepo.set_Server_DX_INT(driver).click();
		}
		if(Server == "SIT2")
		{
		ActionClass.wait(ObjectsRepo.Server_SIT2);
		ObjectsRepo.set_Server_SIT2(driver).click();
		}
		ObjectsRepo.devSett_UseTestToken(driver).click();
		ObjectsRepo.devSett_UseHardCodedMSISDEN(driver).click();
		ActionClass.scrollDown();
		ActionClass.scrollDown();
		ObjectsRepo.devSett_Save(driver).click();

	}
	
	


}
