package pages;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import uistore.HomePageLocators;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.WebDriverHelper;

public class FnpBusinessAction {
    WebDriverHelper helper = new WebDriverHelper();
    JavascriptExecutor js = (JavascriptExecutor) Base.driver;

    public void footerIteration() {
        try {

            helper.clickOnElement(HomePageLocators.noThanks);
            WebElement decoration = Base.driver.findElement(HomePageLocators.dec);
            js.executeScript("arguments[0].scrollIntoView(false)", decoration);
            js.executeScript("window.scrollBy(0,100)", "");

            List<String> linkTextBusiness = Base.driver.findElements(By.xpath(
                    "//h6[contains(text(),'FNP business')]/following-sibling::ul/li/a"))
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
                helper.assertPageTitle(Base.driver,titleList.get(i));

                System.out.println(text);

                Base.driver.navigate().back();
            }

            List<String> linkTextsUsefulLinks = Base.driver
                    .findElements(By.xpath("//h6[contains(text(),'Useful Links')]/following-sibling::ul/li/a"))
                    .stream()
                    .map(WebElement::getText)
                    .collect(Collectors.toList());

           for (String linkText : linkTextsUsefulLinks) {

                By footerLink = By.xpath("//a[text()='" + linkText + "']");
                helper.clickOnElement(footerLink);
                String pageTitle = Base.driver.getTitle();
               
                System.out.println(pageTitle);
                Base.driver.navigate().back();
            }

        } catch (Exception e) {
            LoggerHandler.errorMessage(e.getMessage());
        }

    }
}
