package Skeleton;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverUtility {
	public static WebDriver getDrive(String browser)
	{
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\a07208trng_b4a.04.28\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
			return new ChromeDriver();
		}
		else
		{
			return null;
		}
		}
	}

