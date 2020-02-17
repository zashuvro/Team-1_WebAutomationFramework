package homepage.pageobject;

import homepage.webelement.HomePageWebElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePageUSDTab extends HomePageWebElement {

    @FindBy(how= How.XPATH,using = xPathClickUSD)
    public static WebElement clickUSD;

    public static WebElement getclickUSD(){
        return clickUSD;
    }
    public static  void setClickUSD(){
        getclickUSD().click();
    }

    @FindBy(how= How.XPATH,using = xPathSelectUSD)
    public static WebElement selectUSD;

    public static WebElement getSelectUSD(){
        return selectUSD;
    }
    public static  void clickSelectUSD(){
        getSelectUSD().click();
    }

    @FindBy(how= How.XPATH,using = xPathSelectAUD)
    public static WebElement selectAUD;

    public static WebElement getSelectAUD(){
        return selectAUD;
    }
    public static  void clickSelectAUD(){
        getSelectAUD().click();
    }

    @FindBy(how= How.XPATH,using = xPathSelectBRL)
    public static WebElement selectBRL;

    public static WebElement getSelectBRL(){
        return selectBRL;
    }
    public static  void clickSelectBRL(){
        getSelectBRL().click();
    }

    @FindBy(how= How.XPATH,using = xPathSelectAED)
    public static WebElement selectAED;

    public static WebElement getSelectAED(){
        return selectAED;
    }
    public static  void clickSelectAED(){
        getSelectAED().click();
    }

    @FindBy(how= How.XPATH,using = xPathSelectEUR)
    public static WebElement selectEUR;

    public static WebElement getSelectEUR(){
        return selectEUR;
    }
    public static  void clickSelectEUR(){
        getSelectEUR().click();
    }

    @FindBy(how= How.XPATH,using = xPathSelectMXN)
    public static WebElement selectMXN;

    public static WebElement getSelectMXN(){
        return selectMXN;
    }
    public static  void clickSelectMXN(){
        getSelectMXN().click();
    }

  @FindBy(how= How.XPATH,using = xPathSelectRUB)
    public static WebElement selectRUB;

    public static WebElement getSelectRUB(){
        return selectRUB;
    }
    public static  void clickSelectRUB(){
        getSelectRUB().click();
    }

    @FindBy(how= How.XPATH,using = xPathSelectCHF)
    public static WebElement selectCHF;

    public static WebElement getSelectCHF(){
        return selectCHF;
    }
    public static  void clickSelectCHF(){
        getSelectCHF().click();
    }

    @FindBy(how= How.XPATH,using = xPathSelectTRY)
    public static WebElement selectTRY;

    public static WebElement getSelectTRY(){
        return selectTRY;
    }
    public static  void clickSelectTRY(){
        getSelectTRY().click();
    }

    @FindBy(how= How.XPATH,using = xPathSelectUYU) public static WebElement selectUYU;
    public static WebElement getSelectUYU(){ return selectUYU; }
    public static  void clickSelectUYU(){ getSelectUYU().click(); }

    @FindBy(how= How.XPATH,using = xPathSelectHKD) public static WebElement selectHKD;
    public static WebElement getSelectHKD(){ return selectHKD; }
    public static  void clickSelectHKD(){ getSelectHKD().click(); }

    @FindBy(how= How.XPATH,using = xPathSelectHUF) public static WebElement selectHUF;
    public static WebElement getSelectHUF(){ return selectHUF; }
    public static  void clickSelectHUF(){ getSelectHUF().click(); }

    @FindBy(how= How.XPATH,using = xPathSelectINR) public static WebElement selectINR;
    public static WebElement getSelectINR(){ return selectINR; }
    public static  void clickSelectINR(){ getSelectINR().click(); }

    @FindBy(how= How.XPATH,using = xPathSelectILS) public static WebElement selectILS;
    public static WebElement getSelectILS(){ return selectILS; }
    public static  void clickSelectILS(){ getSelectILS().click(); }

    @FindBy(how= How.XPATH,using = xPathSelectJPY) public static WebElement selectJPY;
    public static WebElement getSelectJPY(){ return selectJPY; }
    public static  void clickSelectJPY(){ getSelectJPY().click(); }

    @FindBy(how= How.XPATH,using = xPathSelectMYR) public static WebElement selectMYR;
    public static WebElement getSelectMYR(){ return selectMYR; }
    public static  void clickSelectMYR(){ getSelectMYR().click(); }

    @FindBy(how= How.XPATH,using = xPathSelectMAD) public static WebElement selectMAD;
    public static WebElement getSelectMAD(){ return selectMAD; }
    public static  void clickSelectMAD(){ getSelectMAD().click(); }

    @FindBy(how= How.XPATH,using = xPathSelectTWD) public static WebElement selectTWD;
    public static WebElement getSelectTWD(){ return selectTWD; }
    public static  void clickSelectTWD(){ getSelectTWD().click(); }

    @FindBy(how= How.XPATH,using = xPathSelectNZD) public static WebElement selectNZD;
    public static WebElement getSelectNZD(){ return selectNZD; }
    public static  void clickSelectNZD(){ getSelectNZD().click(); }

    @FindBy(how= How.XPATH,using = xPathSelectNOK) public static WebElement selectNOK;
    public static WebElement getSelectNOK(){ return selectNOK; }
    public static  void clickSelectNOK(){ getSelectNOK().click(); }



}
