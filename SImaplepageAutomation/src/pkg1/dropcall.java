package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropcall extends Dropmethods
{
	//public void dropselection(WebElement element, int indexnummber)
	//{
		////Select s = new Select(element);
		//s.selectByIndex(indexnummber);
	//}
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "../SImaplepageAutomation/chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "../SImaplepageAutomation/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		WebElement firstname = driver.findElement(By.name("firstname"));
		firstname.sendKeys("Raj");
		WebElement lastname = driver.findElement(By.name("lastname"));
		lastname.sendKeys("D");
		WebElement email = driver.findElement(By.id("u_0_r"));
		email.sendKeys("rajesh.dharne@zensar.com");
		WebElement pass = driver.findElement(By.name("reg_passwd__"));
		pass.sendKeys("sfsd");
		dropcall RD = new dropcall();
		WebElement d1 = driver.findElement(By.id("day"));
		WebElement d2 = driver.findElement(By.id("month"));
		WebElement d3 = driver.findElement(By.id("year"));
		RD.dropselection(d1, 21);
		RD.dropselection1(d2, "Mar");
		RD.dropselection2(d3, "1988");
		WebElement gender = driver.findElement(By.className("_8esa"));
		gender.click();
		WebElement login = driver.findElement(By.name("websubmit"));
		login.click();
	}

}
