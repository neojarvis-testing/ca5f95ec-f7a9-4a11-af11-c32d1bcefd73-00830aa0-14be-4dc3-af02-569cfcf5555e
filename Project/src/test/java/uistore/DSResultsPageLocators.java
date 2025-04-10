package uistore;

import org.openqa.selenium.By;

public class DSResultsPageLocators {
     public static By magicMugs= By.cssSelector("a[href='/magic-mugs-lp?promo=plplink_desk_personalised_mugs']");

    public static By roses = By.cssSelector("a[href='/roses/anniversary-lp?promo=plplink_flws_anni_desk']");
    
    public static By availability = By.xpath("//span[contains(text(),'Availability')]");
    public static By filterTrue = By.xpath("//span[contains(text(),'true')]");


    //common
    public static By firstResult=By.xpath("(//div[@class='mb-10 truncate text-12 font-500 leading-0 text-fnp-500 md:text-14'])");
    
}
