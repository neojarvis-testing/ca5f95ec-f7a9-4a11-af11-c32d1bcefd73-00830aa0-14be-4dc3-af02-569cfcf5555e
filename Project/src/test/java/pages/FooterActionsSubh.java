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
    List<String> linkTextBusiness = Base.driver.findElements(By.xpath(
        "//h6[contains(text(),'Policy Info')]/following-sibling::ul/li/a"))
        .stream()
        .map(WebElement::getText)
        .collect(Collectors.toList());
    for (int i = 0; i < linkTextBusiness.size(); i++) {
      String linkText = linkTextBusiness.get(i);
      By footerLink = By.xpath("//a[text()='" + linkText + "']");
      System.out.println(footerLink);
      helper.clickOnElement(footerLink);
      String text = Base.driver.getTitle();
      List<String> titleList = ExcelReader.readExcelData("Sheet1", "title");
      helper.assertPageTitle(Base.driver, titleList.get(i));
      System.out.println(text);
      Base.driver.navigate().back();
    }
    String string = helper.getText(FooterLocatorsSubh.policyInfo);
    helper.assertPageText(Base.driver, FooterLocatorsSubh.policyInfo, string);
  }
  public void linkVerificationAboutCompany() {
    List<String> linkTextBusiness = Base.driver.findElements(By.xpath(
        "//h6[contains(text(),'About Company')]/following-sibling::ul/li/a"))
        .stream()
       .map(WebElement::getText)
        .collect(Collectors.toList());
    for (int i = 0; i < linkTextBusiness.size(); i++) {
      String linkText = linkTextBusiness.get(i);
      By footerLink = By.xpath("//a[text()='" + linkText + "']");
      System.out.println(footerLink);
      helper.clickOnElement(footerLink);
      String text = Base.driver.getTitle();
      List<String> titleList = ExcelReader.readExcelData("Sheet1", "title");
      helper.assertPageTitle(Base.driver, titleList.get(i+4));
      System.out.println(text);
      Base.driver.navigate().back();
    }
  }
}
