package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest{

    @Test
    public void basicTest  () {
        homePage.populateMiniForm("08092000", 2 ,"0223", "12345678"); // json
        homePage.moveSlider();
        String actualSecuredAmount = homePage.getSecuredAmmount().getText();
        String actuaMonthlyAmount = homePage.getMonthlyAmount().getText();
        String expectedSecuredAmount = "$ 5.830.000";
        String expectedMonthlyAmount = "$ 955";
        Assert.assertEquals(actuaMonthlyAmount, expectedMonthlyAmount, "After populate miniform and moveslider: WRONG MONTHLY AMOUNT");
        Assert.assertEquals(actualSecuredAmount, expectedSecuredAmount, "After populate miniform and moveslider: WRONG SECURED AMOUNT");
    }

    @Test
    public void checkboxDisabilityTest  () {
        homePage.clickCheckBoxDisability();//xxxxx
        String actuaMonthlyAmount = homePage.getMonthlyAmount().getText();
        String expectedMonthlyAmount = "$ 1.184";
        Assert.assertEquals(actuaMonthlyAmount, expectedMonthlyAmount, "After populate Disability checkbox: WRONG ZZZ AMOUNT");
        homePage.clickCheckBoxAccident();//xxxxx
        String actuaMonthlyAmount1 = homePage.getMonthlyAmount().getText();
        String expectedMonthlyAmount1 = "$ 1.413";
        Assert.assertEquals(actuaMonthlyAmount1, expectedMonthlyAmount1, "After populate Accident checkbox: WRONG MONTHLY AMOUNT");
        homePage.clickCheckBoxIllness();//xxxxx
        String actuaMonthlyAmount2 = homePage.getMonthlyAmount().getText();
        String expectedMonthlyAmount2 = "$ 1.846";
        Assert.assertEquals(actuaMonthlyAmount2, expectedMonthlyAmount2, "After populate Illness checkbox: WRONG MONTHLY AMOUNT");
    }

    @Test
    public void submitTest  () {
        homePage.clickSubmitButton();
    }






}
