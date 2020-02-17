package testhomepage;

import homepage.pageobject.HomePageHelpTab;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestHomePageHelpTab extends HomePageHelpTab {

    public static void getInItElements(){
        PageFactory.initElements(driver,HomePageHelpTab.class);
    }

    @Test(priority = 1)
    public static void testHelpTab() throws InterruptedException {
        getInItElements();
        sleepFor(1);
        clickHelpButton();
        String actual=getValidateHelpTab();
        String expected="Search by keyword";
        assertCheck(actual,expected);
        sleepFor(1);
    }

    @Test(priority = 2)
    public static void testHelpTabSearch() throws InterruptedException {
        getInItElements();
        sleepFor(1);
        clickHelpButton();
        clickHelpTabSearch();
        sleepFor(1);
    }

    @Test(priority = 3)
    public static void testHelpTabSearchSelectLA() throws InterruptedException {
        getInItElements();
        sleepFor(1);
        clickHelpButton();
        clickHelpTabSearch();
        sleepFor(1);
        clickHelpTabSearchSelectLA();
        sleepFor(1);
        String expected="Las Vegas, NV";
        String actual=getValidateSelectLA();
        assertCheck(actual,expected);

    }

    @Test(priority = 4)
    public static void testHelpTabSearchClickReadMore() throws InterruptedException {
        getInItElements();
        sleepFor(1);
        clickHelpButton();
        sleepFor(1);
        clickReadMore();
        sleepFor(1);
    }

    @Test(priority = 5)
    public static void testResetPassReadMoreReadMore() throws InterruptedException {
        getInItElements();
        sleepFor(1);
        clickHelpButton();
        sleepFor(2);
        clickResetPassReadMore();
        sleepFor(1);
    }

    @Test(priority = 6)
    public static void testReservationArrow() throws InterruptedException {
        getInItElements();
        sleepFor(1);
        clickHelpButton();
        sleepFor(2);
        scrollToWebElement(xPathReservationArrow);
        clickReservationArrow();
        sleepFor(1);
    }

    @Test(priority = 7)
    public static void testContactingArrow() throws InterruptedException {
        getInItElements();
        sleepFor(1);
        clickHelpButton();
        sleepFor(2);
        scrollToWebElement(xPathContactingArrow);
        clickContactingArrow();
        sleepFor(1);
    }

    @Test(priority = 8)
    public static void testPricesArrow() throws InterruptedException {
        getInItElements();
        sleepFor(1);
        clickHelpButton();
        sleepFor(2);
        scrollToWebElement(xPathPricesArrow);
        clickPricesArrow();
        sleepFor(1);
    }

    @Test(priority = 9)
    public static void testVisitTheHelpCenterButton() throws InterruptedException {
        getInItElements();
        sleepFor(1);
        clickHelpButton();
        sleepFor(2);
        clickVisitTheHelpCenter();
        sleepFor(1);
    }

    @Test(priority = 10)
    public static void testGiveFeedback() throws InterruptedException {
        getInItElements();
        sleepFor(1);
        clickHelpButton();
        sleepFor(2);
        clickGiveFeedback();
        sleepFor(1);
    }





}
