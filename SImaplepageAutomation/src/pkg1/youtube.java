package pkg1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class youtube 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "../SImaplepageAutomation/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver ();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		WebElement video = driver.findElement(By.id("thumbnail"));
		Actions ac = new Actions(driver);
		ac.keyDown(Keys.CONTROL).click(video).keyDown(Keys.CONTROL).build().perform();
		System.out.println("******before Switching*********");
		System.out.println(driver.getCurrentUrl());
		String currentwindowaddress = driver.getWindowHandle();
		Set <String> all_windows = driver.getWindowHandles(); // focus on 1st tab
		
		for (String s : all_windows) 
		{
			driver.switchTo().window(s);
		}
		
		System.out.println("******After Switching*********");
		System.out.println(driver.getCurrentUrl());
		
       driver.switchTo().window(currentwindowaddress);
       
       System.out.println("******Final Switching*********");
		System.out.println(driver.getCurrentUrl());
	}
}
