import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ChromeLogin {
	static WebDriver driver;
	static WebDriverWait wait;
	

	private static boolean isElementPresent(By bye) 
	{
	    try {
	      driver.findElement(bye);
	      return true;
	    } catch (NoSuchElementException e) {
	      return false;
	    }
	}
	
	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.gecko.driver" , "C:\\Users\\Administrator\\Downloads\\SeleniumFiles\\Selenium\\geckodriver.exe");
		
		driver = new FirefoxDriver();
		driver.get("https://twitter.com/?lang=en");
		 for (int second = 0;; second++) 
		 {
		    	if (second >= 60) 
		    		fail("timeout");
		    	try 
		    	{ 
		    		if (isElementPresent(By.linkText("Log in"))) 
		    			break; 
		    	} 
		    	catch (Exception e) 
		    		{}
		    
		    }
		
	 	driver.findElement(By.linkText("Log in")).click();
		for (int second = 0;; second++) 
		 {
		    	if (second >= 60) 
		    		fail("timeout");
		    	try 
		    	{ 
		    		if (isElementPresent(By.xpath("/html/body/div[21]/div[2]/div[2]/div[2]/div[2]/form/div[3]/label/input"))) 
		    			break; 
		    	} 
		    	catch (Exception e) 
		    		{}
		    	
		  }
		
		
					
		/*final String UserName = "tomia_@hotmail.com";
		final String PassWord = "stdstd";
		
		
		WebElement usernameBox = driver.findElement(By.name("session[username_or_email]"));
		WebElement passwordBox = driver.findElement(By.name("session[password]"));
		WebElement saveBtn = driver.findElement(By.xpath("//input[@value='Log in']"));
		usernameBox.sendKeys(UserName);
		passwordBox.sendKeys(PassWord);
		saveBtn.click();*/

				
	}
}
