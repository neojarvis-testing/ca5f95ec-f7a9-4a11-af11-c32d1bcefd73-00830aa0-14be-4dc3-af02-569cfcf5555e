package pages;

import uistore.DSHomePageLocators;
import uistore.DSProductPageLocators;
import uistore.DSResultsPageLocators;
import uistore.HomePage;
import uistore.ProductPage;
import uistore.ResultsPage;
import utils.Base;
import utils.ExcelReader;

import utils.Screenshot;
import utils.WebDriverHelper;

public class Flowers {
    WebDriverHelper helper = new WebDriverHelper();

    public void deliverToChennai() {
        try {
            helper.clickOnElement(HomePage.noThanks);

            helper.clickOnElement(HomePage.location);
            helper.clickOnElement(HomePage.pinCode);

            helper.sendKeys(HomePage.pinCode, ExcelReader.readCellValue("Sheet1", "2", "city"));

            helper.waitForElementToBeVisible(DSHomePageLocators.chn, 10);

            helper.enterAction(HomePage.pinCode);

            helper.hoverOverElement(HomePage.continueShoppping);
            helper.clickOnElement(HomePage.continueShoppping);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void NavBar() {
        try {
            helper.hoverOverElement(HomePage.anniversary);
            helper.getText(HomePage.anniversary);
            helper.clickOnElement(HomePage.flowers);

            helper.clickOnElement(HomePage.location);
            helper.clickOnElement(HomePage.pinCode);

            helper.sendKeys(HomePage.pinCode, ExcelReader.readCellValue("Sheet1", "2", "city"));
            helper.waitForElementToBeVisible(ProductPage.chn, 10);

            helper.enterAction(HomePage.pinCode);

            helper.clickOnElement(HomePage.continueShopppingBtn);
            Thread.sleep(2000);
            helper.clickOnElement(ResultsPage.roses);
            helper.clickOnElement(ResultsPage.firstResult);

            helper.switchToNewWindow();

            helper.clickOnElement(ProductPage.buyNow);
            helper.clickOnElement(HomePage.cart);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
