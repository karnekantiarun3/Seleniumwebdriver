import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamicgooglesearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.get("https://google.com");

WebElement text=driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
text.sendKeys("testing");
	}

}
