package TestScenarios;

import BaseFile.Base;
import PageObejects.HomePage;
import org.testng.Assert;
import org.testng.annotations.*;

public class HomePageTest extends Base {
    HomePage homePage;

    public HomePageTest() {
        super();
    }
    @BeforeSuite
public void clickHome(){
        launch ();
        homePage= new HomePage ();
}

@Test
    public void validate() {
    String title=homePage.validateHome ();
    Assert.assertEquals ( title,"Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
homePage.dealsClick ();
    }

    @AfterSuite
    public void tearDown(){
        driver.manage ().deleteAllCookies ();
        driver.quit ();
        };

}

