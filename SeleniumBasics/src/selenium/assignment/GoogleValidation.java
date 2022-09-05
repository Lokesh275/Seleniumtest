package selenium.assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleValidation {
public static void main(String[]args) {
	String Dir=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", Dir);
	WebDriver drive=new ChromeDriver();
	drive.get("https://www.google.com");
	String ActualUrl=drive.getCurrentUrl();
	System.out.println("Actual URL on Home Page Is  "+ActualUrl);
    System.out.println("Source code Length  "+drive.getPageSource().length());
    drive.close();
}
}
