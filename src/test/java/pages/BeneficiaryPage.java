package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class BeneficiaryPage {
    WebDriver driver;

    public BeneficiaryPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "btnAddBeneficiaryNatural")
    private WebElement addBeneficiaryPersonButton;

    @FindBy(id = "btnAddBeneficiaryLegal")
    private WebElement addBeneficiaryOrgButton;

    @FindBy(xpath = ".//input[@name='Beneficiaries[0].Name']")
    private WebElement addBeneficiaryPersonInfoName;

    @FindBy(xpath = ".//input[@name='Beneficiaries[0].Surname']")
    private WebElement addBeneficiaryPersonInfoSurname;

    @FindBy(xpath = ".//input[@name='Beneficiaries[0].IdNumber']")
    private WebElement addBeneficiaryPersonInfoIdNumber;

    @FindBy(xpath = ".//input[@name='Beneficiaries[0].DateDay']")
    private WebElement beneficiaryPersonInfoDateDay;

    @FindBy(xpath = ".//input[@name='Beneficiaries[0].DateMonth']")
    private WebElement beneficiaryPersonInfoDateMonth;

    @FindBy(xpath = ".//input[@name='Beneficiaries[0].DateYear']")
    private WebElement beneficiaryPersonInfoDateYear;

    @FindBy(className = "form-control")
    private WebElement beneficiaryPersonInfoForm;

    @FindBy(xpath = ".//input[@name:'Beneficiaries[0].BeneficiaryPercentage']")
    private WebElement beneficiaryPersonInfoPercentage;

    @FindBy(xpath = ".//span[@title='Eliminar']")
    private WebElement beneficiaryPersonInfoEliminated;

    @FindBy(xpath = ".//input[@name='Beneficiaries[1].Name']")
    private WebElement beneficiaryPersonInfoSSN;

    @FindBy(xpath = ".//input[@name='Beneficiaries[1].TaxId']")
    private WebElement beneficiaryPersonInfoTaxId;

    @FindBy(xpath = ".//input[@name='Beneficiaries[1].BeneficiaryOrder']")
    private WebElement beneficiaryPersonInfoBeneficiaryOrder;

    @FindBy(xpath = ".//input[@name='Beneficiaries[1].BeneficiaryPercentage']")
    private WebElement beneficiaryPersonInfoPercentageBeneficiaryPercentage;

    @FindBy(xpath = ".//button[@type='submit']")
    private WebElement beneficiaryPersonInfoSubmit;

    public void clickSubmitBeneficiaryButton() {
        beneficiaryPersonInfoSubmit.click();
    }
    public void addBeneficiaryPerson(){
        Assert.assertTrue(addBeneficiaryPersonButton.isDisplayed());
    }







}
