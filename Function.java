package basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Function {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		/*ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(options);// OBJECT CREATION OF CromeDriver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	    driver.get("https://demo.actitime.com/login.do");
	       
	   WebElement button = driver.findElement(By.id("loginButton"));
	    JavascriptExecutor jse = (JavascriptExecutor) driver;
	    
	    jse.executeScript("arguments[0].click()", button);*/
	    
	    //to work on disable button
	    
	    
	    ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(options);// OBJECT CREATION OF CromeDriver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	    /*driver.get("https://www.oracle.com/in/java/technologies/javase/javase8-archive-downloads.html");
	    
	    
	    driver.findElement(By.linkText("jdk-8u202-linux-arm32-vfp-hflt.tar.gz")).click();
	    
	    Thread.sleep(2000);
	    
	   WebElement button = driver.findElement(By.linkText("Download jdk-8u202-linux-arm32-vfp-hflt.tar.gz"));
	    
	    JavascriptExecutor jse = (JavascriptExecutor) driver;
	    
	    jse.executeScript("arguments[0].click()", button);*/
        
        driver.get("https://demo.actitime.com/login.do");
        WebElement text = driver.findElement(By.id("username"));
        
	    JavascriptExecutor jse = (JavascriptExecutor) driver;
	    jse.executeScript("arguments[0].value='Aisha'", text);


	    
		
	     


	}

}
