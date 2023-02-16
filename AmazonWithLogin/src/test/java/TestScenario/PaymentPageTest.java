package TestScenario;

import Base.BaseLogin;
import Pageobject.PaymentPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PaymentPageTest extends BaseLogin {
PaymentPage paymentPage;

    public PaymentPageTest() {
        super();
    }
    @Test(priority =4)
    public void paymentPag(){

        paymentPage=new PaymentPage ();
        paymentPage.myPayment ();
    }
    public void validatePayPage(){
        String tit= paymentPage.validatePayment ();
        Assert.assertEquals ( tit,"New Account Details" );
    }

}
