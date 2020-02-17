package testhomepage;

import homepage.pageobject.HomePage;
import homepage.pageobject.HomePageFooterClass;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;



public class TestHomePage extends HomePage {

    public void getInitElements(){
        PageFactory.initElements(driver,HomePage.class);

    }

    private void handleNewTab() {
        handleNewTab();
    }
    @Test(priority = 1)
    public void testSearchButton() throws InterruptedException {
        getInitElements();
        clickSearchElementBar();
        clickSearchElementButton();
        sleepFor(2);
    }
    @Test(priority = 2)
    public void testSearchBar() throws InterruptedException {
        getInitElements();
        clickSearchElementHamBurger();
        sleepFor(2);
         }
    @Test(priority = 3)
    public void testAccountAndListArrow() throws InterruptedException {
        getInitElements();
        setAccountAndListArrow();
        sleepFor(2);
    }
    @Test(priority = 4)
    public void testChangeLanguage() throws InterruptedException {
        getInitElements();
        setChangeLanguage();
        getLanguageEspaish().click();
        sleepFor(2);
    }
    @Test(priority = 5)
    public void checkLocation() throws InterruptedException {
        getInitElements();
        setLocation();
        sleepFor(2);
        setLocationDone();
        sleepFor(2);
    }
    @Test(priority = 6)
    public void ClickDropDown() throws InterruptedException {
        getInitElements();
        getDropDownBox().click();
        sleepFor(2);
        }
    @Test(priority = 7)
    public void ClickTodaysDeal() throws InterruptedException {
        getInitElements();
        sleepFor(2);
        getTodaysDeal().click();
        scrollUpDown(3000);
        sleepFor(2);
        }

    @Test(priority = 8)
    public void clickBestSeller() throws InterruptedException {
        getInitElements();
       getBestSeller().click();
        sleepFor(2);
    }
 @Test (priority = 8)
    public void clickFindAGift() throws InterruptedException {
        getInitElements();
        setFindAGift();
      sleepFor(2);
    }
    @Test (priority = 9)
    public void clickCustomerService() throws InterruptedException {
        getInitElements();
        setCustomerService();
      sleepFor(2);
    }

    @Test(priority = 10)
    public void clickRegistry() throws InterruptedException {
        getInitElements();
        setRegistry();
        sleepFor(2);
    }
     @Test(priority = 11)
    public void clickReleases() throws InterruptedException {
        getInitElements();
        setReleases();
        sleepFor(2);
    }
    @Test(priority = 12)
    public void clickGiftCard() throws InterruptedException {
        getInitElements();
        setGiftCard();
        sleepFor(2);
    }
    @Test(priority = 13)
    public void clickSaveOnAmazonDevice() throws InterruptedException {
        getInitElements();
        setSaveOnAmazonDevice();
        sleepFor(2);
    }
    @Test(priority = 14)
    public void clickCart() throws InterruptedException {
        getInitElements();
        setCart();
        sleepFor(2);
    }
    @Test(priority = 15)
    public void clickShipOutSideUs() throws InterruptedException {
        getInitElements();
        setLocation();
        sleepFor(2);
        setShipOutSideArrow();
        sleepFor(2);
    }
    @Test(priority = 16)
    public void clickShipToJapan() throws InterruptedException {
        getInitElements();
        setLocation();
        sleepFor(2);
        setShipOutSideArrow();
        sleepFor(2);
        setShipToJapan();
        sleepFor(1);
        setLocationDone();
    }
    @Test(priority = 17)
    public void clickShipToAustralia() throws InterruptedException {
        getInitElements();
        setLocation();
        sleepFor(2);
        setShipOutSideArrow();
        sleepFor(2);
        setShipToAustralia();
        sleepFor(1);
        setLocationDone();
    }
    @Test(priority = 18)
    public void clickShipToMexico() throws InterruptedException {
        getInitElements();
        setLocation();
        sleepFor(2);
        setShipOutSideArrow();
        sleepFor(2);
        setShipToMexico();
        sleepFor(1);
        setLocationDone();
    }
    @Test(priority = 19)
    public void clickShipToSingapore() throws InterruptedException {
        getInitElements();
        setLocation();
        sleepFor(2);
        setShipOutSideArrow();
        sleepFor(2);
        setShipToSingapore();
        sleepFor(1);
        setLocationDone();
    }
    @Test(priority = 20)
    public void clickShipToBangladesh() throws InterruptedException {
        getInitElements();
        setLocation();
        sleepFor(2);
        setShipOutSideArrow();
        sleepFor(2);
        setShipToBangladesh();
        sleepFor(1);
        setLocationDone();
}
    @Test(priority = 21)
    public void clickShipToUK() throws InterruptedException {
        getInitElements();
        setLocation();
        sleepFor(2);
        setShipOutSideArrow();
        sleepFor(2);
        setShipToUK();
        sleepFor(1);
        setLocationDone();
}
    @Test(priority = 22)
    public void clickShipToAlbania() throws InterruptedException {
        getInitElements();
        setLocation();
        sleepFor(2);
        setShipOutSideArrow();
        sleepFor(2);
        setShipToAlbania();
        sleepFor(1);
        setLocationDone();
}
     @Test(priority = 23)
    public void clickAmazonMusic() throws InterruptedException {
        getInitElements();
        clickSearchElementHamBurger();
        sleepFor(2);
        setAmazonMusic();
        sleepFor(2);
}
     @Test(priority = 24)
    public void clickAmazonMusicUnlimited() throws InterruptedException {
        getInitElements();
       clickSearchElementHamBurger();
        sleepFor(2);
        setAmazonMusic();
        sleepFor(2);
        setAmazonMusicUnlimited();
        sleepFor(1);
}
    @Test(priority = 25)
    public void clickEcoWebElement() throws InterruptedException {
        getInitElements();
       clickSearchElementHamBurger();
        sleepFor(2);
        setFireTv();
        sleepFor(2);
    }
    @Test(priority = 26)
    public void testFireTvStick() throws InterruptedException {
        getInitElements();
       clickSearchElementHamBurger();
        sleepFor(2);
        setFireTv();
        sleepFor(2);
        setFireTvStick();
    }
    @Test(priority = 27)
    public void testValentineGift() throws InterruptedException {
        getInitElements();
        setSearchValentineGift();
        sleepFor(2);
}
    @Test(priority = 28)
    public void testPhoneExcessories() throws InterruptedException {
        getInitElements();
        setSearchPhoneAccessories();
        Thread.sleep(3000);
    }
    @Test(priority = 29)
    public void testCoronaVirus() throws InterruptedException {
    getInitElements();
    setSearchElementCoronaMedicine();
    sleepFor(2);
    }
     @Test(priority = 30)
    public void testBabyCloth() throws InterruptedException {
        getInitElements();
        searchBabyCloth();
        sleepFor(2);
     }
    @Test(priority = 31)
   public void ClickDropDown1() throws InterruptedException {
        getInitElements();
        getDropDownBox().click();
        sleepFor(2);
        getDropDownBox();
        scrollUpDown(2000);
        sleepFor(2);
        }
    @Test(priority = 32)
    public void clickingAddRightArrow() throws InterruptedException {
        getInitElements();
        setAddRightArrow();
        sleepFor(1);
        setAddRightArrow();
        sleepFor(1);
        setAddRightArrow();
        sleepFor(1);
        setAddRightArrow();
        sleepFor(1);
        setAddRightArrow();
        sleepFor(2);
    }
    @Test(priority = 33)
    public void clickingAddLeftArrow() throws InterruptedException {
        getInitElements();
        setAddLeftArrow();
        sleepFor(1);
        setAddLeftArrow();
        sleepFor(1);
        setAddLeftArrow();
        sleepFor(1);
        setAddLeftArrow();
        sleepFor(1);
        setAddLeftArrow();
        sleepFor(1);
    }
    @Test(priority = 34)
    public void ScrollDown() throws InterruptedException {
        getInitElements();
        scrollUpDown(4500);
        sleepFor(2); }

    @Test(priority = 35)
    public void doSignInWithEmail() throws InterruptedException {
        getInitElements();
        setAccountAndListArrow();   sleepFor(1);
         setSignInButton();         sleepFor(1);
        getEmailField().sendKeys("abirhossan@gmail.com");     sleepFor(2);
        setSignInContinueButton();     sleepFor(2);

    }
    @Test(priority = 36)
    public void doSignInWithNumberWrongPassword() throws InterruptedException {
        getInitElements();
        setAccountAndListArrow();sleepFor(1);
        setSignInButton(); sleepFor(1);
        getEmailField().sendKeys("3472594531");sleepFor(2);
        setSignInContinueButton(); sleepFor(2);
        getInputPasswordField().sendKeys("Abc087#@!"); sleepFor(4);
        setSignInSubmitButton(); sleepFor(5);
    }
    @Test(priority = 37)
    public void DoSignInWithRightNumberRightPassword() throws InterruptedException {
        getInitElements();
       setAccountAndListArrow(); sleepFor(1);
         setSignInButton(); sleepFor(1);
        getEmailField().sendKeys("3472594531"); sleepFor(2);
        setSignInContinueButton();   sleepFor(2);
        getInputPasswordField().sendKeys("@##$ASD333"); sleepFor(4);
        setSignInSubmitButton(); sleepFor(4);

    }
     @Test(priority = 38)
    public void DoSignInWithoutData() throws InterruptedException {
        getInitElements();
       setAccountAndListArrow(); sleepFor(1);
       setSignInButton(); sleepFor(1);
        setSignInContinueButton();   sleepFor(2);
    }
    @Test(priority = 39)
    public void DoSignInWithNumberWithoutPassword() throws InterruptedException {
        getInitElements();
       setAccountAndListArrow(); sleepFor(1);
         setSignInButton(); sleepFor(1);
        getEmailField().sendKeys("3472594531"); sleepFor(2);
        setSignInContinueButton();   sleepFor(2);
        setSignInSubmitButton(); sleepFor(4);
    }
    @Test(priority = 40)
    public void DoKeepMeSignInButton() throws InterruptedException {
        getInitElements();
       setAccountAndListArrow(); sleepFor(1);
         setSignInButton(); sleepFor(1);
        getEmailField().sendKeys("3472594531"); sleepFor(2);
        setSignInContinueButton();   sleepFor(2);
        setSignInSubmitButton(); sleepFor(2);
        setKeepMeSignInButton();sleepFor(3);
    }
    @Test(priority = 41)
    public void DoKeepMeSignInDetails() throws InterruptedException {
        getInitElements();
       setAccountAndListArrow(); sleepFor(1);
         setSignInButton(); sleepFor(1);
        getEmailField().sendKeys("3472594531"); sleepFor(2);
        setSignInContinueButton();   sleepFor(2);
        setSignInSubmitButton(); sleepFor(2);
        setKeepMeSignInDetails();sleepFor(3);
    }
    @Test(priority = 42)
    public void DoSignInNeedHelpButton() throws InterruptedException {
        getInitElements();
       setAccountAndListArrow(); sleepFor(1);
         setSignInButton(); sleepFor(1);
        setSignInNeedHelpButton(); sleepFor(3);
   }
    @Test(priority = 43)
    public void DoSignInPrivacyNotice() throws InterruptedException {
        getInitElements();
       setAccountAndListArrow(); sleepFor(1);
         setSignInButton(); sleepFor(1);
        setSignInPrivacyNotice(); sleepFor(3);
   }
  @Test(priority = 44)
    public void DoSignInConditionsOfUSe() throws InterruptedException {
        getInitElements();
       setAccountAndListArrow(); sleepFor(1);
         setSignInButton(); sleepFor(1);
        setSignInConditionsOfUSe(); sleepFor(3);
   }
   @Test(priority = 45)
    public void DoSignInForgotPassword() throws InterruptedException {
       getInitElements();
       setAccountAndListArrow(); sleepFor(1);
         setSignInButton(); sleepFor(1);
        getEmailField().sendKeys("3472594531"); sleepFor(2);
        setSignInContinueButton();sleepFor(1);
        getInputPasswordField().sendKeys("a234wasfgh6543");sleepFor(2);
        setSignInSubmitButton(); sleepFor(2);
       setSignInForgotPassword(); sleepFor(2);
   }
    @Test(priority = 46)
    public void doSignInYourGarage() throws InterruptedException {
        getInitElements();
        setAccountAndListArrow();
        sleepFor(2);
        setSignInYourGarage();
        sleepFor(2);
    }
     @Test(priority = 47)
    public void doSignInYourGaragePartsHover() throws InterruptedException {
        getInitElements();
        setAccountAndListArrow();       sleepFor(2);
        setSignInYourGarage();           sleepFor(2);
        setSignInYourGaragePartsHover();   sleepFor(2);
    }
    @Test(priority = 48)
    public void doSignInYourGarageAccessoriesHover() throws InterruptedException {
        getInitElements();
        setAccountAndListArrow();
        sleepFor(2);
        setSignInYourGarage();
        sleepFor(2);
        setSignInYourGarageAccessoriesHover();
        sleepFor(2);
    }
    @Test(priority = 49)
    public void doSignInYourGarageToolsHover() throws InterruptedException {
        getInitElements();
        setAccountAndListArrow();
        sleepFor(2);
        setSignInYourGarage();
        sleepFor(2);
        setSignInYourGarageToolsHover();
        sleepFor(2);
    }
    @Test(priority = 50)
    public void doSignInYourGarageCarCareHover() throws InterruptedException {
        getInitElements();
        setAccountAndListArrow();
        sleepFor(2);
        setSignInYourGarage();
        sleepFor(2);
        setSignInYourGarageCarCareHover();
        sleepFor(2);
    }
    @Test(priority = 51)
    public void doSignInYourMotorCyclePartsHover() throws InterruptedException {
        getInitElements();
        setAccountAndListArrow();
        sleepFor(2);
        setSignInYourGarage();
        sleepFor(2);
        setSignInYourMotorCyclePartsHover();
        sleepFor(2);
    }
    @Test(priority = 51)
    public void doSignInYourTruckHover() throws InterruptedException {
        getInitElements();
        setAccountAndListArrow();
        sleepFor(2);
        setSignInYourGarage();
        sleepFor(2);
        setSignInYourTruckHover();
        sleepFor(2);
    }
    @Test(priority = 52)
    public void doSignInYourRvHover() throws InterruptedException {
        getInitElements();
        setAccountAndListArrow();
        sleepFor(2);
        setSignInYourGarage();
        sleepFor(2);
        setSignInYourRvHover();
        sleepFor(2);
    }
    @Test(priority = 53)
    public void doSignInYourTiresWheelsHover() throws InterruptedException {
        getInitElements();
        setAccountAndListArrow();
        sleepFor(2);
        setSignInYourGarage();
        sleepFor(2);
        setSignInYourTiresWheelsHover();
        sleepFor(2);
    }
    @Test(priority = 54)
    public void doSignInYourGarageInHover() throws InterruptedException {
        getInitElements();
        setAccountAndListArrow();         sleepFor(2);
        setSignInYourGarage();              sleepFor(2);
        setSignInYourGaragePartsHover();      sleepFor(2);
        setSignInYourGarageAccessoriesHover();  sleepFor(2);
        setSignInYourGarageToolsHover();         sleepFor(2);
        setSignInYourGarageCarCareHover();        sleepFor(2);
        setSignInYourMotorCyclePartsHover();       sleepFor(2);
        setSignInYourTruckHover();                  sleepFor(2);
        setSignInYourRvHover();                      sleepFor(2);
        setSignInYourTiresWheelsHover();              sleepFor(2);
        navigateBack();sleepFor(2);
    }


    //Footer Test

    @Test(priority = 55)
    public void FooterGetCareerButton() throws InterruptedException {
        getInitElements();sleepFor(2);
       scrollUpDown(4500);
        sleepFor(2);
        setFooterGetToKnowCareerButton(); sleepFor(2);
        navigateBack();
    }
    @Test(priority = 56)
    public void FooterGetToKnowBlogButton() throws InterruptedException {
        getInitElements();sleepFor(2);
        scrollUpDown(4500);
        sleepFor(2);
        setFooterGetToKnowBlogButton();sleepFor(2);
        scrollUpDown(500);sleepFor(2);
        navigateBack();
    }
 @Test(priority = 57)
    public void FooterGetToKnowAboutAmazonButton() throws InterruptedException {
        getInitElements();sleepFor(2);
        scrollUpDown(4500);
        sleepFor(2);
        setFooterGetToKnowAboutAmazonButton();sleepFor(1);
        scrollUpDown(800);sleepFor(2);
        navigateBack();
    }
    @Test(priority = 58)
    public void FooterGetToKnowPressCenterButton() throws InterruptedException {
        getInitElements();sleepFor(2);
        scrollUpDown(4500);
        sleepFor(2);
        setFooterGetToKnowPressCenterButton();sleepFor(1);
        scrollUpDown(800);sleepFor(2);
        navigateBack();
    }
 @Test(priority = 59)
    public void FooterGetToKnowInvestorRelationsButton() throws InterruptedException {
        getInitElements();sleepFor(2);
        scrollUpDown(4500);
        sleepFor(2);
        setFooterGetToKnowInvestorRelationsButton();sleepFor(1);
        scrollUpDown(800);sleepFor(2);
        navigateBack();
    }
    @Test(priority = 60)
    public void FooterGetToKnowAmazonDeviceButton() throws InterruptedException {
        getInitElements();sleepFor(2);
        scrollUpDown(4500);
        sleepFor(2);
        setFooterGetToKnowAmazonDeviceButton();sleepFor(1);
        scrollUpDown(800);sleepFor(2);
        navigateBack();
    }
    @Test(priority = 61)
    public void FooterGetToKnowAmazonToursButton() throws InterruptedException {
        getInitElements();sleepFor(2);
        scrollUpDown(4500);
        sleepFor(2);
        setFooterGetToKnowAmazonToursButton();sleepFor(1);
        scrollUpDown(800);sleepFor(2);
        navigateBack();
    }
    @Test(priority = 62)
    public void FooterMakeMoneyWithSellOnAmazonButton() throws InterruptedException {
        getInitElements();sleepFor(2);
        scrollUpDown(4500);
        sleepFor(2);
        setFooterMakeMoneyWithSellOnAmazonButton();sleepFor(1);
        scrollUpDown(800);sleepFor(2);
        navigateBack();
    }
    @Test(priority = 63)
    public void FooterMakeMoneyWithSellUnderAmazonAcceleratorButton() throws InterruptedException {
        getInitElements();sleepFor(2);
        scrollUpDown(4500);
        sleepFor(2);
        setFooterMakeMoneyWithSellUnderAmazonAcceleratorButton();sleepFor(1);
        scrollUpDown(800);sleepFor(2);
        navigateBack();
    }
@Test(priority = 64)
    public void FooterMakeMoneyWithSellOnAmazonHandMadeButton() throws InterruptedException {
        getInitElements();sleepFor(2);
        scrollUpDown(4500);
        sleepFor(2);
        setFooterMakeMoneyWithSellOnAmazonHandMadeButton();sleepFor(1);
        scrollUpDown(800);sleepFor(2);
        navigateBack();
    }
    @Test(priority = 65)
    public void FooterMakeMoneyWithSellYourServiceOnAmazonButton() throws InterruptedException {
        getInitElements();sleepFor(2);
        scrollUpDown(4500);
        sleepFor(2);
        setFooterMakeMoneyWithSellYourServiceOnAmazonButton();sleepFor(1);
        scrollUpDown(800);sleepFor(2);
        navigateBack();
    }
    @Test(priority = 66)
    public void FooterMakeMoneyWithSellOnAmazonBusinessButton() throws InterruptedException {
        getInitElements();sleepFor(2);
        scrollUpDown(4500);
        sleepFor(2);
        setFooterMakeMoneyWithSellOnAmazonBusinessButton();sleepFor(1);
        scrollUpDown(800);sleepFor(2);
        navigateBack();
    }
  @Test(priority = 67)
    public void FooterMakeMoneyWithSellYourAppsOnAmazonButton() throws InterruptedException {
        getInitElements();sleepFor(2);
        scrollUpDown(4500);
        sleepFor(2);
        setFooterMakeMoneyWithSellYourAppsOnAmazonButton();sleepFor(1);
        scrollUpDown(800);sleepFor(2);
        navigateBack();
    }
  @Test(priority = 68)
    public void FooterMakeMoneyWithBecomeAnAffiliateButton() throws InterruptedException {
        getInitElements();sleepFor(2);
        scrollUpDown(4500);
        sleepFor(2);
        setFooterMakeMoneyWithBecomeAnAffiliateButton();sleepFor(1);
        scrollUpDown(800);sleepFor(2);
        navigateBack();
    }
 @Test(priority = 69)
    public void FooterMakeMoneyWithAdvertiseYourProductsButton() throws InterruptedException {
        getInitElements();sleepFor(2);
        scrollUpDown(4500);
        sleepFor(2);
        setFooterMakeMoneyWithAdvertiseYourProductsButton();sleepFor(1);
        scrollUpDown(800);sleepFor(2);
        navigateBack();
    }

 @Test(priority = 70)
    public void FooterMakeMoneyWithSelfPublishWithUsButton() throws InterruptedException {
        getInitElements();sleepFor(2);
        scrollUpDown(4500);
        sleepFor(2);
        setFooterMakeMoneyWithSelfPublishWithUsButton();sleepFor(1);
        scrollUpDown(800);sleepFor(2);
        navigateBack();
    }

 @Test(priority = 72)
    public void FooterAmazonPaymentProductsSignatureCardsButton() throws InterruptedException {
        getInitElements();sleepFor(2);
        scrollUpDown(4500);
        sleepFor(2);
        setFooterAmazonPaymentProductsSignatureCardsButton();sleepFor(1);
        scrollUpDown(800);sleepFor(2);
        navigateBack();
    }
 @Test(priority = 73)
    public void FooterAmazonPaymentProductsStoreCardButton() throws InterruptedException {
        getInitElements();sleepFor(2);
        scrollUpDown(4500);
        sleepFor(2);
        setFooterAmazonPaymentProductsStoreCardButton();sleepFor(1);
        scrollUpDown(800);sleepFor(2);
        navigateBack();
    }
 @Test(priority = 74)
    public void FooterAmazonPaymentProductsBusinessCardButton() throws InterruptedException {
        getInitElements();sleepFor(2);
        scrollUpDown(4500);
        sleepFor(2);
        setFooterAmazonPaymentProductsBusinessCardButton();sleepFor(1);
        scrollUpDown(800);sleepFor(2);
        navigateBack();
    }
 @Test(priority = 75)
    public void FooterAmazonPaymentProductsCorporateCardLineButton() throws InterruptedException {
        getInitElements();sleepFor(2);
        scrollUpDown(4500);
        sleepFor(2);
        setFooterAmazonPaymentProductsCorporateCardLineButton();sleepFor(1);
        scrollUpDown(800);sleepFor(2);
        navigateBack();
    }
 @Test(priority = 76)
    public void FooterAmazonPaymentProductsStopWithPointButton() throws InterruptedException {
        getInitElements();sleepFor(2);
        scrollUpDown(4500);
        sleepFor(2);
        setFooterAmazonPaymentProductsStopWithPointButton();sleepFor(1);
        scrollUpDown(800);sleepFor(2);
        navigateBack();
    }
@Test(priority = 77)
    public void FooterAmazonPaymentProductsCreditCardMarketPlaceButton() throws InterruptedException {
        getInitElements();sleepFor(2);
        scrollUpDown(4500);
        sleepFor(2);
        setFooterAmazonPaymentProductsCreditCardMarketPlaceButton();sleepFor(1);
        scrollUpDown(800);sleepFor(2);
        navigateBack();
    }

@Test(priority = 78)
    public void FooterAmazonPaymentProductsCurrencyConverterButton() throws InterruptedException {
        getInitElements();sleepFor(2);
        scrollUpDown(4500);
        sleepFor(2);
        setFooterAmazonPaymentProductsCurrencyConverterButton();sleepFor(1);
        scrollUpDown(800);sleepFor(2);
        navigateBack();
    }

@Test(priority = 79)
    public void FooterLetUsHelpYouYourAccountButton() throws InterruptedException {
        getInitElements();sleepFor(2);
        scrollUpDown(4500);
        sleepFor(2);
        setFooterLetUsHelpYouYourAccountButton();sleepFor(1);
        scrollUpDown(800);sleepFor(2);
        navigateBack();
    }

@Test(priority = 80)
    public void FooterLetUsHelpYouYourOrdersButton() throws InterruptedException {
        getInitElements();sleepFor(2);
        scrollUpDown(4500);
        sleepFor(2);
        setFooterLetUsHelpYouYourOrdersButton();sleepFor(1);
        scrollUpDown(800);sleepFor(2);
        navigateBack();
    }
@Test(priority = 81)
    public void FooterLetUsHelpYouShippingRatesAndPolicesButton() throws InterruptedException{
        getInitElements();sleepFor(2);
        scrollUpDown(4500);
        sleepFor(2);
        setFooterLetUsHelpYouShippingRatesAndPolicesButton();sleepFor(1);
        scrollUpDown(400);sleepFor(2);
        navigateBack();
    }

@Test(priority = 82)
    public void FooterLetUsHelpYouAmazonPrimeButton() throws InterruptedException {
        getInitElements();sleepFor(2);
        scrollUpDown(4500);
        sleepFor(2);
        setFooterLetUsHelpYouAmazonPrimeButton();sleepFor(1);
        scrollUpDown(400);sleepFor(2);
        navigateBack();
    }

@Test(priority = 83)
    public void FooterLetUsHelpYouReturnsAndReplacementButton() throws InterruptedException {
        getInitElements();sleepFor(2);
        scrollUpDown(4500);
        sleepFor(2);
        setFooterLetUsHelpYouReturnsAndReplacementButton();sleepFor(1);
        scrollUpDown(400);sleepFor(2);
        navigateBack();
    }
@Test(priority = 84)
    public void FooterLetUsHelpYouManageYourContentAndDeviceButton() throws InterruptedException {
        getInitElements();sleepFor(2);
        scrollUpDown(4500);
        sleepFor(2);
        setFooterLetUsHelpYouManageYourContentAndDeviceButton();sleepFor(1);
        scrollUpDown(400);sleepFor(2);
        navigateBack();
    }

@Test(priority = 85)
    public void FooterLetUsHelpYouAmazonAssistantButton() throws InterruptedException {
        getInitElements();sleepFor(2);
        scrollUpDown(4500);
        sleepFor(2);
        setFooterLetUsHelpYouAmazonAssistantButton();sleepFor(1);
        scrollUpDown(400);sleepFor(2);
        navigateBack();
    }
 @Test(priority = 86)
    public void FooterLetUsHelpYouHelpButton() throws InterruptedException {
        getInitElements();sleepFor(2);
        scrollUpDown(4500);
        sleepFor(2);
        setFooterLetUsHelpYouHelpButton();sleepFor(1);
        scrollUpDown(400);sleepFor(2);
        navigateBack();
    }

    @Test(priority = 87)
    public void FooterDownAmazonMusicButton() throws InterruptedException {
        getInitElements();sleepFor(2);
        scrollUpDown(5500);
        sleepFor(2);
        setFooterDownAmazonMusicButton();sleepFor(1);
        scrollUpDown(400);sleepFor(2);
        navigateBack();
    }

 @Test(priority = 88)
    public void FooterDownAmazonBusinessButton() throws InterruptedException {
        getInitElements();sleepFor(2);
        scrollUpDown(5500);
        sleepFor(2);
        setFooterDownAmazonBusinessButton();sleepFor(1);
        scrollUpDown(400);sleepFor(2);
        navigateBack();

    }

@Test(priority = 89)
    public void FooterDownAudibleButton() throws InterruptedException {
        getInitElements();sleepFor(2);
        scrollUpDown(5500);
        sleepFor(2);
        setFooterDownAudibleButton();sleepFor(1);
        scrollUpDown(400);sleepFor(2);
        navigateBack();
    }
@Test(priority = 90)
    public void FooterDownFabricButton() throws InterruptedException {
        getInitElements();sleepFor(2);
        scrollUpDown(5500);
        sleepFor(2);
        setFooterDownFabricButton();sleepFor(1);
        scrollUpDown(400);sleepFor(2);
        navigateBack();
    }
@Test(priority = 91)
    public void FooterDownPrimeVideoDirectButton() throws InterruptedException {
        getInitElements();sleepFor(2);
        scrollUpDown(5500);
        sleepFor(2);
        setFooterDownPrimeVideoDirectButton();sleepFor(1);
        scrollUpDown(400);sleepFor(2);
        navigateBack();
    }

@Test(priority = 92)
    public void FooterDownEeroWifiButton() throws InterruptedException {
        getInitElements();sleepFor(2);
        scrollUpDown(5500);
        sleepFor(2);
        setFooterDownEeroWifiButton();sleepFor(1);
        scrollUpDown(400);sleepFor(2);
        navigateBack();
    }
@Test(priority = 93)
    public void FooterDownAmazonAdvertisingButton() throws InterruptedException {
        getInitElements();sleepFor(2);
        scrollUpDown(5500);
        sleepFor(2);
        setFooterDownAmazonAdvertisingButton();sleepFor(1);
        scrollUpDown(400);sleepFor(2);
        navigateBack();
    }
@Test(priority = 94)
    public void FooterDownAmazonFreshButton() throws InterruptedException {
        getInitElements();sleepFor(2);
        scrollUpDown(5500);
        sleepFor(2);
        setFooterDownAmazonFreshButton();sleepFor(1);
        scrollUpDown(400);sleepFor(2);
        navigateBack();
    }
@Test(priority = 95)
    public void FooterDownBrookDepositoryButton() throws InterruptedException {
        getInitElements();sleepFor(2);
        scrollUpDown(5500);
        sleepFor(2);
        setFooterDownBrookDepositoryButton();sleepFor(1);
        scrollUpDown(400);sleepFor(2);
        navigateBack();
    }
@Test(priority = 96)
    public void FooterDownGoodReadsButton() throws InterruptedException {
        getInitElements();sleepFor(2);
        scrollUpDown(5500);
        sleepFor(2);
        setFooterDownGoodReadsButton();sleepFor(1);
        scrollUpDown(400);sleepFor(2);
        navigateBack();
    }
@Test(priority = 97)
    public void FooterDownShopBopButton() throws InterruptedException {
        getInitElements();sleepFor(2);
        scrollUpDown(5500);
        sleepFor(2);
        setFooterDownShopBopButton();sleepFor(1);
        scrollUpDown(400);sleepFor(2);
        navigateBack();
    }
@Test(priority = 98)
    public void FooterDownNeighborsAppButton() throws InterruptedException {
        getInitElements();sleepFor(2);
        scrollUpDown(5500);
        sleepFor(2);
        setFooterDownNeighborsAppButton();sleepFor(1);
        scrollUpDown(400);sleepFor(2);
        navigateBack();
    }
@Test(priority = 99)
    public void FooterDownAmazonDriveButton() throws InterruptedException {
        getInitElements();sleepFor(2);
        scrollUpDown(5500);
        sleepFor(2);
        setFooterDownAmazonDriveButton();sleepFor(1);
        scrollUpDown(400);sleepFor(2);
        navigateBack();
    }
@Test(priority = 100)
    public void FooterDownAmazonGlobalButton() throws InterruptedException {
        getInitElements();sleepFor(2);
        scrollUpDown(5500);
        sleepFor(2);
        setFooterDownAmazonGlobalButton();sleepFor(1);
        scrollUpDown(400);sleepFor(2);
        navigateBack();
    }
@Test(priority = 101)
    public void FooterDownBoxOfficeMojoButton() throws InterruptedException {
        getInitElements();sleepFor(2);
        scrollUpDown(5500);
        sleepFor(2);
        setFooterDownBoxOfficeMojoButton();sleepFor(1);
        scrollUpDown(400);sleepFor(2);
        navigateBack();
    }
@Test(priority = 102)
    public void FooterDownIMDBButton() throws InterruptedException {
        getInitElements();sleepFor(2);
        scrollUpDown(5500);
        sleepFor(2);
        setFooterDownIMDBButton();sleepFor(1);
        scrollUpDown(400);sleepFor(2);
        navigateBack();
    }

@Test(priority = 103)
    public void FooterDownAmazonWareHouseButton() throws InterruptedException {
        getInitElements();sleepFor(2);
        scrollUpDown(5500);
        sleepFor(2);
        setFooterDownAmazonWareHouseButton();sleepFor(1);
        scrollUpDown(400);sleepFor(2);
        navigateBack();
    }
@Test(priority = 104)
    public void FooterDownSubscribeWithAmazonButton() throws InterruptedException {
        getInitElements();sleepFor(2);
        scrollUpDown(5500);
        sleepFor(2);
        setFooterDownSubscribeWithAmazonButton();sleepFor(1);
        scrollUpDown(400);sleepFor(2);
        navigateBack();
    }
@Test(priority = 105)
    public void FooterDownSixPmButton() throws InterruptedException {
        getInitElements();sleepFor(2);
        scrollUpDown(5500);
        sleepFor(2);
        setFooterDownSixPmButton();sleepFor(1);
        scrollUpDown(400);sleepFor(2);
        navigateBack();
    }
@Test(priority = 106)
    public void FooterDownHomeServiceButton() throws InterruptedException {
        getInitElements();sleepFor(2);
        scrollUpDown(5500);
        sleepFor(2);
        setFooterDownHomeServiceButton();sleepFor(1);
        scrollUpDown(400);sleepFor(2);
        navigateBack();
    }
@Test(priority = 107)
    public void FooterDownComiXologyButton() throws InterruptedException {
        getInitElements();sleepFor(2);
        scrollUpDown(5500);
        sleepFor(2);
        setFooterDownComiXologyButton();sleepFor(1);
        scrollUpDown(400);sleepFor(2);
        navigateBack();
    }
@Test(priority = 108)
    public void FooterDownImdbButton() throws InterruptedException {
        getInitElements();sleepFor(2);
        scrollUpDown(5500);
        sleepFor(2);
        setFooterDownImdbButton();sleepFor(1);
        scrollUpDown(400);sleepFor(2);
        navigateBack();
    }
@Test(priority = 109)
    public void FooterDownWholeFoodsMarketButton() throws InterruptedException {
        getInitElements();sleepFor(2);
        scrollUpDown(5500);
        sleepFor(2);
        setFooterDownWholeFoodsMarketButton();sleepFor(1);
        scrollUpDown(400);sleepFor(2);
        navigateBack();
    }
@Test(priority = 110)
    public void FooterDownPillPackButton() throws InterruptedException {
        getInitElements();sleepFor(2);
        scrollUpDown(5500);
        sleepFor(2);
        setFooterDownPillPackButton();sleepFor(1);
        scrollUpDown(400);sleepFor(2);
        navigateBack();
    }
@Test(priority = 111)
    public void FooterDownAbeBooksButton() throws InterruptedException {
        getInitElements();sleepFor(2);
        scrollUpDown(5500);
        sleepFor(2);
        setFooterDownAbeBooksButton();sleepFor(1);
        scrollUpDown(400);sleepFor(2);
        navigateBack();
    }
@Test(priority = 112)
    public void FooterDownAmazonIgniteButton() throws InterruptedException {
        getInitElements();sleepFor(2);
        scrollUpDown(5500);
        sleepFor(2);
        setFooterDownAmazonIgniteButton();sleepFor(1);
        scrollUpDown(400);sleepFor(2);
        navigateBack();
    }
@Test(priority = 113)
    public void FooterDownCreateSpaceButton() throws InterruptedException {
        getInitElements();sleepFor(2);
        scrollUpDown(5500);
        sleepFor(2);
        setFooterDownCreateSpaceButton();sleepFor(1);
        scrollUpDown(100);sleepFor(2);
        navigateBack();
    }
@Test(priority = 114)
    public void FooterDownKindleDirectPublishingButton() throws InterruptedException {
        getInitElements();sleepFor(2);
        scrollUpDown(5500);
        sleepFor(2);
        setFooterDownKindleDirectPublishingButton();sleepFor(1);
        scrollUpDown(100);sleepFor(2);
        navigateBack();
    }
@Test(priority = 115)
    public void FooterDownWootButton() throws InterruptedException {
        getInitElements();sleepFor(2);
        scrollUpDown(5500);
        sleepFor(2);
        setFooterDownWootButton();sleepFor(1);
        scrollUpDown(100);sleepFor(2);
        navigateBack();
    }
@Test(priority = 116)
    public void FooterDownAmazonRenewedButton() throws InterruptedException {
        getInitElements();sleepFor(2);
        scrollUpDown(5500);
        sleepFor(2);
        setFooterDownAmazonRenewedButton();sleepFor(1);
        scrollUpDown(100);sleepFor(2);
        navigateBack();
    }
@Test(priority = 117)
    public void FooterDownACXButton() throws InterruptedException {
        getInitElements();sleepFor(2);
        scrollUpDown(5500);
        sleepFor(2);
        setFooterDownACXButton();sleepFor(1);
        scrollUpDown(100);sleepFor(2);
        navigateBack();
    }
@Test(priority = 118)
    public void FooterDownAmazonRapidsButton() throws InterruptedException {
        getInitElements();sleepFor(2);
        scrollUpDown(5500);
        sleepFor(2);
        setFooterDownAmazonRapidsButton();sleepFor(1);
        scrollUpDown(100);sleepFor(2);
        navigateBack();
    }
@Test(priority = 119)
    public void FooterDownDPReviewButton() throws InterruptedException {
        getInitElements();sleepFor(2);
        scrollUpDown(5500);
        sleepFor(2);
        setFooterDownDPReviewButton();sleepFor(1);
        scrollUpDown(100);sleepFor(2);
        navigateBack();
    }
@Test(priority = 120)
    public void FooterDownPrimeNowButton() throws InterruptedException {
        getInitElements();sleepFor(2);
        scrollUpDown(5500);
        sleepFor(2);
        setFooterDownPrimeNowButton();sleepFor(1);
        scrollUpDown(100);sleepFor(2);
        navigateBack();
    }
@Test(priority = 121)
    public void FooterDownZapposButton() throws InterruptedException {
        getInitElements();sleepFor(2);
        scrollUpDown(5500);
        sleepFor(2);
        setFooterDownZapposButton();sleepFor(1);
        scrollUpDown(100);sleepFor(2);
        navigateBack();
    }
@Test(priority = 122)
    public void FooterDownAmazonSecondChanceButton() throws InterruptedException {
        getInitElements();sleepFor(2);
        scrollUpDown(5500);
        sleepFor(2);
        setFooterDownAmazonSecondChanceButton();sleepFor(1);
        scrollUpDown(100);sleepFor(2);
        navigateBack();
    }
@Test(priority = 123)
    public void FooterDownAlexaButton() throws InterruptedException {
        getInitElements();sleepFor(2);
        scrollUpDown(5500);
        sleepFor(2);
        setFooterDownAlexaButton();sleepFor(1);
        scrollUpDown(100);sleepFor(2);
        navigateBack();
    }
@Test(priority = 124)
    public void FooterDownAmazonWebServiceButton() throws InterruptedException {
        getInitElements();sleepFor(2);
        scrollUpDown(5500);
        sleepFor(2);
        setFooterDownAmazonWebServiceButton();sleepFor(1);
        scrollUpDown(100);sleepFor(2);
        navigateBack();
    }
@Test(priority = 125)
    public void FooterDownEastDaneButton() throws InterruptedException {
        getInitElements();sleepFor(2);
        scrollUpDown(5500);
        sleepFor(2);
        setFooterDownEastDaneButton();sleepFor(1);
        scrollUpDown(100);sleepFor(2);
        navigateBack();
    }
@Test(priority = 126)
    public void FooterDownAmazonPhotosButton() throws InterruptedException {
        getInitElements();sleepFor(2);
        scrollUpDown(5500);
        sleepFor(2);
        setFooterDownAmazonPhotosButton();sleepFor(1);
        scrollUpDown(100);sleepFor(2);
        navigateBack();
    }
@Test(priority = 127)
    public void FooterDownRingButton() throws InterruptedException {
        getInitElements();sleepFor(2);
        scrollUpDown(5500);
        sleepFor(2);
        setFooterDownRingButton();sleepFor(1);
        scrollUpDown(100);sleepFor(2);
        navigateBack();
    }
@Test(priority = 128)
    public void FooterDownConditionsOfUseButton() throws InterruptedException {
        getInitElements();sleepFor(2);
        scrollUpDown(5500);
        sleepFor(2);
        setFooterDownConditionsOfUseButton();sleepFor(1);
        scrollUpDown(100);sleepFor(2);
        navigateBack();
    }
@Test(priority = 129)
    public void FooterDownPrivacyNoticeButton() throws InterruptedException {
        getInitElements();sleepFor(2);
        scrollUpDown(5500);
        sleepFor(2);
        setFooterDownPrivacyNoticeButton();sleepFor(1);
        scrollUpDown(100);sleepFor(2);
        navigateBack();
    }
@Test(priority = 130)
    public void FooterDownInterestBasedAdsButton() throws InterruptedException {
        getInitElements();sleepFor(2);
        scrollUpDown(5500);
        sleepFor(2);
        setFooterDownInterestBasedAdsButton();sleepFor(1);
        scrollUpDown(100);sleepFor(2);
        navigateBack();
    }
@Test(priority = 131)
    public void FooterDownAmazonLicenceButton() throws InterruptedException {
        getInitElements();sleepFor(2);
        scrollUpDown(5500);
        sleepFor(2);
        setFooterDownAmazonLicenceButton();sleepFor(1);
        scrollUpDown(100);sleepFor(2);
        navigateBack();
    }








}
