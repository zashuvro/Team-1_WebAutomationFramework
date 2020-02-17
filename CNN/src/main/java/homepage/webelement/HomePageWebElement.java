package homepage.webelement;

//import com.sun.org.apache.bcel.internal.generic.PUSH;
import common.WebAPI;

import javax.swing.plaf.PanelUI;

public class HomePageWebElement extends WebAPI {


    public static final String menueButtonXpath = "//*[@class='menu-icon']";
    public static final String liveTvXpath = "//span[@class='Text-sc-1amvtpj-0-span bcvWKK']";
    public static final String searchButtonXpath = "//button[@class='buttonstyles__ButtonBase-augw5g-0 headerstyles__IconButton-sc-1vh4dor-0 ikSuiI']//*[@class='search-icon']";
    public static final String USButtonXpath = "//li[@class='nav-linksstyles__SectionTitle-sc-1tike8v-3 hNYoQv']//a[@name='us'][contains(text(),'US')]";
    public static final String WorldButtonXpath = "//li[@class='nav-linksstyles__SectionTitle-sc-1tike8v-3 hNYoQv']//a[@name='world'][contains(text(),'World')]";
    public static final String politicsButtonXpath = "//li[@class='nav-linksstyles__SectionTitle-sc-1tike8v-3 hNYoQv']//a[@name='politics'][contains(text(),'Politics')]";
    public static final String businessButtonXpath = "//li[@class='nav-linksstyles__SectionTitle-sc-1tike8v-3 hNYoQv']//a[@name='business'][contains(text(),'Business')]";
    public static final String opinionButtonXpath = "//li[@class='nav-linksstyles__SectionTitle-sc-1tike8v-3 hNYoQv']//a[@name='opinions'][contains(text(),'Opinion')]";
    public static final String healthButtonXpath = "//li[@class='nav-linksstyles__SectionTitle-sc-1tike8v-3 hNYoQv']//a[@name='health'][contains(text(),'Health')]";
    public static final String entertainmentButtonXpath = "//li[@class='nav-linksstyles__SectionTitle-sc-1tike8v-3 hNYoQv']//a[@name='entertainment'][contains(text(),'Entertainment')]";
    public static final String styleButtonXpath = "//li[@class='nav-linksstyles__SectionTitle-sc-1tike8v-3 hNYoQv']//a[@name='style'][contains(text(),'Style')]";
    public static final String travelButtonXpath = "//li[@class='nav-linksstyles__SectionTitle-sc-1tike8v-3 hNYoQv']//a[@name='travel'][contains(text(),'Travel')]";
    public static final String sportsButtonXpath = "//li[@class='nav-linksstyles__SectionTitle-sc-1tike8v-3 hNYoQv']//a[@name='bleacher'][contains(text(),'Sports')]";
    public static final String videosButtonXpath = "//li[@class='nav-linksstyles__SectionTitle-sc-1tike8v-3 hNYoQv']//a[@name='videos'][contains(text(),'Videos')]";
    public static final String editionTabXpath = "//div[@id='edition-picker-toggle-desktop']//span[@class='Text-sc-1amvtpj-0-span edition-pickerstyles__DropdownLabel-t9lxqp-7 cqtXjn'][contains(text(),'Edition')]";
    public static final String editionUSXpath = "//div[@class='Box-sc-1fet97o-0 edition-pickerstyles__Dropdown-t9lxqp-2 jnPNyZ']//a[@name='domestic'][contains(text(),'U.S.')]";
    public static final String editionInternationalXpath = "//div[@class='Box-sc-1fet97o-0 edition-pickerstyles__Dropdown-t9lxqp-2 jnPNyZ']//a[@name='international'][contains(text(),'International')]";
    public static final String editionArabicXpath = "//div[@class='Box-sc-1fet97o-0 edition-pickerstyles__Dropdown-t9lxqp-2 jnPNyZ']//a[@name='international'][contains(text(),'International')]";
    public static final String editionEspanolXpath = "//div[@class='Box-sc-1fet97o-0 edition-pickerstyles__Dropdown-t9lxqp-2 jnPNyZ']//a[@name='espanol'][contains(text(),'Español')]";
    public static final String manuBattonSearchBarXpath = "//input[@id='header-search-bar']";
    public static final String worldAfricaXpath = "//div[@class='Flex-sc-1sqrs56-0 headerstyles__HideOnMobile-sc-1vh4dor-9 kkGIDQ']//a[@name='africa'][contains(text(),'Africa')]";
    public static final String worldAmericasXpth = "//div[@class='Flex-sc-1sqrs56-0 headerstyles__HideOnMobile-sc-1vh4dor-9 kkGIDQ']//a[@name='americas'][contains(text(),'Americas')]";
    public static final String worldAsiaXpath = "//div[@class='Flex-sc-1sqrs56-0 headerstyles__HideOnMobile-sc-1vh4dor-9 kkGIDQ']//a[@name='asia'][contains(text(),'Asia')]";
    public static final String worldAustraliaXpath = "//div[@class='Flex-sc-1sqrs56-0 headerstyles__HideOnMobile-sc-1vh4dor-9 kkGIDQ']//a[@name='australia'][contains(text(),'Australia')]";
    public static final String worldChinaXpath = "//div[@class='Flex-sc-1sqrs56-0 headerstyles__HideOnMobile-sc-1vh4dor-9 kkGIDQ']//a[@name='china'][contains(text(),'China')]";
    public static final String worldEuropeXpath = "//div[@class='Flex-sc-1sqrs56-0 headerstyles__HideOnMobile-sc-1vh4dor-9 kkGIDQ']//a[@name='europe'][contains(text(),'Europe')]";
    public static final String worldIndiaXpath = "//div[@class='Flex-sc-1sqrs56-0 headerstyles__HideOnMobile-sc-1vh4dor-9 kkGIDQ']//a[@name='india'][contains(text(),'India')]";
    public static final String worldMiddleEastXpath = "//div[@class='Flex-sc-1sqrs56-0 headerstyles__HideOnMobile-sc-1vh4dor-9 kkGIDQ']//a[@name='middleeast'][contains(text(),'Middle East')]";
    public static final String WorldUnitedKingdomeXpath = "//div[@class='Flex-sc-1sqrs56-0 headerstyles__HideOnMobile-sc-1vh4dor-9 kkGIDQ']//a[@name='uk'][contains(text(),'United Kingdom')]";
    public static final String boxoFFooterStyleXpath = "//footer[@id='footer-nav-container']";
    public static final String boxOfHeadderStyleXpath = "//div[@class='Text-sc-1amvtpj-0 headerstyles__OverflowMask-sc-1vh4dor-2 kJeTJG']";
    public static final String footerBoxInUSboxXpath = "//body[@class='pg pg-vertical pg-vertical--news pg-homepage pg-section domestic t-light multi-ads--complete']/div/div[@id='footer-wrap']/footer[@id='footer-nav-container']/div[@class='Grid-sc-1kcyc0j-0 hFujui']/div[@class='Cell-i0zvfi-0 dxrNOP']/div[@class='Box-sc-1fet97o-0 footerstyles__NavWrap-sc-1gdpf6x-7 fKHCxI']/nav[@class='nav-linksstyles__NavLink-sc-1tike8v-1 fxRQgN']/ul[@class='nav-linksstyles__NavLinkList-sc-1tike8v-2 eSykAx']/li[1]";
    public static final String manuBarUSCrimeJasticXpath = "//div[@class='Box-sc-1fet97o-0 jSTOdN']//a[@name='crime-and-justice'][contains(text(),'Crime + Justice')]";
    public static final String manuBUSEnergyEnviromentXpath = "//div[@class='Box-sc-1fet97o-0 jSTOdN']//a[@name='energy-and-environment'][contains(text(),'Energy + Environment')]";
    public static final String manubarFoodXpath = "//div[@class='Box-sc-1fet97o-0 jSTOdN']//a[@name='food'][contains(text(),'Food')]";
    public static final String manuBar45Xpath = "//div[@class='Box-sc-1fet97o-0 jSTOdN']//a[@name='president'][contains(text(),'45')]";
    public static final String manubarCNNStoreXpath= "//div[@class='Box-sc-1fet97o-0 jSTOdN']//a[@name='cnn-store'][contains(text(),'CNN Store')]";
    public static final String manuBarPhotosXp= "//div[@class='Box-sc-1fet97o-0 jSTOdN']//a[@name='photos'][contains(text(),'Photos')]";
    public static final String lastFooterBoxXp = "//div[@class='Box-sc-1fet97o-0 copyright__CopyrightContainer-f3mp1a-2 LmrhR']";
    public static final String cnnLinklistxp = "//ul[@class='nav-linksstyles__NavLinkList-sc-1tike8v-2 ksljyS']";
    public static final String linkStyleTearmofUse = "//a[@name='terms-of-use']";
    public static final String linkStylePrivecyXp = "//a[@name='privacy-policy']";
    public static final String linkFoNotSellMyPersonalStuffXp = "//a[@name='uc_link']";
    public static final String linkAddChoice = "//a[@name='adchoices']";
    public static final String linkAboutUsXp = "//a[@name='about-us']";
    public static final String linkLicenceFotegeXp = "//a[@name='license-footage']";




}
