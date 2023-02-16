package TestScenarios;

import BaseFile.Base;
import PageObejects.DealsPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DealsPageTest extends Base {
    DealsPage dealsPage;

    public DealsPageTest() {
        super();
    }


    @Test(priority =1)
    public void thirdelement(){
        dealsPage=new DealsPage ();
       dealsPage.third();


    }
}
