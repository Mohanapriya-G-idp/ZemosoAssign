package Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class BaseLogin {
    public static WebDriver driver;
    public static Properties prop;
    public void launch() {
        try {
            prop = new Properties ();
            FileInputStream fip = new FileInputStream ( "/home/mohag/IdeaProjects/AmazonWOLogin/src/main/java/Utility/Config/Config.properties" );
            prop.load ( fip );

        } catch (FileNotFoundException e) {
            e.printStackTrace ();
        } catch (IOException e) {
            e.printStackTrace ();
        }}

public void browser() {
    WebDriverManager.chromedriver ().setup ();
    driver = new ChromeDriver ();
    driver.manage ().window ().maximize ();
    driver.manage ().timeouts ().implicitlyWait ( Duration.ofSeconds ( 10 ) );
    driver.manage ().timeouts ().pageLoadTimeout ( Duration.ofSeconds ( 30 ) );
    driver.get ( prop.getProperty ( "url" ) );
}









    }

