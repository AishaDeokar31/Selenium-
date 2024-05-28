package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonCss {

	public static void main(String[] args) throws InterruptedException {

		
		ChromeDriver driver = new ChromeDriver();// OBJECT CREATION OF CromeDriver
	      driver.get("https://www.amazon.in/");
	     // Thread.sleep(2000);
	      
	      driver.findElement(By.cssSelector("a[href='/minitv?ref_=nav_avod_desktop_topnav']")).click();
	      Thread.sleep(2000);
	      driver.navigate().back();
	      Thread.sleep(2000);
	      
	     driver.findElement(By.linkText("Mobiles")).click();
	     Thread.sleep(2000);
	      driver.navigate().back();
	      Thread.sleep(2000);
	      
	      driver.findElement(By.linkText("Customer Service")).click();
	      Thread.sleep(2000);
	      driver.navigate().back();
	      
	      
	     
	     
	    
	      
	      
	}
}
