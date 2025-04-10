package pages;

import org.testng.Assert;

import uistore.CakeLocators;
import uistore.HomePageLocatorsKom;
import utils.Base;
import utils.ExcelReader;
import utils.Screenshot;
import utils.WebDriverHelper;

public class CakeFnpActions {
     WebDriverHelper helper = new WebDriverHelper();
 
    public void deliverToDelhi()
    {  
        
        helper.clickOnElement(HomePageLocatorsKom.noThanks);
 
        helper.waitForElementToBeVisible(HomePageLocatorsKom.searchbar);
        helper.clickOnElement(HomePageLocatorsKom.searchbar);
         helper.sendKeys(HomePageLocatorsKom.searchbar, ExcelReader.readCellValue("Sheet1","1","data"));
        helper.waitForElementToBeVisible(HomePageLocatorsKom.searchbar);
        helper.enterAction(HomePageLocatorsKom.searchbar);

        helper.clickOnElement(HomePageLocatorsKom.whereToDeliver);
        helper.clickOnElement(HomePageLocatorsKom.city);
        
        helper.sendKeys(HomePageLocatorsKom.city, ExcelReader.readCellValue("Sheet1","1","city"));
        
        helper.waitForElementToBeVisible(HomePageLocatorsKom.clickondelhi);
        helper.enterAction(HomePageLocatorsKom.city);
        helper.waitForElementToBeVisible(HomePageLocatorsKom.continueShoppping1);
        helper.hoverOverElement(HomePageLocatorsKom.continueShoppping1);
        helper.clickOnElement(HomePageLocatorsKom.continueShoppping1);
        
        helper.clickOnElement(CakeLocators.clickonflavour);
        helper.clickOnElement(CakeLocators.clickonchocolate);
        helper.waitForElementToBeVisible(CakeLocators.firstproduct);
        helper.clickOnElement(CakeLocators.firstproduct);
        helper.switchToNewWindow();
       
        helper.clickOnElement(CakeLocators.buynow);
        Screenshot.takeScreenShotWithHighlight(CakeLocators.buynow,"Screenshot_01");
      
    }


}
