package runner;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pages.FnpBusinessAction;
import pages.MagicMugsAction;
import utils.Base;
import utils.Reporter;

public class TestRunner extends Base {
    ExtentReports reports;
    ExtentTest test;
    @BeforeClass
    public void repGeneration()
    {
        reports=Reporter.generateReport("fnp.com");
    }
    @BeforeMethod
    public void openTheBroswer() throws Exception
    {
        browserSetup();
    }

    @Test(priority = 1)
    public void mug() {
    
        MagicMugsAction mugsAction = new MagicMugsAction();
        test=reports.createTest("Mug Action");
        mugsAction.deliverToBangalore(test);
        mugsAction.personalizedNavBar();
        
     }

    @Test(priority = 2)
    public void iteration()
    {
        FnpBusinessAction businessAction = new FnpBusinessAction();
        businessAction.footerIteration();
    }
    
    @AfterMethod
    public void tearDown()
    {
       driver.quit();
    }
    @AfterClass
    public void repFlush()
    {
        reports.flush();
    }
    
}
