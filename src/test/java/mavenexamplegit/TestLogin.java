package mavenexamplegit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestLogin {
	
public static WebDriver driver;
	
	@BeforeSuite
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	
	@Test
	public void doLogin() {
		driver.get("http://www.gmail.com");
		driver.findElement(By.name("identifier")).sendKeys("vidyarayudu668@gmail.com");
		//driver.findElement(By.xpath("//span[@text()='Next']")).click();
		
	}
	
	@AfterSuite
	public void tearDown() {
		driver.quit();
	}

}
