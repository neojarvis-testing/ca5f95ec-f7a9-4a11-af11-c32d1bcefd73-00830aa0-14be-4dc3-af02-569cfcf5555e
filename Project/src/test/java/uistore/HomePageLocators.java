package uistore;

import org.openqa.selenium.By;

public class HomePageLocators {
    public static By noThanks=By.cssSelector("button[id='wzrk-cancel']");
    public static By whereToDeliver=By.cssSelector("span[class='block max-w-[153px] overflow-hidden text-ellipsis whitespace-nowrap text-16 font-600 text-fnp-500 md:text-16 xxl:text-18']");
    public static By inputbox=By.cssSelector("input[id='pincode-location-input']");
    //public static By continueShoppping=By.xpath("(//div[@class='text-center not-italic leading-6 text-14 font-600'])[3]");
    public static By continueShoppping1=By.cssSelector("button[class=' flex w-full h-auto px-10 py-12 items-center gap-2.5 bg-fnp-300 text-white-900 justify-center  rounded-lg  ']");
    public static By plants=By.xpath("//span[contains(text(),'Plants')]"); 
    public static By luckybamboo=By.xpath("//h2[contains(text(),'Lucky Bamboo')]"); 
    public static By jadeplant=By.xpath("//h2[contains(text(),'Jade Plants')]"); 
    public static By moneyplant=By.xpath("//h2[contains(text(),'Money Plants')]"); 
    public static By bangalore = By.xpath("//span[contains(text(),'Bangalore, Karnataka, India')]"); 
    public static By location = By.xpath("//span[contains(text(),'Bangalore, Karnataka, India, 560001')]"); 
    public static By  cart = By.cssSelector("button[aria-label='Cart']"); 
    public static By  continueGifting = By.cssSelector("//div[contains(text(),'Continue Gifting')]"); 


    
}
