package Pageobject;

import Base.BaseLogin;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressPage extends BaseLogin {
    BaseLogin baseLogin;
    public AddressPage() {

        PageFactory.initElements ( driver, this );

    }

    @FindBy(xpath = "//span[@class='nav-line-2 ']")
    WebElement accInfo;
    @FindBy(xpath = "//span[text()='Your Account']")
    WebElement myAcc;
    @FindBy(xpath = "//div[@data-card-identifier='AddressesAnd1Click']")
    WebElement address;
    @FindBy(id = "ya-myab-address-add-link")
    WebElement newAdd;
    @FindBy(id="address-ui-widgets-enterAddressFullName")
    public static WebElement fullName;
    @FindBy(id="address-ui-widgets-enterAddressPhoneNumber")
    public static WebElement mobNumber;
    @FindBy(id="address-ui-widgets-enterAddressPostalCode")
    public static WebElement pincod;
    @FindBy(id="address-ui-widgets-enterAddressLine1")
    public static WebElement addresss;
    @FindBy(id="address-ui-widgets-enterAddressLine2")
    public static WebElement areas;
    @FindBy(id="address-ui-widgets-landmark")
    public static WebElement landMrk;
    @FindBy(id="address-ui-widgets-enterAddressCity")
    public static WebElement town;
    @FindBy(id="address-ui-widgets-enterAddressStateOrRegion-dropdown-nativeId")
    public static WebElement state;

    @FindBy(id="address-ui-widgets-form-submit-button")
   public static WebElement addAdresBtn;






    public void newAddress( ) {
    Actions a = new Actions ( driver );
    a.moveToElement ( accInfo ).build ().perform ();
    myAcc.click ();
    address.click ();
    newAdd.click ();}
    public String validateaddress(){

        return driver.getTitle ();
}




}