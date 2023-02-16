package PageObejects;

import BaseFile.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ThirdDealPage extends Base {

    public ThirdDealPage() {
        PageFactory.initElements ( driver,this ); ;
    }

    @FindBy(xpath = "//div[@id='octopus-dlp-asin-stream']//li")
    WebElement item;


    public CartPage itemSelected(){
        item.click ();
        return new CartPage ();
    }
}
