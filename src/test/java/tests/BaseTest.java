package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;

public abstract class BaseTest {
    private WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp() {
        //System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        //driver.get(URL); XXXX

        driver = new ChromeDriver();
        driver.get("https://purchase-testing.klimber.com/ar/GroupLife/Index");
        driver.manage().window().maximize();
        homePage = new HomePage(driver);

    }

//    @AfterClass
//    public void tearDown() {
//        // Cerrar el navegador después de que se hayan ejecutado todas las pruebas
//        if (driver != null) {
//            driver.quit();
//        }
//    }
}