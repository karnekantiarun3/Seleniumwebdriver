package orgSeleniumwebdriver.com;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import dev.failsafe.internal.util.Assert;

public class LambdaTestCloud {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		ChromeOptions browserOptions = new ChromeOptions();
		browserOptions.setPlatformName("Windows 10");
		browserOptions.setBrowserVersion("125");
		HashMap<String, Object> ltOptions = new HashMap<String, Object>();
		ltOptions.put("username", "karnekanti.arun3");
		ltOptions.put("accessKey", "Y60YWV3rsx6z3xdFMap2ExAHDDjUm3zrjsCD75lbMBexBIYUzK");
		ltOptions.put("resolution", "1024x768");
		ltOptions.put("build", "Lamdacloud");
		ltOptions.put("project", "Lamdatestselenium");
		ltOptions.put("selenium_version", "4.21.0");
		ltOptions.put("w3c", true);
		browserOptions.setCapability("LT:Options", ltOptions);
		
		
		
		
		WebDriver driver=new RemoteWebDriver(new URL("https://hub.lamdatest.com/wd/hub"),browserOptions);
		driver.get("https://www.google.com");
	System.out.println(driver.getTitle());
driver.quit();
}
}
