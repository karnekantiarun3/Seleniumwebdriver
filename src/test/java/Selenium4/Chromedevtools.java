package Selenium4;

import java.util.Optional;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v109.network.Network;
import org.openqa.selenium.devtools.v109.network.model.ConnectionType;
import org.testng.annotations.Test;

public class Chromedevtools {
	WebDriver driver;
	@Test(priority=1,description="enablenetworkoffline")
		
	

	public void enablenetworkoffline() {
		driver=new ChromeDriver();
		DevTools devtools=((ChromiumDriver) driver).getDevTools();
		devtools.createSession();
		devtools.send(org.openqa.selenium.devtools.idealized.Network.enable(Optional.of(10000),Optional.empty(),Optional.empty()));
		
		devtools.send(org.openqa.selenium.devtools.v113.network.Network.emulateNetworkConditions(true, 100, 200, 1000, Optional.of(org.openqa.selenium.mobile.NetworkConnection.ConnectionType.WIFI)));
		devtools.addListener(null, null);
		driver.get("https://www.google.com");
		
		
	}
}
