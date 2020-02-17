package testhomepage;

import homepage.pageobject.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestHomePage extends HomePage {

    //public static void getInitElements (){
     //   PageFactory.initElements(driver, HomePage.class);
   // }
    public static void getInitElements(){PageFactory.initElements(driver,HomePage.class);}

    @Test(priority = 1)
    public static void testContact() throws InterruptedException {
        getInitElements();
        clickcontact();
        sleepFor(2);
    }

    @Test(priority = 2)
    public static void testloginButton() throws InterruptedException {
        getInitElements();
        sleepFor(2);
        mouseHoverByXpath(loginButtonXp);
        sleepFor(2);
    }

    @Test(priority = 3)
    public static void testmemberPortal() throws InterruptedException {
        testloginButton();
        clickmemberPortal();
        sleepFor(3);
    }
    @Test(priority = 4)
    public static void testcreatNewAccount() throws InterruptedException {
      getInitElements();
      clickFindADoctor();
       sleepFor(2);

    }

    @Test(priority = 5)
    public static void testsearchButton() throws InterruptedException {
        getInitElements();
        clicksearchButton();
        sleepFor(2);
    }

    @Test(priority = 6)
    public static void textSearchButton() throws InterruptedException {
        getInitElements();
        clickSendsearchButton();
        sleepFor(3);

    }

    @Test(priority = 7)
    public static void textSearchButton2() throws InterruptedException {
        getInitElements();
        clickSendsearchButton2();
        sleepFor(3);
    }

    @Test(priority = 8)
    public static void textSearchButton3() throws InterruptedException {
        getInitElements();
        clickSendsearchButton3();
        sleepFor(3);
    }
    @Test(priority = 9)
    public static void textSearchButton4() throws InterruptedException {
        getInitElements();
        clickSendsearchButton4();
        sleepFor(3);
    }

    @Test(priority = 10)
    public static void textSearchButton5() throws InterruptedException {
        getInitElements();
        clickSendsearchButton5();
        sleepFor(3);
    }
    @Test(priority = 11)
    public static void testespanolButton() throws InterruptedException {
        getInitElements();
        clickespanolButton();
        sleepFor(3);
    }

    @Test(priority = 12)
    public static void testenglishButton() throws InterruptedException {
       testespanolButton();
       sleepFor(2);
        clickenglishButton();
        sleepFor(3);
    }

    @Test(priority = 13)
    public static void testchineseButton() throws InterruptedException {
        getInitElements();
        clickchineseButton();
        sleepFor(4);
    }

    @Test(priority = 14)
    public static void testAboitUs() throws InterruptedException {
        getInitElements();
        clickAboutUs();
        sleepFor(3);
    }

    @Test(priority = 15)
    public static void testLogo() throws InterruptedException {
        getInitElements();
        clickLogo();
        sleepFor(3);
    }
//****

    @Test(priority = 16)
    public static void testTextLogoButton() throws InterruptedException {
       testLogo();
       sleepFor(2);
        seelogoButton();
        sleepFor(2);
//        System.out.print(getLogoButton().getText());
//        String expected = "healthfirst" +
//                "Health Insurance for New Yorkers";
//        String actual =getLogoButton().getText();
//        assertValidate(actual, expected);
    }

    @Test(priority = 17)
    public static void testGoodHealth() throws InterruptedException {
        getInitElements();
        //seetextGh();
        sleepFor(2);
        System.out.println(getGoodHealth().getText());
        String expected = "Good health doesn’t just happen.";
        String actual = getGoodHealth().getText();
        assertValidate(actual, expected);
    }
    @Test(priority = 18)
    public static void testMainNavigateBAr() throws InterruptedException {
        getInitElements();
        sleepFor(2);
        System.out.println(getMainNavigateBar().getText());
//        String expected = "Plans", "Info for Members", "Info for Brokers", "Info for Providers",;
//        String actual = getMainNavigateBar().getText();
//        assertValidate(actual, expected);
    }

    @Test(priority = 19)
    public static void testinformationForBro() throws InterruptedException {
        getInitElements();
        clickinformationForBro();
        sleepFor(3);
    }

    @Test(priority = 20)
    public static void testPortal() throws InterruptedException {
        getInitElements();
        clickPortel();
        sleepFor(2);
    }

    @Test(priority = 21)
    public static void testproviderPortal() throws InterruptedException {
       // getInitElements();
        testloginButton();
        clickproviderPortal();
        sleepFor(3);
    }

@Test(priority = 22)
    public static void testbrokerPortalButton() throws InterruptedException {
    testloginButton();
    clickbrokerPortalButton();
    sleepFor(2);
}
        @Test(priority = 23)
                public static void testemployerPortal() throws InterruptedException {
        testloginButton();
            cickemployerPortalb();
            sleepFor(2);
    }

    @Test(priority = 24)
    public static void testemployerPUserId() throws InterruptedException {
        //testemployerPortal();
        //sleepFor(3);
        clickemployerPUserId();
        sleepFor(4);
    }
    @Test(priority = 25)
    public static void testseeComminityLocation() throws InterruptedException {
        getInitElements();
        scrollUpDown(1400);
        sleepFor(4);
        clickseeComminityLocation();
        sleepFor(4);
    }
@Test(priority = 26)
    public static void testjobOpening() throws InterruptedException {
        getInitElements();
        scrollUpDown(1800);
        sleepFor(4);
        clickjobOpening();
        sleepFor(3);
}

@Test(priority = 27)
    public static void testReadMore() throws InterruptedException {
        getInitElements();
        scrollUpDown(1900);
        sleepFor(4);
        clickReadMore();
        sleepFor(4);
}

@Test(priority = 28)
    public static void testSlickSlide() throws InterruptedException {
        getInitElements();
        scrollUpDown(2000);
        sleepFor(4);
        clickSlickSlide();
        sleepFor(4);
}

    @Test(priority = 29)
    public static void testSlickSlide2() throws InterruptedException {
        getInitElements();
        scrollUpDown(2000);
        sleepFor(4);
        clickSlickSlide2();
        sleepFor(4);
    }

    @Test(priority = 30)
    public static void testSlickSlide3() throws InterruptedException {
        getInitElements();
        scrollUpDown(2000);
        sleepFor(4);
        clickSlickSlide3();
        sleepFor(4);
    }


    @Test(priority = 31)
    public static void testSlickSlide0() throws InterruptedException {
        getInitElements();
        scrollUpDown(2000);
        sleepFor(4);
        clickSlickSlide0();
        sleepFor(4);
    }

    @Test(priority = 32)
    public static void testgoToHealthyLeaving() throws InterruptedException {
        getInitElements();
        scrollUpDown(2500);
        sleepFor(4);
        clickgoToHealthyLeaving();
        sleepFor(4);
    }


    @Test(priority = 33)
    public static void testloveYourHeart() throws InterruptedException {
        getInitElements();
        scrollUpDown(2700);
        sleepFor(4);
        clickloveYourHeart();
        sleepFor(4);
    }

    @Test(priority = 34)
    public static void testDentalCheckupTipsforParents() throws InterruptedException {
        getInitElements();
        scrollUpDown(2700);
        sleepFor(4);
        clickDentalCheckupTipsforParents();
        sleepFor(4);
    }

    @Test(priority = 35)
    public static void testContactUs() throws InterruptedException {
        getInitElements();
        scrollUpDown(2700);
        sleepFor(4);
        clickContactUs();
        sleepFor(4);
    }





}

