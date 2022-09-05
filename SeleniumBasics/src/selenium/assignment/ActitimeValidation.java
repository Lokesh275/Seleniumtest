package selenium.assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeValidation {

	public static void main(String[] args) {
		String currentWorkingDir=System.getProperty("user.dir")+"\\Executables\\\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",currentWorkingDir);
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		String ActualTitle=driver.getTitle();
		int TitleLength=ActualTitle.length();
		System.out.println("Page Title Name is "+ActualTitle);
		System.out.println("Page Title Lenght Is "+TitleLength);
		String ActualUrl=driver.getCurrentUrl();
		String ExpectedUrl="https://demo.actitime.com/";
		System.out.println("URL validation  "+ActualUrl.equals(ExpectedUrl));
		int PageSourceLength=driver.getPageSource().length();
		System.out.println("Source Code length  "+PageSourceLength);
		driver.close();
	}

}
