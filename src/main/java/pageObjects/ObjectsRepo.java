package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

public class ObjectsRepo {
	public static AndroidDriver<?> driver;
	private static WebElement  element = null;
	public static By element1 = null;
	public static By vovContatiner = By.xpath("(//*[@resource-id=\"com.myvodafoneapp.dev:id/vov_bubble_container\"])[1]");
	public static By CloseVoV= 	By.id("com.myvodafoneapp.dev:id/dashboard_VOV_right_button");
	public static By NoAlertMsg = By.xpath("//*[@text=\"You don't have any alerts\"]");
	public static By Server_Live= By.xpath("//*[@text=\"Live\"]");
	public static By Server_AWS = By.xpath("//*[@text=\"AWS e13\"]");
	public static By Server_PREPROD = By.xpath("//*[@text=\"PREPROD\"]");
	public static By Server_STUB = By.xpath("//*[@text=\"STUB\"]");
	public static By Server_DEV = By.xpath("//*[@text=\"DEV\"]");
	public static By Server_SIT = By.xpath("//*[@text=\"SIT\"]");
	public static By Server_SIT2 = By.xpath("//*[@text=\"SIT2\"]");
	public static By Server_PAT = By.xpath("//*[@text=\"PAT\"]");
	public static By Server_DX_DEV= By.xpath("//*[@text=\"DX_DEV\"]");
	public static By Server_DX_INT= By.xpath("//*[@text=\"DX_INT\"]");
	public static By Server_Custom= By.xpath("//*[@text=\"DX_INT\"]");
	public static By DevSett_Server_Displayed = By.id("network_source_spinner");
	public static By Set_Dev_Settings= By.xpath("//*[@text='Developer Settings']");
	public static By Txtbx_MSSDIN_Displayed =By.id("com.myvodafoneapp.dev:id/hardcoded_msisdn_text");
	public static By Txtbx_MSSDIN_Type= By.id("com.myvodafoneapp.dev:id/ed_result");
	public static By CTA_MSISDN_Save = By.id("btn_save");
	public static By DevSett_UseTestToken = By.id("toggle_test_token");
	public static By DevSett_UseHardCodedMSISDEN = By.id("com.myvodafoneapp.dev:id/toggle_hardCoded_msisdn") ;
	public static By DevSett_Save = By.id("vf_btn_save") ;
	public static By Welcome_GetStarted_CTA = By.id("Welcome_GetStarted_CTA");
	public static By VfLogoImageView = By.id("com.myvodafoneapp.dev:id/vodafoneLogoImageView");
	
	
	
	public static void setDriver(AndroidDriver driverInstance) {
		 driver = driverInstance;
		 
	}
	
	 public static WebElement findElement (By WB , AndroidDriver driver){
		 
		 element= driver.findElement(WB);
		 
	    return element;

	 }
	 
 public static WebElement set_Server_DX_INT (AndroidDriver driver){
	 
	 element= driver.findElement(Server_DX_INT);
	 
    return element;

    }

public static WebElement CloseVoV (AndroidDriver driver){
	 
	 element= driver.findElement(CloseVoV);
	 
    return element;

    }

public static WebElement setDevSettings (AndroidDriver driver){

	 element= driver.findElement(Set_Dev_Settings);
   return element;

   }
public static WebElement txtbx_MSSDIN_Displayed (AndroidDriver driver){

	 element=driver.findElement(Txtbx_MSSDIN_Displayed);

   return element;

   }
public static WebElement txtbx_MSSDIN_Type (AndroidDriver driver){

	 element=driver.findElement(Txtbx_MSSDIN_Type);

   return element;

   }  
public static WebElement cta_MSISDN_Save (AndroidDriver driver){

	 element=driver.findElement(CTA_MSISDN_Save);

   return element;

   }
public static WebElement devSett_Server_Displayed (AndroidDriver driver){

	 element=driver.findElement(DevSett_Server_Displayed);

   return element;

   }


public static WebElement devSett_UseTestToken (AndroidDriver driver){

	 element=driver.findElement(DevSett_UseTestToken);

   return element;

   }
public static WebElement devSett_UseHardCodedMSISDEN (AndroidDriver driver){

	 element=driver.findElement(DevSett_UseHardCodedMSISDEN);

 return element;

 }

public static WebElement devSett_Save (AndroidDriver driver){

	element=driver.findElement(DevSett_Save);

	return element;

}
public static WebElement Welcome_GetStarted_CTA (AndroidDriver driver){

	element=driver.findElement(Welcome_GetStarted_CTA);

	return element;

}

public static WebElement vfLogoDisplayed (AndroidDriver driver){

	element=driver.findElement(VfLogoImageView);

	return element;

}
}
