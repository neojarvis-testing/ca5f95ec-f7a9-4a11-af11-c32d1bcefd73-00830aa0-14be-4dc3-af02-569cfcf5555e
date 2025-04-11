package uistore;

import org.openqa.selenium.By;

public class NavBarLocatorsSubh {
    public static By noThanks = By.cssSelector("button[id='wzrk-cancel']");
    public static By location = By.cssSelector(
            "span[class='block max-w-[153px] overflow-hidden text-ellipsis whitespace-nowrap text-16 font-600 text-fnp-500 md:text-16 xxl:text-18']");
    public static By pinCode = By.cssSelector("input[id='pincode-location-input']");
    public static By continueShopping = By.xpath("//div[contains(text(),'Continue Shopping')]");
    public static By cakes = By.xpath("//span[contains(text(),'Cakes')]");
    public static By birthdayCake = By.id("Birthday Cakes");

    public static By sameDayDelivery = By.linkText("Same Day Delivery");
    public static By firstCake = By.xpath("//div[@class='w-[calc(32.8%-8px)]']");

    public static By addToCart = By.cssSelector("button[title='Add To Cart']");
    public static By buyNow = By.cssSelector("button[title='Buy Now']");
    
    public static By chennaiLocationSelect = By.xpath("//span[text()='Chennai, Tamil Nadu, India']");
    public static By continueShopppingCake =By.cssSelector("button[class=' flex w-full h-auto px-10 py-12 items-center gap-2.5 bg-fnp-300 text-white-900 justify-center  rounded-lg  ']");
}
