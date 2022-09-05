package cssselector;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExecuteAutomation {
	public static void main(String[] args) throws IOException, InterruptedException {
		FileInputStream fis=new FileInputStream(".\\GivenData\\AppData.properties");
		Properties REF=new Properties();
		REF.load(fis);
		String Url=REF.getProperty("AppUrl");
		String UserName=REF.getProperty("UserName");
		String Password=REF.getProperty("Password");
		String chromeExePath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.get(Url);
		WebElement Username=driver.findElement(By.name("UserName"));
		Username.sendKeys(UserName);
		WebElement PassWord=driver.findElement(By.name("Password"));
		PassWord.sendKeys(Password);
	    WebElement LoginButton=driver.findElement(By.cssSelector("html>body>form>p:nth-of-type(3)>input"));
	    LoginButton.click();
	    Thread.sleep(2000);
	    
	    WebElement LogOut=driver.findElement(By.cssSelector("html>body>div>ul>li>a"));
	    LogOut.click();
	    
	
	}

}
