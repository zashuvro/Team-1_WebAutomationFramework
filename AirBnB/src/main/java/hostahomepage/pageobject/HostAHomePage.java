package hostahomepage.pageobject;

import hostahomepage.webelements.HostAHomePageWebElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HostAHomePage extends HostAHomePageWebElements {


    @FindBy(xpath = xPathHostAHomeButton) public static WebElement hostAHomeButton;
    public static WebElement getHostAHomeButton(){return hostAHomeButton;}
    public static void clickHostAHomeButton(){getHostAHomeButton().click();}

}
