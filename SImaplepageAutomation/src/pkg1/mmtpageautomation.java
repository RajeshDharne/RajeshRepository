package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mmtpageautomation 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "../SImaplepageAutomation/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		WebElement fromcity = driver.findElement(By.id("fromCity"));
		Thread.sleep(2000);
		fromcity.click();
		
		
		Actions ac = new Actions(driver);
		//Actions ac2 = new Actions(driver);
		//ac.sendKeys(fromcity, "PUNE").perform();
		
		for (int i = 1; i <= 5 ; i++)
		{	
		ac.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		}
		ac.sendKeys(Keys.ENTER).perform();
			
				
		
		//WebElement tocity = driver.findElement(By.xpath("//input[@id='toCity']"));		
		//tocity.click();
		//for (int j = 1; j <= 3; j++);
		//{
			ac.sendKeys(Keys.ARROW_DOWN).perform();
			ac.sendKeys(Keys.ARROW_DOWN).perform();
			ac.sendKeys(Keys.ARROW_DOWN).perform();
			ac.sendKeys(Keys.ARROW_DOWN).perform();
			Thread.sleep(2000);
		//}
		
		ac.sendKeys(Keys.ENTER).perform();
		//Thread.sleep(2000);
	}

}
