package testhomepage;

import homepage.pageobject.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.util.logging.Logger;

public class TestHomePage extends HomePage {

    public static void getInItElements() {
        PageFactory.initElements(driver, HomePage.class);
    }
    @Test(priority = 1)
    public static void testValidateHomePage() {
        getInItElements();
        String expected = "Book unique places to stay and things to do.";
        System.out.println("Expected Text is:: " + expected);
        //TestLogger.log("massage");
        String actual = validateHomePageText();
        System.out.println("Actual Text is:: " + actual);
        assertCheck(actual, expected);
    }
    @Test(priority = 1)
    public static void testValidateFooter() throws InterruptedException {
        getInItElements();
        sleepFor(2);
        scrollToFooter();
        String expected = "© 2020 Airbnb, Inc. All rights reserved.";
        System.out.println("Expected Text is:: " + expected);
        String actual = checkValidateFooter();
        System.out.println("Actual Text is:: " + actual);
        assertCheck(actual, expected);
    }
    @Test(priority = 2)
    public static void testValidateTermsPrivacy() throws InterruptedException {
        getInItElements();
        scrollToFooter();
        sleepFor(2);
        clickTermsButton();
        String expected = "Terms of Service";
        System.out.println("Expected Text is:: " + expected);
        String actual = driver.findElement(By.xpath("//h1[1]")).getText();
        System.out.println("Actual Text is:: " + actual);
        assertCheck(actual, expected);
        sleepFor(1);
    }
    @Test(priority = 3)
    public static void testCareersButton() throws InterruptedException {
        getInItElements();
        scrollToFooter();
        sleepFor(1);
        //  getTermsPrivacyText().click();
        sleepFor(1);
        clickCareersButton();
        sleepFor(1);
        String expected = "What's your next destination?";
        assertCheck(expected, validateCareers());
    }
    @Test(priority = 4)
    public static void testNewsButton() throws InterruptedException {
        getInItElements();
        scrollToFooter();
        sleepFor(1);
        //getTermsPrivacyText().click();
        sleepFor(1);
        clickNewsButton();
        sleepFor(1);
        navigateBack();
        sleepFor(2);
    }
    @Test(priority = 5)
    public static void testPoliciesButton() throws InterruptedException {
        getInItElements();
        scrollToFooter();
        sleepFor(1);
        //getTermsPrivacyText().click();
        sleepFor(1);
        clickPoliciesButton();
        sleepFor(1);
        navigateBack();
        sleepFor(2);
    }
    @Test(priority = 6)
    public static void testDiversityBelongingButton() throws InterruptedException {
        getInItElements();
        scrollToFooter();
        sleepFor(1);
        //getTermsPrivacyText().click();
        sleepFor(1);
        clickDiversityBelongingButton();
        sleepFor(1);
        navigateBack();
        sleepFor(2);
    }
    @Test(priority = 7)
    public static void testAccessibilityButton() throws InterruptedException {
        getInItElements();
        scrollToFooter();
        sleepFor(1);
        //getTermsPrivacyText().click();
        sleepFor(1);
        clickAccessibilityButton();
        sleepFor(1);
        navigateBack();
        sleepFor(2);
    }
    @Test(priority = 8)
    public static void testTrustSafetyButton() throws InterruptedException {
        getInItElements();
        scrollToFooter();
        sleepFor(1);
        //getTermsPrivacyText().click();
        sleepFor(1);
        clickTrustSafetyButton();
        sleepFor(1);
        navigateBack();
        sleepFor(2);
    }
    @Test(priority = 9)
    public static void testTravelCreditButton() throws InterruptedException {
        getInItElements();
        scrollToFooter();
        //getTermsPrivacyText().click();
        sleepFor(1);
        clickTravelCreditButton();
        sleepFor(1);
        navigateBack();
        sleepFor(2);
    }
    @Test(priority = 10)
    public static void testGiftCardsButton() throws InterruptedException {
        getInItElements();
        scrollToFooter();
        sleepFor(1);
        // getTermsPrivacyText().click();
        sleepFor(1);
        clickGiftCardsButton();
        sleepFor(1);
        navigateBack();
        sleepFor(2);
    }
    @Test(priority = 11)
    public static void testFaceBookButton() throws InterruptedException {
        getInItElements();
        sleepFor(2);
        scrollToFooter();
        sleepFor(1);
        clickFaceBookButton();
        sleepFor(1);

    }
    @Test(priority = 12)
    public static void testTwitterButton() throws InterruptedException {
        getInItElements();
        sleepFor(2);
        scrollToFooter();
        sleepFor(1);
        clickTwitterButton();
        sleepFor(1);
    }
    @Test(priority = 13)
    public static void testInstagramButton() throws InterruptedException {
        getInItElements();
        sleepFor(2);
        scrollToFooter();
        sleepFor(1);
        clickInstagramButton();
        sleepFor(1);
    }
    @Test(priority = 14)
    public static void testHelpButton() throws InterruptedException {
        getInItElements();
        sleepFor(2);
        scrollToFooter();
        sleepFor(1);
        clickHelpButton();
        sleepFor(1);
        navigateBack();
        sleepFor(2);
    }
    @Test(priority = 15)
    public static void testNeighborhoodSupportButton() throws InterruptedException {
        getInItElements();
        sleepFor(2);
        scrollToFooter();
        sleepFor(1);
        clickNeighborhoodSupportButton();
        sleepFor(1);
        navigateBack();
        sleepFor(2);
    }


}
