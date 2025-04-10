package pages;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.NavBarLocatorsSubh;
import utils.Base;
import utils.ExcelReader;
import utils.Screenshot;
import utils.WebDriverHelper;

public class NavBarActionsSubh {
  WebDriverHelper helper = new WebDriverHelper();

  public void whereToDeliver() {
    helper.clickOnElement(NavBarLocatorsSubh.noThanks);
    helper.clickOnElement(NavBarLocatorsSubh.location);
    helper.clickOnElement(NavBarLocatorsSubh.pinCode);
    helper.sendKeys(NavBarLocatorsSubh.pinCode, ExcelReader.readCellValue("Sheet1", "1", "city"));
    helper.enterAction(NavBarLocatorsSubh.pinCode);
    helper.waitForElementToBeVisible(NavBarLocatorsSubh.continueShopping);
    helper.clickOnElement(NavBarLocatorsSubh.continueShopping);
  }

  public void birthdayCakeSearch(ExtentTest test) throws Exception {

    helper.hoverOverElement(NavBarLocatorsSubh.cakes);
    helper.clickOnElement(NavBarLocatorsSubh.birthdayCake);

    
    helper.clickOnElement(NavBarLocatorsSubh.pinCode);
    helper.sendKeys(NavBarLocatorsSubh.pinCode, ExcelReader.readCellValue("Sheet1", "1", "city"));
   
    helper.clickOnElement(NavBarLocatorsSubh.chennaiLocationSelect);
    helper.waitForElementToBeVisible(NavBarLocatorsSubh.continueShopppingCake);
    helper.clickOnElement(NavBarLocatorsSubh.continueShopppingCake);

    helper.clickOnElement(NavBarLocatorsSubh.sameDayDelivery);
    Screenshot.capScreenshot("sameDayDelivery");

    helper.clickOnElement(NavBarLocatorsSubh.pinCode);
    helper.sendKeys(NavBarLocatorsSubh.pinCode, ExcelReader.readCellValue("Sheet1", "1", "city"));

    helper.clickOnElement(NavBarLocatorsSubh.chennaiLocationSelect);
    helper.clickOnElement(NavBarLocatorsSubh.continueShopping);

    helper.clickOnElement(NavBarLocatorsSubh.firstCake);
    test.log(Status.INFO,"click on the first product");
    helper.switchToNewWindow();
    test.log(Status.INFO, "Switched to new Window");
  }
   
  public void buyTheCake(){
    helper.clickOnElement(NavBarLocatorsSubh.addToCart);
    Screenshot.takeScreenShotWithHighlight(NavBarLocatorsSubh.buyNow, "FNP");
    helper.clickOnElement(NavBarLocatorsSubh.buyNow);

  }
}
