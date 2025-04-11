package pages;

import com.aventstack.extentreports.ExtentTest;

import uistore.HomePage;
import uistore.HomePageLocatorsKom;
import uistore.LifeStyleLocators;
import uistore.ProductPage;
import uistore.ResultsPage;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class LifeStyleFnpActions {

     WebDriverHelper helper = new WebDriverHelper();

     public void NavBar(){

       try {
        helper.clickOnElement(HomePage.noThanks);
            
        helper.hoverOverElement(HomePage.hoverlifestyle);
        helper.clickOnElement(HomePage.jewellery);
       } catch (Exception e) {
        LoggerHandler.errorMessage(e.getMessage());
       }
     }
     public void delivertoKolkata(){
        
       try {
        helper.clickOnElement(HomePage.location);
        helper.clickOnElement(HomePage.pinCode);
        
        helper.sendKeys(HomePage.pinCode, ExcelReader.readCellValue("Sheet1","4","city"));
        
        helper.waitForElementToBeVisible(ProductPage.kolkata, 10);
        helper.enterAction(HomePage.pinCode);
        helper.waitForElementToBeVisible(HomePage.continueShopppingBtn, 10);
        helper.hoverOverElement(HomePage.continueShopppingBtn);
        helper.clickOnElement(HomePage.continueShopppingBtn);
        

        helper.clickOnElement(ResultsPage.rings);
        helper.clickOnElement(HomePage.location);
        helper.clickOnElement(HomePage.pinCode);
        
        helper.sendKeys(HomePage.pinCode, ExcelReader.readCellValue("Sheet1","4","city"));
        
        helper.waitForElementToBeVisible(ProductPage.kolkata, 10);
        helper.enterAction(HomePage.pinCode);
        helper.waitForElementToBeVisible(HomePage.continueShopppingBtn, 10);
        helper.hoverOverElement(HomePage.continueShopppingBtn);
        helper.clickOnElement(HomePage.continueShopppingBtn);
       } catch (Exception e) {
        LoggerHandler.errorMessage(e.getMessage());
       }

       
    }
    public void FirstProduct(ExtentTest test){
       try {
        helper.clickOnElement(ResultsPage.firstResult);
        helper.switchToNewWindow();
        helper.clickOnElement(ProductPage.addToCart);
        Screenshot.takeScreenShotWithHighlight(ProductPage.addToCart,"FNP");
        Reporter.attachToReport("FNP",test,"Passed");
       } catch (Exception e) {
        LoggerHandler.errorMessage(e.getMessage());
       }
    }
}
