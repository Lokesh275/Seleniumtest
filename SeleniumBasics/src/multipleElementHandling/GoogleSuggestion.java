package multipleElementHandling;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSuggestion {

	public static void main(String[] args) throws InterruptedException {
		String chromeExePath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
driver.findElement(By.name("q")).sendKeys("selenium interview questions");
		
		Thread.sleep(2000);
		//get all the suggestions
		List<WebElement> sugg=driver.findElements(By.cssSelector("ul>li>div>div>div>span"));
		//suggestion count                                  //ul>li>div>div>div>span
		System.out.println("Suggestion count:" +sugg.size());
		//print suggestions in the console
		for(int i=0;i<sugg.size();i++) {
			WebElement element=sugg.get(i);
			System.out.println(element.getText());
							//or
			//System.out.println(sugg.get(i).getText());
		}
	}

	}

