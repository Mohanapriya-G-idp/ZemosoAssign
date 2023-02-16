package PageObejects;

import BaseFile.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class NavigationPage extends Base {

    public NavigationPage() {
        PageFactory.initElements ( driver, this );
    }

    @FindBy(xpath = "//a[@id='nav-hamburger-menu']")
    WebElement navigationIcon;
    @FindBy(xpath = "//div[text()='Mobiles, Computers']")
    WebElement mobile;
    public MobilePage navigation(){

        navigationIcon.click ();
        WebDriverWait wdw =new WebDriverWait ( driver, Duration.ofSeconds ( 60 ) );
        wdw.until ( ExpectedConditions.elementToBeClickable ( mobile ) );
        mobile.click ();
        return new MobilePage ();
    }

}