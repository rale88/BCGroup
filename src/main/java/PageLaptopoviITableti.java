import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class PageLaptopoviITableti extends BasePage{

    public PageLaptopoviITableti(ChromeDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//img[@alt='Laptopovi']")
    WebElement laptopoviButton;


}
