package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AdditionalInfoForm {
    WebDriver driver;

    public AdditionalInfoForm(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "select2-Nationality-container")
    private WebElement selectNationalityDropdown;

    @FindBy(className = "select2-results__option")
    private List <WebElement> selectNationalityResult;

    @FindBy(id = "PlaceOfBirth")
    private WebElement placeOfBirthInput;

    @FindBy (xpath = ".//input[@name = 'HasCitizenship']")
    private List<WebElement> booleanHasCitizen;

    @FindBy(id = "txtOccupation")
    private WebElement occupationInput;

    @FindBy(id = "txtSalaryAnual")
    private WebElement salaryAnualInput;

    @FindBy(id = "txtFullName")
    private WebElement spouseNameInput;

    @FindBy(id = "txtNumberId")
    private WebElement numberIdSpuseInput;

    @FindBy(id = "select2-txtAnnualIncome-container")
    private WebElement annualIncomeCheckBox;

    @FindBy(className = "select2-results__option")
    private List<WebElement> selectPaymentOriginDropdown;

    @FindBy(xpath = ".//a[@href='/ar/GroupLife/Step3']")
    private WebElement previusPageAdditionalInfoFormButton;

    @FindBy(id = "btnSaveInfo")
    private WebElement nextPageAdditionalInfoButton;

    public void selectNationalityDropdown(){
        selectNationalityDropdown.click();
        selectNationalityResult.get(1).click();
    }
    public void fillPlaceOfBirthInput(String placeOfBirth){
        placeOfBirthInput.click();
        placeOfBirthInput.sendKeys(placeOfBirth);
    }
    public void fillOccupationInput(String occupation){
        occupationInput.click();
        occupationInput.sendKeys(occupation);
    }
    public void fillSalaryAnualInput(String salaryAnual){
        salaryAnualInput.click();
        salaryAnualInput.sendKeys(salaryAnual);
    }
    public void fillSpouseNameInput(String spouseName){
        spouseNameInput.click();
        spouseNameInput.sendKeys(spouseName);
    }
    public void fillNumberIdSpuseInput(String numberIdSpuse){
        numberIdSpuseInput.click();
        numberIdSpuseInput.sendKeys(numberIdSpuse);
    }
    public void selectPaymentOrigin(){
        annualIncomeCheckBox.click();
        selectPaymentOriginDropdown.get(1).click();
    }
    public void nextPageButtonAddInfo(){
        nextPageAdditionalInfoButton.click();
    }




}
