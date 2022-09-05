package multipleElementHandling;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CricinfoMenu {

	public static void main(String[] args) throws InterruptedException {
		String chromeExePath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.get("https://www.espncricinfo.com/");
		Thread.sleep(2000);
		String CurrentUrl=driver.getCurrentUrl();
		System.out.println("Home Page Validation On basis of Url     = "+CurrentUrl.equals("https://www.espncricinfo.com/"));
		List<WebElement> Menu=driver.findElements(By.cssSelector("section div>div>div>div>div>div>span>span"));
		System.out.println("Total Count Of Main Menu  "+Menu.size());
		for(int i=0;i<Menu.size();i++) {
			WebElement elemt=Menu.get(i);
			System.out.println(elemt.getText());
	}
	}
}