package contactpage.pageobject;

import contactpage.webelement.ContactPageWebelement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import javax.swing.plaf.PanelUI;

public class ContactPage extends ContactPageWebelement {

    @FindBy(how = How.XPATH, using = contactXp)
    public static WebElement contact;
    public static WebElement getContact(){return contact;}
    public static void clickContact(){getContact().click();}

    @FindBy(how = How.XPATH, using = toggableBarXp)
    public static WebElement toggableBar;
    public static WebElement getToggableBar(){return toggableBar;}
    public static void clicktoggableBar(){getToggableBar().click();}

    @FindBy(how = How.XPATH, using = toggableBarMemberXp)
    public static WebElement toggableBarMember;
    public static WebElement getToggableBarMember(){return toggableBarMember;}
    public static void clicktoggableBarMember(){getToggableBarMember().click();}

    @FindBy(how = How.XPATH, using = memberToggableBarXp)
    public static WebElement memberToggableBar;
    public static WebElement getMemberToggableBar(){return memberToggableBar;}
    public static void clickmemberToggableBar(){getMemberToggableBar().click();}

    @FindBy(how = How.XPATH, using = interestedInHealthInsurenceXp)
    public static WebElement interestedInHealthInsurence;
    public static WebElement getInterestedInHealthInsurence(){return interestedInHealthInsurence;}
    public static void  clickinterestedInHealthInsurence(){getInterestedInHealthInsurence().click();}

    @FindBy(how = How.XPATH, using = selectYourPlanXp)
    public static WebElement selectYourPlan;
    public static WebElement getSelectYourPlan(){return selectYourPlan;}
    public static void clickselectYourPlan(){getSelectYourPlan().click();}

    @FindBy(how = How.XPATH, using = medicarePlansXp)
    public static WebElement medicarePlans;
    public static WebElement getMedicarePlans(){return medicarePlans;}
    public static void clickmedicarePlans(){getMedicarePlans().click();}

    @FindBy(how = How.XPATH,using = callXp)
    public static WebElement call;
    public static WebElement getCall(){return call;}
    public static void clickcall(){getCall().click();}

    @FindBy(how = How.XPATH, using = WhyDoINeedHealthInsurenceXp)
    public static WebElement WhyDoINeedHealthInsurence;
    public static WebElement getWhyDoINeedHealthInsurence(){return WhyDoINeedHealthInsurence;}
    public static void clickWhyDoINeedHealthInsurence(){getWhyDoINeedHealthInsurence().click();}

    @FindBy(how = How.XPATH,using = whyShouldItestHealthFirstXP)
    public static WebElement whyShouldItestHealthFirst;
    public static WebElement getWhyShouldItestHealthFirst(){return whyShouldItestHealthFirst;}
    public static void clickwhyShouldItestHealthFirst(){getWhyShouldItestHealthFirst().click();}

    @FindBy(how = How.XPATH, using = howCanIEnroleInHelthFirstPlanXp)
    public static WebElement howCanIEnroleInHelthFirstPlan;
    public static WebElement getHowCanIEnroleInHelthFirstPlan(){return howCanIEnroleInHelthFirstPlan;}
    public static void clickhowCanIEnroleInHelthFirstPlan(){getHowCanIEnroleInHelthFirstPlan().click();}



}
