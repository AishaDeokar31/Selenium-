package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebElement {
	public static void main(String[] args) throws InterruptedException  {
		
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(options);// OBJECT CREATION OF CromeDriver
	      driver.get("https://www.google.com/doodles");
	      Thread.sleep(2000);
	      
	      //driver.findElement(By.linkText("Hungary National Day 2023")).click();
	      //Thread.sleep(2000);
	      
	      driver.findElement(By.linkText("India Republic Day 2023")).click();
		

}
}
