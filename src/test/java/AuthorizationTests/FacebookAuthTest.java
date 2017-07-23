package AuthorizationTests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by agref on 08.07.2017.
 */
public class FacebookAuthTest {
    @FindBy
    private WebDriver driver;
    private WebDriverWait wait;

    @Before
     public void start() {
//     driver = new ChromeDriver();
     driver = new FirefoxDriver();
     wait = new WebDriverWait(driver,10);
    }

    @Test
    public void FacebookAuthTest(){
        driver.get("http://www.evendate.io/");
    }


//    @After
//    public void stop(){
//        driver.quit();
//        driver=null;
//    }
}
