package homepage.pageobject;

import homepage.webelement.HomePageWebElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageSignUpFrame extends HomePageWebElement {

    @FindBy(xpath = xPathSignUpButton)public static WebElement signUpButton;
    public static WebElement getSignUpButton(){return signUpButton;}
    public static void clickSignUpButton(){getSignUpButton().click();}

    @FindBy(xpath = xPathSignUpText)public static WebElement signUpText;
    public static WebElement getSignUpText(){return signUpText;}
    public static String validateSignUpText(){return getSignUpText().getText();}

    @FindBy(xpath = xPathSignUpButtonSelectFB)public static WebElement signUpButtonSelectFB;
    public static WebElement getSignUpButtonSelectFB(){return signUpButtonSelectFB;}
    public static void clickSignUpButtonSelectFB(){getSignUpButtonSelectFB().click();}

    @FindBy(xpath = xPathSignUpButtonSelectGoogle)public static WebElement signUpButtonSelectGoogle;
    public static WebElement getSignUpButtonSelectGoogle(){return signUpButtonSelectGoogle;}
    public static void clickSignUpButtonSelectGoogle(){getSignUpButtonSelectGoogle().click();}

    @FindBy(xpath = xPathSignUpButtonSelectEmail)public static WebElement signUpButtonSelectEmail;
    public static WebElement getSignUpButtonSelectEmail(){return signUpButtonSelectEmail;}
    public static void clickSignUpButtonSelectEmail(){getSignUpButtonSelectEmail().click();}

    @FindBy(xpath = xPathSignUpButtonEmailBar)public static WebElement signUpButtonEmailBar;
    public static WebElement getSignUpButtonEmailBar(){return signUpButtonEmailBar;}
    public static void typeSignUpButtonEmailBar(){getSignUpButtonEmailBar().sendKeys("demo@gmail.com");}

    @FindBy(xpath = xPathSignUpButtonFirstNameBar)public static WebElement signUpButtonFirstNameBar;
    public static WebElement getSignUpButtonFirstNameBar(){return signUpButtonFirstNameBar;}
    public static void typeSignUpButtonFirstNameBar(){getSignUpButtonFirstNameBar().sendKeys("Zahirul");}

    @FindBy(xpath = xPathSignUpButtonLastNameBar)public static WebElement signUpButtonLastNameBar;
    public static WebElement getSignUpButtonLastNameBar(){return signUpButtonLastNameBar;}
    public static void typeSignUpButtonLastNameBar(){getSignUpButtonLastNameBar().sendKeys("Alam");}

    @FindBy(xpath = xPathSignUpButtonPasswordBar)public static WebElement signUpButtonPasswordBar;
    public static WebElement getSignUpButtonPasswordBar(){return signUpButtonPasswordBar;}
    public static void typeSignUpButtonPasswordBar(){getSignUpButtonPasswordBar().sendKeys("Alam123@");}

    @FindBy(xpath = xPathSignUpButtonMonthBar)public static WebElement signUpButtonMonthBar;
    public static WebElement getSignUpButtonMonthBar(){return signUpButtonMonthBar;}
    public static void clickSignUpButtonMonthBar(){getSignUpButtonMonthBar().click();}

    @FindBy(xpath = xPathSignUpButtonMonthBarFeb)public static WebElement signUpButtonMonthBarFeb;
    public static WebElement getSignUpButtonMonthBarFeb(){return signUpButtonMonthBarFeb;}
    public static void clickSignUpButtonMonthBarFeb(){getSignUpButtonMonthBarFeb().click();}

    @FindBy(xpath = xPathSignUpButtonDayBar)public static WebElement signUpButtonDayBar;
    public static WebElement getSignUpButtonDayBar(){return signUpButtonDayBar;}
    public static void clickSignUpButtonDayBar(){getSignUpButtonDayBar().click();}

    @FindBy(xpath = xPathSignUpButtonDayBar6)public static WebElement signUpButtonDayBar6;
    public static WebElement getSignUpButtonDayBar6(){return signUpButtonDayBar6;}
    public static void clickSignUpButtonDayBar6(){getSignUpButtonDayBar6().click();}

    @FindBy(xpath = xPathSignUpButtonYearBar)public static WebElement signUpButtonYearBar;
    public static WebElement getSignUpButtonYearBar(){return signUpButtonYearBar;}
    public static void clickSignUpButtonYearBar(){getSignUpButtonYearBar().click();}

    @FindBy(xpath = xPathSignUpButtonYearBar1993)public static WebElement signUpButtonYearBar1993;
    public static WebElement getSignUpButtonYearBar1993(){return signUpButtonYearBar1993;}
    public static void clickSignUpButtonYearBar1993(){getSignUpButtonYearBar1993().click();}

    @FindBy(xpath = xPathSignUpButtonCheckBox)public static WebElement signUpButtonCheckBox;
    public static WebElement getSignUpButtonCheckBox(){return signUpButtonCheckBox;}
    public static void clickSignUpButtonCheckBox(){getSignUpButtonCheckBox().click();}

    @FindBy(xpath = xPathSignUpButtonFinish)public static WebElement signUpButtonFinish;
    public static WebElement getSignUpButtonFinish(){return signUpButtonFinish;}
    public static void clickSignUpButtonFinish(){getSignUpButtonFinish().click();}

    @FindBy(xpath = xPathSignUpButtonLogIn)public static WebElement signUpButtonLogIn;
    public static WebElement getSignUpButtonLogIn(){return signUpButtonLogIn;}
    public static void clickSignUpButtonLogIn(){getSignUpButtonLogIn().click();}





}
