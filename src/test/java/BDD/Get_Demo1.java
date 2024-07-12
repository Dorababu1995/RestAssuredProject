package BDD;


import static io.restassured.RestAssured.*;
import static org.hamcrest.Matcher.*;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;





public class Get_Demo1 {

	public static WebDriver driver=null;
	
	
	@BeforeSuite
	private void SuiteExection() {
		
		System.out.println("SUITE STARTED");

	}
	
	@BeforeTest
	private void DriverPreparaion() {
		
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/chromedriver-win64/chromedriver.exe");	
//		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
//		options.addArguments("headless");
		// Must maximize Chrome by `start-maximized`
		options.addArguments("start-maximized");

		driver = new ChromeDriver();
		

		
		
		
		driver.get("https://www.facebook.com/");
	
	}

	@Test(description = "validate the title of the page")
	private void TC_1() {
		
		String title = driver.getTitle();
		
		System.out.println(title);

	}
	
	@AfterTest
	private void Tear() {
	
		
		driver.quit();
	}
	
	
	
}
