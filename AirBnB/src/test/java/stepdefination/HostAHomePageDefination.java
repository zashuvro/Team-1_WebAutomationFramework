package stepdefination;

import hostahomepage.pageobject.HostAHomePage;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import testhostahomepage.TestHostAHomePage;

public class HostAHomePageDefination extends TestHostAHomePage {


    @Given("I am At HostAHome Page")
    public void i_am_At_HostAHome_Page() {
        // Write code here that turns the phrase above into concrete actions
          testHostAHomePageButton();
    }

    @Given("Validating HostAHome Page")
    public void validating_HostAHome_Page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
