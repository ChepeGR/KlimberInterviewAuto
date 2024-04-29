package tests;

import helpers.DummieDataGenerator;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class HomePageTest extends BaseTest{


    @Test(priority = 1)
    public void basicTest  () {
        homePage = new HomePage(driver);
        homePage.awaitSpinnerDissapear();
        homePage.populateMiniForm("08092000", 2 , "0223", "12345678");
        homePage.moveSlider();
        homePage.awaitSpinnerDissapear();
    }

    @Test(priority = 2)
    public void checkboxDisabilityTest  () {
        homePage.awaitSpinnerDissapear();
        homePage.clickCheckBoxDisability();
//        String actuaMonthlyAmount = homePage.getMonthlyAmount().getText();
//        String expectedMonthlyAmount = "$ 1.184";
//        Assert.assertEquals(actuaMonthlyAmount, expectedMonthlyAmount, "After populate Disability checkbox: WRONG ZZZ AMOUNT");
        homePage.awaitSpinnerDissapear();
        homePage.clickCheckBoxAccident();
//        String actuaMonthlyAmount1 = homePage.getMonthlyAmount().getText();
//        String expectedMonthlyAmount1 = "$ 1.413";
//        Assert.assertEquals(actuaMonthlyAmount1, expectedMonthlyAmount1, "After populate Accident checkbox: WRONG MONTHLY AMOUNT");
        homePage.awaitSpinnerDissapear();
        homePage.clickCheckBoxIllness();
//        String actuaMonthlyAmount2 = homePage.getMonthlyAmount().getText();
//        String expectedMonthlyAmount2 = "$ 1.846";
//        Assert.assertEquals(actuaMonthlyAmount2, expectedMonthlyAmount2, "After populate Illness checkbox: WRONG MONTHLY AMOUNT");
        homePage.awaitSpinnerDissapear();
    }

    @Test(priority = 3)
    public void submitTest  () {
        MedicalFormPage medicalFormPage = homePage.clickSubmitButton();
        medicalFormPage.awaitSpinnerDissapear();
    }

    @Test(priority = 4)
    public void basicMedicalFormTest(){
        MedicalFormPage medicalFormPage= new MedicalFormPage(driver);
        medicalFormPage.secondTitleMedicalPage();
        medicalFormPage.nextPageIsPresent();
        medicalFormPage.typeInputHeight("183");
        medicalFormPage.typeInputWeight("101");
        medicalFormPage.clickNextPageButton();
    }

    @Test(priority = 5)
    public void personalFormTest(){
        PersonalFormPage personalFormPage = new PersonalFormPage(driver);
        personalFormPage.nameInputWrite("Juan");
        personalFormPage.surnameInputWrite("Perez");
        personalFormPage.idInputWrite(DummieDataGenerator.generateDummieDNI());
        personalFormPage.selectBirthGender();
        personalFormPage.selectCivilStatus();
        personalFormPage.writeEmailInput(DummieDataGenerator.generateDummyEmail());
        personalFormPage.passwordInputWrite("123456789");
        personalFormPage.fillStreetInput("alem");
        personalFormPage.houseNumberInputWrite("2134");
        personalFormPage.fillFloorNumberInput("2");
        personalFormPage.fillApartmentInput("A");
        personalFormPage.fillZipCodeInput("7600");
        personalFormPage.previusPageButton();
        personalFormPage.clickNextPageButton();
    }

    @Test(priority = 6)
    public void additionallInfoTest(){
        AdditionalInfoForm additionalInfoForm = new AdditionalInfoForm(driver);
        additionalInfoForm.selectNationalityDropdown();
        additionalInfoForm.fillPlaceOfBirthInput("Argentina");
        additionalInfoForm.fillOccupationInput("trader");
        additionalInfoForm.fillSalaryAnualInput("20000");
        additionalInfoForm.fillSpouseNameInput("Fabiana");
        additionalInfoForm.fillNumberIdSpuseInput("43221198");
        additionalInfoForm.selectPaymentOrigin();
        additionalInfoForm.nextPageButtonAddInfo();
    }
    @Test(priority = 7)
    public void paymentCardTest(){
        PaymentMethodPage paymentMethodPage = new PaymentMethodPage(driver);
        paymentMethodPage.fillCardNumberInput("4032032968933439");
        paymentMethodPage.deboAuotCheckBoxMethod();
        paymentMethodPage.submitPaymentNextPage();

    }
    @Test(priority = 8)
    public void beneficiaryPageTest(){
        BeneficiaryPage beneficiaryPage = new BeneficiaryPage(driver);
        beneficiaryPage.addBeneficiaryPerson();
        beneficiaryPage.clickSubmitBeneficiaryButton();

    }
    @Test(priority = 9)
    public void termsAndConsTest(){
        TermsAndCondsPage termsAndCondsPage= new TermsAndCondsPage(driver);
        termsAndCondsPage.clickTermsAndConsCheckBox();
        termsAndCondsPage.clickSubmitPageTermsAndCons();
        termsAndCondsPage.congratsUserCreated();
    }
}
