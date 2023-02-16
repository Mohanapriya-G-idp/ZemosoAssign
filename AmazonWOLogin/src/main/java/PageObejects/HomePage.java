package PageObejects;

import BaseFile.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class  HomePage extends Base {
  public HomePage() {
    PageFactory.initElements (driver,this);
  }

  @FindBy(xpath = "//div[@id='nav-xshop']/a[text()=\"Today's Deals\"]")
WebElement deals;
  public String validateHome(){
    return driver.getTitle ();
  }
  public DealsPage dealsClick(){
    deals.click ();
    return new DealsPage ();

  }
}

