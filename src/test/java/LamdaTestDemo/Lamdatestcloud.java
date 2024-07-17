package LamdaTestDemo;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class Lamdatestcloud {

	@Test
	public void login() throws MalformedURLException {
		

		

		

				ChromeOptions browserOptions = new ChromeOptions();
				browserOptions.setPlatformName("Windows 10");
				browserOptions.setBrowserVersion("126.0.6478.116 ");
				HashMap<String, Object> ltOptions = new HashMap<String, Object>();
				ltOptions.put("username", "karnekanti.arun3@gmail.com");
				ltOptions.put("accessKey", "WGwz6y8J6GFIyZ11DPmkXyNNR02oEKng1GxAvUq6cT0JmX870y");
				ltOptions.put("resolution", "1024x768");
				ltOptions.put("build", "Lamdacloud");
				ltOptions.put("project", "Lamdatestselenium");
				ltOptions.put("selenium_version", "4.21.0");
				ltOptions.put("w3c", true);
				browserOptions.setCapability("LT:Options", ltOptions);
				
				
				
				
				WebDriver driver=new RemoteWebDriver(new URL("https://hub.lambdatest.com/wd/hub"),browserOptions);
				driver.get("https://www.google.com");
				Assert.assertTrue(driver.getTitle().contains("Google"));
			System.out.println(driver.getTitle());
		driver.quit();
		}
		


	}


