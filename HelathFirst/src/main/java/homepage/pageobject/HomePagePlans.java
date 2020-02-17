package homepage.pageobject;

import com.google.gson.internal.$Gson$Preconditions;
import common.WebAPI;
import homepage.webelement.HomePagePlansWebelement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import javax.swing.plaf.PanelUI;

public class HomePagePlans extends HomePagePlansWebelement {

    @FindBy(how = How.XPATH, using = plansXp)
    public static WebElement plans;
    public static WebElement getPlans(){return plans;}
    //public static void hoverPlans(){getPlans()}

    @FindBy(how = How.XPATH, using = plansInduvizialFamilyXp)
    public static WebElement plansInduvizialFamily;
    public static WebElement getPlansInduvizialFamily(){return plansInduvizialFamily;}


    @FindBy(how = How.XPATH, using = plansSeeAllPlansXp)
    public static WebElement plansSeeAllPlans;
    public static WebElement getPlansSeeAllPlans(){return plansSeeAllPlans;}
    public static void clickplansSeeAllPlans(){getPlansSeeAllPlans().click();}

    @FindBy(how = How.XPATH, using = textPlansInduvizialFamilyXp)
    public static WebElement textPlansInduvizialFamily;
    public static WebElement getTextPlansInduvizialFamily(){return textPlansInduvizialFamily;}
    public static void   seetextPlansInduvizialFamily(){ getTextPlansInduvizialFamily();}

    @FindBy(how = How.XPATH, using = planMedicaidAndMangedCareXp)
    public static WebElement planMedicaidAndMangedCare;
    public static WebElement getPlanMedicaidAndMangedCare(){return planMedicaidAndMangedCare;}
    public static void clickplanMedicaidAndMangedCare(){getPlanMedicaidAndMangedCare().click();}

    @FindBy(how = How.XPATH, using = plansEssentinalPlansXp)
    public static WebElement plansEssentinalPlans;
    public static WebElement getPlansEssentinalPlans(){return plansEssentinalPlans;}
    public static void clickplansEssentinalPlans(){getPlansEssentinalPlans().click();}

    @FindBy(how = How.XPATH, using = planChildHealthPlusXp)
    public static WebElement planChildHealthPlus;
    public static WebElement getPlanChildHealthPlus(){return planChildHealthPlus;}
    public static void clickplanChildHealthPlus(){getPlanChildHealthPlus().click();}

    @FindBy(how = How.XPATH, using = planMarketPlaceXp)
    public static WebElement planMarketPlace;
    public static WebElement getPlanMarketPlace(){return planMarketPlace;}
    public static void clickplanMarketPlace(){getPlanMarketPlace().click();}

    @FindBy(how = How.XPATH, using = planpersonalwellnessXp)
    public static WebElement planpersonalwellness;
    public static WebElement getPlanpersonalwellness(){return planpersonalwellness;}
    public static void clickplanpersonalwellness(){getPlanMarketPlace().click();}

    //@FindBy(how = How.XPATH, using = s)


}


