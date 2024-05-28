package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ActiTime {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(options);// OBJECT CREATION OF CromeDriver
	      driver.get("https://demo.actitime.com/login.do");
	      Thread.sleep(2000);
	      
	      /*driver.findElement(By.id("username")).sendKeys("admin");
	      
	      driver.findElement(By.name("pwd")).sendKeys("manager");
	      
	      driver.findElement(By.xpath("//div[text()='Login ']")).click();
	      Thread.sleep(2000);
	      
	      driver.findElement(By.id("logoutLink")).click();*/
	      
	      /*String ele = driver.findElement(By.id("username")).getAttribute("name");
	      System.out.println(ele);
	      
	      
	      String ele1 = driver.findElement(By.id("headerContainer")).getText();
	      System.out.println(ele1);*/
	      
	      //String ele = driver.findElement(By.id("username")).getAttribute("Aisha");
	     // System.out.println(ele);// op = null
	      
	     // String ele = driver.findElement(By.id("username")).getAttribute("value");
	     // System.out.println(ele.isEmpty());// op = null
	      
	     // driver.findElement(By.linkText("Forgot your password?")).sendKeys(Keys.ENTER);
	      
	      //driver.findElement(By.xpath("//div[text()='Login ']")).sendKeys(Keys.ENTER);// ElementNotInteractableException
	      
	      //driver.findElement(By.id("loginButton")).sendKeys(Keys.ENTER);
	      
	      //driver.findElement(By.id("loginButton")).sendKeys(null);// illegalArgumentException
	      
	     // boolean ele = driver.findElement(By.id("keepLoggedInCheckBox")).isSelected();
	     // System.out.println(ele);
	      
	    /* WebElement ele = driver.findElement(By.id("keepLoggedInCheckBox"));
	     
	     if (ele.isSelected()) {
	    	 
	    	 System.out.println("check box is selected ");
			
		} else {
			
			System.out.println("check box is not selected");

		}
	     
	    Thread.sleep(2000);
	    ele.click();
	    
	    if (ele.isSelected()) {
	    	 
	    	 System.out.println("check box is selected ");
			
		} else {
			
			System.out.println("check box is not selected");

		}*/
	      
	     
	      /*WebElement ele = driver.findElement(By.id("keepLoggedInCheckBox"));
		     
		     if (ele.isDisplayed()) {
		    	 
		    	 System.out.println("check box is displayed ");
				
			} else {
				
				System.out.println("check box is not displayed");

			}*/
	      
	      //WebElement ele = driver.findElement(By.id("loginButton"));
	      //if (ele.isEnabled()) {
		 //System.out.println(ele.isEnabled());
		 
	      
	      
	     /* WebElement ele = driver.findElement(By.id("keepLoggedInLabel"));
		 if (ele.isSelected()) {
			 
			 System.out.println(true);
			
		} else {
			
			System.out.println(false);

		}
		 
	      
		Thread.sleep(2000);
		ele.click();
		
         if (ele.isSelected()) {
			 
			 System.out.println(true);
			
		} else {
			
			System.out.println(false);

		}*/
	      
	      
	     /*Dimension ele = driver.findElement(By.id("username")).getSize();
	     System.out.println(ele.getWidth());
	     System.out.println(ele.getHeight());*/
		
		    
		 /*Point ele1 = driver.findElement(By.id("username")).getLocation();
		 System.out.println(ele1.getX());
		 System.out.println(ele1.getY());*/
	      
	      /*Rectangle ele = driver.findElement(By.id("username")).getRect();
	      System.out.println(ele.getWidth());
	      System.out.println(ele.getHeight());
	      System.out.println(ele.getX());
		  System.out.println(ele.getY());*/
	      
	      
	      
			
	     
	      
	      
	}

}
