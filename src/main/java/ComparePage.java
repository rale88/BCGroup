import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class ComparePage extends BasePage {

    public ComparePage(ChromeDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//div[text() = 'Poredjenje proizvoda']")
    WebElement headerTextPoredjenjeProzivoda;
}
