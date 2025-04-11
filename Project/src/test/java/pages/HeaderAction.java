package pages;

import uistore.HeaderLocators;
import uistore.HomePage;
import uistore.HomePageLocators;
import uistore.ProductPage;
import uistore.ResultsPage;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.Screenshot;
import utils.WebDriverHelper;

public class HeaderAction extends Base {
    WebDriverHelper helper = new WebDriverHelper();

    public void specifyLocation() {
        try {
            helper.clickOnElement(HomePage.noThanks);
            helper.clickOnElement(HomePage.location);
            LoggerHandler.infoMessage("verify the pincode");
            Screenshot.capScreenshot("FNP");
            helper.clickOnElement(HomePage.pinCode);
            String delhi = ExcelReader.readCellValue("Sheet1", "3", "city");
            helper.sendKeys(HomePage.pinCode, delhi);

            helper.waitForElementToBeVisible(ProductPage.delhi, 10);
            helper.clickOnElement(ProductPage.delhi);

            helper.clickOnElement(HomePage.continueShopppingBtn);
            
            String pincode=ExcelReader.readCellValue("Sheet1","2","pincode");
            helper.assertPageText(HomePageLocators.location,pincode);
        } catch (Exception e) {
            LoggerHandler.infoMessage(e.getMessage());
        }
    }

    public void searchPen() {

        try {
            helper.clickOnElement(HomePage.searchbar);
            String pen = ExcelReader.readCellValue("Sheet1", "2", "data");
            helper.sendKeys(HomePage.searchbar, pen);
            helper.enterAction(HomePage.searchbar);
            helper.clickOnElement(ResultsPage.firstPen);
            helper.switchToNewWindow();
            helper.hoverOverElement(ProductPage.addToCart);
            helper.clickOnElement(ProductPage.addToCart);

        } catch (Exception e) {
            LoggerHandler.infoMessage(e.getMessage());
        }
    }
}
