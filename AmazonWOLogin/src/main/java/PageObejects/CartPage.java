package PageObejects;

import BaseFile.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CartPage extends Base {
    public CartPage() {
        PageFactory.initElements ( driver,this);
    }




    WebElement cart;
    public ToAddPage addedToCart(){
        WebDriverWait w = new WebDriverWait ( driver,Duration.ofSeconds ( 90 ) );
       // driver.findElement ( By.xpath ( "//div[@class='a-box-inner a-accordion-row-container']" ) ).click ();
        WebElement item=driver.findElement ( By.id ( "add-to-cart-button" ) );

w.until ( ExpectedConditions.elementToBeClickable ( item ) );
item.click ();

        return new ToAddPage ();
    }
}
