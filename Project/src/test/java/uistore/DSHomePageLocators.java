package uistore;

import org.openqa.selenium.By;

public class DSHomePageLocators {
    
    public static By noThanks=By.cssSelector("button[id='wzrk-cancel']");
    public static By whereToDeliver=By.cssSelector("span[class='block max-w-[153px] overflow-hidden text-ellipsis whitespace-nowrap text-16 font-600 text-fnp-500 md:text-16 xxl:text-18']");
    //public static By location_missing = By.cssSelector("span[class='w-full max-w-[150px] overflow-hidden text-ellipsis whitespace-nowrap md:max-w-[200px]']");
    public static By pinCode=By.cssSelector("input[id='pincode-location-input']");
    public static By continueShoppping=By.xpath("(//div[@class='text-center not-italic leading-6 text-14 font-600'])[3]"); 
    public static By continueShoppping1=By.cssSelector("button[class=' flex w-full h-auto px-10 py-12 items-center gap-2.5 bg-fnp-300 text-white-900 justify-center  rounded-lg  ']");




   // public static By anniversary = By.cssSelector("a[aria-label='Anniversary'] span");
    public static By anniversary = By.xpath("//span[contains(text(),'Anniversary')]");
    public static By flowers = By.cssSelector("a[href='/flowers/anniversary-lp?promo=anniversarymenu_dt_hm']");

    public static By combos = By.cssSelector("a[aria-label='Combos']");
    public static By hamper = By.cssSelector("a[href='/healthy-gift-hampers-lp?promo=combosmenu_dt_hm']");

    public static By chn = By.xpath("//span[contains(text(),'Chennai, Tamil Nadu, India')]");
    public static By blr = By.xpath("//span[contains(text(),'Bangalore, Karnataka, India')]");

    
}


