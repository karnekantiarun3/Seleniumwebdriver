package orgSeleniumwebdriver.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.Element;

public class Dynamicgooglesear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		WebElement text=driver.findElement( By.id("APjFqb"));
		text.sendKeys("testing");
		
		
	List<WebElement>ele=driver.findElements(By.xpath("//div[@id='Alh6id']']"));
	System.out.println(ele.size());
	
		

	}

}
