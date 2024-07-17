package orgSeleniumwebdriver.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		driver=new ChromeDriver();
		String url="https://www.saucedemo.com/";
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(url);
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
				
		driver.findElement(By.id("password")).sendKeys("secret_sauce"+Keys.ENTER);
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		
		List<WebElement>options=driver.findElements(By.xpath("//div[@class=\"inventory_container\"]"));
		options.size();
		for(WebElement ele:options) {
			System.out.println(ele.getText());
			if(ele.getText().equals("Sauce Labs Bolt T-Shirt")) {
				ele.click();
				break;
			}
			
		}
WebElement maxprice=  driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket"));
	    maxprice.click();
	    WebElement minprice=driver.findElement(By.id("add-to-cart-sauce-labs-bike-light"));
	    minprice.click();
	    
	}
}
	       