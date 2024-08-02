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

public class ChromRunner {
	
	public static String Username  ="dorababu_SOd0Il";
	public static String AutomateKey ="eAWxWPpVeEfxpRPzwXFq";
	public static String URL ="https://"+Username+":"+AutomateKey+"@hub-cloud.browserstack.com/wd/hub";
	public static WebDriver  driver;	
	@BeforeSuite
	private void suite() {
		// TODO Auto-generated method stub

		System.out.println("SUITE STARTED");
	}
	
	@BeforeTest
	private void SetUp() throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("os","windows");
		cap.setCapability("os_version", "10");
		cap.setCapability("browser", "Chrome");
		cap.setCapability("browser_version", 80);
		cap.setCapability("name", "BROWSER STACK CHROME");
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