package pages;


import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.HomePageLocators;
import uistore.ProductPageLocators;
import uistore.ResultsPageLocators;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class MagicMugsAction {
    WebDriverHelper helper = new WebDriverHelper();

    public void deliverToBangalore(ExtentTest test) {
        try {
            helper.clickOnElement(HomePageLocators.noThanks);
            test.log(Status.INFO, "click on the first product");
            LoggerHandler.infoMessage("verify the pincode");

        } catch (Exception e) {
            LoggerHandler.errorMessage(e.getMessage());
        }
    }

    public void personalizedNavBar() {
        try {

            helper.hoverOverElement(HomePageLocators.personalized);
            helper.clickOnElement(HomePageLocators.Mugs);
            helper.clickOnElement(HomePageLocators.pinCode);

            helper.sendKeys(HomePageLocators.pinCode, ExcelReader.readCellValue("Sheet1", "1", "city"));
            helper.waitForElementToBeVisible(ResultsPageLocators.blr);

            helper.enterAction(HomePageLocators.pinCode);

            helper.hoverOverElement(HomePageLocators.continueShoppping);
            helper.clickOnElement(HomePageLocators.continueShoppping);
            Thread.sleep(2000);
            helper.clickOnElement(ResultsPageLocators.magicMugs);
            helper.clickOnElement(ResultsPageLocators.firstResult);

            helper.switchToNewWindow();
            helper.waitForElementToBeVisible(ProductPageLocators.addToCart);
            helper.clickOnElement(ProductPageLocators.addToCart);


        } catch (Exception e) {
            LoggerHandler.errorMessage(e.getMessage());
        }
    }

}
