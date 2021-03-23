//import io.github.bonigarcia.wdm.DriverManagerType;
//import io.github.bonigarcia.wdm.ChromeDriverManager;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//
//public class DemoTest {
//
//    public static void main(String args[]) {
//        OperaDriverManager.getInstance(DriverManagerType.OPERA).setup();
//        WebDriver x = new OperaDriver();
//
//        x.get("https://google.com");
//
//    }
//}
//public class ChromeTest {
//
//    private WebDriver driver;
//
//    @BeforeClass
//    public static void setupClass() {
//        WebDriverManager.chromedriver().setup();
//    }
//
//    @Before
//    public void setupTest() {
//        driver = new ChromeDriver();
//    }
//
//    @After
//    public void teardown() {
//        if (driver != null) {
//            driver.quit();
//        }
//    }
//    @Test
//    public void test() {
//        // Your test code here
//    }
//
//}
//import environment.EnvironmentManager;
//import environment.RunEnvironment;
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import static org.junit.Assert.assertEquals;
//
//public class DemoTest {
//
//    @Before
//    public void startBrowser() {
//        EnvironmentManager.initWebDriver();
//    }
//
//    @Test
//    public void demo() {
//        WebDriver driver = RunEnvironment.getWebDriver();
//        driver.get("https://www.blazemeter.com/selenium");
//        String homeUrl = driver.findElement(By.cssSelector("div#logo> a#logo_image ")).getAttribute("href");
//        assertEquals(homeUrl, "https://www.blazemeter.com/");
//    }
//
//    @After
//    public void tearDown() {
//        EnvironmentManager.shutDownDriver();
//    }
//}

/*
package info.balloons.SeleniumTest;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoTest {
    private static ChromeDriver driver;
    WebElement element;

    @BeforeClass
    public static void openBrowser(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void testWebsite(){
        System.out.println("Starting test " + new Object(){}.getClass().getEnclosingMethod().getName());
        driver.get("http://5balloons.info");
        Assert.assertEquals("5 Balloons | Jack of many web trades", driver.getTitle());
        System.out.println("Ending test " + new Object(){}.getClass().getEnclosingMethod().getName());
    }

    @AfterClass
    public static void closeBrowser(){
        driver.quit();
    }
}*/

import org.junit.Assert;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DemoTest {


    public WebDriver driver;
    protected static String url = "https://www.google.com/";

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\apache-maven-3.6.3\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void correctOpen() {
        driver.get(url);
        Assert.assertEquals(driver.getTitle(), "Google");
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}