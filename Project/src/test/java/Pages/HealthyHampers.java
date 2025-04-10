package Pages;

import uistore.DSHomePageLocators;
import uistore.DSProductPageLocators;
import uistore.DSResultsPageLocators;
import utils.ExcelReader;
import utils.WebDriverHelper;

public class HealthyHampers {

         WebDriverHelper helper = new WebDriverHelper();

      public void deliverToBlr()
    {   
        try
        {
        helper.clickOnElement(DSHomePageLocators.noThanks);

        helper.clickOnElement(DSHomePageLocators.whereToDeliver);
        helper.clickOnElement(DSHomePageLocators.pinCode);

        helper.sendKeys(DSHomePageLocators.pinCode, "Bangalore");
        helper.waitForElementToBeVisible(DSHomePageLocators.blr);

        
        //Thread.sleep(2000);
        
        helper.enterAction(DSHomePageLocators.pinCode);
       //helper.waitForElementToBeVisible(FnpLocators.continueShoppping, 6);
       
        helper.clickOnElement(DSHomePageLocators.continueShoppping);
        Thread.sleep(2000);
        helper.waitForElementToBeVisible(DSHomePageLocators.personalized);
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
        helper.hoverOverElement(DSHomePageLocators.combos);
        helper.clickOnElement(DSHomePageLocators.hamper);
           helper.clickOnElement(DSHomePageLocators.whereToDeliver);
        helper.clickOnElement(DSHomePageLocators.pinCode);

        helper.sendKeys(DSHomePageLocators.pinCode, ExcelReader.readCellValue("Sheet1", "2", "city"));

        helper.waitForElementToBeVisible(DSHomePageLocators.blr);
        //Thread.sleep(2000);
        
        helper.enterAction(DSHomePageLocators.pinCode);
       //helper.waitForElementToBeVisible(FnpLocators.continueShoppping, 6);
     
        helper.clickOnElement(DSHomePageLocators.continueShoppping1);
        Thread.sleep(2000);
        helper.clickOnElement(DSResultsPageLocators.availability);
        helper.clickOnElement(DSResultsPageLocators.filterTrue);
        helper.clickOnElement(DSResultsPageLocators.firstResult);
        
        helper.switchToNewWindow();
        // helper.waitForElementToBeVisible(ProductPageLocators.delivery);
        // helper.clickOnElement(ProductPageLocators.delivery);
        // helper.clickOnElement(ProductPageLocators.date);
        // helper.clickOnElement(ProductPageLocators.courier);
        // helper.clickOnElement(ProductPageLocators.time);
        //Thread.sleep(4000);
        helper.clickOnElement(DSProductPageLocators.addToCart);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage()); 
        }
    }
    
}
