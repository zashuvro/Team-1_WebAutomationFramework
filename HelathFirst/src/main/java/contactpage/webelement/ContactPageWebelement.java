package contactpage.webelement;

import common.WebAPI;

public class ContactPageWebelement extends WebAPI {
    public static final String contactXp = "//a[@class='second-link'][contains(text(),'Contact')]";

    public static final String toggableBarXp = "//div[@class='nice-select custom-select wide js-toggable-select']";
    public static final String toggableBarMemberXp = "//div[@class='nice-select custom-select wide js-toggable-select open']//li[@class='option'][contains(text(),'A Member')]";
    public static final String memberToggableBarXp = "//div[@class='nice-select custom-select wide js-toggable-select']";
    public static final String interestedInHealthInsurenceXp = "//li[contains(text(),'Interested in Health Insurance')]";
    public static final String selectYourPlanXp = "//div[@class='connect-phone-select-section is-active-toggler']//div[3]//div[1]//div[1]";
    public static final String medicarePlansXp = "//li[contains(text(),'Medicare Plans')]";
    public static final String callXp = "//a[contains(text(),'1-877-237-1303')]";
    public static final String WhyDoINeedHealthInsurenceXp= "//body[contains(@class,'page-template page-template-rows page-template-common-rows page-template-rowscommon-rows-php page page-id-654 is-active-toggler')]/div[contains(@class,'site-content-contain is-active-toggler')]/div[@id='content']/div[contains(@class,'top-padded-box aquamarine-bg-box')]/div[contains(@class,'container container-medium')]/div[contains(@class,'row grid-row-align-middle')]/div[contains(@class,'col-lg-6')]/div[contains(@class,'accordion-box-list')]/div[1]/div[1]";
    public static final String whyShouldItestHealthFirstXP = "//body[contains(@class,'page-template page-template-rows page-template-common-rows page-template-rowscommon-rows-php page page-id-654 is-active-toggler')]/div[contains(@class,'site-content-contain is-active-toggler')]/div[@id='content']/div[contains(@class,'top-padded-box aquamarine-bg-box')]/div[contains(@class,'container container-medium')]/div[contains(@class,'row grid-row-align-middle')]/div[contains(@class,'col-lg-6')]/div[contains(@class,'accordion-box-list')]/div[2]/div[1]";
    public static final String howCanIEnroleInHelthFirstPlanXp = "//body[contains(@class,'page-template page-template-rows page-template-common-rows page-template-rowscommon-rows-php page page-id-654 is-active-toggler')]/div[contains(@class,'site-content-contain is-active-toggler')]/div[@id='content']/div[contains(@class,'top-padded-box aquamarine-bg-box')]/div[contains(@class,'container container-medium')]/div[contains(@class,'row grid-row-align-middle')]/div[contains(@class,'col-lg-6')]/div[contains(@class,'accordion-box-list')]/div[3]/div[1]";
}
