package stepdefination;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import testhomepage.TestHomePage;
import testhomepage.TestHomePageLanguageTab;

public class HomePageStepDefination extends TestHomePage {


    @Given("I am validating HomePage")
    public void i_am_validating_HomePage() {
        // Write code here that turns the phrase above into concrete actions
        testValidateHomePage();
    }

    @Given("I am validating HomePage Footer")
    public void i_am_validating_HomePage_Footer() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
    testValidateFooter();
    }

    @Given("I am validating Terms Privacy")
    public void i_am_validating_Terms_Privacy() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
    testValidateTermsPrivacy();
    }

    @Given("I am Clicking NewsButton")
    public void i_am_Clicking_NewsButton() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
    testNewsButton();
    }

    @Given("I am Clicking PoliciesButton")
    public void i_am_Clicking_PoliciesButton() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
    testPoliciesButton();
    }

    @Given("I am Clicking DiversityBelongingButton")
    public void i_am_Clicking_DiversityBelongingButton() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
    testDiversityBelongingButton();
    }
    @Given("I am Clicking AccessibilityButton")
    public void i_am_Clicking_AccessibilityButton() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
    testAccessibilityButton();
    }
    @Given("I am Clicking TrustSafetyButton")
    public void i_am_Clicking_TrustSafetyButton() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
    testTrustSafetyButton();
    }
    @Given("I am Clicking TravelCreditButton")
    public void i_am_Clicking_TravelCreditButton() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
    testTravelCreditButton();
    }
    @Given("I am Clicking GiftCards Button")
    public void i_am_Clicking_GiftCards_Button() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
    testGiftCardsButton();
    }
    @Given("I am Clicking FaceBook Button")
    public void i_am_Clicking_FaceBook_Button() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
    testFaceBookButton();
    }
    @Given("I am Clicking TwitterButton")
    public void i_am_Clicking_TwitterButton() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
    testTwitterButton();
    }

    @Given("I am Clicking InstagramButton")
    public void i_am_Clicking_InstagramButton() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
    testInstagramButton();
    }

    @Given("I am Clicking HelpButton")
    public void i_am_Clicking_HelpButton() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
    testHelpButton();
    }

    @Given("I am Clicking NeighborhoodSupportButton")
    public void i_am_Clicking_NeighborhoodSupportButton() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
    testNeighborhoodSupportButton();
    }









}
