package homepage.pageobject;

import homepage.webelement.HomePageWebElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends HomePageWebElement {


    @FindBy(xpath =xPathValidateHomeText)public static WebElement homeText;
    public static WebElement getHomeText(){ return homeText; }
    public static String validateHomePageText(){return getHomeText().getText();}

    @FindBy(xpath =xPathValidateTermsText)public static WebElement termsText;
    public static WebElement getTermsText(){ return termsText; }
    public static void clickTermsButton(){ getTermsText().click();}

    @FindBy(xpath =xPathCareers)public static WebElement careersButton;
    public static WebElement getcareersButton(){ return careersButton; }
    public static void clickCareersButton(){ getcareersButton().click();}

    @FindBy(xpath =xPathValidateCareers)public static WebElement validateCareers;
    public static WebElement getValidateCareers(){ return validateCareers; }
    public static String validateCareers(){ return getValidateCareers().getText();}

    @FindBy(xpath =xPathNewsButton)public static WebElement newsButton;
    public static WebElement getNewsButton(){ return newsButton; }
    public static void clickNewsButton(){ getNewsButton().click();}

    @FindBy(xpath =xPathPoliciesButton)public static WebElement policiesButton;
    public static WebElement getPoliciesButton(){ return policiesButton; }
    public static void clickPoliciesButton(){ getPoliciesButton().click();}

    @FindBy(xpath =xPathDiversityBelongingButton)public static WebElement diversityBelonging;
    public static WebElement getDiversityBelongingButton(){ return diversityBelonging; }
    public static void clickDiversityBelongingButton(){ getDiversityBelongingButton().click();}

    @FindBy(xpath =xPathAccessibilityButton)public static WebElement accessibility;
    public static WebElement getAccessibilityButton(){ return accessibility; }
    public static void clickAccessibilityButton(){ getAccessibilityButton().click();}

    @FindBy(xpath =xPathTrustSafetyButton)public static WebElement trustSafety;
    public static WebElement getTrustSafetyButton(){ return trustSafety; }
    public static void clickTrustSafetyButton(){ getTrustSafetyButton().click();}

    @FindBy(xpath =xPathTravelCreditButton)public static WebElement travelCredit;
    public static WebElement getTravelCreditButton(){ return travelCredit; }
    public static void clickTravelCreditButton(){ getTravelCreditButton().click();}

    @FindBy(xpath =xPathGiftCardsButton)public static WebElement giftCards;
    public static WebElement getGiftCardsButton(){ return giftCards; }
    public static void clickGiftCardsButton(){ getGiftCardsButton().click();}

    @FindBy(xpath =xPathFaceBookButton)public static WebElement faceBookButton;
    public static WebElement getFaceBookButton(){ return faceBookButton; }
    public static void clickFaceBookButton(){ getFaceBookButton().click();}

    @FindBy(xpath =xPathTwitterButton)public static WebElement twitterButton;
    public static WebElement getTwitterButton(){ return twitterButton; }
    public static void clickTwitterButton(){ getTwitterButton().click();}

    @FindBy(xpath =xPathInstagramButton)public static WebElement InstagramButton;
    public static WebElement getInstagramButton(){ return InstagramButton; }
    public static void clickInstagramButton(){ getInstagramButton().click();}

    @FindBy(xpath =xPathHelpButton)public static WebElement HelpButton;
    public static WebElement getHelpButton(){ return HelpButton; }
    public static void clickHelpButton(){ getHelpButton().click();}

    @FindBy(xpath =xPathNeighborhoodSupportButton)public static WebElement NeighborhoodSupport;
    public static WebElement getNeighborhoodSupportButton(){ return NeighborhoodSupport; }
    public static void clickNeighborhoodSupportButton(){ getNeighborhoodSupportButton().click();}

    @FindBy(xpath =xPathValidateFooter)public static WebElement ValidateFooter;
    public static WebElement getValidateFooter(){ return ValidateFooter; }
    public static String checkValidateFooter(){ return getValidateFooter().getText();}


}
