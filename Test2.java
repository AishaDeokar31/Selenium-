package basic;

import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {
	
	public static void main(String[] args) {
		
		
		ChromeDriver driver = new ChromeDriver();// OBJECT CREATION OF CromeDriver
	       driver.get("https://www.facebook.com/");
	       
	       /*String actual = driver.getCurrentUrl();
	       String expected = "https://www.facebook.com/";
	       
	       System.out.println(actual);
	       
	       // verification with equals method
	       if (actual.equals(expected)) {
	    	   
	    	   System.out.println("True");
			
		} 
	       else {
	    	   
	    	   System.out.println("False");
		}
	       
	       
	       // verification with contains method
	       if (actual.contains(expected)) {
	    	   
	    	   System.err.println("true");
			
		} else {
			
			System.out.println("false");

		}*/
	       
	       String source = driver.getPageSource();
	       System.out.println(source);
	       
	      String expectsource = "og:site_name";
	      
	      if (source.contains(expectsource)) {
	    	  
	    	  System.out.println("true");
			
		} else {
			
			System.out.println("false");

		}
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	}

}
