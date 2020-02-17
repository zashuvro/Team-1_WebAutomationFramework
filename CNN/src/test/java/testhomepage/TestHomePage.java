package testhomepage;

import common.WebAPI;
import homepage.pageobject.HomePage;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestHomePage extends HomePage {

    public static void initElements (){
        PageFactory.initElements(driver, HomePage.class);
    }

    @Test(priority = 1)
    public static void  testManuButton() throws InterruptedException {
        initElements();
        clickManuButton();
        Thread.sleep(2000);
    }

    @Test(priority = 2)
    public static void testliveTvButton() throws InterruptedException {
        initElements();
        clickLiveTvButton();
        Thread.sleep(2000);
    }

    @Test(priority = 3)
    public static void testSearchButton() throws InterruptedException {
        initElements();
        clickSearchButton();
        Thread.sleep(2000);
    //navigateBack();
    }

    @Test(priority = 4)
    public static void testUSButton() throws InterruptedException {
        initElements();
        clickUSbutton();
        Thread.sleep(2000);
    }

@Test(priority = 5)
    public static void testWorldButton() throws InterruptedException {
        initElements();
        clickWorldButton();
        Thread.sleep(2000);
    }
    @Test(priority = 6)
    public static void testPoliticesbutton() throws InterruptedException {
        initElements();
        clickPoliticesButton();
        Thread.sleep(2000);
    }

    @Test(priority = 7)
    public static void testBusinessButton() throws InterruptedException {
        initElements();
        clickBusinessButton();
        Thread.sleep(2000);
    }

    @Test(priority = 8)
    public static void testOpinionButton() throws InterruptedException {
        initElements();
        clickOpinionButton();
        Thread.sleep(20000);
    }

    @Test(priority = 9)
    public static void testHealthButton() throws InterruptedException {
        initElements();
        clickHealthButton();
        Thread.sleep(2000);
    }

    @Test(priority = 10)
    public static void testEnterteinmentButton() throws InterruptedException {
        initElements();
        clickEntertenmentButton();
        Thread.sleep(2000);
    }

    @Test(priority = 11)
    public static void testStyleButton() throws InterruptedException {
        initElements();
        clickStyleButton();
        Thread.sleep(2000);
    }

    @Test(priority = 12)
    public static void testTravelButton  () throws InterruptedException {
        initElements();
        clickTravelButton();
        Thread.sleep(2000);
    }
    @Test(priority = 13)
    public static void testSportsButton() throws InterruptedException {
        initElements();
        clickSportsButton();
        Thread.sleep(2000);
    }

    @Test(priority = 14)
    public static void testVideoButton() throws InterruptedException {
        initElements();
        clickVideoButton();
        Thread.sleep(2000);
    }

    @Test(priority = 15)
    public static void testEditionTab() throws InterruptedException {
        initElements();
        clickEditionTab();
        Thread.sleep(2000);
    }

    @Test(priority = 16)
    public static void testEditionUS() throws InterruptedException {
        initElements();
        clickEditionTab();
        Thread.sleep(2000);
        clickEditionUS();
        Thread.sleep(2000);

    }

    @Test(priority = 17)
    public static void testEditionInternational() throws InterruptedException {
        initElements();
        clickEditionTab();
        Thread.sleep(2000);
        clickEditionInternational();
        Thread.sleep(2000);
    }

    @Test(priority = 18)
    public static void testEditionArabic() throws InterruptedException {
        initElements();
        clickEditionTab();
        Thread.sleep(2000);
        clickEditionArabic();
        Thread.sleep(2000);
    }

    @Test(priority = 19)
    public static void testEditionEspanol() throws InterruptedException {
        initElements();
        clickEditionTab();
        Thread.sleep(200);
        clickeditionEspanol();
        Thread.sleep(2000);
    }

    @Test(priority = 20)
    public static void testManuButtonSearchBar() throws InterruptedException {
        initElements();
        clickManuButton();
        Thread.sleep(2000);
        clickmanuButtonSearchBar();
    }

    @Test(priority = 21)
    public static void testWorldAfrica() throws InterruptedException {
        initElements();
        clickWorldButton();
        Thread.sleep(2000);
        clickWorldAfrica();
        Thread.sleep(2000);
    }
    @Test(priority = 22)
    public static void testWorldAmericans() throws InterruptedException {
        initElements();
        clickWorldButton();
        Thread.sleep(2000);
        clickWorldAmericas();
        Thread.sleep(2000);
    }
    @Test(priority = 23)
    public static void testWorldAsia() throws InterruptedException {
        initElements();
        clickWorldButton();
        Thread.sleep(2000);
        clickWorldAsia();
        Thread.sleep(2000);
    }
@Test(priority = 24)
    public static void testWorldAustralia() throws InterruptedException {
        initElements();
        clickWorldButton();
        Thread.sleep(2000);
        clickWorldAustralia();
        Thread.sleep(2000);
}
@Test(priority = 25)
    public static void testWorldChina() throws InterruptedException {
        initElements();
        clickWorldButton();
        Thread.sleep(2000);
        clickWorldChina();
        Thread.sleep(2000);
}
@Test(priority = 26)
    public static void testWorldEurope() throws InterruptedException {
        initElements();
        clickWorldButton();
        Thread.sleep(2000);
        clickWorldEurope();
        Thread.sleep(2000);
}

@Test(priority = 27)
    public static void testWorldIndia() throws InterruptedException {
        initElements();
        clickWorldButton();
        Thread.sleep(2000);
        cickWorldIndia();
        Thread.sleep(2000);
}

@Test(priority = 28)
    public static void testWorldMiddleEast() throws InterruptedException {
        initElements();
        clickWorldButton();
        Thread.sleep(2000);
        clickWorldMiddleEast();
        Thread.sleep(2000);
}

@Test(priority = 29)
    public static void testWorldUnitedKingdome() throws InterruptedException {
        initElements();
        clickWorldButton();
        Thread.sleep(2000);
        clickWrldUnitedKingdome();
        Thread.sleep(2000);
}

    @Test(priority = 30)
    public static void testManuButtonSearchBar1() throws InterruptedException {
        initElements();
        clickManuButton();
        Thread.sleep(2000);
        clickmanuButtonSearchBar1();
        Thread.sleep(2000);
    }

    @Test(priority = 31)
    public static void testManuButtonSearchBar2() throws InterruptedException {
        initElements();
        clickManuButton();
        Thread.sleep(2000);
        clickmanuButtonSearchBar2();
        Thread.sleep(2000);
    }

    @Test(priority = 32)
    public static void testManuButtonSearchBar3() throws InterruptedException {
        initElements();
        //scrollUpDown(2800);
        clickManuButton();
        Thread.sleep(2000);
        //scrollUpDown(-2800);
        clickmanuButtonSearchBar3();
        Thread.sleep(2000);
    }

    @Test(priority = 33)
    public static void testManuBarSearchBar4() throws InterruptedException {
        initElements();
        clickManuButton();
        Thread.sleep(2000);
        clickManuButtonsearchBar4();
        Thread.sleep(2000);

    }

    @Test(priority = 34)
    public static void testBoxOfFooterStyle() throws InterruptedException {
        initElements();
        scrollUpDown(4000);
        listOfBoxFooterStyle();
        Thread.sleep(3000);
        System.out.println(getBoxOfFooterStyle().getText());
    }

    @Test(priority = 35)
    public static void testBoxOfHeadderStyle() throws InterruptedException {
        initElements();
        checkAndListOfBoxHeadderStyle();
        Thread.sleep(2000);
        System.out.println(getBoxOfHeadderStyle().getText());
    }

    @Test(priority = 36)
    public static void testFooterBoxInUSBox() throws InterruptedException {
        initElements();
        scrollUpDown(4000);
        listOFFooterBoxInUS();
        Thread.sleep(2000);
        System.out.println(getFooterBoxInUSbox().getText());
    }

    @Test(priority = 37)
    public static void testmanuBarUSCrimeJastic() throws InterruptedException {
        initElements();
        clickManuButton();
        Thread.sleep(2000);
        clickmanuBarUSCrimeJastic();
        Thread.sleep(200);
    }

    @Test(priority = 38)
    public static void testmanuBUSEnergyEnviroment() throws InterruptedException {
        initElements();
        clickManuButton();
        Thread.sleep(2000);
        clickmanuBUSEnergyEnviroment();
        Thread.sleep(2000);
    }

    @Test(priority = 39)
    public static void testManubarFood() throws InterruptedException {
        initElements();
        clickManuButton();
        Thread.sleep(2000);
        clickManubarFood();
        Thread.sleep(2000);
    }

    @Test(priority = 40)
    public static void testManubar45() throws InterruptedException {
        initElements();
        clickManuButton();
        Thread.sleep(2000);
        clickmanuBar45();
        Thread.sleep(2000);

    }

    @Test(priority = 41)
    public static void tesMnueBarCNNStore() throws InterruptedException {
        initElements();
        clickManuButton();
        Thread.sleep(2000);
        clickmanubarCNNStore();
        Thread.sleep(2000);
    }

    @Test(priority = 42)
    public static void testmanuBarPhotos() throws InterruptedException {
        initElements();
        clickManuButton();
        Thread.sleep(2000);
        clickmanuBarPhotos();
        Thread.sleep(2000);
    }
    @Test(priority = 43)
    public static void testlastFooterBox() throws InterruptedException {
        initElements();
        scrollUpDown(4800);
        Thread.sleep(2000);
        seelastFooterBox();
        System.out.println(getLastFooterBox().getText());
    }

    @Test(priority = 44)
    public static void testcnnLinklist() throws InterruptedException {
        initElements();
        //scrollUpDown(4800);
        //Thread.sleep(2000);
        seecnnLinklist();
        Thread.sleep(2000);
        System.out.println(getCnnLinklist().getText());
    }
    @Test(priority = 45)
    public static void testlinkStyleTearm() throws InterruptedException {
        initElements();
        //scrollUpDown(4800);
        seecnnLinklist();
        Thread.sleep(2000);
        clicklinkStyleTearm();
        Thread.sleep(2000);
    }
@Test(priority = 46)
    public static void testlinkStylePrivecy(){
        initElements();
        scrollUpDown(4800);
    getLinkStylePrivecy().click();
}

@Test(priority = 47)
    public static void testlinkFoNotSellMyPersonalStuff(){
        initElements();
        scrollUpDown(4800);
        getLinkFoNotSellMyPersonalStuff().click();
}

@Test(priority = 48)
    public static void testlinkAddChoic() throws InterruptedException {
        initElements();
        scrollUpDown(4800);
        clicklinkAddChoic();
        Thread.sleep(2000);
}

@Test(priority = 49)
    public static void testlinkAboutUs() throws InterruptedException {
        initElements();
        scrollUpDown(4800);
        clicklinkAboutUs();
        Thread.sleep(2000);
}

@Test(priority = 50)
    public static void testlinkLicenceFotege() throws InterruptedException {
        initElements();
        scrollUpDown(4800);
        clicklinkLicenceFotege();
        Thread.sleep(2000);
}


}
