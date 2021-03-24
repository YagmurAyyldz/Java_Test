import base.Base;
import component.mainPage;
import component.mainPageMessage;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.By;


public class loginTest extends Base {
    //public static final Logger log= LogManager.getLogger (Base.class.getName());
    @BeforeTest
    public void Beforemethod() {
        super.beforemethod();
        driver.get("https://www.gittigidiyor.com/uye-girisi");
    }

    @Test
    public void loginTest() {
        try {
            //logger.info("Test Edilecek Sayfa : " + driver.getTitle()
            driver.findElement(By.id("L-UserNameField")).sendKeys("deneme123456789@gmail.com");
            driver.findElement(By.id("L-PasswordField")).sendKeys("deneme123456");
            driver.findElement(By.id("gg-login-enter")).click();

            //logger.info("Yönlendirilen Sayfa : " + driver.getTitle());
            String actResult = "GittiGidiyor - Türkiye'nin Öncü Alışveriş Sitesi";
            //Assert.assertEquals(actResult, driver.getTitle());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("Geçersiz Kullanıcı Adı ve/veya Şifre.Lütfen bilgilerinizi kontrol ediniz.");
            System.out.println("Geçersiz Kullanıcı Adı ve/veya Şifre.Lütfen bilgilerinizi kontrol ediniz.");

            //log.info ("input test is fail");
        }
    }
    @AfterTest
    public void tearDown() {
        //driver.quit();
        //logger.info("Test completed..");
        System.out.println ("Test completed.");

    }

}