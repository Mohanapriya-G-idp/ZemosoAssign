package Pageobject;

import Base.BaseLogin;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseLogin {
    @Override
    public void launch() {
        super.launch ();
    }

    public HomePage() {
        PageFactory.initElements ( driver,this );
    }

    @FindBy(xpath = "//span[@class='nav-line-2 ']")
    WebElement accInfo;
    @FindBy(id="nav_prefetch_yourorders")
    WebElement yourOrder;
    public String validateHomePage(){
        return driver.getTitle ();
    }
public void OrderPage(){
Actions a = new Actions ( driver );
    a.moveToElement ( accInfo ).build ().perform ();
    yourOrder.click ();


}


        }



