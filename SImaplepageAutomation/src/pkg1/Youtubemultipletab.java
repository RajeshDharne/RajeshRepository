package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Youtubemultipletab 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "../SImaplepageAutomation/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver ();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.name("search_query"));
		Thread.sleep(5000);
		search.sendKeys("Yoga");
		WebElement searchbutton = driver.findElement(By.id("search-icon-legacy"));
		Thread.sleep(5000);
		searchbutton.click();
		Actions ac = new Actions (driver);
		for (int i = 1; i <=5; i++)
		{
			ac.sendKeys(Keys.TAB).perform();
			Thread.sleep(5000);
			System.out.println(i);
		}
		
		ac.sendKeys(Keys.ENTER).perform();
		Thread.sleep(5000);
		
	}

}
