package runner;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pages.CakeFnpActions;
import pages.LifeStyleFnpActions;
import utils.Base;
import utils.Reporter;

public class TestRunnerKom extends Base{
   ExtentReports reports;
    ExtentTest test;
    @BeforeClass
    public void repGeneration()
    {
        reports=Reporter.generateReport("Fnp.com");
    }

   @BeforeMethod
   public void config_browser() throws IOException{
      browserSetup();
   }

   @Test(priority = 1)
   public void Testcase01(){
    CakeFnpActions fnpActions = new CakeFnpActions();
    fnpActions.SearchBar();
    fnpActions.deliverToDelhi();
    fnpActions.FirstProduct();
   }

   @Test(priority = 2)
   public void Testcase02(){
    test=reports.createTest("Fnp");
    LifeStyleFnpActions lifeStyleFnpActions = new LifeStyleFnpActions();
    lifeStyleFnpActions.NavBar();
    lifeStyleFnpActions.delivertoKolkata();
    lifeStyleFnpActions.FirstProduct(test);

   }

   @AfterMethod
   public void quit_browser(){
    driver.quit();
   }
    @AfterClass
    public void repFlush()
    {
        reports.flush();
    }

}
