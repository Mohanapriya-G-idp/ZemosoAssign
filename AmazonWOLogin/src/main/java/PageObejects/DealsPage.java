package PageObejects;

import BaseFile.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DealsPage extends Base {
    public DealsPage() {
        PageFactory.initElements ( driver,this);
    }

    @FindBy(xpath = "//div[@aria-label='Deals grid']//div[3]")
    WebElement thirdEle;
    public ThirdDealPage third(){

        driver.manage ().timeouts ().pageLoadTimeout (Duration.ofSeconds (40));
        WebDriverWait wait=new WebDriverWait (driver,Duration.ofSeconds (100));
wait.until ( ExpectedConditions.elementToBeClickable ( thirdEle ) );
        thirdEle.click ();
        System.out.println (driver.getTitle ());
        return new ThirdDealPage();

    }
}
