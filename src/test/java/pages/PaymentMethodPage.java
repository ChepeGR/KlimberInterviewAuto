package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class PaymentMethodPage {
    WebDriver driver;

    public PaymentMethodPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "CardNumber")
    private WebElement cardNumber;

    @FindBy(id = "chkDebAuto")
    private WebElement debAutoCheckbox;

    @FindBy(xpath = ".//a[@href='/ar/GroupLife/Step4']")
    private WebElement previusPaymentMethodFormButton;

    @FindBy(id = "btnSubmitStep4")
    private WebElement submitPaymentMethodButton;

    public void fillCardNumberInput(String cardNumberId){
        cardNumber.sendKeys(cardNumberId);
    }
    public void submitPaymentNextPage(){
        submitPaymentMethodButton.click();
    }
    public void deboAuotCheckBoxMethod(){
        Assert.assertTrue(debAutoCheckbox.isSelected());
    }
}
