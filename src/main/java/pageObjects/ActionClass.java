package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

public class ActionClass {
	public static AndroidDriver<?> driver;
		

	public static void setDriver(AndroidDriver driverInstance) {
		 driver = driverInstance;
		 
	}

//Scroll	
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
	
	
	
 public static void wait (By webElement) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(webElement));	
	 
 }





}

