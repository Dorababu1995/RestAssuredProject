package BrowserStack;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.remote.MobileBrowserType;
import io.appium.java_client.remote.MobileCapabilityType;

public class MobileBrowser {
	
	public static String Username  ="dorababu_SOd0Il";
	public static String AutomateKey ="eAWxWPpVeEfxpRPzwXFq";
	
	public static String URL ="https://"+Username+":"+AutomateKey+"@hub-cloud.browserstack.com/wd/hub";
	
	public static WebDriver  driver;
	
	
	@BeforeSuite
	private void suite() {

		System.out.println("SUITE STARTED");
	}
	
	@BeforeTest
	private void SetUp() throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Google Pixel 3");
		cap.setCapability(MobileCapabilityType.BROWSER_NAME, MobileBrowserType.CHROME);
		cap.setCapability("build", "Mobile Chrome device");
		cap.setCapability("name", "Run chrome browser in device");	
		
		driver = new RemoteWebDriver(new URL(URL),cap);
		
	}
	
	@BeforeClass
	private void URLOPEN() {
		driver.get("https://www.linkedin.com/");
		
		driver.manage().window().maximize();

	}
	
	@Test
	private void TC1() {
		
		String title = driver.getTitle();
		
		System.out.println(title);

	}

	@AfterTest
	private void TearDown() {
		driver.quit();

	}
	
	
	
	
	
	

}
