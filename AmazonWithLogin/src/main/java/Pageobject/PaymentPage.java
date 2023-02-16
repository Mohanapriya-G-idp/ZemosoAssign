package Pageobject;

import Base.BaseLogin;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class PaymentPage extends BaseLogin {
    public PaymentPage() {
        PageFactory.initElements ( driver,this );
    }
    @FindBy(xpath = "//span[@class='nav-line-2 ']")
    WebElement accInfo;
    @FindBy(xpath = "//span[text()='Your Account']")
    WebElement myAcc;
    @FindBy(xpath = "//div[@data-card-identifier='PaymentOptions']")
    WebElement payOpt;
    @FindBy(xpath = "//a[text()='Manage Bank Accounts']")
    WebElement manage;
    @FindBy(xpath = "//span[@class='a-size-base']")
    WebElement add;

    public void myPayment() {
        driver.navigate ().back ();
        Actions a = new Actions ( driver );
        a.moveToElement ( accInfo ).build ().perform ();
        myAcc.click ();
        payOpt.click ();
        manage.click ();
        add.click ();
    }
        public String validatePayment()
    {
        return driver.getTitle ();}
    }

