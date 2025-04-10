package runner;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;


import pages.HeaderAction;
import pages.HomePageAction;
import utils.Base;
import utils.Reporter;

public class AppTest extends Base {
    public static ExtentReports reports;
    public static ExtentTest test;
    @BeforeClass
    public void start(){
    reports=Reporter.generateReport("FnpAppllication");
    }
   
  
    @BeforeMethod
    public void startconfig(){
        browserSetup();
    }
    @Test(priority = 1)
    public void findPen(){
        try {
            HeaderAction pen=new HeaderAction();
            pen.specifyLocation();
            pen.searchPen();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
   @Test(priority = 2)
   public void findPlants(){
    try {
        HomePageAction plant=new HomePageAction();
        plant.specifyLocation();
        plant.searchPlants();
    } catch (Exception e) {
        e.printStackTrace();
    }
  
   }
  
    @AfterMethod
    public void stopconfig(){
       driver.quit();
    }
   
   @AfterClass
   public void stop(){
   reports.flush();
  }

    
}
