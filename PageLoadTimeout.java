package basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PageLoadTimeout {
	
	public static void main(String[] args) {
		
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		
		WebDriver driver = new ChromeDriver(options);// OBJECT CREATION OF CromeDriver
	
	    driver.get("https://demo.actitime.com/login.do");
	    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	    
	    driver.findElement(By.id("username")).sendKeys("admin");
	      
	     driver.findElement(By.name("pwd")).sendKeys("manager");
	      
	      driver.findElement(By.xpath("//div[text()='Login ']")).click();
	      
	      driver.findElement(By.id("logoutLink")).click();
	}

}
