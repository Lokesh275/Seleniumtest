package assignment.waitnvalidations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeLogout {

	public static void main(String[] args) throws InterruptedException  {
		String chromeExePath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com");
		driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
		WebElement UserName=driver.findElement(By.name("username"));
		UserName.sendKeys("admin");
		WebElement PassWord=driver.findElement(By.name("pwd"));
		PassWord.sendKeys("manager");
		WebElement LoginButton=driver.findElement(By.id("loginButton"));
		LoginButton.click();
		Thread.sleep(2000);
		String HomePageTitle=driver.getTitle();
		System.out.println(" Actual HomePage Title "+HomePageTitle);
		System.out.println("HomePage Validation "+HomePageTitle.equals("actiTIME - Enter Time-Track"));
		WebElement LogOutButton=driver.findElement(By.id("logoutLink"));
		LogOutButton.click();
		String Title=driver.getTitle();
		System.out.println("Validation Of Title is  "+Title.equals("actiTIME - Login"));
	}
}
