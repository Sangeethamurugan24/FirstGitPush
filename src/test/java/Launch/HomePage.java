package Launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class HomePage extends LaunchApp {

	@FindBy(id="my_text_fieldCD")
	public static WebElement searchbox;
	
	@FindBy(id="io.selendroid.testapp:id/touchTest")
	public static WebElement touch;
	
	@FindBy(id="showPopupWindowButtonCD")
	public static WebElement Alert;
	
	@Test
	public static void Validation()
	{
		try {
			Thread.sleep(3000);
			Alert.click();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}	
	
}
