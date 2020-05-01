package pkg1;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class junit1 
{
	ChromeDriver driver;
	@Before
	public void browser()
	{
		System.setProperty("webdriver.chrome.driver", "../SImaplepageAutomation/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
	}
	@Test
	public void pageautomation()
	{
		WebElement firstname = driver.findElement(By.name("firstname"));
		firstname.sendKeys("Raj");
		WebElement lastname = driver.findElement(By.name("lastname"));
		lastname.sendKeys("Patil");
		WebElement email = driver.findElement(By.cssSelector("input#u_0_r"));
		email.sendKeys("rajeshd@rediffmail.com");
		WebElement email1 = driver.findElement(By.cssSelector("input#u_0_u"));
		email1.sendKeys("rajeshd@rediffmail.com");
		WebElement pass = driver.findElement(By.cssSelector("input[name='reg_passwd__']"));
		pass.sendKeys("raj123");
		WebElement day = driver.findElement(By.cssSelector("Select[name='birthday_day']"));
		Select drop1 = new Select(day);
		drop1.selectByIndex(21);
		WebElement month = driver.findElement(By.cssSelector("select#month"));
		Select s1 = new Select (month);
		//s1.selectByVisibleText("Mar");
		s1.selectByValue("8");
		WebElement year = driver.findElement(By.cssSelector("select#year"));
		Select s2 = new Select(year);
		s2.selectByIndex(32);
	}

}
