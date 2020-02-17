package testcontactpage;

import contactpage.pageobject.ContactPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import javax.swing.plaf.SplitPaneUI;

public class TestContactPage extends ContactPage {

    public static void getINitElements (){
        PageFactory.initElements(driver,ContactPage.class);
    }

    @Test(priority = 1)
    public static void testcontact() throws InterruptedException {
        getINitElements();
        clickContact();
        sleepFor(2);
    }

    @Test(priority = 2)
    public static void testtoggableBar() throws InterruptedException {
        testcontact();
        scrollUpDown(400);
        clicktoggableBar();
        sleepFor(3);
    }

    @Test(priority = 3)
    public static void testtoggableBarMember() throws InterruptedException {
        testtoggableBar();
        clicktoggableBarMember();
        sleepFor(3);
    }

    @Test(priority = 4)
    public static void testmemberToggableBar() throws InterruptedException {
        testtoggableBarMember();
        clickmemberToggableBar();
        sleepFor(2);
    }

    @Test(priority = 5)
    public static void testinterestedInHealthInsurence() throws InterruptedException {
        testmemberToggableBar();
        clickinterestedInHealthInsurence();
        sleepFor(3);
    }
    @Test(priority = 6)
    public static void testselectYourPlan() throws InterruptedException {
        testinterestedInHealthInsurence();
        clickselectYourPlan();
        sleepFor(3);
    }

    @Test(priority = 7)
    public static void testmedicarePlans() throws InterruptedException {
        testselectYourPlan();
        clickmedicarePlans();
        sleepFor(3);

    }

    @Test(priority = 8)
    public static void testCall() throws InterruptedException {
        testmedicarePlans();
        clickcall();
        sleepFor(3);
    }

    @Test(priority = 9)
    public static void testWhyDoINeedHealthInsurence() throws InterruptedException {
        testmedicarePlans();
        clickWhyDoINeedHealthInsurence();
        scrollUpDown(400);
        sleepFor(4);
    }

    @Test(priority = 10 )
    public static void testwhyShouldItestHealthFirst() throws InterruptedException {
       testmedicarePlans();
       scrollUpDown(400);
       clickwhyShouldItestHealthFirst();
       scrollUpDown(300);
       sleepFor(3);
    }

    @Test(priority = 11)
    public static void testhowCanIEnroleInHelthFirstPlan() throws InterruptedException {
        testmedicarePlans();
        scrollUpDown(400);
        clickhowCanIEnroleInHelthFirstPlan();
        sleepFor(3);
        scrollUpDown(400);
        sleepFor(2);
    }



}
