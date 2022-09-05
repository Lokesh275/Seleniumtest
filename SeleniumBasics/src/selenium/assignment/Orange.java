package selenium.assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Orange {

	public static void main(String[] args) {
		//Step1: Using WebDriverManager setUp the required browser executable file
				WebDriverManager.firefoxdriver().setup();
				// step2: create an instance of Chrome Browser
				WebDriver driver = new FirefoxDriver();
				
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.manage().window().maximize();
				//to enter required application URL use get() of WebDriver interface
				driver.get("https://demo.actitime.com");
	}

}
