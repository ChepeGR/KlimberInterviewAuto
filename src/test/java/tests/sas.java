package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;

import java.time.Duration;

public class HomePageTest {

        WebDriver driver = new ChromeDriver();
        driver.get("https://purchase-testing.klimber.com/ar/GroupLife/Index");
        //driver.manage().window().maximize();
        HomePage homePage = new HomePage();
        homePage.populateMiniForm( /* XXXX */);
        homePage.dragSliderToTheRightSmall();
        homePage.checkDisabilityCheckbox();
        homePage.checkAccidentCheckbox();
        homePage.checkIllnessCheckbox();
        homePage.triggerSubmit();



}

        /*driver.getTitle();

        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

        WebElement textBox = driver.findElement(By.name("my-text"));
        WebElement submitButton = driver.findElement(By.cssSelector("button"));

        textBox.sendKeys("Selenium");
        submitButton.click();

        WebElement message = driver.findElement(By.id("message"));
        message.getText();

        driver.quit();*/

