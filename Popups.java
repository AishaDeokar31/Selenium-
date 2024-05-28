package basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Popups {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(options);// OBJECT CREATION OF CromeDriver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	    /*driver.get("https://letcode.in/alert");
	    
	    
	    driver.findElement(By.id("accept")).click();
	    Thread.sleep(2000);
	    
	    driver.switchTo().alert().accept();
	    
	    driver.findElement(By.id("confirm")).click();
	    Thread.sleep(2000);
	    
	    driver.switchTo().alert().dismiss();*/
        
        
        driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
	    
	    

	}

}
