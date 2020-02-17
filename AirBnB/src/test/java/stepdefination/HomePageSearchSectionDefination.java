package stepdefination;

import io.cucumber.java.en.Given;
import testhomepage.TestHomePageSearchSection;

public class HomePageSearchSectionDefination extends TestHomePageSearchSection {


    @Given("I am Validating WhereBar")
    public void i_am_Validating_WhereBar() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
    testValidateWhereBar();
    }

    @Given("I am Checking CheckInBar")
    public void i_am_Checking_CheckInBar() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
    testCheckInBar();
    }

    @Given("I am Checking CheckOutBar")
    public void i_am_Checking_CheckOutBar() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
    testCheckOutBar();
    }

    @Given("I am Checking SelectDate CheckInBar")
    public void i_am_Checking_SelectDate_CheckInBar() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
    testSelectDateCheckInBar();
    }

    @Given("I am Checking SelectDate CheckOutBar")
    public void i_am_Checking_SelectDate_CheckOutBar() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
    testSelectDateCheckOutBar();
    }

    @Given("I am Clicking GuestsBar")
    public void i_am_Clicking_GuestsBar() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
    testClickGuestsBar();
    }

    @Given("I am Clicking GuestsBar 1Adults")
    public void i_am_Clicking_GuestsBar_1Adults() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
    testClickGuestsBar1Adults();
    }

    @Given("I am Clicking GuestsBar {int} Children")
    public void i_am_Clicking_GuestsBar_Children(Integer int1) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
    testClickGuestsBar1Children();
    }

    @Given("I am Clicking GuestsBar 1Infants")
    public void i_am_Clicking_GuestsBar_1Infants() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
    testClickGuestsBar1Infants();
    }

    @Given("I am testing Search")
    public void i_am_testing_Search() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
    testSearch();
    }

}
