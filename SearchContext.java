package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchContext {
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();// OBJECT CREATION OF CromeDriver
	       driver.get("https://demo.actitime.com/login.do");
	       
	      // driver.findElement(By.id("username")).sendKeys("pune");
	      // driver.findElement(By.name("pwd")).sendKeys("deccan");
	       
	       //driver.findElement(By.tagName("a")).click();
	       
	       driver.findElement(By.linkText("Forgot your password?")).click();
	       
	       driver.findElement(By.partialLinkText("Forgot your pas")).click();
	       
	       
	       
	}

}
