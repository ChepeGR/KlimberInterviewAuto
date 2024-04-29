package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class PersonalFormPage {
    WebDriver driver;

    public PersonalFormPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "Name")
    private WebElement nameInput;

    @FindBy(id = "Surname")
    private WebElement surnameInput;

    @FindBy(id = "Birthday")
    private WebElement birthdayInput;

    @FindBy(id = "ID_Number")
    private WebElement idNumberInput;

    @FindBy(id = "select2-Gender-container")
    private WebElement birthGenderDropdown;

    @FindBy(id = "select2-IdentificationGenderType-container")
    private WebElement selectGenderDropdown;

    @FindBy(css = "#select2-Gender-results > li")
    private List<WebElement> genderResult;

    @FindBy(id = "select2-Gender-result-67e7-1")
    private WebElement sexFirstOptionId;    //Doesnt work

    @FindBy(id = "select2-CivilStatus-container")
    private WebElement civilStatusDropdown;

    @FindBy(className = "select2-results__option")
    private List <WebElement> civilStatusSingleDropdown;

    @FindBy(id = "txtEmail")
    private WebElement emailInput;

    @FindBy(id = "Password")
    private WebElement passwordInput;

    @FindBy(id = "select2-city-container")
    private WebElement cityInput;


    @FindBy(id = "Street")
    private WebElement streetInput;

    @FindBy(id = "HouseNumber")
    private WebElement houseNumberInput;

    @FindBy(id = "Floor")
    private WebElement floorNumberInput;

    @FindBy(id = "Apartment")
    private WebElement apartmentInput;

    @FindBy(id = "zipCode")
    private WebElement zipCodeInput;

    @FindBy(id = "select2-city-container")
    private WebElement cityDropdown;

    @FindBy(id = "select2-country-container")
    private WebElement countryDropdown;

    @FindBy(xpath = ".//a[@href='/ar/GroupLife/Step2']")
    private WebElement previusPagePersonalFormButton;

    @FindBy(id = "btnRegister")
    private WebElement nextPagePersonalFormButton;

    public void nameInputWrite(String name){
        nameInput.click();
        nameInput.sendKeys(name);
    }
    public void surnameInputWrite(String surname){
        surnameInput.click();
        surnameInput.sendKeys(surname);
    }
    public void idInputWrite(String idNumber){
        idNumberInput.click();
        idNumberInput.sendKeys(idNumber);
    }
    public void selectBirthGender(){
        birthGenderDropdown.click();
        genderResult.get(1).click();

    }
    public void selectCivilStatus(){
        civilStatusDropdown.click();
        civilStatusSingleDropdown.get(1).click();
    }
    public void writeEmailInput(String email){
        emailInput.click();
        emailInput.sendKeys(email);
    }
    public void passwordInputWrite(String password){
        passwordInput.click();
        passwordInput.sendKeys(password);
    }
    public void fillStreetInput(String street){
        streetInput.click();
        streetInput.sendKeys(street);
    }
    public void houseNumberInputWrite(String houseNumber){
        houseNumberInput.click();
        houseNumberInput.sendKeys(houseNumber);
    }
    public void fillFloorNumberInput(String floorNumber){
        floorNumberInput.click();
        floorNumberInput.sendKeys(floorNumber);
    }
    public void fillApartmentInput(String apartmentId){
        apartmentInput.click();
        apartmentInput.sendKeys(apartmentId);
    }
    public void fillZipCodeInput(String zipCode){
        zipCodeInput.click();
        zipCodeInput.sendKeys(zipCode);
    }
    public void clickNextPageButton(){
        String actualZipCodeValue = cityInput.getAttribute("title");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.attributeContains(cityInput, "title", "Barrio Emir Ramon Juarez"));
        nextPagePersonalFormButton.click();
    }
    public void previusPageButton(){
        Assert.assertTrue(previusPagePersonalFormButton.isDisplayed());
    }
}
