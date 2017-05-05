import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
public class LoginTest {
	static WebDriver driver;
	static WebDriverWait wait;

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Administrator\\Downloads\\SeleniumFiles\\Selenium\\chromedriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://twitter.com/?lang=en");
		driver.findElement(By.linkText("Log in")).click();
		
		final String UserName = "tomia_@hotmail.com";
		final String PassWord = "STDstd123";
		
		
		WebElement usernameBox = driver.findElement(By.name("session[username_or_email]"));
		WebElement passwordBox = driver.findElement(By.name("session[password]"));
		WebElement saveBtn = driver.findElement(By.xpath("//input[@value='Log in']"));
		usernameBox.sendKeys(UserName);
		passwordBox.sendKeys(PassWord);
		saveBtn.click();
		/*
		final String userName = "jeff";
		final String password = "test123";

		WebElement usernameBox = driver.findElement(By.name("username"));
		WebElement passwordBox = driver.findElement(By.name("password"));
		WebElement saveBtn = driver.findElement(By.name("FormsButton2"));

		usernameBox.sendKeys(userName);
		passwordBox.sendKeys(password);
		saveBtn.click();*/
	}
}