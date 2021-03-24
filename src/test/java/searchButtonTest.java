import base.Base;
import component.mainPage;
import component.mainPageMessage;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.By;

import static org.testng.Reporter.log;

public class searchButtonTest extends Base {
    //public static final Logger log= LogManager.getLogger (Base.class.getName());
    @BeforeTest
    public void Beforemethod() {
        super.beforemethod ( );
        driver.get ("https://www.gittigidiyor.com/");
    }

    @Test(priority = 1)
    public void gittiGidiyor() throws InterruptedException {
        try {
           // log ("gittigidiyor ()");
            mainPage test = new mainPage (driver);
            test.Gittigidiyorinput ( ).sendKeys ("Bilgisayar");
            try {
                driver.get(".qjixn8-0 sc-1bydi5r-0 hKfdXF");
            } catch (Exception e) {
                e.printStackTrace();
            }

            test.SearchButton ( ).click ( );
            Thread.sleep (6000L);

            mainPageMessage message = new mainPageMessage (driver);
            Assert.assertEquals (message.TestGood1 ( ), "Haftanın Keşifleri");
            //log.info ("input box test pass");
            System.out.println ("input box test pass");
            //Thread.sleep (3000L);
        }
        catch (Exception e) {
            e.printStackTrace ( );
            Assert.fail ("input test is fail");
            //log.info ("input test is fail");
        }

    }
    @AfterTest
    public void Aftermethod() {
        super.aftermethod ( );
    }

}
