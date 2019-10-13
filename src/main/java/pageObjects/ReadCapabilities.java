package pageObjects;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class ReadCapabilities {

	public static AndroidDriver<?> driver;
	
	
	public DesiredCapabilities test( String PLATFORM_NAME ,  String  DEVICE_NAME , String PLATFORM_VERSION) { 
		System.out.println("PLATFORM_VERSION"+PLATFORM_VERSION);
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.APPIUM_VERSION, "1.10.0");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, PLATFORM_VERSION);
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,PLATFORM_NAME);
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, DEVICE_NAME); 
        capabilities.setCapability("newCommandTimeout", 2000);
		capabilities.setCapability("appActivity", "com.tsse.vfuk.view.VFLaunchActivity");
		capabilities.setCapability("appPackage", "com.myvodafoneapp.dev");
		
		 System.out.println("capabilities platform:: " + capabilities.getPlatform());

		return capabilities;
}
public static  AndroidDriver<?> ReadCap (String PLATFORM_NAME, String DEVICE_NAME,String PLATFORM_VERSION) throws MalformedURLException {
	

	ReadCapabilities readCap = new ReadCapabilities();
	/*DesiredCapabilities capabilities = new DesiredCapabilities();*/
	DesiredCapabilities capabilities = readCap.test(PLATFORM_NAME,DEVICE_NAME,PLATFORM_VERSION);
	
	System.out.println("capabilities.toString after test:: " + capabilities.toString());
	System.out.println("MobileCapabilityType:: " + capabilities.getCapability(MobileCapabilityType.DEVICE_NAME));
    driver =  new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);

	
	
 
    System.out.println("driver.getCapabilities() after setting in read cap:: " + driver.getCapabilities());
    
    
    return driver;
	
}	
}


