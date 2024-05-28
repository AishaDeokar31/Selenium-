package basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Mock {
	
	public static void main(String[] args) throws InterruptedException {
		
		

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(options);// OBJECT CREATION OF CromeDriver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	      driver.get("https://letcode.in/test");
	      
	      driver.findElement(By.xpath("//a[text()='Sign up']")).click();
	      
	      driver.findElement(By.id("name")).sendKeys("Aishwarya Deokar");
	      
	      driver.findElement(By.id("email")).sendKeys("aishadeokar123@gmail.com");
	      
	      driver.findElement(By.id("pass")).sendKeys("Aisha@123");
	      
	      driver.findElement(By.id("agree")).click();
	      
	      driver.findElement(By.xpath("//button[text()='SIGN UP']")).click();
	      Thread.sleep(2000);
	      
	      driver.navigate().back();
	      Thread.sleep(5000);

	      
	      
	      driver.findElement(By.xpath("//a[text()='Log in']")).click();
	      driver.findElement(By.name("email")).sendKeys("aishadeokar123@gmail.com");
	      driver.findElement(By.name("password")).sendKeys("Aisha@123");
	      driver.findElement(By.xpath("//button[text()='LOGIN']")).click();
	      
	      
	      
	      driver.findElement(By.xpath("//a[text()='Explore Workspace']")).click();
	      Thread.sleep(2000);

	      
	      
	      driver.findElement(By.xpath("//a[text()='Edit']")).click();
	      Thread.sleep(2000);

	      
	      driver.findElement(By.id("fullName")).sendKeys("Aishwarya Sunil Deokar");
	      Thread.sleep(2000);

	      
	      boolean ele1 = driver.findElement(By.id("noEdit")).isEnabled();
	      System.out.println(ele1);
	      Thread.sleep(2000);

	      
	      driver.navigate().back();
	      Thread.sleep(2000);

	      
	      driver.findElement(By.xpath("//a[text()='Click']")).click();
	      Thread.sleep(2000);

	      
	      Dimension ele = driver.findElement(By.id("home")).getSize();
	      Thread.sleep(2000);

	      
	      System.out.println("Width = "+ele.getWidth());
	      
	      System.out.println("Height ="+ele.getHeight());
	      Thread.sleep(2000);

	      
	      Point position = driver.findElement(By.id("home")).getLocation();
	      System.out.println("Start X ="+position.getX());
	      System.out.println("Start Y ="+position.getY());
	      Thread.sleep(2000);

	      
	      
	      driver.findElement(By.xpath("//a[text()='Sign out']")).click();
	     
	     
	    
	}

}
