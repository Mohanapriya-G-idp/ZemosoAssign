package PageObejects;

import BaseFile.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MobilePage extends Base {

    public MobilePage() {
        PageFactory.initElements ( driver, this );
    }

    @FindBy(xpath = "//ul[@class='hmenu hmenu-visible hmenu-translateX']/li[3]")
    WebElement mob;
    @FindBy(xpath = "//div[@class='_octopus-search-result-card_style_apbSearchResultItem__2-mx4'][12]")
    WebElement lastItem;
public void allMobiles(){
    WebDriverWait wd=new WebDriverWait ( driver, Duration.ofSeconds ( 100 ) );
    wd.until ( ExpectedConditions.elementToBeClickable ( mob ) );
    mob.click ();
    System.out.println (driver.getTitle ());
    System.out.println (lastItem.getText ());
    driver.navigate ().to ( prop.getProperty ("url" ) );
}

}