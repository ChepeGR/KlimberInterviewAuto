package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;
import java.util.List;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Personal data locators

    @FindBy(id = "BirthdayStep1")
    private WebElement birthDateInput;

    @FindBy(className = "dropdown")
    private WebElement accountDropdown;

    @FindBy(id = "select2-province-container")
    private WebElement dropdownProvince;

    @FindBy(id = "txtPhoneCode")
    private WebElement phoneCode;

    @FindBy(id = "txtPhoneNumber")
    private WebElement phoneNumber;

    // Slider locators

    @FindBy(className = "slider-track")
    private WebElement sliderTrack;

    @FindBy(xpath = ".//div[@role='presentation']")
    private List<WebElement> sliderHandler;


    @FindBy(xpath = ".//li[@role='treeitem']")
    private List<WebElement> provinceOptions;

    @FindBy(id = "suma_aseguradatotal")
    private WebElement securedAmmount;

    // Checkboxes area locators

    @FindBy(id = "chkDisability")
    private WebElement checkboxDisability;

    @FindBy(id = "chkIllness")
    private WebElement checkboxIllness;

    @FindBy(id = "chkAccident")
    private WebElement checkboxAccident;

    @FindBy(xpath = "//span[contains(text(), '$') and preceding-sibling::input[@type='checkbox']]")
    private List<WebElement> checkboxesTextsAmount;

    @FindBy(className = "monthlyPrice")
    private WebElement monthlyAmount;

    @FindBy(id = "btnSaveStep1")
    private WebElement submitButton;

    @FindBy(xpath = ".//input[@type='checkbox']")
    private List<WebElement> checkboxes;

    @FindBy(className = "brighttheme-icon-closer")
    private WebElement closeModalVerifyInfo;


    // Getters
    public WebElement getBirthDateInput() {
        return birthDateInput;
    }

    public WebElement getAccountDropdown() {
        return accountDropdown;
    }

    public WebElement getDropdownProvince() {
        return dropdownProvince;
    }

    public WebElement getPhoneCode() {
        return phoneCode;
    }

    public WebElement getPhoneNumber() {
        return phoneNumber;
    }

    public WebElement getSliderTrack() {
        return sliderTrack;
    }

    public WebElement getSecuredAmmount() {
        return securedAmmount;
    }

    public WebElement getCheckboxDisability() {
        return checkboxDisability;
    }

    public WebElement getCheckboxIllness() {
        return checkboxIllness;
    }

    public WebElement getSliderHanler() {
        return sliderHandler.get(1);
    }

    public WebElement getCheckboxAccident() {
        return checkboxAccident;
    }

    public List<WebElement> getCheckboxesTextsAmount() {
        return checkboxesTextsAmount;
    }

    public WebElement getMonthlyAmount() {
        return monthlyAmount;
    }

    public WebElement getSubmitButton() {
        return submitButton;
    }

    public void populateMiniForm(String birthDate, int option, String codePhone, String numberPhone){
        birthDateInput.click();
        birthDateInput.sendKeys(birthDate);
        dropdownProvince.click();
        getProvinceOption(option).click(); //XXXX
        getPhoneCode().click(); //XXXX
        getPhoneCode().sendKeys(codePhone); //XXXX
        birthDateInput.sendKeys(Keys.TAB);
        phoneNumber.sendKeys(numberPhone); //XXXX

    }

    private WebElement getProvinceOption(int option) {
        return provinceOptions.get(option);
    }

    public void moveSlider(){
        sliderTrack.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.not(ExpectedConditions.textToBePresentInElement(securedAmmount, "$ 0")));

    }

    public void clickCheckBoxDisability(){
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys(Keys.SPACE).perform();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.not(ExpectedConditions.textToBePresentInElement(monthlyAmount, "$ 955")));

    }
    public void clickCheckBoxAccident(){
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys(Keys.SPACE).perform();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.not(ExpectedConditions.textToBePresentInElement(monthlyAmount, "$ 1.184")));

    }

    public void clickCheckBoxIllness(){
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys(Keys.SPACE).perform();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Puedes ajustar el tiempo de espera según sea necesario
        wait.until(ExpectedConditions.not(ExpectedConditions.textToBePresentInElement(monthlyAmount, "$ 1.413")));
    }
    public MedicalFormPage clickSubmitButton(){
        closeModalVerifyInfo.click();
        submitButton.click();
        return new MedicalFormPage(driver);
    }


    public void awaitSpinnerDissapear(){
        WebElement element = driver.findElement(By.id("ajaxSpinner"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        wait.until(ExpectedConditions.invisibilityOf(element));

    }

}
