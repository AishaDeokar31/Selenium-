package basic;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JavaScript {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(options);// OBJECT CREATION OF CromeDriver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	     //driver.get("https://www.google.com/");
	    
	     driver.get("https://www.naukri.com/");

	     
	     JavascriptExecutor jse = (JavascriptExecutor) driver;
	     //jse.executeScript("window.promt('Enter your name')");
         //jse.executeScript("window.scrollBy(0,900)");
         //Thread.sleep(2000);
	    // jse.executeScript("window.scrollBy(300,0)");
	     
	     
	     /*jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	     Thread.sleep(2000);
	     jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");*/
	     
	     
	    // jse.executeScript("window.scrollTo(document.body.scrollWidth,0)");	     
	     
	      

	}

}
