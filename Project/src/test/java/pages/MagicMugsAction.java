package pages;


import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.HomePage;
import uistore.HomePageLocators;
import uistore.ProductPage;
import uistore.ResultsPage;
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
            test.log(Status.INFO, "clicked on no thanks");
            LoggerHandler.infoMessage("verify the pincode");
            Screenshot.capScreenshot("FNP");
            LoggerHandler.infoMessage("hello");
            Reporter.attachToReport("FNP",test,"");
            

        } catch (Exception e) {
            LoggerHandler.errorMessage(e.getMessage());
        }
    }

    public void personalizedNavBar(ExtentTest test) {
        try {

            helper.hoverOverElement(HomePage.personalized);
            helper.clickOnElement(HomePage.Mugs);
            helper.clickOnElement(HomePage.pinCode);


            helper.sendKeys(HomePage.pinCode, ExcelReader.readCellValue("Sheet1", "1", "city"));
            helper.waitForElementToBeVisible(ProductPage.blr, 10);
            test.log(Status.INFO, "entered city");

            helper.enterAction(HomePage.pinCode);

            helper.hoverOverElement(HomePage.shopping);
            helper.clickOnElement(HomePage.shopping);
            Thread.sleep(2000);
            helper.clickOnElement(ResultsPage.magicMugs);
            helper.clickOnElement(ResultsPage.firstResult);
            test.log(Status.INFO, "click on the first product");

            helper.switchToNewWindow();
            helper.waitForElementToBeVisible(ProductPage.addToCart, 10);
            helper.clickOnElement(ProductPage.addToCart);
            test.log(Status.INFO, "clicked om add to cart");


        } catch (Exception e) {
            LoggerHandler.errorMessage(e.getMessage());
        }
    }

}
