package Pageobject;

import Base.BaseLogin;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrdersPage extends BaseLogin {
    public OrdersPage() {
        PageFactory.initElements ( driver, this );
    }

    public String validateOrderPage(){
        return driver.getTitle ();
    }
    @FindBy(xpath = "//span[@class='a-button-inner']/span[@class='a-button-text a-declarative']")
    WebElement myOrder;
    @FindBy(id="time-filter_3")
    WebElement lastYear;

public void myOrderList(){
    myOrder.click ();
    lastYear.click ();

}
}
