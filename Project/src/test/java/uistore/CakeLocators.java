package uistore;

import org.openqa.selenium.By;

public class CakeLocators {

    public static By clickonflavour = By.xpath("(//span[@class='text-14 font-500 font-500'])[2]");
   // public static By clickonflavour = By.xpath("//div/button[@class='flex w-full items-center justify-between text-left focus:outline-none mb-10']/span[@class='text-14 font-500 font-500']");
   // public static By clickonchocolate = By.xpath("//span[@class='cursor-pointer font-600 text-fnp-500 text-14 hover:font-600 hover:text-fnp-500']");
   public static By clickonchocolate = By.id("checkbox-Flavour_0");
    public static By firstproduct=By.xpath("(//div[@class='mb-10 truncate text-12 font-500 leading-0 text-fnp-500 md:text-14'])");
  //  public static By productname = By.id("productName");
    public static By addtocart1 = By.cssSelector("button[title='Add To Cart']");
    public static By buynow = By.cssSelector("button[title='Buy Now']");

}
