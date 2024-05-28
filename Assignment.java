package basic;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment {
	
	public static void main(String[] args) {
		
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		
		WebDriver driver = new ChromeDriver(options);// OBJECT CREATION OF CromeDriver
	
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	    
	    driver.get("https://www.facebook.com/signup");
	    //WebElement day = driver.findElement(By.id("day"));
	    
	    WebElement day = driver.findElement(By.id("day"));

	    Select s = new Select(day);	
	    s.selectByVisibleText("31");
	    
        WebElement month = driver.findElement(By.id("month"));
	    
	    Select s1 = new Select(month);	
	    s1.selectByVisibleText("Mar");
	    
        WebElement year = driver.findElement(By.id("year"));
	    
	    Select s3 = new Select(year);	
	    s3.selectByVisibleText("2000");
	  
	    
	  
	    /*ChromeOptions options1 = new ChromeOptions();
		options1.addArguments("--remote-allow-origins=*");
		
		
		WebDriver driver1 = new ChromeDriver(options1);// OBJECT CREATION OF CromeDriver
	
	    driver1.manage().window().maximize();
	    driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    WebDriverWait wait = new WebDriverWait(driver1,Duration.ofSeconds(10));

	    	    
	    driver1.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
	    
       WebElement country = driver1.findElement(By.id("Form_getForm_Country"));
	    
	    Select s4 = new Select(country);
	    
	    List<WebElement> ele = s4.getOptions();
	    
	    
	    
         for (int i = 0; i < ele.size(); i++) 			
        {
        	s4.selectByIndex(i); 
			
		}  */
	    
	}

}
