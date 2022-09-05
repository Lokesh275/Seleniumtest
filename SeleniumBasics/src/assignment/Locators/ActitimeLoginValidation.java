package assignment.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeLoginValidation {

	public static void main(String[] args) {
		String Path=System.getProperty("user.dir")+"\\Executables\\\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",Path);
		WebDriver wdriver=new ChromeDriver();
		wdriver.get("https://demo.actitime.com/login.do");
	    WebElement Username= wdriver.findElement(By.name("username"));
		Username.sendKeys("admin");
		WebElement Password= wdriver.findElement(By.name("pwd"));
		Password.sendKeys("manager");
		WebElement Login= wdriver.findElement(By.id("loginButton"));
		Login.click();
		
	}

}
