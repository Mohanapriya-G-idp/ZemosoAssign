package TestScenario;

import Base.BaseLogin;
import Pageobject.HomePage;
import Pageobject.SignInPage;
import org.testng.annotations.*;

import static Pageobject.SignInPage.*;

public class SignInPageTest extends BaseLogin {
    SignInPage signInPage;

    public SignInPageTest() {
        super ();
    }

    @BeforeSuite
    public void clickSignIn() {
        launch ();
        browser ();
    }

    @Test(priority = -1)
    public void signIn() {
        signInPage = new SignInPage ();
        signInPage.signIn ();
    }

    //@Parameters({"user","pass"})
    @Test
    public void signinDetails() {
       // mailID.sendKeys ( user );
        mailID.sendKeys ( prop.getProperty ("userName"));
        cont.click ();
        String pass =  prop.getProperty ("pwd") ;
        pwd.sendKeys ( pass );
        signInTab.click ();
    }
    @AfterSuite
    public void tearDown(){
        driver.manage ().deleteAllCookies ();
        driver.quit ();

    }
}
