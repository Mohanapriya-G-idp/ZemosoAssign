package TestScenarios;

import BaseFile.Base;
import PageObejects.MobilePage;
import org.testng.annotations.Test;

public class MobilePageTest extends Base {
    MobilePage mobilePage;

    public MobilePageTest() {
        super();
    }
    @Test(priority = 6)
    public void MobilesPageDisplay(){
        mobilePage= new MobilePage ();
        mobilePage.allMobiles ();

            }
}
