package homepage.pageobject;

import homepage.webelement.HomePageWebElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomepageSearchSection extends HomePageWebElement {

    @FindBy(xpath = xPathWhereBarType) public static WebElement whereBarType;
    public static WebElement getWhereBarType(){return whereBarType;}
    public static void checkWhereBarType(){ getWhereBarType().sendKeys("Los Angeles");}

    @FindBy(xpath = xPathWhereBarSelectLA) public static WebElement BarSelectLA;
    public static WebElement getWhereBarSelectLA(){return BarSelectLA;}
    public static void checkWhereBarSelectLA(){ getWhereBarSelectLA().click();}

    @FindBy(xpath = xPathCheckInBar) public static WebElement checkInBar;
    public static WebElement getCheckInBar(){return checkInBar;}
    public static void clickCheckInBar(){ getCheckInBar().click();}

    @FindBy(xpath = xPathCheckOutBar) public static WebElement CheckOutBar;
    public static WebElement getCheckOutBar(){return CheckOutBar;}
    public static void clickCheckOutBar(){ getCheckOutBar().click();}

    @FindBy(xpath = xPathCheckInBarSelectDate18Feb) public static WebElement CheckInBarSelectDate;
    public static WebElement getCheckInBarSelectDate(){return CheckInBarSelectDate;}
    public static void clickCheckInBarSelectDate18Feb(){ getCheckInBarSelectDate().click();}

    @FindBy(xpath = xPathCheckOutBarSelectDate25Feb) public static WebElement CheckOutBarSelectDate;
    public static WebElement getCheckOutBarSelectDate(){return CheckOutBarSelectDate;}
    public static void clickCheckOutBarSelectDate25Feb(){ getCheckOutBarSelectDate().click();}

    @FindBy(xpath = xPathGuestsBar) public static WebElement GuestsBar;
    public static WebElement getGuestsBar(){return GuestsBar;}
    public static void clickGuestsBar(){ getGuestsBar().click();}

    @FindBy(xpath = xPathGuestsBar1Adults) public static WebElement GuestsBar1Adults;
    public static WebElement getGuestsBar1Adults(){return GuestsBar1Adults;}
    public static void clickGuestsBar1Adults(){ getGuestsBar1Adults().click();}

    @FindBy(xpath = xPathGuestsBar1Children) public static WebElement GuestsBar1Children;
    public static WebElement getGuestsBar1Children(){return GuestsBar1Children;}
    public static void clickGuestsBar1Children(){ getGuestsBar1Children().click();}

    @FindBy(xpath = xPathGuestsBar1Infants) public static WebElement GuestsBar1Infants;
    public static WebElement getGuestsBar1Infants(){return GuestsBar1Infants;}
    public static void clickGuestsBar1Infants(){ getGuestsBar1Infants().click();}

    @FindBy(xpath = xPathSearchButton) public static WebElement SearchButton;
    public static WebElement getSearchButton(){return SearchButton;}
    public static void clickSearchButton(){ getSearchButton().click();}


}
