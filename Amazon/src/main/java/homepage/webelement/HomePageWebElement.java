package homepage.webelement;

import common.WebAPI;

import java.security.SecureRandom;

public class HomePageWebElement extends WebAPI {

    public static final String xPSearchElementBar="//input[@id='twotabsearchtextbox']";
    public static final String xPSearchElementButton="//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']";
    public static final String xPSearchElementHamBurger="//i[@class='hm-icon nav-sprite']";
    public static final String xPAccountAndListArrow="//a[@id='nav-link-accountList']//span[@class='nav-icon nav-arrow']";
    public static final String xPChangeLanguage="//span[@class='icp-nav-link-inner']//span[@class='nav-icon nav-arrow']";
    public static final String xPLanguageEspanish="//*[@id=\"nav-flyout-icp\"]/div[2]/a[1]/span";
    public static final String xpFullLocation="/html/body/div[1]/header/div/div[2]/div[1]/div/span/a/div[1]";
    public static final String xPLocationDone="//button[@name='glowDoneButton']";
    public static final String xPDropDownBox="//select[@id='searchDropdownBox']";
    public static final String xPTodaysDeal="/html[1]/body[1]/div[1]/header[1]/div[1]/div[2]/div[3]/div[2]/div[1]/a[1]";
    public static final String xPBestSeller="//*[@id=\"nav-xshop\"]/a[2]";
    public static final String xPFindAGift="//a[contains(text(),'Find a Gift')]";
    public static final String xPCustomerService="//a[contains(text(),'Customer Service')]";
    public static final String xPRegistry="//a[contains(text(),'Registry')]";
    public static final String xPReleases="//a[contains(text(),'New Releases')]";
    public static final String xPGiftCard="//a[contains(text(),'Gift Cards')]";
    public static final String xPSaveOnAmazonDevice="//a[@class='nav-imageHref']";
    public static final String xPCart="/html[1]/body[1]/div[1]/header[1]/div[1]/div[1]/div[2]/div[1]/a[5]";
    public static final String xPShipOutsideUsArrow="//span[@class='a-button-text a-declarative']";
    public static final String xPShipToJapan="//a[@id='GLUXCountryList_3']";
    public static final String xPShipToAustralia="//div[@class='a-popover-inner a-lgtbox-vertical-scroll']//a[@id='GLUXCountryList_0']";
    public static final String xPShipToMexico="//div[@class='a-popover-inner a-lgtbox-vertical-scroll']//a[@id='GLUXCountryList_4']";
    public static final String xPShipToSingapore="//div[@class='a-popover-inner a-lgtbox-vertical-scroll']//a[@id='GLUXCountryList_5']";
    public static final String xPShipToBangladesh="//div[@class='a-popover-inner a-lgtbox-vertical-scroll']//a[@id='GLUXCountryList_24']";
    public static final String xPShipToUK="//div[@class='a-popover-inner a-lgtbox-vertical-scroll']//a[@id='GLUXCountryList_6']";
    public static final String xPShipToAlbania="//a[@id='GLUXCountryList_9']";
    public static final String xPAmazonMusic="//*[@id=\"hmenu-content\"]/ul[34]/li[3]/a";
    public static final String xPAmazonMusicUnlimited="//div[contains(text(),'Amazon Music Unlimited')]";
    public static final String xPFireTv="//*[@id=\"hmenu-content\"]/ul[34]/li[6]/a";
    public static final String xpFireTvStick="//*[@id=\"hmenu-content\"]/ul[5]/li[3]/a";
    public static final String xPAddRightArrow="//i[@class='a-icon a-icon-next-rounded']";
    public static final String xPAddLeftArrow="//i[@class='a-icon a-icon-previous-rounded']";

    public static final String xPSignInButton="//*[@id=\"nav-flyout-ya-signin\"]/a/span";
    public static final String xPInputEmailField="//input[@id='ap_email']";
    public static final String xPSignInContinueButton="//input[@id='continue']";
    public static final String xPInputPasswordField="//*[@id=\"ap_password\"]";
    public static final String xPSignInSubmitButton="//*[@id=\"signInSubmit\"]";
    public static final String xPKeepMeSignInButton="//input[@name='rememberMe']";
    public static final String xPKeepMeSignInDetails="//a[@id='remember_me_learn_more_link']";
    public static final String xPSignInNeedHelpButton="//span[@class='a-expander-prompt']";
    public static final String xPSignInPrivacyNotice="//div[@id='legalTextRow']//a[contains(text(),'Privacy Notice')]";
    public static final String xPSignInConditionsOfUSe="//div[@id='legalTextRow']//a[contains(text(),'Conditions of Use')]";
    public static final String xPSignInForgotPassword="//a[@id='auth-fpp-link-bottom']";
    public static final String xPSignInYourGarage="//span[contains(text(),'Your Garage')]";

    public static final String xPSignInYourGaragePartsHover="//div[@id='nav-subnav']//a[5]//span[2]";
    public static final String xPSignInYourGarageAccessoriesHover="//a[6]//span[2]";
    public static final String xPSignInYourGarageToolsHover="//a[7]//span[2]";
    public static final String xPSignInYourGarageCarCareHover="//a[8]//span[2]";
    public static final String xPSignInYourMotorCyclePartsHover="//a[9]//span[2]";
    public static final String xPSignInYourTruckHover="//a[10]//span[2]";
    public static final String xPSignInYourRvHover="//a[11]//span[2]";
    public static final String xPSignInYourTiresWheelsHover="//a[12]//span[2]";


    //Footer Top page
    public static final String xPFooterGetToKnowCareerButton="//a[contains(text(),'Careers')]";
    public static final String xPFooterGetToKnowBlogButton="//a[contains(text(),'Blog')]";
    public static final String xPFooterGetToKnowAboutAmazonButton="//a[contains(text(),'About Amazon')]";
    public static final String xPFooterGetToKnowPressCenterButton="//a[contains(text(),'Press Center')]";
    public static final String xPFooterGetToKnowInvestorRelationsButton="//a[contains(text(),'Investor Relations')]";
    public static final String xPFooterGetToKnowAmazonDeviceButton="//a[contains(text(),'Amazon Devices')]";
    public static final String xPFooterGetToKnowAmazonToursButton="//a[contains(text(),'Amazon Tours')]";

    public static final String xPFooterMakeMoneyWithSellOnAmazonButton= "//li[@class='nav_first']//a[@class='nav_a'][contains(text(),'Sell on Amazon')]";
    public static final String xPFooterMakeMoneyWithSellUnderAmazonAcceleratorButton="//a[contains(text(),'Sell Under Amazon Accelerator')]";
    public static final String xPFooterMakeMoneyWithSellOnAmazonHandMadeButton="//a[contains(text(),'Sell on Amazon Handmade')]";
    public static final String xPFooterMakeMoneyWithSellYourServiceOnAmazonButton="//a[contains(text(),'Sell Your Services on Amazon')]";
    public static final String xPFooterMakeMoneyWithSellOnAmazonBusinessButton="//a[contains(text(),'Sell on Amazon Business')]";
    public static final String xPFooterMakeMoneyWithSellYourAppsOnAmazonButton="//a[contains(text(),'Sell Your Apps on Amazon')]";
    public static final String xPFooterMakeMoneyWithBecomeAnAffiliateButton="//a[contains(text(),'Become an Affiliate')]";
    public static final String xPFooterMakeMoneyWithAdvertiseYourProductsButton="//a[contains(text(),'Advertise Your Products')]";
    public static final String xPFooterMakeMoneyWithSelfPublishWithUsButton="//a[contains(text(),'Self-Publish with Us')]";
    public static final String xPFooterMakeMoneyWithSeeMoreButton="//a[contains(text(),'See More')]";

    public static final String xPFooterAmazonPaymentProductsSignatureCardsButton="//div[@class='navFooterVerticalColumn navAccessibility']//div[5]//ul[1]//li[1]";
    public static final String xPFooterAmazonPaymentProductsStoreCardButton="//a[contains(text(),'Amazon.com Store Card')]";
    public static final String xPFooterAmazonPaymentProductsBusinessCardButton="//a[contains(text(),'Amazon Business Card')]";
    public static final String xPFooterAmazonPaymentProductsCorporateCardLineButton="//div[@class='navFooterVerticalColumn navAccessibility']//div[5]//ul[1]//li[4]";
    public static final String xPFooterAmazonPaymentProductsStopWithPointButton="//a[contains(text(),'Shop with Points')]";
    public static final String xPFooterAmazonPaymentProductsCreditCardMarketPlaceButton="//a[contains(text(),'Reload Your Balance')]";
    public static final String xPFooterAmazonPaymentProductsCurrencyConverterButton="//a[contains(text(),'Amazon Currency Converter')]";

    public static final String xPFooterLetUsHelpYouYourAccountButton="//a[contains(text(),'Your Account')]";
    public static final String xPFooterLetUsHelpYouYourOrdersButton="//a[contains(text(),'Your Orders')]";
    public static final String xPFooterLetUsHelpYouShippingRatesAndPolicesButton="//a[contains(text(),'Shipping Rates & Policies')]";
    public static final String xPFooterLetUsHelpYouAmazonPrimeButton="//div[@class='navFooterLinkCol navAccessibility']//a[@class='nav_a'][contains(text(),'Amazon Prime')]";
    public static final String xPFooterLetUsHelpYouReturnsAndReplacementButton="//a[contains(text(),'Returns & Replacements')]";
    public static final String xPFooterLetUsHelpYouManageYourContentAndDeviceButton="//a[contains(text(),'Manage Your Content and Devices')]";
    public static final String xPFooterLetUsHelpYouAmazonAssistantButton="//a[contains(text(),'Amazon Assistant')]";
    public static final String xPFooterLetUsHelpYouHelpButton="//a[@class='nav_a'][contains(text(),'Help')]";


    public static final String xPFooterDownAmazonMusicButton="//a[contains(text(),'Amazon Music')]";
    public static final String xPFooterDownAmazonBusinessButton="//td[@class='navFooterDescItem']//a[@class='nav_a'][contains(text(),'Amazon Business')]";
    public static final String xPFooterDownAudibleButton="//a[contains(text(),'Audible')]";
    public static final String xPFooterDownFabricButton="//a[contains(text(),'Fabric')]";
    public static final String xPFooterDownPrimeVideoDirectButton="//a[contains(text(),'Prime Video Direct')]";
    public static final String xPFooterDownEeroWifiButton="//a[contains(text(),'eero WiFi')]";
    public static final String xPFooterDownAmazonAdvertisingButton="//a[contains(text(),'Amazon Advertising')]";
    public static final String xPFooterDownAmazonFreshButton="//a[contains(text(),'Amazon Fresh')]";
    public static final String xPFooterDownBrookDepositoryButton="//tr[5]//td[3]";
    public static final String xPFooterDownGoodReadsButton="//a[contains(text(),'Goodreads')]";
    public static final String xPFooterDownShopBopButton="//a[contains(text(),'Shopbop')]";
    public static final String xPFooterDownNeighborsAppButton="//a[contains(text(),'Neighbors App')]";
    public static final String xPFooterDownAmazonDriveButton="//a[contains(text(),'Amazon Drive')]";
    public static final String xPFooterDownAmazonGlobalButton="//a[contains(text(),'AmazonGlobal')]";
    public static final String xPFooterDownBoxOfficeMojoButton="//a[contains(text(),'Box Office Mojo')]";
    public static final String xPFooterDownIMDBButton="//tr[7]//td[5]//a[1]";
    public static final String xPFooterDownAmazonWareHouseButton="//a[contains(text(),'Amazon Warehouse')]";
    public static final String xPFooterDownSubscribeWithAmazonButton="//a[contains(text(),'Subscribe with Amazon')]";
    public static final String xPFooterDownSixPmButton="//a[contains(text(),'6pm')]";
    public static final String xPFooterDownHomeServiceButton="//a[contains(text(),'Home Services')]";
    public static final String xPFooterDownComiXologyButton="//a[contains(text(),'ComiXology')]";
    public static final String xPFooterDownImdbButton="//a[contains(text(),'IMDbPro')]";
    public static final String xPFooterDownWholeFoodsMarketButton="//a[contains(text(),'Whole Foods Market')]";
    public static final String xPFooterDownPillPackButton="//a[contains(text(),'PillPack')]";
    public static final String xPFooterDownAbeBooksButton="//a[contains(text(),'AbeBooks')]";
    public static final String xPFooterDownAmazonIgniteButton="//a[contains(text(),'Amazon Ignite')]";
    public static final String xPFooterDownCreateSpaceButton="//a[contains(text(),'CreateSpace')]";
    public static final String xPFooterDownKindleDirectPublishingButton="//a[contains(text(),'Kindle Direct Publishing')]";
    public static final String xPFooterDownWootButton="//a[contains(text(),'Woot!')]";
    public static final String xPFooterDownAmazonRenewedButton="//a[contains(text(),'Amazon Renewed')]";
    public static final String xPFooterDownACXButton="//a[contains(text(),'ACX')]";
    public static final String xPFooterDownAmazonRapidsButton="//a[contains(text(),'Amazon Rapids')]";
    public static final String xPFooterDownDPReviewButton="//a[contains(text(),'DPReview')]";
    public static final String xPFooterDownPrimeNowButton="//a[contains(text(),'Prime Now')]";
    public static final String xPFooterDownZapposButton="//a[contains(text(),'Zappos')]";
    public static final String xPFooterDownAmazonSecondChanceButton="//a[contains(text(),'Amazon Second Chance')]";
    public static final String xPFooterDownAlexaButton="//a[contains(text(),'Alexa')]";
    public static final String xPFooterDownAmazonWebServiceButton="//a[contains(text(),'Amazon Web Services')]";
    public static final String xPFooterDownEastDaneButton="//a[contains(text(),'East Dane')]";
    public static final String xPFooterDownAmazonPhotosButton="//a[contains(text(),'Amazon Photos')]";
    public static final String xPFooterDownRingButton="//a[contains(text(),'Ring')]";

    public static final String xPFooterDownConditionsOfUseButton="//a[contains(text(),'Conditions of Use')]";
    public static final String xPFooterDownPrivacyNoticeButton="//a[contains(text(),'Privacy Notice')]";
    public static final String xPFooterDownInterestBasedAdsButton="//a[contains(text(),'Interest-Based Ads')]";
    public static final String xPFooterDownAmazonLicenceButton="//li[contains(text(),'© 1996-2020, Amazon.com, Inc. or its affiliates')]";

//    public static final String xPHomePageHeader="//div[@id='nav-xshop']";
//    public static final String xPHomePageFooterTopGetToKnow="/html[1]/body[1]/div[1]/div[4]/div[1]/div[1]/div[1]";
//    public static final String xPHomePageFooterDown="//div[@class='navFooterLine navFooterLinkLine navFooterDescLine']";
//



}
