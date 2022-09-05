package assignment.waitnvalidations;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumValidation {

	public static void main(String[] args) throws InterruptedException {
		String chromeExePath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		//setting the path for driver executable
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		//creating an instance of Chrome browser and up-casting it to WebDriver interface
		WebDriver driver=new ChromeDriver();
		//to enter required application URL use get() of WebDriver interface
		driver.get("https://demo.actitime.com");
		
		//define implicit wait for browser
 	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				
		//identify username field
		WebElement userNameInputField=driver.findElement(By.id("username"));
		System.out.println("User name is displayed or not? "+userNameInputField.isDisplayed());
		System.out.println("User name is functional or not? "+userNameInputField.isEnabled());
		
		String defaultValueInUserNameInputField=userNameInputField.getAttribute("placeholder");
		System.out.println("Default value of user name input field: "+defaultValueInUserNameInputField);
		System.out.println("Default value validation for user name input field status: "+defaultValueInUserNameInputField.equals("Username"));
		
		WebElement passwordField=driver.findElement(By.name("pwd"));
		System.out.println("Value of password field"+passwordField.isDisplayed());
		System.out.println("validation of password"+passwordField.isEnabled());
		System.out.println(" Attributes"+passwordField.getAttribute("placeholder"));
		System.out.println("Validation"+passwordField.getAttribute("placeholder").equals("Password"));
		
		WebElement keepLoggedInLabelCheckBoxText=driver.findElement(By.id("keepLoggedInLabel"));
		System.out.println(keepLoggedInLabelCheckBoxText.isDisplayed());
		System.out.println(keepLoggedInLabelCheckBoxText.isEnabled());
		String checkBoxTextName=keepLoggedInLabelCheckBoxText.getText();
		System.out.println(checkBoxTextName);
		
		WebElement LoginButton=driver.findElement(By.id("loginButton"));
		System.out.println("Login Button Display"+LoginButton.isDisplayed());
		System.out.println("Login Button Enabled "+LoginButton.isEnabled());
		System.out.println("Text Visiblity  "+LoginButton.getText());
		userNameInputField.sendKeys("admin");
		passwordField.sendKeys("manager");
		LoginButton.click();
		Thread.sleep(2000);
		WebElement LogOut=driver.findElement(By.id("logoutLink")); 
		LogOut.click();
		
	}
}