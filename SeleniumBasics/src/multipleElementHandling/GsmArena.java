package multipleElementHandling;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GsmArena {

	public static void main(String[] args) throws InterruptedException {
		String chromeExePath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.get("https://www.gsmarena.com/");
		Thread.sleep(2000);
		String CurrentUrl=driver.getCurrentUrl();
		System.out.println(" Validation Of Home Page On basis of current URL"+CurrentUrl.equals("https://www.gsmarena.com/"));
		List<WebElement> ListofPhone=driver.findElements(By.cssSelector("div[class='brandmenu-v2 light l-box clearfix']>ul>li"));
		System.out.println("Total Number Of Phone Availabe at Phone Finder "+ListofPhone.size());
		for(int i=0;i<ListofPhone.size();i++)
		{
			WebElement PhoneName=ListofPhone.get(i);
			System.out.println(PhoneName.getText());
		}
	}

}
