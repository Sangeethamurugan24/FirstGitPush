package Launch;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

public class LaunchApp {
	
	public static AndroidDriver driver;
	
	@Test
	public void DesiredCaps()
	{
	
	DesiredCapabilities caps = new DesiredCapabilities();
	
	caps.setCapability("deviceName", "emulator-5554");
	caps.setCapability("platformVersion", "9.0");
	//caps.setCapability("udid", "ZY224557V4");
	caps.setCapability("platformName", "Android");
	caps.setCapability("noReset", "true");
	caps.setCapability("uiautomator2ServerInstallTimeout", "25000");
	//caps.setCapability("browserName", "Chrome");
	//caps.setCapability("app", "C:\\Users\\M Sangeetha\\Downloads\\selendroid-test-app-0.17.0.apk");
	caps.setCapability("appPackage", "com.android.contacts");
	caps.setCapability("appActivity", ".activities.PeopleActivity");
	
	try {
		driver = new AndroidDriver<MobileElement>(new URL("http://localhost:4723/wd/hub"), caps);
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}
	@Test
	public void scrolldown()
	{
		System.out.println(driver.switchTo().frame(driver.findElement(MobileBy.className("android.widget.FrameLayout"))));
		MobileElement  createcontact= (MobileElement) driver.findElementByAccessibilityId("Create new contact");
		if(createcontact!=null)
		{
			createcontact.click();
		}
		
		WebElement Morefields=driver.findElementById("com.android.contacts:id/more_fields");
		Morefields.click();
		
		WebElement topbutton=driver.findElementById("com.android.contacts:id/account_type");
		WebElement field1=driver.findElementByClassName("android.widget.EditText");
		boolean clickfield=field1.getText().contains("Phonetic last name");
		
		
		TouchAction action = new TouchAction(driver);
		action.press((PointOption) topbutton).moveTo((PointOption) field1).release().perform(); 
	}
	
	
}
