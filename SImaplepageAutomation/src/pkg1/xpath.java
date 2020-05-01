package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class xpath 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "../SImaplepageAutomation/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver ();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement firstname = driver.findElementByXPath("//input[contains(@name , 'first')]");
		firstname.sendKeys("Shiv");
		WebElement lastname = driver.findElementByXPath("//input[@name='lastname']");
		lastname.sendKeys("SHanky");
		WebElement email = driver.findElementByXPath("//input[@id='u_0_r' and @name = 'reg_email__']");
		email.sendKeys("xyz@gmail.co.in");
		 WebElement pass = driver.findElementByXPath("//input[@name = 'reg_passwd__']");
		 pass.sendKeys("passw");
		 WebElement drop1 = driver.findElementByXPath("//Select[@id='day']");
		 Select s1 = new Select(drop1);
		 s1.selectByIndex(21);
		 WebElement drop2 = driver.findElementByXPath("//Select[@name = 'birthday_month' and @id = 'month']");
		 Select s2 = new Select (drop2);
		 s2.selectByValue("3");
		 WebElement drop3 = driver.findElementByXPath("//Select[@id = 'year']");
		 Select s3 = new Select (drop3);
		 s3.selectByVisibleText("1983");
		WebElement gender = driver.findElementByXPath("//input[@value = '2' or @id = 'u_0_7']");
		gender.click();
		WebElement login = driver.findElementByXPath("//input[contains (@id, 'u')]");
		login.click();
				
		 
				
		
		
	}

}
