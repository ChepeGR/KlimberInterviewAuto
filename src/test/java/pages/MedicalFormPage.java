package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MedicalFormPage {
    WebDriver driver;

    //driver.get("https://purchase-testing.klimber.com/ar/GroupLife/Index");

    //Personal data locators
    public MedicalFormPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy (xpath = ".//input[@value = 'false'] and following")
    private WebElement checkBoxTreatmentsNo;

    @FindBy (xpath = "//input[@value = ' Sí']")
    private WebElement checkBoxTreatmentsSi;


}
