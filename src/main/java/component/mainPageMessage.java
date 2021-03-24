package component;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class mainPageMessage {
    WebDriver driver;
    public mainPageMessage (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements (this.driver, this);
    }
    By testgood = By.xpath ("//h2[contains(text(),'Haftanın Keşifleri')]");
    public WebElement TestGood(){return driver.findElement (testgood);}
    public final String Content_good= "good";

    public String TestGood1() {
        String message = driver.findElement (testgood).getText ();
        System.out.println (message);
        return message;
    }
}
