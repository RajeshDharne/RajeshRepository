package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Simplepage 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "../SImaplepageAutomation/chromedriver.exe");
		//System.out.println(System.getProperty("webdriver.chorme.driver"));
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//Options op =driver.manage();
		//Window w = op.window();
		//w.maximize();
		driver.manage().window().maximize();
		WebElement user = driver.findElement(By.name("email"));
		user.sendKeys("xy1");
		//WebElement password = driver.findElement(By.cssSelector("input#pass"));
		WebElement password = driver.findElement(By.cssSelector("input[id= 'pass']"));
		password.sendKeys("Test1");
		WebElement loginbutton = driver.findElement(By.id("loginbutton"));
		loginbutton.click();
		
		
	}

}
