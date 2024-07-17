package orgSeleniumwebdriver.com;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDom2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://dev.automationtesting.in/shadow-dom");
		
		
		//using Javascriptexeceutor
		
		/*
		 * WebElement shadowhost = driver.findElement(By.id("shadow-root"));
		 * Thread.sleep(1000); JavascriptExecutor js=(JavascriptExecutor)driver;
		 * SearchContext shadowRoot = (SearchContext)
		 * js.executeScript("return arguments[0].shadowRoot",shadowhost); WebElement
		 * shadowelement= shadowRoot.findElement(By.cssSelector("#shadow-element"));
		 * System.out.println(shadowelement.getText());
		 */
		
		//using getShadowroot method
		 
		  WebElement shadowhost = driver.findElement(By.id("shadow-root"));
		     SearchContext shadowRoot= shadowhost.getShadowRoot();
		   WebElement shadowelement  =shadowRoot.findElement(By.cssSelector("#shadow-element"));
		   System.out.println(shadowelement.getText());
	}

}
