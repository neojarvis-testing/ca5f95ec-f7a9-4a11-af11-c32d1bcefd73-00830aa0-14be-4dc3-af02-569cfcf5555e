package pages;

import uistore.DSHomePageLocators;
import uistore.DSProductPageLocators;
import uistore.DSResultsPageLocators;
import uistore.HomePage;
import uistore.ProductPage;
import uistore.ResultsPage;
import utils.ExcelReader;
import utils.WebDriverHelper;

public class HealthyHampers {

         WebDriverHelper helper = new WebDriverHelper();

      public void deliverToBlr()
    {   
        try
        {
        helper.clickOnElement(HomePage.noThanks);

        helper.clickOnElement(HomePage.location);
        helper.clickOnElement(HomePage.pinCode);

        helper.sendKeys(HomePage.pinCode, ExcelReader.readCellValue("Sheet1","1","city"));
        helper.waitForElementToBeVisible(DSHomePageLocators.blr, 10);

   
        
        helper.enterAction(HomePage.pinCode);
      
       
        helper.clickOnElement(HomePage.continueShoppping);
        Thread.sleep(2000);
        
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
        helper.hoverOverElement(HomePage.combos);
        helper.clickOnElement(HomePage.hamper);
           helper.clickOnElement(HomePage.location);
        helper.clickOnElement(HomePage.pinCode);

        helper.sendKeys(HomePage.pinCode, ExcelReader.readCellValue("Sheet1", "1", "city"));

        helper.waitForElementToBeVisible(ProductPage.blr, 10);

        
        helper.enterAction(HomePage.pinCode);

     
        helper.clickOnElement(HomePage.continueShopppingBtn);
        Thread.sleep(2000);
        helper.clickOnElement(ResultsPage.availability);
        helper.clickOnElement(ResultsPage.filterTrue);
        helper.clickOnElement(ResultsPage.firstResult);
        
        helper.switchToNewWindow();
       
        helper.clickOnElement(ProductPage.addToCart);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage()); 
        }
    }
    
}
