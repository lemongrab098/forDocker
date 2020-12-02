import lombok.extern.log4j.Log4j;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Log4j
public class TestBase {
    private WebDriver driver;


    @BeforeTest
    public void init() {
        driver = new FirefoxDriver();
    }

    @Test
    public void test() throws InterruptedException {
        System.out.println("bla");
        driver.navigate().to("https://google.com");
        Thread.sleep(2000);
        driver.quit();
    }
}
