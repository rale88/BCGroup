import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class BasePage {

   @FindBy(id = "si")
   WebElement searchBar;

   @FindBy(className = "button-search")
   WebElement pronadjiButton;

    ChromeDriver driver = null;


    public BasePage(ChromeDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;

    }


    public void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (Exception e) {
        }


    }

}