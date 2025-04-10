package runner;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pages.FooterActionsSubh;
import pages.NavBarActionsSubh;
import utils.Base;
import utils.ExcelReader;
import utils.Reporter;


public class TestRunnerSubhash extends Base{
ExtentReports reports;
ExtentTest test;
@BeforeClass
public void makeReports(){
  reports=Reporter.generateReport(ExcelReader.readCellValue("Sheet1","1","reportName"));
}
@BeforeMethod
public void getBrowser(){
   browserSetup();
}
@Test(priority = 1)
public void cakesSearching() throws Exception{
    NavBarActionsSubh navBarActions=new NavBarActionsSubh();
    test=reports.createTest(ExcelReader.readCellValue("Sheet1", "1", "testCaseName"));
    navBarActions.whereToDeliver();
    navBarActions.birthdayCakeSearch(test);
    navBarActions.buyTheCake();

}
@Test(priority = 2)
public void verifyPageTitle(){
    FooterActionsSubh footerActions=new FooterActionsSubh();
    footerActions.linkVerificationPolicyInfo();
    footerActions.linkVerificationAboutCompany();
}

@AfterMethod
public void quitDriver(){
    if(driver!=null){
        driver.quit();
    }
}
@AfterClass
public void flushingReport(){
  reports.flush();
}

}
