package basic;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TakeScreenShot {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		LocalDateTime ltd = LocalDateTime.now();
		System.out.println(ltd);
		String time = ltd.toString().replace(':', '-');
		
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(options);// OBJECT CREATION OF CromeDriver
	      driver.get("https://www.instagram.com/accounts/emailsignup/");
	      
	      TakesScreenshot ts = (TakesScreenshot) driver;
	      File temp = ts.getScreenshotAs(OutputType.FILE);
	     // System.out.println(temp.getAbsolutePath());
	      //Thread.sleep(90000);
	      
	      File destfile = new File("./assignment/SS2"+time+".png");
	      //temp.renameTo(destfile);
	      FileUtils.copyFile(temp, destfile);
	      
	}

}
