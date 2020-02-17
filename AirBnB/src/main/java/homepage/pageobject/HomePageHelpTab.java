package homepage.pageobject;

import homepage.webelement.HomePageWebElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageHelpTab extends HomePageWebElement {

    @FindBy(xpath = xPathHelpTab)public static WebElement helpTab;
    @FindBy(xpath = xPathValidateHelpTab)public static WebElement validateHelpTab;
    public static WebElement getHelpButton(){return helpTab;}
    public static void clickHelpButton(){getHelpButton().click();}
    public static String getValidateHelpTab(){return validateHelpTab.getText();}

    @FindBy(xpath = xPathHelpTabSearch)public static WebElement helpTabSearch;
    public static WebElement getHelpTabSearch(){return helpTabSearch;}
    public static void clickHelpTabSearch(){getHelpTabSearch().sendKeys("las");}

    @FindBy(xpath = xPathHelpTabSearchLasSelectLA)public static WebElement helpTabSearchSelectLA;
    @FindBy(xpath = xPathValidateSelectLA)public static WebElement validateSelectLA;
    public static WebElement getHelpTabSearchSelectLA(){return helpTabSearchSelectLA;}
    public static void clickHelpTabSearchSelectLA(){getHelpTabSearchSelectLA().click();}
    public static String getValidateSelectLA(){return validateSelectLA.getText();}

    @FindBy(xpath = xPathCreateReadMore)public static WebElement readMore;
    public static WebElement getReadMore(){return readMore;}
    public static void clickReadMore(){getReadMore().click();}

    @FindBy(xpath = xPathResetPassReadMore)public static WebElement ResetPassReadMore;
    public static WebElement getResetPassReadMore(){return ResetPassReadMore;}
    public static void clickResetPassReadMore(){getResetPassReadMore().click();}

    @FindBy(xpath = xPathReservationArrow)public static WebElement ReservationArrow;
    public static WebElement getReservationArrow(){return ReservationArrow;}
    public static void clickReservationArrow(){getReservationArrow().click();}

    @FindBy(xpath = xPathContactingArrow)public static WebElement ContactingArrow;
    public static WebElement getContactingArrow(){return ContactingArrow;}
    public static void clickContactingArrow(){getContactingArrow().click();}

    @FindBy(xpath = xPathPricesArrow)public static WebElement PricesArrow;
    public static WebElement getPricesArrow(){return PricesArrow;}
    public static void clickPricesArrow(){getPricesArrow().click();}

    @FindBy(xpath = xPathVisitTheHelpCenter)public static WebElement VisitTheHelpCenter;
    public static WebElement getVisitTheHelpCenter(){return VisitTheHelpCenter;}
    public static void clickVisitTheHelpCenter(){getVisitTheHelpCenter().click();}

    @FindBy(xpath = xPathGiveFeedback)public static WebElement GiveFeedback;
    public static WebElement getGiveFeedback(){return GiveFeedback;}
    public static void clickGiveFeedback(){getGiveFeedback().click();}



}
