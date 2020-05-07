package Test;

import java.net.URL;

import Launch.HomePage;
import Launch.LaunchApp;
import io.appium.java_client.android.AndroidDriver;

public class test extends HomePage {
	
	public static void main(String[] args) {
		LaunchApp ln=new LaunchApp() ;
		
		
		ln.DesiredCaps();
		Validation();
		

	}

}
