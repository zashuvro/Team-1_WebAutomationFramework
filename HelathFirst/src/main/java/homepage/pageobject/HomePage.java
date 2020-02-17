package homepage.pageobject;

import homepage.webelement.HomePageWebElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
//import sun.security.pkcs11.P11Util;

import java.nio.file.Watchable;

public class HomePage extends HomePageWebElement {

    @FindBy(how = How.XPATH, using = contactXp)
    public static WebElement contact;
    public static WebElement getContact(){return contact;}
    public static void clickcontact(){getContact().click();}

    @FindBy(how = How.XPATH, using = loginButtonXp)
    public static WebElement loginButton;
    public static WebElement getLoginButton(){return loginButton;}

    @FindBy(how = How.XPATH, using = memberPortalXp)
    public static WebElement memberPortal;
    public static WebElement getMemberPortal(){return memberPortal;}
    public static void clickmemberPortal(){getMemberPortal().click();}

    @FindBy(how = How.XPATH, using = findADoctorXp)
    public static WebElement findADoctor;
    public static WebElement getFindADoctor(){return findADoctor;}
    public static void clickFindADoctor(){getFindADoctor().click();}

    @FindBy(how = How.XPATH, using = searchButtonXp)
    public static WebElement searchButton;
    public static WebElement getSearchButton(){return searchButton;}
    public static void clicksearchButton(){getSearchButton().click();}

    @FindBy(how = How.XPATH, using = searchButtonXp)
    public static WebElement sendSearchButton;
    public static WebElement getSendSearchButton(){return sendSearchButton;}
    public static void clickSendsearchButton(){getSearchButton().sendKeys("City Bike", Keys.ENTER) ;}

    @FindBy(how = How.XPATH, using = searchButtonXp)
    public static WebElement sendSearchButton2;
    public static WebElement getSendSearchButton2(){return sendSearchButton2;}
    public static void clickSendsearchButton2(){getSendSearchButton2().sendKeys("Middle Town", Keys.ENTER) ;}

    @FindBy(how = How.XPATH, using = searchButtonXp)
    public static WebElement sendSearchButton3;
    public static WebElement getSendSearchButton3(){return sendSearchButton3;}
    public static void clickSendsearchButton3(){getSendSearchButton3().sendKeys("MiddleTown Location", Keys.ENTER) ;}

    @FindBy(how = How.XPATH, using = searchButtonXp)
    public static WebElement sendSearchButton4;
    public static WebElement getSendSearchButton4(){return sendSearchButton3;}
    public static void clickSendsearchButton4(){getSendSearchButton4().sendKeys("New York", Keys.ENTER) ;}

    @FindBy(how = How.XPATH, using = searchButtonXp)
    public static WebElement sendSearchButton5;
    public static WebElement getSendSearchButton5(){return sendSearchButton3;}
    public static void clickSendsearchButton5(){getSendSearchButton5().sendKeys("Health Plan", Keys.ENTER) ;}

    @FindBy(how = How.XPATH, using = espanolButtonXp)
    public static WebElement espanolButton;
    public static WebElement getEspanolButton(){return espanolButton;}
    public static void clickespanolButton(){getEspanolButton().click();}

    @FindBy(how = How.XPATH, using = englishButtonXp)
    public static WebElement englishButton;
    public static WebElement getEnglishButton(){return englishButton;}
    public static void clickenglishButton(){getEnglishButton().click();}

    @FindBy(how = How.XPATH, using = chineseButtonXp)
    public static WebElement chineseButton;
    public static WebElement getChineseButton(){return chineseButton;}
    public static  void clickchineseButton(){getChineseButton().click();}

    @FindBy(how = How.XPATH, using = aboutUSXp)
    public static WebElement aboutUs;
    public static WebElement getAboutUs(){return aboutUs;}
    public static void clickAboutUs(){getAboutUs().click();}

    @FindBy(how = How.XPATH, using = logoXp)
    public static WebElement logo;
    public static WebElement getLogo(){return logo;}
    public static void clickLogo(){getLogo().click();}
//**
    @FindBy(how = How.XPATH, using = logoXp)
    public static WebElement logoButton;
    public static WebElement getLogoButton(){return logoButton;}
    public static void seelogoButton(){getLogoButton().getText();}

    @FindBy(how = How.XPATH, using = goodHelthXp)
    public static WebElement goodHealth;
    public static WebElement getGoodHealth(){return goodHealth;}
    public static void seetextGh(){getGoodHealth().getText();}

    @FindBy(how = How.XPATH, using = mainNavigateBarXp)
    public static WebElement mainNavigateBar;
    public static WebElement getMainNavigateBar(){return mainNavigateBar;}

    @FindBy(how = How.XPATH, using = informationForBroXp)
    public static WebElement informationForBro;
    public static WebElement getInformationForBro(){return informationForBro; }
    //public static void clickinformationForBro(){getInformationForBro().click();}
    public static void clickinformationForBro(){getInformationForBro().click();}

    @FindBy(how = How.XPATH, using = portalXp )
    public static WebElement portal;
    public static WebElement getPortal(){return portal;}
    public static void clickPortel (){getPortal().click();}

    @FindBy(how = How.XPATH, using = providerPortalXp)
    public static WebElement providerPortal;
    public static WebElement getProviderPortal(){return providerPortal;}
    public static void clickproviderPortal(){getProviderPortal().click();}

    @FindBy(how = How.XPATH, using = brokerPortalButtonXp)
    public static WebElement brokerPortalButton;
    public static WebElement getBrokerPortalButton(){return brokerPortalButton;}
    public static void clickbrokerPortalButton(){getBrokerPortalButton().click();}

    @FindBy(how = How.XPATH, using = employerPortalXp)
    public static WebElement employerPortal;
    public static WebElement getEmployerPortal(){return employerPortal;}
    public static void cickemployerPortalb(){getEmployerPortal().click();}

    @FindBy(how = How.XPATH, using = employerPUserIdXp)
    public static WebElement employerPUserId;
    public static WebElement getEmployerPUserId(){return employerPUserId;}
    public static void clickemployerPUserId(){getEmployerPUserId().sendKeys("hello");}

    @FindBy(how = How.XPATH, using = seeComminityLocationXp)
    public static WebElement seeComminityLocation;
    public static WebElement getSeeComminityLocation(){return seeComminityLocation;}
    public static void clickseeComminityLocation(){getSeeComminityLocation().click();}

    @FindBy(how = How.XPATH, using = jobOpeningXp)
    public static WebElement jobOpening;
    public static WebElement getJobOpening(){return jobOpening;}
    public static void clickjobOpening(){getJobOpening().click();}

    @FindBy(how = How.XPATH, using = readMoreXp)
    public static WebElement readMore;
    public static WebElement getReadMore(){return readMore;}
    public static void clickReadMore(){getReadMore().click();}

    @FindBy(how = How.XPATH, using = slickSlideXp)
    public static WebElement slickSlide;
    public static WebElement getSlickSlide(){return slickSlide;}
    public static void clickSlickSlide(){getSlickSlide().click();}

    @FindBy(how = How.XPATH, using = slickSlide2Xp)
    public static WebElement slickSlide2;
    public static WebElement getSlickSlide2(){return slickSlide2;}
    public static void clickSlickSlide2(){getSlickSlide2().click();}

    @FindBy(how = How.XPATH, using = slickSlide3Xp)
    public static WebElement slickSlide3;
    public static WebElement getSlickSlide3(){return slickSlide3;}
    public static void clickSlickSlide3(){getSlickSlide3().click();}

    @FindBy(how = How.XPATH, using = slickSlide0Xp)
    public static WebElement slickSlide0;
    public static WebElement getSlickSlide0(){return slickSlide0;}
    public static void clickSlickSlide0(){getSlickSlide0().click();}

    @FindBy(how = How.XPATH, using = goToHealthyLeavingXp)
    public static WebElement goToHealthyLeaving;
    public static WebElement getGoToHealthyLeaving(){return goToHealthyLeaving;}
    public static void clickgoToHealthyLeaving(){getGoToHealthyLeaving().click();}

    @FindBy(how = How.XPATH, using = loveYourHeartXp)
    public static WebElement loveYourHeart;
    public static WebElement getLoveYourHeart(){return loveYourHeart;}
    public static void clickloveYourHeart(){getLoveYourHeart().click();}

    @FindBy(how = How.XPATH, using = DentalCheckupTipsforParentsXp)
    public static WebElement DentalCheckupTipsforParents;
    public static WebElement getDentalCheckupTipsforParents(){return DentalCheckupTipsforParents;}
    public static void clickDentalCheckupTipsforParents(){getDentalCheckupTipsforParents().click();}

    @FindBy(how = How.XPATH, using = ContactUsXp)
    public static WebElement ContactUs;
    public static WebElement getContactUs(){return ContactUs;}
    public static void clickContactUs(){getContactUs().click();}











}
