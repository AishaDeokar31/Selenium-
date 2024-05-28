package basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		
		WebDriver driver = new ChromeDriver(options);// OBJECT CREATION OF CromeDriver
	
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	  //  WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	    
	    //driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	    
	   /*WebElement button = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
	    
	    Actions action = new Actions(driver);
	    action.doubleClick(button);
	    action.perform();*/
	    
	    
		  /* WebElement click = driver.findElement(By.xpath("//span[text()='right click me']"));
		    
		    Actions action = new Actions(driver);
		    action.contextClick(click);
		    action.perform();*/
	    
	    /*driver.get("https://www.naukri.com/");
        Actions action = new Actions(driver);
	    action.sendKeys(Keys.PAGE_DOWN);
	    action.perform();*/
        
        
        /*driver.get("https://demo.actitime.com/login.do");
        WebElement check = driver.findElement(By.id("keepLoggedInCheckBox"));-
        Actions action = new Actions(driver);
        action.sendKeys(check, Keys.ENTER);
        action.perform();*/
	    
	    /*driver.get("https://www.flipkart.com/");
	    driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();
	    Thread.sleep(2000);
	    
	    WebElement fashion = driver.findElement(By.xpath("//div[text()='Fashion']"));
        Actions action = new Actions(driver);
        action.moveToElement(fashion);
        action.perform();*/
	    
	    
	    driver.get("https://www.actitime.com/");
	    WebElement input = driver.findElement(By.linkText("Pricing"));
        Actions action = new Actions(driver);
        action.moveToElement(input, -100, 0);
        action.perform();
        
        
	    
	    
	    
	    
	    

	    
	    
		 
	 
	    
	}

}
