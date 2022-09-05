package multipleElementHandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookValidation {

	public static void main(String[] args) {
		String chromeExePath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		String HomePageTitle=driver.getTitle();
		System.out.println("Home Page Validation "+HomePageTitle.equals("Facebook – log in or sign up"));
        WebElement CreateAccount=driver.findElement(By.cssSelector("a[class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
        CreateAccount.click();
        WebElement FirstName=driver.findElement(By.name("firstname"));
        FirstName.clear();
        FirstName.sendKeys("Lokesh");
        WebElement Surname=driver.findElement(By.name("lastname"));
       Surname.clear(); 
	   Surname.sendKeys("Mahale");
	}

}
