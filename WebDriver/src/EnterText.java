
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class EnterText {
	static WebDriver driver;


	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\Administrator\\Downloads\\SeleniumFiles\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///C:/Users/Administrator/AppData/Local/Temp/Temp1_HTML.zip/HTML/1.html");
	
		final String Vname = "test123";
		
		
		WebElement nameBox = driver.findElement(By.name("1"));
		
		nameBox.sendKeys(Vname);
		
	}
}