package basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {
	
	public static void main(String[] args) {
		
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		
		WebDriver driver = new ChromeDriver(options);// OBJECT CREATION OF CromeDriver
	
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	  //  WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	    
	    driver.get("https://www.google.com/");
	    
	    //WebElement search = driver.findElement(By.name("q"));
	    
	    Actions action = new Actions(driver);
	    
	    //action.contextClick();
	    //action.perform();
	    
	    //action.contextClick(search);
	    
	    WebElement icon = driver.findElement(By.xpath("//a[@aria-label='Google apps']"));
	    action.click(icon);
	    action.perform();
	   
	    
	   
	    
	}

}
