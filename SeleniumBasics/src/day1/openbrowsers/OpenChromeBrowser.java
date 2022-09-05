package day1.openbrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeBrowser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Acceleration\\workspace\\SeleniumBasics\\Executables\\chromedriver.exe\\");
		WebDriver cdriver=new ChromeDriver();
		cdriver.get("https://www.google.com");
		
		
	}

}
