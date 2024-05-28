package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class VtigerApp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(options);// OBJECT CREATION OF CromeDriver
	      driver.get("https://demo.vtiger.com/vtigercrm/");
	      Thread.sleep(2000);
	      
	        /*WebElement username = driver.findElement(By.id("username"));
	        Thread.sleep(2000);
	        username.clear();
	        username.sendKeys("Aisha");
	        
	      
	         WebElement password = driver.findElement(By.id("password"));
	        Thread.sleep(2000);
	        password.clear();
	        password.sendKeys("Aisha@123");*/
	      
	      
	      driver.findElement(By.xpath("//button[text()='Sign in']")).click();
	        

	}

	
}
