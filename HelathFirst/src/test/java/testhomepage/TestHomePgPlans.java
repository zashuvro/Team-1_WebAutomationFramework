package testhomepage;

import homepage.pageobject.HomePagePlans;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestHomePgPlans extends HomePagePlans {

    public static void getInitElements(){
        PageFactory.initElements(driver, HomePagePlans.class);
    }

    @Test(priority = 1)
    public static void testPlans() throws InterruptedException {
        getInitElements();
        sleepFor(2);
        mouseHoverByXpath(plansXp);
        sleepFor(2);
    }

    @Test(priority = 2)
    public static void testPlansIndivisualFamily() throws InterruptedException {
        getInitElements();
        sleepFor(2);
        mouseHoverByXpath(plansXp);
        sleepFor(2);
        mouseHoverByXpath(plansInduvizialFamilyXp);
        sleepFor(2);
    }

    @Test(priority = 3)
    public static void testplansSeeAllPlans() throws InterruptedException {
//        getInitElements();
//        mouseHoverByXpath(plansXp);
//        sleepFor(2);
//        mouseHoverByXpath(plansInduvizialFamilyXp);
//        sleepFor(2);
        testPlansIndivisualFamily();
        clickplansSeeAllPlans();
        sleepFor(2);

    }
    @Test(priority = 4)
    public static void testtextPlansInduvizialFamily() throws InterruptedException {

        testPlansIndivisualFamily();
        seetextPlansInduvizialFamily();
        sleepFor(2);
        System.out.println(getTextPlansInduvizialFamily().getText());
        String expected = "Individual & Family Plans";
        String actual = getTextPlansInduvizialFamily().getText();
        assertValidate(actual, expected);

    }

    @Test(priority = 5)
    public static void testplanMedicaidAndMangedCare() throws InterruptedException {
        testPlansIndivisualFamily();
       // sleepFor(2);
        clickplanMedicaidAndMangedCare();
        sleepFor(2);
    }

    @Test(priority = 6)
    public static void testplansEssentinalPlans() throws InterruptedException {
        testPlansIndivisualFamily();
        clickplansEssentinalPlans();
        sleepFor(2);
    }

    @Test(priority = 7)
    public static void testplanChildHealthPlus() throws InterruptedException {
        testPlansIndivisualFamily();
        clickplanChildHealthPlus();
        sleepFor(2);
    }

    @Test(priority = 8)
    public static void testplanMarketPlace() throws InterruptedException {
        testPlansIndivisualFamily();
        clickplanMarketPlace();
        sleepFor(2);
    }
    @Test(priority = 9)
    public static void testplanpersonalwellness() throws InterruptedException {
        testPlansIndivisualFamily();
        clickplanpersonalwellness();
        sleepFor(2);
    }




}
