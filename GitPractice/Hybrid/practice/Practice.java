package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Practice 
{
WebDriver d;
@Test
public void display()
{
	System.setProperty("webdriver.gecko.driver", "D:\\crafts\\geckodriver.exe");
	d=new FirefoxDriver();
	d.get("https://www.google.com/");
}
}
