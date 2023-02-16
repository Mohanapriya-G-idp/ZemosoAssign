package TestScenarios;

import PageObejects.CartPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class CartPageTest {
    CartPage cartPage;
    public CartPageTest() {
       super();
    }
    @Test(priority = 3)
    public void verifyItem(){
        cartPage =new CartPage ();
        cartPage.addedToCart ();
    }
}
