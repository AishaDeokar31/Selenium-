package basic;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Gruru99 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(options);// OBJECT CREATION OF CromeDriver
	      driver.get("https://demo.guru99.com/test/upload/");
	      Thread.sleep(2000);
	      
	      driver.findElement(By.id("file_wraper0")).click();
	      Thread.sleep(2000);
	      Runtime.getRuntime().exec("\"C:\\Users\\aishwarya\\OneDrive\\Desktop\\UploadingFile.exe\"");
	      
	      

	}

}
