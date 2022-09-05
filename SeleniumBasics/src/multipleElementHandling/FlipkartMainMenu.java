package multipleElementHandling;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartMainMenu {

	public static void main(String[] args) throws InterruptedException {
		String chromeExePath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		WebElement PopUpClose=driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']"));
		PopUpClose.click();
		Thread.sleep(2000);
		List<WebElement> MenuList=driver.findElements(By.cssSelector("html>body div:nth-of-type(2) div[class='xtXmba']"));
		System.out.println("Total Number Of Menu  "+MenuList.size());
		for(int i=0;i<MenuList.size();i++) {
			WebElement element=MenuList.get(i);
			System.out.println(element.getText());
	}
	}
}