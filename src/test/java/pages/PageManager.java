package pages;

import org.openqa.selenium.WebDriver;
import pages.shoppage.ShopPage;
import pages.shoppage.ShopPageDe;
import pages.shoppage.ShopPageEng;

public class PageManager {
    public ShopPage shopPageDe;
    public ShopPage shopPageEng;


    public PageManager(WebDriver driver) {
        this.shopPageDe = new ShopPageDe(driver);
        this.shopPageEng =new ShopPageEng(driver);

    }
}
