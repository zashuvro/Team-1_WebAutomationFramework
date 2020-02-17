package stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import testhomepage.TestHomePage;

public class CommonMethod extends TestHomePage {
    @Given("I am at AirBnB HomePage")
    public void i_am_at_AirBnB_HomePage() {
        // Write code here that turns the phrase above into concrete actions
        getLocalDriver("windows","chrome");
        driver.get("https://www.airbnb.com/");
        driver.manage().window().maximize();
        //throw new io.cucumber.java.PendingException();
    }


    @Then("Close Browser")
    public void close_Browser() {
        // Write code here that turns the phrase above into concrete actions
        driver.close();
    }


}
