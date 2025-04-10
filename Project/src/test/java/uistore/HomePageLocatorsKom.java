package uistore;

import org.openqa.selenium.By;

public class HomePageLocatorsKom {

    
    public static By noThanks=By.cssSelector("button[id='wzrk-cancel']");
    public static By whereToDeliver=By.cssSelector("span[class='block max-w-[153px] overflow-hidden text-ellipsis whitespace-nowrap text-16 font-600 text-fnp-500 md:text-16 xxl:text-18']");
    public static By city=By.cssSelector("input[id='pincode-location-input']");
    public static By clickondelhi = By.xpath("//span[contains(text(),'Delhi, India')]");
    public static By clickonkolkata = By.xpath("//span[contains(text(),'Kolkata, West Bengal, India')]");
    public static By continueShoppping1=By.cssSelector("button[class=' flex w-full h-auto px-10 py-12 items-center gap-2.5 bg-fnp-300 text-white-900 justify-center  rounded-lg  ']");

    public static By delivery = By.cssSelector("input[placeholder='Select Delivery Date & Time Slot']");
    public static By date = By.xpath("(//div[@class='flex h-32 w-32 items-center justify-center text-center text-14 font-600 text-fnp-500 md:text-16  bg-white cursor-pointer hover:rounded-full hover:bg-green-200 hover:text-white-100'])[8]");
    public static By courier = By.cssSelector("span[class='text-14 font-600 text-black-100']");
    public static By time = By.cssSelector("span[class='text-14 font-500 not-italic text-grey-400']");
   
    //testcase01
    public static By searchbar = By.cssSelector("input[id='search_bar']");

    //testcase02
    public static By hoverlifestyle = By.xpath("//span[contains(text(),'Lifestyle')]");
    public static By jewellery = By.cssSelector("a[href='/jewellery-lp?promo=othergiftsmenu_dt_hm']");
   



}
