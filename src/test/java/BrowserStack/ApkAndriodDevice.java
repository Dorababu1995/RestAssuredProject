package BrowserStack;


import java.net.MalformedURLException;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;


public class ApkAndriodDevice {
	
	
	public static String username="dorababu_SOd0Il";
	public static String AccessKey="eAWxWPpVeEfxpRPzwXFq";
	
	public static String URL = "https://"+username+":"+AccessKey+"@hub-cloud.browserstack.com/wd/hub";
	
	
	@BeforeSuite
	private void SuiteStarted() {
		
		System.out.println("SUITE STARTED");
		
	}
	
	@BeforeTest
	private void SetUp() throws MalformedURLException {
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Google Pixel 3");
		cap.setCapability("os_version", "9.0");
		cap.setCapability("project", "API Demo Andriod");
		cap.setCapability("build", "5.1");
		cap.setCapability("name", "Browserstack andriod sample test");
		cap.setCapability("app", "bs://e033ff6d96cebda237a0e7b488e00b84a300b30d");

		AndroidDriver driver = new AndroidDriver(new java.net.URL(URL),cap);
	}
	
	
	@BeforeClass
	private void Urllunch() {
		

		
	}
	
	@Test
	private void Tc1() {
		
		System.out.println("executed");
		
	}

	@AfterTest
	private void teardown() {
		
		

	}
}
