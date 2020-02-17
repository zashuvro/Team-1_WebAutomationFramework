package stepdefination;

import io.cucumber.java.en.Given;
import testhomepage.TestHomePageHelpTab;

public class HomePageHelpTabDefination extends TestHomePageHelpTab {

    @Given("I am Clicking HelpTab")
    public void i_am_Clicking_HelpTab() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
   testHelpTab();
    }

    @Given("I am Clicking HelpTabSearch")
    public void i_am_Clicking_HelpTabSearch() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
    testHelpTabSearch();
    }

    @Given("I am Selecting LA")
    public void i_am_Selecting_LA() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
    testHelpTabSearchSelectLA();
    }

    @Given("I am Clicking ReadMore")
    public void i_am_Clicking_ReadMore() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
    testHelpTabSearchClickReadMore();
    }

    @Given("I am Clicking Password")
    public void i_am_Clicking_Password() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
    testResetPassReadMoreReadMore();
    }

    @Given("I am Clicking ReservationArrow")
    public void i_am_Clicking_ReservationArrow() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
    testReservationArrow();
    }

    @Given("I am Clicking ContactingArrow")
    public void i_am_Clicking_ContactingArrow() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
    testContactingArrow();
    }

    @Given("I am Clicking PricesArrow")
    public void i_am_Clicking_PricesArrow() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
    testPricesArrow();
    }

    @Given("I am Clicking VisitTheHelpCenterButton")
    public void i_am_Clicking_VisitTheHelpCenterButton() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
    testVisitTheHelpCenterButton();
    }

    @Given("I am Clicking Give Feedback")
    public void i_am_Clicking_Give_Feedback() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
    testGiveFeedback();
    }


}
