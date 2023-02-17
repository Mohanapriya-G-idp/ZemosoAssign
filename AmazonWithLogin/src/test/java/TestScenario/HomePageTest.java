package TestScenario;

import Base.BaseLogin;
import Pageobject.HomePage;
import Pageobject.SignInPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends BaseLogin {
    HomePage homePage;

    public HomePageTest() {
        super ();
    }

    @Test(priority = 1)
    public void validation() {
        homePage = new HomePage ();
        String titl = homePage.validateHomePage ();
        Assert.assertEquals ( titl, "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in" );
    }

    @Test(priority = 2)
    public void orderValidate() {
        homePage.OrderPage ();
    }

}
