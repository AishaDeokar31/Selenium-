 package basic;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
	
	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");// if we get illlegel state exception
		
		ChromeDriver driver = new ChromeDriver();// OBJECT CREATION OF CromeDriver
       driver.get("https://www.facebook.com/");
		
		//driver.manage().window().maximize();
		//driver.manage().window().minimize();
		//driver.manage().window().fullscreen();
        
		
        //driver.get("https://www.flipkart.com/");
        
       // Dimension ele = driver.manage().window().getSize();
       // System.out.println("width ="+ele.getWidth());
       // System.out.println("height ="+ele.getHeight());
       
       Dimension d = new Dimension(900,900);// create an object of dimension for set size n gives the input as width and height resp.
       driver.manage().window().setSize(d);// pass the reference variable of dimension object
      
       
       
        //driver.get("https://demo.actitime.com/login.do");//get(): to launch the application
        //Thread.sleep(2000);
        //driver.navigate().back();// back to 1st application
        
      //  Thread.sleep(2000);
        //driver.navigate().forward();// to goes next URL or application
        
       // Thread.sleep(2000);
        //driver.navigate().refresh();// to refresh application 
        
       // String actualtitle = driver.getTitle();// gives title 
        //System.out.println(actualtitle);
        
       // String actualurl = driver.getCurrentUrl();
       // System.out.println(actualurl);
       
       
       Point ele = driver.manage().window().getPosition();
       System.out.println("start-x ="+ele.getX());
       System.out.println("start-y ="+ele.getY());
       
       Point pt = new Point(300,230);
       driver.manage().window().setPosition(pt);
       
       
       
       
       
       
       
       
        
        
       // String code = driver.getPageSource();
       // System.out.println(code);
        
        
        
        
        
        
	}

}
