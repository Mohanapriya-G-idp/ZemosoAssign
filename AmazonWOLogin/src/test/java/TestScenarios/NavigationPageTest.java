package TestScenarios;

import PageObejects.MobilePage;
import PageObejects.NavigationPage;
import org.testng.annotations.Test;

public class NavigationPageTest {
    NavigationPage navigationPage;

    public NavigationPageTest() {
        super();
    }
    @Test(priority = 5)
    public void clickMobile(){
        navigationPage =new NavigationPage ();
        navigationPage.navigation ();

    }
}
