package Pages;

import uistore.DSHomePageLocators;
import uistore.DSProductPageLocators;
import uistore.DSResultsPageLocators;
import utils.Base;
import utils.ExcelReader;

import utils.Screenshot;
import utils.WebDriverHelper;

public class Flowers {
     WebDriverHelper helper = new WebDriverHelper();

      public void deliverToChennai()
    {   
        try
        {
        helper.clickOnElement(DSHomePageLocators.noThanks);

 
        Screenshot.capScreenshot("hello");
        Screenshot.takeScreenShotWithHighlight( DSHomePageLocators.whereToDeliver, "hellohello");

        helper.clickOnElement(DSHomePageLocators.whereToDeliver);
        helper.clickOnElement(DSHomePageLocators.pinCode);

        helper.sendKeys(DSHomePageLocators.pinCode, ExcelReader.readCellValue("Sheet1", "1", "city"));

        helper.waitForElementToBeVisible(DSHomePageLocators.chn);
        // Thread.sleep(2000);
        
        helper.enterAction(DSHomePageLocators.pinCode);
       //helper.waitForElementToBeVisible(FnpLocators.continueShoppping, 6);
        // Thread.sleep(2000);
        helper.hoverOverElement(DSHomePageLocators.continueShoppping);
        helper.clickOnElement(DSHomePageLocators.continueShoppping);
        //helper.waitForElementToBeVisible(FnpLocators.personalized, 6);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    public void NavBar()
    {   
        try
        {
        helper.hoverOverElement(DSHomePageLocators.anniversary);
        helper.getText(DSHomePageLocators.anniversary);
        helper.clickOnElement(DSHomePageLocators.flowers);

        helper.clickOnElement(DSHomePageLocators.whereToDeliver);
        helper.clickOnElement(DSHomePageLocators.pinCode);

        helper.sendKeys(DSHomePageLocators.pinCode, ExcelReader.readCellValue("Sheet1", "1", "city"));
        helper.waitForElementToBeVisible(DSHomePageLocators.chn);

        //helper.waitForElementToBeVisible(FnpLocators.blr, 10);
        //Thread.sleep(2000);
        
        helper.enterAction(DSHomePageLocators.pinCode);
       //helper.waitForElementToBeVisible(FnpLocators.continueShoppping, 6);
        //Thread.sleep(2000);
        helper.clickOnElement(DSHomePageLocators.continueShoppping1);
        Thread.sleep(2000);
        helper.clickOnElement(DSResultsPageLocators.roses);
        helper.clickOnElement(DSResultsPageLocators.firstResult);
        
        helper.switchToNewWindow();
        // helper.waitForElementToBeVisible(ProductPageLocators.delivery);
        // helper.clickOnElement(ProductPageLocators.delivery);
        // helper.clickOnElement(ProductPageLocators.date);
        // helper.clickOnElement(ProductPageLocators.courier);
        // helper.clickOnElement(ProductPageLocators.time);
        
        helper.clickOnElement(DSProductPageLocators.buyNow);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage()); 
        }
    }

    
    
}
