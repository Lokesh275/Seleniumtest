package multipleElementHandling;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GsmarenaSamsung {

	public static void main(String[] args) throws InterruptedException {
		//div.makers>ul>li>a>strong
		String chromeExePath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.get("https://www.gsmarena.com/");
		Thread.sleep(2000);
		String CurrentUrl=driver.getCurrentUrl();
		System.out.println(" Validation Of Home Page On basis of current URL"+CurrentUrl.equals("https://www.gsmarena.com/"));
		WebElement Samsung=driver.findElement(By.cssSelector("div[class='brandmenu-v2 light l-box clearfix'] li:nth-of-type(1)>a"));
		Samsung.click();
		Thread.sleep(1000);
		List<WebElement> SamsungPage1=driver.findElements(By.cssSelector("div.makers ul>li>a>strong>span"));
		int a=SamsungPage1.size();
		System.out.println("No of devices on Page 1 "+a);
		WebElement Page2=driver.findElement(By.cssSelector("div[class='main right main-maker l-box col']>div>div>a"));
		Page2.click();
		Thread.sleep(1000);
	    List<WebElement> SamsungPage2=driver.findElements(By.cssSelector("div.makers ul>li>a>strong>span"));
	    int b=SamsungPage2.size();     
	    System.out.println(" No of Devices on Page 2 "+b);
        int Total=a+b;
	System.out.println(" Total Devices "+Total);
	for(int i=0;i<SamsungPage1.size();i++)
	{
		WebElement PhoneName2=SamsungPage2.get(i);
		System.out.println(PhoneName2.getText());
	}
	
	
	/* int i=0,j=0;
	if(i<=85) {
		System.out.println(SamsungPage1.get(i).getText());
	}
	else if(j<=85) {
		System.out.println(SamsungPage2.get(j).getText());
	}*/
		
	}
	}

