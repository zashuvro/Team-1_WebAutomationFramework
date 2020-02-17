package testhomepage;

import homepage.pageobject.HomePageSignUpFrame;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestHomePageSignUpFrame extends HomePageSignUpFrame {

    public static void getInItElements(){
        PageFactory.initElements(driver,HomePageSignUpFrame.class);
    }

    @Test (priority = 0)
    public static void testSignUpButton() throws InterruptedException {
        getInItElements();
        sleepFor(1);
        clickSignUpButton();
    }

    @Test (priority = 1)
    public static void validateSignUpButton() throws InterruptedException {
        getInItElements();
        sleepFor(1);
        clickSignUpButton();
        String actual=validateSignUpText();
        String expected="Already have an Airbnb account?";
        assertCheck(actual,expected);
    }

    @Test (priority = 2)
    public static void testSignUpButtonSelectFB() throws InterruptedException {
        getInItElements();
        sleepFor(1);
        clickSignUpButton();
        sleepFor(1);
        clickSignUpButtonSelectFB();
        sleepFor(2);
    }

    @Test (priority = 3)
    public static void testSignUpButtonSelectGoogle() throws InterruptedException {
        getInItElements();
        sleepFor(1);
        clickSignUpButton();
        sleepFor(1);
        clickSignUpButtonSelectGoogle();
        sleepFor(2);
    }

    @Test (priority = 4)
    public static void testSignUpButtonSelectEmail() throws InterruptedException {
        getInItElements();
        sleepFor(1);
        clickSignUpButton();
        sleepFor(1);
        clickSignUpButtonSelectEmail();
        sleepFor(2);
    }
 @Test (priority = 5)
    public static void testSignUpButtonEmailBar() throws InterruptedException {
        getInItElements();
        sleepFor(1);
        clickSignUpButton();
        sleepFor(1);
        clickSignUpButtonSelectEmail();
        typeSignUpButtonEmailBar();
        sleepFor(2);
    }

    @Test (priority = 6)
    public static void testSignUpButtonFirstNameBar() throws InterruptedException {
        getInItElements();
        sleepFor(1);
        clickSignUpButton();
        sleepFor(1);
        clickSignUpButtonSelectEmail();
        typeSignUpButtonFirstNameBar();
        sleepFor(2);
    }

    @Test (priority = 7)
    public static void testSignUpButtonLastNameBar() throws InterruptedException {
        getInItElements();
        sleepFor(1);
        clickSignUpButton();
        sleepFor(1);
        clickSignUpButtonSelectEmail();
        typeSignUpButtonLastNameBar();
        sleepFor(2);
    }

    @Test (priority = 8)
    public static void testSignUpButtonPasswordBar() throws InterruptedException {
        getInItElements();
        sleepFor(1);
        clickSignUpButton();
        sleepFor(1);
        clickSignUpButtonSelectEmail();
        typeSignUpButtonPasswordBar();
        sleepFor(2);
    }

    @Test (priority = 9)
    public static void testSignUpButtonMonthBar() throws InterruptedException {
        getInItElements();
        sleepFor(1);
        clickSignUpButton();
        sleepFor(1);
        clickSignUpButtonSelectEmail();
        clickSignUpButtonMonthBar();
        sleepFor(2);
    }

    @Test (priority = 10)
    public static void testSignUpButtonMonthBarFeb() throws InterruptedException {
        getInItElements();
        sleepFor(1);
        clickSignUpButton();
        sleepFor(1);
        clickSignUpButtonSelectEmail();
        clickSignUpButtonMonthBar();
        clickSignUpButtonMonthBarFeb();
        sleepFor(2);
    }

    @Test (priority = 11)
    public static void testSignUpButtonDayBar() throws InterruptedException {
        getInItElements();
        sleepFor(1);
        clickSignUpButton();
        sleepFor(1);
        clickSignUpButtonSelectEmail();
        clickSignUpButtonDayBar();
        sleepFor(2);
    }

    @Test (priority = 12)
    public static void testSignUpButtonDayBar6() throws InterruptedException {
        getInItElements();
        sleepFor(1);
        clickSignUpButton();
        sleepFor(1);
        clickSignUpButtonSelectEmail();
        clickSignUpButtonDayBar();
        clickSignUpButtonDayBar6();
        sleepFor(2);
    }

    @Test (priority = 13)
    public static void testSignUpButtonYearBar() throws InterruptedException {
        getInItElements();
        sleepFor(1);
        clickSignUpButton();
        sleepFor(1);
        clickSignUpButtonSelectEmail();
        clickSignUpButtonYearBar();
        sleepFor(2);
    }

    @Test (priority = 14)
    public static void testSignUpButtonYearBar1993() throws InterruptedException {
        getInItElements();
        sleepFor(1);
        clickSignUpButton();
        sleepFor(1);
        clickSignUpButtonSelectEmail();
        clickSignUpButtonYearBar();
        clickSignUpButtonYearBar1993();
        sleepFor(2);
    }

    @Test (priority = 15)
    public static void testSignUpButtonCheckBox() throws InterruptedException {
        getInItElements();
        sleepFor(1);
        clickSignUpButton();
        sleepFor(1);
        clickSignUpButtonSelectEmail();
        clickSignUpButtonCheckBox();
        sleepFor(2);
    }

    @Test (priority = 16)
    public static void testSignUpButtonFinish() throws InterruptedException {
        getInItElements();
        sleepFor(1);
        clickSignUpButton();
        sleepFor(1);
        clickSignUpButtonSelectEmail();
        clickSignUpButtonFinish();
        sleepFor(2);
    }

    @Test (priority = 17)
    public static void testSignUpButtonLogIn() throws InterruptedException {
        getInItElements();
        sleepFor(1);
        clickSignUpButton();
        sleepFor(1);
        clickSignUpButtonSelectEmail();
        clickSignUpButtonLogIn();
        sleepFor(2);
    }

    @Test (priority = 18)
    public static void testSignUpButtonProcess() throws InterruptedException {
        getInItElements();
        sleepFor(1);
        clickSignUpButton();
        sleepFor(1);
        clickSignUpButtonSelectEmail();
        typeSignUpButtonEmailBar();
        typeSignUpButtonFirstNameBar();
        typeSignUpButtonLastNameBar();
        typeSignUpButtonPasswordBar();
        clickSignUpButtonMonthBarFeb();
        clickSignUpButtonDayBar6();
        clickSignUpButtonYearBar1993();
        clickSignUpButtonCheckBox();
        clickSignUpButtonFinish();
        sleepFor(2);
    }




}
