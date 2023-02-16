package TestScenarios;

import BaseFile.Base;
import PageObejects.HomePage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends Base {
    HomePage homePage;

    public HomePageTest() {
        super();
    }
    @BeforeMethod
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

        @AfterMethod
                public void tearDown(){
            //driver.quit ();
        };

}

