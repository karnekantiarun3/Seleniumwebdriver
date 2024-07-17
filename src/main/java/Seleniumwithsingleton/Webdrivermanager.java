package Seleniumwithsingleton;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Webdrivermanager {

	private static volatile Webdrivermanager instance;
	private static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();

	private Webdrivermanager() {
	}

	private void initDriver(String browser) {
		switch (browser) {
		case "chrome":
			tlDriver.set(new ChromeDriver());
			break;
		case "firefox":
			tlDriver.set(new FirefoxDriver());
			break;
		case "edge":
			tlDriver.set(new EdgeDriver());
			break;

		default:
			throw new IllegalArgumentException("Unsupported browser: " + browser);
		}
	}

	public static Webdrivermanager getInstance(String browser) {
		if(instance == null) {
			synchronized (Webdrivermanager.class) {
				if(instance == null) {
					instance = new Webdrivermanager();
				}
			}
		}
		
		if(tlDriver.get() == null) {
			instance.initDriver(browser);
		}
		
		return instance;
	}
	
	public WebDriver getDriver() {
		return tlDriver.get();
	}
	

	public static void quitBrowser() {
		if(tlDriver.get() != null) {
			tlDriver.get().quit();
			tlDriver.remove();
		}
	}
	
	
	
}



