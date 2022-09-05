package assignment.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginValidationOrangeHrm {

	public static void main(String[] args) {
		String Path=System.getProperty("user.dir")+"\\Executables\\\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",Path);
		WebDriver wdriver=new ChromeDriver();
		wdriver.get("https://opensource-demo.orangehrmlive.com/");
	    WebElement Username= wdriver.findElement(By.name("username"));
		Username.sendKeys("Admin");
		WebElement Password= wdriver.findElement(By.name("password"));
		Password.sendKeys("admin123");
		WebElement Login= wdriver.findElement(By.tagName("button"));
		Login.click();
	}

}
