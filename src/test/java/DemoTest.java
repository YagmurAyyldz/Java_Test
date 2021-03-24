import org.junit.Assert;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoTest {


    public WebDriver driver;
    protected static String url = "https://www.gittigidiyor.com/";

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\apache-maven-3.6.3\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void correctOpen() {
        driver.get(url);
        Assert.assertEquals(driver.getTitle(), "GittiGidiyor - Türkiye'nin Öncü Alışveriş Sitesi");
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}