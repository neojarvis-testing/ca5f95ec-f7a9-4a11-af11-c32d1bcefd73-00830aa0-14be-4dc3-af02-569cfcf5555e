package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import uistore.HomePageLocators;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.Screenshot;
import utils.WebDriverHelper;

public class HomePageAction extends Base {

  WebDriverHelper helper = new WebDriverHelper();
   public void specifyLocation(){
    try {
      helper.clickOnElement(HomePageLocators.noThanks);
      helper.clickOnElement(HomePageLocators.whereToDeliver);
      helper.clickOnElement(HomePageLocators.inputbox);
      String bangalore=ExcelReader.readCellValue("Sheet1","3", "city");
      helper.sendKeys(HomePageLocators.inputbox,bangalore);
      helper.waitForElementToBeVisible(HomePageLocators.bangalore);
      helper.clickOnElement(HomePageLocators.bangalore);
      helper.clickOnElement(HomePageLocators.continueShoppping1);
      String s=helper.getText(HomePageLocators.location);
      String pincode=ExcelReader.readCellValue("Sheet1","5","city");
      helper.assertPageText(HomePageLocators.location,pincode);
      helper.clickOnElement(HomePageLocators.plants);
      helper.clickOnElement(HomePageLocators.whereToDeliver);
      helper.clickOnElement(HomePageLocators.inputbox);
      helper.sendKeys(HomePageLocators.inputbox, bangalore);
      helper.waitForElementToBeVisible(HomePageLocators.bangalore);
      helper.clickOnElement(HomePageLocators.bangalore);
      helper.javascriptClick(HomePageLocators.continueShoppping1);
    } catch (Exception e) {
      LoggerHandler.infoMessage(e.getMessage());
    }
  }

  public void searchPlants() {
    try {

      helper.jsScrollByPixel();
      helper.clickOnElement(HomePageLocators.luckybamboo);
      driver.navigate().back();
      helper.jsScrollByPixel();
      helper.clickOnElement(HomePageLocators.jadeplant);
      driver.navigate().back();
      helper.jsScrollByPixel();
      helper.clickOnElement(HomePageLocators.moneyplant);
      driver.navigate().back();
      helper.clickOnElement(HomePageLocators.cart);
      String verification=ExcelReader.readCellValue("Sheet1","4","city");
      helper.assertPageText(HomePageLocators.continueGifting,verification);
      Screenshot.capScreenshot("Fnp");


    } catch (Exception e) {
      LoggerHandler.infoMessage(e.getMessage());
    }

  }
  

  // public void pen(){
  //   try {
  //     helper.clickOnElement(HomePageLocators.noThanks);
  //     helper.clickOnElement(HomePageLocators.whereToDeliver);
  //     helper.clickOnElement(HomePageLocators.inputbox);
  //     String bangalore = ExcelReader.readCellValue("Sheet1", "3", "city");
  //     helper.sendKeys(HomePageLocators.inputbox, "Bangalore");
  //     helper.waitForElementToBeVisible(HomePageLocators.bangalore);
  //     helper.clickOnElement(HomePageLocators.bangalore);
  //     helper.clickOnElement(HomePageLocators.continueShoppping1);
  //     helper.clickOnElement(HomePageLocators.plants);
  //     helper.clickOnElement(HomePageLocators.whereToDeliver);
  //     helper.clickOnElement(HomePageLocators.inputbox);
  //     helper.sendKeys(HomePageLocators.inputbox, bangalore);
  //     helper.waitForElementToBeVisible(HomePageLocators.bangalore);
  //     helper.clickOnElement(HomePageLocators.bangalore);
  //     helper.javascriptClick(HomePageLocators.continueShoppping1);
  //     helper.jsScrollByPixel();
  //     List<WebElement> size = helper.getElementsByXPath("//div[@class='single-item plant_types']//h2");
  //     for (int i = 1; i <= size.size(); i++) {
  //        //String textAssert = size.get(i);
  //         String text=driver.findElement(By.xpath("(//div[@class='single-item plant_types']//h2)["+i+"]")).getText();

  //       if (size.get(i - 1).getText().contains("Lucky Bamboo") || size.get(i - 1).getText().contains("Jade Plants")
  //           || size.get(i - 1).getText().contains("Money Plants")) {
  //             String id=i;
  //         System.out.println(size.get(i - 1).getText());
  //         Base.driver.findElement(By.xpath("//div/h2[text()=\""+ExcelReader.readCellValue("sheet3","id","plants")+"\"]")).click();
  //         Thread.sleep(5000); 
          
  //         driver.navigate().back();
  //       }

  //       // if(text.contains("Lucky Bamboo")){
  //       // driver.findElement(By.xpath("(//div[@class='single-item plant_types']//h2)["+i+"]")).click();
  //       // driver.navigate().back();
  //       // }

  //       // else if(text.contains("Jade Plants")){
  //       // driver.findElement(By.xpath("(//div[@class='single-item plant_types']//h2)["+i+"]")).click();
  //       // driver.navigate().back();
  //       // }
  //       // else if(text.contains("Money Plants")){
  //       // driver.findElement(By.xpath("(//div[@class='single-item plant_types']//h2)["+i+"]")).click();
  //       // driver.navigate().back();
  //       // }

  //     }
  //     helper.clickOnElement(HomePageLocators.cart);
  //     String verification = ExcelReader.readCellValue("Sheet1", "4", "city");
  //     helper.assertPageText(HomePageLocators.continueGifting, verification);
      
  //   } catch (Exception e) {
  //     LoggerHandler.infoMessage(e.getMessage());
  //   }
  // }
      // helper.clickOnElement(HomePageLocators.noThanks);
      // helper.clickOnElement(HomePageLocators.whereToDeliver);
      // helper.clickOnElement(HomePageLocators.inputbox);
      // String bangalore = ExcelReader.readCellValue("Sheet1", "3", "city");
      // helper.sendKeys(HomePageLocators.inputbox, "Bangalore");
      // helper.waitForElementToBeVisible(HomePageLocators.bangalore);
      // helper.clickOnElement(HomePageLocators.bangalore);
      // helper.clickOnElement(HomePageLocators.continueShoppping);
      // helper.clickOnElement(HomePageLocators.plants);
      // helper.clickOnElement(HomePageLocators.whereToDeliver);
      // helper.clickOnElement(HomePageLocators.inputbox);
      // helper.sendKeys(HomePageLocators.inputbox, bangalore);
      // helper.waitForElementToBeVisible(HomePageLocators.bangalore);
      // helper.clickOnElement(HomePageLocators.bangalore);
      // helper.javascriptClick(HomePageLocators.continueShoppping1);
      // helper.jsScrollByPixel();
      // List<WebElement> size = helper.getElementsByXPath("//div[@class='single-item plant_types']//h2");
      // for (int i = 1; i <= size.size(); i++) {
      //   // String textAssert = size.get(i);
      //     String text=driver.findElement(By.xpath("(//div[@class='single-item plant_types']//h2)["+i+"]")).getText();

      //   // if (size.get(i - 1).getText().contains("Lucky Bamboo") || size.get(i - 1).getText().contains("Jade Plants")
      //   //     || size.get(i - 1).getText().contains("Money Plants")) {
      //   //       String id=i;
      //   //   System.out.println(size.get(i - 1).getText());
      //   //   Base.driver.findElement(By.xpath("//div/h2[text()=\""+ExcelReader.readCellValue("sheet3","id","plants")+"\"]")).click();
      //   //   Thread.sleep(5000); 
          
      //   //   driver.navigate().back();
      //   // }

      //   if(text.contains("Lucky Bamboo")){
      //   driver.findElement(By.xpath("(//div[@class='single-item plant_types']//h2)["+i+"]")).click();
      //   driver.navigate().back();
      //   }

      //   else if(text.contains("Jade Plants")){
      //   driver.findElement(By.xpath("(//div[@class='single-item plant_types']//h2)["+i+"]")).click();
      //   driver.navigate().back();
      //   }
      //   else if(text.contains("Money Plants")){
      //   driver.findElement(By.xpath("(//div[@class='single-item plant_types']//h2)["+i+"]")).click();
      //   driver.navigate().back();
      //   }

      // }
      // helper.clickOnElement(HomePageLocators.cart);
      // String verification = ExcelReader.readCellValue("Sheet1", "4", "city");
      // helper.assertPageText(HomePageLocators.continueGifting, verification);
}
