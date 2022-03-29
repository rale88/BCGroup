import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class Korpa extends BasePage {

    public Korpa(ChromeDriver driver) {
        super(driver);

    }
        @FindBy(xpath = "//a[text() = 'Nastavi kupovinu']")
        WebElement nastaviKupovinuButton;
    }
