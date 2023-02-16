package TestScenarios;

import BaseFile.Base;
import PageObejects.ThirdDealPage;
import org.testng.annotations.Test;

public class ThirdDealPageTest extends Base {
    ThirdDealPage thirdDealPage;

    public ThirdDealPageTest() {
        super();
    }
    @Test(priority =2)
    public void ClickSelected(){
        thirdDealPage=new ThirdDealPage ();
        thirdDealPage.itemSelected ();

    }
}
