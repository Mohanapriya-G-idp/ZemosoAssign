package PageObejects;

import BaseFile.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ToAddPage extends Base {
    public ToAddPage() {
        PageFactory.initElements ( driver, this );
    }
    @FindBy(xpath = "//span[@id='sc-subtotal-label-activecart']")
    WebElement total;
    @FindBy(xpath = "//div[@id='attach-added-to-cart-message']//input[@class='a-button-input']")
    WebElement cart;

    public void verifyItem(){
        cart.click ();
    }
    public String verified(){
        String v = total.getText ();
        String qty= v.substring ( 10,11 );
        return v;
    }



}