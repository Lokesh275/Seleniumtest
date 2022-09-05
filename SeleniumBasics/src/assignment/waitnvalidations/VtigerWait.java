package assignment.waitnvalidations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VtigerWait {

	public static void main(String[] args) {
		String chromeExePath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		WebElement UserName=driver.findElement(By.id("username"));
		UserName.clear();
		UserName.sendKeys("admin");
		WebElement PassWord=driver.findElement(By.id("password"));
		PassWord.clear();
		PassWord.sendKeys("Test@123");
		WebElement LoginButton=driver.findElement(By.cssSelector("html>body>div#page>div:nth-of-type(3)>div:nth-of-type(1)>div>#loginFormDiv>form>div:nth-of-type(3)>button"));
		LoginButton.click();
		WebElement Profile=driver.findElement(By.cssSelector("html>body>div:nth-of-type(1)>nav:nth-of-type(1)>div:nth-of-type(1)>div:nth-of-type(1)>div#navbar>ul:nth-of-type(1)>li.dropdown>div>a>span.fa"));
		Profile.click();
WebElement SignOut=driver.findElement(By.cssSelector("html>body>div:nth-of-type(1)>nav:nth-of-type(1)>div:nth-of-type(1)>div:nth-of-type(1)>div#navbar>ul:nth-of-type(1)>li.dropdown>div>div>div:nth-of-type(2)>div>span.pull-right>a"));
		SignOut.click();
		
	}

}
