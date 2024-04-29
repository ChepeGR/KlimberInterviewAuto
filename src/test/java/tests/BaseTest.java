package tests;

import helpers.ConfigPropiertiesHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import pages.HomePage;

public abstract class BaseTest {
    protected WebDriver driver;
    protected HomePage homePage;

    @BeforeSuite
    public void setUp() {
        //System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        String url = ConfigPropiertiesHelper.getPropertyConfig("url");
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
    }

    @AfterSuite
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}