package basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		
		WebDriver driver = new ChromeDriver(options);// OBJECT CREATION OF CromeDriver
	
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	    
	    driver.get("https://demo.actitime.com/login.do");
	    
	    driver.findElement(By.id("username")).sendKeys("admin");
	      
	     driver.findElement(By.name("pwd")).sendKeys("manager");
	      
	      driver.findElement(By.id("loginButton")).click();
	      Thread.sleep(2000);
	      
		    String expected = "https://demo.actitime.com/login.do";

	      wait.until(ExpectedConditions.urlContains(expected));
	    

	    
	    String actual = driver.getCurrentUrl();
	    System.out.println(actual);
	    
	    if (actual.equals(expected)) {
	    	
	    	System.out.println("true");
			
		} else {
			
			System.out.println("false");

		}
	    
	   

	}

}
