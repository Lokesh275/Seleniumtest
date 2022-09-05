package cssselector;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLocators {

	public static void main(String[] args) throws InterruptedException {
		String chromeExePath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/gp/product/B08444S68L/ref=s9_acss_bw_cg_Budget_3c1_w?pf_rd_m=A1K21FY43GMZF8&pf_rd_s=merchandised-search-16&pf_rd_r=2T5QD3NMZPX9B55TMDKM&pf_rd_t=101&pf_rd_p=8b04d26d-599b-4893-b1c8-fae62e9b9b89&pf_rd_i=1389401031&th=1");
	    driver.manage().window().maximize();
		//Thread.sleep(4000);
		//WebElement WishList=driver.findElement(By.cssSelector("a[title='Add to Wish List']"));
	    //WishList.click();
	    Thread.sleep(4000);
	    driver.navigate().to("https://www.amazon.in/gp/product/B08444S68L/ref=s9_acss_bw_cg_Budget_3c1_w?pf_rd_m=A1K21FY43GMZF8&pf_rd_s=merchandised-search-16&pf_rd_r=2T5QD3NMZPX9B55TMDKM&pf_rd_t=101&pf_rd_p=8b04d26d-599b-4893-b1c8-fae62e9b9b89&pf_rd_i=1389401031&th=1");
        WebElement AddToCart=driver.findElement(By.cssSelector("html span[class='a-button a-spacing-small a-button-primary a-button-icon']>span>input"));	
	    AddToCart.click();
	    
	    WebElement ClickCart=driver.findElement(By.cssSelector("#attach-sidesheet-checkout-button-announce"));
	    ClickCart.click();
	    System.out.println("Lokesh");
	    WebElement ProceedToBuy=driver.findElement(By.cssSelector("input[name='proceedToRetailCheckout']"));
	    ProceedToBuy.click();
	    //div:nth-of-type(3)>span>span>input[class='a-button-input
	
	
	
	}

}
