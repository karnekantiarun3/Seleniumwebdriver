package SingleTonDesignpattern;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Seleniumwithsingleton.Webdrivermanager;
public class APPTEST {
    private WebDriver driver;

    @BeforeClass
    @Parameters("browser")
    public void setUp(String browser) {
    	driver = Webdrivermanager.getInstance(browser).getDriver();
    }

    @Test
    public void testGoogle() {
        driver.get("https://www.google.com");
        System.out.println(Thread.currentThread().getName() + ": " + driver.getTitle());
        Assert.assertEquals(driver.getTitle(), "Google");
    }

    @AfterClass
    @Parameters("browser")
    public void tearDown() {

    	Webdrivermanager.quitBrowser();
    }
}