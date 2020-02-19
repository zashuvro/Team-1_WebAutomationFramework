package homepage.pageobject;

import homepage.webelement.HomePageWebElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.logging.Logger;

public class HomePage extends HomePageWebElement {

    @FindBy(how = How.XPATH, using = menueButtonXpath)
    public static WebElement manuButton;
    public static WebElement getManuButton (){ return manuButton; }
    public static void clickManuButton(){ getManuButton().click(); }

    @FindBy(how = How.XPATH, using = liveTvXpath)
    public static WebElement liveTvButton;
    public static WebElement getLiveTvButton(){return liveTvButton;}
    public static void clickLiveTvButton(){getLiveTvButton().click();}

    @FindBy(how = How.XPATH, using = searchButtonXpath)
    public static WebElement searchButton;
    public static WebElement getSearchButton(){return searchButton;}
    public static void clickSearchButton(){getSearchButton().click();}

    @FindBy(how = How.XPATH, using = USButtonXpath)
    public static WebElement USbutton;
    public static WebElement getUSbutton(){return USbutton;}
    public static void clickUSbutton(){getUSbutton().click();}

    @FindBy(how = How.XPATH, using = WorldButtonXpath)
    public static WebElement WorldButton;
    public static WebElement getWorldButton(){return WorldButton;}
    public static void clickWorldButton(){getWorldButton().click();}

    @FindBy(how = How.XPATH, using = politicsButtonXpath)
    public static WebElement politicesButton;
    public static WebElement getPoliticesButton(){return politicesButton;}
    public static void clickPoliticesButton(){getPoliticesButton().click();}

    @FindBy(how = How.XPATH, using = businessButtonXpath)
    public static WebElement businessButton;
    public static WebElement getBusinessButton(){return businessButton;}
    public static void clickBusinessButton(){getBusinessButton().click();}

    @FindBy(how = How.XPATH, using = opinionButtonXpath)
    public static WebElement opinionButton;
    public static WebElement getOpinionButton(){return opinionButton;}
    public static void clickOpinionButton(){getOpinionButton().click();}

    @FindBy(how = How.XPATH, using = healthButtonXpath)
    public static WebElement healthButton;
    public static WebElement getHealthButton(){return healthButton;}
    public static void clickHealthButton(){getHealthButton().click();}

    @FindBy(how = How.XPATH, using = entertainmentButtonXpath)
    public static WebElement entertenmentButton;
    public static WebElement getEntertenmentButton(){return entertenmentButton;}
    public static void clickEntertenmentButton(){getEntertenmentButton().click();}

    @FindBy(how = How.XPATH, using = styleButtonXpath)
    public static WebElement styleButton;
    public static WebElement getStyleButton(){return styleButton;}
    public static void clickStyleButton(){getStyleButton().click();}

    @FindBy(how = How.XPATH, using = travelButtonXpath)
    public static WebElement travelButton;
    public static WebElement getTravelButton(){return travelButton;}
    public static void clickTravelButton(){getTravelButton().click();}

    @FindBy(how = How.XPATH, using = sportsButtonXpath)
    public static WebElement sportsButton;
    public static WebElement getSportsButton(){return sportsButton;}
    public static void clickSportsButton(){getSportsButton().click();}

    @FindBy(how = How.XPATH, using = videosButtonXpath)
    public static WebElement videoButton;
    public static WebElement getVideoButton (){return videoButton;}
    public static void clickVideoButton(){getVideoButton().click();}


    @FindBy(how = How.XPATH, using = editionTabXpath)
    public static WebElement editionTab;
    public static WebElement getEditionTab(){return editionTab;}
    public static void clickEditionTab(){getEditionTab().click();}

    @FindBy(how = How.XPATH, using = editionUSXpath)
    public static WebElement editionUS;
    public static WebElement getEditionUS(){return editionUS;}
    public static void clickEditionUS(){getEditionUS().click();}

    @FindBy(how = How.XPATH, using = editionInternationalXpath)
    public static WebElement editionInterntional;
    public static WebElement getEditionInterntional(){return editionInterntional;}
    public static void clickEditionInternational(){getEditionInterntional().click();}

    @FindBy(how = How.XPATH, using = editionArabicXpath)
    public static WebElement editionArabic;
    public static WebElement getEditionArabic(){return editionArabic;}
    public static void clickEditionArabic(){getEditionArabic().click();}

    @FindBy(how = How.XPATH, using = editionEspanolXpath)
    public static WebElement editionEspanol;
    public static WebElement getEditionEspanol(){return editionEspanol;}
    public static void clickeditionEspanol(){getEditionEspanol().click();}

    @FindBy(how = How.XPATH, using = manuBattonSearchBarXpath)
    public static WebElement manuBattonSearchBar;

    public static WebElement getManuBattonSearchBar(){return manuBattonSearchBar;}
    public static void clickmanuButtonSearchBar(){getManuBattonSearchBar().sendKeys("Bangladesh", Keys.ENTER);}

    @FindBy(how = How.XPATH, using = worldAfricaXpath)
    public static WebElement worldAfrica;
    public static WebElement getWorldAfrica(){return worldAfrica;}
    public static void clickWorldAfrica(){getWorldAfrica().click();}

    @FindBy(how = How.XPATH, using = worldAmericasXpth)
    public static WebElement worldAmericas;
    public static WebElement getWorldAmericas(){return worldAmericas; }
    public static void clickWorldAmericas(){getWorldAmericas().click();}

    @FindBy(how = How.XPATH, using = worldAsiaXpath)
    public static WebElement worldAsia;
    public static  WebElement getWorldAsia(){return worldAsia;}
    public static void clickWorldAsia(){getWorldAsia().click();}

    @FindBy(how = How.XPATH, using = worldAustraliaXpath)
    public static WebElement worldAustralia;
    public static WebElement getWorldAustralia(){return worldAustralia;}
    public static void clickWorldAustralia(){getWorldAustralia().click();}

    @FindBy(how = How.XPATH, using = worldChinaXpath)
    public static WebElement worldChina;
    public static WebElement getWorldChina(){return worldChina;}
    public static void clickWorldChina(){getWorldAustralia().click();}

    @FindBy(how = How.XPATH, using = worldEuropeXpath)
    public static WebElement worldEurope;
    public static WebElement getWorldEurope(){return worldEurope;}
    public static void clickWorldEurope(){getWorldEurope().click();}

    @FindBy(how = How.XPATH,using = worldIndiaXpath)
    public static WebElement worldIndia;
    public static WebElement getWorldIndia(){return worldIndia;}
    public static void cickWorldIndia(){getWorldIndia().click();}

    @FindBy(how = How.XPATH, using = worldMiddleEastXpath)
    public static WebElement worldMiddleEast;
    public static WebElement getWorldMiddleEast(){return worldMiddleEast;}
    public static void clickWorldMiddleEast(){getWorldMiddleEast().click();}

    @FindBy(how = How.XPATH,using = WorldUnitedKingdomeXpath)
    public static WebElement worldUnitedKingdome;
    public static WebElement getWorldUnitedKingdome(){return worldUnitedKingdome;}
    public static void clickWrldUnitedKingdome(){getWorldUnitedKingdome().click();}

    @FindBy(how = How.XPATH, using = manuBattonSearchBarXpath)
    public static WebElement manuBattonSearchBar1;
    public static WebElement getManuBattonSearchBar1(){return manuBattonSearchBar1;}
    public static void clickmanuButtonSearchBar1(){getManuBattonSearchBar1().sendKeys("Dhaka", Keys.ENTER);}

    @FindBy(how = How.XPATH, using = manuBattonSearchBarXpath)
    public static WebElement manuBattonSearchBar2;
    public static WebElement getManuBattonSearchBar2(){return manuBattonSearchBar2;}
    public static void clickmanuButtonSearchBar2(){getManuBattonSearchBar2().sendKeys("Today's news", Keys.ENTER);}

    @FindBy(how = How.XPATH, using = manuBattonSearchBarXpath)
    public static WebElement manuBattonSearchBar3;
    public static WebElement getManuBattonSearchBar3(){return manuBattonSearchBar3;}
    public static void clickmanuButtonSearchBar3(){getManuBattonSearchBar3().sendKeys("New York", Keys.ENTER);}

    @FindBy(how = How.XPATH, using = manuBattonSearchBarXpath)
    public static WebElement manubuttonSearchBar4;
    public static WebElement getManubuttonSearchBar4(){return manubuttonSearchBar4;}
    public static void clickManuButtonsearchBar4(){getManubuttonSearchBar4().sendKeys("Sheikh Hasina", Keys.ENTER);}

    //list of ContainerBox
    @FindBy(how = How.XPATH, using = boxoFFooterStyleXpath)
    public static WebElement boxOfFooterStyle;
    public static WebElement getBoxOfFooterStyle(){return boxOfFooterStyle;}
    public static void listOfBoxFooterStyle(){getBoxOfFooterStyle() ;}

    @FindBy(how = How.XPATH, using = boxOfHeadderStyleXpath)
    public static WebElement boxOfHeadderStyle;
    public static WebElement getBoxOfHeadderStyle(){return boxOfHeadderStyle;}
    public static void checkAndListOfBoxHeadderStyle(){getBoxOfHeadderStyle();}

    @FindBy(how = How.XPATH, using = footerBoxInUSboxXpath)
    public static WebElement footerBoxInUSbox;
    public static WebElement getFooterBoxInUSbox(){return footerBoxInUSbox;}
    public static void listOFFooterBoxInUS(){getBoxOfHeadderStyle();}

    @FindBy(how = How.XPATH, using = manuBarUSCrimeJasticXpath)
    public static WebElement manuBarUSCrimeJastic;
    public static WebElement getManuBarUSCrimeJastic (){return manuBarUSCrimeJastic;}
    public static void clickmanuBarUSCrimeJastic(){getManuBarUSCrimeJastic().click();}

    @FindBy(how = How.XPATH, using = manuBUSEnergyEnviromentXpath)
    public static WebElement manuBUSEnergyEnviroment;
    public static WebElement getManuBUSEnergyEnviroment(){return manuBUSEnergyEnviroment;}
    public static void clickmanuBUSEnergyEnviroment(){getManuBUSEnergyEnviroment().click();}

    @FindBy(how = How.XPATH, using = manubarFoodXpath)
    public static WebElement manubarFood;
    public static WebElement getManubarFood(){return manubarFood;}
    public static void clickManubarFood(){getManubarFood().click();}

    @FindBy(how = How.XPATH, using = manuBar45Xpath)
    public static WebElement manuBar45;
    public static WebElement getManuBar45(){return manuBar45;}
    public static void clickmanuBar45(){getManuBar45().click();}

    @FindBy (how = How.XPATH, using = manubarCNNStoreXpath)
    public static WebElement manubarCNNStore;
    public static WebElement getManubarCNNStore(){return manubarCNNStore; }
    public static void clickmanubarCNNStore(){getManubarCNNStore().click();}

    @FindBy(how = How.XPATH, using = manuBarPhotosXp)
    public static WebElement manuBarPhotos;
    public static WebElement getManuBarPhotos(){return manuBarPhotos;}
    public static void clickmanuBarPhotos(){getManubarCNNStore().click();}

    @FindBy(how = How.XPATH, using = lastFooterBoxXp)
    public static WebElement lastFooterBox;
    public static WebElement getLastFooterBox(){return lastFooterBox;}
    public static void seelastFooterBox(){getLastFooterBox();}

    @FindBy(how = How.XPATH, using = cnnLinklistxp)
    public static WebElement cnnLinklist;
    public static WebElement getCnnLinklist(){return cnnLinklist;}
    public static void seecnnLinklist(){getCnnLinklist().click();}

    @FindBy(how = How.XPATH, using = linkStyleTearmofUse)
    public static WebElement linkStyleTearm;
    public static WebElement getLinkStyleTearm(){return linkStyleTearm;}
    public static void clicklinkStyleTearm(){getLinkStyleTearm().click();}

    @FindBy(how = How.XPATH, using = linkStylePrivecyXp)
    public static WebElement linkStylePrivecy;
    public static WebElement getLinkStylePrivecy(){return linkStylePrivecy;}

    @FindBy(how = How.XPATH, using = linkFoNotSellMyPersonalStuffXp)
    public static WebElement linkFoNotSellMyPersonalStuff;
    public static WebElement getLinkFoNotSellMyPersonalStuff(){return linkFoNotSellMyPersonalStuff;}

    @FindBy(how = How.XPATH, using = linkAddChoice)
    public static WebElement linkAddChoic;
    public static WebElement getLinkAddChoic(){return linkAddChoic;}
    public static void clicklinkAddChoic(){getLinkAddChoic().click();}

    @FindBy(how = How.XPATH, using = linkAboutUsXp)
    public static WebElement linkAboutUs;
    public static WebElement getLinkAboutUs(){return linkAboutUs;}
    public static void clicklinkAboutUs(){getLinkAboutUs().click();}

    @FindBy(how = How.XPATH, using = linkLicenceFotegeXp)
    public static WebElement linkLicenceFotege;
    public static WebElement getLinkLicenceFotege(){return linkLicenceFotege;}
    public static void clicklinkLicenceFotege(){getLinkLicenceFotege().click();}





}
