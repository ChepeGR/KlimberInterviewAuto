package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TermAndCondsPage {
    WebDriver driver;

    public TermAndCondsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='cajaTexto cajaTexto-sm']")
    private List<WebElement> termAndConsBoxes;

    @FindBy(xpath = "//div[@class='col-sm-12 cajaTexto']")
    private WebElement totalAmountTermAndCons;

    @FindBy(id = "chkTC")
    private WebElement checkBoxTermAndCons;

    @FindBy(xpath = ".//a[@href='/ar/GroupLife/Step6']")
    private WebElement previusPageTermAndConsButton;
}
