package pages;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.HomePage;
import uistore.HomePageLocators;
import uistore.ProductPage;
import uistore.ResultsPage;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class HomePageAction extends Base {

  WebDriverHelper helper = new WebDriverHelper();

  public void specifyLocation() {
    try {
      helper.clickOnElement(HomePage.noThanks);
      helper.clickOnElement(HomePage.location);
      helper.clickOnElement(HomePage.pinCode);
      String bangalore = ExcelReader.readCellValue("Sheet1", "1", "city");
      helper.sendKeys(HomePage.pinCode, bangalore);
      helper.waitForElementToBeVisible(ProductPage.blr,20);
      helper.clickOnElement(ProductPage.blr);
      helper.hoverOverElement(HomePage.shopping);
      helper.clickOnElement(HomePage.shopping);
      LoggerHandler.infoMessage("Location Entered Successfully");
      String pincode = ExcelReader.readCellValue("Sheet1", "1", "pincode");
      helper.assertPageText(ProductPage.blr, pincode);
      Screenshot.capScreenshot("pincode verification");
      helper.clickOnElement(HomePage.plants);
      LoggerHandler.infoMessage("Clicked on Plants");
    } catch (Exception e) {
      LoggerHandler.infoMessage(e.getMessage());
    }
  }

  public void searchPlants() {
    try {
      String bangalore = ExcelReader.readCellValue("Sheet1", "1", "city");
      helper.clickOnElement(HomePage.location);
      helper.clickOnElement(HomePage.pinCode);
      helper.sendKeys(HomePage.pinCode, bangalore);
      helper.waitForElementToBeVisible(ProductPage.blr,20);
      helper.clickOnElement(ProductPage.blr);
      helper.javascriptClick(HomePageLocators.continueShoppping1);
      helper.jsScrollByPixel();
      List<WebElement> plants = Base.driver.findElements(By.xpath("//div[@class='single-item plant_types']//h2"));
      List<String> values = ExcelReader.readExcelData("Sheet1", "plantCheck");
      for (int i = 0; i < plants.size(); i++) {
        By verify = By.xpath("//div/h2[text()='" + values.get(i) + "']");
        helper.clickOnElement(verify);
        Base.driver.navigate().back();
      }
      helper.clickOnElement(HomePage.cart);
      LoggerHandler.infoMessage("Clikced On Cart");
      String verification = ExcelReader.readCellValue("Sheet1", "1", "verify");
      helper.assertPageText(ResultsPage.continueGifting, verification);
      Screenshot.capScreenshot("FnpPlants");

    } catch (Exception e) {
      LoggerHandler.infoMessage(e.getMessage());
    }

  }

}
