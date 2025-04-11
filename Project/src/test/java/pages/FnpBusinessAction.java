package pages;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.HomePageLocators;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.WebDriverHelper;

public class FnpBusinessAction {
    WebDriverHelper helper = new WebDriverHelper();
    JavascriptExecutor js = (JavascriptExecutor) Base.driver;

    public void footerIteration(ExtentTest test) {
        try {

            helper.clickOnElement(HomePageLocators.noThanks);
            WebElement decoration = Base.driver.findElement(HomePageLocators.dec);
            js.executeScript("arguments[0].scrollIntoView(false)", decoration);
            js.executeScript("window.scrollBy(0,100)", "");

             List<String> values  = ExcelReader.readExcelData("Sheet1", "linktext");
                  
           
            for (int i = 0; i < values.size(); i++) {
                
                By footerLink = By.xpath("//a[text()='" + values.get(i) + "']");

                helper.clickOnElement(footerLink);

                String text = Base.driver.getTitle();
                List<String> titleList = ExcelReader.readExcelData("Sheet1", "title");
                helper.assertPageTitle(Base.driver,titleList.get(i));

                System.out.println(text);

                Base.driver.navigate().back();
            }
            
            List<String> links  = ExcelReader.readExcelData("Sheet1", "business");

            for (int i = 0; i < links.size(); i++)
            {
                By footerLink = By.xpath("//a[text()='" + links.get(i) + "']");
                helper.clickOnElement(footerLink);
                String pageTitle = Base.driver.getTitle();
                test.log(Status.INFO,pageTitle);
               
                System.out.println(pageTitle);
                Base.driver.navigate().back();
            }

        } catch (Exception e) {
            LoggerHandler.errorMessage(e.getMessage());
        }

    }
}
