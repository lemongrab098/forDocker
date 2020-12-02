import lombok.extern.log4j.Log4j;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

@Log4j
public class TestBase {
    private WebDriver driver;


//    @BeforeTest
//    public void init() {
//    }

    @Test
    public void test() {
        driver = new FirefoxDriver();
        System.out.println("bla");
        driver.navigate().to("https://google.com");
        driver.quit();
    }
}
