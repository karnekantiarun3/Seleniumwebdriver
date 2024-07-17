package orgSeleniumwebdriver.com;



import java.net.MalformedURLException;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.appium.java_client.windows.WindowsDriver;

public class NotepadTest 
{
	public static WindowsDriver driver;
	
	@BeforeMethod
	public void setup() throws MalformedURLException {
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("app", "C:\\Windows\\System32\\notepad.exe");
		cap.setCapability("platform", "Windows");
		cap.setCapability("device", "Windows10");
		try {
			
		
		driver=new WindowsDriver(new URL("http://127.0.0.1:4723"),cap);
		}catch (MalformedURLException e) {
			e.printStackTrace();
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		}
	@AfterMethod
	public void cleanup() {
		driver.quit();
		
	}
	
	
	@Test
	public void helptest() {
		driver.findElement(By.name("About Notepad")).click();
	}
	
	
	}



