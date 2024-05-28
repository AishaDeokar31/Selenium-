package basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		
		WebDriver driver = new ChromeDriver(options);// OBJECT CREATION OF CromeDriver
	
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	    
	    //driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
	   
	   /* WebElement source = driver.findElement(By.xpath("//h1[text()='Block 1']"));
	    WebElement targeted = driver.findElement(By.id("column-2"));
        Actions action = new Actions(driver);
       // action.dragAndDrop(source, targeted);
        action.clickAndHold(source).moveToElement(targeted).release();
        action.perform();*/
	    
	    driver.get("https://jqueryui.com/draggable/");
	    driver.switchTo().frame(0);

        
	   WebElement box = driver.findElement(By.xpath("//p[text()='Drag me around']"));
       Actions action = new Actions(driver);
       action.dragAndDropBy(box, -100, 0);
       action.perform();

        
	   
	}

}













