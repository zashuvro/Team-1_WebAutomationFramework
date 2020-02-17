package homepage.pageobject;

import homepage.webelement.HomePageWebElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePageLanguageTab extends HomePageWebElement {

    @FindBy(how= How.XPATH,using = HomePageWebElement.xPathEnglishUsButton)
    public static WebElement EnglishUsButton;
    public static WebElement getEnglishUsButton(){
        return EnglishUsButton;
    }
    public static void clickEnglishUSButtton(){
        getEnglishUsButton().click();
    }

    @FindBy(how= How.XPATH,using = HomePageWebElement.xPathSelectEnglish)
    public static WebElement selectEnglish;
    public static WebElement getSelectEnglish(){
        return selectEnglish;
    }
    public static  void clickSelectEnglish(){
        getSelectEnglish().click();
    }

    @FindBy(how= How.XPATH,using = HomePageWebElement.xPathSelectAzerbaycan)
    public static WebElement selectAzerbaycan;
    public static WebElement getSelectAzerbaycan(){
        return selectAzerbaycan;
    }
    public static  void clickSelectAzerbaycan(){
        getSelectAzerbaycan().click();
    }

    @FindBy(how= How.XPATH,using = xPathSelectBahasaIndo)
    public static WebElement selectBahasaIndo;
    public static WebElement getSelectBahasaIndo(){
        return selectBahasaIndo;
    }
    public static  void clickSelectBahasaIndo(){
        getSelectBahasaIndo().click();
    }

    @FindBy(how= How.XPATH,using = xPathSelectBosanski)
    public static WebElement selectBosanski;
    public static WebElement getSelectBosanski(){
        return selectBosanski;
    }
    public static  void clickSelectBosanski(){
        getSelectBosanski().click();
    }

    @FindBy(how= How.XPATH,using = xPathSelectCatala)
    public static WebElement selectCatala;
    public static WebElement getSelectCatala(){
        return selectCatala;
    }
    public static  void clickSelectCatala(){
        getSelectCatala().click();
    }

    @FindBy(how= How.XPATH,using = xPathSelectJapanese)
    public static WebElement selectJapanese;
    public static WebElement getSelectJapanese(){
        return selectJapanese;
    }
    public static  void clickSelectJapanese(){
        getSelectJapanese().click();
    }

    @FindBy(how= How.XPATH,using = xPathSelectHindi)
    public static WebElement selectHindi;
    public static WebElement getSelectHindi(){
        return selectHindi;
    }
    public static  void clickSelectHindi(){
        getSelectHindi().click();
    }

    @FindBy(how= How.XPATH,using = xPathSelectArabic)
    public static WebElement selectArabic;
    public static WebElement getSelectArabic(){
        return selectArabic;
    }
    public static  void clickSelectArabic(){
        getSelectArabic().click();
    }

    @FindBy(how= How.XPATH,using = xPathSelectThaiWan)
    public static WebElement selectThaiWan;
    public static WebElement getSelectThaiWan(){
        return selectThaiWan;
    }
    public static  void clickSelectThaiWan(){
        getSelectThaiWan().click();
    }

    @FindBy(how= How.XPATH,using = xPathSelectPolski) public static WebElement selectPolski;
    public static WebElement getSelectPolski(){
        return selectPolski;
    }
    public static  void clickSelectPolski(){
        getSelectPolski().click();
    }

    @FindBy(how= How.XPATH,using = xPathSelectFrancias) public static WebElement selectFrancias;
    public static WebElement getSelectFrancias(){ return selectFrancias; }
    public static  void clickSelectFrancias(){ getSelectFrancias().click(); }

    @FindBy(how= How.XPATH,using = xPathSelectFranciasFra) public static WebElement selectFranciasFra;
    public static WebElement getSelectFranciasFra(){ return selectFranciasFra; }
    public static  void clickSelectFranciasFra(){ getSelectFranciasFra().click(); }

    @FindBy(how= How.XPATH,using = xPathSelectGaeilge) public static WebElement selectGaeilge;
    public static WebElement getSelectGaeilge(){ return selectGaeilge; }
    public static  void clickSelectGaeilge(){ getSelectGaeilge().click(); }

    @FindBy(how= How.XPATH,using = xPathSelectHrvatski) public static WebElement selectHrvatski;
    public static WebElement getSelectHrvatski(){ return selectHrvatski; }
    public static  void clickSelectHrvatski(){ getSelectHrvatski().click(); }

    @FindBy(how= How.XPATH,using = xPathSelectisiXhosa) public static WebElement selectisiXhosa;
    public static WebElement getSelectisiXhosa(){ return selectisiXhosa; }
    public static  void clickSelectisiXhosa(){ getSelectisiXhosa().click(); }

    @FindBy(how= How.XPATH,using = xPathSelectisiZulu) public static WebElement selectisiZulu;
    public static WebElement getSelectisiZulu(){ return selectisiZulu; }
    public static  void clickSelectisiZulu(){ getSelectisiZulu().click(); }

    @FindBy(how= How.XPATH,using = xPathSelectItaliano) public static WebElement selectItaliano;
    public static WebElement getSelectItaliano(){ return selectItaliano; }
    public static  void clickSelectItaliano(){ getSelectItaliano().click(); }

    @FindBy(how= How.XPATH,using = xPathSelectKiswahili) public static WebElement selectKiswahili;
    public static WebElement getSelectKiswahili(){ return selectKiswahili; }
    public static  void clickSelectKiswahili(){ getSelectKiswahili().click(); }

    @FindBy(how= How.XPATH,using = xPathSelectLatviesu) public static WebElement selectLatviesu;
    public static WebElement getSelectLatviesu(){ return selectLatviesu; }
    public static  void clickSelectLatviesu(){ getSelectLatviesu().click(); }

    @FindBy(how= How.XPATH,using = xPathSelectLietuviu) public static WebElement selectLietuviu;
    public static WebElement getSelectLietuviu(){ return selectLietuviu; }
    public static  void clickSelectLietuviu(){ getSelectLietuviu().click(); }

    @FindBy(how= How.XPATH,using = xPathSelectMagyar) public static WebElement selectMagyar;
    public static WebElement getSelectMagyar(){ return selectMagyar; }
    public static  void clickSelectMagyar(){ getSelectMagyar().click(); }

    @FindBy(how= How.XPATH,using = xPathSelectMalti) public static WebElement selectMalti;
    public static WebElement getSelectMalti(){ return selectMalti; }
    public static  void clickSelectMalti(){ getSelectMalti().click(); }

    @FindBy(how= How.XPATH,using = xPathSelectMelayu) public static WebElement selectMelayu;
    public static WebElement getSelectMelayu(){ return selectMelayu; }
    public static  void clickSelectMelayu(){ getSelectMelayu().click(); }

    @FindBy(how= How.XPATH,using = xPathSelectNederlands) public static WebElement selectNederlands;
    public static WebElement getSelectNederlands(){ return selectNederlands; }
    public static  void clickSelectNederlands(){ getSelectNederlands().click(); }

    @FindBy(how= How.XPATH,using = xPathSelectNederlandsNe) public static WebElement selectNederlandsNe;
    public static WebElement getSelectNederlandsNe(){ return selectNederlandsNe; }
    public static  void clickSelectNederlandsNe(){ getSelectNederlandsNe().click(); }

    @FindBy(how= How.XPATH,using = xPathSelectNorsk) public static WebElement selectNorsk;
    public static WebElement getSelectNorsk(){ return selectNorsk; }
    public static  void clickSelectNorsk(){ getSelectNorsk().click(); }

    @FindBy(how= How.XPATH,using = xPathSelectPortugues) public static WebElement selectPortugues;
    public static WebElement getSelectPortugues(){ return selectPortugues; }
    public static  void clickSelectPortugues(){ getSelectPortugues().click(); }

    @FindBy(how= How.XPATH,using = xPathSelectPortuguesPo) public static WebElement selectPortuguesPo;
    public static WebElement getSelectPortuguesPo(){ return selectPortuguesPo; }
    public static  void clickSelectPortuguesPo(){ getSelectPortuguesPo().click(); }

    @FindBy(how= How.XPATH,using = xPathSelectRomana) public static WebElement selectRomana;
    public static WebElement getSelectRomana(){ return selectRomana; }
    public static  void clickSelectRomana(){ getSelectRomana().click(); }

    @FindBy(how= How.XPATH,using = xPathSelectShqip) public static WebElement selectShqip;
    public static WebElement getSelectShqip(){ return selectShqip; }
    public static  void clickSelectShqip(){ getSelectShqip().click(); }

    @FindBy(how= How.XPATH,using = xPathSelectSrpski) public static WebElement selectSrpski;
    public static WebElement getSelectSrpski(){ return selectSrpski; }
    public static  void clickSelectSrpski(){ getSelectSrpski().click(); }


}
