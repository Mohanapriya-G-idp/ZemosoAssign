package TestScenario;

import Base.BaseLogin;
import Pageobject.OrdersPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrderPageTest extends BaseLogin {
    OrdersPage ordersPage;

    public OrderPageTest() {
        super();
    }

    @Test(priority = 3)
    public void myOrder(){
        ordersPage=new OrdersPage ();
        ordersPage.myOrderList ();
        String order=ordersPage.validateOrderPage ();
        Assert.assertEquals ( order,"Your Orders" );
    }
}
