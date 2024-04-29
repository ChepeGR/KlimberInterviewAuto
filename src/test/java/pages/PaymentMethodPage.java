package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentMethodPage {
    WebDriver driver;

    //Personal data locators
    public PaymentMethodPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "CardNumber")
    WebElement cardNumber;

    @FindBy(id = "chkDebAuto")
    WebElement debAutoCheckbox;

    @FindBy(xpath = ".//a[@href='/ar/GroupLife/Step4']")
    private WebElement previusPaymentMethodFormButton;

    @FindBy(id = "btnSubmitStep4")
    WebElement submitPaymentMethodButton;

    public void fillCardNumberInput(String cardNumberId){
        cardNumber.sendKeys(cardNumberId);
    }
    public void submitPaymentNextPage(){
        submitPaymentMethodButton.click();
    }

}
