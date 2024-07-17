package orgSeleniumwebdriver.com;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SVGelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
WebElement username=		driver.findElement(By.name("username"));
username.sendKeys("Admin");
WebElement password=driver.findElement(By.name("password"));
password.sendKeys("admin123");

driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();


/*   
 * driver.findElement(By.xpath("//span[normalize-space()='Recruitment']")).click  //using text method for svg elemenets
 * ();
 */
/*
 * driver.findElement(By.//button[@title='timesheets']//*[name()='svg'
 * xpath("//a[@class='oxd-main-menu-item active']//*[name()='svg']")).click();
 
 */
/*
 * driver.findElement(By.xpath("//button[@title='Timesheets']//*[name()='svg']")
 * ).click();
 */
driver.findElement(By.xpath("//*[name()='svg']//*[name()='path' and contains(@d,'M437,268.1')]")).click();
 
}
}
