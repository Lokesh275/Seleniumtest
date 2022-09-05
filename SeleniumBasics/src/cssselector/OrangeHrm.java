package cssselector;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class OrangeHrm {
	public static void main(String[] args) {
		String chromeExePath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebElement UserName=driver.findElement(By.name("username"));
		UserName.sendKeys("Admin");
		WebElement Password=driver.findElement(By.name("password"));
		Password.sendKeys("admin123");
		WebElement LoginButton=driver.findElement(By.cssSelector("html>body>div>div>div>div>div>div:nth-of-type(2)>div:nth-of-type(2)>form>div:nth-of-type(3)>button"));
		LoginButton.click();
		WebElement Profile=driver.findElement(By.cssSelector("html>body>div>div>div>header>div>div:nth-of-type(2)>ul>li>span>i"));
		Profile.click();
		WebElement LogOut=driver.findElement(By.cssSelector("html>body>div>div>div>header>div>div:nth-of-type(2)>ul>li>ul>li:nth-of-type(4)>a"));
		LogOut.click();		
	}
}
