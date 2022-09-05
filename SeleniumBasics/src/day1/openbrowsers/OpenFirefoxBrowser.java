package day1.openbrowsers;

import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefoxBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","F:\\Acceleration\\workspace\\SeleniumBasics\\Executables\\geckodriver.exe\\");
		FirefoxDriver fdrive=new FirefoxDriver();
		fdrive.get("https://www.google.com");
		

	}

}
