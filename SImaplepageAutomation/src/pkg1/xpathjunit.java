package pkg1;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class xpathjunit extends Dropmethods

{
	
	ChromeDriver driver;
	@Before
	public void browser ()
	{
		System.setProperty("webdriver.chrome.driver", "..//SImaplepageAutomation/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void loginpage()
	{
	
	WebElement name = driver.findElement(By.xpath("//input[@name = 'firstname' and @id = 'u_0_m']"));
	name.sendKeys("Arjun");
	WebElement lastname = driver.findElementByXPath("//input[@name = 'lastname']");
	lastname.sendKeys("Ten");
	WebElement mobile = driver.findElementByXPath("//input[@id = 'u_0_r']");
	mobile.sendKeys("9856741235");
	xpathjunit RD = new xpathjunit ();
	WebElement day1 = driver.findElement(By.xpath("//Select[@id = 'day' or @name ='birthday_month']"));    
	WebElement month = driver.findElementByXPath("//Select[@id = 'month' or @name = 'birthday_month']");
	WebElement year = driver.findElementByXPath("//Select[@id = 'year' or @name = 'birthday_year']");
	RD.dropselection(day1, 21);
	RD.dropselection1(month, "Mar");
	RD.dropselection2(year, "1988");
	WebElement gender = driver.findElementByXPath("//input[@id = 'u_0_7']");
	gender.click();
	
	
	
	}
}
