package pages;

import org.testng.Assert;
import uistore.CakeLocators;
import uistore.HomePage;
import uistore.HomePageLocatorsKom;
import uistore.ProductPage;
import uistore.ResultsPage;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.Screenshot;
import utils.WebDriverHelper;

public class CakeFnpActions {
    WebDriverHelper helper = new WebDriverHelper();

    public void SearchBar() {

        try {
            helper.clickOnElement(HomePage.noThanks);
            helper.waitForElementToBeVisible(HomePage.searchbar, 10);
            helper.clickOnElement(HomePage.searchbar);
            helper.sendKeys(HomePageLocatorsKom.searchbar, ExcelReader.readCellValue("Sheet1", "1", "data"));
            helper.waitForElementToBeVisible(HomePage.searchbar, 10);
            helper.enterAction(HomePage.searchbar);
        } catch (Exception e) {
            LoggerHandler.errorMessage(e.getMessage());
        }

    }

    public void deliverToDelhi() {
        try {

            helper.clickOnElement(HomePage.location);
            helper.clickOnElement(HomePage.pinCode);

            helper.sendKeys(HomePage.pinCode, ExcelReader.readCellValue("Sheet1", "3", "city"));

            helper.waitForElementToBeVisible(ProductPage.delhi, 10);
            helper.enterAction(HomePage.pinCode);
            helper.waitForElementToBeVisible(HomePage.continueShopppingBtn, 10);
            helper.hoverOverElement(HomePage.continueShopppingBtn);
            helper.clickOnElement(HomePage.continueShopppingBtn);
        } catch (Exception e) {
            LoggerHandler.errorMessage(e.getMessage());
        }

    }

    public void FirstProduct() {

        try {
            helper.clickOnElement(ResultsPage.clickonflavour);
            helper.clickOnElement(ResultsPage.clickonchocolate);
            helper.waitForElementToBeVisible(ResultsPage.firstResult, 10);
            helper.clickOnElement(ResultsPage.firstResult);
            helper.switchToNewWindow();
            helper.clickOnElement(ProductPage.buyNow);
            Screenshot.takeScreenShotWithHighlight(ProductPage.buyNow, "Screenshot_01");
        } catch (Exception e) {
            LoggerHandler.errorMessage(e.getMessage());
        }

    }

}
