package orgSeleniumwebdriver.com;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Assert;

public class Shadoedom3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://watir.com/examples/shadow_dom.html");
		WebElement shadowHost = driver.findElement(By.cssSelector("#shadow_host"));
	    SearchContext shadowRoot = shadowHost.getShadowRoot();
	    WebElement shadowContent = shadowRoot.findElement(By.cssSelector("#shadow_content"));

	    org.testng.Assert.assertEquals("some text", shadowContent.getText());
	System.out.println(shadowContent.getText());
	
}
}
