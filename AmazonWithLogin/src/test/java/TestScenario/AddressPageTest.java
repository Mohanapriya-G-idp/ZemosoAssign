package TestScenario;

import Base.BaseLogin;
import Pageobject.AddressPage;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static Pageobject.AddressPage.*;

public class AddressPageTest extends BaseLogin {
    AddressPage addressPage;

    public AddressPageTest() {
        super();
    }
    @Parameters({"name","mob","pin","addr","area","land","city" })
    @Test(priority =5)
public void validateAddress(String name,String mob,String pincode,String addres,String are,String landmark,String citi){
        addressPage=new AddressPage ();
        addressPage.newAddress (  );
    fullName.sendKeys ( name );
    mobNumber.sendKeys ( mob );
    pincod.sendKeys ( pincode );
    addresss.sendKeys ( addres );
    areas.sendKeys ( are );
    landMrk.sendKeys ( landmark );
    town.sendKeys ( citi );
    Select st= new Select ( state );
    st.selectByVisibleText ( "TAMIL NADU" );
    addAdresBtn.click ();
}
@Test(priority = 5)
public void validateAddressPage(){
        String title=addressPage.validateaddress ();
    Assert.assertEquals ( title,"Your Addresses");
}
}
