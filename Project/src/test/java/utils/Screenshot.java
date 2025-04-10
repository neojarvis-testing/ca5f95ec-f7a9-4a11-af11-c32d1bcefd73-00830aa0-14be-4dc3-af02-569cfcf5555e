package utils;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class Screenshot extends Base {

    public static TakesScreenshot ts;

    public static void capScreenshot(String filename) throws Exception {
        ts = (TakesScreenshot) driver;
        
        String name = filename + ".png";

        File file = ts.getScreenshotAs(OutputType.FILE);
        File target = new File(System.getProperty("user.dir") + "/screenshots/");

        if (!target.exists()) {
            target.mkdirs();
        }
        FileHandler.copy(file, new File(target.toString() + "/" + name));
    }

    public static void takeScreenShotWithHighlight(By locator, String name) {
        try {
            WebElement Element = driver.findElement(locator);
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].style.border='3px solid red'", Element);

            Thread.sleep(2000);
            TakesScreenshot ts = (TakesScreenshot) driver;
            File fs = ts.getScreenshotAs(OutputType.FILE);
            File target = new File(System.getProperty("user.dir") + "/screenshots/");
            if (!target.exists()) {
                target.mkdirs();
            }
            FileHandler.copy(fs, new File(target.toString() + "/" + name + ".png"));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
