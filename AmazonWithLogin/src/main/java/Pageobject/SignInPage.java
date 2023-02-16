package Pageobject;

import Base.BaseLogin;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage extends BaseLogin {

    public SignInPage() {
        PageFactory.initElements ( driver, this );
        launch ();
    }

    @FindBy(id = "nav-link-accountList-nav-line-1")
    WebElement signIn;
    @FindBy(xpath = "//div[@id='nav-flyout-ya-signin']//span[@class='nav-action-inner']")
    WebElement signBtn;
    @FindBy(id = "ap_email")
    public static WebElement mailID;
    @FindBy(id = "continue")
    public static WebElement cont;
    @FindBy(id = "ap_password")
    public static WebElement pwd;
    @FindBy(id = "signInSubmit")
    public static WebElement signInTab;

    public void signIn() {
        Actions a = new Actions ( driver );
        a.moveToElement ( signIn ).build ().perform ();
        signBtn.click ();
    }

}
