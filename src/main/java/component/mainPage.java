package component;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;



public class mainPage {
    WebDriver driver;

    public mainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements (this.driver, this);
    }


    By gittigidiyorinput = By.xpath("//header/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/input[1]");
    public WebElement Gittigidiyorinput() {return driver.findElement(gittigidiyorinput);}
    By searchbutton = By.xpath("//header/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/button[1]");
    public WebElement SearchButton() {return driver.findElement(gittigidiyorinput);}
}
