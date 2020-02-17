package testhomepage;

import homepage.pageobject.HomePageLanguageTab;
import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;

public class TestHomePageLanguageTab extends HomePageLanguageTab {

    public void getInitElements(){
        PageFactory.initElements(driver, HomePageLanguageTab.class);

    }
    @Test(priority=1)
    public void testEnglishUsButton() throws InterruptedException {

        getInitElements();
        clickEnglishUSButtton();
        sleepFor(2);
        clickSelectEnglish();
        sleepFor(2);
    }
    @Test(priority=2)
    public void testSelectAzerbaycan() throws InterruptedException {

        getInitElements();
        clickEnglishUSButtton();
        sleepFor(2);
        clickSelectAzerbaycan();
        sleepFor(2);
        navigateBack();
        sleepFor(2);
    }

    @Test(priority=3)
    public void testSelectBahasaIndo() throws InterruptedException {

        getInitElements();
        clickEnglishUSButtton();
        sleepFor(2);
        clickSelectBahasaIndo();
        sleepFor(2);
        navigateBack();
        sleepFor(2);
    }

    @Test(priority=4)
    public void testSelectBosanski() throws InterruptedException {

        getInitElements();
        clickEnglishUSButtton();
        sleepFor(2);
        clickSelectBosanski();
        sleepFor(2);
        navigateBack();
        sleepFor(2);

    }

    @Test(priority=5)
    public void testSelectCatala() throws InterruptedException {

        getInitElements();
        clickEnglishUSButtton();
        sleepFor(2);
        clickSelectCatala();
        sleepFor(2);
        navigateBack();
        sleepFor(2);
    }

    @Test(priority=6)
    public void testSelectJapanese() throws InterruptedException {

        getInitElements();
        clickEnglishUSButtton();
        sleepFor(1);
        scrollUpDown(350);
        sleepFor(1);
        clickSelectJapanese();
        sleepFor(1);
        navigateBack();
        sleepFor(2);
    }

    @Test(priority=7)
    public void testSelectHindi() throws InterruptedException {

        getInitElements();
        clickEnglishUSButtton();
        sleepFor(1);
        scrollUpDown(350);
        sleepFor(1);
        clickSelectHindi();
        sleepFor(1);
        navigateBack();
        sleepFor(2);
    }
    @Test(priority=8)
    public void testSelectArabic() throws InterruptedException {

        getInitElements();
        clickEnglishUSButtton();
        sleepFor(1);
        scrollUpDown(350);
        sleepFor(1);
        clickSelectArabic();
        sleepFor(1);
        navigateBack();
        sleepFor(2);
    }

    @Test(priority=9)
    public void testSelectThaiWan() throws InterruptedException {

        getInitElements();
        clickEnglishUSButtton();
        sleepFor(1);
        scrollUpDown(350);
        sleepFor(1);
        clickSelectThaiWan();
        sleepFor(1);
        navigateBack();
        sleepFor(2);
    }

    @Test(priority=10)
    public void testSelectPolski() throws InterruptedException {

        getInitElements();
        clickEnglishUSButtton();
        sleepFor(1);
        scrollUpDown(350);
        sleepFor(1);
        clickSelectPolski();
        sleepFor(1);
        navigateBack();
        sleepFor(2);
    }

    @Test(priority=11)
    public void testSelectFrancias() throws InterruptedException {
        getInitElements();
        clickEnglishUSButtton();
        sleepFor(1);
        scrollUpDown(500);
        sleepFor(1);
        clickSelectFrancias();
        sleepFor(1);
        navigateBack();
        sleepFor(2);
    }

    @Test(priority=12)
    public void testSelectFranciasFra() throws InterruptedException {
        getInitElements();
        clickEnglishUSButtton();
        sleepFor(1);
        scrollUpDown(500);
        sleepFor(1);
        clickSelectFranciasFra();
        sleepFor(1);
        navigateBack();
        sleepFor(2);
    }

    @Test(priority=13)
    public void testSelectGaeilge() throws InterruptedException {
        getInitElements();
        clickEnglishUSButtton();
        sleepFor(1);
        scrollUpDown(500);
        sleepFor(1);
        clickSelectGaeilge();
        sleepFor(1);
        navigateBack();
        sleepFor(2);
    }

    @Test(priority=14)
    public void testSelectHrvatski() throws InterruptedException {
        getInitElements();
        clickEnglishUSButtton();
        sleepFor(1);
        scrollUpDown(500);
        sleepFor(1);
        clickSelectHrvatski();
        sleepFor(1);
        navigateBack();
        sleepFor(2);
    }
   @Test(priority=15)
    public void testSelectisiXhosa() throws InterruptedException {
        getInitElements();
        clickEnglishUSButtton();
        sleepFor(1);
        scrollUpDown(500);
        sleepFor(1);
        clickSelectisiXhosa();
        sleepFor(1);
        navigateBack();
    }


    @Test(priority=16)
    public void testSelectisiZulu() throws InterruptedException {
        getInitElements();
        clickEnglishUSButtton();
        sleepFor(1);
        scrollUpDown(500);
        sleepFor(1);
        clickSelectisiZulu();
        sleepFor(1);
        navigateBack();
    }

    @Test(priority=17)
    public void testSelectItaliano() throws InterruptedException {
        getInitElements();
        clickEnglishUSButtton();
        sleepFor(1);
        scrollUpDown(500);
        sleepFor(1);
        clickSelectItaliano();
        sleepFor(1);
        navigateBack();
    }

    @Test(priority=18)
    public void testSelectKiswahili() throws InterruptedException {
        getInitElements();
        clickEnglishUSButtton();
        sleepFor(1);
        scrollUpDown(500);
        sleepFor(1);
        clickSelectKiswahili();
        sleepFor(1);
        navigateBack();
    }

    @Test(priority=19)
    public void testSelectLatviesu() throws InterruptedException {
        getInitElements();
        clickEnglishUSButtton();
        sleepFor(1);
        scrollUpDown(500);
        sleepFor(1);
        clickSelectLatviesu();
        sleepFor(1);
        navigateBack();
    }

    @Test(priority=20)
    public void testSelectLietuviu() throws InterruptedException {
        getInitElements();
        clickEnglishUSButtton();
        sleepFor(1);
        scrollUpDown(500);
        sleepFor(1);
        clickSelectLietuviu();
        sleepFor(1);
        navigateBack();
    }

    @Test(priority=21)
    public void testSelectMagyar() throws InterruptedException {
        getInitElements();
        clickEnglishUSButtton();
        sleepFor(1);
        scrollUpDown(500);
        sleepFor(1);
        clickSelectMagyar();
        sleepFor(1);
        navigateBack();
    }

    @Test(priority=21)
    public void testSelectMalti() throws InterruptedException {
        getInitElements();
        clickEnglishUSButtton();
        sleepFor(1);
        scrollUpDown(500);
        sleepFor(1);
        clickSelectMalti();
        sleepFor(1);
        navigateBack();
    }

    @Test(priority=22)
    public void testSelectMelayu() throws InterruptedException {
        getInitElements();
        clickEnglishUSButtton();
        sleepFor(1);
        scrollUpDown(500);
        sleepFor(1);
        clickSelectMelayu();
        sleepFor(1);
        navigateBack();
    }

    @Test(priority=23)
    public void testSelectNederlands() throws InterruptedException {
        getInitElements();
        clickEnglishUSButtton();
        sleepFor(1);
        scrollUpDown(500);
        sleepFor(1);
        clickSelectNederlands();
        sleepFor(1);
        navigateBack();
    }

    @Test(priority=24)
    public void testSelectNederlandsNe() throws InterruptedException {
        getInitElements();
        clickEnglishUSButtton();
        sleepFor(1);
        scrollUpDown(500);
        sleepFor(1);
        clickSelectNederlandsNe();
        sleepFor(1);
        navigateBack();
    }

    @Test(priority=25)
    public void testSelectNorsk() throws InterruptedException {
        getInitElements();
        clickEnglishUSButtton();
        sleepFor(1);
        scrollUpDown(500);
        sleepFor(1);
        clickSelectNorsk();
        sleepFor(1);
        navigateBack();
    }
  @Test(priority=26)
    public void testSelectPortugues() throws InterruptedException {
        getInitElements();
        clickEnglishUSButtton();
        sleepFor(1);
        scrollUpDown(700);
        sleepFor(1);
        clickSelectPortugues();
        sleepFor(1);
        navigateBack();
    }

    @Test(priority=27)
    public void testSelectPortuguesPo() throws InterruptedException {
        getInitElements();
        clickEnglishUSButtton();
        sleepFor(1);
        scrollUpDown(700);
        sleepFor(1);
        clickSelectPortuguesPo();
        sleepFor(1);
        navigateBack();
    }

    @Test(priority=28)
    public void testSelectRomana() throws InterruptedException {
        getInitElements();
        clickEnglishUSButtton();
        sleepFor(1);
        scrollUpDown(700);
        sleepFor(1);
        clickSelectRomana();
        sleepFor(1);
        navigateBack();
    }

    @Test(priority=29)
    public void testSelectShqip() throws InterruptedException {
        getInitElements();
        clickEnglishUSButtton();
        sleepFor(1);
        scrollUpDown(700);
        sleepFor(1);
        clickSelectShqip();
        sleepFor(1);
        navigateBack();
    }

    @Test(priority=30)
    public void testSelectSrpski() throws InterruptedException {
        getInitElements();
        clickEnglishUSButtton();
        sleepFor(1);
        scrollUpDown(700);
        sleepFor(1);
        clickSelectSrpski();
        sleepFor(1);
        navigateBack();
    }


}
