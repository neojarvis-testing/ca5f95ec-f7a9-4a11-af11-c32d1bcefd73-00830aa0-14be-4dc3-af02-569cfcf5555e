package uistore;

import org.openqa.selenium.By;

public class ProductPage {
    public static By addToCart=By.cssSelector("button[title='Add To Cart']");
    public static By buyNow = By.cssSelector("button[title='Buy Now']");

    public static By delivery = By.cssSelector("input[placeholder='Select Delivery Date & Time Slot']");
    public static By date = By.xpath("(//div[@class='flex h-32 w-32 items-center justify-center text-center text-14 font-600 text-fnp-500 md:text-16  bg-white cursor-pointer hover:rounded-full hover:bg-green-200 hover:text-white-100'])[8]");
    public static By courier = By.cssSelector("span[class='text-14 font-600 text-black-100']");
    public static By time = By.cssSelector("span[class='text-14 font-500 not-italic text-grey-400']");


    public static By blr = By.xpath("//span[contains(text(),'Bangalore, Karnataka, India')]");

    public static By delhi = By.xpath("//span[contains(text(),'Delhi, India')]");
    public static By kolkata = By.xpath("//span[contains(text(),'Kolkata, West Bengal, India')]");

    public static By chn = By.xpath("//span[contains(text(),'Chennai, Tamil Nadu, India')]");
}   
   



