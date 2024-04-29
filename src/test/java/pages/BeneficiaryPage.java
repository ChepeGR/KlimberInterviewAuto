package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BeneficiaryPage {
    WebDriver driver;

    public BeneficiaryPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "btnAddBeneficiaryNatural")
    WebElement addBeneficiaryPersonButton;

    @FindBy(id = "btnAddBeneficiaryLegal")
    WebElement addBeneficiaryOrgButton;

    @FindBy(xpath = ".//input[@name='Beneficiaries[0].Name']")
    private WebElement addBeneficiaryPersonInfoName;

    @FindBy(xpath = ".//input[@name='Beneficiaries[0].Surname']")
    private WebElement addBeneficiaryPersonInfoSurname;

    @FindBy(xpath = ".//input[@name='Beneficiaries[0].IdNumber']")
    private WebElement addBeneficiaryPersonInfoIdNumber;

    @FindBy(className = "selection")
    private WebElement relationshipDropDown;

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









}
