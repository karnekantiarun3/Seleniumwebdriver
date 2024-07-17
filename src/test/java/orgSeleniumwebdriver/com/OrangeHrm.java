package orgSeleniumwebdriver.com;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrm {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		WebDriver driver;
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.orangehrm.com/es/orangehrm-30-day-trial/");
		
		driver.findElement(By.id("Form_getForm_subdomain")).sendKeys("NaveenTTAuto");
		driver.findElement(By.id("Form_getForm_Name")).sendKeys("Naveen");
driver.findElement(By.id("Form_getForm_Email")).sendKeys("Naveen@gmail.com");
driver.findElement(By.id("Form_getForm_Contact")).sendKeys("9898989898");
driver.findElement(By.id("Form_getForm_Country")).sendKeys("India");
driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='reCAPTHA']")));
Thread.sleep(5000);
driver.findElement(By.cssSelector(".recaptcha-checkbox-border")).click();
driver.switchTo().defaultContent();
driver.findElement(By.id("Form_getForm_action_submitForm")).click();


	}




	



		

	}


