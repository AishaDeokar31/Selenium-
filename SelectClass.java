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

public class SelectClass {
	
	public static void main(String[] args) {
		

		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		
		WebDriver driver = new ChromeDriver(options);// OBJECT CREATION OF CromeDriver
	
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	    
	    driver.get("https://www.facebook.com/signup");
	    
	    
	    WebElement month = driver.findElement(By.id("month"));
	    
	    //Select s = new Select(month);
	    
	    /*if (s.isMultiple()) {
	    	System.out.println("true: it is a multi list");
			
		}
	    else {
	    	System.out.println("false: it is a single list");
	    }*/
	    
	    
	    
	    //driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
	    //WebElement month = driver.findElement(By.id("month"));
	    
	    Select s = new Select(month);
	   //  s.selectByVisibleText("Jan");
	    
	    List<WebElement> ele = s.getOptions();
		  //  System.out.println(ele.getText());//to use this method we go for for each loop 
		    
		    /*for (WebElement all : ele) {
		    	
		    	System.out.println(all.getText());
	    
		    }*/
	    
	    /*List<WebElement> months = s.getOptions();
	    for (WebElement allmonths : months) {
	    	
	    	s.selectByVisibleText(allmonths.getText());			
		}*/
	   // s.selectByValue("6");
	    
      /* List<WebElement> months = s.getOptions();
	    
	    for (WebElement all : months) {
	    	
	    	s.selectByValue(all.getAttribute("value"));
			
		}*/
	    
	   // s.selectByIndex(7);
	    
	     /*for(int i = 0; i < 12;i++) {
	    	 
	    	 s.selectByIndex(i);
	     }*/
	    

	    
	    
	    
	    
	    
	    
	    
	}

}
