package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class MedicalFormPage {
    private WebDriver driver;

    public MedicalFormPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy (xpath = ".//input[@name = 'UnderwritingCustom[0].ResponseBool']")
    private  List<WebElement> radiosCheckboxIllness;

    @FindBy (xpath = "//input[@name = 'UnderwritingCustom[1].ResponseBool']")
    private List<WebElement> radiosCheckBoxTreatments;

    @FindBy(id = "txtHeight")
    private WebElement inputHeight;

    @FindBy(id = "txtWeight")
    private WebElement inputWeight;

    @FindBy(className = "form-group")
    private WebElement secondPageTitle;

    @FindBy (xpath = ".//input[@name = 'UnderwritingCustom[2].ResponseBool']")
    private  List<WebElement> radiosCheckBoxCovid;

    @FindBy (xpath = ".//input[@name = 'UnderwritingCustom[3].ResponseBool']")
    private  List<WebElement> radioCheckBoxDisability;

    @FindBy(xpath = ".//a[@href='/ar/GroupLife/Index']")
    private WebElement previusPageMedicalFormButton;

    @FindBy(id = "btnSaveStep2")
    private WebElement nextPageMedicalFormButton;

    public void clickRadioIllnessYes() {
        radiosCheckboxIllness.get(0).click();
    }
    public void clickRadioTreatmentsYes() {
        radiosCheckBoxTreatments.get(0).click();
    }
    public void clickRadioIllnessNo() {
        radiosCheckboxIllness.get(1).click();
    }
    public void clickRadioTreatmentsNo() {
        radiosCheckBoxTreatments.get(1).click();
    }
    public void typeInputHeight(String height) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(inputHeight));
        inputHeight.click();
        inputHeight.sendKeys(height);
    }
    public void typeInputWeight(String weight) {
        inputWeight.click();
        inputWeight.sendKeys(weight);
    }
    public void clickNextPageButton(){
        nextPageMedicalFormButton.click();
    }
    public void clickRadioCovidNo() {
        radiosCheckBoxCovid.get(1).click();
    }
    public void clickRadioCovidYes(){
        radiosCheckBoxCovid.get(0).click();
    }

    public void awaitSpinnerDissapear(){
        WebElement element = driver.findElement(By.id("ajaxSpinner"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        wait.until(ExpectedConditions.invisibilityOf(element));

    }
    public void nextPageIsPresent(){
        WebElement element =driver.findElement(By.id("divPageContainer"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        wait.until(ExpectedConditions.visibilityOf(element));
        Assert.assertTrue(element.isDisplayed());
    }
    public void secondTitleMedicalPage(){
        Assert.assertTrue(secondPageTitle.isDisplayed());
    }


}
