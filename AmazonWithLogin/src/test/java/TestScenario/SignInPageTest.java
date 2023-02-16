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

    @BeforeMethod
    public void clickSignIn() {
        launch ();
        browser ();
    }

    @Test
    public void signIn() {
        signInPage = new SignInPage ();
        signInPage.signIn ();
    }

    @Parameters({"user,pass"})
    @Test
    public void signinDetails(String user, String password) {
        mailID.sendKeys ( user );
        //mailID.sendKeys ( prop.getProperty ( "user" ) );
        cont.click ();
        //  String pass =  prop.getProperty ("pass") ;
        pwd.sendKeys ( password );
        signInTab.click ();
    }
    @AfterTest
    public void tearDown(){
        driver.manage ().deleteAllCookies ();
        driver.quit ();

    }
}
