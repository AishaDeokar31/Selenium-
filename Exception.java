package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Exception {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(options);// OBJECT CREATION OF CromeDriver
	      driver.get("https://www.flipkart.com/");
	      
	      driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();
	      Thread.sleep(2000);
	      
	      
	      //driver.findElement(By.xpath("//img[@alt = 'Grocery']")).click();
	      
	      String ele = driver.findElement(By.xpath("//*[@alt ='Appliances']")).getTagName();// GETTAGNAME METHOD
	      System.out.println(ele);
	}

}
