package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropmethods 
{
	public void dropselection(WebElement element, int indexnummber)
	{
		Select s = new Select(element);
		s.selectByIndex(indexnummber);
	}
    public void dropselection1(WebElement element, String text)
    {
    	Select s1 = new Select(element);
    	s1.selectByVisibleText(text);
    }
    public void dropselection2(WebElement element, String value )
    {
    	Select s2 = new Select(element);
    	s2.selectByValue(value);
    	
    }

}

