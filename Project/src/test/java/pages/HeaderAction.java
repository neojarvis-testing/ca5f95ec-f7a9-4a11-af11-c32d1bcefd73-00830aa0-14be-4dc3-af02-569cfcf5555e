package pages;

import uistore.HeaderLocators;
import uistore.HomePageLocators;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.WebDriverHelper;

public class HeaderAction extends Base {
    WebDriverHelper helper = new WebDriverHelper();

    public void specifyLocation() {
        try {
            helper.clickOnElement(HeaderLocators.noThanks);
            helper.clickOnElement(HeaderLocators.whereToDeliver);
            helper.clickOnElement(HeaderLocators.inputbox);
            String delhi = ExcelReader.readCellValue("Sheet1", "1", "city");
            helper.sendKeys(HeaderLocators.inputbox, delhi);
            helper.waitForElementToBeVisible(HeaderLocators.delhi);
            helper.clickOnElement(HeaderLocators.delhi);
            helper.clickOnElement(HeaderLocators.continueShoppping1);
            String pincode=ExcelReader.readCellValue("Sheet1","6","city");
            helper.assertPageText(HomePageLocators.location,pincode);
        } catch (Exception e) {
            LoggerHandler.infoMessage(e.getMessage());
        }
    }

    public void searchPen() {

        try {
            helper.clickOnElement(HeaderLocators.searchBar);
            String pen = ExcelReader.readCellValue("Sheet1", "2", "city");
            helper.sendKeys(HeaderLocators.searchBar, pen);
            helper.enterAction(HeaderLocators.searchBar);
            helper.clickOnElement(HeaderLocators.firstResult);
            helper.switchToNewWindow();
            helper.hoverOverElement(HeaderLocators.addToCart);
            helper.clickOnElement(HeaderLocators.addToCart);

        } catch (Exception e) {
            LoggerHandler.infoMessage(e.getMessage());
        }
    }
}
