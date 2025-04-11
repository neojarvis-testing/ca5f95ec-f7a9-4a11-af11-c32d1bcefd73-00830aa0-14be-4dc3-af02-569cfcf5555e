package pages;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.HomePage;
import uistore.NavBarLocatorsSubh;
import uistore.ProductPage;
import uistore.ResultsPage;
import utils.Base;
import utils.ExcelReader;
import utils.Screenshot;
import utils.WebDriverHelper;

public class NavBarActionsSubh {
  WebDriverHelper helper = new WebDriverHelper();

  public void whereToDeliver() {
    helper.clickOnElement(HomePage.noThanks);
    helper.clickOnElement(HomePage.location);
    helper.clickOnElement(HomePage.pinCode);
    helper.sendKeys(HomePage.pinCode, ExcelReader.readCellValue("Sheet1", "2", "city"));
    helper.enterAction(HomePage.pinCode);
    helper.waitForElementToBeVisible(HomePage.shopping, 10);
    helper.clickOnElement(HomePage.shopping);
  }

  public void birthdayCakeSearch(ExtentTest test) throws Exception {

    helper.hoverOverElement(HomePage.cakes);
    helper.clickOnElement(HomePage.birthdayCake);

    
    helper.clickOnElement(HomePage.pinCode);
    helper.sendKeys(HomePage.pinCode, ExcelReader.readCellValue("Sheet1", "2", "city"));
   
    helper.clickOnElement(NavBarLocatorsSubh.chennaiLocationSelect);

    helper.waitForElementToBeVisible(HomePage.continueShopppingBtn, 10);
    helper.clickOnElement(HomePage.continueShopppingBtn);

    helper.clickOnElement(ResultsPage.sameDayDelivery);
    Screenshot.capScreenshot("sameDayDelivery");

    helper.clickOnElement(HomePage.pinCode);
    helper.sendKeys(HomePage.pinCode, ExcelReader.readCellValue("Sheet1", "2", "city"));

    helper.clickOnElement(ProductPage.chn);
    helper.clickOnElement(HomePage.shopping);

    helper.clickOnElement(ResultsPage.firstCake);
    test.log(Status.INFO,"click on the first product");
    helper.switchToNewWindow();
    test.log(Status.INFO, "Switched to new Window");
  }
   
  public void buyTheCake(){
    helper.clickOnElement(ProductPage.addToCart);
    Screenshot.takeScreenShotWithHighlight(ProductPage.buyNow, "FNP");
    helper.clickOnElement(ProductPage.buyNow);

  }
}
