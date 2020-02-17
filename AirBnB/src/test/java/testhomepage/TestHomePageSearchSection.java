package testhomepage;

import homepage.pageobject.HomepageSearchSection;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestHomePageSearchSection extends HomepageSearchSection {
    public static void getInItElements(){
        PageFactory.initElements(driver,HomepageSearchSection.class);
    }
    @Test(priority = 1)
    public static void testValidateWhereBar() throws InterruptedException {
        getInItElements();
        checkWhereBarType();
        sleepFor(2);
        checkWhereBarSelectLA();
        sleepFor(1);
    }

    @Test(priority = 2)
    public static void testCheckInBar() throws InterruptedException {
        getInItElements();
        clickCheckInBar();
        sleepFor(1);
    }

    @Test(priority = 3)
    public static void testCheckOutBar() throws InterruptedException {
        getInItElements();
        clickCheckOutBar();
        sleepFor(1);
    }

    @Test(priority = 4)
    public static void testSelectDateCheckInBar() throws InterruptedException {
        testCheckInBar();
        clickCheckInBarSelectDate18Feb();
        sleepFor(1);
    }

    @Test(priority = 5)
    public static void testSelectDateCheckOutBar() throws InterruptedException {
        testCheckOutBar();
        clickCheckOutBarSelectDate25Feb();
        sleepFor(1);
    }

    @Test(priority = 6)
    public static void testClickGuestsBar() throws InterruptedException {
        getInItElements();
        sleepFor(1);
        clickGuestsBar();
        sleepFor(1);
    }

    @Test(priority = 7)
    public static void testClickGuestsBar1Adults() throws InterruptedException {
        getInItElements();
        sleepFor(1);
        clickGuestsBar();
        sleepFor(1);
        clickGuestsBar1Adults();
        sleepFor(1);
    }

    @Test(priority = 8)
    public static void testClickGuestsBar1Children() throws InterruptedException {
        getInItElements();
        sleepFor(1);
        clickGuestsBar();
        sleepFor(1);
        clickGuestsBar1Children();
        sleepFor(1);
    }

    @Test(priority = 9)
    public static void testClickGuestsBar1Infants() throws InterruptedException {
        getInItElements();
        sleepFor(1);
        clickGuestsBar();
        sleepFor(1);
        clickGuestsBar1Infants();
        sleepFor(1);
    }
    @Test(priority = 10)
    public static void testSearch() throws InterruptedException {
        getInItElements();
        sleepFor(1);
        checkWhereBarType();
        checkWhereBarSelectLA();
        clickCheckInBarSelectDate18Feb();
        clickCheckOutBarSelectDate25Feb();
        clickGuestsBar();
        sleepFor(1);
        clickGuestsBar1Adults();
        clickGuestsBar1Children();
        clickGuestsBar1Infants();
        clickGuestsBar();
        clickSearchButton();
        sleepFor(3);
    }

}
