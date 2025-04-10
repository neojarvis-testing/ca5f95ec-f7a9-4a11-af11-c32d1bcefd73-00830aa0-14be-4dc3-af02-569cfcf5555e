package runner;
 
import java.io.IOException;
 
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.Flowers;
import Pages.HealthyHampers;
// import pages.FnpActions;
import utils.Base;
 
public class Testsakthi extends Base{
 
   @BeforeMethod
   public void config_browser() throws IOException{
      browserSetup();
   }
 
   @Test(priority = 1)
   public void Testcase01(){
    Flowers fnpActions = new Flowers();
    fnpActions.deliverToChennai();
    fnpActions.NavBar();
   }
 
    @Test(priority = 2)
    public void Testcase02(){
    HealthyHampers fnpActions = new HealthyHampers();
    fnpActions.deliverToBlr();
     fnpActions.NavBar();
 
    }
 
   @AfterMethod
   public void quit_browser(){
    driver.quit();
   }
 
}
 
 