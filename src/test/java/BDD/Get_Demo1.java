package BDD;


import static io.restassured.RestAssured.*;
import static org.hamcrest.Matcher.*;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Get_Demo1 {

	public static WebDriver driver;
	
	
	@BeforeSuite
	private void SuiteExection() {
		
		System.out.println("SUITE STARTED");

	}
	
	@BeforeTest
	private void DriverPreparaion() {
		
		
		System.setProperty("webdriver.chrome.driver","C:/Users/chodavarapudorababu/Downloads/drivers/drivers/chromedriver-win64/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
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
