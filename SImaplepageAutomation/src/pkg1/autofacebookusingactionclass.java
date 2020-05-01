package pkg1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class autofacebookusingactionclass 
{
	
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "../SImaplepageAutomation/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		Actions ac = new Actions(driver);
		for (int i=1; i <=5 ; i++)
	{
		ac.sendKeys(Keys.TAB).perform();
	}
		ac.sendKeys("RAJ").perform();
	}

}
