package basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class teat {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(options);// OBJECT CREATION OF CromeDriver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	      driver.get("https://letcode.in/test");
	      
	      driver.findElement(By.xpath("//a[text()='Sign up']")).click();
	      
	      driver.findElement(By.id("name")).sendKeys("Prachi desai");
	      
	      driver.findElement(By.id("email")).sendKeys("Prachi12@gmail.com");
	      
	      driver.findElement(By.id("pass")).sendKeys("Pdesai@123");
	      
	      driver.findElement(By.id("agree")).click();
	      
	      driver.findElement(By.xpath("//button[text()='SIGN UP']")).click();
	      Thread.sleep(2000);
	      
	      driver.navigate().back();
	      Thread.sleep(5000);

	      
	      
	      driver.findElement(By.xpath("//a[text()='Log in']")).click();
	      driver.findElement(By.name("email")).sendKeys("Prachi12@gmail.com");
	      driver.findElement(By.name("password")).sendKeys("Pdesai@123");
	      driver.findElement(By.xpath("//button[text()='LOGIN']")).click();
	      
	      
	      
	      driver.findElement(By.xpath("//a[text()='Explore Workspace']")).click();
	      Thread.sleep(2000);
	      
	      driver.findElement(By.xpath("//a[text()='Dialog']")).click();
		   Thread.sleep(2000);
		    
		    driver.findElement(By.id("confirm")).click();
		    Thread.sleep(2000);
		    driver.switchTo().alert().dismiss();
		    
		    driver.findElement(By.id("modern")).click();
		    Dimension ele1 = driver.manage().window().getSize();
		    Thread.sleep(2000);
		    System.out.println("width ="+ele1.getWidth());
		    System.out.println("Height ="+ele1.getHeight());
		    
		    driver.navigate().back();
		    Thread.sleep(2000);
		    
		    
		    driver.findElement(By.xpath("//a[text() ='Click']")).click();
		    WebElement ele2=driver.findElement(By.id("isDisabled"));
		    if(ele2.isDisplayed())
		    {
		    	System.out.println("button is  Disabled");
		    }
		    else
		    {
		       System.out.println("button is not Disabled");
		    }
		   
		    
		    driver.navigate().back();
		    Thread.sleep(2000);
		    
		    //driver.findElement(By.linkText("Sign out")).sendKeys(Keys.ENTER);
		    
		    //driver.findElement(By.xpath("//a[@class = 'button is-primary is-rounded is-small ng-star-inserted']")).sendKeys(Keys.ENTER);
		    
		    driver.findElement(By.xpath("//a[text()='Sign out']")).click();
		    
		    
	      
	      
		
		
	}

}
