package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TermsAndCondsPage {
    WebDriver driver;

    public TermsAndCondsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='cajaTexto cajaTexto-sm']")
    private List<WebElement> termsAndConsBoxes;

    @FindBy(xpath = "//div[@class='col-sm-12 cajaTexto']")
    private WebElement totalAmountTermsAndCons;

    @FindBy(id = "chkTC")
    private WebElement checkBoxTermsAndCons;

    @FindBy(xpath = ".//a[@href='/ar/GroupLife/Step6']")
    private WebElement previusPageTermsAndConsButton;

    @FindBy(id = "btnSummarySubmit")
    private WebElement submitTermsAndConsButton;
}
