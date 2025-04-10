package uistore;

import org.openqa.selenium.By;

public class HomePageLocators {
  public static By noThanks = By.cssSelector("button[id='wzrk-cancel']");
  public static By pinCode = By.cssSelector("input[id='pincode-location-input']");
  public static By personalized = By.xpath("//span[contains(text(),'Personalised')]");
  public static By Mugs = By.cssSelector("a[href='/personalised-mugs-lp?promo=personalizedmenu_dt_hm']");
  public static By continueShoppping = By.xpath("//div[contains(text(),'Continue Shopping')]");
  public static By blog = By.cssSelector("a[href='/blog/']");
  public static By dec = By.xpath("//a[@href='/decoration-services']");

}
