package pkg1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class innertext 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "../SImaplepageAutomation/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver ();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement innertext1 = driver.findElementByXPath("//span[text(), 'Create an account']");
		innertext1.click();
		
	}

}
