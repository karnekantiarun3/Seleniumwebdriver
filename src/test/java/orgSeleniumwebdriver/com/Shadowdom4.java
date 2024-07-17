package orgSeleniumwebdriver.com;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shadowdom4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://watir.com/examples/shadow_dom.html");
		SearchContext shadow0=driver.findElement(By.cssSelector("#shadow_content")).getShadowRoot();
		Thread.sleep(5000);
		SearchContext shadow1=shadow0.findElement(By.cssSelector("#nested_shadow_host")).getShadowRoot();
		Thread.sleep(5000);
		shadow1.findElement(By.cssSelector("input[type='text']")).sendKeys("selenium");
	}

}
