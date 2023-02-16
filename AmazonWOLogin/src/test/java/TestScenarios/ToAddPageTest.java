package TestScenarios;

import BaseFile.Base;
import PageObejects.ToAddPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ToAddPageTest extends Base {
    ToAddPage toAddPage;

    public ToAddPageTest() {
        super();
    }

    @Test(priority = 4)
    public void verify(){
        toAddPage=new ToAddPage ();
        toAddPage.verifyItem ();
        String added = toAddPage.verified ();
        Assert.assertEquals (added,"Subtotal ("+1+" item):" );
    }
}
