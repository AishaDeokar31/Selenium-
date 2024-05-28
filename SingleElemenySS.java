package basic;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SingleElemenySS {

	
	public static void main(String[] args) throws IOException {
		
		
		LocalDateTime ltd = LocalDateTime.now();
		System.out.println(ltd);
		String time = ltd.toString().replace(':', '-');
		
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(options);// OBJECT CREATION OF CromeDriver
	      driver.get("https://www.meesho.com/");
	      
	      WebElement button = driver.findElement(By.name("login"));
	      File tempfile = button.getScreenshotAs(OutputType.FILE);
	      
	      File destfile = new File("./assignment/SS2"+time+".png");
	      //temp.renameTo(destfile);
	      FileUtils.copyFile(tempfile, destfile);
	      
	      
	}
}
