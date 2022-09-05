package selenium.assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookValidation {

	public static void main(String[] args) {
		String Path=System.getProperty("user.dir")+"\\Executables\\\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", Path);
		WebDriver driver1=new ChromeDriver();
		driver1.get("https://www.facebook.com");
		String ActualTitle=driver1.getTitle();
		String ExpectedTitle="Facebook – log in or sign up";
		System.out.println(" Verify Title of Homepage "+ActualTitle.equals(ExpectedTitle));
		System.out.println("Home Page Title Is   "+ActualTitle);
		driver1.close();
	}

}
