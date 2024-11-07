package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login 
{
	static String Email ="sipu.nayak@moretasks.com";
	static String password ="Admin@1234";
	@Test
	public static void SignIn ()throws Exception
	{
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
        driver.get("https://www.cheapmedicineshop.com");
        Thread.sleep(2000);
        
		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(By.id("switcher-customer-trigger"))).click().perform();
		
		//driver.findElement(By.id("switcher-customer-trigger")).click();
		Thread.sleep(1000);
	    driver.findElement(By.cssSelector("ul.dropdown.switcher-dropdown > li.link.authorization-link > a")).click();	  
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[@id=\"customer-email\"]")).sendKeys(Email);
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(password);
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[@id=\"send2\"]/span")).click();
	    System.out.println("Login completed");
	}
}
