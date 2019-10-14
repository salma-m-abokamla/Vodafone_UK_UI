package General_Journeys;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;



public class WelcomePayG {
	
	
	
public static AndroidDriver driver;
private static WebElement  element = null;

	
public static void setDriver(AndroidDriver driverInstance) {
	 driver = driverInstance;
	 
}
	 public static WebElement GetStartedCTA (AndroidDriver driver){
		 
		 element= driver.findElement(By.id("Welcome_GetStarted_CTA"));
	    return element;

	    }
	 
	 
	 
 public static WebElement ContinuCTA (AndroidDriver driver){
		 
		 element=driver.findElement(By.id("btn_continue"));
	
	    return element;
 
	    }
  public static WebElement AllowCTA1 (AndroidDriver driver){
	 
	 element=driver.findElement(By.xpath("//*[@text='DENY']"));

    return element;

    }
  public static WebElement AllowCTA2 (AndroidDriver driver){
		 
		 element=driver.findElement(By.xpath("//*[@text='DENY']"));

	    return element;

	    }
  public static WebElement AllowCTA3 (AndroidDriver driver){
		 
		 element=driver.findElement(By.xpath("//*[@text='DENY']"));

	    return element;

	    }
public static WebElement NoThanksCTA (AndroidDriver driver){
	 
	 element=driver.findElement(By.xpath("//*[@text='NO THANKS']"));
	

   return element;

   }
public static WebElement NoThanksBtn (AndroidDriver driver){
	 
	 element=driver.findElement(By.xpath("//*[@text='No thanks']"));
	

  return element;

  }
public static void scrollDown() {
    //if pressX was zero it didn't work for me
    int pressX = driver.manage().window().getSize().width / 2;
    // 4/5 of the screen as the bottom finger-press point
    int bottomY = driver.manage().window().getSize().height * 4/5;
    // just non zero point, as it didn't scroll to zero normally
    int topY = driver.manage().window().getSize().height / 8;
    //scroll with TouchAction by itself
    scroll(pressX, bottomY, pressX, topY);
}



public static void scroll(int fromX, int fromY, int toX, int toY) {
    TouchAction touchAction = new TouchAction(driver);
    touchAction.longPress(PointOption.point(fromX, fromY)).moveTo(PointOption.point(toX, toY)).release().perform();
}

public static void WelcomePayGFlow () throws InterruptedException{
	WebDriverWait wait = new WebDriverWait(driver, 30);
	WelcomePayG.GetStartedCTA(driver).click();
	WelcomePayG.scrollDown();
	 WelcomePayG.ContinuCTA(driver).click();
	WelcomePayG.AllowCTA1(driver).click();
	WelcomePayG.AllowCTA2(driver).click();
	WelcomePayG.AllowCTA3(driver).click();
	WelcomePayG.NoThanksCTA(driver).click();
//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.myvodafoneapp.dev:id/btn_login")));	    
	//WelcomePayG.scrollDown();
	//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.myvodafoneapp.dev:id/btn_noThanks")));	    
	//WelcomePayG.NoThanksBtn(driver).click();

}

}
