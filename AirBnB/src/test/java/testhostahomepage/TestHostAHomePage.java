package testhostahomepage;

import hostahomepage.pageobject.HostAHomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestHostAHomePage extends HostAHomePage {

    public static void getInItElements(){
        PageFactory.initElements(driver,HostAHomePage.class);
    }
    @Test
    public static void testHostAHomePageButton(){
        getInItElements();
        clickHostAHomeButton();
    }


}
