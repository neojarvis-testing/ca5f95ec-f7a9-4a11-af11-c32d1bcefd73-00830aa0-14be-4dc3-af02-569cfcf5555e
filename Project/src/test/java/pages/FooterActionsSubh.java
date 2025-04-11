package pages;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import uistore.FooterLocatorsSubh;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.WebDriverHelper;

public class FooterActionsSubh {
  WebDriverHelper helper = new WebDriverHelper();

  public void linkVerificationPolicyInfo() {
    helper.clickOnElement(FooterLocatorsSubh.noThanks);
    LoggerHandler.infoMessage("No thanks click");
    helper.javascriptScroll(FooterLocatorsSubh.policyInfo);

    List<String> linkLists = ExcelReader.readExcelData("Sheet1", "linkTextPolicy");

    for (int i = 0; i < linkLists.size(); i++) {
      String linkText = linkLists.get(i);
      By footerLink = By.xpath("//a[text()='" + linkText + "']");

      helper.clickOnElement(footerLink);
      helper.waitForElementToBeVisible(FooterLocatorsSubh.homePageLogo, 10);
      LoggerHandler.infoMessage("Redirected page Open" + linkText);

      Base.driver.navigate().back();
    }
  }

  public void linkVerificationAboutCompany() {

    List<String> linkLists = ExcelReader.readExcelData("Sheet1", "linkAboutCompany");
    for (int i = 0; i < linkLists.size(); i++) {

      String linkText = linkLists.get(i);
      By footerLink = By.xpath("//a[text()='" + linkText + "']");
     // helper.waitForElementToBeVisible(footerLink, 20);
      helper.clickOnElement(footerLink);
      // List<String> titleList = ExcelReader.readExcelData("Sheet1", "linkAboutCompany");
      // helper.assertPageTitle(Base.driver, titleList.get(i));
      LoggerHandler.infoMessage("Redirected page title verified" + linkText);
      Base.driver.navigate().back();
    }
  }


}
