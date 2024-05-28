package basic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopup {
	
	public static void main(String[] args) {
		

		// TODO Auto-generated method stub
		

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--diable-notifications");
		
		WebDriver driver = new ChromeDriver(options);// OBJECT CREATION OF CromeDriver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.justdial.com/");

	   
	    
		

	}

}
