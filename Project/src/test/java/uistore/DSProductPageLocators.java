package uistore;

import org.openqa.selenium.By;

public class DSProductPageLocators {

   

    public static By addToCart=By.cssSelector("button[title='Add To Cart']");
    public static By buyNow = By.cssSelector("button[title='Buy Now']");

    public static By assertAvailable = By.xpath("//p[contains(text(),'Offers Available')]");

    
}
