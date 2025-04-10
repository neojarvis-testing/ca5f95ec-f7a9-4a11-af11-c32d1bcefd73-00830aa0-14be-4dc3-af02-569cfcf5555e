package runner;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.CakeFnpActions;
import pages.LifeStyleFnpActions;
import utils.Base;

public class TestRunnerKom extends Base{

   @BeforeMethod
   public void config_browser() throws IOException{
      browserSetup();
   }

   @Test(priority = 1)
   public void Testcase01(){
    CakeFnpActions fnpActions = new CakeFnpActions();
    fnpActions.deliverToDelhi();
   }

   @Test(priority = 2)
   public void Testcase02(){
    LifeStyleFnpActions fnpActions = new LifeStyleFnpActions();
    fnpActions.delivertoKolkata();

   }

   @AfterMethod
   public void quit_browser(){
    driver.quit();
   }

}
