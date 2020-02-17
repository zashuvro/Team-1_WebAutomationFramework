package testhomepage;

import homepage.pageobject.HomePageLanguageTab;
import homepage.pageobject.HomePageUSDTab;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestHomePageUSDTab extends HomePageUSDTab {

    public void getInitElements(){
        PageFactory.initElements(driver, HomePageUSDTab.class);
    }
    @Test(priority=1)
    public void testUSDButton() throws InterruptedException {

        getInitElements();
        setClickUSD();
        sleepFor(1);
        clickSelectUSD();
        sleepFor(2);
    }

    @Test(priority=2)
    public void testSelectAUD() throws InterruptedException {

        getInitElements();
        setClickUSD();
        sleepFor(1);
        clickSelectAUD();
        sleepFor(1);
        navigateBack();
        sleepFor(1);
    }

    @Test(priority=3)
    public void testSelectBRL() throws InterruptedException {

        getInitElements();
        setClickUSD();
        sleepFor(1);
        clickSelectBRL();
        sleepFor(1);
        navigateBack();
        sleepFor(1);
    }
 @Test(priority=4)
    public void testSelectAED() throws InterruptedException {

        getInitElements();
        setClickUSD();
        sleepFor(1);
        clickSelectAED();
        sleepFor(1);
        navigateBack();
        sleepFor(1);
    }

@Test(priority=5)
    public void testSelectEUR() throws InterruptedException {

        getInitElements();
        setClickUSD();
        sleepFor(1);
        clickSelectEUR();
        sleepFor(1);
        navigateBack();
        sleepFor(1);
    }

    @Test(priority=6)
    public void testSelectMXN() throws InterruptedException {

        getInitElements();
        setClickUSD();
        scrollUpDown(390);
        sleepFor(1);
        clickSelectMXN();
        sleepFor(1);
        navigateBack();
        sleepFor(1);
    }

    @Test(priority=7)
    public void testSelectRUB() throws InterruptedException {

        getInitElements();
        setClickUSD();
        scrollUpDown(390);
        sleepFor(1);
        clickSelectRUB();
        sleepFor(1);
        navigateBack();
        sleepFor(1);
    }

    @Test(priority=8)
    public void testSelectCHF() throws InterruptedException {

        getInitElements();
        setClickUSD();
        scrollUpDown(390);
        sleepFor(1);
        clickSelectCHF();
        sleepFor(1);
        navigateBack();
        sleepFor(1);
    }

    @Test(priority=9)
    public void testSelectTRY() throws InterruptedException {

        getInitElements();
        setClickUSD();
        scrollUpDown(390);
        sleepFor(1);
        clickSelectTRY();
        sleepFor(1);
        navigateBack();
        sleepFor(1);
    }

    @Test(priority=10)
    public void testSelectUYU() throws InterruptedException {

        getInitElements();
        setClickUSD();
        scrollUpDown(390);
        sleepFor(1);
        clickSelectUYU();
        sleepFor(1);
        navigateBack();
        sleepFor(1);
    }

    @Test(priority=11)
    public void testSelectHKD() throws InterruptedException {
        getInitElements();
        setClickUSD();
        scrollUpDown(400);
        sleepFor(1);
        clickSelectHKD();
        sleepFor(1);
        navigateBack();
        sleepFor(1);
    }


    @Test(priority=12)
    public void testSelectHUF() throws InterruptedException {
        getInitElements();
        setClickUSD();
        scrollUpDown(400);
        sleepFor(1);
        clickSelectHUF();
        sleepFor(1);
        navigateBack();
        sleepFor(1);
    }

    @Test(priority=13)
    public void testSelectINR() throws InterruptedException {
        getInitElements();
        setClickUSD();
        scrollUpDown(400);
        sleepFor(1);
        clickSelectINR();
        sleepFor(1);
        navigateBack();
        sleepFor(1);
    }

    @Test(priority=14)
    public void testSelectILS() throws InterruptedException {
        getInitElements();
        setClickUSD();
        scrollUpDown(400);
        sleepFor(1);
        clickSelectILS();
        sleepFor(1);
        navigateBack();
        sleepFor(1);
    }


    @Test(priority=15)
    public void testSelectJPY() throws InterruptedException {
        getInitElements();
        setClickUSD();
        scrollUpDown(400);
        sleepFor(1);
        clickSelectJPY();
        sleepFor(1);
        navigateBack();
        sleepFor(1);
    }

    @Test(priority=16)
    public void testSelectMYR() throws InterruptedException {
        getInitElements();
        setClickUSD();
        scrollUpDown(400);
        sleepFor(1);
        clickSelectMYR();
        sleepFor(1);
        navigateBack();
        sleepFor(1);
    }

    @Test(priority=17)
    public void testSelectMAD() throws InterruptedException {
        getInitElements();
        setClickUSD();
        scrollUpDown(400);
        sleepFor(1);
        clickSelectMAD();
        sleepFor(1);
        navigateBack();
        sleepFor(1);
    }

    @Test(priority=18)
    public void testSelectTWD() throws InterruptedException {
        getInitElements();
        setClickUSD();
        scrollUpDown(400);
        sleepFor(1);
        clickSelectTWD();
        sleepFor(1);
        navigateBack();
        sleepFor(1);
    }

    @Test(priority=19)
    public void testSelectNZD() throws InterruptedException {
        getInitElements();
        setClickUSD();
        scrollUpDown(400);
        sleepFor(1);
        clickSelectNZD();
        sleepFor(1);
        navigateBack();
        sleepFor(1);
    }

    @Test(priority=20)
    public void testSelectNOK() throws InterruptedException {
        getInitElements();
        setClickUSD();
        scrollUpDown(400);
        sleepFor(1);
        clickSelectNOK();
        sleepFor(1);
        navigateBack();
        sleepFor(1);
    }




}
