package basic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrangeHrm {
	
	public static void main(String[] args) {
		
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		
		WebDriver driver = new ChromeDriver(options);// OBJECT CREATION OF CromeDriver
	
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	  //  WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	    
	    driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
	    
	    
	    WebElement country = driver.findElement(By.id("Form_getForm_Country"));
	    
	    Select s = new Select(country);
	    
	   /* if (s.isMultiple()) {
	    	System.out.println("true: it is a multi list");
			
		}
	    else {
	    	System.out.println("false: it is a single list");
	    }*/
	    
	    List<WebElement> ele = s.getOptions();
	  //  System.out.println(ele.getText());//to use this method we go for for each loop 
	    /*
	    for (WebElement all : ele) {
	    	
	    	System.out.println(all.getText());
			
		}*/
	    
	    //s.selectByVisibleText("India");
	    
	     /*List<WebElement> countrys = s.getOptions();
	     for (WebElement all : countrys) {
	    	 
	    	 s.selectByVisibleText(all.getText());
			
		}*/
	     
	    /*List<WebElement> country1 = s.getOptions();
	    
	    for (WebElement all : country1) {
	    	
	    	s.selectByValue(all.getAttribute("value"));
			
		}*/
	    
	   for (String a = "Afghanistan" ; a <= "Zaire" ; a++) {
		   
		   s.selectByIndex(a);
		
	}
	    
	    
	    
	}

}
