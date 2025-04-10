package uistore;

import org.openqa.selenium.By;

public class HeaderLocators {
    public static By noThanks=By.cssSelector("button[id='wzrk-cancel']");
    public static By whereToDeliver=By.cssSelector("span[class='block max-w-[153px] overflow-hidden text-ellipsis whitespace-nowrap text-16 font-600 text-fnp-500 md:text-16 xxl:text-18']");
    public static By inputbox=By.cssSelector("input[id='pincode-location-input']");
    //public static By continueShoppping=By.xpath("(//div[@class='text-center not-italic leading-6 text-14 font-600'])[3]");
    public static By continueShoppping1=By.cssSelector("button[class=' flex w-full h-auto px-10 py-12 items-center gap-2.5 bg-fnp-300 text-white-900 justify-center  rounded-lg  ']");
    public static By searchBar = By.xpath("//input[@id='search_bar']");
    public static By firstResult=By.cssSelector("div[class='w-[calc(24.5%-8px)]']"); 
    public static By addToCart=By.cssSelector("button[title='Add To Cart']");
    public static By buyNow = By.cssSelector("button[title='Buy Now']");
    public static By pincode = By.cssSelector("span[class='w-full max-w-[150px] overflow-hidden text-ellipsis whitespace-nowrap md:max-w-[200px]']");
    public static By delhi = By.xpath("(//span[contains(text(),'Delhi, India')])");
    
}
