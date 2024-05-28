package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.grid.Main;

public class CSS {
	
  public static void main(String[] args) throws InterruptedException {
	
	  
	  ChromeDriver driver = new ChromeDriver();// OBJECT CREATION OF CromeDriver
      driver.get("https://www.flipkart.com/");
      Thread.sleep(2000);
      
      driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();
      Thread.sleep(2000);
      
      driver.findElement(By.cssSelector("img[alt ='Travel']")).click();
      Thread.sleep(2000);
      driver.navigate().back();
      Thread.sleep(2000);
      
      
      driver.findElement(By.cssSelector("img[alt ='Grocery']")).click();
      Thread.sleep(2000);
      driver.navigate().back();
      Thread.sleep(2000);
      
      driver.findElement(By.cssSelector("img[alt ='Mobiles']")).click();
      Thread.sleep(2000);
      driver.navigate().back();
      Thread.sleep(2000);
      
      
      driver.findElement(By.cssSelector("img[alt ='Appliances']")).click();
      Thread.sleep(2000);
      driver.navigate().back();
      Thread.sleep(2000);
      
      
      driver.findElement(By.cssSelector("img[alt ='Top Offers']")).click();
      Thread.sleep(2000);
      driver.navigate().back();
      Thread.sleep(2000);
      
      
}

}
