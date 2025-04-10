package pages;

import uistore.HomePageLocatorsKom;
import uistore.LifeStyleLocators;
import utils.ExcelReader;
import utils.WebDriverHelper;

public class LifeStyleFnpActions {

     WebDriverHelper helper = new WebDriverHelper();
     public void delivertoKolkata(){
            helper.clickOnElement(HomePageLocatorsKom.noThanks);
 
        helper.hoverOverElement(HomePageLocatorsKom.hoverlifestyle);
        helper.clickOnElement(HomePageLocatorsKom.jewellery);
     //   helper.clickOnElement(LifeStyleLocators.rings);
        
        helper.clickOnElement(HomePageLocatorsKom.whereToDeliver);
        helper.clickOnElement(HomePageLocatorsKom.city);
        
        helper.sendKeys(HomePageLocatorsKom.city, ExcelReader.readCellValue("Sheet1","2","city"));
        
        helper.waitForElementToBeVisible(HomePageLocatorsKom.clickonkolkata);
        helper.enterAction(HomePageLocatorsKom.city);
        helper.waitForElementToBeVisible(HomePageLocatorsKom.continueShoppping1);
        helper.hoverOverElement(HomePageLocatorsKom.continueShoppping1);
        helper.clickOnElement(HomePageLocatorsKom.continueShoppping1);
        

        helper.clickOnElement(LifeStyleLocators.rings);

        helper.clickOnElement(HomePageLocatorsKom.whereToDeliver);
        helper.clickOnElement(HomePageLocatorsKom.city);
        
        helper.sendKeys(HomePageLocatorsKom.city, ExcelReader.readCellValue("Sheet1","2","city"));
        
        helper.waitForElementToBeVisible(HomePageLocatorsKom.clickonkolkata);
        helper.enterAction(HomePageLocatorsKom.city);
        helper.waitForElementToBeVisible(HomePageLocatorsKom.continueShoppping1);
        helper.hoverOverElement(HomePageLocatorsKom.continueShoppping1);
        helper.clickOnElement(HomePageLocatorsKom.continueShoppping1);
        helper.clickOnElement(LifeStyleLocators.firstproduct);
        helper.switchToNewWindow();
      
        helper.clickOnElement(LifeStyleLocators.addtocart);

       
    }

}
