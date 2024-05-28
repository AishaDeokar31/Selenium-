package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FindMethod {
	
	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(options);// OBJECT CREATION OF CromeDriver
	      driver.get("https://www.google.com/");
	      
	     // driver.findElement(By.xpath("//button[text()='No thanks']")).click();
	      
	      //driver.findElement(By.name("q")).sendKeys("Pune");
	      driver.findElement(By.name("q"));

	      
	      List<WebElement> ele = driver.findElements(By.xpath("//li[@class = 'sbct' and not(@id='YMXe')]"));
	      
	      for (WebElement a : ele) {
	    	  
	    	  System.out.println(a.getText());
			
		}
		
		
		
		
	}

}
